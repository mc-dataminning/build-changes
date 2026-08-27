public class civ extends ciu {
   public civ(acq $$0, cis $$1) {
      super($$0, $$1);
   }

   public boolean a(cbt $$0, cmm $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cfz $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(ane.aM)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cgc.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cfz a(cbt $$0, hs $$1) {
      dac.a $$2 = new dac.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return a($$2);
   }

   public static cfz a(dac.a $$0) {
      cfz $$1 = cgc.eg.ae_();
      qr $$2 = $$0.a(new qr());
      cds.a($$1, czp.O, $$2);
      return $$1;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cje<?> aj_() {
      return cje.w;
   }
}
