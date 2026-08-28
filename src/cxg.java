import java.util.List;

public class cxg extends cwb {
   public cxg(cwb.a $$0) {
      super($$0);
   }

   public static czh b() {
      jr<dij> $$0 = lz.a(lz.e);
      return new czh(
         List.of(czh.a.a(ju.a(dil.bs.p()), 15.0F), czh.a.b($$0.b(axd.P), 15.0F), czh.a.b($$0.b(axd.a), 5.0F), czh.a.b(ju.a(dil.ff.p(), dil.fg.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cwf $$0, dff $$1, dvo $$2, jh $$3, bve $$4) {
      if (!$$1.C && !$$2.a(axd.aM)) {
         $$0.a(1, $$4, buq.a);
      }

      return $$2.a(axd.P)
         || $$2.a(dil.bs)
         || $$2.a(dil.bt)
         || $$2.a(dil.bu)
         || $$2.a(dil.bv)
         || $$2.a(dil.sG)
         || $$2.a(dil.ff)
         || $$2.a(dil.fI)
         || $$2.a(axd.a);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dlx $$5 && !$$5.q($$3)) {
         cor $$6 = $$0.o();
         cwf $$7 = $$0.n();
         if ($$6 instanceof arr) {
            ao.N.a((arr)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awo.lo, awp.e, 1.0F, 1.0F);
         dvo $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(eak.c, $$2, eak.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bve.d($$0.p()));
         }

         return bsh.a;
      }

      return super.a($$0);
   }
}
