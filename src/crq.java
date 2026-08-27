import java.util.List;

public class crq extends ctj {
   public crq(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      List<brq> $$3 = $$0.a(brq.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof cha);
      cto $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         brq $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avh.cD, avi.g, 1.0F, 1.0F);
         $$0.a($$1, dvu.y, $$1.dn());
         if ($$1 instanceof aqn $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bpv.a(this.a($$4, $$1, new cto(ctr.vn)), $$0.x_());
      } else {
         eug $$7 = a($$0, $$1, dag.b.b);
         if ($$7.c() == eui.a.a) {
            return bpv.c($$4);
         } else {
            if ($$7.c() == eui.a.b) {
               io $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bpv.c($$4);
               }

               if ($$0.b_($$8).a(awb.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avh.cC, avi.g, 1.0F, 1.0F);
                  $$0.a($$1, dvu.y, $$8);
                  return bpv.a(this.a($$4, $$1, cvp.a(ctr.sk, cvq.a)), $$0.x_());
               }
            }

            return bpv.c($$4);
         }
      }
   }

   protected cto a(cto $$0, clw $$1, cto $$2) {
      $$1.b(avr.c.b(this));
      return ctq.a($$0, $$1, $$2);
   }
}
