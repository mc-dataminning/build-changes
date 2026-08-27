import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bpb {
   public static final Predicate<bow> a = bow::bA;
   public static final Predicate<bow> b = $$0 -> $$0.bA() && $$0 instanceof bpo;
   public static final Predicate<bow> c = $$0 -> $$0.bA() && !$$0.bP() && !$$0.bO();
   public static final Predicate<bow> d = $$0 -> $$0 instanceof bmv && $$0.bA();
   public static final Predicate<bow> e = $$0 -> !($$0 instanceof cis) || !$$0.N_() && !((cis)$$0).f();
   public static final Predicate<bow> f = $$0 -> !$$0.N_();
   public static final Predicate<bow> g = f.and(bow::bC);

   private bpb() {
   }

   public static Predicate<bow> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bow> a(bow $$0) {
      eqx $$1 = $$0.cg();
      eqx.a $$2 = $$1 == null ? eqx.a.a : $$1.l();
      return (Predicate<bow>)($$2 == eqx.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bx()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof cis && ((cis)$$3).g()) {
            eqx $$4 = $$3.cg();
            eqx.a $$5 = $$4 == null ? eqx.a.a : $$4.l();
            if ($$5 == eqx.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eqx.a.d || $$5 == eqx.a.d) && $$6 ? false : $$2 != eqx.a.c && $$5 != eqx.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bow> b(bow $$0) {
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

   public static class a implements Predicate<bow> {
      private final cqk a;

      public a(cqk $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bow $$0) {
         if (!$$0.bA()) {
            return false;
         } else {
            return !($$0 instanceof bpo $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
