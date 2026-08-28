public class das extends czy {
   public das(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      cvp $$2 = cvp.k;
      cvp $$3 = cvp.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cto) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvt.vu)) {
                  return false;
               }

               if (!$$2.f()) {
                  return false;
               }

               drj $$6 = $$5.a(kr.ad, drj.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.f() && !$$3.f();
   }

   public cvp a(czw $$0, jp.a $$1) {
      cvp $$2 = cvp.k;
      cvp $$3 = cvp.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cto) {
               $$2 = $$5;
            } else if ($$5.a(cvt.vu)) {
               $$3 = $$5.u();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kr.ad, $$2.a(kr.ad));
         $$3.b(kr.ae, ((cto)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dam<?> aq_() {
      return dam.l;
   }
}
