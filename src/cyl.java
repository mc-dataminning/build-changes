import java.util.List;

public class cyl extends cxg {
   public cyl(cxg.a $$0) {
      super($$0);
   }

   public static dam b() {
      jr<dke> $$0 = ma.a(ma.e);
      return new dam(
         List.of(dam.a.a(ju.a(dkg.bz.p()), 15.0F), dam.a.b($$0.b(axu.Q), 15.0F), dam.a.b($$0.b(axu.a), 5.0F), dam.a.b(ju.a(dkg.ft.p(), dkg.fu.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cxk $$0, dha $$1, dxn $$2, jh $$3, bwb $$4) {
      if (!$$1.C && !$$2.a(axu.aN)) {
         $$0.a(1, $$4, bvn.a);
      }

      return $$2.a(axu.Q)
         || $$2.a(dkg.bz)
         || $$2.a(dkg.bA)
         || $$2.a(dkg.bB)
         || $$2.a(dkg.bC)
         || $$2.a(dkg.tb)
         || $$2.a(dkg.ft)
         || $$2.a(dkg.fW)
         || $$2.a(axu.a);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnu $$5 && !$$5.q($$3)) {
         cps $$6 = $$0.o();
         cxk $$7 = $$0.n();
         if ($$6 instanceof asi) {
            ao.N.a((asi)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, axf.lG, axg.e, 1.0F, 1.0F);
         dxn $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ecj.c, $$2, ecj.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bwb.d($$0.p()));
         }

         return bte.a;
      }

      return super.a($$0);
   }
}
