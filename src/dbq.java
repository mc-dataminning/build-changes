public class dbq extends dak {
   public dbq(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cwf $$4 = $$0.a($$3, $$2);
               if ($$4.f()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cwj.vJ)) {
                     return false;
                  }
               } else if (!$$4.a(cwj.ox)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cwf a(dai $$0, js.a $$1) {
      cwf $$2 = $$0.a(1, 1);
      if (!$$2.a(cwj.vJ)) {
         return cwf.k;
      } else {
         cwf $$3 = new cwf(cwj.vI, 8);
         $$3.b(ku.Q, $$2.a(ku.Q));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public day<?> aq_() {
      return day.j;
   }
}
