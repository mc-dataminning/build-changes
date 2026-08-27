public class cqg extends cpz {
   public cqg(cpz.a $$0, bla... $$1) {
      super($$0, cqa.b, $$1);
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

   public static void a(bll $$0, csf $$1, hx $$2, int $$3) {
      if ($$0.aC()) {
         dhn $$4 = cvh.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         hx.a $$6 = new hx.a();

         for (hx $$7 : hx.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dl(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dhn $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dhn $$9 = $$1.a_($$7);
                  if ($$9 == cyk.b() && $$4.a((csi)$$1, $$7) && $$1.a($$4, $$7, eke.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cvh.kI, atq.a($$0.eh(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cpz $$0) {
      return super.a($$0) && $$0 != cqd.i;
   }
}
