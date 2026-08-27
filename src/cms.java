public class cms extends cls {
   public cms(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cix $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(csm.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(csm.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(apt.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cja.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cix a(cer $$0, hs $$1) {
      cix $$2 = new cix(cja.va, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cix $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dao $$5 = dao.a($$4.d());
            if ($$5 != null) {
               ckh.a($$2, $$5.a());
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
   public cmc<?> ai_() {
      return cmc.n;
   }
}
