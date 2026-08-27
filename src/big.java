import java.util.List;
import javax.annotation.Nullable;

public final class big {
   public static tn a(bif $$0, float $$1) {
      if ($$0.b()) {
         return tn.c("effect.duration.infinite");
      } else {
         int $$2 = ary.d((float)$$0.d() * $$1);
         return tn.b(ass.a($$2));
      }
   }

   public static boolean a(bji $$0) {
      return $$0.a(bih.c) || $$0.a(bih.C);
   }

   public static int b(bji $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bih.c)) {
         $$1 = $$0.b(bih.c).e();
      }

      if ($$0.a(bih.C)) {
         $$2 = $$0.b(bih.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bji $$0) {
      return $$0.a(bih.m) || $$0.a(bih.C);
   }

   public static List<akt> a(aks $$0, @Nullable bis $$1, ehp $$2, double $$3, bif $$4, int $$5) {
      bid $$6 = $$4.c();
      List<akt> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((hq)$$6x.dj(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bif($$4), $$1));
      return $$7;
   }
}
