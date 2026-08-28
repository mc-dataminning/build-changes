import java.util.List;

public class cxp extends cwk {
   public cxp(cwk.a $$0) {
      super($$0);
   }

   public static czq b() {
      js<djl> $$0 = mb.a(mb.e);
      return new czq(
         List.of(czq.a.a(jv.a(djn.bz.p()), 15.0F), czq.a.b($$0.b(awp.Q), 15.0F), czq.a.b($$0.b(awp.a), 5.0F), czq.a.b(jv.a(djn.ft.p(), djn.fu.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cwo $$0, dgh $$1, dww $$2, ji $$3, bvg $$4) {
      if (!$$1.C && !$$2.a(awp.aN)) {
         $$0.a(1, $$4, bus.a);
      }

      return $$2.a(awp.Q)
         || $$2.a(djn.bz)
         || $$2.a(djn.bA)
         || $$2.a(djn.bB)
         || $$2.a(djn.bC)
         || $$2.a(djn.ti)
         || $$2.a(djn.ft)
         || $$2.a(djn.gd)
         || $$2.a(awp.a);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      dww $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnb $$5 && !$$5.q($$3)) {
         cow $$6 = $$0.o();
         cwo $$7 = $$0.n();
         if ($$6 instanceof are) {
            ap.N.a((are)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awa.lN, awb.e, 1.0F, 1.0F);
         dww $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ebs.c, $$2, ebs.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bvg.d($$0.p()));
         }

         return bsj.a;
      }

      return super.a($$0);
   }
}
