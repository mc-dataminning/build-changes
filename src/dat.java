public class dat extends czy {
   public dat(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (dhj.a($$5.h()) instanceof doj) {
               $$2++;
            } else {
               if (!($$5.h() instanceof cuk)) {
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

   public cvp a(czw $$0, jp.a $$1) {
      cvp $$2 = cvp.k;
      cuk $$3 = (cuk)cvt.rj;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            cvk $$6 = $$5.h();
            if (dhj.a($$6) instanceof doj) {
               $$2 = $$5;
            } else if ($$6 instanceof cuk) {
               $$3 = (cuk)$$6;
            }
         }
      }

      dhj $$7 = doj.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dam<?> aq_() {
      return dam.m;
   }
}
