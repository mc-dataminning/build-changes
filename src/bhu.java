import java.util.List;
import javax.annotation.Nullable;

public final class bhu {
   public static te a(bht $$0, float $$1) {
      if ($$0.b()) {
         return te.c("effect.duration.infinite");
      } else {
         int $$2 = aro.d((float)$$0.d() * $$1);
         return te.b(asg.a($$2));
      }
   }

   public static boolean a(biw $$0) {
      return $$0.a(bhv.c) || $$0.a(bhv.C);
   }

   public static int b(biw $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bhv.c)) {
         $$1 = $$0.b(bhv.c).e();
      }

      if ($$0.a(bhv.C)) {
         $$2 = $$0.b(bhv.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(biw $$0) {
      return $$0.a(bhv.m) || $$0.a(bhv.C);
   }

   public static List<akj> a(aki $$0, @Nullable big $$1, ehf $$2, double $$3, bht $$4, int $$5) {
      bhr $$6 = $$4.c();
      List<akj> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((hp)$$6x.di(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bht($$4), $$1));
      return $$7;
   }
}
