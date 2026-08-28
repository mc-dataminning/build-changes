import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cky {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cdx<? extends cdw<? super ckx>>> e = ImmutableList.of(cdx.c, cdx.f, cdx.d, cdx.z);
   static final List<ccq<?>> f = ImmutableList.of(
      ccq.n, ccq.h, ccq.B, ccq.E, ccq.o, ccq.m, ccq.aU, ccq.aZ, ccq.aV, ccq.aW, ccq.aX, ccq.aY, new ccq[]{ccq.ba, ccq.bb, ccq.x, ccq.y, ccq.t}
   );

   protected static buo<?> a(ckx $$0, buo<ckx> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cok.a));
      $$1.b(cok.k);
      $$1.f();
      return $$1;
   }

   private static void a(buo<ckx> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bxz(0.8F), new bwl(45, 90)));
   }

   private static void b(buo<ckx> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxr.a($$0x -> $$0x.dU().c(ccq.B))),
            Pair.of(1, bxr.a(ckx::gn)),
            Pair.of(2, new cky.a(20, 40)),
            Pair.of(3, new bxc(ImmutableList.of(Pair.of(new bvp(20, 100), 1), Pair.of(bwx.a(0.6F), 2))))
         )
      );
   }

   private static void b(ckx $$0, buo<ckx> $$1) {
      $$1.a(
         cok.k,
         ImmutableList.of(
            Pair.of(0, bxu.a($$1x -> !cdw.c($$0, $$1x))), Pair.of(1, new clb()), Pair.of(2, new cla()), Pair.of(3, new clc()), Pair.of(4, new cld())
         ),
         ImmutableSet.of(Pair.of(ccq.o, ccr.a), Pair.of(ccq.m, ccr.b))
      );
   }

   static void a(ckx $$0) {
      $$0.dU().a(ImmutableList.of(cok.k, cok.b));
   }

   public static class a extends bwp {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqt $$0, btn $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avo.cM);
         $$1.b(bty.p);
      }

      @Override
      protected void b(aqt $$0, btn $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bty.a);
         if ($$1.dU().a(ccq.o)) {
            $$1.dU().a(ccq.aV, azr.a, 60L);
         }
      }
   }
}
