import java.util.List;
import javax.annotation.Nullable;

public final class bsr {
   public static xd a(bsq $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xd.c("effect.duration.infinite");
      } else {
         int $$3 = azc.d((float)$$0.d() * $$1);
         return xd.b(azz.a($$3, $$2));
      }
   }

   public static boolean a(buf $$0) {
      return $$0.b(bss.c) || $$0.b(bss.C);
   }

   public static int b(buf $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bss.c)) {
         $$1 = $$0.c(bss.c).e();
      }

      if ($$0.b(bss.C)) {
         $$2 = $$0.c(bss.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(buf $$0) {
      return $$0.b(bss.m) || $$0.b(bss.C);
   }

   public static List<arh> a(arg $$0, @Nullable btj $$1, eye $$2, double $$3, bsq $$4, int $$5) {
      jn<bso> $$6 = $$4.c();
      List<arh> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jx)$$6x.dq(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bsq($$4), $$1));
      return $$7;
   }
}
