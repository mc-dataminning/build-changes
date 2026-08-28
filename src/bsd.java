import java.util.List;
import javax.annotation.Nullable;

public final class bsd {
   public static xp a(bsc $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xp.c("effect.duration.infinite");
      } else {
         int $$3 = ayz.d((float)$$0.d() * $$1);
         return xp.b(azv.a($$3, $$2));
      }
   }

   public static boolean a(btp $$0) {
      return $$0.b(bse.c) || $$0.b(bse.C);
   }

   public static int b(btp $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bse.c)) {
         $$1 = $$0.c(bse.c).e();
      }

      if ($$0.b(bse.C)) {
         $$2 = $$0.c(bse.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(btp $$0) {
      return $$0.b(bse.m) || $$0.b(bse.C);
   }

   public static List<arg> a(arf $$0, @Nullable bsu $$1, evr $$2, double $$3, bsc $$4, int $$5) {
      ji<bsa> $$6 = $$4.c();
      List<arg> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((js)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bsc($$4), $$1));
      return $$7;
   }
}
