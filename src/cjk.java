import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cjk {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cck<? extends ccj<? super cjj>>> e = ImmutableList.of(cck.c, cck.f, cck.d, cck.z);
   static final List<cbd<?>> f = ImmutableList.of(
      cbd.n, cbd.h, cbd.B, cbd.E, cbd.o, cbd.m, cbd.aU, cbd.aZ, cbd.aV, cbd.aW, cbd.aX, cbd.aY, new cbd[]{cbd.ba, cbd.bb, cbd.x, cbd.y, cbd.t}
   );

   protected static btb<?> a(btb<cjj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cmw.a));
      $$0.b(cmw.k);
      $$0.f();
      return $$0;
   }

   private static void b(btb<cjj> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new bwm(0.8F), new buy(45, 90)));
   }

   private static void c(btb<cjj> $$0) {
      $$0.a(
         cmw.b,
         ImmutableList.of(
            Pair.of(0, bwe.a($$0x -> $$0x.dQ().c(cbd.B))),
            Pair.of(1, bwe.a(cjj::gq)),
            Pair.of(2, new cjk.a(20, 40)),
            Pair.of(3, new bvp(ImmutableList.of(Pair.of(new buc(20, 100), 1), Pair.of(bvk.a(0.6F), 2))))
         )
      );
   }

   private static void d(btb<cjj> $$0) {
      $$0.a(
         cmw.k,
         ImmutableList.of(Pair.of(0, bwh.a()), Pair.of(1, new cjn()), Pair.of(2, new cjm()), Pair.of(3, new cjo()), Pair.of(4, new cjp())),
         ImmutableSet.of(Pair.of(cbd.o, cbe.a), Pair.of(cbd.m, cbe.b))
      );
   }

   static void a(cjj $$0) {
      $$0.dQ().a(ImmutableList.of(cmw.k, cmw.b));
   }

   public static class a extends bvc {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqh $$0, bsc $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avc.cM);
         $$1.b(bsl.p);
      }

      @Override
      protected void b(aqh $$0, bsc $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bsl.a);
         if ($$1.dQ().a(cbd.o)) {
            $$1.dQ().a(cbd.aV, azb.a, 60L);
         }
      }
   }
}
