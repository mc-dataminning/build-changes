import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bta {
   public static final Predicate<bsv> a = bsv::bD;
   public static final Predicate<bsv> b = $$0 -> $$0.bD() && $$0 instanceof btq;
   public static final Predicate<bsv> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<bsv> d = $$0 -> $$0 instanceof bqo && $$0.bD();
   public static final Predicate<bsv> e = $$0 -> !($$0 instanceof cmy) || !$$0.N_() && !((cmy)$$0).f();
   public static final Predicate<bsv> f = $$0 -> !$$0.N_();
   public static final Predicate<bsv> g = f.and(bsv::bF);

   private bta() {
   }

   public static Predicate<bsv> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsv> a(bsv $$0) {
      ewy $$1 = $$0.cj();
      ewy.a $$2 = $$1 == null ? ewy.a.a : $$1.l();
      return (Predicate<bsv>)($$2 == ewy.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof cmy && ((cmy)$$3).g()) {
            ewy $$4 = $$3.cj();
            ewy.a $$5 = $$4 == null ? ewy.a.a : $$4.l();
            if ($$5 == ewy.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ewy.a.d || $$5 == ewy.a.d) && $$6 ? false : $$2 != ewy.a.c && $$5 != ewy.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsv> b(bsv $$0) {
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

   public static class a implements Predicate<bsv> {
      private final cuq a;

      public a(cuq $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsv $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof btq $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
