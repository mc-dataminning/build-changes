public class dav extends dab {
   public dav(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      cvs $$2 = cvs.k;
      cvs $$3 = cvs.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof ctr) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvw.vu)) {
                  return false;
               }

               if (!$$2.f()) {
                  return false;
               }

               drm $$6 = $$5.a(ks.ad, drm.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.f() && !$$3.f();
   }

   public cvs a(czz $$0, jq.a $$1) {
      cvs $$2 = cvs.k;
      cvs $$3 = cvs.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof ctr) {
               $$2 = $$5;
            } else if ($$5.a(cvw.vu)) {
               $$3 = $$5.u();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(ks.ad, $$2.a(ks.ad));
         $$3.b(ks.ae, ((ctr)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dap<?> ar_() {
      return dap.l;
   }
}
