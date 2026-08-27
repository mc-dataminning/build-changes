import java.util.List;

public class cun extends ctj {
   public cun(ctj.a $$0) {
      super($$0);
   }

   public static cwt h() {
      return new cwt(List.of(cwt.a.a(List.of(dea.bs), 15.0F), cwt.a.b(avw.O, 15.0F), cwt.a.b(avw.a, 5.0F), cwt.a.b(List.of(dea.ff, dea.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cto $$0, dax $$1, drb $$2, io $$3, bso $$4) {
      if (!$$1.B && !$$2.a(avw.aK)) {
         $$0.a(1, $$4, bsb.a);
      }

      return $$2.a(avw.O)
         || $$2.a(dea.bs)
         || $$2.a(dea.bt)
         || $$2.a(dea.bu)
         || $$2.a(dea.bv)
         || $$2.a(dea.sG)
         || $$2.a(dea.ff)
         || $$2.a(dea.fI)
         || $$2.a(avw.a);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dhn $$5 && !$$5.o($$3)) {
         clw $$6 = $$0.o();
         cto $$7 = $$0.n();
         if ($$6 instanceof aqn) {
            am.N.a((aqn)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avh.lp, avi.e, 1.0F, 1.0F);
         drb $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dvu.c, $$2, dvu.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bso.d($$0.p()));
         }

         return bpu.a($$1.B);
      }

      return super.a($$0);
   }
}
