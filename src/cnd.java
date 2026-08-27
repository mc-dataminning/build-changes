public class cnd extends cmb {
   public cnd(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cjf $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cji.ux)) {
                     return false;
                  }
               } else if (!$$4.a(cji.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cjf a(cez $$0, hu $$1) {
      cjf $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cji.ux)) {
         return cjf.b;
      } else {
         cjf $$3 = new cjf(cji.uw, 8);
         cle.a($$3, cle.d($$2));
         cle.a($$3, cle.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cmm<?> an_() {
      return cmm.j;
   }
}
