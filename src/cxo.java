import java.util.List;

public class cxo extends cwj {
   public cxo(cwj.a $$0) {
      super($$0);
   }

   public static czp b() {
      js<djk> $$0 = mb.a(mb.e);
      return new czp(
         List.of(czp.a.a(jv.a(djm.bz.p()), 15.0F), czp.a.b($$0.b(awo.Q), 15.0F), czp.a.b($$0.b(awo.a), 5.0F), czp.a.b(jv.a(djm.ft.p(), djm.fu.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cwn $$0, dgg $$1, dwv $$2, ji $$3, bvf $$4) {
      if (!$$1.C && !$$2.a(awo.aN)) {
         $$0.a(1, $$4, bur.a);
      }

      return $$2.a(awo.Q)
         || $$2.a(djm.bz)
         || $$2.a(djm.bA)
         || $$2.a(djm.bB)
         || $$2.a(djm.bC)
         || $$2.a(djm.ti)
         || $$2.a(djm.ft)
         || $$2.a(djm.gd)
         || $$2.a(awo.a);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dna $$5 && !$$5.q($$3)) {
         cov $$6 = $$0.o();
         cwn $$7 = $$0.n();
         if ($$6 instanceof ard) {
            ap.N.a((ard)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, avz.lN, awa.e, 1.0F, 1.0F);
         dwv $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ebr.c, $$2, ebr.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bvf.d($$0.p()));
         }

         return bsi.a;
      }

      return super.a($$0);
   }
}
