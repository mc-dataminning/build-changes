import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bto {
   public static final Predicate<btj> a = btj::bI;
   public static final Predicate<btj> b = $$0 -> $$0.bI() && $$0 instanceof buf;
   public static final Predicate<btj> c = $$0 -> $$0.bI() && !$$0.bX() && !$$0.bW();
   public static final Predicate<btj> d = $$0 -> $$0 instanceof brd && $$0.bI();
   public static final Predicate<btj> e = $$0 -> !($$0 instanceof cnp) || !$$0.P_() && !((cnp)$$0).f();
   public static final Predicate<btj> f = $$0 -> !$$0.P_();
   public static final Predicate<btj> g = f.and(btj::bK);
   public static final Predicate<btj> h = f.and(btj::bE);

   private bto() {
   }

   public static Predicate<btj> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<btj> a(btj $$0) {
      ezk $$1 = $$0.co();
      ezk.a $$2 = $$1 == null ? ezk.a.a : $$1.l();
      return (Predicate<btj>)($$2 == ezk.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bF()) {
            return false;
         } else if (!$$0.dS().B || $$3 instanceof cnp && ((cnp)$$3).g()) {
            ezk $$4 = $$3.co();
            ezk.a $$5 = $$4 == null ? ezk.a.a : $$4.l();
            if ($$5 == ezk.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ezk.a.d || $$5 == ezk.a.d) && $$6 ? false : $$2 != ezk.a.c && $$5 != ezk.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<btj> b(btj $$0) {
      return $$1 -> {
         while ($$1.bW()) {
            $$1 = $$1.dg();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<btj> {
      private final cvl a;

      public a(cvl $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable btj $$0) {
         if (!$$0.bI()) {
            return false;
         } else {
            return !($$0 instanceof buf $$1) ? false : $$1.g(this.a);
         }
      }
   }
}
