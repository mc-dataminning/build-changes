public class ctc extends csk {
   public ctc(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      cpq $$2 = cpq.h;
      cpq $$3 = cpq.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cni) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpt.vo)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cnl.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cpq a(clk $$0, iy $$1) {
      cpq $$2 = cpq.h;
      cpq $$3 = cpq.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cni) {
               $$2 = $$5;
            } else if ($$5.a(cpt.vo)) {
               $$3 = $$5.q();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         sy $$6 = cnl.a($$2);
         sy $$7 = $$6 == null ? new sy() : $$6.h();
         $$7.a("Base", ((cni)$$2.d()).b().a());
         cnl.a($$3, djn.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csw<?> as_() {
      return csw.l;
   }
}
