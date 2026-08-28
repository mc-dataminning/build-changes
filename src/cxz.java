import java.util.List;
import java.util.function.Predicate;

public class cxz extends cxl {
   public cxz(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      if ($$3.a(axu.U)) {
         cpx $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return btj.e;
   }

   public static btj a(cpx $$0, dhi $$1, jh $$2) {
      clv $$3 = null;
      List<bwe> $$4 = a($$1, $$2, $$1x -> $$1x.A() == $$0);

      for (bwe $$5 : $$4) {
         if ($$3 == null) {
            $$3 = clv.a($$1, $$2);
            $$3.s();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(ecr.b, $$2, ecr.a.a($$0));
         return btj.b;
      } else {
         return btj.e;
      }
   }

   public static List<bwe> a(dhi $$0, jh $$1, Predicate<bwe> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fbt $$7 = new fbt((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bvk.class, $$7, $$1x -> {
         if ($$1x instanceof bwe $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bwe.class::cast).toList();
   }
}
