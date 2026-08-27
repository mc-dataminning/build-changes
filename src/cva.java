public class cva extends cuu {
   public cva(cuu.a $$0, bpd... $$1) {
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

   public static void a(bpo $$0, cwz $$1, ib $$2, int $$3) {
      if ($$0.aC()) {
         dmz $$4 = dac.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         ib.a $$6 = new ib.a();

         for (ib $$7 : ib.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dk(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dmz $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dmz $$9 = $$1.a_($$7);
                  if ($$9 == ddf.b() && $$4.a((cxc)$$1, $$7) && $$1.a($$4, $$7, epw.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dac.kI, aww.a($$0.ei(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cuu $$0) {
      return super.a($$0) && $$0 != cux.i;
   }
}
