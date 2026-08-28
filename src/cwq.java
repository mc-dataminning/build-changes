import java.util.List;

public class cwq extends cvk {
   public cwq(cvk.a $$0) {
      super($$0);
   }

   public static cyv c() {
      jo<dhj> $$0 = lu.a(lu.e);
      return new cyv(
         List.of(cyv.a.a(jr.a(dhl.bs.s()), 15.0F), cyv.a.b($$0.b(awt.P), 15.0F), cyv.a.b($$0.b(awt.a), 5.0F), cyv.a.b(jr.a(dhl.ff.s(), dhl.fg.s()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cvp $$0, deg $$1, duo $$2, je $$3, buk $$4) {
      if (!$$1.B && !$$2.a(awt.aL)) {
         $$0.a(1, $$4, btw.a);
      }

      return $$2.a(awt.P)
         || $$2.a(dhl.bs)
         || $$2.a(dhl.bt)
         || $$2.a(dhl.bu)
         || $$2.a(dhl.bv)
         || $$2.a(dhl.sG)
         || $$2.a(dhl.ff)
         || $$2.a(dhl.fI)
         || $$2.a(awt.a);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dky $$5 && !$$5.q($$3)) {
         cnu $$6 = $$0.o();
         cvp $$7 = $$0.n();
         if ($$6 instanceof ari) {
            an.N.a((ari)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awe.lq, awf.e, 1.0F, 1.0F);
         duo $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(dzl.c, $$2, dzl.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, buk.d($$0.p()));
         }

         return brp.a;
      }

      return super.a($$0);
   }
}
