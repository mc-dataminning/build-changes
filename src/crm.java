public class crm extends crt {
   public crm(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      cnn $$2 = null;
      coz $$3 = null;
      coz $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         coz $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cou $$7 = $$6.d();
            if (!($$7 instanceof cmp)) {
               return false;
            }

            cmp $$8 = (cmp)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dij.c($$6);
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

   public coz a(ckr $$0, iw $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         coz $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dij.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return coz.h;
   }

   public is<coz> a(ckr $$0) {
      is<coz> $$1 = is.a($$0.b(), coz.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         coz $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().s()) {
               $$1.set($$2, new coz($$3.d().r()));
            } else if ($$3.v() && dij.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public csf<?> at_() {
      return csf.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
