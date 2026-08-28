import java.util.List;

public class csc extends ctv {
   public csc(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      List<brz> $$3 = $$0.a(brz.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof chk);
      cua $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         brz $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avf.cD, avg.g, 1.0F, 1.0F);
         $$0.a($$1, dxa.y, $$1.dn());
         if ($$1 instanceof aql $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqe.a(this.a($$4, $$1, new cua(cud.vn)), $$0.x_());
      } else {
         evv $$7 = a($$0, $$1, dbm.b.b);
         if ($$7.c() == evx.a.a) {
            return bqe.c($$4);
         } else {
            if ($$7.c() == evx.a.b) {
               ja $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqe.c($$4);
               }

               if ($$0.b_($$8).a(awa.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avf.cC, avg.g, 1.0F, 1.0F);
                  $$0.a($$1, dxa.y, $$8);
                  return bqe.a(this.a($$4, $$1, cwb.a(cud.sk, cwc.a)), $$0.x_());
               }
            }

            return bqe.c($$4);
         }
      }
   }

   protected cua a(cua $$0, cmh $$1, cua $$2) {
      $$1.b(avp.c.b(this));
      return cuc.a($$0, $$1, $$2);
   }
}
