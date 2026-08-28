import java.util.List;
import javax.annotation.Nullable;

public final class bvn {
   public static wy a(bvm $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wy.c("effect.duration.infinite");
      } else {
         int $$3 = azm.d((float)$$0.d() * $$1);
         return wy.b(bal.a($$3, $$2));
      }
   }

   public static boolean a(bxj $$0) {
      return $$0.b(bvo.c) || $$0.b(bvo.C);
   }

   public static int b(bxj $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bvo.c)) {
         $$1 = $$0.c(bvo.c).e();
      }

      if ($$0.b(bvo.C)) {
         $$2 = $$0.c(bvo.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bxj $$0) {
      return $$0.b(bvo.m) || $$0.b(bvo.C);
   }

   public static List<arr> a(arq $$0, @Nullable bwi $$1, fex $$2, double $$3, bvm $$4, int $$5) {
      jf<bvk> $$6 = $$4.c();
      List<arr> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jp)$$6x.ds(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bvm($$4), $$1));
      return $$7;
   }
}
