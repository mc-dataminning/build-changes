import java.util.Arrays;

public class bpw implements bpx {
   private final bpx[] a;

   public bpw(bpx... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azc $$0) {
      float $$1 = 1.0F;

      for (bpx $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
