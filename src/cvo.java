public class cvo extends cwb {
   public cvo(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      if ($$1.cv != null) {
         if (!$$0.C) {
            int $$4 = $$1.cv.a($$3);
            $$3.a($$4, $$1, bve.d($$2));
         }

         $$0.a(null, $$1.dD(), $$1.dF(), $$1.dJ(), awo.iX, awp.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(eak.C);
      } else {
         $$0.a(null, $$1.dD(), $$1.dF(), $$1.dJ(), awo.iZ, awp.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arq $$5) {
            int $$6 = (int)(dby.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dby.a($$5, $$3, $$1);
            cpk.a(new cpg($$1, $$0, $$7, $$6, $$3), $$5, $$3);
         }

         $$1.b(awy.c.b(this));
         $$1.a(eak.D);
      }

      return bsh.a;
   }
}
