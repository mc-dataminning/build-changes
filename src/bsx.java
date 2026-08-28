import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsx {
   public static final Predicate<bss> a = bss::bD;
   public static final Predicate<bss> b = $$0 -> $$0.bD() && $$0 instanceof btn;
   public static final Predicate<bss> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<bss> d = $$0 -> $$0 instanceof bql && $$0.bD();
   public static final Predicate<bss> e = $$0 -> !($$0 instanceof cmv) || !$$0.N_() && !((cmv)$$0).f();
   public static final Predicate<bss> f = $$0 -> !$$0.N_();
   public static final Predicate<bss> g = f.and(bss::bF);

   private bsx() {
   }

   public static Predicate<bss> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bss> a(bss $$0) {
      ewv $$1 = $$0.cj();
      ewv.a $$2 = $$1 == null ? ewv.a.a : $$1.l();
      return (Predicate<bss>)($$2 == ewv.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof cmv && ((cmv)$$3).g()) {
            ewv $$4 = $$3.cj();
            ewv.a $$5 = $$4 == null ? ewv.a.a : $$4.l();
            if ($$5 == ewv.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ewv.a.d || $$5 == ewv.a.d) && $$6 ? false : $$2 != ewv.a.c && $$5 != ewv.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bss> b(bss $$0) {
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

   public static class a implements Predicate<bss> {
      private final cun a;

      public a(cun $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bss $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof btn $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
