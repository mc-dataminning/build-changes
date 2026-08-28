import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class few extends AbstractDoubleList {
   private final int a;

   public few(int $$0) {
      if ($$0 <= 0) {
         throw new IllegalArgumentException("Need at least 1 part");
      } else {
         this.a = $$0;
      }
   }

   public double getDouble(int $$0) {
      return (double)$$0 / (double)this.a;
   }

   public int size() {
      return this.a + 1;
   }
}
