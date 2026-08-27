public class cqg extends cpd {
   public cqg(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmh $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cwb.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cwb.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(arz.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cmk.pn) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cmh a(cia $$0, is $$1) {
      cmh $$2 = new cmh(cmk.vN, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cmh $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dea $$5 = dea.a($$4.d());
            if ($$5 != null) {
               cnr.a($$2, $$5.b());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.n;
   }
}
