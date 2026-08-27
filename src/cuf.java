public class cuf extends ctz {
   public cuf(ctz.a $$0, bom... $$1) {
      super($$0, aum.bb, $$1);
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

   public static void a(box $$0, cwe $$1, ib $$2, int $$3) {
      if ($$0.aC()) {
         dme $$4 = czh.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         ib.a $$6 = new ib.a();

         for (ib $$7 : ib.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dh(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dme $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dme $$9 = $$1.a_($$7);
                  if ($$9 == dck.b() && $$4.a((cwh)$$1, $$7) && $$1.a($$4, $$7, epa.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, czh.kI, awm.a($$0.ef(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(ctz $$0) {
      return super.a($$0) && $$0 != cuc.i;
   }
}
