import java.util.List;
import javax.annotation.Nullable;

public final class bok {
   public static vu a(boj $$0, float $$1, float $$2) {
      if ($$0.a()) {
         return vu.c("effect.duration.infinite");
      } else {
         int $$3 = aww.d((float)$$0.c() * $$1);
         return vu.b(axr.a($$3, $$2));
      }
   }

   public static boolean a(bpo $$0) {
      return $$0.a(bol.c) || $$0.a(bol.C);
   }

   public static int b(bpo $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bol.c)) {
         $$1 = $$0.c(bol.c).d();
      }

      if ($$0.a(bol.C)) {
         $$2 = $$0.c(bol.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bpo $$0) {
      return $$0.a(bol.m) || $$0.a(bol.C);
   }

   public static List<apg> a(apf $$0, @Nullable bow $$1, epr $$2, double $$3, boj $$4, int $$5) {
      il<boh> $$6 = $$4.b();
      List<apg> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((iv)$$6x.dk(), $$3)
               && (!$$6x.a($$6) || $$6x.c($$6).d() < $$4.d() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new boj($$4), $$1));
      return $$7;
   }
}
