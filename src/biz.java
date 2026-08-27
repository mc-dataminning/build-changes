import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class biz {
   public static final Predicate<biw> a = biw::bv;
   public static final Predicate<biw> b = $$0 -> $$0.bv() && $$0 instanceof bjm;
   public static final Predicate<biw> c = $$0 -> $$0.bv() && !$$0.bO() && !$$0.bN();
   public static final Predicate<biw> d = $$0 -> $$0 instanceof bgx && $$0.bv();
   public static final Predicate<biw> e = $$0 -> !($$0 instanceof cca) || !$$0.M_() && !((cca)$$0).f();
   public static final Predicate<biw> f = $$0 -> !$$0.M_();
   public static final Predicate<biw> g = f.and(biw::bx);

   private biz() {
   }

   public static Predicate<biw> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<biw> a(biw $$0) {
      eii $$1 = $$0.cf();
      eii.a $$2 = $$1 == null ? eii.a.a : $$1.l();
      return (Predicate<biw>)($$2 == eii.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bs()) {
            return false;
         } else if (!$$0.dL().B || $$3 instanceof cca && ((cca)$$3).g()) {
            eii $$4 = $$3.cf();
            eii.a $$5 = $$4 == null ? eii.a.a : $$4.l();
            if ($$5 == eii.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eii.a.d || $$5 == eii.a.d) && $$6 ? false : $$2 != eii.a.c && $$5 != eii.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<biw> b(biw $$0) {
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

   public static class a implements Predicate<biw> {
      private final cjl a;

      public a(cjl $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable biw $$0) {
         if (!$$0.bv()) {
            return false;
         } else {
            return !($$0 instanceof bjm $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
