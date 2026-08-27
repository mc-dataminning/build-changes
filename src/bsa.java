import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsa {
   public static final Predicate<brv> a = brv::bI;
   public static final Predicate<brv> b = $$0 -> $$0.bI() && $$0 instanceof bso;
   public static final Predicate<brv> c = $$0 -> $$0.bI() && !$$0.bX() && !$$0.bW();
   public static final Predicate<brv> d = $$0 -> $$0 instanceof bpt && $$0.bI();
   public static final Predicate<brv> e = $$0 -> !($$0 instanceof cly) || !$$0.O_() && !((cly)$$0).f();
   public static final Predicate<brv> f = $$0 -> !$$0.O_();
   public static final Predicate<brv> g = f.and(brv::bK);

   private bsa() {
   }

   public static Predicate<brv> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<brv> a(brv $$0) {
      eya $$1 = $$0.co();
      eya.a $$2 = $$1 == null ? eya.a.a : $$1.l();
      return (Predicate<brv>)($$2 == eya.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bF()) {
            return false;
         } else if (!$$0.dU().C || $$3 instanceof cly && ((cly)$$3).g()) {
            eya $$4 = $$3.co();
            eya.a $$5 = $$4 == null ? eya.a.a : $$4.l();
            if ($$5 == eya.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eya.a.d || $$5 == eya.a.d) && $$6 ? false : $$2 != eya.a.c && $$5 != eya.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<brv> b(brv $$0) {
      return $$1 -> {
         while ($$1.bW()) {
            $$1 = $$1.dh();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<brv> {
      private final cuh a;

      public a(cuh $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable brv $$0) {
         if (!$$0.bI()) {
            return false;
         } else {
            return !($$0 instanceof bso $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
