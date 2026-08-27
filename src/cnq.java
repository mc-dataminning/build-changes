public class cnq extends cnj {
   public cnq(cnj.a $$0, biq... $$1) {
      super($$0, cnk.b, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 10;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public int a() {
      return 2;
   }

   public static void a(bjb $$0, cpq $$1, gw $$2, int $$3) {
      if ($$0.aA()) {
         dfe $$4 = csr.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         gw.a $$6 = new gw.a();

         for (gw $$7 : gw.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.di(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dfe $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dfe $$9 = $$1.a_($$7);
                  if ($$9 == cvr.a() && $$4.a((cpt)$$1, $$7) && $$1.a($$4, $$7, ehn.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, csr.kI, ars.a($$0.ee(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cnj $$0) {
      return super.a($$0) && $$0 != cnn.i;
   }
}
