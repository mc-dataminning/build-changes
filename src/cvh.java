public class cvh extends cvb {
   public cvh(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      int $$2 = 0;
      crj $$3 = crj.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(crm.rT)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crm.uh)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public crj a(cnf $$0, iz $$1) {
      int $$2 = 0;
      crj $$3 = crj.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(crm.rT)) {
               if (!$$3.d()) {
                  return crj.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crm.uh)) {
                  return crj.i;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 >= 1 ? $$3.c($$2 + 1) : crj.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.e;
   }
}
