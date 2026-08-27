public class cnc extends cmb {
   public cnc(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cjf $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(csw.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(csw.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(aqb.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cji.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cjf a(cez $$0, hu $$1) {
      cjf $$2 = new cjf(cji.va, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cjf $$4 = $$0.a($$3);
         if (!$$4.b()) {
            day $$5 = day.a($$4.d());
            if ($$5 != null) {
               ckp.a($$2, $$5.a());
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
   public cmm<?> an_() {
      return cmm.n;
   }
}
