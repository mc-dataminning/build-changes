import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class btw {
   public static final Predicate<btr> a = btr::bI;
   public static final Predicate<btr> b = $$0 -> $$0.bI() && $$0 instanceof bun;
   public static final Predicate<btr> c = $$0 -> $$0.bI() && !$$0.bX() && !$$0.bW();
   public static final Predicate<btr> d = $$0 -> $$0 instanceof brl && $$0.bI();
   public static final Predicate<btr> e = $$0 -> !($$0 instanceof cnx) || !$$0.Q_() && !((cnx)$$0).f();
   public static final Predicate<btr> f = $$0 -> !$$0.Q_();
   public static final Predicate<btr> g = f.and(btr::bK);
   public static final Predicate<btr> h = f.and(btr::bE);

   private btw() {
   }

   public static Predicate<btr> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<btr> a(btr $$0) {
      fad $$1 = $$0.co();
      fad.a $$2 = $$1 == null ? fad.a.a : $$1.l();
      return (Predicate<btr>)($$2 == fad.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bF()) {
            return false;
         } else if (!$$0.dS().B || $$3 instanceof cnx && ((cnx)$$3).g()) {
            fad $$4 = $$3.co();
            fad.a $$5 = $$4 == null ? fad.a.a : $$4.l();
            if ($$5 == fad.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fad.a.d || $$5 == fad.a.d) && $$6 ? false : $$2 != fad.a.c && $$5 != fad.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<btr> b(btr $$0) {
      return $$1 -> {
         while ($$1.bW()) {
            $$1 = $$1.dg();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<btr> {
      private final cvs a;

      public a(cvs $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable btr $$0) {
         if (!$$0.bI()) {
            return false;
         } else {
            return !($$0 instanceof bun $$1) ? false : $$1.e(this.a);
         }
      }
   }
}
