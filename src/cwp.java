import java.util.List;
import java.util.function.Predicate;

public class cwp extends cwb {
   public cwp(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      if ($$3.a(axd.T)) {
         cor $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bsh.e;
   }

   public static bsh a(cor $$0, dff $$1, jh $$2) {
      ckt $$3 = null;
      List<bvc> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bvc $$5 : $$4) {
         if ($$3 == null) {
            $$3 = ckt.b($$1, $$2);
            $$3.t();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(eak.b, $$2, eak.a.a($$0));
         return bsh.b;
      } else {
         return bsh.e;
      }
   }

   public static List<bvc> a(dff $$0, jh $$1, Predicate<bvc> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ezm $$7 = new ezm((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bui.class, $$7, $$1x -> {
         if ($$1x instanceof bvc $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bvc.class::cast).toList();
   }
}
