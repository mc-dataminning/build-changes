import java.util.List;

public class cvb extends ctx {
   public cvb(ctx.a $$0) {
      super($$0);
   }

   public static cxg h() {
      return new cxg(List.of(cxg.a.a(List.of(dfj.bs), 15.0F), cxg.a.b(avw.O, 15.0F), cxg.a.b(avw.a, 5.0F), cxg.a.b(List.of(dfj.ff, dfj.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cuc $$0, dcf $$1, dsk $$2, ja $$3, btb $$4) {
      if (!$$1.B && !$$2.a(avw.aK)) {
         $$0.a(1, $$4, bsn.a);
      }

      return $$2.a(avw.O)
         || $$2.a(dfj.bs)
         || $$2.a(dfj.bt)
         || $$2.a(dfj.bu)
         || $$2.a(dfj.bv)
         || $$2.a(dfj.sG)
         || $$2.a(dfj.ff)
         || $$2.a(dfj.fI)
         || $$2.a(avw.a);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      if ($$3.b() instanceof diw $$5 && !$$5.o($$3)) {
         cmk $$6 = $$0.o();
         cuc $$7 = $$0.n();
         if ($$6 instanceof aqn) {
            am.N.a((aqn)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avh.lp, avi.e, 1.0F, 1.0F);
         dsk $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dxg.c, $$2, dxg.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btb.d($$0.p()));
         }

         return bqg.a($$1.B);
      }

      return super.a($$0);
   }
}
