import java.util.List;
import java.util.function.Predicate;

public class dai extends czu {
   public dai(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      if ($$3.a(axe.U)) {
         crx $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bur.e;
   }

   public static bur a(crx $$0, djx $$1, iv $$2) {
      cnw $$3 = null;
      List<bxs> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bxs $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cnw.b($$1, $$2);
            $$3.m();
         }

         $$5.a_($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(ege.b, $$2, ege.a.a($$0));
         return bur.b;
      } else {
         return bur.e;
      }
   }

   public static List<bxs> a(djx $$0, iv $$1, Predicate<bxs> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ffl $$7 = new ffl((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bwt.class, $$7, $$1x -> {
         if ($$1x instanceof bxs $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bxs.class::cast).toList();
   }
}
