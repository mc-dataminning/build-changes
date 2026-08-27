public class cwo extends cvk {
   public cwo(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               crs $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.d()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(crv.vp)) {
                     return false;
                  }
               } else if (!$$4.a(crv.ou)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public crs a(cnm $$0, jb $$1) {
      crs $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(crv.vp)) {
         return crs.i;
      } else {
         crs $$3 = new crs(crv.vo, 8);
         $$3.b(jr.x, $$2.a(jr.x));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.j;
   }
}
