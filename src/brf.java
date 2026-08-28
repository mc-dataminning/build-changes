import java.util.Arrays;

public class brf implements brg {
   private final brg[] a;

   public brf(brg... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azr $$0) {
      float $$1 = 1.0F;

      for (brg $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
