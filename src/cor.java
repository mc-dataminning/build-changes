public class cor extends cok {
   public cor(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      int $$2 = 0;
      clo $$3 = clo.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(clr.rR)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(clr.ub)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public clo a(chh $$0, it $$1) {
      int $$2 = 0;
      clo $$3 = clo.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(clr.rR)) {
               if (!$$3.b()) {
                  return clo.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(clr.ub)) {
                  return clo.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : clo.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cox<?> as_() {
      return cox.e;
   }
}
