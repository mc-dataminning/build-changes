import java.util.List;
import javax.annotation.Nullable;

public final class brq {
   public static wu a(brp $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wu.c("effect.duration.infinite");
      } else {
         int $$3 = ayg.d((float)$$0.d() * $$1);
         return wu.b(azd.a($$3, $$2));
      }
   }

   public static boolean a(btc $$0) {
      return $$0.b(brr.c) || $$0.b(brr.C);
   }

   public static int b(btc $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(brr.c)) {
         $$1 = $$0.c(brr.c).e();
      }

      if ($$0.b(brr.C)) {
         $$2 = $$0.c(brr.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(btc $$0) {
      return $$0.b(brr.m) || $$0.b(brr.C);
   }

   public static List<aqn> a(aqm $$0, @Nullable bsh $$1, ewh $$2, double $$3, brp $$4, int $$5) {
      jj<brn> $$6 = $$4.c();
      List<aqn> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jt)$$6x.dp(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new brp($$4), $$1));
      return $$7;
   }
}
