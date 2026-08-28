import java.util.Arrays;

public class brp implements brq {
   private final brq[] a;

   public brp(brq... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azg $$0) {
      float $$1 = 1.0F;

      for (brq $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
