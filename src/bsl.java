import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bsl {
   public static final Predicate<bsg> a = bsg::bE;
   public static final Predicate<bsg> b = $$0 -> $$0.bE() && $$0 instanceof btb;
   public static final Predicate<bsg> c = $$0 -> $$0.bE() && !$$0.bT() && !$$0.bS();
   public static final Predicate<bsg> d = $$0 -> $$0 instanceof bpz && $$0.bE();
   public static final Predicate<bsg> e = $$0 -> !($$0 instanceof cmk) || !$$0.N_() && !((cmk)$$0).f();
   public static final Predicate<bsg> f = $$0 -> !$$0.N_();
   public static final Predicate<bsg> g = f.and(bsg::bG);

   private bsl() {
   }

   public static Predicate<bsg> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bsg> a(bsg $$0) {
      exl $$1 = $$0.ck();
      exl.a $$2 = $$1 == null ? exl.a.a : $$1.l();
      return (Predicate<bsg>)($$2 == exl.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bB()) {
            return false;
         } else if (!$$0.dQ().B || $$3 instanceof cmk && ((cmk)$$3).g()) {
            exl $$4 = $$3.ck();
            exl.a $$5 = $$4 == null ? exl.a.a : $$4.l();
            if ($$5 == exl.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == exl.a.d || $$5 == exl.a.d) && $$6 ? false : $$2 != exl.a.c && $$5 != exl.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bsg> b(bsg $$0) {
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

   public static class a implements Predicate<bsg> {
      private final cuc a;

      public a(cuc $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bsg $$0) {
         if (!$$0.bE()) {
            return false;
         } else {
            return !($$0 instanceof btb $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
