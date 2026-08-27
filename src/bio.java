import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bio {
   public static final Predicate<bil> a = bil::bv;
   public static final Predicate<bil> b = $$0 -> $$0.bv() && $$0 instanceof bjb;
   public static final Predicate<bil> c = $$0 -> $$0.bv() && !$$0.bO() && !$$0.bN();
   public static final Predicate<bil> d = $$0 -> $$0 instanceof bgm && $$0.bv();
   public static final Predicate<bil> e = $$0 -> !($$0 instanceof cbp) || !$$0.G_() && !((cbp)$$0).f();
   public static final Predicate<bil> f = $$0 -> !$$0.G_();
   public static final Predicate<bil> g = f.and(bil::bx);

   private bio() {
   }

   public static Predicate<bil> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bil> a(bil $$0) {
      eij $$1 = $$0.cf();
      eij.a $$2 = $$1 == null ? eij.a.a : $$1.l();
      return (Predicate<bil>)($$2 == eij.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bs()) {
            return false;
         } else if (!$$0.dK().B || $$3 instanceof cbp && ((cbp)$$3).g()) {
            eij $$4 = $$3.cf();
            eij.a $$5 = $$4 == null ? eij.a.a : $$4.l();
            if ($$5 == eij.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eij.a.d || $$5 == eij.a.d) && $$6 ? false : $$2 != eij.a.c && $$5 != eij.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bil> b(bil $$0) {
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

   public static class a implements Predicate<bil> {
      private final cja a;

      public a(cja $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bil $$0) {
         if (!$$0.bv()) {
            return false;
         } else {
            return !($$0 instanceof bjb $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
