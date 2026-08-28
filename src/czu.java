import java.util.List;
import java.util.function.Predicate;

public class czu extends czg {
   public czu(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      if ($$3.a(axc.U)) {
         crj $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bug.e;
   }

   public static bug a(crj $$0, djh $$1, iv $$2) {
      cni $$3 = null;
      List<bxh> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bxh $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cni.b($$1, $$2);
            $$3.m();
         }

         $$5.a_($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(efo.b, $$2, efo.a.a($$0));
         return bug.b;
      } else {
         return bug.e;
      }
   }

   public static List<bxh> a(djh $$0, iv $$1, Predicate<bxh> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fes $$7 = new fes((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bwi.class, $$7, $$1x -> {
         if ($$1x instanceof bxh $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bxh.class::cast).toList();
   }
}
