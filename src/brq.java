import java.util.Arrays;

public class brq implements brr {
   private final brr[] a;

   public brq(brr... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azh $$0) {
      float $$1 = 1.0F;

      for (brr $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
