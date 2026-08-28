import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class buq {
   public static final Predicate<bul> a = bul::bL;
   public static final Predicate<bul> b = $$0 -> $$0.bL() && $$0 instanceof bvh;
   public static final Predicate<bul> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bul> d = $$0 -> $$0 instanceof bsd && $$0.bL();
   public static final Predicate<bul> e = $$0 -> !($$0 instanceof cox) || !$$0.Z_() && !((cox)$$0).b();
   public static final Predicate<bul> f = $$0 -> !$$0.Z_();
   public static final Predicate<bul> g = f.and(bul::bN);
   public static final Predicate<bul> h = f.and(bul::bH);

   private buq() {
   }

   public static Predicate<bul> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bul> a(bul $$0) {
      fch $$1 = $$0.cr();
      fch.a $$2 = $$1 == null ? fch.a.a : $$1.l();
      return (Predicate<bul>)($$2 == fch.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof cox && ((cox)$$3).c()) {
            fch $$4 = $$3.cr();
            fch.a $$5 = $$4 == null ? fch.a.a : $$4.l();
            if ($$5 == fch.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fch.a.d || $$5 == fch.a.d) && $$6 ? false : $$2 != fch.a.c && $$5 != fch.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bul> b(bul $$0) {
      return $$1 -> {
         while ($$1.bZ()) {
            $$1 = $$1.dk();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
