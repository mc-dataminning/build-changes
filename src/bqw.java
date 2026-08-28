import java.util.Arrays;

public class bqw implements bqx {
   private final bqx[] a;

   public bqw(bqx... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azl $$0) {
      float $$1 = 1.0F;

      for (bqx $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
