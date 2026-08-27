import java.util.List;
import javax.annotation.Nullable;

public final class bfb {
   public static sw a(bfa $$0, float $$1) {
      if ($$0.b()) {
         return sw.c("effect.duration.infinite");
      } else {
         int $$2 = apa.d((float)$$0.d() * $$1);
         return sw.b(aps.a($$2));
      }
   }

   public static boolean a(bfz $$0) {
      return $$0.a(bfc.c) || $$0.a(bfc.C);
   }

   public static int b(bfz $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bfc.c)) {
         $$1 = $$0.b(bfc.c).e();
      }

      if ($$0.a(bfc.C)) {
         $$2 = $$0.b(bfc.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bfz $$0) {
      return $$0.a(bfc.m) || $$0.a(bfc.C);
   }

   public static List<aig> a(aif $$0, @Nullable bfj $$1, eei $$2, double $$3, bfa $$4, int $$5) {
      bey $$6 = $$4.c();
      List<aig> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.p($$6x))
               && $$2.a((ho)$$6x.dg(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bfa($$4), $$1));
      return $$7;
   }
}
