public class czs extends czy {
   public czs(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      int $$2 = 0;
      cvp $$3 = cvp.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvt.ub)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvt.ua)) {
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
            if ($$5.a(cvt.ub)) {
               if (!$$3.f()) {
                  return cvp.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvt.ua)) {
                  return cvp.k;
               }

               $$2++;
            }
         }
      }

      czb $$6 = $$3.a(kr.O);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         czb $$7 = $$6.b();
         if ($$7 == null) {
            return cvp.k;
         } else {
            cvp $$8 = $$3.c($$2);
            $$8.b(kr.O, $$7);
            return $$8;
         }
      } else {
         return cvp.k;
      }
   }

   public jw<cvp> a(czw $$0) {
      jw<cvp> $$1 = jw.a($$0.a(), cvp.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvp $$3 = $$0.a($$2);
         if ($$3.h().u()) {
            $$1.set($$2, new cvp($$3.h().t()));
         } else if ($$3.h() instanceof cxl) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dam<?> aq_() {
      return dam.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
