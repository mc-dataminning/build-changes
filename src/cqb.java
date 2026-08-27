public class cqb extends cpu {
   public cqb(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.b, $$1);
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

   public static void a(blg $$0, csa $$1, ht $$2, int $$3) {
      if ($$0.aC()) {
         dhi $$4 = cvc.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         ht.a $$6 = new ht.a();

         for (ht $$7 : ht.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dl(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dhi $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dhi $$9 = $$1.a_($$7);
                  if ($$9 == cyf.b() && $$4.a((csd)$$1, $$7) && $$1.a($$4, $$7, ejz.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cvc.kI, atm.a($$0.eh(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cpu $$0) {
      return super.a($$0) && $$0 != cpy.i;
   }
}
