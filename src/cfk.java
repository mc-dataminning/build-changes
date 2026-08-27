import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cfk {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<byo<? extends byn<? super cfj>>> e = ImmutableList.of(byo.c, byo.f, byo.d, byo.z);
   static final List<bxh<?>> f = ImmutableList.of(
      bxh.n, bxh.h, bxh.B, bxh.E, bxh.o, bxh.m, bxh.aU, bxh.aZ, bxh.aV, bxh.aW, bxh.aX, bxh.aY, new bxh[]{bxh.ba, bxh.bb, bxh.x, bxh.y, bxh.t}
   );

   protected static bpf<?> a(bpf<cfj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ciu.a));
      $$0.b(ciu.k);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cfj> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bsq(0.8F), new brc(45, 90)));
   }

   private static void c(bpf<cfj> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, bsi.a($$0x -> $$0x.dO().c(bxh.B))),
            Pair.of(2, new cfk.a(20, 40)),
            Pair.of(3, new brt(ImmutableList.of(Pair.of(new bqg(20, 100), 1), Pair.of(bro.a(0.6F), 2))))
         )
      );
   }

   private static void d(bpf<cfj> $$0) {
      $$0.a(
         ciu.k,
         ImmutableList.of(Pair.of(0, bsl.a()), Pair.of(1, new cfn()), Pair.of(2, new cfm()), Pair.of(3, new cfo()), Pair.of(4, new cfp())),
         ImmutableSet.of(Pair.of(bxh.o, bxi.a), Pair.of(bxh.m, bxi.b))
      );
   }

   static void a(cfj $$0) {
      $$0.dO().a(ImmutableList.of(ciu.k, ciu.b));
   }

   public static class a extends brg {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aov $$0, boi $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(atk.cE);
         $$1.b(bor.p);
      }

      @Override
      protected void b(aov $$0, boi $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bor.a);
         if ($$1.dO().a(bxh.o)) {
            $$1.dO().a(bxh.aV, axk.a, 60L);
         }
      }
   }
}
