public class cpg extends cpn {
   public cpg(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      clf $$2 = null;
      cmr $$3 = null;
      cmr $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cmr $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cmm $$7 = $$6.d();
            if (!($$7 instanceof ckh)) {
               return false;
            }

            ckh $$8 = (ckh)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dge.c($$6);
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cmr a(cik $$0, iu $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cmr $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dge.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cmr.f;
   }

   public iq<cmr> a(cik $$0) {
      iq<cmr> $$1 = iq.a($$0.b(), cmr.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmr $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new cmr($$3.d().s()));
            } else if ($$3.u() && dge.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
