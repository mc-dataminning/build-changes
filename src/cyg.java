public class cyg extends cxo {
   public cyg(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      ctq $$2 = ctq.i;
      ctq $$3 = ctq.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof crl) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctt.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dnz $$6 = $$5.a(kb.W, dnz.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public ctq a(cpl $$0, iz.a $$1) {
      ctq $$2 = ctq.i;
      ctq $$3 = ctq.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof crl) {
               $$2 = $$5;
            } else if ($$5.a(ctt.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(kb.W, $$2.a(kb.W));
         $$3.b(kb.X, ((crl)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cya<?> ap_() {
      return cya.l;
   }
}
