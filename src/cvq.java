import java.util.List;

public class cvq extends cuj {
   public cvq(cuj.a $$0) {
      super($$0);
   }

   public static cxv h() {
      return new cxv(List.of(cxv.a.a(List.of(dfy.bs), 15.0F), cxv.a.b(awd.O, 15.0F), cxv.a.b(awd.a, 5.0F), cxv.a.b(List.of(dfy.ff, dfy.fg), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cuo $$0, dcu $$1, dta $$2, jd $$3, btl $$4) {
      if (!$$1.B && !$$2.a(awd.aK)) {
         $$0.a(1, $$4, bsx.a);
      }

      return $$2.a(awd.O)
         || $$2.a(dfy.bs)
         || $$2.a(dfy.bt)
         || $$2.a(dfy.bu)
         || $$2.a(dfy.bv)
         || $$2.a(dfy.sG)
         || $$2.a(dfy.ff)
         || $$2.a(dfy.fI)
         || $$2.a(awd.a);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      if ($$3.b() instanceof djl $$5 && !$$5.o($$3)) {
         cmv $$6 = $$0.o();
         cuo $$7 = $$0.n();
         if ($$6 instanceof aqu) {
            an.N.a((aqu)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avo.lp, avp.e, 1.0F, 1.0F);
         dta $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dxw.c, $$2, dxw.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, btl.d($$0.p()));
         }

         return bqq.a($$1.B);
      }

      return super.a($$0);
   }
}
