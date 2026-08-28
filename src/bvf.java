import java.util.List;
import javax.annotation.Nullable;

public final class bvf {
   public static ww a(bve $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return ww.c("effect.duration.infinite");
      } else {
         int $$3 = azk.d((float)$$0.d() * $$1);
         return ww.b(baj.a($$3, $$2));
      }
   }

   public static boolean a(bwz $$0) {
      return $$0.b(bvg.c) || $$0.b(bvg.C);
   }

   public static int b(bwz $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bvg.c)) {
         $$1 = $$0.c(bvg.c).e();
      }

      if ($$0.b(bvg.C)) {
         $$2 = $$0.c(bvg.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bwz $$0) {
      return $$0.b(bvg.m) || $$0.b(bvg.C);
   }

   public static List<arp> a(aro $$0, @Nullable bwa $$1, fdw $$2, double $$3, bve $$4, int $$5) {
      je<bvc> $$6 = $$4.c();
      List<arp> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jo)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bve($$4), $$1));
      return $$7;
   }
}
