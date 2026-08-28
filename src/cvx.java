import java.util.List;

public class cvx extends cxk {
   public cvx(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      List<bvc> $$3 = $$0.a(bvc.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof ckt);
      cxo $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bvc $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), axf.cD, axg.g, 1.0F, 1.0F);
         $$0.a($$1, ecq.y, $$1.dt());
         if ($$1 instanceof asi $$6) {
            ao.T.a($$6, $$4, $$5);
         }

         return bti.a.a(this.a($$4, $$1, new cxo(cxs.wd)));
      } else {
         fbt $$7 = a($$0, $$1, dgp.b.b);
         if ($$7.d() == fbv.a.a) {
            return bti.e;
         } else {
            if ($$7.d() == fbv.a.b) {
               jh $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bti.e;
               }

               if ($$0.b_($$8).a(aya.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), axf.cC, axg.g, 1.0F, 1.0F);
                  $$0.a($$1, ecq.y, $$8);
                  return bti.a.a(this.a($$4, $$1, czn.a(cxs.sZ, czo.a)));
               }
            }

            return bti.e;
         }
      }
   }

   protected cxo a(cxo $$0, cpw $$1, cxo $$2) {
      $$1.b(axp.c.b(this));
      return cxr.a($$0, $$1, $$2);
   }
}
