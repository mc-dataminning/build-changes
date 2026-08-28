import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class btb {
   public static final Predicate<bsw> a = bsw::bD;
   public static final Predicate<bsw> b = $$0 -> $$0.bD() && $$0 instanceof btr;
   public static final Predicate<bsw> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<bsw> d = $$0 -> $$0 instanceof bqp && $$0.bD();
   public static final Predicate<bsw> e = $$0 -> !($$0 instanceof cmz) || !$$0.N_() && !((cmz)$$0).f();
   public static final Predicate<bsw> f = $$0 -> !$$0.N_();
   public static final Predicate<bsw> g = f.and(bsw::bF);

   private btb() {
   }

   public static Predicate<bsw> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsw> a(bsw $$0) {
      ewz $$1 = $$0.cj();
      ewz.a $$2 = $$1 == null ? ewz.a.a : $$1.l();
      return (Predicate<bsw>)($$2 == ewz.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof cmz && ((cmz)$$3).g()) {
            ewz $$4 = $$3.cj();
            ewz.a $$5 = $$4 == null ? ewz.a.a : $$4.l();
            if ($$5 == ewz.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ewz.a.d || $$5 == ewz.a.d) && $$6 ? false : $$2 != ewz.a.c && $$5 != ewz.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsw> b(bsw $$0) {
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

   public static class a implements Predicate<bsw> {
      private final cur a;

      public a(cur $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsw $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof btr $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
