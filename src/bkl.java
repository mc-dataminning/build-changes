import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bkl {
   public static final Predicate<bki> a = bki::bv;
   public static final Predicate<bki> b = $$0 -> $$0.bv() && $$0 instanceof bky;
   public static final Predicate<bki> c = $$0 -> $$0.bv() && !$$0.bO() && !$$0.bN();
   public static final Predicate<bki> d = $$0 -> $$0 instanceof bij && $$0.bv();
   public static final Predicate<bki> e = $$0 -> !($$0 instanceof cdm) || !$$0.N_() && !((cdm)$$0).f();
   public static final Predicate<bki> f = $$0 -> !$$0.N_();
   public static final Predicate<bki> g = f.and(bki::bx);

   private bkl() {
   }

   public static Predicate<bki> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bki> a(bki $$0) {
      ekj $$1 = $$0.cf();
      ekj.a $$2 = $$1 == null ? ekj.a.a : $$1.l();
      return (Predicate<bki>)($$2 == ekj.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bs()) {
            return false;
         } else if (!$$0.dL().B || $$3 instanceof cdm && ((cdm)$$3).g()) {
            ekj $$4 = $$3.cf();
            ekj.a $$5 = $$4 == null ? ekj.a.a : $$4.l();
            if ($$5 == ekj.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ekj.a.d || $$5 == ekj.a.d) && $$6 ? false : $$2 != ekj.a.c && $$5 != ekj.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bki> b(bki $$0) {
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

   public static class a implements Predicate<bki> {
      private final clb a;

      public a(clb $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bki $$0) {
         if (!$$0.bv()) {
            return false;
         } else {
            return !($$0 instanceof bky $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
