public class cqm extends cpt {
   public cqm(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (cwp.a($$5.d()) instanceof ddn) {
               $$2++;
            } else {
               if (!($$5.d() instanceof clm)) {
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

   public cmx a(ciq $$0, iu $$1) {
      cmx $$2 = cmx.f;
      clm $$3 = (clm)cna.rf;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cms $$6 = $$5.d();
            if (cwp.a($$6) instanceof ddn) {
               $$2 = $$5;
            } else if ($$6 instanceof clm) {
               $$3 = (clm)$$6;
            }
         }
      }

      cmx $$7 = ddn.b($$3.d());
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
   public cqf<?> ar_() {
      return cqf.m;
   }
}
