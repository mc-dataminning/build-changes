import java.util.List;

public class cnp extends cpl {
   public cnp(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      List<boc> $$3 = $$0.a(boc.class, $$1.cE().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof cdf);
      cpq $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         boc $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), atp.cw, atq.g, 1.0F, 1.0F);
         $$0.a($$1, dqr.y, $$1.dh());
         if ($$1 instanceof apb $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bmm.a(this.a($$4, $$1, new cpq(cpt.vj)), $$0.y_());
      } else {
         eor $$7 = a($$0, $$1, cvn.b.b);
         if ($$7.c() == eot.a.a) {
            return bmm.c($$4);
         } else {
            if ($$7.c() == eot.a.b) {
               ib $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bmm.c($$4);
               }

               if ($$0.b_($$8).a(auj.a)) {
                  $$0.a($$1, $$1.do(), $$1.dq(), $$1.du(), atp.cv, atq.g, 1.0F, 1.0F);
                  $$0.a($$1, dqr.y, $$8);
                  return bmm.a(this.a($$4, $$1, cro.a(new cpq(cpt.sj), crp.c)), $$0.y_());
               }
            }

            return bmm.c($$4);
         }
      }
   }

   protected cpq a(cpq $$0, cia $$1, cpq $$2) {
      $$1.b(atz.c.b(this));
      return cps.a($$0, $$1, $$2);
   }
}
