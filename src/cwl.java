import java.util.List;
import java.util.function.Predicate;

public class cwl extends cvx {
   public cwl(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      if ($$3.a(axa.T)) {
         com $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bsd.e;
   }

   public static bsd a(com $$0, dfb $$1, jh $$2) {
      ckp $$3 = null;
      List<buy> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (buy $$5 : $$4) {
         if ($$3 == null) {
            $$3 = ckp.b($$1, $$2);
            $$3.t();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(eag.b, $$2, eag.a.a($$0));
         return bsd.b;
      } else {
         return bsd.e;
      }
   }

   public static List<buy> a(dfb $$0, jh $$1, Predicate<buy> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ezi $$7 = new ezi((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bue.class, $$7, $$1x -> {
         if ($$1x instanceof buy $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(buy.class::cast).toList();
   }
}
