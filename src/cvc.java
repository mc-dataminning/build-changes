public class cvc extends cuw {
   public cvc(cuw.a $$0, bpe... $$1) {
      super($$0, auv.bb, $$1);
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

   public static void a(bpp $$0, cxb $$1, ib $$2, int $$3) {
      if ($$0.aC()) {
         dnb $$4 = dae.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         ib.a $$6 = new ib.a();

         for (ib $$7 : ib.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dk(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dnb $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dnb $$9 = $$1.a_($$7);
                  if ($$9 == ddh.b() && $$4.a((cxe)$$1, $$7) && $$1.a($$4, $$7, epy.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dae.kI, aww.a($$0.ei(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cuw $$0) {
      return super.a($$0) && $$0 != cuz.i;
   }
}
