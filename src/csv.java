public class csv extends ctj {
   public csv(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      if ($$1.cu != null) {
         if (!$$0.B) {
            int $$4 = $$1.cu.a($$3);
            $$3.a($$4, $$1, bso.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avh.iW, avi.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dvu.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avh.iY, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cza.e($$3);
            int $$6 = cza.d($$3);
            $$0.b(new cmk($$1, $$0, $$6, $$5));
         }

         $$1.b(avr.c.b(this));
         $$1.a(dvu.D);
      }

      return bpv.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
