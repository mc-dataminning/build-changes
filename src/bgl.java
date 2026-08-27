import java.util.Arrays;

public class bgl implements bgm {
   private final bgm[] a;

   public bgl(bgm... $$0) {
      this.a = $$0;
   }

   @Override
   public float a(ash $$0) {
      float $$1 = 1.0F;

      for (bgm $$2 : this.a) {
         $$1 *= $$2.a($$0);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.a);
   }
}
