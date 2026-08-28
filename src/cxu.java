import java.util.List;
import java.util.function.Predicate;

public class cxu extends cxg {
   public cxu(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      if ($$3.a(axu.U)) {
         cps $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bte.e;
   }

   public static bte a(cps $$0, dha $$1, jh $$2) {
      clq $$3 = null;
      List<bvz> $$4 = a($$1, $$2, $$1x -> $$1x.A() == $$0);

      for (bvz $$5 : $$4) {
         if ($$3 == null) {
            $$3 = clq.a($$1, $$2);
            $$3.s();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(ecj.b, $$2, ecj.a.a($$0));
         return bte.b;
      } else {
         return bte.e;
      }
   }

   public static List<bvz> a(dha $$0, jh $$1, Predicate<bvz> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fbn $$7 = new fbn((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bvf.class, $$7, $$1x -> {
         if ($$1x instanceof bvz $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bvz.class::cast).toList();
   }
}
