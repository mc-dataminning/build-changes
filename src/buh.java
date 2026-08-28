import java.util.List;
import javax.annotation.Nullable;

public final class buh {
   public static xk a(bug $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xk.c("effect.duration.infinite");
      } else {
         int $$3 = azu.d((float)$$0.d() * $$1);
         return xk.b(bar.a($$3, $$2));
      }
   }

   public static boolean a(bvx $$0) {
      return $$0.b(bui.c) || $$0.b(bui.C);
   }

   public static int b(bvx $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bui.c)) {
         $$1 = $$0.c(bui.c).e();
      }

      if ($$0.b(bui.C)) {
         $$2 = $$0.c(bui.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bvx $$0) {
      return $$0.b(bui.m) || $$0.b(bui.C);
   }

   public static List<ary> a(arx $$0, @Nullable bvb $$1, fbr $$2, double $$3, bug $$4, int $$5) {
      jq<bue> $$6 = $$4.c();
      List<ary> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ka)$$6x.du(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bug($$4), $$1));
      return $$7;
   }
}
