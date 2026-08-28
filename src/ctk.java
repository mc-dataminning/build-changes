public class ctk extends cty {
   public ctk(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      if ($$1.cw != null) {
         if (!$$0.B) {
            int $$4 = $$1.cw.a($$3);
            $$3.a($$4, $$1, btc.d($$2));
         }

         $$0.a(null, $$1.dw(), $$1.dy(), $$1.dC(), avh.iW, avi.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dxh.C);
      } else {
         $$0.a(null, $$1.dw(), $$1.dy(), $$1.dC(), avh.iY, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if ($$0 instanceof aqm $$5) {
            int $$6 = (int)(czo.b($$5, $$3, $$1) * 20.0F);
            int $$7 = czo.a($$5, $$3, $$1);
            $$0.b(new cmz($$1, $$0, $$7, $$6));
         }

         $$1.b(avr.c.b(this));
         $$1.a(dxh.D);
      }

      return bqi.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
