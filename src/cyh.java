import java.util.List;

public class cyh extends cxd {
   public cyh(cxd.a $$0) {
      super($$0);
   }

   public static dah b() {
      js<dke> $$0 = mb.a(mb.e);
      return new dah(
         List.of(dah.a.a(jv.a(dkg.bz.p()), 15.0F), dah.a.b($$0.b(awp.Q), 15.0F), dah.a.b($$0.b(awp.a), 5.0F), dah.a.b(jv.a(dkg.ft.p(), dkg.fu.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnv $$5 && !$$5.q($$3)) {
         cpr $$6 = $$0.o();
         cxh $$7 = $$0.n();
         if ($$6 instanceof are) {
            ap.N.a((are)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awa.lN, awb.e, 1.0F, 1.0F);
         dxq $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ecp.c, $$2, ecp.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bvy.d($$0.p()));
         }

         return bsy.a;
      }

      return super.a($$0);
   }
}
