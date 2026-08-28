import java.util.Arrays;

public class bro implements brp {
   private final brp[] a;

   public bro(brp... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azv $$0) {
      float $$1 = 1.0F;

      for (brp $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
