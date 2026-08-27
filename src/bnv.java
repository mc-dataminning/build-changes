import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bnv {
   public static final Predicate<bnq> a = bnq::bx;
   public static final Predicate<bnq> b = $$0 -> $$0.bx() && $$0 instanceof boi;
   public static final Predicate<bnq> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<bnq> d = $$0 -> $$0 instanceof blp && $$0.bx();
   public static final Predicate<bnq> e = $$0 -> !($$0 instanceof chl) || !$$0.P_() && !((chl)$$0).f();
   public static final Predicate<bnq> f = $$0 -> !$$0.P_();
   public static final Predicate<bnq> g = f.and(bnq::bz);

   private bnv() {
   }

   public static Predicate<bnq> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bnq> a(bnq $$0) {
      epf $$1 = $$0.cg();
      epf.a $$2 = $$1 == null ? epf.a.a : $$1.l();
      return (Predicate<bnq>)($$2 == epf.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof chl && ((chl)$$3).g()) {
            epf $$4 = $$3.cg();
            epf.a $$5 = $$4 == null ? epf.a.a : $$4.l();
            if ($$5 == epf.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == epf.a.d || $$5 == epf.a.d) && $$6 ? false : $$2 != epf.a.c && $$5 != epf.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bnq> b(bnq $$0) {
      return $$1 -> {
         while ($$1.bO()) {
            $$1 = $$1.cZ();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bnq> {
      private final cpd a;

      public a(cpd $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bnq $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof boi $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
