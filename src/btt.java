import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class btt {
   public static final Predicate<bto> a = bto::bI;
   public static final Predicate<bto> b = $$0 -> $$0.bI() && $$0 instanceof buk;
   public static final Predicate<bto> c = $$0 -> $$0.bI() && !$$0.bX() && !$$0.bW();
   public static final Predicate<bto> d = $$0 -> $$0 instanceof bri && $$0.bI();
   public static final Predicate<bto> e = $$0 -> !($$0 instanceof cnu) || !$$0.P_() && !((cnu)$$0).f();
   public static final Predicate<bto> f = $$0 -> !$$0.P_();
   public static final Predicate<bto> g = f.and(bto::bK);
   public static final Predicate<bto> h = f.and(bto::bE);

   private btt() {
   }

   public static Predicate<bto> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bto> a(bto $$0) {
      ezz $$1 = $$0.co();
      ezz.a $$2 = $$1 == null ? ezz.a.a : $$1.l();
      return (Predicate<bto>)($$2 == ezz.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bF()) {
            return false;
         } else if (!$$0.dS().B || $$3 instanceof cnu && ((cnu)$$3).g()) {
            ezz $$4 = $$3.co();
            ezz.a $$5 = $$4 == null ? ezz.a.a : $$4.l();
            if ($$5 == ezz.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ezz.a.d || $$5 == ezz.a.d) && $$6 ? false : $$2 != ezz.a.c && $$5 != ezz.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bto> b(bto $$0) {
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

   public static class a implements Predicate<bto> {
      private final cvp a;

      public a(cvp $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bto $$0) {
         if (!$$0.bI()) {
            return false;
         } else {
            return !($$0 instanceof buk $$1) ? false : $$1.e(this.a);
         }
      }
   }
}
