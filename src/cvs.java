import java.util.List;

public class cvs extends cul {
   public cvs(cul.a $$0) {
      super($$0);
   }

   public static cxx h() {
      return new cxx(List.of(cxx.a.a(List.of(dga.bs), 15.0F), cxx.a.b(awe.P, 15.0F), cxx.a.b(awe.a, 5.0F), cxx.a.b(List.of(dga.ff, dga.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cuq $$0, dcw $$1, dtc $$2, jd $$3, btn $$4) {
      if (!$$1.B && !$$2.a(awe.aL)) {
         $$0.a(1, $$4, bsy.a);
      }

      return $$2.a(awe.P)
         || $$2.a(dga.bs)
         || $$2.a(dga.bt)
         || $$2.a(dga.bu)
         || $$2.a(dga.bv)
         || $$2.a(dga.sG)
         || $$2.a(dga.ff)
         || $$2.a(dga.fI)
         || $$2.a(awe.a);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if ($$3.b() instanceof djn $$5 && !$$5.o($$3)) {
         cmx $$6 = $$0.o();
         cuq $$7 = $$0.n();
         if ($$6 instanceof aqv) {
            an.N.a((aqv)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avp.lp, avq.e, 1.0F, 1.0F);
         dtc $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dxz.c, $$2, dxz.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btn.d($$0.p()));
         }

         return bqr.a($$1.B);
      }

      return super.a($$0);
   }
}
