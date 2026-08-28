import java.util.Arrays;

public class bsl implements bsm {
   private final bsm[] a;

   public bsl(bsm... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(bam $$0) {
      float $$1 = 1.0F;

      for (bsm $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
