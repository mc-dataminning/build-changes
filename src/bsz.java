import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsz {
   public static final Predicate<bsu> a = bsu::bD;
   public static final Predicate<bsu> b = $$0 -> $$0.bD() && $$0 instanceof btp;
   public static final Predicate<bsu> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<bsu> d = $$0 -> $$0 instanceof bqn && $$0.bD();
   public static final Predicate<bsu> e = $$0 -> !($$0 instanceof cmx) || !$$0.N_() && !((cmx)$$0).f();
   public static final Predicate<bsu> f = $$0 -> !$$0.N_();
   public static final Predicate<bsu> g = f.and(bsu::bF);

   private bsz() {
   }

   public static Predicate<bsu> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsu> a(bsu $$0) {
      ewx $$1 = $$0.cj();
      ewx.a $$2 = $$1 == null ? ewx.a.a : $$1.l();
      return (Predicate<bsu>)($$2 == ewx.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof cmx && ((cmx)$$3).g()) {
            ewx $$4 = $$3.cj();
            ewx.a $$5 = $$4 == null ? ewx.a.a : $$4.l();
            if ($$5 == ewx.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ewx.a.d || $$5 == ewx.a.d) && $$6 ? false : $$2 != ewx.a.c && $$5 != ewx.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsu> b(bsu $$0) {
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

   public static class a implements Predicate<bsu> {
      private final cup a;

      public a(cup $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsu $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof btp $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
