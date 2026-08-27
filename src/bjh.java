import java.util.List;
import javax.annotation.Nullable;

public final class bjh {
   public static ui a(bjg $$0, float $$1) {
      if ($$0.b()) {
         return ui.c("effect.duration.infinite");
      } else {
         int $$2 = asy.d((float)$$0.d() * $$1);
         return ui.b(ats.a($$2));
      }
   }

   public static boolean a(bkj $$0) {
      return $$0.a(bji.c) || $$0.a(bji.C);
   }

   public static int b(bkj $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bji.c)) {
         $$1 = $$0.b(bji.c).e();
      }

      if ($$0.a(bji.C)) {
         $$2 = $$0.b(bji.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bkj $$0) {
      return $$0.a(bji.m) || $$0.a(bji.C);
   }

   public static List<alr> a(alq $$0, @Nullable bjt $$1, eif $$2, double $$3, bjg $$4, int $$5) {
      bje $$6 = $$4.c();
      List<alr> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((im)$$6x.dj(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bjg($$4), $$1));
      return $$7;
   }
}
