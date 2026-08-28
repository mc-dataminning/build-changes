import java.util.List;
import javax.annotation.Nullable;

public final class bsw {
   public static xd a(bsv $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xd.c("effect.duration.infinite");
      } else {
         int $$3 = azd.d((float)$$0.d() * $$1);
         return xd.b(baa.a($$3, $$2));
      }
   }

   public static boolean a(buk $$0) {
      return $$0.b(bsx.c) || $$0.b(bsx.C);
   }

   public static int b(buk $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bsx.c)) {
         $$1 = $$0.c(bsx.c).e();
      }

      if ($$0.b(bsx.C)) {
         $$2 = $$0.c(bsx.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(buk $$0) {
      return $$0.b(bsx.m) || $$0.b(bsx.C);
   }

   public static List<ari> a(arh $$0, @Nullable bto $$1, eys $$2, double $$3, bsv $$4, int $$5) {
      jn<bst> $$6 = $$4.c();
      List<ari> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jx)$$6x.dq(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bsv($$4), $$1));
      return $$7;
   }
}
