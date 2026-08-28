public class czv extends dab {
   public czv(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      int $$2 = 0;
      cvs $$3 = cvs.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvw.ub)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvw.ua)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cvs a(czz $$0, jq.a $$1) {
      int $$2 = 0;
      cvs $$3 = cvs.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvw.ub)) {
               if (!$$3.f()) {
                  return cvs.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvw.ua)) {
                  return cvs.k;
               }

               $$2++;
            }
         }
      }

      cze $$6 = $$3.a(ks.O);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         cze $$7 = $$6.b();
         if ($$7 == null) {
            return cvs.k;
         } else {
            cvs $$8 = $$3.c($$2);
            $$8.b(ks.O, $$7);
            return $$8;
         }
      } else {
         return cvs.k;
      }
   }

   public jx<cvs> a(czz $$0) {
      jx<cvs> $$1 = jx.a($$0.a(), cvs.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvs $$3 = $$0.a($$2);
         if ($$3.h().u()) {
            $$1.set($$2, new cvs($$3.h().t()));
         } else if ($$3.h() instanceof cxo) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dap<?> ar_() {
      return dap.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
