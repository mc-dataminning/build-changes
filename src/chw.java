import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class chw {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cay<? extends cax<? super chv>>> e = ImmutableList.of(cay.c, cay.f, cay.d, cay.z);
   static final List<bzr<?>> f = ImmutableList.of(
      bzr.n, bzr.h, bzr.B, bzr.E, bzr.o, bzr.m, bzr.aU, bzr.aZ, bzr.aV, bzr.aW, bzr.aX, bzr.aY, new bzr[]{bzr.ba, bzr.bb, bzr.x, bzr.y, bzr.t}
   );

   protected static brp<?> a(brp<chv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cli.a));
      $$0.b(cli.k);
      $$0.f();
      return $$0;
   }

   private static void b(brp<chv> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bva(0.8F), new btm(45, 90)));
   }

   private static void c(brp<chv> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, bus.a($$0x -> $$0x.dP().c(bzr.B))),
            Pair.of(1, bus.a(chv::go)),
            Pair.of(2, new chw.a(20, 40)),
            Pair.of(3, new bud(ImmutableList.of(Pair.of(new bsq(20, 100), 1), Pair.of(bty.a(0.6F), 2))))
         )
      );
   }

   private static void d(brp<chv> $$0) {
      $$0.a(
         cli.k,
         ImmutableList.of(Pair.of(0, buv.a()), Pair.of(1, new chz()), Pair.of(2, new chy()), Pair.of(3, new cia()), Pair.of(4, new cib())),
         ImmutableSet.of(Pair.of(bzr.o, bzs.a), Pair.of(bzr.m, bzs.b))
      );
   }

   static void a(chv $$0) {
      $$0.dP().a(ImmutableList.of(cli.k, cli.b));
   }

   public static class a extends btq {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aps $$0, bqq $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(aum.cM);
         $$1.b(bqz.p);
      }

      @Override
      protected void b(aps $$0, bqq $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bqz.a);
         if ($$1.dP().a(bzr.o)) {
            $$1.dP().a(bzr.aV, aym.a, 60L);
         }
      }
   }
}
