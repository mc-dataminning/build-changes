import java.util.List;
import javax.annotation.Nullable;

public final class btq {
   public static wo a(btp $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wo.c("effect.duration.infinite");
      } else {
         int $$3 = ayz.d((float)$$0.d() * $$1);
         return wo.b(azw.a($$3, $$2));
      }
   }

   public static boolean a(bvg $$0) {
      return $$0.b(btr.c) || $$0.b(btr.C);
   }

   public static int b(bvg $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(btr.c)) {
         $$1 = $$0.c(btr.c).e();
      }

      if ($$0.b(btr.C)) {
         $$2 = $$0.c(btr.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bvg $$0) {
      return $$0.b(btr.m) || $$0.b(btr.C);
   }

   public static List<ard> a(arc $$0, @Nullable buk $$1, fba $$2, double $$3, btp $$4, int $$5) {
      jr<btn> $$6 = $$4.c();
      List<ard> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((kb)$$6x.du(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new btp($$4), $$1));
      return $$7;
   }
}
