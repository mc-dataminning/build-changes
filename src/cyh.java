import java.util.List;

public class cyh extends cxc {
   public cyh(cxc.a $$0) {
      super($$0);
   }

   public static dai b() {
      jr<dkd> $$0 = ma.a(ma.e);
      return new dai(
         List.of(dai.a.a(ju.a(dkf.bz.p()), 15.0F), dai.a.b($$0.b(axk.Q), 15.0F), dai.a.b($$0.b(axk.a), 5.0F), dai.a.b(ju.a(dkf.ft.p(), dkf.fu.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cxg $$0, dgz $$1, dxo $$2, jh $$3, bvx $$4) {
      if (!$$1.C && !$$2.a(axk.aN)) {
         $$0.a(1, $$4, bvj.a);
      }

      return $$2.a(axk.Q)
         || $$2.a(dkf.bz)
         || $$2.a(dkf.bA)
         || $$2.a(dkf.bB)
         || $$2.a(dkf.bC)
         || $$2.a(dkf.ti)
         || $$2.a(dkf.ft)
         || $$2.a(dkf.gd)
         || $$2.a(axk.a);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnt $$5 && !$$5.q($$3)) {
         cpo $$6 = $$0.o();
         cxg $$7 = $$0.n();
         if ($$6 instanceof ary) {
            ao.N.a((ary)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awv.lN, aww.e, 1.0F, 1.0F);
         dxo $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(eck.c, $$2, eck.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bvx.d($$0.p()));
         }

         return bta.a;
      }

      return super.a($$0);
   }
}
