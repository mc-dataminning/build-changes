import java.util.List;
import javax.annotation.Nullable;

public final class bhz {
   public static ti a(bhy $$0, float $$1) {
      if ($$0.b()) {
         return ti.c("effect.duration.infinite");
      } else {
         int $$2 = ars.d((float)$$0.d() * $$1);
         return ti.b(asl.a($$2));
      }
   }

   public static boolean a(bjb $$0) {
      return $$0.a(bia.c) || $$0.a(bia.C);
   }

   public static int b(bjb $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bia.c)) {
         $$1 = $$0.b(bia.c).e();
      }

      if ($$0.a(bia.C)) {
         $$2 = $$0.b(bia.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bjb $$0) {
      return $$0.a(bia.m) || $$0.a(bia.C);
   }

   public static List<ako> a(akn $$0, @Nullable bil $$1, ehi $$2, double $$3, bhy $$4, int $$5) {
      bhw $$6 = $$4.c();
      List<ako> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((hq)$$6x.di(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bhy($$4), $$1));
      return $$7;
   }
}
