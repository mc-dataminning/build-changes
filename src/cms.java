import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cms {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cfp<? extends cfo<? super cmr>>> e = ImmutableList.of(cfp.c, cfp.f, cfp.d, cfp.z);
   static final List<cei<?>> f = ImmutableList.of(
      cei.n, cei.h, cei.B, cei.E, cei.o, cei.m, cei.aU, cei.aZ, cei.aV, cei.aW, cei.aX, cei.aY, new cei[]{cei.ba, cei.bb, cei.x, cei.y, cei.t}
   );
   private static final int g = 100;

   protected static bwg<?> a(cmr $$0, bwg<cmr> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cqi.a));
      $$1.b(cqi.k);
      $$1.f();
      return $$1;
   }

   private static void a(bwg<cmr> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new bzr(0.8F), new byd(45, 90)));
   }

   private static void b(bwg<cmr> $$0) {
      $$0.a(
         cqi.b,
         ImmutableList.of(
            Pair.of(0, bzj.a($$0x -> $$0x.ee().c(cei.B))),
            Pair.of(1, bzj.a(cmr::gw)),
            Pair.of(2, new cms.a(20, 40)),
            Pair.of(3, new byu(ImmutableList.of(Pair.of(new bxh(20, 100), 1), Pair.of(byp.a(0.6F), 2))))
         )
      );
   }

   private static void b(cmr $$0, bwg<cmr> $$1) {
      $$1.a(
         cqi.k,
         ImmutableList.of(
            Pair.of(0, bzm.a(cfo.a($$0, 100).negate())), Pair.of(1, new cmv()), Pair.of(2, new cmu()), Pair.of(3, new cmw()), Pair.of(4, new cmx())
         ),
         ImmutableSet.of(Pair.of(cei.o, cej.a), Pair.of(cei.m, cej.b))
      );
   }

   static void a(cmr $$0) {
      $$0.ee().a(ImmutableList.of(cqi.k, cqi.b));
   }

   public static class a extends byh {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arq $$0, bvg $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awo.cM);
         $$1.b(bvq.p);
      }

      @Override
      protected void b(arq $$0, bvg $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bvq.a);
         if ($$1.ee().a(cei.o)) {
            $$1.ee().a(cei.aV, bat.a, 60L);
         }
      }
   }
}
