import java.util.List;
import javax.annotation.Nullable;

public final class bvk {
   public static wy a(bvj $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wy.c("effect.duration.infinite");
      } else {
         int $$3 = azm.d((float)$$0.d() * $$1);
         return wy.b(bal.a($$3, $$2));
      }
   }

   public static boolean a(bxe $$0) {
      return $$0.b(bvl.c) || $$0.b(bvl.C);
   }

   public static int b(bxe $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bvl.c)) {
         $$1 = $$0.c(bvl.c).e();
      }

      if ($$0.b(bvl.C)) {
         $$2 = $$0.c(bvl.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bxe $$0) {
      return $$0.b(bvl.m) || $$0.b(bvl.C);
   }

   public static List<arr> a(arq $$0, @Nullable bwf $$1, feq $$2, double $$3, bvj $$4, int $$5) {
      je<bvh> $$6 = $$4.c();
      List<arr> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jo)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bvj($$4), $$1));
      return $$7;
   }
}
