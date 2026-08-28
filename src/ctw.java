public class ctw extends cuk {
   public ctw(cuk.a $$0) {
      super($$0);
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      if ($$1.ct != null) {
         if (!$$0.B) {
            int $$4 = $$1.ct.a($$3);
            $$3.a($$4, $$1, btp.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.iW, awb.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dwv.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.iY, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = dab.e($$3);
            int $$6 = dab.d($$3);
            $$0.b(new cnl($$1, $$0, $$6, $$5));
         }

         $$1.b(awk.c.b(this));
         $$1.a(dwv.D);
      }

      return bqv.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
