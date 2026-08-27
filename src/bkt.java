import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bkt {
   public static final Predicate<bkq> a = bkq::bx;
   public static final Predicate<bkq> b = $$0 -> $$0.bx() && $$0 instanceof blg;
   public static final Predicate<bkq> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<bkq> d = $$0 -> $$0 instanceof biq && $$0.bx();
   public static final Predicate<bkq> e = $$0 -> !($$0 instanceof cdu) || !$$0.O_() && !((cdu)$$0).f();
   public static final Predicate<bkq> f = $$0 -> !$$0.O_();
   public static final Predicate<bkq> g = f.and(bkq::bz);

   private bkt() {
   }

   public static Predicate<bkq> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bkq> a(bkq $$0) {
      ekv $$1 = $$0.cg();
      ekv.a $$2 = $$1 == null ? ekv.a.a : $$1.l();
      return (Predicate<bkq>)($$2 == ekv.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dN().B || $$3 instanceof cdu && ((cdu)$$3).g()) {
            ekv $$4 = $$3.cg();
            ekv.a $$5 = $$4 == null ? ekv.a.a : $$4.l();
            if ($$5 == ekv.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ekv.a.d || $$5 == ekv.a.d) && $$6 ? false : $$2 != ekv.a.c && $$5 != ekv.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bkq> b(bkq $$0) {
      return $$1 -> {
         while ($$1.bO()) {
            $$1 = $$1.da();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bkq> {
      private final clj a;

      public a(clj $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bkq $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof blg $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
