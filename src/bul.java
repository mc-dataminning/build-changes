import java.util.List;
import javax.annotation.Nullable;

public final class bul {
   public static xv a(buk $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xv.c("effect.duration.infinite");
      } else {
         int $$3 = bae.d((float)$$0.d() * $$1);
         return xv.b(bbb.a($$3, $$2));
      }
   }

   public static boolean a(bwb $$0) {
      return $$0.b(bum.c) || $$0.b(bum.C);
   }

   public static int b(bwb $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bum.c)) {
         $$1 = $$0.c(bum.c).e();
      }

      if ($$0.b(bum.C)) {
         $$2 = $$0.c(bum.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bwb $$0) {
      return $$0.b(bum.m) || $$0.b(bum.C);
   }

   public static List<asi> a(ash $$0, @Nullable bvf $$1, fbs $$2, double $$3, buk $$4, int $$5) {
      jq<bui> $$6 = $$4.c();
      List<asi> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ka)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new buk($$4), $$1));
      return $$7;
   }
}
