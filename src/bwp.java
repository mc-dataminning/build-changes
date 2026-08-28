import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bwp {
   public static final Predicate<bwi> a = bwi::bI;
   public static final Predicate<bwi> b = $$0 -> $$0.bI() && $$0 instanceof bxj;
   public static final Predicate<bwi> c = $$0 -> $$0.bI() && !$$0.bY() && !$$0.bX();
   public static final Predicate<bwi> d = $$0 -> $$0 instanceof btz && $$0.bI();
   public static final Predicate<bwi> e = $$0 -> {
      if ($$0 instanceof crm $$1 && ($$0.V_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bwi> f = $$0 -> !$$0.V_();
   public static final Predicate<bwi> g = f.and(bwi::bK);
   public static final Predicate<bwi> h = f.and(bwi::bE);

   private bwp() {
   }

   public static Predicate<bwi> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.h($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bwi> a(bwi $$0) {
      fgj $$1 = $$0.cp();
      fgj.a $$2 = $$1 == null ? fgj.a.a : $$1.m();
      return (Predicate<bwi>)($$2 == fgj.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bF()) {
            return false;
         } else if (!$$0.dU().C || $$3 instanceof crm $$4 && $$4.gg()) {
            fgj $$5 = $$3.cp();
            fgj.a $$6 = $$5 == null ? fgj.a.a : $$5.m();
            if ($$6 == fgj.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == fgj.a.d || $$6 == fgj.a.d) && $$7 ? false : $$2 != fgj.a.c && $$6 != fgj.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bwi> b(bwi $$0) {
      return $$1 -> {
         while ($$1.bX()) {
            $$1 = $$1.dj();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
