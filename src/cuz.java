import java.util.List;
import java.util.function.Predicate;

public class cuz extends cul {
   public cuz(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      jd $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if ($$3.a(awe.T)) {
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
      List<btk> $$4 = a($$1, $$2, $$1x -> $$1x.A() == $$0);

      for (btk $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cjb.b($$1, $$2);
            $$3.v();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(dxz.b, $$2, dxz.a.a($$0));
         return bqr.a;
      } else {
         return bqr.e;
      }
   }

   public static List<btk> a(dcw $$0, jd $$1, Predicate<btk> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ewx $$7 = new ewx((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bsr.class, $$7, $$1x -> {
         if ($$1x instanceof btk $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(btk.class::cast).toList();
   }
}
