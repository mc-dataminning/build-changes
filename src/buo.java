import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class buo {
   public static final Predicate<buj> a = buj::bL;
   public static final Predicate<buj> b = $$0 -> $$0.bL() && $$0 instanceof bvf;
   public static final Predicate<buj> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<buj> d = $$0 -> $$0 instanceof bsb && $$0.bL();
   public static final Predicate<buj> e = $$0 -> !($$0 instanceof cov) || !$$0.Z_() && !((cov)$$0).b();
   public static final Predicate<buj> f = $$0 -> !$$0.Z_();
   public static final Predicate<buj> g = f.and(buj::bN);
   public static final Predicate<buj> h = f.and(buj::bH);

   private buo() {
   }

   public static Predicate<buj> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<buj> a(buj $$0) {
      fcf $$1 = $$0.cr();
      fcf.a $$2 = $$1 == null ? fcf.a.a : $$1.l();
      return (Predicate<buj>)($$2 == fcf.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dW().C || $$3 instanceof cov && ((cov)$$3).c()) {
            fcf $$4 = $$3.cr();
            fcf.a $$5 = $$4 == null ? fcf.a.a : $$4.l();
            if ($$5 == fcf.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fcf.a.d || $$5 == fcf.a.d) && $$6 ? false : $$2 != fcf.a.c && $$5 != fcf.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<buj> b(buj $$0) {
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
