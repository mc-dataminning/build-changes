public class dfi extends deh {
   public dfi(dee $$0) {
      super($$0);
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            daa $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cyg) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(dae.wD)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dxu $$6 = $$5.a(kl.am, dxu.a);
                  if (!$$6.b().isEmpty()) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public daa a(def $$0, ji.a $$1) {
      daa $$2 = daa.k;
      daa $$3 = daa.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         daa $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cyg) {
               $$2 = $$5;
            } else if ($$5.a(dae.wD)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kl.am, $$2.a(kl.am));
         $$3.b(kl.an, ((cyg)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public dfb<dfi> a() {
      return dfb.l;
   }
}
