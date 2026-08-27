public class cto extends csk {
   public cto(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cpq $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.b()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cpt.vn)) {
                     return false;
                  }
               } else if (!$$4.a(cpt.ou)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cpq a(clk $$0, iy $$1) {
      cpq $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cpt.vn)) {
         return cpq.h;
      } else {
         cpq $$3 = new cpq(cpt.vm, 8);
         cro.a($$3, cro.d($$2));
         cro.a($$3, cro.b($$2));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public csw<?> as_() {
      return csw.j;
   }
}
