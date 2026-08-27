public class cnj extends cmh {
   public cnj(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cjl $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cjo.ux)) {
                     return false;
                  }
               } else if (!$$4.a(cjo.nH)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cjl a(cff $$0, hr $$1) {
      cjl $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cjo.ux)) {
         return cjl.b;
      } else {
         cjl $$3 = new cjl(cjo.uw, 8);
         clk.a($$3, clk.d($$2));
         clk.a($$3, clk.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cms<?> an_() {
      return cms.j;
   }
}
