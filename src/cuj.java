public class cuj extends csg {
   private final csv d;
   protected static final float a = 6.0F;
   protected static final eig b = csv.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   protected cuj(csv $$0, dfi.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      this.a($$0, (cpw)$$1, $$2);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.d.n().a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1 == ha.a && !$$0.a($$3, $$4)) {
         return csw.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(c)) {
            $$3.a($$4, ean.c, ean.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }
}
