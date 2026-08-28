public class dbf extends czy {
   public dbf(czv $$0) {
      super($$0);
   }

   public boolean a(czw $$0, deg $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cvp $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cvt.vt)) {
                     return false;
                  }
               } else if (!$$4.a(cvt.ox)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cvp a(czw $$0, jp.a $$1) {
      cvp $$2 = $$0.a(1, 1);
      if (!$$2.a(cvt.vt)) {
         return cvp.k;
      } else {
         cvp $$3 = new cvp(cvt.vs, 8);
         $$3.b(kr.L, $$2.a(kr.L));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public dam<?> aq_() {
      return dam.j;
   }
}
