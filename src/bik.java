import java.util.List;
import javax.annotation.Nullable;

public final class bik {
   public static tl a(bij $$0, float $$1) {
      if ($$0.b()) {
         return tl.c("effect.duration.infinite");
      } else {
         int $$2 = asb.d((float)$$0.d() * $$1);
         return tl.b(asv.a($$2));
      }
   }

   public static boolean a(bjm $$0) {
      return $$0.a(bil.c) || $$0.a(bil.C);
   }

   public static int b(bjm $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bil.c)) {
         $$1 = $$0.b(bil.c).e();
      }

      if ($$0.a(bil.C)) {
         $$2 = $$0.b(bil.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bjm $$0) {
      return $$0.a(bil.m) || $$0.a(bil.C);
   }

   public static List<aku> a(akt $$0, @Nullable biw $$1, ehh $$2, double $$3, bij $$4, int $$5) {
      bih $$6 = $$4.c();
      List<aku> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ho)$$6x.dj(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bij($$4), $$1));
      return $$7;
   }
}
