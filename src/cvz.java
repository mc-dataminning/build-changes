import java.util.List;
import java.util.function.Predicate;

public class cvz extends cvk {
   public cvz(cvk.a $$0) {
      super($$0);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      if ($$3.a(awt.T)) {
         cnu $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return brp.e;
   }

   public static brp a(cnu $$0, deg $$1, je $$2) {
      cjy $$3 = null;
      List<bui> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bui $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cjy.b($$1, $$2);
            $$3.t();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(dzl.b, $$2, dzl.a.a($$0));
         return brp.b;
      } else {
         return brp.e;
      }
   }

   public static List<bui> a(deg $$0, je $$1, Predicate<bui> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      eyn $$7 = new eyn((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bto.class, $$7, $$1x -> {
         if ($$1x instanceof bui $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bui.class::cast).toList();
   }
}
