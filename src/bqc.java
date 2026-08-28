import java.util.Arrays;

public class bqc implements bqd {
   private final bqd[] a;

   public bqc(bqd... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azh $$0) {
      float $$1 = 1.0F;

      for (bqd $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
