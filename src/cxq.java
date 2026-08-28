import java.util.List;

public class cxq extends cwl {
   public cxq(cwl.a $$0) {
      super($$0);
   }

   public static czr b() {
      js<djm> $$0 = mb.a(mb.e);
      return new czr(
         List.of(czr.a.a(jv.a(djo.bz.p()), 15.0F), czr.a.b($$0.b(awp.Q), 15.0F), czr.a.b($$0.b(awp.a), 5.0F), czr.a.b(jv.a(djo.ft.p(), djo.fu.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cwp $$0, dgi $$1, dwx $$2, ji $$3, bvh $$4) {
      if (!$$1.C && !$$2.a(awp.aN)) {
         $$0.a(1, $$4, but.a);
      }

      return $$2.a(awp.Q)
         || $$2.a(djo.bz)
         || $$2.a(djo.bA)
         || $$2.a(djo.bB)
         || $$2.a(djo.bC)
         || $$2.a(djo.ti)
         || $$2.a(djo.ft)
         || $$2.a(djo.gd)
         || $$2.a(awp.a);
   }

   @Override
   public bsk a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwx $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnc $$5 && !$$5.q($$3)) {
         cox $$6 = $$0.o();
         cwp $$7 = $$0.n();
         if ($$6 instanceof are) {
            ap.N.a((are)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awa.lN, awb.e, 1.0F, 1.0F);
         dwx $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ebt.c, $$2, ebt.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bvh.d($$0.p()));
         }

         return bsk.a;
      }

      return super.a($$0);
   }
}
