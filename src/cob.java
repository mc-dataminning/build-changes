public class cob extends cnu {
   public cob(cnu.a $$0, bjb... $$1) {
      super($$0, cnv.b, $$1);
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

   public static void a(bjm $$0, cqb $$1, gw $$2, int $$3) {
      if ($$0.aA()) {
         dfd $$4 = cte.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         gw.a $$6 = new gw.a();

         for (gw $$7 : gw.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dj(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dfd $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dfd $$9 = $$1.a_($$7);
                  if ($$9 == cwf.b() && $$4.a((cqe)$$1, $$7) && $$1.a($$4, $$7, ehm.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cte.kI, asb.a($$0.ef(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cnu $$0) {
      return super.a($$0) && $$0 != cny.i;
   }
}
