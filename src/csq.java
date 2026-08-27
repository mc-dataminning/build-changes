public class csq extends csk {
   public csq(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      int $$2 = 0;
      cpq $$3 = cpq.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpt.rT)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpt.uf)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cpq a(clk $$0, iy $$1) {
      int $$2 = 0;
      cpq $$3 = cpq.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpt.rT)) {
               if (!$$3.b()) {
                  return cpq.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpt.uf)) {
                  return cpq.h;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cpq.h;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public csw<?> as_() {
      return csw.e;
   }
}
