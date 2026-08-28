public class ctx extends cul {
   public ctx(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      if ($$1.ct != null) {
         if (!$$0.B) {
            int $$4 = $$1.ct.a($$3);
            $$3.a($$4, $$1, btq.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.iW, awb.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dww.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.iY, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = dac.e($$3);
            int $$6 = dac.d($$3);
            $$0.b(new cnm($$1, $$0, $$6, $$5));
         }

         $$1.b(awk.c.b(this));
         $$1.a(dww.D);
      }

      return bqw.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
