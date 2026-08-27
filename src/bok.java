import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bok {
   public static final Predicate<bof> a = bof::bx;
   public static final Predicate<bof> b = $$0 -> $$0.bx() && $$0 instanceof box;
   public static final Predicate<bof> c = $$0 -> $$0.bx() && !$$0.bM() && !$$0.bL();
   public static final Predicate<bof> d = $$0 -> $$0 instanceof bme && $$0.bx();
   public static final Predicate<bof> e = $$0 -> !($$0 instanceof cia) || !$$0.P_() && !((cia)$$0).f();
   public static final Predicate<bof> f = $$0 -> !$$0.P_();
   public static final Predicate<bof> g = f.and(bof::bz);

   private bok() {
   }

   public static Predicate<bof> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bof> a(bof $$0) {
      eqb $$1 = $$0.cd();
      eqb.a $$2 = $$1 == null ? eqb.a.a : $$1.l();
      return (Predicate<bof>)($$2 == eqb.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dJ().B || $$3 instanceof cia && ((cia)$$3).g()) {
            eqb $$4 = $$3.cd();
            eqb.a $$5 = $$4 == null ? eqb.a.a : $$4.l();
            if ($$5 == eqb.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eqb.a.d || $$5 == eqb.a.d) && $$6 ? false : $$2 != eqb.a.c && $$5 != eqb.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bof> b(bof $$0) {
      return $$1 -> {
         while ($$1.bL()) {
            $$1 = $$1.cW();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bof> {
      private final cpq a;

      public a(cpq $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bof $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof box $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
