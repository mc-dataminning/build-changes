import java.util.Arrays;

public class bqz implements bra {
   private final bra[] a;

   public bqz(bra... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(azn $$0) {
      float $$1 = 1.0F;

      for (bra $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
