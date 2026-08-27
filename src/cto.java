public class cto extends cti {
   public cto(cti.a $$0, bnv... $$1) {
      super($$0, auh.ba, $$1);
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

   public static void a(bog $$0, cvn $$1, hz $$2, int $$3) {
      if ($$0.aC()) {
         dlf $$4 = cyq.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         hz.a $$6 = new hz.a();

         for (hz $$7 : hz.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dk(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dlf $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dlf $$9 = $$1.a_($$7);
                  if ($$9 == dbt.b() && $$4.a((cvq)$$1, $$7) && $$1.a($$4, $$7, enx.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cyq.kI, awh.a($$0.eh(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cti $$0) {
      return super.a($$0) && $$0 != ctl.i;
   }
}
