public class cty extends cum {
   public cty(cum.a $$0) {
      super($$0);
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      if ($$1.ct != null) {
         if (!$$0.B) {
            int $$4 = $$1.ct.a($$3);
            $$3.a($$4, $$1, btr.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.iW, awb.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dwx.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), awa.iY, awb.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = dad.e($$3);
            int $$6 = dad.d($$3);
            $$0.b(new cnn($$1, $$0, $$6, $$5));
         }

         $$1.b(awk.c.b(this));
         $$1.a(dwx.D);
      }

      return bqx.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
