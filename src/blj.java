import java.util.List;
import javax.annotation.Nullable;

public final class blj {
   public static vf a(bli $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return vf.c("effect.duration.infinite");
      } else {
         int $$3 = auo.d((float)$$0.d() * $$1);
         return vf.b(avl.a($$3, $$2));
      }
   }

   public static boolean a(bml $$0) {
      return $$0.a(blk.c) || $$0.a(blk.C);
   }

   public static int b(bml $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(blk.c)) {
         $$1 = $$0.b(blk.c).e();
      }

      if ($$0.a(blk.C)) {
         $$2 = $$0.b(blk.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bml $$0) {
      return $$0.a(blk.m) || $$0.a(blk.C);
   }

   public static List<ane> a(and $$0, @Nullable blv $$1, elt $$2, double $$3, bli $$4, int $$5) {
      blg $$6 = $$4.c();
      List<ane> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ir)$$6x.dk(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bli($$4), $$1));
      return $$7;
   }
}
