public class fmw extends fkl {
   private static final int a = 12235202;

   protected fmw(fis $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fmk $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.0F, 20, 0.0125F, false);
      this.v = 0.7294118F;
      this.w = 0.69411767F;
      this.x = 0.7607843F;
   }

   public static class a implements fls<ja> {
      private final fmk a;

      public a(fmk $$0) {
         this.a = $$0;
      }

      public flp a(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         arx $$8 = $$1.z;
         double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
         double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         return new fmw($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0F, this.a);
      }
   }
}
