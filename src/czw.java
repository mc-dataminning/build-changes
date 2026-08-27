public class czw extends cyq {
   public czw(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cuh $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.d()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cuk.xc)) {
                     return false;
                  }
               } else if (!$$4.a(cuk.pL)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cuh a(cpw $$0, jc.a $$1) {
      cuh $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cuk.xc)) {
         return cuh.i;
      } else {
         cuh $$3 = new cuh(cuk.xb, 8);
         $$3.b(ke.E, $$2.a(ke.E));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cze<?> ao_() {
      return cze.k;
   }
}
