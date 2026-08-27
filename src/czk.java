public class czk extends cyq {
   public czk(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      cuh $$2 = cuh.i;
      cuh $$3 = cuh.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof crz) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuk.xd)) {
                  return false;
               }

               if (!$$2.d()) {
                  return false;
               }

               dps $$6 = $$5.a(ke.W, dps.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.d() && !$$3.d();
   }

   public cuh a(cpw $$0, jc.a $$1) {
      cuh $$2 = cuh.i;
      cuh $$3 = cuh.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof crz) {
               $$2 = $$5;
            } else if ($$5.a(cuk.xd)) {
               $$3 = $$5.r();
            }
         }
      }

      if ($$3.d()) {
         return $$3;
      } else {
         $$3.b(ke.W, $$2.a(ke.W));
         $$3.b(ke.X, ((crz)$$2.f()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cze<?> ao_() {
      return cze.m;
   }
}
