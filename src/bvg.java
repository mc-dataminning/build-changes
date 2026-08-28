import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bvg {
   public static final Predicate<bva> a = bva::bJ;
   public static final Predicate<bva> b = $$0 -> $$0.bJ() && $$0 instanceof bvy;
   public static final Predicate<bva> c = $$0 -> $$0.bJ() && !$$0.bZ() && !$$0.bY();
   public static final Predicate<bva> d = $$0 -> $$0 instanceof bsr && $$0.bJ();
   public static final Predicate<bva> e = $$0 -> {
      if ($$0 instanceof cpr $$1 && ($$0.U_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bva> f = $$0 -> !$$0.U_();
   public static final Predicate<bva> g = f.and(bva::bL);
   public static final Predicate<bva> h = f.and(bva::bF);

   private bvg() {
   }

   public static Predicate<bva> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bva> a(bva $$0) {
      fde $$1 = $$0.cq();
      fde.a $$2 = $$1 == null ? fde.a.a : $$1.l();
      return (Predicate<bva>)($$2 == fde.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bG()) {
            return false;
         } else if (!$$0.dU().C || $$3 instanceof cpr $$4 && $$4.gj()) {
            fde $$5 = $$3.cq();
            fde.a $$6 = $$5 == null ? fde.a.a : $$5.l();
            if ($$6 == fde.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == fde.a.d || $$6 == fde.a.d) && $$7 ? false : $$2 != fde.a.c && $$6 != fde.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bva> b(bva $$0) {
      return $$1 -> {
         while ($$1.bY()) {
            $$1 = $$1.dj();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
