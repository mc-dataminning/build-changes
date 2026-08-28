import java.util.List;
import javax.annotation.Nullable;

public final class bto {
   public static xl a(btn $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xl.c("effect.duration.infinite");
      } else {
         int $$3 = azn.d((float)$$0.d() * $$1);
         return xl.b(bak.a($$3, $$2));
      }
   }

   public static boolean a(bve $$0) {
      return $$0.b(btp.c) || $$0.b(btp.C);
   }

   public static int b(bve $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(btp.c)) {
         $$1 = $$0.c(btp.c).e();
      }

      if ($$0.b(btp.C)) {
         $$2 = $$0.c(btp.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bve $$0) {
      return $$0.b(btp.m) || $$0.b(btp.C);
   }

   public static List<arr> a(arq $$0, @Nullable bui $$1, ezr $$2, double $$3, btn $$4, int $$5) {
      jq<btl> $$6 = $$4.c();
      List<arr> $$7 = $$0.a(
         $$6x -> $$6x.i.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ka)$$6x.dw(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new btn($$4), $$1));
      return $$7;
   }
}
