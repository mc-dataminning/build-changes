import java.util.List;

public class cvo extends cuc {
   public cvo(cuc.a $$0) {
      super($$0);
   }

   public static cxw d() {
      return new cxw(List.of(cxw.a.a(List.of(dfe.cc), 15.0F), cxw.a.b(awe.O, 15.0F), cxw.a.b(awe.a, 5.0F), cxw.a.b(List.of(dfe.fX, dfe.fY), 2.0F)), 1.0F, 1);
   }

   @Override
   public boolean a(cuh $$0, dca $$1, dtc $$2, ir $$3, bso $$4) {
      if (!$$1.C && !$$2.a(awe.aM)) {
         $$0.a(1, $$4, bsc.a);
      }

      return $$2.a(awe.O)
         || $$2.a(dfe.cc)
         || $$2.a(dfe.cd)
         || $$2.a(dfe.ce)
         || $$2.a(dfe.cf)
         || $$2.a(dfe.ud)
         || $$2.a(dfe.fX)
         || $$2.a(dfe.gA)
         || $$2.a(awe.a);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if ($$3.b() instanceof div $$5 && !$$5.o($$3)) {
         cly $$6 = $$0.o();
         cuh $$7 = $$0.n();
         if ($$6 instanceof aqu) {
            an.N.a((aqu)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avo.lC, avq.e, 1.0F, 1.0F);
         dtc $$8 = $$5.n($$3);
         $$1.b($$2, $$8);
         $$1.a(dxv.c, $$2, dxv.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bso.d($$0.p()));
         }

         return bqa.a($$1.C);
      }

      return super.a($$0);
   }
}
