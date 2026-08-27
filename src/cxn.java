public class cxn extends cwv {
   public cxn(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      csz $$2 = csz.i;
      csz $$3 = csz.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cqu) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctc.vs)) {
                  return false;
               }

               if (!$$2.d()) {
                  return false;
               }

               dnd $$6 = $$5.a(ka.U, dnd.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.d() && !$$3.d();
   }

   public csz a(cou $$0, iy.a $$1) {
      csz $$2 = csz.i;
      csz $$3 = csz.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.f() instanceof cqu) {
               $$2 = $$5;
            } else if ($$5.a(ctc.vs)) {
               $$3 = $$5.r();
            }
         }
      }

      if ($$3.d()) {
         return $$3;
      } else {
         $$3.b(ka.U, $$2.a(ka.U));
         $$3.b(ka.V, ((cqu)$$2.f()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.l;
   }
}
