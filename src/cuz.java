import java.util.List;

public class cuz extends ctv {
   public cuz(ctv.a $$0) {
      super($$0);
   }

   public static cxe h() {
      return new cxe(List.of(cxe.a.a(List.of(dfh.bs), 15.0F), cxe.a.b(avu.O, 15.0F), cxe.a.b(avu.a, 5.0F), cxe.a.b(List.of(dfh.ff, dfh.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cua $$0, dcd $$1, dsh $$2, ja $$3, bsy $$4) {
      if (!$$1.B && !$$2.a(avu.aK)) {
         $$0.a(1, $$4, bsk.a);
      }

      return $$2.a(avu.O)
         || $$2.a(dfh.bs)
         || $$2.a(dfh.bt)
         || $$2.a(dfh.bu)
         || $$2.a(dfh.bv)
         || $$2.a(dfh.sG)
         || $$2.a(dfh.ff)
         || $$2.a(dfh.fI)
         || $$2.a(avu.a);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      if ($$3.b() instanceof diu $$5 && !$$5.o($$3)) {
         cmh $$6 = $$0.o();
         cua $$7 = $$0.n();
         if ($$6 instanceof aql) {
            am.N.a((aql)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avf.lp, avg.e, 1.0F, 1.0F);
         dsh $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dxa.c, $$2, dxa.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bsy.d($$0.p()));
         }

         return bqd.a($$1.B);
      }

      return super.a($$0);
   }
}
