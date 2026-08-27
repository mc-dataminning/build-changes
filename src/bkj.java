import java.util.List;
import javax.annotation.Nullable;

public final class bkj {
   public static uv a(bki $$0, float $$1) {
      if ($$0.b()) {
         return uv.c("effect.duration.infinite");
      } else {
         int $$2 = atq.d((float)$$0.d() * $$1);
         return uv.b(aul.a($$2));
      }
   }

   public static boolean a(bll $$0) {
      return $$0.a(bkk.c) || $$0.a(bkk.C);
   }

   public static int b(bll $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bkk.c)) {
         $$1 = $$0.b(bkk.c).e();
      }

      if ($$0.a(bkk.C)) {
         $$2 = $$0.b(bkk.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bll $$0) {
      return $$0.a(bkk.m) || $$0.a(bkk.C);
   }

   public static List<amj> a(ami $$0, @Nullable bkv $$1, ejz $$2, double $$3, bki $$4, int $$5) {
      bkg $$6 = $$4.c();
      List<amj> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((iq)$$6x.dl(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bki($$4), $$1));
      return $$7;
   }
}
