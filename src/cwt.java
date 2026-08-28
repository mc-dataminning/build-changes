import java.util.List;

public class cwt extends cvn {
   public cwt(cvn.a $$0) {
      super($$0);
   }

   public static cyy c() {
      jp<dhm> $$0 = lv.a(lv.e);
      return new cyy(
         List.of(cyy.a.a(js.a(dho.bs.r()), 15.0F), cyy.a.b($$0.b(awv.P), 15.0F), cyy.a.b($$0.b(awv.a), 5.0F), cyy.a.b(js.a(dho.ff.r(), dho.fg.r()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cvs $$0, dej $$1, dus $$2, jf $$3, bun $$4) {
      if (!$$1.B && !$$2.a(awv.aL)) {
         $$0.a(1, $$4, btz.a);
      }

      return $$2.a(awv.P)
         || $$2.a(dho.bs)
         || $$2.a(dho.bt)
         || $$2.a(dho.bu)
         || $$2.a(dho.bv)
         || $$2.a(dho.sG)
         || $$2.a(dho.ff)
         || $$2.a(dho.fI)
         || $$2.a(awv.a);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dlb $$5 && !$$5.q($$3)) {
         cnx $$6 = $$0.o();
         cvs $$7 = $$0.n();
         if ($$6 instanceof ark) {
            an.N.a((ark)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awg.lq, awh.e, 1.0F, 1.0F);
         dus $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(dzp.c, $$2, dzp.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bun.d($$0.p()));
         }

         return brs.a;
      }

      return super.a($$0);
   }
}
