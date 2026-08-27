import java.util.List;
import javax.annotation.Nullable;

public final class bke {
   public static ur a(bkd $$0, float $$1) {
      if ($$0.b()) {
         return ur.c("effect.duration.infinite");
      } else {
         int $$2 = atm.d((float)$$0.d() * $$1);
         return ur.b(auh.a($$2));
      }
   }

   public static boolean a(blg $$0) {
      return $$0.a(bkf.c) || $$0.a(bkf.C);
   }

   public static int b(blg $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bkf.c)) {
         $$1 = $$0.b(bkf.c).e();
      }

      if ($$0.a(bkf.C)) {
         $$2 = $$0.b(bkf.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(blg $$0) {
      return $$0.a(bkf.m) || $$0.a(bkf.C);
   }

   public static List<amf> a(ame $$0, @Nullable bkq $$1, eju $$2, double $$3, bkd $$4, int $$5) {
      bkb $$6 = $$4.c();
      List<amf> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((im)$$6x.dl(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bkd($$4), $$1));
      return $$7;
   }
}
