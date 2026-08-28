import java.util.List;
import java.util.function.Predicate;

public class cwh extends cvt {
   public cwh(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      if ($$3.a(awz.T)) {
         coh $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bry.e;
   }

   public static bry a(coh $$0, dev $$1, jg $$2) {
      ckk $$3 = null;
      List<but> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (but $$5 : $$4) {
         if ($$3 == null) {
            $$3 = ckk.b($$1, $$2);
            $$3.t();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(eaa.b, $$2, eaa.a.a($$0));
         return bry.b;
      } else {
         return bry.e;
      }
   }

   public static List<but> a(dev $$0, jg $$1, Predicate<but> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ezc $$7 = new ezc((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(btz.class, $$7, $$1x -> {
         if ($$1x instanceof but $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(but.class::cast).toList();
   }
}
