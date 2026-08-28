public class cvk extends cvx {
   public cvk(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.C) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, bva.d($$2));
         }

         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), awl.iX, awm.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(eag.C);
      } else {
         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), awl.iZ, awm.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arn $$5) {
            int $$6 = (int)(dbu.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dbu.a($$5, $$3, $$1);
            cpg.a(new cpc($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(awv.c.b(this));
         $$1.a(eag.D);
      }

      return bsd.a;
   }
}
