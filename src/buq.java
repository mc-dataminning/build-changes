import java.util.List;
import javax.annotation.Nullable;

public final class buq {
   public static xv a(bup $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xv.c("effect.duration.infinite");
      } else {
         int $$3 = bae.d((float)$$0.d() * $$1);
         return xv.b(bbb.a($$3, $$2));
      }
   }

   public static boolean a(bwg $$0) {
      return $$0.b(bur.c) || $$0.b(bur.C);
   }

   public static int b(bwg $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bur.c)) {
         $$1 = $$0.c(bur.c).e();
      }

      if ($$0.b(bur.C)) {
         $$2 = $$0.c(bur.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bwg $$0) {
      return $$0.b(bur.m) || $$0.b(bur.C);
   }

   public static List<asi> a(ash $$0, @Nullable bvk $$1, fby $$2, double $$3, bup $$4, int $$5) {
      jq<bun> $$6 = $$4.c();
      List<asi> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ka)$$6x.du(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bup($$4), $$1));
      return $$7;
   }
}
