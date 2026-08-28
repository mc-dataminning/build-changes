import java.util.List;
import javax.annotation.Nullable;

public final class bup {
   public static xv a(buo $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xv.c("effect.duration.infinite");
      } else {
         int $$3 = bae.d((float)$$0.d() * $$1);
         return xv.b(bbb.a($$3, $$2));
      }
   }

   public static boolean a(bwf $$0) {
      return $$0.b(buq.c) || $$0.b(buq.C);
   }

   public static int b(bwf $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(buq.c)) {
         $$1 = $$0.c(buq.c).e();
      }

      if ($$0.b(buq.C)) {
         $$2 = $$0.c(buq.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bwf $$0) {
      return $$0.b(buq.m) || $$0.b(buq.C);
   }

   public static List<asi> a(ash $$0, @Nullable bvj $$1, fbx $$2, double $$3, buo $$4, int $$5) {
      jq<bum> $$6 = $$4.c();
      List<asi> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ka)$$6x.dt(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new buo($$4), $$1));
      return $$7;
   }
}
