public class cqw extends cpt {
   public cqw(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmx $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cwr.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cwr.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(aso.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cna.pn) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cmx a(ciq $$0, iu $$1) {
      cmx $$2 = new cmx(cna.vN, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cmx $$4 = $$0.a($$3);
         if (!$$4.b()) {
            deq $$5 = deq.a($$4.d());
            if ($$5 != null) {
               coh.a($$2, $$5.b());
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
   public cqf<?> ar_() {
      return cqf.n;
   }
}
