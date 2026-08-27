import java.util.List;
import javax.annotation.Nullable;

public final class bne {
   public static vq a(bnd $$0, float $$1, float $$2) {
      if ($$0.a()) {
         return vq.c("effect.duration.infinite");
      } else {
         int $$3 = awi.d((float)$$0.c() * $$1);
         return vq.b(axd.a($$3, $$2));
      }
   }

   public static boolean a(boi $$0) {
      return $$0.a(bnf.c) || $$0.a(bnf.C);
   }

   public static int b(boi $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bnf.c)) {
         $$1 = $$0.c(bnf.c).d();
      }

      if ($$0.a(bnf.C)) {
         $$2 = $$0.c(bnf.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(boi $$0) {
      return $$0.a(bnf.m) || $$0.a(bnf.C);
   }

   public static List<aox> a(aow $$0, @Nullable bnq $$1, enz $$2, double $$3, bnd $$4, int $$5) {
      ij<bnb> $$6 = $$4.b();
      List<aox> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.r($$6x))
               && $$2.a((it)$$6x.dk(), $$3)
               && (!$$6x.a($$6) || $$6x.c($$6).d() < $$4.d() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bnd($$4), $$1));
      return $$7;
   }
}
