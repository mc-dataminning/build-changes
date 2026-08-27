public class cnf extends cmd {
   public cnf(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cjh $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cjk.ux)) {
                     return false;
                  }
               } else if (!$$4.a(cjk.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cjh a(cfb $$0, hu $$1) {
      cjh $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cjk.ux)) {
         return cjh.b;
      } else {
         cjh $$3 = new cjh(cjk.uw, 8);
         clg.a($$3, clg.d($$2));
         clg.a($$3, clg.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cmo<?> an_() {
      return cmo.j;
   }
}
