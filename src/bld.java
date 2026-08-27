import java.util.List;
import javax.annotation.Nullable;

public final class bld {
   public static vd a(blc $$0, float $$1) {
      if ($$0.b()) {
         return vd.c("effect.duration.infinite");
      } else {
         int $$2 = aui.d((float)$$0.d() * $$1);
         return vd.b(avf.a($$2));
      }
   }

   public static boolean a(bmf $$0) {
      return $$0.a(ble.c) || $$0.a(ble.C);
   }

   public static int b(bmf $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(ble.c)) {
         $$1 = $$0.b(ble.c).e();
      }

      if ($$0.a(ble.C)) {
         $$2 = $$0.b(ble.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bmf $$0) {
      return $$0.a(ble.m) || $$0.a(ble.C);
   }

   public static List<ana> a(amz $$0, @Nullable blp $$1, elm $$2, double $$3, blc $$4, int $$5) {
      bla $$6 = $$4.c();
      List<ana> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ir)$$6x.dk(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).e() < $$4.e() || $$6x.b($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new blc($$4), $$1));
      return $$7;
   }
}
