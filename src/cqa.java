public class cqa extends cpu {
   public cqa(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      int $$2 = 0;
      cmy $$3 = cmy.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cnb.rR)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnb.uc)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cmy a(cir $$0, iu $$1) {
      int $$2 = 0;
      cmy $$3 = cmy.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cnb.rR)) {
               if (!$$3.b()) {
                  return cmy.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cnb.uc)) {
                  return cmy.f;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cmy.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cqg<?> ar_() {
      return cqg.e;
   }
}
