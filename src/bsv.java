import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsv {
   public static final Predicate<bsq> a = bsq::bE;
   public static final Predicate<bsq> b = $$0 -> $$0.bE() && $$0 instanceof btl;
   public static final Predicate<bsq> c = $$0 -> $$0.bE() && !$$0.bT() && !$$0.bS();
   public static final Predicate<bsq> d = $$0 -> $$0 instanceof bqj && $$0.bE();
   public static final Predicate<bsq> e = $$0 -> !($$0 instanceof cmv) || !$$0.N_() && !((cmv)$$0).f();
   public static final Predicate<bsq> f = $$0 -> !$$0.N_();
   public static final Predicate<bsq> g = f.and(bsq::bG);

   private bsv() {
   }

   public static Predicate<bsq> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsq> a(bsq $$0) {
      eyc $$1 = $$0.ck();
      eyc.a $$2 = $$1 == null ? eyc.a.a : $$1.l();
      return (Predicate<bsq>)($$2 == eyc.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bB()) {
            return false;
         } else if (!$$0.dQ().B || $$3 instanceof cmv && ((cmv)$$3).g()) {
            eyc $$4 = $$3.ck();
            eyc.a $$5 = $$4 == null ? eyc.a.a : $$4.l();
            if ($$5 == eyc.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eyc.a.d || $$5 == eyc.a.d) && $$6 ? false : $$2 != eyc.a.c && $$5 != eyc.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsq> b(bsq $$0) {
      return $$1 -> {
         while ($$1.bS()) {
            $$1 = $$1.dd();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bsq> {
      private final cuo a;

      public a(cuo $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsq $$0) {
         if (!$$0.bE()) {
            return false;
         } else {
            return !($$0 instanceof btl $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
