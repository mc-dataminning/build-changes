import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cmv {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cfs<? extends cfr<? super cmu>>> e = ImmutableList.of(cfs.c, cfs.f, cfs.d, cfs.z);
   static final List<cel<?>> f = ImmutableList.of(
      cel.n, cel.h, cel.B, cel.E, cel.o, cel.m, cel.aU, cel.aZ, cel.aV, cel.aW, cel.aX, cel.aY, new cel[]{cel.ba, cel.bb, cel.x, cel.y, cel.t}
   );
   private static final int g = 100;

   protected static bwj<?> a(cmu $$0, bwj<cmu> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cql.a));
      $$1.b(cql.k);
      $$1.f();
      return $$1;
   }

   private static void a(bwj<cmu> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new bzu(0.8F), new byg(45, 90)));
   }

   private static void b(bwj<cmu> $$0) {
      $$0.a(
         cql.b,
         ImmutableList.of(
            Pair.of(0, bzm.a(($$0x, $$1) -> $$1.eb().c(cel.B))),
            Pair.of(1, bzm.a(($$0x, $$1) -> $$1.gn())),
            Pair.of(2, new cmv.a(20, 40)),
            Pair.of(3, new byx(ImmutableList.of(Pair.of(new bxk(20, 100), 1), Pair.of(bys.a(0.6F), 2))))
         )
      );
   }

   private static void b(cmu $$0, bwj<cmu> $$1) {
      $$1.a(
         cql.k,
         ImmutableList.of(
            Pair.of(0, bzp.a(cfr.a($$0, 100).negate()::test)), Pair.of(1, new cmy()), Pair.of(2, new cmx()), Pair.of(3, new cmz()), Pair.of(4, new cna())
         ),
         ImmutableSet.of(Pair.of(cel.o, cem.a), Pair.of(cel.m, cem.b))
      );
   }

   static void a(cmu $$0) {
      $$0.eb().a(ImmutableList.of(cql.k, cql.b));
   }

   public static class a extends byk {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arp $$0, bvj $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awn.cM);
         $$1.b(bvt.p);
      }

      @Override
      protected void b(arp $$0, bvj $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bvt.a);
         if ($$1.eb().a(cel.o)) {
            $$1.eb().a(cel.aV, bas.a, 60L);
         }
      }
   }
}
