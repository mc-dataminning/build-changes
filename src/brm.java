import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class brm {
   public static final Predicate<brh> a = brh::bB;
   public static final Predicate<brh> b = $$0 -> $$0.bB() && $$0 instanceof bsa;
   public static final Predicate<brh> c = $$0 -> $$0.bB() && !$$0.bQ() && !$$0.bP();
   public static final Predicate<brh> d = $$0 -> $$0 instanceof bpf && $$0.bB();
   public static final Predicate<brh> e = $$0 -> !($$0 instanceof clh) || !$$0.N_() && !((clh)$$0).f();
   public static final Predicate<brh> f = $$0 -> !$$0.N_();
   public static final Predicate<brh> g = f.and(brh::bD);

   private brm() {
   }

   public static Predicate<brh> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<brh> a(brh $$0) {
      euv $$1 = $$0.ch();
      euv.a $$2 = $$1 == null ? euv.a.a : $$1.l();
      return (Predicate<brh>)($$2 == euv.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.by()) {
            return false;
         } else if (!$$0.dN().B || $$3 instanceof clh && ((clh)$$3).g()) {
            euv $$4 = $$3.ch();
            euv.a $$5 = $$4 == null ? euv.a.a : $$4.l();
            if ($$5 == euv.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == euv.a.d || $$5 == euv.a.d) && $$6 ? false : $$2 != euv.a.c && $$5 != euv.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<brh> b(brh $$0) {
      return $$1 -> {
         while ($$1.bP()) {
            $$1 = $$1.da();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<brh> {
      private final csz a;

      public a(csz $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable brh $$0) {
         if (!$$0.bB()) {
            return false;
         } else {
            return !($$0 instanceof bsa $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
