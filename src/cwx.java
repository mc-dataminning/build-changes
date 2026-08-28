public class cwx extends cxk {
   public cwx(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.C) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, bwf.d($$2));
         }

         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), axf.jq, axg.g, 1.0F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         $$1.a(ecq.C);
      } else {
         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), axf.js, axg.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         if ($$0 instanceof ash $$5) {
            int $$6 = (int)(dea.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dea.a($$5, $$3, $$1);
            cqp.a(new cql($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(axp.c.b(this));
         $$1.a(ecq.D);
      }

      return bti.a;
   }
}
