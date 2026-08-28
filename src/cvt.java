import java.util.List;

public class cvt extends cxg {
   public cvt(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      List<buy> $$3 = $$0.a(buy.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof ckp);
      cxk $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         buy $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), axf.cD, axg.g, 1.0F, 1.0F);
         $$0.a($$1, ecj.y, $$1.dt());
         if ($$1 instanceof asi $$6) {
            ao.T.a($$6, $$4, $$5);
         }

         return bte.a.a(this.a($$4, $$1, new cxk(cxo.wd)));
      } else {
         fbo $$7 = a($$0, $$1, dgi.b.b);
         if ($$7.d() == fbq.a.a) {
            return bte.e;
         } else {
            if ($$7.d() == fbq.a.b) {
               jh $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bte.e;
               }

               if ($$0.b_($$8).a(aya.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), axf.cC, axg.g, 1.0F, 1.0F);
                  $$0.a($$1, ecj.y, $$8);
                  return bte.a.a(this.a($$4, $$1, czj.a(cxo.sZ, czk.a)));
               }
            }

            return bte.e;
         }
      }
   }

   protected cxk a(cxk $$0, cps $$1, cxk $$2) {
      $$1.b(axp.c.b(this));
      return cxn.a($$0, $$1, $$2);
   }
}
