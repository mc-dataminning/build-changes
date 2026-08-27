public class cmy extends clw {
   public cmy(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cja $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cjd.ux)) {
                     return false;
                  }
               } else if (!$$4.a(cjd.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cja a(ceu $$0, hu $$1) {
      cja $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cjd.ux)) {
         return cja.b;
      } else {
         cja $$3 = new cja(cjd.uw, 8);
         ckz.a($$3, ckz.d($$2));
         ckz.a($$3, ckz.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.j;
   }
}
