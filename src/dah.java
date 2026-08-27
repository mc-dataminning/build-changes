public class dah extends dad {
   public dah(dad.b $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   public static void a(bso $$0, dca $$1, ir $$2, int $$3) {
      if ($$0.aE()) {
         dtc $$4 = dfe.lG.n();
         int $$5 = Math.min(16, 2 + $$3);
         ir.a $$6 = new ir.a();

         for (ir $$7 : ir.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.ds(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dtc $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dtc $$9 = $$1.a_($$7);
                  if ($$9 == dil.b() && $$4.a((dcd)$$1, $$7) && $$1.a($$4, $$7, ewz.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dfe.lG, aym.a($$0.et(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(dad $$0) {
      return super.a($$0) && $$0 != dag.i;
   }
}
