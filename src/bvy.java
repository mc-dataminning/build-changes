import java.util.List;
import javax.annotation.Nullable;

public final class bvy {
   public static xa a(bvx $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xa.c("effect.duration.infinite");
      } else {
         int $$3 = azo.d((float)$$0.d() * $$1);
         return xa.b(ban.a($$3, $$2));
      }
   }

   public static boolean a(bxu $$0) {
      return $$0.b(bvz.c) || $$0.b(bvz.C);
   }

   public static int b(bxu $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bvz.c)) {
         $$1 = $$0.c(bvz.c).e();
      }

      if ($$0.b(bvz.C)) {
         $$2 = $$0.c(bvz.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bxu $$0) {
      return $$0.b(bvz.m) || $$0.b(bvz.C);
   }

   public static List<art> a(ars $$0, @Nullable bwt $$1, ffq $$2, double $$3, bvx $$4, int $$5) {
      jf<bvv> $$6 = $$4.c();
      List<art> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jp)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bvx($$4), $$1));
      return $$7;
   }
}
