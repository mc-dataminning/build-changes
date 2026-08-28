import java.util.Arrays;

public class bpn implements bpo {
   private final bpo[] a;

   public bpn(bpo... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ayo $$0) {
      float $$1 = 1.0F;

      for (bpo $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
