import java.util.List;

public class cvq extends cum {
   public cvq(cum.a $$0) {
      super($$0);
   }

   public static cxw h() {
      return new cxw(List.of(cxw.a.a(List.of(dfd.bs), 15.0F), cxw.a.b(awp.O, 15.0F), cxw.a.b(awp.a, 5.0F), cxw.a.b(List.of(dfd.ff, dfd.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cur $$0, dca $$1, dse $$2, iz $$3, btr $$4) {
      if (!$$1.B && !$$2.a(awp.aK)) {
         $$0.a(1, $$4, btd.a);
      }

      return $$2.a(awp.O)
         || $$2.a(dfd.bs)
         || $$2.a(dfd.bt)
         || $$2.a(dfd.bu)
         || $$2.a(dfd.bv)
         || $$2.a(dfd.sG)
         || $$2.a(dfd.ff)
         || $$2.a(dfd.fI)
         || $$2.a(awp.a);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      if ($$3.b() instanceof diq $$5 && !$$5.o($$3)) {
         cmz $$6 = $$0.o();
         cur $$7 = $$0.n();
         if ($$6 instanceof arg) {
            am.N.a((arg)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awa.lp, awb.e, 1.0F, 1.0F);
         dse $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dwx.c, $$2, dwx.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btr.d($$0.p()));
         }

         return bqw.a($$1.B);
      }

      return super.a($$0);
   }
}
