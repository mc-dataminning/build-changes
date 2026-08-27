public class cyk extends cyg {
   public cyk(cyg.b $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   public static void a(bsa $$0, dad $$1, in $$2, int $$3) {
      if ($$0.aC()) {
         dqh $$4 = ddg.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         in.a $$6 = new in.a();

         for (in $$7 : in.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dl(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dqh $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dqh $$9 = $$1.a_($$7);
                  if ($$9 == dgj.b() && $$4.a((dag)$$1, $$7) && $$1.a($$4, $$7, etu.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, ddg.kI, axz.a($$0.ej(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cyg $$0) {
      return super.a($$0) && $$0 != cyj.i;
   }
}
