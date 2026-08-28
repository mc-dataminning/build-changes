import java.util.List;

public class cto extends cvg {
   public cto(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      List<bte> $$3 = $$0.a(bte.class, $$1.cO().g(2.0), $$0x -> $$0x != null && $$0x.bI() && $$0x.q() instanceof cis);
      cvl $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bte $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awd.cD, awe.g, 1.0F, 1.0F);
         $$0.a($$1, dyx.y, $$1.dq());
         if ($$1 instanceof arh $$6) {
            an.T.a($$6, $$4, $$5);
         }

         return brk.a.a(this.a($$4, $$1, new cvl(cvo.vp)));
      } else {
         eya $$7 = a($$0, $$1, dda.b.b);
         if ($$7.c() == eyc.a.a) {
            return brk.e;
         } else {
            if ($$7.c() == eyc.a.b) {
               je $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return brk.e;
               }

               if ($$0.b_($$8).a(awy.a)) {
                  $$0.a($$1, $$1.dx(), $$1.dz(), $$1.dD(), awd.cC, awe.g, 1.0F, 1.0F);
                  $$0.a($$1, dyx.y, $$8);
                  return brk.a.a(this.a($$4, $$1, cxn.a(cvo.sl, cxo.a)));
               }
            }

            return brk.e;
         }
      }
   }

   protected cvl a(cvl $$0, cnp $$1, cvl $$2) {
      $$1.b(awn.c.b(this));
      return cvn.a($$0, $$1, $$2);
   }
}
