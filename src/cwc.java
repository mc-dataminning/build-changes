import java.util.List;
import java.util.function.Predicate;

public class cwc extends cvn {
   public cwc(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      if ($$3.a(awv.T)) {
         cnx $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return brs.e;
   }

   public static brs a(cnx $$0, dej $$1, jf $$2) {
      ckb $$3 = null;
      List<bul> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bul $$5 : $$4) {
         if ($$3 == null) {
            $$3 = ckb.b($$1, $$2);
            $$3.t();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(dzp.b, $$2, dzp.a.a($$0));
         return brs.b;
      } else {
         return brs.e;
      }
   }

   public static List<bul> a(dej $$0, jf $$1, Predicate<bul> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      eyr $$7 = new eyr((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(btr.class, $$7, $$1x -> {
         if ($$1x instanceof bul $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bul.class::cast).toList();
   }
}
