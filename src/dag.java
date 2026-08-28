public class dag extends daa {
   public dag(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      int $$2 = 0;
      cvx $$3 = cvx.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwb.rV)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwb.ul)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cvx a(czy $$0, jr.a $$1) {
      int $$2 = 0;
      cvx $$3 = cvx.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwb.rV)) {
               if (!$$3.f()) {
                  return cvx.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwb.ul)) {
                  return cvx.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cvx.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dao<?> ar_() {
      return dao.e;
   }
}
