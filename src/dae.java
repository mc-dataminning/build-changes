public class dae extends czy {
   public dae(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      int $$2 = 0;
      cvp $$3 = cvp.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvt.rV)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvt.ul)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cvp a(czw $$0, jp.a $$1) {
      int $$2 = 0;
      cvp $$3 = cvp.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvt.rV)) {
               if (!$$3.f()) {
                  return cvp.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvt.ul)) {
                  return cvp.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cvp.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dam<?> aq_() {
      return dam.e;
   }
}
