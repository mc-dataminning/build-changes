public class crq extends crj {
   public crq(crj.a $$0, bma... $$1) {
      super($$0, crk.b, $$1);
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

   public static void a(bml $$0, ctp $$1, hx $$2, int $$3) {
      if ($$0.aC()) {
         djh $$4 = cws.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         hx.a $$6 = new hx.a();

         for (hx $$7 : hx.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dk(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               djh $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  djh $$9 = $$1.a_($$7);
                  if ($$9 == czv.b() && $$4.a((cts)$$1, $$7) && $$1.a($$4, $$7, ely.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cws.kI, auo.a($$0.eg(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(crj $$0) {
      return super.a($$0) && $$0 != crn.i;
   }
}
