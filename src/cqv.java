public class cqv extends cqc {
   public cqv(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cwy.a($$5.d()) instanceof ddw) {
               $$2++;
            } else {
               if (!($$5.d() instanceof clw)) {
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

   public cng a(ciz $$0, iu $$1) {
      cng $$2 = cng.f;
      clw $$3 = (clw)cnj.rh;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cnb $$6 = $$5.d();
            if (cwy.a($$6) instanceof ddw) {
               $$2 = $$5;
            } else if ($$6 instanceof clw) {
               $$3 = (clw)$$6;
            }
         }
      }

      cng $$7 = ddw.b($$3.d());
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
   public cqo<?> at_() {
      return cqo.m;
   }
}
