import java.util.List;
import javax.annotation.Nullable;

public final class btp {
   public static wo a(bto $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wo.c("effect.duration.infinite");
      } else {
         int $$3 = ayy.d((float)$$0.d() * $$1);
         return wo.b(azv.a($$3, $$2));
      }
   }

   public static boolean a(bvf $$0) {
      return $$0.b(btq.c) || $$0.b(btq.C);
   }

   public static int b(bvf $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(btq.c)) {
         $$1 = $$0.c(btq.c).e();
      }

      if ($$0.b(btq.C)) {
         $$2 = $$0.c(btq.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bvf $$0) {
      return $$0.b(btq.m) || $$0.b(btq.C);
   }

   public static List<ard> a(arc $$0, @Nullable buj $$1, fay $$2, double $$3, bto $$4, int $$5) {
      jr<btm> $$6 = $$4.c();
      List<ard> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((kb)$$6x.du(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bto($$4), $$1));
      return $$7;
   }
}
