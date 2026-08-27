import java.util.List;

public class cpl extends cre {
   public cpl(cre.a $$0) {
      super($$0);
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      List<bpr> $$3 = $$0.a(bpr.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bA() && $$0x.r() instanceof cex);
      crj $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bpr $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aum.cD, aun.g, 1.0F, 1.0F);
         $$0.a($$1, dts.y, $$1.dk());
         if ($$1 instanceof apt $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bob.a(this.a($$4, $$1, new crj(crm.vl)), $$0.x_());
      } else {
         erw $$7 = a($$0, $$1, cyg.b.b);
         if ($$7.c() == ery.a.a) {
            return bob.c($$4);
         } else {
            if ($$7.c() == ery.a.b) {
               ib $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bob.c($$4);
               }

               if ($$0.b_($$8).a(avh.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), aum.cC, aun.g, 1.0F, 1.0F);
                  $$0.a($$1, dts.y, $$8);
                  return bob.a(this.a($$4, $$1, cth.a(crm.sj, cti.a)), $$0.x_());
               }
            }

            return bob.c($$4);
         }
      }
   }

   protected crj a(crj $$0, cjt $$1, crj $$2) {
      $$1.b(auw.c.b(this));
      return crl.a($$0, $$1, $$2);
   }
}
