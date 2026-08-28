import java.util.Arrays;

public class bpz implements bqa {
   private final bqa[] a;

   public bpz(bqa... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azf $$0) {
      float $$1 = 1.0F;

      for (bqa $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
