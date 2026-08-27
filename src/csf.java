public class csf extends csk {
   public csf(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      int $$2 = 0;
      cpq $$3 = cpq.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpt.tX)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpt.tW)) {
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
            if ($$5.a(cpt.tX)) {
               if (!$$3.b()) {
                  return cpq.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpt.tW)) {
                  return cpq.h;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$2 >= 1 && crl.d($$3) < 2) {
         cpq $$6 = $$3.c($$2);
         $$6.x().a("generation", crl.d($$3) + 1);
         return $$6;
      } else {
         return cpq.h;
      }
   }

   public iu<cpq> a(clk $$0) {
      iu<cpq> $$1 = iu.a($$0.b(), cpq.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cpq $$3 = $$0.a($$2);
         if ($$3.d().u()) {
            $$1.set($$2, new cpq($$3.d().t()));
         } else if ($$3.d() instanceof crl) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public csw<?> as_() {
      return csw.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
