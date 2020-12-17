/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    // TODO fill in code here using for loop and replace the return statement
    int sum = 0;
    for (int i = lowerBound; i <= upperBound; i++)
      sum += i;
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    // TODO fill in code here using for each loop and replace the return statement
    int sum = 0;
    for (int numba : numbers)
      sum += numba;
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
    int numberOfItems = 0;
    int sum = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      numberOfItems ++;
      sum += i;
    }
    if (numberOfItems == 0)
      return 0;
    return (double)sum / numberOfItems;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
    int numberOfItems = numbers.length;
    int sum = 0;
    if (numberOfItems == 0)
      return 0;
    for (int numba : numbers)
      sum += numba;
    return (double)sum / numberOfItems;
  }
}