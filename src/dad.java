public class dad extends czz {
   public dad(czz.b $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   public static void a(bto $$0, dbx $$1, iz $$2, int $$3) {
      if ($$0.aE()) {
         dsb $$4 = dfa.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         iz.a $$6 = new iz.a();

         for (iz $$7 : iz.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dn(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dsb $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dsb $$9 = $$1.a_($$7);
                  if ($$9 == did.b() && $$4.a((dca)$$1, $$7) && $$1.a($$4, $$7, evv.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dfa.kI, ayy.a($$0.el(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(czz $$0) {
      return super.a($$0) && $$0 != dac.i;
   }
}
