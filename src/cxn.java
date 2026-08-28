import java.util.List;

public class cxn extends cwi {
   public cxn(cwi.a $$0) {
      super($$0);
   }

   public static czo b() {
      jr<diq> $$0 = lz.a(lz.e);
      return new czo(
         List.of(czo.a.a(ju.a(dis.bs.p()), 15.0F), czo.a.b($$0.b(axc.P), 15.0F), czo.a.b($$0.b(axc.a), 5.0F), czo.a.b(ju.a(dis.ff.p(), dis.fg.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cwm $$0, dfm $$1, dvv $$2, jh $$3, bvh $$4) {
      if (!$$1.C && !$$2.a(axc.aM)) {
         $$0.a(1, $$4, but.a);
      }

      return $$2.a(axc.P)
         || $$2.a(dis.bs)
         || $$2.a(dis.bt)
         || $$2.a(dis.bu)
         || $$2.a(dis.bv)
         || $$2.a(dis.sG)
         || $$2.a(dis.ff)
         || $$2.a(dis.fI)
         || $$2.a(axc.a);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dme $$5 && !$$5.q($$3)) {
         cou $$6 = $$0.o();
         cwm $$7 = $$0.n();
         if ($$6 instanceof arq) {
            ao.N.a((arq)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awn.lo, awo.e, 1.0F, 1.0F);
         dvv $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ear.c, $$2, ear.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bvh.d($$0.p()));
         }

         return bsk.a;
      }

      return super.a($$0);
   }
}
