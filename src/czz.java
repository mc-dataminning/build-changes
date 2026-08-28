public class czz extends czv {
   public czz(czv.b $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   public static void a(btk $$0, dbt $$1, iz $$2, int $$3) {
      if ($$0.aE()) {
         drx $$4 = dew.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         iz.a $$6 = new iz.a();

         for (iz $$7 : iz.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dn(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               drx $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  drx $$9 = $$1.a_($$7);
                  if ($$9 == dhz.b() && $$4.a((dbw)$$1, $$7) && $$1.a($$4, $$7, evr.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dew.kI, ayu.a($$0.el(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(czv $$0) {
      return super.a($$0) && $$0 != czy.i;
   }
}
