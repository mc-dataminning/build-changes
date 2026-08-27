public class czl extends cyq {
   public czl(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (dfc.a($$5.f()) instanceof dmp) {
               $$2++;
            } else {
               if (!($$5.f() instanceof csz)) {
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

   public cuh a(cpw $$0, jc.a $$1) {
      cuh $$2 = cuh.i;
      csz $$3 = (csz)cuk.sF;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            cuc $$6 = $$5.f();
            if (dfc.a($$6) instanceof dmp) {
               $$2 = $$5;
            } else if ($$6 instanceof csz) {
               $$3 = (csz)$$6;
            }
         }
      }

      dfc $$7 = dmp.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cze<?> ao_() {
      return cze.n;
   }
}
