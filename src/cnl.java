public class cnl extends cne {
   public cnl(cne.a $$0, bin... $$1) {
      super($$0, cnf.b, $$1);
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

   public static void a(biy $$0, cpl $$1, gu $$2, int $$3) {
      if ($$0.aA()) {
         dez $$4 = csm.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         gu.a $$6 = new gu.a();

         for (gu $$7 : gu.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.di(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dez $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dez $$9 = $$1.a_($$7);
                  if ($$9 == cvm.a() && $$4.a((cpo)$$1, $$7) && $$1.a($$4, $$7, ehi.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, csm.kI, arp.a($$0.ee(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cne $$0) {
      return super.a($$0) && $$0 != cni.i;
   }
}
