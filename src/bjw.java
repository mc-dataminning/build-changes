import java.util.List;
import javax.annotation.Nullable;

public final class bjw {
   public static ur a(bjv $$0, float $$1) {
      if ($$0.b()) {
         return ur.c("effect.duration.infinite");
      } else {
         int $$2 = ati.d((float)$$0.d() * $$1);
         return ur.b(auc.a($$2));
      }
   }

   public static boolean a(bky $$0) {
      return $$0.a(bjx.c) || $$0.a(bjx.C);
   }

   public static int b(bky $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bjx.c)) {
         $$1 = $$0.b(bjx.c).e();
      }

      if ($$0.a(bjx.C)) {
         $$2 = $$0.b(bjx.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bky $$0) {
      return $$0.a(bjx.m) || $$0.a(bjx.C);
   }

   public static List<amb> a(ama $$0, @Nullable bki $$1, eji $$2, double $$3, bjv $$4, int $$5) {
      bjt $$6 = $$4.c();
      List<amb> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((im)$$6x.dj(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bjv($$4), $$1));
      return $$7;
   }
}
