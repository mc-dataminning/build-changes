import java.util.List;

public class cuv extends cwi {
   public cuv(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      List<bue> $$3 = $$0.a(bue.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof cjv);
      cwm $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bue $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.cD, awo.g, 1.0F, 1.0F);
         $$0.a($$1, ear.y, $$1.dt());
         if ($$1 instanceof arq $$6) {
            ao.T.a($$6, $$4, $$5);
         }

         return bsk.a.a(this.a($$4, $$1, new cwm(cwq.vF)));
      } else {
         ezu $$7 = a($$0, $$1, deu.b.b);
         if ($$7.d() == ezw.a.a) {
            return bsk.e;
         } else {
            if ($$7.d() == ezw.a.b) {
               jh $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsk.e;
               }

               if ($$0.b_($$8).a(axi.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awn.cC, awo.g, 1.0F, 1.0F);
                  $$0.a($$1, ear.y, $$8);
                  return bsk.a.a(this.a($$4, $$1, cyl.a(cwq.sC, cym.a)));
               }
            }

            return bsk.e;
         }
      }
   }

   protected cwm a(cwm $$0, cou $$1, cwm $$2) {
      $$1.b(awx.c.b(this));
      return cwp.a($$0, $$1, $$2);
   }
}
