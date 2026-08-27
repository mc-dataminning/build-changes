public class csl extends crt {
   public csl(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      coz $$2 = coz.h;
      coz $$3 = coz.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cmp) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpc.vo)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cms.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public coz a(ckr $$0, iw $$1) {
      coz $$2 = coz.h;
      coz $$3 = coz.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cmp) {
               $$2 = $$5;
            } else if ($$5.a(cpc.vo)) {
               $$3 = $$5.q();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         sw $$6 = cms.a($$2);
         sw $$7 = $$6 == null ? new sw() : $$6.h();
         $$7.a("Base", ((cmp)$$2.d()).b().a());
         cms.a($$3, div.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csf<?> at_() {
      return csf.l;
   }
}
