import java.util.List;

public class cyq extends cxl {
   public cyq(cxl.a $$0) {
      super($$0);
   }

   public static dar b() {
      jr<dkm> $$0 = ma.a(ma.e);
      return new dar(
         List.of(dar.a.a(ju.a(dko.bz.p()), 15.0F), dar.a.b($$0.b(axu.Q), 15.0F), dar.a.b($$0.b(axu.a), 5.0F), dar.a.b(ju.a(dko.ft.p(), dko.fu.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cxp $$0, dhi $$1, dxv $$2, jh $$3, bwg $$4) {
      if (!$$1.C && !$$2.a(axu.aN)) {
         $$0.a(1, $$4, bvs.a);
      }

      return $$2.a(axu.Q)
         || $$2.a(dko.bz)
         || $$2.a(dko.bA)
         || $$2.a(dko.bB)
         || $$2.a(dko.bC)
         || $$2.a(dko.tb)
         || $$2.a(dko.ft)
         || $$2.a(dko.fW)
         || $$2.a(axu.a);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      if ($$3.b() instanceof doc $$5 && !$$5.q($$3)) {
         cpx $$6 = $$0.o();
         cxp $$7 = $$0.n();
         if ($$6 instanceof asi) {
            ao.N.a((asi)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, axf.lH, axg.e, 1.0F, 1.0F);
         dxv $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ecr.c, $$2, ecr.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bwg.d($$0.p()));
         }

         return btj.a;
      }

      return super.a($$0);
   }
}
