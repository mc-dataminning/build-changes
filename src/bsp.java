import java.util.Arrays;

public class bsp implements bsq {
   private final bsq[] a;

   public bsp(bsq... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(bam $$0) {
      float $$1 = 1.0F;

      for (bsq $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
