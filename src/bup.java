import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bup {
   public static final Predicate<buk> a = buk::bL;
   public static final Predicate<buk> b = $$0 -> $$0.bL() && $$0 instanceof bvg;
   public static final Predicate<buk> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<buk> d = $$0 -> $$0 instanceof bsc && $$0.bL();
   public static final Predicate<buk> e = $$0 -> !($$0 instanceof cox) || !$$0.Z_() && !((cox)$$0).b();
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
      fch $$1 = $$0.cr();
      fch.a $$2 = $$1 == null ? fch.a.a : $$1.l();
      return (Predicate<buk>)($$2 == fch.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dW().C || $$3 instanceof cox && ((cox)$$3).c()) {
            fch $$4 = $$3.cr();
            fch.a $$5 = $$4 == null ? fch.a.a : $$4.l();
            if ($$5 == fch.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fch.a.d || $$5 == fch.a.d) && $$6 ? false : $$2 != fch.a.c && $$5 != fch.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<buk> b(buk $$0) {
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
