import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class bvg {
   public static final Predicate<bvb> a = bvb::bL;
   public static final Predicate<bvb> b = $$0 -> $$0.bL() && $$0 instanceof bvx;
   public static final Predicate<bvb> c = $$0 -> $$0.bL() && !$$0.ca() && !$$0.bZ();
   public static final Predicate<bvb> d = $$0 -> $$0 instanceof bst && $$0.bL();
   public static final Predicate<bvb> e = $$0 -> !($$0 instanceof cpo) || !$$0.aa_() && !((cpo)$$0).b();
   public static final Predicate<bvb> f = $$0 -> !$$0.aa_();
   public static final Predicate<bvb> g = f.and(bvb::bN);
   public static final Predicate<bvb> h = f.and(bvb::bH);

   private bvg() {
   }

   public static Predicate<bvb> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.i($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bvb> a(bvb $$0) {
      fcy $$1 = $$0.cr();
      fcy.a $$2 = $$1 == null ? fcy.a.a : $$1.l();
      return (Predicate<bvb>)($$2 == fcy.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bI()) {
            return false;
         } else if (!$$0.dW().C || $$3 instanceof cpo && ((cpo)$$3).c()) {
            fcy $$4 = $$3.cr();
            fcy.a $$5 = $$4 == null ? fcy.a.a : $$4.l();
            if ($$5 == fcy.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               return ($$2 == fcy.a.d || $$5 == fcy.a.d) && $$6 ? false : $$2 != fcy.a.c && $$5 != fcy.a.c || $$6;
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bvb> b(bvb $$0) {
      return $$1 -> {
         while ($$1.bZ()) {
            $$1 = $$1.dl();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }
}
