public class dae extends daa {
   public dae(daa.b $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   public static void a(btp $$0, dby $$1, iz $$2, int $$3) {
      if ($$0.aE()) {
         dsc $$4 = dfb.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         iz.a $$6 = new iz.a();

         for (iz $$7 : iz.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dn(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dsc $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dsc $$9 = $$1.a_($$7);
                  if ($$9 == die.b() && $$4.a((dcb)$$1, $$7) && $$1.a($$4, $$7, evw.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dfb.kI, ayz.a($$0.el(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(daa $$0) {
      return super.a($$0) && $$0 != dad.i;
   }
}
