import java.util.List;
import javax.annotation.Nullable;

public final class bsb {
   public static xo a(bsa $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xo.c("effect.duration.infinite");
      } else {
         int $$3 = ayx.d((float)$$0.d() * $$1);
         return xo.b(azt.a($$3, $$2));
      }
   }

   public static boolean a(btn $$0) {
      return $$0.b(bsc.c) || $$0.b(bsc.C);
   }

   public static int b(btn $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bsc.c)) {
         $$1 = $$0.c(bsc.c).e();
      }

      if ($$0.b(bsc.C)) {
         $$2 = $$0.c(bsc.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(btn $$0) {
      return $$0.b(bsc.m) || $$0.b(bsc.C);
   }

   public static List<arf> a(are $$0, @Nullable bss $$1, evp $$2, double $$3, bsa $$4, int $$5) {
      ji<bry> $$6 = $$4.c();
      List<arf> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((js)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bsa($$4), $$1));
      return $$7;
   }
}
