public class cwf extends cvb {
   public cwf(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               crj $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.d()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(crm.vp)) {
                     return false;
                  }
               } else if (!$$4.a(crm.ou)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public crj a(cnf $$0, iz $$1) {
      crj $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(crm.vp)) {
         return crj.i;
      } else {
         crj $$3 = new crj(crm.vo, 8);
         $$3.b(jp.x, $$2.a(jp.x));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.j;
   }
}
