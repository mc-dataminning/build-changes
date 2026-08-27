import java.util.List;
import javax.annotation.Nullable;

public final class brf {
   public static wx a(bre $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wx.c("effect.duration.infinite");
      } else {
         int $$3 = ayf.d((float)$$0.d() * $$1);
         return wx.b(aza.a($$3, $$2));
      }
   }

   public static boolean a(bsq $$0) {
      return $$0.b(brg.c) || $$0.b(brg.C);
   }

   public static int b(bsq $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(brg.c)) {
         $$1 = $$0.c(brg.c).e();
      }

      if ($$0.b(brg.C)) {
         $$2 = $$0.c(brg.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bsq $$0) {
      return $$0.b(brg.m) || $$0.b(brg.C);
   }

   public static List<aqo> a(aqn $$0, @Nullable brw $$1, eum $$2, double $$3, bre $$4, int $$5) {
      ix<brc> $$6 = $$4.c();
      List<aqo> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jh)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bre($$4), $$1));
      return $$7;
   }
}
