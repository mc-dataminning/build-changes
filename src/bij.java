import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bij {
   public static final Predicate<big> a = big::bv;
   public static final Predicate<big> b = $$0 -> $$0.bv() && $$0 instanceof biw;
   public static final Predicate<big> c = $$0 -> $$0.bv() && !$$0.bO() && !$$0.bN();
   public static final Predicate<big> d = $$0 -> $$0 instanceof bgh && $$0.bv();
   public static final Predicate<big> e = $$0 -> !($$0 instanceof cbl) || !$$0.G_() && !((cbl)$$0).f();
   public static final Predicate<big> f = $$0 -> !$$0.G_();
   public static final Predicate<big> g = f.and(big::bx);

   private bij() {
   }

   public static Predicate<big> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<big> a(big $$0) {
      eig $$1 = $$0.cf();
      eig.a $$2 = $$1 == null ? eig.a.a : $$1.l();
      return (Predicate<big>)($$2 == eig.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bs()) {
            return false;
         } else if (!$$0.dK().B || $$3 instanceof cbl && ((cbl)$$3).g()) {
            eig $$4 = $$3.cf();
            eig.a $$5 = $$4 == null ? eig.a.a : $$4.l();
            if ($$5 == eig.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eig.a.d || $$5 == eig.a.d) && $$6 ? false : $$2 != eig.a.c && $$5 != eig.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<big> b(big $$0) {
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

   public static class a implements Predicate<big> {
      private final ciw a;

      public a(ciw $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable big $$0) {
         if (!$$0.bv()) {
            return false;
         } else {
            return !($$0 instanceof biw $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
