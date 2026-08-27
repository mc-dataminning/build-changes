public class cwd extends cvk {
   public cwd(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (dch.a($$5.f()) instanceof djf) {
               $$2++;
            } else {
               if (!($$5.f() instanceof cqm)) {
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

   public crs a(cnm $$0, jb $$1) {
      crs $$2 = crs.i;
      cqm $$3 = (cqm)crv.rh;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            crn $$6 = $$5.f();
            if (dch.a($$6) instanceof djf) {
               $$2 = $$5;
            } else if ($$6 instanceof cqm) {
               $$3 = (cqm)$$6;
            }
         }
      }

      dch $$7 = djf.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.m;
   }
}
