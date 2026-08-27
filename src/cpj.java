public class cpj extends cpd {
   public cpj(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      int $$2 = 0;
      cmh $$3 = cmh.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cmk.rR)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmk.uc)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public cmh a(cia $$0, is $$1) {
      int $$2 = 0;
      cmh $$3 = cmh.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cmk.rR)) {
               if (!$$3.b()) {
                  return cmh.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmk.uc)) {
                  return cmh.f;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : cmh.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.e;
   }
}
