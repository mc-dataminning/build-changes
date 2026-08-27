public class cwe extends cvy {
   public cwe(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      int $$2 = 0;
      csd $$3 = csd.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(csg.rU)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(csg.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public csd a(cnx $$0, jj $$1) {
      int $$2 = 0;
      csd $$3 = csd.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(csg.rU)) {
               if (!$$3.d()) {
                  return csd.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(csg.uj)) {
                  return csd.i;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 >= 1 ? $$3.c($$2 + 1) : csd.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.e;
   }
}
