public class cmy extends cmh {
   public cmy(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (ctc.a($$5.d()) instanceof czz) {
               $$2++;
            } else {
               if (!($$5.d() instanceof cia)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cjl a(cff $$0, hr $$1) {
      cjl $$2 = cjl.b;
      cia $$3 = (cia)cjo.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cjg $$6 = $$5.d();
            if (ctc.a($$6) instanceof czz) {
               $$2 = $$5;
            } else if ($$6 instanceof cia) {
               $$3 = (cia)$$6;
            }
         }
      }

      cjl $$7 = czz.b($$3.d());
      if ($$2.u()) {
         $$7.c($$2.v().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cms<?> an_() {
      return cms.m;
   }
}
