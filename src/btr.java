import java.util.List;
import javax.annotation.Nullable;

public final class btr {
   public static xj a(btq $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xj.c("effect.duration.infinite");
      } else {
         int $$3 = azm.d((float)$$0.d() * $$1);
         return xj.b(baj.a($$3, $$2));
      }
   }

   public static boolean a(bvh $$0) {
      return $$0.b(bts.c) || $$0.b(bts.C);
   }

   public static int b(bvh $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bts.c)) {
         $$1 = $$0.c(bts.c).e();
      }

      if ($$0.b(bts.C)) {
         $$2 = $$0.c(bts.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bvh $$0) {
      return $$0.b(bts.m) || $$0.b(bts.C);
   }

   public static List<arq> a(arp $$0, @Nullable bul $$1, ezy $$2, double $$3, btq $$4, int $$5) {
      jq<bto> $$6 = $$4.c();
      List<arq> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ka)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new btq($$4), $$1));
      return $$7;
   }
}
