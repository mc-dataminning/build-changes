public class cmh extends cmb {
   public cmh(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      int $$2 = 0;
      cjf $$3 = cjf.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cji.rf)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cji.tp)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cjf a(cez $$0, hu $$1) {
      int $$2 = 0;
      cjf $$3 = cjf.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cji.rf)) {
               if (!$$3.b()) {
                  return cjf.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cji.tp)) {
                  return cjf.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cjf.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cmm<?> an_() {
      return cmm.e;
   }
}
