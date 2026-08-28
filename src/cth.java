public class cth extends ctv {
   public cth(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.B) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, bsy.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avf.iW, avg.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dxa.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avf.iY, avg.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if ($$0 instanceof aqk $$5) {
            int $$6 = (int)(czl.b($$5, $$3, $$1) * 20.0F);
            int $$7 = czl.a($$5, $$3, (bsd)$$1);
            $$0.b(new cmv($$1, $$0, $$7, $$6));
         }

         $$1.b(avp.c.b(this));
         $$1.a(dxa.D);
      }

      return bqe.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
