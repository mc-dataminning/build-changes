public class dah extends dab {
   public dah(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      int $$2 = 0;
      cvs $$3 = cvs.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvw.rV)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvw.ul)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cvs a(czz $$0, jq.a $$1) {
      int $$2 = 0;
      cvs $$3 = cvs.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvw.rV)) {
               if (!$$3.f()) {
                  return cvs.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvw.ul)) {
                  return cvs.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cvs.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dap<?> ar_() {
      return dap.e;
   }
}
