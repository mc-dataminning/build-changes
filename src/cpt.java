public class cpt extends cpm {
   public cpt(cpm.a $$0, bkn... $$1) {
      super($$0, cpn.b, $$1);
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

   public static void a(bky $$0, crs $$1, ht $$2, int $$3) {
      if ($$0.aA()) {
         dgw $$4 = cuv.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         ht.a $$6 = new ht.a();

         for (ht $$7 : ht.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dj(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dgw $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dgw $$9 = $$1.a_($$7);
                  if ($$9 == cxx.b() && $$4.a((crv)$$1, $$7) && $$1.a($$4, $$7, ejn.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cuv.kI, ati.a($$0.ef(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cpm $$0) {
      return super.a($$0) && $$0 != cpq.i;
   }
}
