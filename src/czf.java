public class czf extends czb {
   public czf(czb.b $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   public static void a(bsq $$0, daz $$1, io $$2, int $$3) {
      if ($$0.aE()) {
         drd $$4 = dec.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         io.a $$6 = new io.a();

         for (io $$7 : io.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dn(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               drd $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  drd $$9 = $$1.a_($$7);
                  if ($$9 == dhf.b() && $$4.a((dbc)$$1, $$7) && $$1.a($$4, $$7, eur.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dec.kI, ayf.a($$0.el(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(czb $$0) {
      return super.a($$0) && $$0 != cze.i;
   }
}
