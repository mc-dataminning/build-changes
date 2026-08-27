import java.util.List;
import javax.annotation.Nullable;

public final class bri {
   public static xe a(brh $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xe.c("effect.duration.infinite");
      } else {
         int $$3 = aym.d((float)$$0.d() * $$1);
         return xe.b(azh.a($$3, $$2));
      }
   }

   public static boolean a(bso $$0) {
      return $$0.b(brj.c) || $$0.b(brj.C);
   }

   public static int b(bso $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(brj.c)) {
         $$1 = $$0.c(brj.c).e();
      }

      if ($$0.b(brj.C)) {
         $$2 = $$0.c(brj.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bso $$0) {
      return $$0.b(brj.m) || $$0.b(brj.C);
   }

   public static List<aqu> a(aqt $$0, @Nullable brv $$1, ewu $$2, double $$3, brh $$4, int $$5) {
      ja<brf> $$6 = $$4.c();
      List<aqu> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jk)$$6x.ds(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new brh($$4), $$1));
      return $$7;
   }
}
