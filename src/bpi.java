import java.util.List;
import javax.annotation.Nullable;

public final class bpi {
   public static wg a(bph $$0, float $$1, float $$2) {
      if ($$0.a()) {
         return wg.c("effect.duration.infinite");
      } else {
         int $$3 = axk.d((float)$$0.c() * $$1);
         return wg.b(ayf.a($$3, $$2));
      }
   }

   public static boolean a(bqo $$0) {
      return $$0.b(bpj.c) || $$0.b(bpj.C);
   }

   public static int b(bqo $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bpj.c)) {
         $$1 = $$0.c(bpj.c).d();
      }

      if ($$0.b(bpj.C)) {
         $$2 = $$0.c(bpj.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bqo $$0) {
      return $$0.b(bpj.m) || $$0.b(bpj.C);
   }

   public static List<apt> a(aps $$0, @Nullable bpv $$1, esa $$2, double $$3, bph $$4, int $$5) {
      il<bpf> $$6 = $$4.b();
      List<apt> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((iv)$$6x.dk(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).d() < $$4.d() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bph($$4), $$1));
      return $$7;
   }
}
