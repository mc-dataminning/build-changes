public class cpw extends cpd {
   public cpw(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cvz.a($$5.d()) instanceof dcx) {
               $$2++;
            } else {
               if (!($$5.d() instanceof ckw)) {
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

   public cmh a(cia $$0, is $$1) {
      cmh $$2 = cmh.f;
      ckw $$3 = (ckw)cmk.rf;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cmc $$6 = $$5.d();
            if (cvz.a($$6) instanceof dcx) {
               $$2 = $$5;
            } else if ($$6 instanceof ckw) {
               $$3 = (ckw)$$6;
            }
         }
      }

      cmh $$7 = dcx.b($$3.d());
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
   public cpp<?> ar_() {
      return cpp.m;
   }
}
