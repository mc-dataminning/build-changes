import java.util.List;

public class cxd extends cyo {
   public cxd(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      List<bvs> $$3 = $$0.a(bvs.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bK() && $$0x.o() instanceof clq);
      cys $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bvs $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awl.cD, awm.g, 1.0F, 1.0F);
         $$0.a($$1, eeo.y, $$1.dt());
         if ($$1 instanceof arp $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bty.a.a(this.a($$4, $$1, new cys(cyw.wr)));
      } else {
         fds $$7 = a($$0, $$1, dhy.b.b);
         if ($$7.d() == fdu.a.a) {
            return bty.e;
         } else {
            if ($$7.d() == fdu.a.b) {
               iu $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bty.e;
               }

               if ($$0.b_($$8).a(axf.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awl.cC, awm.g, 1.0F, 1.0F);
                  $$0.a($$1, eeo.y, $$8);
                  return bty.a.a(this.a($$4, $$1, dao.a(cyw.tm, dap.a)));
               }
            }

            return bty.e;
         }
      }
   }

   protected cys a(cys $$0, cqs $$1, cys $$2) {
      $$1.b(awv.c.b(this));
      return cyv.a($$0, $$1, $$2);
   }
}
