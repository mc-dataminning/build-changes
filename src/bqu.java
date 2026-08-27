import java.util.List;
import javax.annotation.Nullable;

public final class bqu {
   public static wu a(bqt $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wu.c("effect.duration.infinite");
      } else {
         int $$3 = axz.d((float)$$0.d() * $$1);
         return wu.b(ayu.a($$3, $$2));
      }
   }

   public static boolean a(bsa $$0) {
      return $$0.b(bqv.c) || $$0.b(bqv.C);
   }

   public static int b(bsa $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bqv.c)) {
         $$1 = $$0.c(bqv.c).e();
      }

      if ($$0.b(bqv.C)) {
         $$2 = $$0.c(bqv.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bsa $$0) {
      return $$0.b(bqv.m) || $$0.b(bqv.C);
   }

   public static List<aqi> a(aqh $$0, @Nullable brh $$1, etp $$2, double $$3, bqt $$4, int $$5) {
      iw<bqr> $$6 = $$4.c();
      List<aqi> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jg)$$6x.dl(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bqt($$4), $$1));
      return $$7;
   }
}
