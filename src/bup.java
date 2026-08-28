import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bup {
   public static final Predicate<buk> a = buk::bL;
   public static final Predicate<buk> b = $$0 -> $$0.bL() && $$0 instanceof bvg;
   public static final Predicate<buk> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<buk> d = $$0 -> $$0 instanceof bsc && $$0.bL();
   public static final Predicate<buk> e = $$0 -> !($$0 instanceof cow) || !$$0.Z_() && !((cow)$$0).b();
   public static final Predicate<buk> f = $$0 -> !$$0.Z_();
   public static final Predicate<buk> g = f.and(buk::bN);
   public static final Predicate<buk> h = f.and(buk::bH);

   private bup() {
   }

   public static Predicate<buk> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<buk> a(buk $$0) {
      fcg $$1 = $$0.cr();
      fcg.a $$2 = $$1 == null ? fcg.a.a : $$1.l();
      return (Predicate<buk>)($$2 == fcg.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof cow && ((cow)$$3).c()) {
            fcg $$4 = $$3.cr();
            fcg.a $$5 = $$4 == null ? fcg.a.a : $$4.l();
            if ($$5 == fcg.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fcg.a.d || $$5 == fcg.a.d) && $$6 ? false : $$2 != fcg.a.c && $$5 != fcg.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<buk> b(buk $$0) {
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
