import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class ckv {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cdv<? extends cdu<? super cku>>> e = ImmutableList.of(cdv.c, cdv.f, cdv.d, cdv.z);
   static final List<cco<?>> f = ImmutableList.of(
      cco.n, cco.h, cco.B, cco.E, cco.o, cco.m, cco.aU, cco.aZ, cco.aV, cco.aW, cco.aX, cco.aY, new cco[]{cco.ba, cco.bb, cco.x, cco.y, cco.t}
   );

   protected static bum<?> a(bum<cku> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(coh.a));
      $$0.b(coh.k);
      $$0.f();
      return $$0;
   }

   private static void b(bum<cku> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bxx(0.8F), new bwj(45, 90)));
   }

   private static void c(bum<cku> $$0) {
      $$0.a(
         coh.b,
         ImmutableList.of(
            Pair.of(0, bxp.a($$0x -> $$0x.dS().c(cco.B))),
            Pair.of(1, bxp.a(cku::gr)),
            Pair.of(2, new ckv.a(20, 40)),
            Pair.of(3, new bxa(ImmutableList.of(Pair.of(new bvn(20, 100), 1), Pair.of(bwv.a(0.6F), 2))))
         )
      );
   }

   private static void d(bum<cku> $$0) {
      $$0.a(
         coh.k,
         ImmutableList.of(Pair.of(0, bxs.a()), Pair.of(1, new cky()), Pair.of(2, new ckx()), Pair.of(3, new ckz()), Pair.of(4, new cla())),
         ImmutableSet.of(Pair.of(cco.o, ccp.a), Pair.of(cco.m, ccp.b))
      );
   }

   static void a(cku $$0) {
      $$0.dS().a(ImmutableList.of(coh.k, coh.b));
   }

   public static class a extends bwn {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arb $$0, btm $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avw.cM);
         $$1.b(btw.p);
      }

      @Override
      protected void b(arb $$0, btm $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(btw.a);
         if ($$1.dS().a(cco.o)) {
            $$1.dS().a(cco.aV, azx.a, 60L);
         }
      }
   }
}
