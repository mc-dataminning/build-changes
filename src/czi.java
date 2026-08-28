import java.util.List;
import java.util.function.Predicate;

public class czi extends cyu {
   public czi(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzz $$3 = $$1.a_($$2);
      if ($$3.a(axc.U)) {
         cqy $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bub.e;
   }

   public static bub a(cqy $$0, div $$1, iu $$2) {
      cmx $$3 = null;
      List<bxa> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bxa $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cmx.b($$1, $$2);
            $$3.m();
         }

         $$5.a_($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(eez.b, $$2, eez.a.a($$0));
         return bub.b;
      } else {
         return bub.e;
      }
   }

   public static List<bxa> a(div $$0, iu $$1, Predicate<bxa> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fed $$7 = new fed((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bwd.class, $$7, $$1x -> {
         if ($$1x instanceof bxa $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bxa.class::cast).toList();
   }
}
