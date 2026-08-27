public class cll extends cls {
   public cll(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      chl $$2 = null;
      cix $$3 = null;
      cix $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cix $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cis $$7 = $$6.d();
            if (!($$7 instanceof cgn)) {
               return false;
            }

            cgn $$8 = (cgn)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dcb.c($$6);
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

   public cix a(cer $$0, hs $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cix $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dcb.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cix.b;
   }

   public hn<cix> a(cer $$0) {
      hn<cix> $$1 = hn.a($$0.b(), cix.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cix $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new cix($$3.d().s()));
            } else if ($$3.u() && dcb.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
