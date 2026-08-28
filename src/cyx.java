import java.util.List;

public class cyx extends cxu {
   public cyx(cxu.a $$0) {
      super($$0);
   }

   public static dax b() {
      jt<dku> $$0 = md.a(md.e);
      return new dax(
         List.of(dax.a.a(jw.a(dkw.bz.p()), 15.0F), dax.a.b($$0.b(awz.Q), 15.0F), dax.a.b($$0.b(awz.a), 5.0F), dax.a.b(jw.a(dkw.ft.p(), dkw.fu.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dol $$5 && !$$5.q($$3)) {
         cqi $$6 = $$0.o();
         cxy $$7 = $$0.n();
         if ($$6 instanceof aro) {
            ap.N.a((aro)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awk.lN, awl.e, 1.0F, 1.0F);
         dym $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(edm.c, $$2, edm.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bwr.d($$0.p()));
         }

         return btq.a;
      }

      return super.a($$0);
   }
}
