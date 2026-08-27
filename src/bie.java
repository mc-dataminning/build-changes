import java.util.List;
import javax.annotation.Nullable;

public final class bie {
   public static tl a(bid $$0, float $$1) {
      if ($$0.b()) {
         return tl.c("effect.duration.infinite");
      } else {
         int $$2 = arx.d((float)$$0.d() * $$1);
         return tl.b(asq.a($$2));
      }
   }

   public static boolean a(bjg $$0) {
      return $$0.a(bif.c) || $$0.a(bif.C);
   }

   public static int b(bjg $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bif.c)) {
         $$1 = $$0.b(bif.c).e();
      }

      if ($$0.a(bif.C)) {
         $$2 = $$0.b(bif.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bjg $$0) {
      return $$0.a(bif.m) || $$0.a(bif.C);
   }

   public static List<aks> a(akr $$0, @Nullable biq $$1, ehn $$2, double $$3, bid $$4, int $$5) {
      bib $$6 = $$4.c();
      List<aks> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((hq)$$6x.dj(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bid($$4), $$1));
      return $$7;
   }
}
