import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bpc {
   public static final Predicate<box> a = box::bA;
   public static final Predicate<box> b = $$0 -> $$0.bA() && $$0 instanceof bpp;
   public static final Predicate<box> c = $$0 -> $$0.bA() && !$$0.bP() && !$$0.bO();
   public static final Predicate<box> d = $$0 -> $$0 instanceof bmw && $$0.bA();
   public static final Predicate<box> e = $$0 -> !($$0 instanceof ciu) || !$$0.N_() && !((ciu)$$0).f();
   public static final Predicate<box> f = $$0 -> !$$0.N_();
   public static final Predicate<box> g = f.and(box::bC);

   private bpc() {
   }

   public static Predicate<box> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<box> a(box $$0) {
      eqz $$1 = $$0.cg();
      eqz.a $$2 = $$1 == null ? eqz.a.a : $$1.l();
      return (Predicate<box>)($$2 == eqz.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bx()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof ciu && ((ciu)$$3).g()) {
            eqz $$4 = $$3.cg();
            eqz.a $$5 = $$4 == null ? eqz.a.a : $$4.l();
            if ($$5 == eqz.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eqz.a.d || $$5 == eqz.a.d) && $$6 ? false : $$2 != eqz.a.c && $$5 != eqz.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<box> b(box $$0) {
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

   public static class a implements Predicate<box> {
      private final cqm a;

      public a(cqm $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable box $$0) {
         if (!$$0.bA()) {
            return false;
         } else {
            return !($$0 instanceof bpp $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
