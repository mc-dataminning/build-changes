public class cmn extends cnb implements cpb {
   public cmn(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      if ($$1.co != null) {
         if (!$$0.B) {
            int $$4 = $$1.co.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), art.iH, aru.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.b(dnz.C);
      } else {
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), art.iJ, aru.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = crt.c($$3);
            int $$6 = crt.b($$3);
            $$0.b(new cge($$1, $$0, $$6, $$5));
         }

         $$1.b(asd.c.b(this));
         $$1.b(dnz.D);
      }

      return bkd.a($$3, $$0.y_());
   }

   @Override
   public int an_() {
      return 1;
   }
}
