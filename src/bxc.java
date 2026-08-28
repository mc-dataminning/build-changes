import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bxc {
   public static final Predicate<bwv> a = bwv::bJ;
   public static final Predicate<bwv> b = $$0 -> $$0.bJ() && $$0 instanceof bxw;
   public static final Predicate<bwv> c = $$0 -> $$0.bJ() && !$$0.bZ() && !$$0.bY();
   public static final Predicate<bwv> d = $$0 -> $$0 instanceof bum && $$0.bJ();
   public static final Predicate<bwv> e = $$0 -> {
      if ($$0 instanceof crz $$1 && ($$0.Z_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bwv> f = $$0 -> !$$0.Z_();
   public static final Predicate<bwv> g = f.and(bwv::bL);
   public static final Predicate<bwv> h = f.and(bwv::bF);

   private bxc() {
   }

   public static Predicate<bwv> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.h($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bwv> a(bwv $$0) {
      fgz $$1 = $$0.cq();
      fgz.a $$2 = $$1 == null ? fgz.a.a : $$1.m();
      return (Predicate<bwv>)($$2 == fgz.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bG()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof crz $$4 && $$4.gh()) {
            fgz $$5 = $$3.cq();
            fgz.a $$6 = $$5 == null ? fgz.a.a : $$5.m();
            if ($$6 == fgz.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == fgz.a.d || $$6 == fgz.a.d) && $$7 ? false : $$2 != fgz.a.c && $$6 != fgz.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bwv> b(bwv $$0) {
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
