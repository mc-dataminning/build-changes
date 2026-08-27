public class cmn extends cmh {
   public cmn(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      int $$2 = 0;
      cjl $$3 = cjl.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjo.rf)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjo.tp)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cjl a(cff $$0, hr $$1) {
      int $$2 = 0;
      cjl $$3 = cjl.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjo.rf)) {
               if (!$$3.b()) {
                  return cjl.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjo.tp)) {
                  return cjl.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cjl.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cms<?> an_() {
      return cms.e;
   }
}
