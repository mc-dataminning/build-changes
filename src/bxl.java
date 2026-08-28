import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bxl {
   public static final Predicate<bxe> a = bxe::bJ;
   public static final Predicate<bxe> b = $$0 -> $$0.bJ() && $$0 instanceof byf;
   public static final Predicate<bxe> c = $$0 -> $$0.bJ() && !$$0.bZ() && !$$0.bY();
   public static final Predicate<bxe> d = $$0 -> $$0 instanceof buv && $$0.bJ();
   public static final Predicate<bxe> e = $$0 -> {
      if ($$0 instanceof csi $$1 && ($$0.aa_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bxe> f = $$0 -> !$$0.aa_();
   public static final Predicate<bxe> g = f.and(bxe::bL);
   public static final Predicate<bxe> h = f.and(bxe::bF);

   private bxl() {
   }

   public static Predicate<bxe> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.h($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bxe> a(bxe $$0) {
      fhj $$1 = $$0.cq();
      fhj.a $$2 = $$1 == null ? fhj.a.a : $$1.m();
      return (Predicate<bxe>)($$2 == fhj.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bG()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof csi $$4 && $$4.gh()) {
            fhj $$5 = $$3.cq();
            fhj.a $$6 = $$5 == null ? fhj.a.a : $$5.m();
            if ($$6 == fhj.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == fhj.a.d || $$6 == fhj.a.d) && $$7 ? false : $$2 != fhj.a.c && $$6 != fhj.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bxe> b(bxe $$0) {
      return $$1 -> {
         while ($$1.bY()) {
            $$1 = $$1.dk();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
