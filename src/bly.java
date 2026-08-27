import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bly {
   public static final Predicate<blv> a = blv::bx;
   public static final Predicate<blv> b = $$0 -> $$0.bx() && $$0 instanceof bml;
   public static final Predicate<blv> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<blv> d = $$0 -> $$0 instanceof bju && $$0.bx();
   public static final Predicate<blv> e = $$0 -> !($$0 instanceof cfi) || !$$0.P_() && !((cfi)$$0).f();
   public static final Predicate<blv> f = $$0 -> !$$0.P_();
   public static final Predicate<blv> g = f.and(blv::bz);

   private bly() {
   }

   public static Predicate<blv> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<blv> a(blv $$0) {
      emz $$1 = $$0.cg();
      emz.a $$2 = $$1 == null ? emz.a.a : $$1.l();
      return (Predicate<blv>)($$2 == emz.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof cfi && ((cfi)$$3).g()) {
            emz $$4 = $$3.cg();
            emz.a $$5 = $$4 == null ? emz.a.a : $$4.l();
            if ($$5 == emz.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == emz.a.d || $$5 == emz.a.d) && $$6 ? false : $$2 != emz.a.c && $$5 != emz.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<blv> b(blv $$0) {
      return $$1 -> {
         while ($$1.bO()) {
            $$1 = $$1.cZ();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<blv> {
      private final cmy a;

      public a(cmy $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable blv $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof bml $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
