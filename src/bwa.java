import java.util.List;
import javax.annotation.Nullable;

public final class bwa {
   public static xc a(bvz $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xc.c("effect.duration.infinite");
      } else {
         int $$3 = azq.d((float)$$0.d() * $$1);
         return xc.b(bap.a($$3, $$2));
      }
   }

   public static boolean a(bxw $$0) {
      return $$0.b(bwb.c) || $$0.b(bwb.C);
   }

   public static int b(bxw $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bwb.c)) {
         $$1 = $$0.c(bwb.c).e();
      }

      if ($$0.b(bwb.C)) {
         $$2 = $$0.c(bwb.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bxw $$0) {
      return $$0.b(bwb.m) || $$0.b(bwb.C);
   }

   public static List<arv> a(aru $$0, @Nullable bwv $$1, ffs $$2, double $$3, bvz $$4, int $$5) {
      jg<bvx> $$6 = $$4.c();
      List<arv> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jq)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bvz($$4), $$1));
      return $$7;
   }
}
