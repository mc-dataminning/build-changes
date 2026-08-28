public class dav extends daa {
   public dav(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (dhy.a($$5.h()) instanceof dox) {
               $$2++;
            } else {
               if (!($$5.h() instanceof cuv)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cvx a(czy $$0, jr.a $$1) {
      cvx $$2 = cvx.k;
      cuv $$3 = (cuv)cwb.rj;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvx $$5 = $$0.a($$4);
         if (!$$5.f()) {
            cvt $$6 = $$5.h();
            if (dhy.a($$6) instanceof dox) {
               $$2 = $$5;
            } else if ($$6 instanceof cuv) {
               $$3 = (cuv)$$6;
            }
         }
      }

      dhy $$7 = dox.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public dao<?> ar_() {
      return dao.m;
   }
}
