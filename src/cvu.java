import java.util.List;
import java.util.function.Predicate;

public class cvu extends cvg {
   public cvu(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      if ($$3.a(aws.T)) {
         cnp $$4 = $$0.o();
         if (!$$1.B && $$4 != null) {
            return a($$4, $$1, $$2);
         }
      }

      return brk.e;
   }

   public static brk a(cnp $$0, dds $$1, je $$2) {
      cjt $$3 = null;
      List<bud> $$4 = a($$1, $$2, $$1x -> $$1x.C() == $$0);

      for (bud $$5 : $$4) {
         if ($$3 == null) {
            $$3 = cjt.b($$1, $$2);
            $$3.t();
         }

         $$5.b($$3, true);
      }

      if (!$$4.isEmpty()) {
         $$1.a(dyx.b, $$2, dyx.a.a($$0));
         return brk.b;
      } else {
         return brk.e;
      }
   }

   public static List<bud> a(dds $$0, je $$1, Predicate<bud> $$2) {
      double $$3 = 7.0;
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      exz $$7 = new exz((double)$$4 - 7.0, (double)$$5 - 7.0, (double)$$6 - 7.0, (double)$$4 + 7.0, (double)$$5 + 7.0, (double)$$6 + 7.0);
      return $$0.a(btj.class, $$7, $$1x -> {
         if ($$1x instanceof bud $$2x && $$2.test($$2x)) {
            return true;
         }

         return false;
      }).stream().map(bud.class::cast).toList();
   }
}
