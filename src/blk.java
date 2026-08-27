import java.util.List;
import javax.annotation.Nullable;

public final class blk {
   public static vg a(blj $$0, float $$1, float $$2) {
      if ($$0.a()) {
         return vg.c("effect.duration.infinite");
      } else {
         int $$3 = aup.d((float)$$0.c() * $$1);
         return vg.b(avm.a($$3, $$2));
      }
   }

   public static boolean a(bmo $$0) {
      return $$0.a(bll.c) || $$0.a(bll.C);
   }

   public static int b(bmo $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bll.c)) {
         $$1 = $$0.c(bll.c).d();
      }

      if ($$0.a(bll.C)) {
         $$2 = $$0.c(bll.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bmo $$0) {
      return $$0.a(bll.m) || $$0.a(bll.C);
   }

   public static List<anf> a(ane $$0, @Nullable blw $$1, emc $$2, double $$3, blj $$4, int $$5) {
      ih<blh> $$6 = $$4.b();
      List<anf> $$7 = $$0.a(
         $$6x -> $$6x.e.d()
               && ($$1 == null || !$$1.r($$6x))
               && $$2.a((ir)$$6x.dj(), $$3)
               && (!$$6x.a($$6) || $$6x.c($$6).d() < $$4.d() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new blj($$4), $$1));
      return $$7;
   }
}
