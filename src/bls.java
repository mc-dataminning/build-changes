import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bls {
   public static final Predicate<blp> a = blp::bx;
   public static final Predicate<blp> b = $$0 -> $$0.bx() && $$0 instanceof bmf;
   public static final Predicate<blp> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<blp> d = $$0 -> $$0 instanceof bjo && $$0.bx();
   public static final Predicate<blp> e = $$0 -> !($$0 instanceof cfb) || !$$0.P_() && !((cfb)$$0).f();
   public static final Predicate<blp> f = $$0 -> !$$0.P_();
   public static final Predicate<blp> g = f.and(blp::bz);

   private bls() {
   }

   public static Predicate<blp> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<blp> a(blp $$0) {
      ems $$1 = $$0.cg();
      ems.a $$2 = $$1 == null ? ems.a.a : $$1.l();
      return (Predicate<blp>)($$2 == ems.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof cfb && ((cfb)$$3).g()) {
            ems $$4 = $$3.cg();
            ems.a $$5 = $$4 == null ? ems.a.a : $$4.l();
            if ($$5 == ems.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ems.a.d || $$5 == ems.a.d) && $$6 ? false : $$2 != ems.a.c && $$5 != ems.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<blp> b(blp $$0) {
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

   public static class a implements Predicate<blp> {
      private final cmr a;

      public a(cmr $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable blp $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof bmf $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
