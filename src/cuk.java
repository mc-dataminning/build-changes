public class cuk extends csh {
   private final csv b;

   protected cuk(csv $$0, dfi.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      this.a($$0, (cpw)$$1, $$2);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.b.n().a(c, Boolean.valueOf(false)).a(a, $$0.c(a)), 2);
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csw.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ean.c, ean.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
