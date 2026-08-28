import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class buj {
   public static final Predicate<bue> a = bue::bM;
   public static final Predicate<bue> b = $$0 -> $$0.bM() && $$0 instanceof bva;
   public static final Predicate<bue> c = $$0 -> $$0.bM() && !$$0.cb() && !$$0.ca();
   public static final Predicate<bue> d = $$0 -> $$0 instanceof brw && $$0.bM();
   public static final Predicate<bue> e = $$0 -> !($$0 instanceof com) || !$$0.R_() && !((com)$$0).f();
   public static final Predicate<bue> f = $$0 -> !$$0.R_();
   public static final Predicate<bue> g = f.and(bue::bO);
   public static final Predicate<bue> h = f.and(bue::bI);

   private buj() {
   }

   public static Predicate<bue> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bue> a(bue $$0) {
      fau $$1 = $$0.cs();
      fau.a $$2 = $$1 == null ? fau.a.a : $$1.l();
      return (Predicate<bue>)($$2 == fau.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bJ()) {
            return false;
         } else if (!$$0.dX().C || $$3 instanceof com && ((com)$$3).g()) {
            fau $$4 = $$3.cs();
            fau.a $$5 = $$4 == null ? fau.a.a : $$4.l();
            if ($$5 == fau.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fau.a.d || $$5 == fau.a.d) && $$6 ? false : $$2 != fau.a.c && $$5 != fau.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bue> b(bue $$0) {
      return $$1 -> {
         while ($$1.ca()) {
            $$1 = $$1.dl();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
