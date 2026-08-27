import java.util.List;

public class cup extends ctl {
   public cup(ctl.a $$0) {
      super($$0);
   }

   public static cwv h() {
      return new cwv(List.of(cwv.a.a(List.of(dec.bs), 15.0F), cwv.a.b(avx.O, 15.0F), cwv.a.b(avx.a, 5.0F), cwv.a.b(List.of(dec.ff, dec.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(ctq $$0, daz $$1, drd $$2, io $$3, bsq $$4) {
      if (!$$1.B && !$$2.a(avx.aK)) {
         $$0.a(1, $$4, bsd.a);
      }

      return $$2.a(avx.O)
         || $$2.a(dec.bs)
         || $$2.a(dec.bt)
         || $$2.a(dec.bu)
         || $$2.a(dec.bv)
         || $$2.a(dec.sG)
         || $$2.a(dec.ff)
         || $$2.a(dec.fI)
         || $$2.a(avx.a);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dhp $$5 && !$$5.o($$3)) {
         cly $$6 = $$0.o();
         ctq $$7 = $$0.n();
         if ($$6 instanceof aqo) {
            am.N.a((aqo)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avi.lp, avj.e, 1.0F, 1.0F);
         drd $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dvw.c, $$2, dvw.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bsq.d($$0.p()));
         }

         return bpw.a($$1.B);
      }

      return super.a($$0);
   }
}
