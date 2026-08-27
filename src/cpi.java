public class cpi extends cpn {
   public cpi(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      int $$2 = 0;
      cmr $$3 = cmr.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cmu.tU)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmu.tT)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public cmr a(cik $$0, iu $$1) {
      int $$2 = 0;
      cmr $$3 = cmr.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cmu.tU)) {
               if (!$$3.b()) {
                  return cmr.f;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cmu.tT)) {
                  return cmr.f;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && coo.d($$3) < 2) {
         cmr $$6 = new cmr(cmu.tU, $$2);
         sl $$7 = $$3.v().h();
         $$7.a("generation", coo.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cmr.f;
      }
   }

   public iq<cmr> a(cik $$0) {
      iq<cmr> $$1 = iq.a($$0.b(), cmr.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmr $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new cmr($$3.d().s()));
         } else if ($$3.d() instanceof coo) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
