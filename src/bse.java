import java.util.List;
import javax.annotation.Nullable;

public final class bse {
   public static xp a(bsd $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xp.c("effect.duration.infinite");
      } else {
         int $$3 = ayz.d((float)$$0.d() * $$1);
         return xp.b(azv.a($$3, $$2));
      }
   }

   public static boolean a(btq $$0) {
      return $$0.b(bsf.c) || $$0.b(bsf.C);
   }

   public static int b(btq $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bsf.c)) {
         $$1 = $$0.c(bsf.c).e();
      }

      if ($$0.b(bsf.C)) {
         $$2 = $$0.c(bsf.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(btq $$0) {
      return $$0.b(bsf.m) || $$0.b(bsf.C);
   }

   public static List<arg> a(arf $$0, @Nullable bsv $$1, evs $$2, double $$3, bsd $$4, int $$5) {
      ji<bsb> $$6 = $$4.c();
      List<arg> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((js)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bsd($$4), $$1));
      return $$7;
   }
}
