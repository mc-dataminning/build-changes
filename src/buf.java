import java.util.List;
import javax.annotation.Nullable;

public final class buf {
   public static wp a(bue $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wp.c("effect.duration.infinite");
      } else {
         int $$3 = ayz.d((float)$$0.d() * $$1);
         return wp.b(azw.a($$3, $$2));
      }
   }

   public static boolean a(bvy $$0) {
      return $$0.b(bug.c) || $$0.b(bug.C);
   }

   public static int b(bvy $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bug.c)) {
         $$1 = $$0.c(bug.c).e();
      }

      if ($$0.b(bug.C)) {
         $$2 = $$0.c(bug.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bvy $$0) {
      return $$0.b(bug.m) || $$0.b(bug.C);
   }

   public static List<are> a(ard $$0, @Nullable bva $$1, fbx $$2, double $$3, bue $$4, int $$5) {
      jr<buc> $$6 = $$4.c();
      List<are> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((kb)$$6x.ds(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bue($$4), $$1));
      return $$7;
   }
}
