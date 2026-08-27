import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bit {
   public static final Predicate<biq> a = biq::bw;
   public static final Predicate<biq> b = $$0 -> $$0.bw() && $$0 instanceof bjg;
   public static final Predicate<biq> c = $$0 -> $$0.bw() && !$$0.bP() && !$$0.bO();
   public static final Predicate<biq> d = $$0 -> $$0 instanceof bgr && $$0.bw();
   public static final Predicate<biq> e = $$0 -> !($$0 instanceof cbu) || !$$0.M_() && !((cbu)$$0).f();
   public static final Predicate<biq> f = $$0 -> !$$0.M_();
   public static final Predicate<biq> g = f.and(biq::by);

   private bit() {
   }

   public static Predicate<biq> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<biq> a(biq $$0) {
      eio $$1 = $$0.cg();
      eio.a $$2 = $$1 == null ? eio.a.a : $$1.l();
      return (Predicate<biq>)($$2 == eio.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bt()) {
            return false;
         } else if (!$$0.dL().B || $$3 instanceof cbu && ((cbu)$$3).g()) {
            eio $$4 = $$3.cg();
            eio.a $$5 = $$4 == null ? eio.a.a : $$4.l();
            if ($$5 == eio.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == eio.a.d || $$5 == eio.a.d) && $$6 ? false : $$2 != eio.a.c && $$5 != eio.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<biq> b(biq $$0) {
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

   public static class a implements Predicate<biq> {
      private final cjf a;

      public a(cjf $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable biq $$0) {
         if (!$$0.bw()) {
            return false;
         } else {
            return !($$0 instanceof bjg $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
