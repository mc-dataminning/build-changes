import java.util.List;
import javax.annotation.Nullable;

public final class bnt {
   public static vs a(bns $$0, float $$1, float $$2) {
      if ($$0.a()) {
         return vs.c("effect.duration.infinite");
      } else {
         int $$3 = awm.d((float)$$0.c() * $$1);
         return vs.b(axh.a($$3, $$2));
      }
   }

   public static boolean a(box $$0) {
      return $$0.a(bnu.c) || $$0.a(bnu.C);
   }

   public static int b(box $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bnu.c)) {
         $$1 = $$0.c(bnu.c).d();
      }

      if ($$0.a(bnu.C)) {
         $$2 = $$0.c(bnu.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(box $$0) {
      return $$0.a(bnu.m) || $$0.a(bnu.C);
   }

   public static List<apb> a(apa $$0, @Nullable bof $$1, eov $$2, double $$3, bns $$4, int $$5) {
      il<bnq> $$6 = $$4.b();
      List<apb> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.r($$6x))
               && $$2.a((iv)$$6x.dh(), $$3)
               && (!$$6x.a($$6) || $$6x.c($$6).d() < $$4.d() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bns($$4), $$1));
      return $$7;
   }
}
