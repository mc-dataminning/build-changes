import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bur {
   public static final Predicate<bum> a = bum::bL;
   public static final Predicate<bum> b = $$0 -> $$0.bL() && $$0 instanceof bvi;
   public static final Predicate<bum> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bum> d = $$0 -> $$0 instanceof bse && $$0.bL();
   public static final Predicate<bum> e = $$0 -> !($$0 instanceof coy) || !$$0.Z_() && !((coy)$$0).b();
   public static final Predicate<bum> f = $$0 -> !$$0.Z_();
   public static final Predicate<bum> g = f.and(bum::bN);
   public static final Predicate<bum> h = f.and(bum::bH);

   private bur() {
   }

   public static Predicate<bum> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bum> a(bum $$0) {
      fci $$1 = $$0.cr();
      fci.a $$2 = $$1 == null ? fci.a.a : $$1.l();
      return (Predicate<bum>)($$2 == fci.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dV().C || $$3 instanceof coy && ((coy)$$3).c()) {
            fci $$4 = $$3.cr();
            fci.a $$5 = $$4 == null ? fci.a.a : $$4.l();
            if ($$5 == fci.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fci.a.d || $$5 == fci.a.d) && $$6 ? false : $$2 != fci.a.c && $$5 != fci.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bum> b(bum $$0) {
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
