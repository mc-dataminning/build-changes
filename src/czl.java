public class czl extends cyr {
   public czl(cyo $$0) {
      super($$0);
   }

   public boolean a(cyp $$0, dcw $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dfy.a($$5.g()) instanceof dmy) {
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

   public cuq a(cyp $$0, jo.a $$1) {
      cuq $$2 = cuq.l;
      ctj $$3 = (ctj)cut.ri;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cul $$6 = $$5.g();
            if (dfy.a($$6) instanceof dmy) {
               $$2 = $$5;
            } else if ($$6 instanceof ctj) {
               $$3 = (ctj)$$6;
            }
         }
      }

      dfy $$7 = dmy.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cze<?> at_() {
      return cze.m;
   }
}
