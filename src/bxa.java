import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bxa {
   public static final Predicate<bwt> a = bwt::bJ;
   public static final Predicate<bwt> b = $$0 -> $$0.bJ() && $$0 instanceof bxu;
   public static final Predicate<bwt> c = $$0 -> $$0.bJ() && !$$0.bZ() && !$$0.bY();
   public static final Predicate<bwt> d = $$0 -> $$0 instanceof buk && $$0.bJ();
   public static final Predicate<bwt> e = $$0 -> {
      if ($$0 instanceof crx $$1 && ($$0.Z_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bwt> f = $$0 -> !$$0.Z_();
   public static final Predicate<bwt> g = f.and(bwt::bL);
   public static final Predicate<bwt> h = f.and(bwt::bF);

   private bxa() {
   }

   public static Predicate<bwt> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.h($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bwt> a(bwt $$0) {
      fgx $$1 = $$0.cq();
      fgx.a $$2 = $$1 == null ? fgx.a.a : $$1.m();
      return (Predicate<bwt>)($$2 == fgx.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bG()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof crx $$4 && $$4.gh()) {
            fgx $$5 = $$3.cq();
            fgx.a $$6 = $$5 == null ? fgx.a.a : $$5.m();
            if ($$6 == fgx.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == fgx.a.d || $$6 == fgx.a.d) && $$7 ? false : $$2 != fgx.a.c && $$6 != fgx.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bwt> b(bwt $$0) {
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
