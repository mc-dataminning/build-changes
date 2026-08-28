public class dbi extends dab {
   public dbi(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cvs $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cvw.vt)) {
                     return false;
                  }
               } else if (!$$4.a(cvw.ox)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cvs a(czz $$0, jq.a $$1) {
      cvs $$2 = $$0.a(1, 1);
      if (!$$2.a(cvw.vt)) {
         return cvs.k;
      } else {
         cvs $$3 = new cvs(cvw.vs, 8);
         $$3.b(ks.L, $$2.a(ks.L));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dap<?> ar_() {
      return dap.j;
   }
}
