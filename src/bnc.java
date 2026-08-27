import java.util.List;
import javax.annotation.Nullable;

public final class bnc {
   public static vq a(bnb $$0, float $$1, float $$2) {
      if ($$0.a()) {
         return vq.c("effect.duration.infinite");
      } else {
         int $$3 = awh.d((float)$$0.c() * $$1);
         return vq.b(axd.a($$3, $$2));
      }
   }

   public static boolean a(bog $$0) {
      return $$0.a(bnd.c) || $$0.a(bnd.C);
   }

   public static int b(bog $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bnd.c)) {
         $$1 = $$0.c(bnd.c).d();
      }

      if ($$0.a(bnd.C)) {
         $$2 = $$0.c(bnd.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bog $$0) {
      return $$0.a(bnd.m) || $$0.a(bnd.C);
   }

   public static List<aow> a(aov $$0, @Nullable bno $$1, ens $$2, double $$3, bnb $$4, int $$5) {
      ij<bmz> $$6 = $$4.b();
      List<aow> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.r($$6x))
               && $$2.a((it)$$6x.dk(), $$3)
               && (!$$6x.a($$6) || $$6x.c($$6).d() < $$4.d() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bnb($$4), $$1));
      return $$7;
   }
}
