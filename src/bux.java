import java.util.List;
import javax.annotation.Nullable;

public final class bux {
   public static wv a(buw $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wv.c("effect.duration.infinite");
      } else {
         int $$3 = azk.d((float)$$0.d() * $$1);
         return wv.b(bah.a($$3, $$2));
      }
   }

   public static boolean a(bwr $$0) {
      return $$0.b(buy.c) || $$0.b(buy.C);
   }

   public static int b(bwr $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(buy.c)) {
         $$1 = $$0.c(buy.c).e();
      }

      if ($$0.b(buy.C)) {
         $$2 = $$0.c(buy.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bwr $$0) {
      return $$0.b(buy.m) || $$0.b(buy.C);
   }

   public static List<aro> a(arn $$0, @Nullable bvs $$1, fcu $$2, double $$3, buw $$4, int $$5) {
      js<buu> $$6 = $$4.c();
      List<aro> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((kc)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new buw($$4), $$1));
      return $$7;
   }
}
