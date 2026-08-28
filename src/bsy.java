import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsy {
   public static final Predicate<bst> a = bst::bD;
   public static final Predicate<bst> b = $$0 -> $$0.bD() && $$0 instanceof bto;
   public static final Predicate<bst> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<bst> d = $$0 -> $$0 instanceof bqm && $$0.bD();
   public static final Predicate<bst> e = $$0 -> !($$0 instanceof cmw) || !$$0.N_() && !((cmw)$$0).f();
   public static final Predicate<bst> f = $$0 -> !$$0.N_();
   public static final Predicate<bst> g = f.and(bst::bF);

   private bsy() {
   }

   public static Predicate<bst> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bst> a(bst $$0) {
      eww $$1 = $$0.cj();
      eww.a $$2 = $$1 == null ? eww.a.a : $$1.l();
      return (Predicate<bst>)($$2 == eww.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof cmw && ((cmw)$$3).g()) {
            eww $$4 = $$3.cj();
            eww.a $$5 = $$4 == null ? eww.a.a : $$4.l();
            if ($$5 == eww.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eww.a.d || $$5 == eww.a.d) && $$6 ? false : $$2 != eww.a.c && $$5 != eww.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bst> b(bst $$0) {
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

   public static class a implements Predicate<bst> {
      private final cuo a;

      public a(cuo $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bst $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof bto $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
