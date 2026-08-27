import java.util.List;
import javax.annotation.Nullable;

public final class bpy {
   public static ws a(bpx $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return ws.c("effect.duration.infinite");
      } else {
         int $$3 = axw.d((float)$$0.d() * $$1);
         return ws.b(ayr.a($$3, $$2));
      }
   }

   public static boolean a(bre $$0) {
      return $$0.b(bpz.c) || $$0.b(bpz.C);
   }

   public static int b(bre $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bpz.c)) {
         $$1 = $$0.c(bpz.c).e();
      }

      if ($$0.b(bpz.C)) {
         $$2 = $$0.c(bpz.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bre $$0) {
      return $$0.b(bpz.m) || $$0.b(bpz.C);
   }

   public static List<aqf> a(aqe $$0, @Nullable bql $$1, etf $$2, double $$3, bpx $$4, int $$5) {
      iv<bpv> $$6 = $$4.c();
      List<aqf> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((jf)$$6x.dl(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).e() < $$4.e() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bpx($$4), $$1));
      return $$7;
   }
}
