import java.util.List;
import javax.annotation.Nullable;

public final class bkt {
   public static vb a(bks $$0, float $$1) {
      if ($$0.b()) {
         return vb.c("effect.duration.infinite");
      } else {
         int $$2 = aty.d((float)$$0.d() * $$1);
         return vb.b(auu.a($$2));
      }
   }

   public static boolean a(blv $$0) {
      return $$0.a(bku.c) || $$0.a(bku.C);
   }

   public static int b(blv $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bku.c)) {
         $$1 = $$0.b(bku.c).e();
      }

      if ($$0.a(bku.C)) {
         $$2 = $$0.b(bku.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(blv $$0) {
      return $$0.a(bku.m) || $$0.a(bku.C);
   }

   public static List<amq> a(amp $$0, @Nullable blf $$1, elb $$2, double $$3, bks $$4, int $$5) {
      bkq $$6 = $$4.c();
      List<amq> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ip)$$6x.dk(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bks($$4), $$1));
      return $$7;
   }
}
