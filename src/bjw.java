import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bjw {
   public static final Predicate<bjt> a = bjt::bv;
   public static final Predicate<bjt> b = $$0 -> $$0.bv() && $$0 instanceof bkj;
   public static final Predicate<bjt> c = $$0 -> $$0.bv() && !$$0.bO() && !$$0.bN();
   public static final Predicate<bjt> d = $$0 -> $$0 instanceof bhu && $$0.bv();
   public static final Predicate<bjt> e = $$0 -> !($$0 instanceof ccx) || !$$0.N_() && !((ccx)$$0).f();
   public static final Predicate<bjt> f = $$0 -> !$$0.N_();
   public static final Predicate<bjt> g = f.and(bjt::bx);

   private bjw() {
   }

   public static Predicate<bjt> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bjt> a(bjt $$0) {
      ejg $$1 = $$0.cf();
      ejg.a $$2 = $$1 == null ? ejg.a.a : $$1.l();
      return (Predicate<bjt>)($$2 == ejg.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bs()) {
            return false;
         } else if (!$$0.dL().B || $$3 instanceof ccx && ((ccx)$$3).g()) {
            ejg $$4 = $$3.cf();
            ejg.a $$5 = $$4 == null ? ejg.a.a : $$4.l();
            if ($$5 == ejg.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ejg.a.d || $$5 == ejg.a.d) && $$6 ? false : $$2 != ejg.a.c && $$5 != ejg.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bjt> b(bjt $$0) {
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

   public static class a implements Predicate<bjt> {
      private final ckj a;

      public a(ckj $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bjt $$0) {
         if (!$$0.bv()) {
            return false;
         } else {
            return !($$0 instanceof bkj $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
