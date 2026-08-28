public class dau extends daa {
   public dau(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      cvx $$2 = cvx.k;
      cvx $$3 = cvx.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof ctz) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwb.vu)) {
                  return false;
               }

               if (!$$2.f()) {
                  return false;
               }

               drx $$6 = $$5.a(kt.ah, drx.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.f() && !$$3.f();
   }

   public cvx a(czy $$0, jr.a $$1) {
      cvx $$2 = cvx.k;
      cvx $$3 = cvx.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof ctz) {
               $$2 = $$5;
            } else if ($$5.a(cwb.vu)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kt.ah, $$2.a(kt.ah));
         $$3.b(kt.ai, ((ctz)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dao<?> ar_() {
      return dao.l;
   }
}
