public class ctu extends cui {
   public ctu(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      if ($$1.ct != null) {
         if (!$$0.B) {
            int $$4 = $$1.ct.a($$3);
            $$3.a($$4, $$1, btn.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.iW, awa.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dwt.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.iY, awa.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = czz.e($$3);
            int $$6 = czz.d($$3);
            $$0.b(new cnj($$1, $$0, $$6, $$5));
         }

         $$1.b(awj.c.b(this));
         $$1.a(dwt.D);
      }

      return bqt.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
