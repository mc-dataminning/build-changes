import java.util.List;

public class che extends cjc {
   public che(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      List<bip> $$3 = $$0.a(bip.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof bxj);
      cjh $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bip $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apf.cj, apg.g, 1.0F, 1.0F);
         $$0.a($$1, djv.y, $$1.dj());
         if ($$1 instanceof akt $$6) {
            al.Q.a($$6, $$4, $$5);
         }

         return bhb.a(this.a($$4, $$1, new cjh(cjk.ut)), $$0.w_());
      } else {
         ehl $$7 = a($$0, $$1, cpg.b.b);
         if ($$7.c() == ehn.a.a) {
            return bhb.c($$4);
         } else {
            if ($$7.c() == ehn.a.b) {
               gw $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bhb.c($$4);
               }

               if ($$0.b_($$8).a(apz.a)) {
                  $$0.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apf.ci, apg.g, 1.0F, 1.0F);
                  $$0.a($$1, djv.y, $$8);
                  return bhb.a(this.a($$4, $$1, clg.a(new cjh(cjk.rv), clh.c)), $$0.w_());
               }
            }

            return bhb.c($$4);
         }
      }
   }

   protected cjh a(cjh $$0, cbw $$1, cjh $$2) {
      $$1.b(app.c.b(this));
      return cjj.a($$0, $$1, $$2);
   }
}
