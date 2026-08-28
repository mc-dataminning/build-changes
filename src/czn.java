import java.util.List;
import java.util.function.Predicate;

public class czn extends cyz {
   public czn(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      if ($$3.a(axc.U)) {
         crc $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bud.e;
   }

   public static bud a(crc $$0, dja $$1, iu $$2) {
      cnb $$3 = null;
      List<bxc> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bxc $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cnb.b($$1, $$2);
            $$3.m();
         }

         $$5.a_($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(efh.b, $$2, efh.a.a($$0));
         return bud.b;
      } else {
         return bud.e;
      }
   }

   public static List<bxc> a(dja $$0, iu $$1, Predicate<bxc> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fel $$7 = new fel((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bwf.class, $$7, $$1x -> {
         if ($$1x instanceof bxc $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bxc.class::cast).toList();
   }
}
