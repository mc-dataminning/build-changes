import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bvz {
   public static final Predicate<bvs> a = bvs::bK;
   public static final Predicate<bvs> b = $$0 -> $$0.bK() && $$0 instanceof bwr;
   public static final Predicate<bvs> c = $$0 -> $$0.bK() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bvs> d = $$0 -> $$0 instanceof btj && $$0.bK();
   public static final Predicate<bvs> e = $$0 -> {
      if ($$0 instanceof cqi $$1 && ($$0.U_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bvs> f = $$0 -> !$$0.U_();
   public static final Predicate<bvs> g = f.and(bvs::bM);
   public static final Predicate<bvs> h = f.and(bvs::bG);

   private bvz() {
   }

   public static Predicate<bvs> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bvs> a(bvs $$0) {
      feb $$1 = $$0.cr();
      feb.a $$2 = $$1 == null ? feb.a.a : $$1.l();
      return (Predicate<bvs>)($$2 == feb.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bH()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof cqi $$4 && $$4.gg()) {
            feb $$5 = $$3.cr();
            feb.a $$6 = $$5 == null ? feb.a.a : $$5.l();
            if ($$6 == feb.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == feb.a.d || $$6 == feb.a.d) && $$7 ? false : $$2 != feb.a.c && $$6 != feb.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bvs> b(bvs $$0) {
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
