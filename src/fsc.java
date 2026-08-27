public class fsc extends fpm {
   private static final int a = 12235202;

   protected fsc(fnr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, frp $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.0F, 20, 0.0125F, false);
      this.v = (float)atx.b.b(12235202) / 255.0F;
      this.w = (float)atx.b.c(12235202) / 255.0F;
      this.x = (float)atx.b.d(12235202) / 255.0F;
   }

   public static class a implements fqx<ka> {
      private final frp a;

      public a(frp $$0) {
         this.a = $$0;
      }

      public fqu a(ka $$0, fnr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         auu $$8 = $$1.z;
         double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
         double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         return new fsc($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0F, this.a);
      }
   }
}
