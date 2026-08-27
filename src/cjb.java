public class cjb extends cjh {
   public cjb(acq $$0, cis $$1) {
      super(
         $$0,
         "",
         $$1,
         3,
         3,
         hn.a(ciz.a, ciz.a(cgc.qa), ciz.a(cgc.qa), ciz.a(cgc.qa), ciz.a(cgc.qa), ciz.a(cgc.rf), ciz.a(cgc.qa), ciz.a(cgc.qa), ciz.a(cgc.qa), ciz.a(cgc.qa)),
         new cfz(cgc.tp)
      );
   }

   @Override
   public boolean a(cbt $$0, cmm $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cfz $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            dyo $$3 = cgg.a($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.e() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cfz a(cbt $$0, hs $$1) {
      cfz $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cfz a(cbt $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cfz $$2 = $$0.a($$1);
         if ($$2.a(cgc.rf)) {
            return $$2;
         }
      }

      return cfz.b;
   }

   @Override
   public boolean ai_() {
      return true;
   }

   @Override
   public cje<?> aj_() {
      return cje.f;
   }
}
