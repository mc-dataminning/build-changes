public class ctv extends cuj {
   public ctv(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.B) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, btl.d($$2));
         }

         $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avo.iW, avp.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dxw.C);
      } else {
         $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avo.iY, avp.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if ($$0 instanceof aqt $$5) {
            int $$6 = (int)(dac.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dac.a($$5, $$3, $$1);
            $$0.b(new cnj($$1, $$0, $$7, $$6));
         }

         $$1.b(avy.c.b(this));
         $$1.a(dxw.D);
      }

      return bqr.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
