import java.util.Arrays;
import java.util.function.IntConsumer;
import org.apache.commons.lang3.Validate;

public class baj implements axr {
   public static final long[] a = new long[0];
   private final int b;

   public baj(int $$0) {
      this.b = $$0;
   }

   @Override
   public int a(int $$0, int $$1) {
      Validate.inclusiveBetween(0L, (long)(this.b - 1), (long)$$0);
      Validate.inclusiveBetween(0L, 0L, (long)$$1);
      return 0;
   }

   @Override
   public void b(int $$0, int $$1) {
      Validate.inclusiveBetween(0L, (long)(this.b - 1), (long)$$0);
      Validate.inclusiveBetween(0L, 0L, (long)$$1);
   }

   @Override
   public int a(int $$0) {
      Validate.inclusiveBetween(0L, (long)(this.b - 1), (long)$$0);
      return 0;
   }

   @Override
   public long[] a() {
      return a;
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public int c() {
      return 0;
   }

   @Override
   public void a(IntConsumer $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         $$0.accept(0);
      }
   }

   @Override
   public void a(int[] $$0) {
      Arrays.fill($$0, 0, this.b, 0);
   }

   @Override
   public axr d() {
      return this;
   }
}
