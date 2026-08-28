import java.util.List;
import java.util.function.Predicate;

public class cwx extends cwj {
   public cwx(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      if ($$3.a(awo.U)) {
         cov $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bsi.e;
   }

   public static bsi a(cov $$0, dgg $$1, ji $$2) {
      cku $$3 = null;
      List<bvd> $$4 = a($$1, $$2, $$1x -> $$1x.A() == $$0);

      for (bvd $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cku.a($$1, $$2);
            $$3.s();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(ebr.b, $$2, ebr.a.a($$0));
         return bsi.b;
      } else {
         return bsi.e;
      }
   }

   public static List<bvd> a(dgg $$0, ji $$1, Predicate<bvd> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fat $$7 = new fat((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(buj.class, $$7, $$1x -> {
         if ($$1x instanceof bvd $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bvd.class::cast).toList();
   }
}
