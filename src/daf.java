public class daf extends dab {
   public daf(dab.b $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   public static void a(btq $$0, dbz $$1, iz $$2, int $$3) {
      if ($$0.aE()) {
         dsd $$4 = dfc.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         iz.a $$6 = new iz.a();

         for (iz $$7 : iz.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dn(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dsd $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dsd $$9 = $$1.a_($$7);
                  if ($$9 == dif.b() && $$4.a((dcc)$$1, $$7) && $$1.a($$4, $$7, evx.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dfc.kI, ayz.a($$0.el(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(dab $$0) {
      return super.a($$0) && $$0 != dae.i;
   }
}
