public class czt extends dab {
   public czt(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      cum $$2 = null;
      cvs $$3 = null;
      cvs $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cvs $$6 = $$0.a($$5);
         if (!$$6.f()) {
            cvn $$7 = $$6.h();
            if (!($$7 instanceof ctr)) {
               return false;
            }

            ctr $$8 = (ctr)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(ks.ad, drm.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cvs a(czz $$0, jq.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cvs $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(ks.ad, drm.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cvs.k;
   }

   public jx<cvs> a(czz $$0) {
      jx<cvs> $$1 = jx.a($$0.a(), cvs.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvs $$3 = $$0.a($$2);
         if (!$$3.f()) {
            if ($$3.h().u()) {
               $$1.set($$2, new cvs($$3.h().t()));
            } else if (!$$3.a(ks.ad, drm.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dap<?> ar_() {
      return dap.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
