import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bwh {
   public static final Predicate<bwa> a = bwa::bK;
   public static final Predicate<bwa> b = $$0 -> $$0.bK() && $$0 instanceof bwz;
   public static final Predicate<bwa> c = $$0 -> $$0.bK() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bwa> d = $$0 -> $$0 instanceof btr && $$0.bK();
   public static final Predicate<bwa> e = $$0 -> {
      if ($$0 instanceof cqs $$1 && ($$0.U_() || $$1.b())) {
         return false;
      }

      return true;
   };
   public static final Predicate<bwa> f = $$0 -> !$$0.U_();
   public static final Predicate<bwa> g = f.and(bwa::bM);
   public static final Predicate<bwa> h = f.and(bwa::bG);

   private bwh() {
   }

   public static Predicate<bwa> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bwa> a(bwa $$0) {
      ffd $$1 = $$0.cr();
      ffd.a $$2 = $$1 == null ? ffd.a.a : $$1.l();
      return (Predicate<bwa>)($$2 == ffd.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bH()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof cqs $$4 && $$4.gg()) {
            ffd $$5 = $$3.cr();
            ffd.a $$6 = $$5 == null ? ffd.a.a : $$5.l();
            if ($$6 == ffd.a.b) {
               return false;
            } else {
               boolean $$7 = $$1 != null && $$1.a($$5);
               return ($$2 == ffd.a.d || $$6 == ffd.a.d) && $$7 ? false : $$2 != ffd.a.c && $$6 != ffd.a.c || $$7;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bwa> b(bwa $$0) {
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
