import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bqa {
   public static final Predicate<bpv> a = bpv::bA;
   public static final Predicate<bpv> b = $$0 -> $$0.bA() && $$0 instanceof bqo;
   public static final Predicate<bpv> c = $$0 -> $$0.bA() && !$$0.bP() && !$$0.bO();
   public static final Predicate<bpv> d = $$0 -> $$0 instanceof bnt && $$0.bA();
   public static final Predicate<bpv> e = $$0 -> !($$0 instanceof cjt) || !$$0.N_() && !((cjt)$$0).f();
   public static final Predicate<bpv> f = $$0 -> !$$0.N_();
   public static final Predicate<bpv> g = f.and(bpv::bC);

   private bqa() {
   }

   public static Predicate<bpv> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bpv> a(bpv $$0) {
      etg $$1 = $$0.cg();
      etg.a $$2 = $$1 == null ? etg.a.a : $$1.l();
      return (Predicate<bpv>)($$2 == etg.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bx()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof cjt && ((cjt)$$3).g()) {
            etg $$4 = $$3.cg();
            etg.a $$5 = $$4 == null ? etg.a.a : $$4.l();
            if ($$5 == etg.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == etg.a.d || $$5 == etg.a.d) && $$6 ? false : $$2 != etg.a.c && $$5 != etg.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bpv> b(bpv $$0) {
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

   public static class a implements Predicate<bpv> {
      private final crj a;

      public a(crj $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bpv $$0) {
         if (!$$0.bA()) {
            return false;
         } else {
            return !($$0 instanceof bqo $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
