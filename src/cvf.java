public class cvf extends cvk {
   public cvf(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      int $$2 = 0;
      crs $$3 = crs.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(crv.tZ)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crv.tY)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public crs a(cnm $$0, jb $$1) {
      int $$2 = 0;
      crs $$3 = crs.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(crv.tZ)) {
               if (!$$3.d()) {
                  return crs.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crv.tY)) {
                  return crs.i;
               }

               $$2++;
            }
         }
      }

      cuv $$6 = $$3.a(jr.A);
      if (!$$3.d() && $$2 >= 1 && $$6 != null) {
         cuv $$7 = $$6.a();
         if ($$7 == null) {
            return crs.i;
         } else {
            crs $$8 = $$3.c($$2);
            $$8.b(jr.A, $$7);
            return $$8;
         }
      } else {
         return crs.i;
      }
   }

   public iw<crs> a(cnm $$0) {
      iw<crs> $$1 = iw.a($$0.b(), crs.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         crs $$3 = $$0.a($$2);
         if ($$3.f().w()) {
            $$1.set($$2, new crs($$3.f().v()));
         } else if ($$3.f() instanceof ctn) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
