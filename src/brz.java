import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class brz {
   public static final Predicate<bru> a = bru::bD;
   public static final Predicate<bru> b = $$0 -> $$0.bD() && $$0 instanceof bso;
   public static final Predicate<bru> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<bru> d = $$0 -> $$0 instanceof bpn && $$0.bD();
   public static final Predicate<bru> e = $$0 -> !($$0 instanceof clw) || !$$0.N_() && !((clw)$$0).f();
   public static final Predicate<bru> f = $$0 -> !$$0.N_();
   public static final Predicate<bru> g = f.and(bru::bF);

   private brz() {
   }

   public static Predicate<bru> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bru> a(bru $$0) {
      evq $$1 = $$0.cj();
      evq.a $$2 = $$1 == null ? evq.a.a : $$1.l();
      return (Predicate<bru>)($$2 == evq.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof clw && ((clw)$$3).g()) {
            evq $$4 = $$3.cj();
            evq.a $$5 = $$4 == null ? evq.a.a : $$4.l();
            if ($$5 == evq.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == evq.a.d || $$5 == evq.a.d) && $$6 ? false : $$2 != evq.a.c && $$5 != evq.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bru> b(bru $$0) {
      return $$1 -> {
         while ($$1.bR()) {
            $$1 = $$1.dc();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bru> {
      private final cto a;

      public a(cto $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bru $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof bso $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
