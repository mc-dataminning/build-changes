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
   static final List<cdy<? extends cdx<? super ckx>>> e = ImmutableList.of(cdy.c, cdy.f, cdy.d, cdy.z);
   static final List<ccr<?>> f = ImmutableList.of(
      ccr.n, ccr.h, ccr.B, ccr.E, ccr.o, ccr.m, ccr.aU, ccr.aZ, ccr.aV, ccr.aW, ccr.aX, ccr.aY, new ccr[]{ccr.ba, ccr.bb, ccr.x, ccr.y, ccr.t}
   );

   protected static bup<?> a(bup<ckx> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cok.a));
      $$0.b(cok.k);
      $$0.f();
      return $$0;
   }

   private static void b(bup<ckx> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bya(0.8F), new bwm(45, 90)));
   }

   private static void c(bup<ckx> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxs.a($$0x -> $$0x.dS().c(ccr.B))),
            Pair.of(1, bxs.a(ckx::gr)),
            Pair.of(2, new cky.a(20, 40)),
            Pair.of(3, new bxd(ImmutableList.of(Pair.of(new bvq(20, 100), 1), Pair.of(bwy.a(0.6F), 2))))
         )
      );
   }

   private static void d(bup<ckx> $$0) {
      $$0.a(
         cok.k,
         ImmutableList.of(Pair.of(0, bxv.a()), Pair.of(1, new clb()), Pair.of(2, new cla()), Pair.of(3, new clc()), Pair.of(4, new cld())),
         ImmutableSet.of(Pair.of(ccr.o, ccs.a), Pair.of(ccr.m, ccs.b))
      );
   }

   static void a(ckx $$0) {
      $$0.dS().a(ImmutableList.of(cok.k, cok.b));
   }

   public static class a extends bwq {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(are $$0, btp $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avz.cM);
         $$1.b(btz.p);
      }

      @Override
      protected void b(are $$0, btp $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(btz.a);
         if ($$1.dS().a(ccr.o)) {
            $$1.dS().a(ccr.aV, baa.a, 60L);
         }
      }
   }
}
