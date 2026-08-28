import java.util.List;
import java.util.function.Predicate;

public class dak extends czw {
   public dak(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      if ($$3.a(axg.U)) {
         crz $$4 = $$0.o();
         if (!$$1.C && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return but.e;
   }

   public static but a(crz $$0, djz $$1, iw $$2) {
      cny $$3 = null;
      List<bxu> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bxu $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cny.b($$1, $$2);
            $$3.m();
         }

         $$5.a_($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(egg.b, $$2, egg.a.a($$0));
         return but.b;
      } else {
         return but.e;
      }
   }

   public static List<bxu> a(djz $$0, iw $$1, Predicate<bxu> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      ffn $$7 = new ffn((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(bwv.class, $$7, $$1x -> {
         if ($$1x instanceof bxu $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bxu.class::cast).toList();
   }
}
