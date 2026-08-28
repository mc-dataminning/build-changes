import java.util.List;

public class czr extends cyo {
   public czr(cyo.a $$0) {
      super($$0);
   }

   public static dbv a() {
      jf<dlu> $$0 = mf.a(mf.e);
      return new dbv(
         List.of(dbv.a.a(ji.a(dlw.bz.p()), 15.0F), dbv.a.b($$0.b(axa.Q), 15.0F), dbv.a.b($$0.b(axa.a), 5.0F), dbv.a.b(ji.a(dlw.ft.p(), dlw.fu.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dpl $$5 && !$$5.q($$3)) {
         cqs $$6 = $$0.o();
         cys $$7 = $$0.n();
         if ($$6 instanceof arp) {
            ap.N.a((arp)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awl.lN, awm.e, 1.0F, 1.0F);
         dzo $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(eeo.c, $$2, eeo.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bwz.d($$0.p()));
         }

         return bty.a;
      }

      return super.a($$0);
   }
}
