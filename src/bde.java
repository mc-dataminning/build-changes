import java.util.Arrays;

public class bde implements bdf {
   private final bdf[] a;

   public bde(bdf... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(apf $$0) {
      float $$1 = 1.0F;

      for (int $$2 = 0; $$2 < this.a.length; $$2++) {
         $$1 *= this.a[$$2].a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
