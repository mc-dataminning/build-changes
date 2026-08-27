import java.util.List;

public class cqr extends cqh {
   public cqr(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      if ($$3.a(aun.S)) {
         ciu $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bnd.a($$1.B);
      } else {
         return bnd.d;
      }
   }

   public static bnd a(ciu $$0, cxb $$1, ib $$2) {
      cey $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      epo $$8 = new epo((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bpr> $$9 = $$1.a(bpr.class, $$8, $$1x -> $$1x.gc() == $$0);

      for (bpr $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cey.b($$1, $$2);
            $$3.C();
         }

         $$10.b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(drp.b, $$2, drp.a.a($$0));
         return bnd.a;
      } else {
         return bnd.d;
      }
   }
}
