import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cdm {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bwt<? extends bws<? super cdl>>> e = ImmutableList.of(bwt.c, bwt.f, bwt.d, bwt.x);
   static final List<bvn<?>> f = ImmutableList.of(
      bvn.n, bvn.h, bvn.B, bvn.E, bvn.o, bvn.m, bvn.aT, bvn.aY, bvn.aU, bvn.aV, bvn.aW, bvn.aX, new bvn[]{bvn.aZ, bvn.x, bvn.y, bvn.t}
   );

   protected static bnl<?> a(bnl<cdl> $$0) {
      b($$0);
      c($$0);
      $$0.a(Set.of(cgu.a));
      $$0.b(cgu.k);
      $$0.f();
      return $$0;
   }

   private static void b(bnl<cdl> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bqw(0.8F), new bpi(45, 90), new cdm.a(20, 100)));
   }

   private static void c(bnl<cdl> $$0) {
      $$0.a(
         cgu.k,
         ImmutableList.of(
            Pair.of(0, bqo.a($$0x -> $$0x.dO().c(bvn.B))),
            Pair.of(1, bqr.a()),
            Pair.of(2, new cdo()),
            Pair.of(3, new cdp()),
            Pair.of(4, new cdn()),
            Pair.of(5, new cdq()),
            Pair.of(6, new bpz(ImmutableList.of(Pair.of(new bom(20, 100), 1), Pair.of(bpu.a(0.6F), 2))))
         ),
         Set.of()
      );
   }

   public static class a extends bpm {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(and $$0, bmn $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(ars.cq);
         $$1.b(bmx.p);
      }

      @Override
      protected void b(and $$0, bmn $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bmx.a);
         if ($$1.dO().a(bvn.o)) {
            $$1.dO().a(bvn.aU, avs.a, 60L);
         }
      }
   }
}
