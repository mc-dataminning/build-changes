import java.util.Arrays;

public class bfx implements bfy {
   private final bfy[] a;

   public bfx(bfy... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(aru $$0) {
      float $$1 = 1.0F;

      for (bfy $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
