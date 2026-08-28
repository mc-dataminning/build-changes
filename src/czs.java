public class czs extends daa {
   public czs(czx $$0) {
      super($$0);
   }

   public boolean a(czy $$0, dev $$1) {
      cuu $$2 = null;
      cvx $$3 = null;
      cvx $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cvx $$6 = $$0.a($$5);
         if (!$$6.f()) {
            cvt $$7 = $$6.h();
            if (!($$7 instanceof ctz)) {
               return false;
            }

            ctz $$8 = (ctz)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(kt.ah, drx.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cvx a(czy $$0, jr.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cvx $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kt.ah, drx.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cvx.k;
   }

   public jy<cvx> a(czy $$0) {
      jy<cvx> $$1 = jy.a($$0.a(), cvx.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvx $$3 = $$0.a($$2);
         if (!$$3.f()) {
            if ($$3.h().l()) {
               $$1.set($$2, new cvx($$3.h().k()));
            } else if (!$$3.a(kt.ah, drx.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dao<?> ar_() {
      return dao.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
