import java.util.List;
import java.util.function.Predicate;

public class cxr extends cxd {
   public cxr(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      if ($$3.a(awp.U)) {
         cpr $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bsy.e;
   }

   public static bsy a(cpr $$0, dgz $$1, ji $$2) {
      clq $$3 = null;
      List<bvw> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bvw $$5 : $$4) {
         if ($$3 == null) {
            $$3 = clq.a($$1, $$2);
            $$3.m();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(ecp.b, $$2, ecp.a.a($$0));
         return bsy.b;
      } else {
         return bsy.e;
      }
   }

   public static List<bvw> a(dgz $$0, ji $$1, Predicate<bvw> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fbs $$7 = new fbs((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bva.class, $$7, $$1x -> {
         if ($$1x instanceof bvw $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bvw.class::cast).toList();
   }
}
