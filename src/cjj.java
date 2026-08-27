public class cjj extends ciu {
   public cjj(acq $$0, cis $$1) {
      super($$0, $$1);
   }

   public boolean a(cbt $$0, cmm $$1) {
      cfz $$2 = cfz.b;
      cfz $$3 = cfz.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cdp) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cgc.uy)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (cds.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cfz a(cbt $$0, hs $$1) {
      cfz $$2 = cfz.b;
      cfz $$3 = cfz.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cfz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cdp) {
               $$2 = $$5;
            } else if ($$5.a(cgc.uy)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         qr $$6 = cds.a($$2);
         qr $$7 = $$6 == null ? new qr() : $$6.h();
         $$7.a("Base", ((cdp)$$2.d()).b().a());
         cds.a($$3, czp.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cje<?> aj_() {
      return cje.l;
   }
}
