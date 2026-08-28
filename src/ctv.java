public class ctv extends cuj {
   public ctv(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      if ($$1.ct != null) {
         if (!$$0.B) {
            int $$4 = $$1.ct.a($$3);
            $$3.a($$4, $$1, bto.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.iW, awa.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dwu.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.iY, awa.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = daa.e($$3);
            int $$6 = daa.d($$3);
            $$0.b(new cnk($$1, $$0, $$6, $$5));
         }

         $$1.b(awj.c.b(this));
         $$1.a(dwu.D);
      }

      return bqu.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
