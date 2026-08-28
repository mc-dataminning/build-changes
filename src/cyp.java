import java.util.List;

public class cyp extends cxk {
   public cyp(cxk.a $$0) {
      super($$0);
   }

   public static daq b() {
      jr<dkl> $$0 = ma.a(ma.e);
      return new daq(
         List.of(daq.a.a(ju.a(dkn.bz.p()), 15.0F), daq.a.b($$0.b(axu.Q), 15.0F), daq.a.b($$0.b(axu.a), 5.0F), daq.a.b(ju.a(dkn.ft.p(), dkn.fu.p()), 2.0F)),
         1.0F,
         1
      );
   }

   @Override
   public boolean a(cxo $$0, dhh $$1, dxu $$2, jh $$3, bwf $$4) {
      if (!$$1.C && !$$2.a(axu.aN)) {
         $$0.a(1, $$4, bvr.a);
      }

      return $$2.a(axu.Q)
         || $$2.a(dkn.bz)
         || $$2.a(dkn.bA)
         || $$2.a(dkn.bB)
         || $$2.a(dkn.bC)
         || $$2.a(dkn.tb)
         || $$2.a(dkn.ft)
         || $$2.a(dkn.fW)
         || $$2.a(axu.a);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dob $$5 && !$$5.q($$3)) {
         cpw $$6 = $$0.o();
         cxo $$7 = $$0.n();
         if ($$6 instanceof asi) {
            ao.N.a((asi)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, axf.lH, axg.e, 1.0F, 1.0F);
         dxu $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ecq.c, $$2, ecq.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bwf.d($$0.p()));
         }

         return bti.a;
      }

      return super.a($$0);
   }
}
