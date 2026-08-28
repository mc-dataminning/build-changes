import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bue {
   public static final Predicate<btz> a = btz::bM;
   public static final Predicate<btz> b = $$0 -> $$0.bM() && $$0 instanceof buv;
   public static final Predicate<btz> c = $$0 -> $$0.bM() && !$$0.cb() && !$$0.ca();
   public static final Predicate<btz> d = $$0 -> $$0 instanceof brr && $$0.bM();
   public static final Predicate<btz> e = $$0 -> !($$0 instanceof coh) || !$$0.R_() && !((coh)$$0).f();
   public static final Predicate<btz> f = $$0 -> !$$0.R_();
   public static final Predicate<btz> g = f.and(btz::bO);
   public static final Predicate<btz> h = f.and(btz::bI);

   private bue() {
   }

   public static Predicate<btz> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<btz> a(btz $$0) {
      fao $$1 = $$0.cs();
      fao.a $$2 = $$1 == null ? fao.a.a : $$1.l();
      return (Predicate<btz>)($$2 == fao.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bJ()) {
            return false;
         } else if (!$$0.dX().C || $$3 instanceof coh && ((coh)$$3).g()) {
            fao $$4 = $$3.cs();
            fao.a $$5 = $$4 == null ? fao.a.a : $$4.l();
            if ($$5 == fao.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fao.a.d || $$5 == fao.a.d) && $$6 ? false : $$2 != fao.a.c && $$5 != fao.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<btz> b(btz $$0) {
      return $$1 -> {
         while ($$1.ca()) {
            $$1 = $$1.dl();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
