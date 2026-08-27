public class cqq extends cpn {
   public cqq(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmr $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cwl.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cwl.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(asj.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cmu.pn) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cmr a(cik $$0, iu $$1) {
      cmr $$2 = new cmr(cmu.vN, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cmr $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dek $$5 = dek.a($$4.d());
            if ($$5 != null) {
               cob.a($$2, $$5.b());
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
   public cpz<?> ar_() {
      return cpz.n;
   }
}
