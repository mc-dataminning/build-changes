import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsi {
   public static final Predicate<bsd> a = bsd::bD;
   public static final Predicate<bsd> b = $$0 -> $$0.bD() && $$0 instanceof bsy;
   public static final Predicate<bsd> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<bsd> d = $$0 -> $$0 instanceof bpw && $$0.bD();
   public static final Predicate<bsd> e = $$0 -> !($$0 instanceof cmh) || !$$0.N_() && !((cmh)$$0).f();
   public static final Predicate<bsd> f = $$0 -> !$$0.N_();
   public static final Predicate<bsd> g = f.and(bsd::bF);

   private bsi() {
   }

   public static Predicate<bsd> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsd> a(bsd $$0) {
      exf $$1 = $$0.cj();
      exf.a $$2 = $$1 == null ? exf.a.a : $$1.l();
      return (Predicate<bsd>)($$2 == exf.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof cmh && ((cmh)$$3).g()) {
            exf $$4 = $$3.cj();
            exf.a $$5 = $$4 == null ? exf.a.a : $$4.l();
            if ($$5 == exf.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == exf.a.d || $$5 == exf.a.d) && $$6 ? false : $$2 != exf.a.c && $$5 != exf.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsd> b(bsd $$0) {
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

   public static class a implements Predicate<bsd> {
      private final cua a;

      public a(cua $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsd $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof bsy $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
