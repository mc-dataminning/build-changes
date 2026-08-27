public class cvd extends cvk {
   public cvd(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      cql $$2 = null;
      crs $$3 = null;
      crs $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         crs $$6 = $$0.a($$5);
         if (!$$6.d()) {
            crn $$7 = $$6.f();
            if (!($$7 instanceof cpn)) {
               return false;
            }

            cpn $$8 = (cpn)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(jr.N, dmf.a).b().size();
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

   public crs a(cnm $$0, jb $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         crs $$3 = $$0.a($$2);
         if (!$$3.d()) {
            int $$4 = $$3.a(jr.N, dmf.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return crs.i;
   }

   public iw<crs> a(cnm $$0) {
      iw<crs> $$1 = iw.a($$0.b(), crs.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         crs $$3 = $$0.a($$2);
         if (!$$3.d()) {
            if ($$3.f().w()) {
               $$1.set($$2, new crs($$3.f().v()));
            } else if (!$$3.a(jr.N, dmf.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
