import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bqq {
   public static final Predicate<bql> a = bql::bB;
   public static final Predicate<bql> b = $$0 -> $$0.bB() && $$0 instanceof bre;
   public static final Predicate<bql> c = $$0 -> $$0.bB() && !$$0.bQ() && !$$0.bP();
   public static final Predicate<bql> d = $$0 -> $$0 instanceof boj && $$0.bB();
   public static final Predicate<bql> e = $$0 -> !($$0 instanceof ckl) || !$$0.N_() && !((ckl)$$0).f();
   public static final Predicate<bql> f = $$0 -> !$$0.N_();
   public static final Predicate<bql> g = f.and(bql::bD);

   private bqq() {
   }

   public static Predicate<bql> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bql> a(bql $$0) {
      eul $$1 = $$0.ch();
      eul.a $$2 = $$1 == null ? eul.a.a : $$1.l();
      return (Predicate<bql>)($$2 == eul.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.by()) {
            return false;
         } else if (!$$0.dN().B || $$3 instanceof ckl && ((ckl)$$3).g()) {
            eul $$4 = $$3.ch();
            eul.a $$5 = $$4 == null ? eul.a.a : $$4.l();
            if ($$5 == eul.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eul.a.d || $$5 == eul.a.d) && $$6 ? false : $$2 != eul.a.c && $$5 != eul.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bql> b(bql $$0) {
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

   public static class a implements Predicate<bql> {
      private final csd a;

      public a(csd $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bql $$0) {
         if (!$$0.bB()) {
            return false;
         } else {
            return !($$0 instanceof bre $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
