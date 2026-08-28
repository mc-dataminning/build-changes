import java.util.List;
import javax.annotation.Nullable;

public final class brp {
   public static wu a(bro $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wu.c("effect.duration.infinite");
      } else {
         int $$3 = ayg.d((float)$$0.d() * $$1);
         return wu.b(azd.a($$3, $$2));
      }
   }

   public static boolean a(btb $$0) {
      return $$0.b(brq.c) || $$0.b(brq.C);
   }

   public static int b(btb $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(brq.c)) {
         $$1 = $$0.c(brq.c).e();
      }

      if ($$0.b(brq.C)) {
         $$2 = $$0.c(brq.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(btb $$0) {
      return $$0.b(brq.m) || $$0.b(brq.C);
   }

   public static List<aqn> a(aqm $$0, @Nullable bsg $$1, ewf $$2, double $$3, bro $$4, int $$5) {
      jj<brm> $$6 = $$4.c();
      List<aqn> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jt)$$6x.do(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bro($$4), $$1));
      return $$7;
   }
}
