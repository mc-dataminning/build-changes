import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class blx {
   public static final Predicate<blu> a = blu::bx;
   public static final Predicate<blu> b = $$0 -> $$0.bx() && $$0 instanceof bmk;
   public static final Predicate<blu> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<blu> d = $$0 -> $$0 instanceof bjt && $$0.bx();
   public static final Predicate<blu> e = $$0 -> !($$0 instanceof cfh) || !$$0.P_() && !((cfh)$$0).f();
   public static final Predicate<blu> f = $$0 -> !$$0.P_();
   public static final Predicate<blu> g = f.and(blu::bz);

   private blx() {
   }

   public static Predicate<blu> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<blu> a(blu $$0) {
      emy $$1 = $$0.cg();
      emy.a $$2 = $$1 == null ? emy.a.a : $$1.l();
      return (Predicate<blu>)($$2 == emy.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof cfh && ((cfh)$$3).g()) {
            emy $$4 = $$3.cg();
            emy.a $$5 = $$4 == null ? emy.a.a : $$4.l();
            if ($$5 == emy.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == emy.a.d || $$5 == emy.a.d) && $$6 ? false : $$2 != emy.a.c && $$5 != emy.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<blu> b(blu $$0) {
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

   public static class a implements Predicate<blu> {
      private final cmx a;

      public a(cmx $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable blu $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof bmk $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
