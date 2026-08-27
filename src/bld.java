import java.util.Arrays;

public class bld implements ble {
   private final ble[] a;

   public bld(ble... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(awp $$0) {
      float $$1 = 1.0F;

      for (ble $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
