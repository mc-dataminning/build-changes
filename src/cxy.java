import java.util.List;
import java.util.function.Predicate;

public class cxy extends cxk {
   public cxy(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      if ($$3.a(axu.U)) {
         cpw $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bti.e;
   }

   public static bti a(cpw $$0, dhh $$1, jh $$2) {
      clu $$3 = null;
      List<bwd> $$4 = a($$1, $$2, $$1x -> $$1x.A() == $$0);

      for (bwd $$5 : $$4) {
         if ($$3 == null) {
            $$3 = clu.a($$1, $$2);
            $$3.s();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(ecq.b, $$2, ecq.a.a($$0));
         return bti.b;
      } else {
         return bti.e;
      }
   }

   public static List<bwd> a(dhh $$0, jh $$1, Predicate<bwd> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fbs $$7 = new fbs((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bvj.class, $$7, $$1x -> {
         if ($$1x instanceof bwd $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bwd.class::cast).toList();
   }
}
