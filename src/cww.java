import java.util.List;
import java.util.function.Predicate;

public class cww extends cwi {
   public cww(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      if ($$3.a(axc.T)) {
         cou $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bsk.e;
   }

   public static bsk a(cou $$0, dfm $$1, jh $$2) {
      ckw $$3 = null;
      List<bvf> $$4 = a($$1, $$2, $$1x -> $$1x.A() == $$0);

      for (bvf $$5 : $$4) {
         if ($$3 == null) {
            $$3 = ckw.a($$1, $$2);
            $$3.q();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(ear.b, $$2, ear.a.a($$0));
         return bsk.b;
      } else {
         return bsk.e;
      }
   }

   public static List<bvf> a(dfm $$0, jh $$1, Predicate<bvf> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ezt $$7 = new ezt((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bul.class, $$7, $$1x -> {
         if ($$1x instanceof bvf $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bvf.class::cast).toList();
   }
}
