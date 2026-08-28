public class czu extends daa {
   public czu(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      int $$2 = 0;
      cvx $$3 = cvx.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cwb.ub)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwb.ua)) {
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
            if ($$5.a(cwb.ub)) {
               if (!$$3.f()) {
                  return cvx.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwb.ua)) {
                  return cvx.k;
               }

               $$2++;
            }
         }
      }

      czd $$6 = $$3.a(kt.S);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         czd $$7 = $$6.b();
         if ($$7 == null) {
            return cvx.k;
         } else {
            cvx $$8 = $$3.c($$2);
            $$8.b(kt.S, $$7);
            return $$8;
         }
      } else {
         return cvx.k;
      }
   }

   public jy<cvx> a(czy $$0) {
      jy<cvx> $$1 = jy.a($$0.a(), cvx.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvx $$3 = $$0.a($$2);
         if ($$3.h().l()) {
            $$1.set($$2, new cvx($$3.h().k()));
         } else if ($$3.h() instanceof cxt) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dao<?> ar_() {
      return dao.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
