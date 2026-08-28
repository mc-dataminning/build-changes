import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bvo {
   public static final Predicate<bvj> a = bvj::bL;
   public static final Predicate<bvj> b = $$0 -> $$0.bL() && $$0 instanceof bwf;
   public static final Predicate<bvj> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bvj> d = $$0 -> $$0 instanceof btb && $$0.bL();
   public static final Predicate<bvj> e = $$0 -> !($$0 instanceof cpw) || !$$0.aa_() && !((cpw)$$0).b();
   public static final Predicate<bvj> f = $$0 -> !$$0.aa_();
   public static final Predicate<bvj> g = f.and(bvj::bN);
   public static final Predicate<bvj> h = f.and(bvj::bH);

   private bvo() {
   }

   public static Predicate<bvj> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bvj> a(bvj $$0) {
      fde $$1 = $$0.cr();
      fde.a $$2 = $$1 == null ? fde.a.a : $$1.l();
      return (Predicate<bvj>)($$2 == fde.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dW().C || $$3 instanceof cpw && ((cpw)$$3).c()) {
            fde $$4 = $$3.cr();
            fde.a $$5 = $$4 == null ? fde.a.a : $$4.l();
            if ($$5 == fde.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fde.a.d || $$5 == fde.a.d) && $$6 ? false : $$2 != fde.a.c && $$5 != fde.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bvj> b(bvj $$0) {
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
