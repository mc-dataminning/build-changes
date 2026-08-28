import java.util.List;
import javax.annotation.Nullable;

public final class bsc {
   public static xo a(bsb $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xo.c("effect.duration.infinite");
      } else {
         int $$3 = ayy.d((float)$$0.d() * $$1);
         return xo.b(azu.a($$3, $$2));
      }
   }

   public static boolean a(bto $$0) {
      return $$0.b(bsd.c) || $$0.b(bsd.C);
   }

   public static int b(bto $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bsd.c)) {
         $$1 = $$0.c(bsd.c).e();
      }

      if ($$0.b(bsd.C)) {
         $$2 = $$0.c(bsd.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bto $$0) {
      return $$0.b(bsd.m) || $$0.b(bsd.C);
   }

   public static List<arf> a(are $$0, @Nullable bst $$1, evq $$2, double $$3, bsb $$4, int $$5) {
      ji<brz> $$6 = $$4.c();
      List<arf> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((js)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bsb($$4), $$1));
      return $$7;
   }
}
