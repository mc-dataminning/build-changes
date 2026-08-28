import java.util.List;

public class csq extends cuj {
   public csq(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      List<bsp> $$3 = $$0.a(bsp.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bD() && $$0x.q() instanceof cia);
      cuo $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bsp $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avz.cD, awa.g, 1.0F, 1.0F);
         $$0.a($$1, dwu.y, $$1.dn());
         if ($$1 instanceof arf $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqu.a(this.a($$4, $$1, new cuo(cur.vn)), $$0.x_());
      } else {
         evm $$7 = a($$0, $$1, dbg.b.b);
         if ($$7.c() == evo.a.a) {
            return bqu.c($$4);
         } else {
            if ($$7.c() == evo.a.b) {
               iz $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqu.c($$4);
               }

               if ($$0.b_($$8).a(awu.a)) {
                  $$0.a($$1, $$1.du(), $$1.dw(), $$1.dA(), avz.cC, awa.g, 1.0F, 1.0F);
                  $$0.a($$1, dwu.y, $$8);
                  return bqu.a(this.a($$4, $$1, cwp.a(cur.sk, cwq.a)), $$0.x_());
               }
            }

            return bqu.c($$4);
         }
      }
   }

   protected cuo a(cuo $$0, cmw $$1, cuo $$2) {
      $$1.b(awj.c.b(this));
      return cuq.a($$0, $$1, $$2);
   }
}
