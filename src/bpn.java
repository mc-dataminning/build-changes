import java.util.List;
import javax.annotation.Nullable;

public final class bpn {
   public static wi a(bpm $$0, float $$1, float $$2) {
      if ($$0.a()) {
         return wi.c("effect.duration.infinite");
      } else {
         int $$3 = axm.d((float)$$0.c() * $$1);
         return wi.b(ayh.a($$3, $$2));
      }
   }

   public static boolean a(bqt $$0) {
      return $$0.b(bpo.c) || $$0.b(bpo.C);
   }

   public static int b(bqt $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.b(bpo.c)) {
         $$1 = $$0.c(bpo.c).d();
      }

      if ($$0.b(bpo.C)) {
         $$2 = $$0.c(bpo.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bqt $$0) {
      return $$0.b(bpo.m) || $$0.b(bpo.C);
   }

   public static List<apv> a(apu $$0, @Nullable bqa $$1, esj $$2, double $$3, bpm $$4, int $$5) {
      in<bpk> $$6 = $$4.b();
      List<apv> $$7 = $$0.a(
         $$6x -> $$6x.f.d()
               && ($$1 == null || !$$1.s($$6x))
               && $$2.a((ix)$$6x.dk(), $$3)
               && (!$$6x.b($$6) || $$6x.c($$6).d() < $$4.d() || $$6x.c($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new bpm($$4), $$1));
      return $$7;
   }
}
