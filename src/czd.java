public class czd extends cyz {
   public czd(cyz.b $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   public static void a(bso $$0, dax $$1, io $$2, int $$3) {
      if ($$0.aE()) {
         drb $$4 = dea.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         io.a $$6 = new io.a();

         for (io $$7 : io.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dn(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               drb $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  drb $$9 = $$1.a_($$7);
                  if ($$9 == dhd.b() && $$4.a((dba)$$1, $$7) && $$1.a($$4, $$7, eup.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dea.kI, ayd.a($$0.el(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cyz $$0) {
      return super.a($$0) && $$0 != czc.i;
   }
}
