public class clm extends clr {
   public clm(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      int $$2 = 0;
      ciw $$3 = ciw.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(ciz.th)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ciz.tg)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public ciw a(ceq $$0, ht $$1) {
      int $$2 = 0;
      ciw $$3 = ciw.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(ciz.th)) {
               if (!$$3.b()) {
                  return ciw.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ciz.tg)) {
                  return ciw.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cks.d($$3) < 2) {
         ciw $$6 = new ciw(ciz.th, $$2);
         qs $$7 = $$3.v().h();
         $$7.a("generation", cks.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return ciw.b;
      }
   }

   public ho<ciw> a(ceq $$0) {
      ho<ciw> $$1 = ho.a($$0.b(), ciw.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ciw $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new ciw($$3.d().s()));
         } else if ($$3.d() instanceof cks) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
