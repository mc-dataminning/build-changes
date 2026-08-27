import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsb {
   public static final Predicate<brw> a = brw::bD;
   public static final Predicate<brw> b = $$0 -> $$0.bD() && $$0 instanceof bsq;
   public static final Predicate<brw> c = $$0 -> $$0.bD() && !$$0.bS() && !$$0.bR();
   public static final Predicate<brw> d = $$0 -> $$0 instanceof bpp && $$0.bD();
   public static final Predicate<brw> e = $$0 -> !($$0 instanceof cly) || !$$0.N_() && !((cly)$$0).f();
   public static final Predicate<brw> f = $$0 -> !$$0.N_();
   public static final Predicate<brw> g = f.and(brw::bF);

   private bsb() {
   }

   public static Predicate<brw> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<brw> a(brw $$0) {
      evs $$1 = $$0.cj();
      evs.a $$2 = $$1 == null ? evs.a.a : $$1.l();
      return (Predicate<brw>)($$2 == evs.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bA()) {
            return false;
         } else if (!$$0.dP().B || $$3 instanceof cly && ((cly)$$3).g()) {
            evs $$4 = $$3.cj();
            evs.a $$5 = $$4 == null ? evs.a.a : $$4.l();
            if ($$5 == evs.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == evs.a.d || $$5 == evs.a.d) && $$6 ? false : $$2 != evs.a.c && $$5 != evs.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<brw> b(brw $$0) {
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

   public static class a implements Predicate<brw> {
      private final ctq a;

      public a(ctq $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable brw $$0) {
         if (!$$0.bD()) {
            return false;
         } else {
            return !($$0 instanceof bsq $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
