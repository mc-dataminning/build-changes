import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsu {
   public static final Predicate<bsp> a = bsp::bD;
   public static final Predicate<bsp> b = $$0 -> $$0.bD() && $$0 instanceof btk;
   public static final Predicate<bsp> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<bsp> d = $$0 -> $$0 instanceof bqi && $$0.bD();
   public static final Predicate<bsp> e = $$0 -> !($$0 instanceof cms) || !$$0.N_() && !((cms)$$0).f();
   public static final Predicate<bsp> f = $$0 -> !$$0.N_();
   public static final Predicate<bsp> g = f.and(bsp::bF);

   private bsu() {
   }

   public static Predicate<bsp> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsp> a(bsp $$0) {
      ews $$1 = $$0.cj();
      ews.a $$2 = $$1 == null ? ews.a.a : $$1.l();
      return (Predicate<bsp>)($$2 == ews.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof cms && ((cms)$$3).g()) {
            ews $$4 = $$3.cj();
            ews.a $$5 = $$4 == null ? ews.a.a : $$4.l();
            if ($$5 == ews.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ews.a.d || $$5 == ews.a.d) && $$6 ? false : $$2 != ews.a.c && $$5 != ews.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsp> b(bsp $$0) {
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

   public static class a implements Predicate<bsp> {
      private final cuk a;

      public a(cuk $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsp $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof btk $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
