import java.util.List;

public class cwn extends cvg {
   public cwn(cvg.a $$0) {
      super($$0);
   }

   public static cyq h() {
      jo<dgv> $$0 = lu.a(lu.e);
      return new cyq(
         List.of(cyq.a.a(jr.a(dgx.bs.s()), 15.0F), cyq.a.b($$0.b(aws.P), 15.0F), cyq.a.b($$0.b(aws.a), 5.0F), cyq.a.b(jr.a(dgx.ff.s(), dgx.fg.s()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cvl $$0, dds $$1, dua $$2, je $$3, buf $$4) {
      if (!$$1.B && !$$2.a(aws.aL)) {
         $$0.a(1, $$4, btr.a);
      }

      return $$2.a(aws.P)
         || $$2.a(dgx.bs)
         || $$2.a(dgx.bt)
         || $$2.a(dgx.bu)
         || $$2.a(dgx.bv)
         || $$2.a(dgx.sG)
         || $$2.a(dgx.ff)
         || $$2.a(dgx.fI)
         || $$2.a(aws.a);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dkk $$5 && !$$5.q($$3)) {
         cnp $$6 = $$0.o();
         cvl $$7 = $$0.n();
         if ($$6 instanceof arh) {
            an.N.a((arh)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awd.lq, awe.e, 1.0F, 1.0F);
         dua $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(dyx.c, $$2, dyx.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, buf.d($$0.p()));
         }

         return brk.a;
      }

      return super.a($$0);
   }
}
