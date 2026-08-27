import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bli {
   public static final Predicate<blf> a = blf::bx;
   public static final Predicate<blf> b = $$0 -> $$0.bx() && $$0 instanceof blv;
   public static final Predicate<blf> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<blf> d = $$0 -> $$0 instanceof bje && $$0.bx();
   public static final Predicate<blf> e = $$0 -> !($$0 instanceof cer) || !$$0.P_() && !((cer)$$0).f();
   public static final Predicate<blf> f = $$0 -> !$$0.P_();
   public static final Predicate<blf> g = f.and(blf::bz);

   private bli() {
   }

   public static Predicate<blf> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<blf> a(blf $$0) {
      emc $$1 = $$0.cg();
      emc.a $$2 = $$1 == null ? emc.a.a : $$1.l();
      return (Predicate<blf>)($$2 == emc.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dM().B || $$3 instanceof cer && ((cer)$$3).g()) {
            emc $$4 = $$3.cg();
            emc.a $$5 = $$4 == null ? emc.a.a : $$4.l();
            if ($$5 == emc.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == emc.a.d || $$5 == emc.a.d) && $$6 ? false : $$2 != emc.a.c && $$5 != emc.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<blf> b(blf $$0) {
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

   public static class a implements Predicate<blf> {
      private final cmh a;

      public a(cmh $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable blf $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof blv $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
