import java.util.List;
import javax.annotation.Nullable;

public final class bli {
   public static vf a(blh $$0, float $$1) {
      if ($$0.b()) {
         return vf.c("effect.duration.infinite");
      } else {
         int $$2 = aun.d((float)$$0.d() * $$1);
         return vf.b(avk.a($$2));
      }
   }

   public static boolean a(bmk $$0) {
      return $$0.a(blj.c) || $$0.a(blj.C);
   }

   public static int b(bmk $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(blj.c)) {
         $$1 = $$0.b(blj.c).e();
      }

      if ($$0.a(blj.C)) {
         $$2 = $$0.b(blj.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bmk $$0) {
      return $$0.a(blj.m) || $$0.a(blj.C);
   }

   public static List<ane> a(and $$0, @Nullable blu $$1, els $$2, double $$3, blh $$4, int $$5) {
      blf $$6 = $$4.c();
      List<ane> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ir)$$6x.dk(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new blh($$4), $$1));
      return $$7;
   }
}
