public class cmh extends cls {
   public cmh(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      cix $$2 = cix.b;
      cix $$3 = cix.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgn) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cja.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cgq.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cix a(cer $$0, hs $$1) {
      cix $$2 = cix.b;
      cix $$3 = cix.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cgn) {
               $$2 = $$5;
            } else if ($$5.a(cja.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         qr $$6 = cgq.a($$2);
         qr $$7 = $$6 == null ? new qr() : $$6.h();
         $$7.a("Base", ((cgn)$$2.d()).b().a());
         cgq.a($$3, dcn.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.l;
   }
}
