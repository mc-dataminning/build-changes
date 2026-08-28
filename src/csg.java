import java.util.List;

public class csg extends cty {
   public csg(cty.a $$0) {
      super($$0);
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      List<bsd> $$3 = $$0.a(bsd.class, $$1.cM().g(2.0), $$0x -> $$0x != null && $$0x.bF() && $$0x.q() instanceof cho);
      cud $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bsd $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dw(), $$1.dy(), $$1.dC(), avh.cD, avi.g, 1.0F, 1.0F);
         $$0.a($$1, dxh.y, $$1.dp());
         if ($$1 instanceof aqn $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bqi.a(this.a($$4, $$1, new cud(cug.vn)), $$0.x_());
      } else {
         ewd $$7 = a($$0, $$1, dbp.b.b);
         if ($$7.c() == ewf.a.a) {
            return bqi.c($$4);
         } else {
            if ($$7.c() == ewf.a.b) {
               ja $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqi.c($$4);
               }

               if ($$0.b_($$8).a(awc.a)) {
                  $$0.a($$1, $$1.dw(), $$1.dy(), $$1.dC(), avh.cC, avi.g, 1.0F, 1.0F);
                  $$0.a($$1, dxh.y, $$8);
                  return bqi.a(this.a($$4, $$1, cwe.a(cug.sk, cwf.a)), $$0.x_());
               }
            }

            return bqi.c($$4);
         }
      }
   }

   protected cud a(cud $$0, cml $$1, cud $$2) {
      $$1.b(avr.c.b(this));
      return cuf.a($$0, $$1, $$2);
   }
}
