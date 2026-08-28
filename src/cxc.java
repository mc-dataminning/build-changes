import java.util.List;

public class cxc extends cvx {
   public cxc(cvx.a $$0) {
      super($$0);
   }

   public static czd b() {
      jr<die> $$0 = ly.a(ly.e);
      return new czd(
         List.of(czd.a.a(ju.a(dig.bs.p()), 15.0F), czd.a.b($$0.b(axa.P), 15.0F), czd.a.b($$0.b(axa.a), 5.0F), czd.a.b(ju.a(dig.ff.p(), dig.fg.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cwb $$0, dfb $$1, dvj $$2, jh $$3, bva $$4) {
      if (!$$1.C && !$$2.a(axa.aL)) {
         $$0.a(1, $$4, bum.a);
      }

      return $$2.a(axa.P)
         || $$2.a(dig.bs)
         || $$2.a(dig.bt)
         || $$2.a(dig.bu)
         || $$2.a(dig.bv)
         || $$2.a(dig.sG)
         || $$2.a(dig.ff)
         || $$2.a(dig.fI)
         || $$2.a(axa.a);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dls $$5 && !$$5.q($$3)) {
         com $$6 = $$0.o();
         cwb $$7 = $$0.n();
         if ($$6 instanceof aro) {
            ao.N.a((aro)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awl.lo, awm.e, 1.0F, 1.0F);
         dvj $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(eag.c, $$2, eag.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bva.d($$0.p()));
         }

         return bsd.a;
      }

      return super.a($$0);
   }
}
