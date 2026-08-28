import java.util.List;
import javax.annotation.Nullable;

public final class bwj {
   public static xg a(bwi $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xg.c("effect.duration.infinite");
      } else {
         int $$3 = azz.d((float)$$0.d() * $$1);
         return xg.b(bay.a($$3, $$2));
      }
   }

   public static boolean a(byf $$0) {
      return $$0.b(bwk.c) || $$0.b(bwk.C);
   }

   public static int b(byf $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bwk.c)) {
         $$1 = $$0.c(bwk.c).e();
      }

      if ($$0.b(bwk.C)) {
         $$2 = $$0.c(bwk.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(byf $$0) {
      return $$0.b(bwk.m) || $$0.b(bwk.C);
   }

   public static List<asc> a(asb $$0, @Nullable bxe $$1, fgc $$2, double $$3, bwi $$4, int $$5) {
      jg<bwg> $$6 = $$4.c();
      List<asc> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jq)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bwi($$4), $$1));
      return $$7;
   }
}
