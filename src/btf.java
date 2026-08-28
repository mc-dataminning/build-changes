import java.util.List;
import javax.annotation.Nullable;

public final class btf {
   public static xh a(bte $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xh.c("effect.duration.infinite");
      } else {
         int $$3 = azj.d((float)$$0.d() * $$1);
         return xh.b(bag.a($$3, $$2));
      }
   }

   public static boolean a(buv $$0) {
      return $$0.b(btg.c) || $$0.b(btg.C);
   }

   public static int b(buv $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(btg.c)) {
         $$1 = $$0.c(btg.c).e();
      }

      if ($$0.b(btg.C)) {
         $$2 = $$0.c(btg.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(buv $$0) {
      return $$0.b(btg.m) || $$0.b(btg.C);
   }

   public static List<arn> a(arm $$0, @Nullable btz $$1, ezh $$2, double $$3, bte $$4, int $$5) {
      jp<btc> $$6 = $$4.c();
      List<arn> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jz)$$6x.dv(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bte($$4), $$1));
      return $$7;
   }
}
