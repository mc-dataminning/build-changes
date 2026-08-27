import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cid {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cbd<? extends cbc<? super cic>>> e = ImmutableList.of(cbd.c, cbd.f, cbd.d, cbd.z);
   static final List<bzw<?>> f = ImmutableList.of(
      bzw.n, bzw.h, bzw.B, bzw.E, bzw.o, bzw.m, bzw.aU, bzw.aZ, bzw.aV, bzw.aW, bzw.aX, bzw.aY, new bzw[]{bzw.ba, bzw.bb, bzw.x, bzw.y, bzw.t}
   );

   protected static bru<?> a(bru<cic> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(clp.a));
      $$0.b(clp.k);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cic> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bvf(0.8F), new btr(45, 90)));
   }

   private static void c(bru<cic> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, bux.a($$0x -> $$0x.dP().c(bzw.B))),
            Pair.of(1, bux.a(cic::go)),
            Pair.of(2, new cid.a(20, 40)),
            Pair.of(3, new bui(ImmutableList.of(Pair.of(new bsv(20, 100), 1), Pair.of(bud.a(0.6F), 2))))
         )
      );
   }

   private static void d(bru<cic> $$0) {
      $$0.a(
         clp.k,
         ImmutableList.of(Pair.of(0, bva.a()), Pair.of(1, new cig()), Pair.of(2, new cif()), Pair.of(3, new cih()), Pair.of(4, new cii())),
         ImmutableSet.of(Pair.of(bzw.o, bzx.a), Pair.of(bzw.m, bzx.b))
      );
   }

   static void a(cic $$0) {
      $$0.dP().a(ImmutableList.of(clp.k, clp.b));
   }

   public static class a extends btv {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(apu $$0, bqv $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(auo.cM);
         $$1.b(bre.p);
      }

      @Override
      protected void b(apu $$0, bqv $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bre.a);
         if ($$1.dP().a(bzw.o)) {
            $$1.dP().a(bzw.aV, ayo.a, 60L);
         }
      }
   }
}
