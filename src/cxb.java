public class cxb extends cwv {
   public cxb(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      int $$2 = 0;
      csz $$3 = csz.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(ctc.rU)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctc.uj)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public csz a(cou $$0, iy.a $$1) {
      int $$2 = 0;
      csz $$3 = csz.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(ctc.rU)) {
               if (!$$3.d()) {
                  return csz.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctc.uj)) {
                  return csz.i;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 >= 1 ? $$3.c($$2 + 1) : csz.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.e;
   }
}
