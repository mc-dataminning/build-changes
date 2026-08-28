import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cmw {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cft<? extends cfs<? super cmv>>> e = ImmutableList.of(cft.c, cft.f, cft.d, cft.z);
   static final List<cem<?>> f = ImmutableList.of(
      cem.n, cem.h, cem.B, cem.E, cem.o, cem.m, cem.aU, cem.aZ, cem.aV, cem.aW, cem.aX, cem.aY, new cem[]{cem.ba, cem.bb, cem.x, cem.y, cem.t}
   );
   private static final int g = 100;

   protected static bwk<?> a(cmv $$0, bwk<cmv> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cqp.a));
      $$1.b(cqp.k);
      $$1.f();
      return $$1;
   }

   private static void a(bwk<cmv> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bzv(0.8F), new byh(45, 90)));
   }

   private static void b(bwk<cmv> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, bzn.a(($$0x, $$1) -> $$1.eb().c(cem.B))),
            Pair.of(1, bzn.a(($$0x, $$1) -> $$1.gs())),
            Pair.of(2, new cmw.a(20, 40)),
            Pair.of(3, new byy(ImmutableList.of(Pair.of(new bxl(20, 100), 1), Pair.of(byt.a(0.6F), 2))))
         )
      );
   }

   private static void b(cmv $$0, bwk<cmv> $$1) {
      $$1.a(
         cqp.k,
         ImmutableList.of(
            Pair.of(0, bzq.a(cfs.a($$0, 100).negate()::test)), Pair.of(1, new cmz()), Pair.of(2, new cmy()), Pair.of(3, new cna()), Pair.of(4, new cnb())
         ),
         ImmutableSet.of(Pair.of(cem.o, cen.a), Pair.of(cem.m, cen.b))
      );
   }

   static void a(cmv $$0) {
      $$0.eb().a(ImmutableList.of(cqp.k, cqp.b));
   }

   public static class a extends byl {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(ard $$0, bvk $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awa.cM);
         $$1.b(bvu.p);
      }

      @Override
      protected void b(ard $$0, bvk $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bvu.a);
         if ($$1.eb().a(cem.o)) {
            $$1.eb().a(cem.aV, baf.a, 60L);
         }
      }
   }
}
