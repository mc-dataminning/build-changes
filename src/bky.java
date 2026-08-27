import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bky {
   public static final Predicate<bkv> a = bkv::bx;
   public static final Predicate<bkv> b = $$0 -> $$0.bx() && $$0 instanceof bll;
   public static final Predicate<bkv> c = $$0 -> $$0.bx() && !$$0.bP() && !$$0.bO();
   public static final Predicate<bkv> d = $$0 -> $$0 instanceof biu && $$0.bx();
   public static final Predicate<bkv> e = $$0 -> !($$0 instanceof cdz) || !$$0.P_() && !((cdz)$$0).f();
   public static final Predicate<bkv> f = $$0 -> !$$0.P_();
   public static final Predicate<bkv> g = f.and(bkv::bz);

   private bky() {
   }

   public static Predicate<bkv> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bkv> a(bkv $$0) {
      ela $$1 = $$0.cg();
      ela.a $$2 = $$1 == null ? ela.a.a : $$1.l();
      return (Predicate<bkv>)($$2 == ela.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bu()) {
            return false;
         } else if (!$$0.dN().B || $$3 instanceof cdz && ((cdz)$$3).g()) {
            ela $$4 = $$3.cg();
            ela.a $$5 = $$4 == null ? ela.a.a : $$4.l();
            if ($$5 == ela.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == ela.a.d || $$5 == ela.a.d) && $$6 ? false : $$2 != ela.a.c && $$5 != ela.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bkv> b(bkv $$0) {
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

   public static class a implements Predicate<bkv> {
      private final clo a;

      public a(clo $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bkv $$0) {
         if (!$$0.bx()) {
            return false;
         } else {
            return !($$0 instanceof bll $$1) ? false : $$1.f(this.a);
         }
      }
   }
}
