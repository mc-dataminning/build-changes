import java.util.Arrays;

public class bga implements bgb {
   private final bgb[] a;

   public bga(bgb... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(arx $$0) {
      float $$1 = 1.0F;

      for (bgb $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
