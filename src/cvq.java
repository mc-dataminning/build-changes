public class cvq extends cvk {
   public cvq(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      int $$2 = 0;
      crs $$3 = crs.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(crv.rT)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crv.uh)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public crs a(cnm $$0, jb $$1) {
      int $$2 = 0;
      crs $$3 = crs.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(crv.rT)) {
               if (!$$3.d()) {
                  return crs.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crv.uh)) {
                  return crs.i;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 >= 1 ? $$3.c($$2 + 1) : crs.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.e;
   }
}
