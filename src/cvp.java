import java.util.List;

public class cvp extends cul {
   public cvp(cul.a $$0) {
      super($$0);
   }

   public static cxv h() {
      return new cxv(List.of(cxv.a.a(List.of(dfc.bs), 15.0F), cxv.a.b(awp.O, 15.0F), cxv.a.b(awp.a, 5.0F), cxv.a.b(List.of(dfc.ff, dfc.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cuq $$0, dbz $$1, dsd $$2, iz $$3, btq $$4) {
      if (!$$1.B && !$$2.a(awp.aK)) {
         $$0.a(1, $$4, btc.a);
      }

      return $$2.a(awp.O)
         || $$2.a(dfc.bs)
         || $$2.a(dfc.bt)
         || $$2.a(dfc.bu)
         || $$2.a(dfc.bv)
         || $$2.a(dfc.sG)
         || $$2.a(dfc.ff)
         || $$2.a(dfc.fI)
         || $$2.a(awp.a);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dip $$5 && !$$5.o($$3)) {
         cmy $$6 = $$0.o();
         cuq $$7 = $$0.n();
         if ($$6 instanceof arg) {
            am.N.a((arg)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awa.lp, awb.e, 1.0F, 1.0F);
         dsd $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dww.c, $$2, dww.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btq.d($$0.p()));
         }

         return bqv.a($$1.B);
      }

      return super.a($$0);
   }
}
