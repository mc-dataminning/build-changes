import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class biv {
   public static final Predicate<bis> a = bis::bv;
   public static final Predicate<bis> b = $$0 -> $$0.bv() && $$0 instanceof bji;
   public static final Predicate<bis> c = $$0 -> $$0.bv() && !$$0.bO() && !$$0.bN();
   public static final Predicate<bis> d = $$0 -> $$0 instanceof bgt && $$0.bv();
   public static final Predicate<bis> e = $$0 -> !($$0 instanceof cbw) || !$$0.M_() && !((cbw)$$0).f();
   public static final Predicate<bis> f = $$0 -> !$$0.M_();
   public static final Predicate<bis> g = f.and(bis::bx);

   private biv() {
   }

   public static Predicate<bis> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bis> a(bis $$0) {
      eiq $$1 = $$0.cf();
      eiq.a $$2 = $$1 == null ? eiq.a.a : $$1.l();
      return (Predicate<bis>)($$2 == eiq.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bs()) {
            return false;
         } else if (!$$0.dL().B || $$3 instanceof cbw && ((cbw)$$3).g()) {
            eiq $$4 = $$3.cf();
            eiq.a $$5 = $$4 == null ? eiq.a.a : $$4.l();
            if ($$5 == eiq.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eiq.a.d || $$5 == eiq.a.d) && $$6 ? false : $$2 != eiq.a.c && $$5 != eiq.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bis> b(bis $$0) {
      return $$1 -> {
         while ($$1.bN()) {
            $$1 = $$1.cY();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bis> {
      private final cjh a;

      public a(cjh $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bis $$0) {
         if (!$$0.bv()) {
            return false;
         } else {
            return !($$0 instanceof bji $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
