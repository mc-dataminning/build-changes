public class cmj extends cmd {
   public cmj(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      int $$2 = 0;
      cjh $$3 = cjh.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjk.rf)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjk.tp)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cjh a(cfb $$0, hu $$1) {
      int $$2 = 0;
      cjh $$3 = cjh.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjk.rf)) {
               if (!$$3.b()) {
                  return cjh.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjk.tp)) {
                  return cjh.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cjh.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cmo<?> an_() {
      return cmo.e;
   }
}
