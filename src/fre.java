public class fre extends fon {
   private static final int a = 12235202;

   protected fre(fmt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fqr $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.0F, 20, 0.0125F, false);
      this.v = (float)ati.b.b(12235202) / 255.0F;
      this.w = (float)ati.b.c(12235202) / 255.0F;
      this.x = (float)ati.b.d(12235202) / 255.0F;
   }

   public static class a implements fpz<jy> {
      private final fqr a;

      public a(fqr $$0) {
         this.a = $$0;
      }

      public fpw a(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         auf $$8 = $$1.z;
         double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
         double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         return new fre($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0F, this.a);
      }
   }
}
