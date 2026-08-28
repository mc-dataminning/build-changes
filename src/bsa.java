import java.util.List;
import javax.annotation.Nullable;

public final class bsa {
   public static wz a(brz $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wz.c("effect.duration.infinite");
      } else {
         int $$3 = ayo.d((float)$$0.d() * $$1);
         return wz.b(azl.a($$3, $$2));
      }
   }

   public static boolean a(btn $$0) {
      return $$0.b(bsb.c) || $$0.b(bsb.C);
   }

   public static int b(btn $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bsb.c)) {
         $$1 = $$0.c(bsb.c).e();
      }

      if ($$0.b(bsb.C)) {
         $$2 = $$0.c(bsb.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(btn $$0) {
      return $$0.b(bsb.m) || $$0.b(bsb.C);
   }

   public static List<aqv> a(aqu $$0, @Nullable bsr $$1, exc $$2, double $$3, brz $$4, int $$5) {
      jm<brx> $$6 = $$4.c();
      List<aqv> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jw)$$6x.dm(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new brz($$4), $$1));
      return $$7;
   }
}
