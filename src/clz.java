public class clz extends clt {
   public clz(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      int $$2 = 0;
      ciy $$3 = ciy.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjb.rf)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjb.tp)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 > 0;
   }

   public ciy a(ces $$0, hs $$1) {
      int $$2 = 0;
      ciy $$3 = ciy.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cjb.rf)) {
               if (!$$3.b()) {
                  return ciy.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cjb.tp)) {
                  return ciy.b;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$2 >= 1 ? $$3.c($$2 + 1) : ciy.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.e;
   }
}
