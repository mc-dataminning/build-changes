public class ctj extends ctx {
   public ctj(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.B) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, btb.d($$2));
         }

         $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avh.iW, avi.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dxg.C);
      } else {
         $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avh.iY, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if ($$0 instanceof aqm $$5) {
            int $$6 = (int)(czn.b($$5, $$3, $$1) * 20.0F);
            int $$7 = czn.a($$5, $$3, $$1);
            $$0.b(new cmy($$1, $$0, $$7, $$6));
         }

         $$1.b(avr.c.b(this));
         $$1.a(dxg.D);
      }

      return bqh.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
