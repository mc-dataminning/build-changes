import java.util.List;
import javax.annotation.Nullable;

public final class bol {
   public static vu a(bok $$0, float $$1, float $$2) {
      if ($$0.a()) {
         return vu.c("effect.duration.infinite");
      } else {
         int $$3 = aww.d((float)$$0.c() * $$1);
         return vu.b(axr.a($$3, $$2));
      }
   }

   public static boolean a(bpp $$0) {
      return $$0.a(bom.c) || $$0.a(bom.C);
   }

   public static int b(bpp $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bom.c)) {
         $$1 = $$0.c(bom.c).d();
      }

      if ($$0.a(bom.C)) {
         $$2 = $$0.c(bom.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bpp $$0) {
      return $$0.a(bom.m) || $$0.a(bom.C);
   }

   public static List<apg> a(apf $$0, @Nullable box $$1, ept $$2, double $$3, bok $$4, int $$5) {
      il<boi> $$6 = $$4.b();
      List<apg> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((iv)$$6x.dk(), $$3)
               && (!$$6x.a($$6) || $$6x.c($$6).d() < $$4.d() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bok($$4), $$1));
      return $$7;
   }
}
