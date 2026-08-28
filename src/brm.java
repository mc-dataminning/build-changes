import java.util.List;
import javax.annotation.Nullable;

public final class brm {
   public static wu a(brl $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return wu.c("effect.duration.infinite");
      } else {
         int $$3 = aye.d((float)$$0.d() * $$1);
         return wu.b(aza.a($$3, $$2));
      }
   }

   public static boolean a(bsy $$0) {
      return $$0.b(brn.c) || $$0.b(brn.C);
   }

   public static int b(bsy $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(brn.c)) {
         $$1 = $$0.c(brn.c).e();
      }

      if ($$0.b(brn.C)) {
         $$2 = $$0.c(brn.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bsy $$0) {
      return $$0.b(brn.m) || $$0.b(brn.C);
   }

   public static List<aql> a(aqk $$0, @Nullable bsd $$1, evz $$2, double $$3, brl $$4, int $$5) {
      jj<brj> $$6 = $$4.c();
      List<aql> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jt)$$6x.dn(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new brl($$4), $$1));
      return $$7;
   }
}
