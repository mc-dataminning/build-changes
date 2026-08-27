import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bil {
   public static final Predicate<bii> a = bii::bv;
   public static final Predicate<bii> b = $$0 -> $$0.bv() && $$0 instanceof biy;
   public static final Predicate<bii> c = $$0 -> $$0.bv() && !$$0.bO() && !$$0.bN();
   public static final Predicate<bii> d = $$0 -> $$0 instanceof bgj && $$0.bv();
   public static final Predicate<bii> e = $$0 -> !($$0 instanceof cbn) || !$$0.G_() && !((cbn)$$0).f();
   public static final Predicate<bii> f = $$0 -> !$$0.G_();
   public static final Predicate<bii> g = f.and(bii::bx);

   private bil() {
   }

   public static Predicate<bii> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bii> a(bii $$0) {
      eif $$1 = $$0.cf();
      eif.a $$2 = $$1 == null ? eif.a.a : $$1.l();
      return (Predicate<bii>)($$2 == eif.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bs()) {
            return false;
         } else if (!$$0.dK().B || $$3 instanceof cbn && ((cbn)$$3).g()) {
            eif $$4 = $$3.cf();
            eif.a $$5 = $$4 == null ? eif.a.a : $$4.l();
            if ($$5 == eif.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eif.a.d || $$5 == eif.a.d) && $$6 ? false : $$2 != eif.a.c && $$5 != eif.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bii> b(bii $$0) {
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

   public static class a implements Predicate<bii> {
      private final ciy a;

      public a(ciy $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bii $$0) {
         if (!$$0.bv()) {
            return false;
         } else {
            return !($$0 instanceof biy $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
