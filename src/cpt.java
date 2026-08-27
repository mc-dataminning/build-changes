public class cpt extends cpn {
   public cpt(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      int $$2 = 0;
      cmr $$3 = cmr.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cmu.rR)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmu.uc)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cmr a(cik $$0, iu $$1) {
      int $$2 = 0;
      cmr $$3 = cmr.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cmu.rR)) {
               if (!$$3.b()) {
                  return cmr.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmu.uc)) {
                  return cmr.f;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cmr.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.e;
   }
}
