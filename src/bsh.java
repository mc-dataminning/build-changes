import java.util.Arrays;

public class bsh implements bsi {
   private final bsi[] a;

   public bsh(bsi... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(bac $$0) {
      float $$1 = 1.0F;

      for (bsi $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
