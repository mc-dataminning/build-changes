public class fpa {
   public static float a(float $$0, float $$1, float $$2) {
      float $$3 = $$1 - $$0;

      while ($$3 < (float) -Math.PI) {
         $$3 += (float) (Math.PI * 2);
      }

      while ($$3 >= (float) Math.PI) {
         $$3 -= (float) (Math.PI * 2);
      }

      return $$0 + $$2 * $$3;
   }
}
