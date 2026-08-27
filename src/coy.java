public class coy extends cof {
   public coy(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cva.a($$5.d()) instanceof dby) {
               $$2++;
            } else {
               if (!($$5.d() instanceof cjy)) {
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

   public clj a(chc $$0, ip $$1) {
      clj $$2 = clj.b;
      cjy $$3 = (cjy)clm.rf;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cle $$6 = $$5.d();
            if (cva.a($$6) instanceof dby) {
               $$2 = $$5;
            } else if ($$6 instanceof cjy) {
               $$3 = (cjy)$$6;
            }
         }
      }

      clj $$7 = dby.b($$3.d());
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
   public cos<?> aq_() {
      return cos.m;
   }
}
