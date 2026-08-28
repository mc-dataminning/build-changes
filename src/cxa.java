import java.util.List;
import java.util.function.Predicate;

public class cxa extends cwm {
   public cxa(cwm.a $$0) {
      super($$0);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwy $$3 = $$1.a_($$2);
      if ($$3.a(awp.U)) {
         coy $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return bsl.e;
   }

   public static bsl a(coy $$0, dgj $$1, ji $$2) {
      ckx $$3 = null;
      List<bvg> $$4 = a($$1, $$2, $$1x -> $$1x.D() == $$0);

      for (bvg $$5 : $$4) {
         if ($$3 == null) {
            $$3 = ckx.a($$1, $$2);
            $$3.s();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(ebu.b, $$2, ebu.a.a($$0));
         return bsl.b;
      } else {
         return bsl.e;
      }
   }

   public static List<bvg> a(dgj $$0, ji $$1, Predicate<bvg> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      faw $$7 = new faw((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bum.class, $$7, $$1x -> {
         if ($$1x instanceof bvg $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bvg.class::cast).toList();
   }
}
