import java.util.List;

public class cvj extends cuf {
   public cvj(cuf.a $$0) {
      super($$0);
   }

   public static cxp h() {
      return new cxp(List.of(cxp.a.a(List.of(dew.bs), 15.0F), cxp.a.b(awl.O, 15.0F), cxp.a.b(awl.a, 5.0F), cxp.a.b(List.of(dew.ff, dew.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cuk $$0, dbt $$1, drx $$2, iz $$3, btk $$4) {
      if (!$$1.B && !$$2.a(awl.aK)) {
         $$0.a(1, $$4, bsw.a);
      }

      return $$2.a(awl.O)
         || $$2.a(dew.bs)
         || $$2.a(dew.bt)
         || $$2.a(dew.bu)
         || $$2.a(dew.bv)
         || $$2.a(dew.sG)
         || $$2.a(dew.ff)
         || $$2.a(dew.fI)
         || $$2.a(awl.a);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      drx $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dij $$5 && !$$5.o($$3)) {
         cms $$6 = $$0.o();
         cuk $$7 = $$0.n();
         if ($$6 instanceof arc) {
            am.N.a((arc)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avw.lp, avx.e, 1.0F, 1.0F);
         drx $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dwq.c, $$2, dwq.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btk.d($$0.p()));
         }

         return bqp.a($$1.B);
      }

      return super.a($$0);
   }
}
