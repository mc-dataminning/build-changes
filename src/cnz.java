public class cnz extends cof {
   public cnz(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      int $$2 = 0;
      clj $$3 = clj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(clm.tT)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(clm.tS)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public clj a(chc $$0, ip $$1) {
      int $$2 = 0;
      clj $$3 = clj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(clm.tT)) {
               if (!$$3.b()) {
                  return clj.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(clm.tS)) {
                  return clj.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cnf.d($$3) < 2) {
         clj $$6 = new clj(clm.tT, $$2);
         rz $$7 = $$3.v().h();
         $$7.a("generation", cnf.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return clj.b;
      }
   }

   public il<clj> a(chc $$0) {
      il<clj> $$1 = il.a($$0.b(), clj.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         clj $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new clj($$3.d().s()));
         } else if ($$3.d() instanceof cnf) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cos<?> aq_() {
      return cos.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
