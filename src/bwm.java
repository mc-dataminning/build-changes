import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bwm {
   public static final Predicate<bwf> a = bwf::bK;
   public static final Predicate<bwf> b = $$0 -> $$0.bK() && $$0 instanceof bxe;
   public static final Predicate<bwf> c = $$0 -> $$0.bK() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bwf> d = $$0 -> $$0 instanceof btw && $$0.bK();
   public static final Predicate<bwf> e = $$0 -> {
      if ($$0 instanceof crc $$1 && ($$0.V_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bwf> f = $$0 -> !$$0.V_();
   public static final Predicate<bwf> g = f.and(bwf::bM);
   public static final Predicate<bwf> h = f.and(bwf::bG);

   private bwm() {
   }

   public static Predicate<bwf> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.h($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bwf> a(bwf $$0) {
      ffx $$1 = $$0.cr();
      ffx.a $$2 = $$1 == null ? ffx.a.a : $$1.m();
      return (Predicate<bwf>)($$2 == ffx.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bH()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof crc $$4 && $$4.gh()) {
            ffx $$5 = $$3.cr();
            ffx.a $$6 = $$5 == null ? ffx.a.a : $$5.m();
            if ($$6 == ffx.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == ffx.a.d || $$6 == ffx.a.d) && $$7 ? false : $$2 != ffx.a.c && $$6 != ffx.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bwf> b(bwf $$0) {
      return $$1 -> {
         while ($$1.bZ()) {
            $$1 = $$1.dk();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
