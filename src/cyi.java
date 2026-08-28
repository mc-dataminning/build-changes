import java.util.List;
import java.util.function.Predicate;

public class cyi extends cxu {
   public cyi(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      if ($$3.a(awz.U)) {
         cqi $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return btq.e;
   }

   public static btq a(cqi $$0, dhp $$1, jj $$2) {
      cmh $$3 = null;
      List<bwp> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bwp $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cmh.a($$1, $$2);
            $$3.m();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(edm.b, $$2, edm.a.a($$0));
         return btq.b;
      } else {
         return btq.e;
      }
   }

   public static List<bwp> a(dhp $$0, jj $$1, Predicate<bwp> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fcp $$7 = new fcp((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bvs.class, $$7, $$1x -> {
         if ($$1x instanceof bwp $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bwp.class::cast).toList();
   }
}
