import java.util.List;
import javax.annotation.Nullable;

public final class bsz {
   public static xe a(bsy $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xe.c("effect.duration.infinite");
      } else {
         int $$3 = azf.d((float)$$0.d() * $$1);
         return xe.b(bac.a($$3, $$2));
      }
   }

   public static boolean a(bun $$0) {
      return $$0.b(bta.c) || $$0.b(bta.C);
   }

   public static int b(bun $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bta.c)) {
         $$1 = $$0.c(bta.c).e();
      }

      if ($$0.b(bta.C)) {
         $$2 = $$0.c(bta.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bun $$0) {
      return $$0.b(bta.m) || $$0.b(bta.C);
   }

   public static List<ark> a(arj $$0, @Nullable btr $$1, eyw $$2, double $$3, bsy $$4, int $$5) {
      jo<bsw> $$6 = $$4.c();
      List<ark> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jy)$$6x.dq(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bsy($$4), $$1));
      return $$7;
   }
}
