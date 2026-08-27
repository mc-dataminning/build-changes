import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cdg {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bwn<? extends bwm<? super cdf>>> e = ImmutableList.of(bwn.c, bwn.f, bwn.d, bwn.x);
   static final List<bvh<?>> f = ImmutableList.of(
      bvh.n, bvh.h, bvh.B, bvh.E, bvh.o, bvh.m, bvh.aT, bvh.aY, bvh.aU, bvh.aV, bvh.aW, bvh.aX, new bvh[]{bvh.aZ, bvh.x, bvh.y, bvh.t}
   );

   protected static bnf<?> a(bnf<cdf> $$0) {
      b($$0);
      c($$0);
      $$0.a(Set.of(cgn.a));
      $$0.b(cgn.k);
      $$0.f();
      return $$0;
   }

   private static void b(bnf<cdf> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bqq(0.8F), new bpc(45, 90), new cdg.a(20, 100)));
   }

   private static void c(bnf<cdf> $$0) {
      $$0.a(
         cgn.k,
         ImmutableList.of(
            Pair.of(0, bqi.a($$0x -> $$0x.dO().c(bvh.B))),
            Pair.of(1, bql.a()),
            Pair.of(2, new cdi()),
            Pair.of(3, new cdh()),
            Pair.of(4, new cdj()),
            Pair.of(4, new bpt(ImmutableList.of(Pair.of(new bog(20, 100), 1), Pair.of(bpo.a(0.6F), 2))))
         ),
         Set.of()
      );
   }

   public static class a extends bpg {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(amz $$0, bmh $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(arm.cq);
         $$1.b(bmr.p);
      }

      @Override
      protected void b(amz $$0, bmh $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bmr.a);
         if ($$1.dO().a(bvh.o)) {
            $$1.dO().a(bvh.aU, avm.a, 60L);
         }
      }
   }
}
