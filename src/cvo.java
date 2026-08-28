import java.util.List;

public class cvo extends cuk {
   public cvo(cuk.a $$0) {
      super($$0);
   }

   public static cxu h() {
      return new cxu(List.of(cxu.a.a(List.of(dfb.bs), 15.0F), cxu.a.b(awp.O, 15.0F), cxu.a.b(awp.a, 5.0F), cxu.a.b(List.of(dfb.ff, dfb.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cup $$0, dby $$1, dsc $$2, iz $$3, btp $$4) {
      if (!$$1.B && !$$2.a(awp.aK)) {
         $$0.a(1, $$4, btb.a);
      }

      return $$2.a(awp.O)
         || $$2.a(dfb.bs)
         || $$2.a(dfb.bt)
         || $$2.a(dfb.bu)
         || $$2.a(dfb.bv)
         || $$2.a(dfb.sG)
         || $$2.a(dfb.ff)
         || $$2.a(dfb.fI)
         || $$2.a(awp.a);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dio $$5 && !$$5.o($$3)) {
         cmx $$6 = $$0.o();
         cup $$7 = $$0.n();
         if ($$6 instanceof arg) {
            am.N.a((arg)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awa.lp, awb.e, 1.0F, 1.0F);
         dsc $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dwv.c, $$2, dwv.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btp.d($$0.p()));
         }

         return bqu.a($$1.B);
      }

      return super.a($$0);
   }
}
