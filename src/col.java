public class col extends cof {
   public col(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      int $$2 = 0;
      clj $$3 = clj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(clm.rR)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(clm.ub)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public clj a(chc $$0, ip $$1) {
      int $$2 = 0;
      clj $$3 = clj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(clm.rR)) {
               if (!$$3.b()) {
                  return clj.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(clm.ub)) {
                  return clj.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : clj.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cos<?> aq_() {
      return cos.e;
   }
}
