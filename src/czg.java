public class czg extends cyn {
   public czg(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dez.a($$5.g()) instanceof dly) {
               $$2++;
            } else {
               if (!($$5.g() instanceof ctj)) {
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

   public cup a(cqk $$0, jk.a $$1) {
      cup $$2 = cup.l;
      ctj $$3 = (ctj)cus.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cuk $$6 = $$5.g();
            if (dez.a($$6) instanceof dly) {
               $$2 = $$5;
            } else if ($$6 instanceof ctj) {
               $$3 = (ctj)$$6;
            }
         }
      }

      dez $$7 = dly.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.m;
   }
}
