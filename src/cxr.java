import java.util.List;

public class cxr extends cwm {
   public cxr(cwm.a $$0) {
      super($$0);
   }

   public static czs b() {
      js<djn> $$0 = mb.a(mb.e);
      return new czs(
         List.of(czs.a.a(jv.a(djp.bz.p()), 15.0F), czs.a.b($$0.b(awp.Q), 15.0F), czs.a.b($$0.b(awp.a), 5.0F), czs.a.b(jv.a(djp.ft.p(), djp.fu.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cwq $$0, dgj $$1, dwy $$2, ji $$3, bvi $$4) {
      if (!$$1.C && !$$2.a(awp.aN)) {
         $$0.a(1, $$4, buu.a);
      }

      return $$2.a(awp.Q)
         || $$2.a(djp.bz)
         || $$2.a(djp.bA)
         || $$2.a(djp.bB)
         || $$2.a(djp.bC)
         || $$2.a(djp.ti)
         || $$2.a(djp.ft)
         || $$2.a(djp.gd)
         || $$2.a(awp.a);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwy $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnd $$5 && !$$5.q($$3)) {
         coy $$6 = $$0.o();
         cwq $$7 = $$0.n();
         if ($$6 instanceof are) {
            ap.N.a((are)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awa.lN, awb.e, 1.0F, 1.0F);
         dwy $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ebu.c, $$2, ebu.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bvi.d($$0.p()));
         }

         return bsl.a;
      }

      return super.a($$0);
   }
}
