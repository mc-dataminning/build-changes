import java.util.List;

public class cvc extends cty {
   public cvc(cty.a $$0) {
      super($$0);
   }

   public static cxh h() {
      return new cxh(List.of(cxh.a.a(List.of(dfk.bs), 15.0F), cxh.a.b(avw.O, 15.0F), cxh.a.b(avw.a, 5.0F), cxh.a.b(List.of(dfk.ff, dfk.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cud $$0, dcg $$1, dsl $$2, ja $$3, btc $$4) {
      if (!$$1.B && !$$2.a(avw.aK)) {
         $$0.a(1, $$4, bso.a);
      }

      return $$2.a(avw.O)
         || $$2.a(dfk.bs)
         || $$2.a(dfk.bt)
         || $$2.a(dfk.bu)
         || $$2.a(dfk.bv)
         || $$2.a(dfk.sG)
         || $$2.a(dfk.ff)
         || $$2.a(dfk.fI)
         || $$2.a(avw.a);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dix $$5 && !$$5.o($$3)) {
         cml $$6 = $$0.o();
         cud $$7 = $$0.n();
         if ($$6 instanceof aqn) {
            am.N.a((aqn)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avh.lp, avi.e, 1.0F, 1.0F);
         dsl $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dxh.c, $$2, dxh.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btc.d($$0.p()));
         }

         return bqh.a($$1.B);
      }

      return super.a($$0);
   }
}
