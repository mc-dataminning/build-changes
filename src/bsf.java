import java.util.List;
import javax.annotation.Nullable;

public final class bsf {
   public static xp a(bse $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xp.c("effect.duration.infinite");
      } else {
         int $$3 = ayz.d((float)$$0.d() * $$1);
         return xp.b(azv.a($$3, $$2));
      }
   }

   public static boolean a(btr $$0) {
      return $$0.b(bsg.c) || $$0.b(bsg.C);
   }

   public static int b(btr $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bsg.c)) {
         $$1 = $$0.c(bsg.c).e();
      }

      if ($$0.b(bsg.C)) {
         $$2 = $$0.c(bsg.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(btr $$0) {
      return $$0.b(bsg.m) || $$0.b(bsg.C);
   }

   public static List<arg> a(arf $$0, @Nullable bsw $$1, evt $$2, double $$3, bse $$4, int $$5) {
      ji<bsc> $$6 = $$4.c();
      List<arg> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((js)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bse($$4), $$1));
      return $$7;
   }
}
