import java.util.List;

public class crs extends ctl {
   public crs(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      List<brs> $$3 = $$0.a(brs.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof chc);
      ctq $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         brs $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avi.cD, avj.g, 1.0F, 1.0F);
         $$0.a($$1, dvw.y, $$1.dn());
         if ($$1 instanceof aqo $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bpx.a(this.a($$4, $$1, new ctq(ctt.vn)), $$0.x_());
      } else {
         eui $$7 = a($$0, $$1, dai.b.b);
         if ($$7.c() == euk.a.a) {
            return bpx.c($$4);
         } else {
            if ($$7.c() == euk.a.b) {
               io $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bpx.c($$4);
               }

               if ($$0.b_($$8).a(awc.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avi.cC, avj.g, 1.0F, 1.0F);
                  $$0.a($$1, dvw.y, $$8);
                  return bpx.a(this.a($$4, $$1, cvr.a(ctt.sk, cvs.a)), $$0.x_());
               }
            }

            return bpx.c($$4);
         }
      }
   }

   protected ctq a(ctq $$0, cly $$1, ctq $$2) {
      $$1.b(avs.c.b(this));
      return cts.a($$0, $$1, $$2);
   }
}
