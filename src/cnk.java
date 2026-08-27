public class cnk extends cnd {
   public cnk(cnd.a $$0, bil... $$1) {
      super($$0, cne.b, $$1);
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

   public static void a(biw $$0, cpk $$1, gv $$2, int $$3) {
      if ($$0.aA()) {
         dey $$4 = csl.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         gv.a $$6 = new gv.a();

         for (gv $$7 : gv.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.di(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dey $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dey $$9 = $$1.a_($$7);
                  if ($$9 == cvl.a() && $$4.a((cpn)$$1, $$7) && $$1.a($$4, $$7, ehk.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, csl.kI, aro.a($$0.ee(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cnd $$0) {
      return super.a($$0) && $$0 != cnh.i;
   }
}
