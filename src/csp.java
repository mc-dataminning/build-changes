import java.util.List;

public class csp extends cui {
   public csp(cui.a $$0) {
      super($$0);
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      List<bso> $$3 = $$0.a(bso.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof chz);
      cun $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bso $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.cD, awa.g, 1.0F, 1.0F);
         $$0.a($$1, dwt.y, $$1.dn());
         if ($$1 instanceof arf $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqt.a(this.a($$4, $$1, new cun(cuq.vn)), $$0.x_());
      } else {
         evl $$7 = a($$0, $$1, dbf.b.b);
         if ($$7.c() == evn.a.a) {
            return bqt.c($$4);
         } else {
            if ($$7.c() == evn.a.b) {
               iz $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqt.c($$4);
               }

               if ($$0.b_($$8).a(awu.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avz.cC, awa.g, 1.0F, 1.0F);
                  $$0.a($$1, dwt.y, $$8);
                  return bqt.a(this.a($$4, $$1, cwo.a(cuq.sk, cwp.a)), $$0.x_());
               }
            }

            return bqt.c($$4);
         }
      }
   }

   protected cun a(cun $$0, cmv $$1, cun $$2) {
      $$1.b(awj.c.b(this));
      return cup.a($$0, $$1, $$2);
   }
}
