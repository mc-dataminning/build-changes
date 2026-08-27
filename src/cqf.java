public class cqf extends cpn {
   public cqf(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      cmr $$2 = cmr.f;
      cmr $$3 = cmr.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckh) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmu.vl)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (ckk.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cmr a(cik $$0, iu $$1) {
      cmr $$2 = cmr.f;
      cmr $$3 = cmr.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckh) {
               $$2 = $$5;
            } else if ($$5.a(cmu.vl)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         sl $$6 = ckk.a($$2);
         sl $$7 = $$6 == null ? new sl() : $$6.h();
         $$7.a("Base", ((ckh)$$2.d()).b().a());
         ckk.a($$3, dgq.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.l;
   }
}
