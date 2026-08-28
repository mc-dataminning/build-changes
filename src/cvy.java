import java.util.List;

public class cvy extends cxl {
   public cvy(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      List<bvd> $$3 = $$0.a(bvd.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof cku);
      cxp $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bvd $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), axf.cD, axg.g, 1.0F, 1.0F);
         $$0.a($$1, ecr.y, $$1.du());
         if ($$1 instanceof asi $$6) {
            ao.T.a($$6, $$4, $$5);
         }

         return btj.a.a(this.a($$4, $$1, new cxp(cxt.wd)));
      } else {
         fbu $$7 = a($$0, $$1, dgq.b.b);
         if ($$7.d() == fbw.a.a) {
            return btj.e;
         } else {
            if ($$7.d() == fbw.a.b) {
               jh $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return btj.e;
               }

               if ($$0.b_($$8).a(aya.a)) {
                  $$0.a($$1, $$1.dB(), $$1.dD(), $$1.dH(), axf.cC, axg.g, 1.0F, 1.0F);
                  $$0.a($$1, ecr.y, $$8);
                  return btj.a.a(this.a($$4, $$1, czo.a(cxt.sZ, czp.a)));
               }
            }

            return btj.e;
         }
      }
   }

   protected cxp a(cxp $$0, cpx $$1, cxp $$2) {
      $$1.b(axp.c.b(this));
      return cxs.a($$0, $$1, $$2);
   }
}
