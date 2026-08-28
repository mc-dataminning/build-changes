public class cwp extends cxc {
   public cwp(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.C) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, bvx.d($$2));
         }

         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awv.jw, aww.g, 1.0F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         $$1.a(eck.C);
      } else {
         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), awv.jy, aww.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arx $$5) {
            int $$6 = (int)(dds.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dds.a($$5, $$3, $$1);
            cqh.a(new cqd($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(axf.c.b(this));
         $$1.a(eck.D);
      }

      return bta.a;
   }
}
