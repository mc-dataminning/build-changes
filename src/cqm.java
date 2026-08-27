public class cqm extends cpu {
   public cqm(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      cmy $$2 = cmy.f;
      cmy $$3 = cmy.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cko) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnb.vl)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (ckr.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cmy a(cir $$0, iu $$1) {
      cmy $$2 = cmy.f;
      cmy $$3 = cmy.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cko) {
               $$2 = $$5;
            } else if ($$5.a(cnb.vl)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         sn $$6 = ckr.a($$2);
         sn $$7 = $$6 == null ? new sn() : $$6.h();
         $$7.a("Base", ((cko)$$2.d()).b().a());
         ckr.a($$3, dgx.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqg<?> ar_() {
      return cqg.l;
   }
}
