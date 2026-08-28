import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bwk {
   public static final Predicate<bwd> a = bwd::bK;
   public static final Predicate<bwd> b = $$0 -> $$0.bK() && $$0 instanceof bxc;
   public static final Predicate<bwd> c = $$0 -> $$0.bK() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bwd> d = $$0 -> $$0 instanceof btu && $$0.bK();
   public static final Predicate<bwd> e = $$0 -> {
      if ($$0 instanceof cqy $$1 && ($$0.U_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bwd> f = $$0 -> !$$0.U_();
   public static final Predicate<bwd> g = f.and(bwd::bM);
   public static final Predicate<bwd> h = f.and(bwd::bG);

   private bwk() {
   }

   public static Predicate<bwd> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bwd> a(bwd $$0) {
      ffp $$1 = $$0.cr();
      ffp.a $$2 = $$1 == null ? ffp.a.a : $$1.m();
      return (Predicate<bwd>)($$2 == ffp.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bH()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof cqy $$4 && $$4.gg()) {
            ffp $$5 = $$3.cr();
            ffp.a $$6 = $$5 == null ? ffp.a.a : $$5.m();
            if ($$6 == ffp.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == ffp.a.d || $$6 == ffp.a.d) && $$7 ? false : $$2 != ffp.a.c && $$6 != ffp.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bwd> b(bwd $$0) {
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
