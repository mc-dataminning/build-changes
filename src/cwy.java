import java.util.List;

public class cwy extends cvt {
   public cwy(cvt.a $$0) {
      super($$0);
   }

   public static cyx c() {
      jq<dhy> $$0 = lx.a(lx.e);
      return new cyx(
         List.of(cyx.a.a(jt.a(dia.bs.p()), 15.0F), cyx.a.b($$0.b(awz.P), 15.0F), cyx.a.b($$0.b(awz.a), 5.0F), cyx.a.b(jt.a(dia.ff.p(), dia.fg.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cvx $$0, dev $$1, dvd $$2, jg $$3, buv $$4) {
      if (!$$1.C && !$$2.a(awz.aL)) {
         $$0.a(1, $$4, buh.a);
      }

      return $$2.a(awz.P)
         || $$2.a(dia.bs)
         || $$2.a(dia.bt)
         || $$2.a(dia.bu)
         || $$2.a(dia.bv)
         || $$2.a(dia.sG)
         || $$2.a(dia.ff)
         || $$2.a(dia.fI)
         || $$2.a(awz.a);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dlm $$5 && !$$5.q($$3)) {
         coh $$6 = $$0.o();
         cvx $$7 = $$0.n();
         if ($$6 instanceof arn) {
            an.N.a((arn)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awk.lo, awl.e, 1.0F, 1.0F);
         dvd $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(eaa.c, $$2, eaa.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, buv.d($$0.p()));
         }

         return bry.a;
      }

      return super.a($$0);
   }
}
