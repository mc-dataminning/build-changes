public class cxz extends cwv {
   public cxz(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               csz $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.d()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(ctc.vr)) {
                     return false;
                  }
               } else if (!$$4.a(ctc.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public csz a(cou $$0, iy.a $$1) {
      csz $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(ctc.vr)) {
         return csz.i;
      } else {
         csz $$3 = new csz(ctc.vq, 8);
         $$3.b(ka.E, $$2.a(ka.E));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.j;
   }
}
