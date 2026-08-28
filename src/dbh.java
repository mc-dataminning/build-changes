public class dbh extends daa {
   public dbh(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cvx $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cwb.vt)) {
                     return false;
                  }
               } else if (!$$4.a(cwb.ox)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cvx a(czy $$0, jr.a $$1) {
      cvx $$2 = $$0.a(1, 1);
      if (!$$2.a(cwb.vt)) {
         return cvx.k;
      } else {
         cvx $$3 = new cvx(cwb.vs, 8);
         $$3.b(kt.P, $$2.a(kt.P));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dao<?> ar_() {
      return dao.j;
   }
}
