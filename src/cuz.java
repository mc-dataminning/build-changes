import java.util.List;

public class cuz extends cul {
   public cuz(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if ($$3.a(awe.S)) {
         cmx $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            a($$4, $$1, $$2);
         }

         return bqr.a($$1.B);
      } else {
         return bqr.e;
      }
   }

   public static bqr a(cmx $$0, dcw $$1, jd $$2) {
      cjb $$3 = null;
      double $$4 = 7.0;
      int $$5 = $$2.u();
      int $$6 = $$2.v();
      int $$7 = $$2.w();
      ewv $$8 = new ewv((double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$7 - 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0, (double)$$7 + 7.0);
      List<bsr> $$9 = $$1.a(bsr.class, $$8, $$1x -> {
         if ($$1x instanceof btk $$2x && $$2x.A() == $$0) {
            return true;
         }

         return false;
      });

      for (bsr $$10 : $$9) {
         if ($$3 == null) {
            $$3 = cjb.b($$1, $$2);
            $$3.v();
         }

         ((btk)$$10).b($$3, true);
      }

      if (!$$9.isEmpty()) {
         $$1.a(dxz.b, $$2, dxz.a.a($$0));
         return bqr.a;
      } else {
         return bqr.e;
      }
   }
}
