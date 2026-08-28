public class dbb extends dag {
   public dbb(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (die.a($$5.h()) instanceof dpd) {
               $$2++;
            } else {
               if (!($$5.h() instanceof cuz)) {
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

   public cwb a(dae $$0, js.a $$1) {
      cwb $$2 = cwb.k;
      cuz $$3 = (cuz)cwf.rj;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            cvx $$6 = $$5.h();
            if (die.a($$6) instanceof dpd) {
               $$2 = $$5;
            } else if ($$6 instanceof cuz) {
               $$3 = (cuz)$$6;
            }
         }
      }

      die $$7 = dpd.a($$3.b());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dau<?> aq_() {
      return dau.m;
   }
}
