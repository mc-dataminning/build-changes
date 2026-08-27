import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bmb {
   public static final Predicate<blw> a = blw::bx;
   public static final Predicate<blw> b = $$0 -> $$0.bx() && $$0 instanceof bmo;
   public static final Predicate<blw> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<blw> d = $$0 -> $$0 instanceof bjv && $$0.bx();
   public static final Predicate<blw> e = $$0 -> !($$0 instanceof cfq) || !$$0.P_() && !((cfq)$$0).f();
   public static final Predicate<blw> f = $$0 -> !$$0.P_();
   public static final Predicate<blw> g = f.and(blw::bz);

   private bmb() {
   }

   public static Predicate<blw> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<blw> a(blw $$0) {
      eni $$1 = $$0.cg();
      eni.a $$2 = $$1 == null ? eni.a.a : $$1.l();
      return (Predicate<blw>)($$2 == eni.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dL().B || $$3 instanceof cfq && ((cfq)$$3).g()) {
            eni $$4 = $$3.cg();
            eni.a $$5 = $$4 == null ? eni.a.a : $$4.l();
            if ($$5 == eni.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eni.a.d || $$5 == eni.a.d) && $$6 ? false : $$2 != eni.a.c && $$5 != eni.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<blw> b(blw $$0) {
      return $$1 -> {
         while ($$1.bO()) {
            $$1 = $$1.cZ();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<blw> {
      private final cng a;

      public a(cng $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable blw $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof bmo $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
