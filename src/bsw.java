import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsw {
   public static final Predicate<bsr> a = bsr::bE;
   public static final Predicate<bsr> b = $$0 -> $$0.bE() && $$0 instanceof btn;
   public static final Predicate<bsr> c = $$0 -> $$0.bE() && !$$0.bT() && !$$0.bS();
   public static final Predicate<bsr> d = $$0 -> $$0 instanceof bqk && $$0.bE();
   public static final Predicate<bsr> e = $$0 -> !($$0 instanceof cmx) || !$$0.R_() && !((cmx)$$0).f();
   public static final Predicate<bsr> f = $$0 -> !$$0.R_();
   public static final Predicate<bsr> g = f.and(bsr::bG);

   private bsw() {
   }

   public static Predicate<bsr> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsr> a(bsr $$0) {
      eyi $$1 = $$0.ck();
      eyi.a $$2 = $$1 == null ? eyi.a.a : $$1.l();
      return (Predicate<bsr>)($$2 == eyi.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bB()) {
            return false;
         } else if (!$$0.dO().B || $$3 instanceof cmx && ((cmx)$$3).g()) {
            eyi $$4 = $$3.ck();
            eyi.a $$5 = $$4 == null ? eyi.a.a : $$4.l();
            if ($$5 == eyi.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eyi.a.d || $$5 == eyi.a.d) && $$6 ? false : $$2 != eyi.a.c && $$5 != eyi.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsr> b(bsr $$0) {
      return $$1 -> {
         while ($$1.bS()) {
            $$1 = $$1.dc();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bsr> {
      private final cuq a;

      public a(cuq $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsr $$0) {
         if (!$$0.bE()) {
            return false;
         } else {
            return !($$0 instanceof btn $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
