import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bun {
   public static final Predicate<bui> a = bui::bN;
   public static final Predicate<bui> b = $$0 -> $$0.bN() && $$0 instanceof bve;
   public static final Predicate<bui> c = $$0 -> $$0.bN() && !$$0.cc() && !$$0.cb();
   public static final Predicate<bui> d = $$0 -> $$0 instanceof bsa && $$0.bN();
   public static final Predicate<bui> e = $$0 -> !($$0 instanceof cor) || !$$0.R_() && !((cor)$$0).f();
   public static final Predicate<bui> f = $$0 -> !$$0.R_();
   public static final Predicate<bui> g = f.and(bui::bP);
   public static final Predicate<bui> h = f.and(bui::bJ);

   private bun() {
   }

   public static Predicate<bui> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bui> a(bui $$0) {
      fay $$1 = $$0.ct();
      fay.a $$2 = $$1 == null ? fay.a.a : $$1.l();
      return (Predicate<bui>)($$2 == fay.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bK()) {
            return false;
         } else if (!$$0.dY().C || $$3 instanceof cor && ((cor)$$3).g()) {
            fay $$4 = $$3.ct();
            fay.a $$5 = $$4 == null ? fay.a.a : $$4.l();
            if ($$5 == fay.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fay.a.d || $$5 == fay.a.d) && $$6 ? false : $$2 != fay.a.c && $$5 != fay.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bui> b(bui $$0) {
      return $$1 -> {
         while ($$1.cb()) {
            $$1 = $$1.dm();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
