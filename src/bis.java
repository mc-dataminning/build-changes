import java.util.Arrays;

public class bis implements bit {
   private final bit[] a;

   public bis(bit... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(auf $$0) {
      float $$1 = 1.0F;

      for (bit $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
