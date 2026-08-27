import java.util.List;

public class cgt extends cir {
   public cgt(cir.a $$0) {
      super($$0);
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      List<bid> $$3 = $$0.a(bid.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof bwy);
      ciw $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bid $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aou.cj, aov.g, 1.0F, 1.0F);
         $$0.a($$1, dji.y, $$1.di());
         if ($$1 instanceof akj $$6) {
            ai.Q.a($$6, $$4, $$5);
         }

         return bgp.a(this.a($$4, $$1, new ciw(ciz.ut)), $$0.r_());
      } else {
         ehb $$7 = a($$0, $$1, cot.b.b);
         if ($$7.c() == ehd.a.a) {
            return bgp.c($$4);
         } else {
            if ($$7.c() == ehd.a.b) {
               gv $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bgp.c($$4);
               }

               if ($$0.b_($$8).a(apo.a)) {
                  $$0.a($$1, $$1.dp(), $$1.dr(), $$1.dv(), aou.ci, aov.g, 1.0F, 1.0F);
                  $$0.a($$1, dji.y, $$8);
                  return bgp.a(this.a($$4, $$1, ckv.a(new ciw(ciz.rv), ckw.c)), $$0.r_());
               }
            }

            return bgp.c($$4);
         }
      }
   }

   protected ciw a(ciw $$0, cbl $$1, ciw $$2) {
      $$1.b(ape.c.b(this));
      return ciy.a($$0, $$1, $$2);
   }
}
