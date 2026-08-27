import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bnt {
   public static final Predicate<bno> a = bno::bx;
   public static final Predicate<bno> b = $$0 -> $$0.bx() && $$0 instanceof bog;
   public static final Predicate<bno> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<bno> d = $$0 -> $$0 instanceof bln && $$0.bx();
   public static final Predicate<bno> e = $$0 -> !($$0 instanceof chh) || !$$0.P_() && !((chh)$$0).f();
   public static final Predicate<bno> f = $$0 -> !$$0.P_();
   public static final Predicate<bno> g = f.and(bno::bz);

   private bnt() {
   }

   public static Predicate<bno> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bno> a(bno $$0) {
      eoy $$1 = $$0.cg();
      eoy.a $$2 = $$1 == null ? eoy.a.a : $$1.l();
      return (Predicate<bno>)($$2 == eoy.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof chh && ((chh)$$3).g()) {
            eoy $$4 = $$3.cg();
            eoy.a $$5 = $$4 == null ? eoy.a.a : $$4.l();
            if ($$5 == eoy.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eoy.a.d || $$5 == eoy.a.d) && $$6 ? false : $$2 != eoy.a.c && $$5 != eoy.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bno> b(bno $$0) {
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

   public static class a implements Predicate<bno> {
      private final coz a;

      public a(coz $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bno $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof bog $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
