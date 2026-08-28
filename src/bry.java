import java.util.List;
import javax.annotation.Nullable;

public final class bry {
   public static xl a(brx $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xl.c("effect.duration.infinite");
      } else {
         int $$3 = ayu.d((float)$$0.d() * $$1);
         return xl.b(azq.a($$3, $$2));
      }
   }

   public static boolean a(btk $$0) {
      return $$0.b(brz.c) || $$0.b(brz.C);
   }

   public static int b(btk $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(brz.c)) {
         $$1 = $$0.c(brz.c).e();
      }

      if ($$0.b(brz.C)) {
         $$2 = $$0.c(brz.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(btk $$0) {
      return $$0.b(brz.m) || $$0.b(brz.C);
   }

   public static List<arc> a(arb $$0, @Nullable bsp $$1, evm $$2, double $$3, brx $$4, int $$5) {
      ji<brv> $$6 = $$4.c();
      List<arc> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((js)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new brx($$4), $$1));
      return $$7;
   }
}
