import java.util.List;

public class col extends cqh {
   public col(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      List<bou> $$3 = $$0.a(bou.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bA() && $$0x.r() instanceof cdy);
      cqm $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bou $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.cC, atz.g, 1.0F, 1.0F);
         $$0.a($$1, drp.y, $$1.dk());
         if ($$1 instanceof apg $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bne.a(this.a($$4, $$1, new cqm(cqp.vl)), $$0.x_());
      } else {
         epp $$7 = a($$0, $$1, cwk.b.b);
         if ($$7.c() == epr.a.a) {
            return bne.c($$4);
         } else {
            if ($$7.c() == epr.a.b) {
               ib $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bne.c($$4);
               }

               if ($$0.b_($$8).a(aus.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), aty.cB, atz.g, 1.0F, 1.0F);
                  $$0.a($$1, drp.y, $$8);
                  return bne.a(this.a($$4, $$1, csl.a(new cqm(cqp.sj), csm.c)), $$0.x_());
               }
            }

            return bne.c($$4);
         }
      }
   }

   protected cqm a(cqm $$0, ciu $$1, cqm $$2) {
      $$1.b(aui.c.b(this));
      return cqo.a($$0, $$1, $$2);
   }
}
