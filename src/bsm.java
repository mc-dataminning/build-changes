import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsm {
   public static final Predicate<bsh> a = bsh::bF;
   public static final Predicate<bsh> b = $$0 -> $$0.bF() && $$0 instanceof btc;
   public static final Predicate<bsh> c = $$0 -> $$0.bF() && !$$0.bU() && !$$0.bT();
   public static final Predicate<bsh> d = $$0 -> $$0 instanceof bqa && $$0.bF();
   public static final Predicate<bsh> e = $$0 -> !($$0 instanceof cml) || !$$0.N_() && !((cml)$$0).f();
   public static final Predicate<bsh> f = $$0 -> !$$0.N_();
   public static final Predicate<bsh> g = f.and(bsh::bH);

   private bsm() {
   }

   public static Predicate<bsh> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsh> a(bsh $$0) {
      exn $$1 = $$0.cl();
      exn.a $$2 = $$1 == null ? exn.a.a : $$1.l();
      return (Predicate<bsh>)($$2 == exn.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bC()) {
            return false;
         } else if (!$$0.dR().B || $$3 instanceof cml && ((cml)$$3).g()) {
            exn $$4 = $$3.cl();
            exn.a $$5 = $$4 == null ? exn.a.a : $$4.l();
            if ($$5 == exn.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == exn.a.d || $$5 == exn.a.d) && $$6 ? false : $$2 != exn.a.c && $$5 != exn.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsh> b(bsh $$0) {
      return $$1 -> {
         while ($$1.bT()) {
            $$1 = $$1.de();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bsh> {
      private final cud a;

      public a(cud $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsh $$0) {
         if (!$$0.bF()) {
            return false;
         } else {
            return !($$0 instanceof btc $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
