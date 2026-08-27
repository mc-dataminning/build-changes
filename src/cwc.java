public class cwc extends cvk {
   public cwc(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      crs $$2 = crs.i;
      crs $$3 = crs.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cpn) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crv.vq)) {
                  return false;
               }

               if (!$$2.d()) {
                  return false;
               }

               dmf $$6 = $$5.a(jr.N, dmf.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.d() && !$$3.d();
   }

   public crs a(cnm $$0, jb $$1) {
      crs $$2 = crs.i;
      crs $$3 = crs.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cpn) {
               $$2 = $$5;
            } else if ($$5.a(crv.vq)) {
               $$3 = $$5.r();
            }
         }
      }

      if ($$3.d()) {
         return $$3;
      } else {
         $$3.b(jr.N, $$2.a(jr.N));
         $$3.b(jr.O, ((cpn)$$2.f()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.l;
   }
}
