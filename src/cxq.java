import java.util.List;
import java.util.function.Predicate;

public class cxq extends cxc {
   public cxq(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      if ($$3.a(axk.U)) {
         cpo $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bta.e;
   }

   public static bta a(cpo $$0, dgz $$1, jh $$2) {
      clm $$3 = null;
      List<bvv> $$4 = a($$1, $$2, $$1x -> $$1x.A() == $$0);

      for (bvv $$5 : $$4) {
         if ($$3 == null) {
            $$3 = clm.a($$1, $$2);
            $$3.s();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(eck.b, $$2, eck.a.a($$0));
         return bta.b;
      } else {
         return bta.e;
      }
   }

   public static List<bvv> a(dgz $$0, jh $$1, Predicate<bvv> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fbm $$7 = new fbm((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bvb.class, $$7, $$1x -> {
         if ($$1x instanceof bvv $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bvv.class::cast).toList();
   }
}
