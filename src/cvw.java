public class cvw extends cwj {
   public cvw(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      if ($$1.cw != null) {
         if (!$$0.C) {
            int $$4 = $$1.cw.a($$3);
            $$3.a($$4, $$1, bvf.d($$2));
         }

         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), avz.jw, awa.g, 1.0F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         $$1.a(ebr.C);
      } else {
         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), avz.jy, awa.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
         if ($$0 instanceof arc $$5) {
            int $$6 = (int)(dcz.b($$5, $$3, $$1) * 20.0F);
            int $$7 = dcz.a($$5, $$3, $$1);
            cpo.a(new cpk($$1, $$0, $$7, $$6), $$5, $$3);
         }

         $$1.b(awj.c.b(this));
         $$1.a(ebr.D);
      }

      return bsi.a;
   }
}
