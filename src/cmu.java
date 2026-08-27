public class cmu extends cmd {
   public cmu(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (csx.a($$5.d()) instanceof czw) {
               $$2++;
            } else {
               if (!($$5.d() instanceof chw)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cjh a(cfb $$0, hu $$1) {
      cjh $$2 = cjh.b;
      chw $$3 = (chw)cjk.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cjc $$6 = $$5.d();
            if (csx.a($$6) instanceof czw) {
               $$2 = $$5;
            } else if ($$6 instanceof chw) {
               $$3 = (chw)$$6;
            }
         }
      }

      cjh $$7 = czw.b($$3.d());
      if ($$2.u()) {
         $$7.c($$2.v().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmo<?> an_() {
      return cmo.m;
   }
}
