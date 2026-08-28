import java.util.List;
import java.util.function.Predicate;

public class dau extends dag {
   public dau(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      if ($$3.a(axn.U)) {
         csi $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bvc.e;
   }

   public static bvc a(csi $$0, dkj $$1, iw $$2) {
      coh $$3 = null;
      List<byd> $$4 = a($$1, $$2, $$1x -> $$1x.B() == $$0);

      for (byd $$5 : $$4) {
         if ($$3 == null) {
            $$3 = coh.b($$1, $$2);
            $$3.l();
         }

         $$5.a_($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(egq.b, $$2, egq.a.a($$0));
         return bvc.b;
      } else {
         return bvc.e;
      }
   }

   public static List<byd> a(dkj $$0, iw $$1, Predicate<byd> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ffx $$7 = new ffx((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bxe.class, $$7, $$1x -> {
         if ($$1x instanceof byd $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(byd.class::cast).toList();
   }
}
