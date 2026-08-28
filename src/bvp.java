import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bvp {
   public static final Predicate<bvk> a = bvk::bL;
   public static final Predicate<bvk> b = $$0 -> $$0.bL() && $$0 instanceof bwg;
   public static final Predicate<bvk> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bvk> d = $$0 -> $$0 instanceof btc && $$0.bL();
   public static final Predicate<bvk> e = $$0 -> !($$0 instanceof cpx) || !$$0.aa_() && !((cpx)$$0).b();
   public static final Predicate<bvk> f = $$0 -> !$$0.aa_();
   public static final Predicate<bvk> g = f.and(bvk::bN);
   public static final Predicate<bvk> h = f.and(bvk::bH);

   private bvp() {
   }

   public static Predicate<bvk> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bvk> a(bvk $$0) {
      fdf $$1 = $$0.cr();
      fdf.a $$2 = $$1 == null ? fdf.a.a : $$1.l();
      return (Predicate<bvk>)($$2 == fdf.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dW().C || $$3 instanceof cpx && ((cpx)$$3).c()) {
            fdf $$4 = $$3.cr();
            fdf.a $$5 = $$4 == null ? fdf.a.a : $$4.l();
            if ($$5 == fdf.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fdf.a.d || $$5 == fdf.a.d) && $$6 ? false : $$2 != fdf.a.c && $$5 != fdf.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bvk> b(bvk $$0) {
      return $$1 -> {
         while ($$1.bZ()) {
            $$1 = $$1.dl();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
