import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bvk {
   public static final Predicate<bvf> a = bvf::bL;
   public static final Predicate<bvf> b = $$0 -> $$0.bL() && $$0 instanceof bwb;
   public static final Predicate<bvf> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bvf> d = $$0 -> $$0 instanceof bsx && $$0.bL();
   public static final Predicate<bvf> e = $$0 -> !($$0 instanceof cps) || !$$0.aa_() && !((cps)$$0).b();
   public static final Predicate<bvf> f = $$0 -> !$$0.aa_();
   public static final Predicate<bvf> g = f.and(bvf::bN);
   public static final Predicate<bvf> h = f.and(bvf::bH);

   private bvk() {
   }

   public static Predicate<bvf> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bvf> a(bvf $$0) {
      fcz $$1 = $$0.cr();
      fcz.a $$2 = $$1 == null ? fcz.a.a : $$1.l();
      return (Predicate<bvf>)($$2 == fcz.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof cps && ((cps)$$3).c()) {
            fcz $$4 = $$3.cr();
            fcz.a $$5 = $$4 == null ? fcz.a.a : $$4.l();
            if ($$5 == fcz.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fcz.a.d || $$5 == fcz.a.d) && $$6 ? false : $$2 != fcz.a.c && $$5 != fcz.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bvf> b(bvf $$0) {
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
