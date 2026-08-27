public class cmg extends clr {
   public cmg(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      ciw $$2 = ciw.b;
      ciw $$3 = ciw.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgm) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ciz.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cgp.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public ciw a(ceq $$0, ht $$1) {
      ciw $$2 = ciw.b;
      ciw $$3 = ciw.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgm) {
               $$2 = $$5;
            } else if ($$5.a(ciz.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         qs $$6 = cgp.a($$2);
         qs $$7 = $$6 == null ? new qs() : $$6.h();
         $$7.a("Base", ((cgm)$$2.d()).b().a());
         cgp.a($$3, dcm.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.l;
   }
}
