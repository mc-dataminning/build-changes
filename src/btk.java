import java.util.List;
import javax.annotation.Nullable;

public final class btk {
   public static xi a(btj $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xi.c("effect.duration.infinite");
      } else {
         int $$3 = azk.d((float)$$0.d() * $$1);
         return xi.b(bah.a($$3, $$2));
      }
   }

   public static boolean a(bva $$0) {
      return $$0.b(btl.c) || $$0.b(btl.C);
   }

   public static int b(bva $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(btl.c)) {
         $$1 = $$0.c(btl.c).e();
      }

      if ($$0.b(btl.C)) {
         $$2 = $$0.c(btl.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bva $$0) {
      return $$0.b(btl.m) || $$0.b(btl.C);
   }

   public static List<aro> a(arn $$0, @Nullable bue $$1, ezn $$2, double $$3, btj $$4, int $$5) {
      jq<bth> $$6 = $$4.c();
      List<aro> $$7 = $$0.a(
         $$6x -> $$6x.i.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ka)$$6x.dv(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new btj($$4), $$1));
      return $$7;
   }
}
