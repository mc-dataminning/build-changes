import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bqf {
   public static final Predicate<bqa> a = bqa::bA;
   public static final Predicate<bqa> b = $$0 -> $$0.bA() && $$0 instanceof bqt;
   public static final Predicate<bqa> c = $$0 -> $$0.bA() && !$$0.bP() && !$$0.bO();
   public static final Predicate<bqa> d = $$0 -> $$0 instanceof bny && $$0.bA();
   public static final Predicate<bqa> e = $$0 -> !($$0 instanceof cka) || !$$0.N_() && !((cka)$$0).f();
   public static final Predicate<bqa> f = $$0 -> !$$0.N_();
   public static final Predicate<bqa> g = f.and(bqa::bC);

   private bqf() {
   }

   public static Predicate<bqa> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bqa> a(bqa $$0) {
      etp $$1 = $$0.cg();
      etp.a $$2 = $$1 == null ? etp.a.a : $$1.l();
      return (Predicate<bqa>)($$2 == etp.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bx()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof cka && ((cka)$$3).g()) {
            etp $$4 = $$3.cg();
            etp.a $$5 = $$4 == null ? etp.a.a : $$4.l();
            if ($$5 == etp.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == etp.a.d || $$5 == etp.a.d) && $$6 ? false : $$2 != etp.a.c && $$5 != etp.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bqa> b(bqa $$0) {
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

   public static class a implements Predicate<bqa> {
      private final crs a;

      public a(crs $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bqa $$0) {
         if (!$$0.bA()) {
            return false;
         } else {
            return !($$0 instanceof bqt $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
