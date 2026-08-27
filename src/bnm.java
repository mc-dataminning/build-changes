import java.util.Arrays;

public class bnm implements bnn {
   private final bnn[] a;

   public bnm(bnn... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(axt $$0) {
      float $$1 = 1.0F;

      for (bnn $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
