import java.util.List;
import javax.annotation.Nullable;

public final class brd {
   public static wx a(brc $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wx.c("effect.duration.infinite");
      } else {
         int $$3 = ayd.d((float)$$0.d() * $$1);
         return wx.b(ayy.a($$3, $$2));
      }
   }

   public static boolean a(bso $$0) {
      return $$0.b(bre.c) || $$0.b(bre.C);
   }

   public static int b(bso $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bre.c)) {
         $$1 = $$0.c(bre.c).e();
      }

      if ($$0.b(bre.C)) {
         $$2 = $$0.c(bre.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bso $$0) {
      return $$0.b(bre.m) || $$0.b(bre.C);
   }

   public static List<aqn> a(aqm $$0, @Nullable bru $$1, euk $$2, double $$3, brc $$4, int $$5) {
      ix<bra> $$6 = $$4.c();
      List<aqn> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jh)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new brc($$4), $$1));
      return $$7;
   }
}
