public class cyw extends cyq {
   public cyw(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      int $$2 = 0;
      cuh $$3 = cuh.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(cuk.tr)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuk.vU)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public cuh a(cpw $$0, jc.a $$1) {
      int $$2 = 0;
      cuh $$3 = cuh.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(cuk.tr)) {
               if (!$$3.d()) {
                  return cuh.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuk.vU)) {
                  return cuh.i;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 >= 1 ? $$3.c($$2 + 1) : cuh.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cze<?> ao_() {
      return cze.f;
   }
}
