public class cjk extends ciu {
   public cjk(acq $$0, cis $$1) {
      super($$0, $$1);
   }

   public boolean a(cbt $$0, cmm $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cpn.a($$5.d()) instanceof cwm) {
               $$2++;
            } else {
               if (!($$5.d() instanceof ceo)) {
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

   public cfz a(cbt $$0, hs $$1) {
      cfz $$2 = cfz.b;
      ceo $$3 = (ceo)cgc.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cfu $$6 = $$5.d();
            if (cpn.a($$6) instanceof cwm) {
               $$2 = $$5;
            } else if ($$6 instanceof ceo) {
               $$3 = (ceo)$$6;
            }
         }
      }

      cfz $$7 = cwm.b($$3.d());
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
   public cje<?> aj_() {
      return cje.m;
   }
}
