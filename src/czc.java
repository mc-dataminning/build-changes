import java.util.List;
import java.util.function.Predicate;

public class czc extends cyo {
   public czc(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      if ($$3.a(axa.U)) {
         cqs $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bty.e;
   }

   public static bty a(cqs $$0, dip $$1, iu $$2) {
      cmr $$3 = null;
      List<bwx> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bwx $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cmr.b($$1, $$2);
            $$3.m();
         }

         $$5.a_($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(eeo.b, $$2, eeo.a.a($$0));
         return bty.b;
      } else {
         return bty.e;
      }
   }

   public static List<bwx> a(dip $$0, iu $$1, Predicate<bwx> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      fdr $$7 = new fdr((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bwa.class, $$7, $$1x -> {
         if ($$1x instanceof bwx $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bwx.class::cast).toList();
   }
}
