import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cdt {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bwx<? extends bww<? super cds>>> e = ImmutableList.of(bwx.c, bwx.f, bwx.d, bwx.z);
   static final List<bvq<?>> f = ImmutableList.of(
      bvq.n, bvq.h, bvq.B, bvq.E, bvq.o, bvq.m, bvq.aU, bvq.aZ, bvq.aV, bvq.aW, bvq.aX, bvq.aY, new bvq[]{bvq.ba, bvq.bb, bvq.x, bvq.y, bvq.t}
   );

   protected static bno<?> a(bno<cds> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(chc.a));
      $$0.b(chc.k);
      $$0.f();
      return $$0;
   }

   private static void b(bno<cds> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bqz(0.8F), new bpl(45, 90)));
   }

   private static void c(bno<cds> $$0) {
      $$0.a(
         chc.b,
         ImmutableList.of(
            Pair.of(0, bqr.a($$0x -> $$0x.dN().c(bvq.B))),
            Pair.of(2, new cdt.a(20, 40)),
            Pair.of(3, new bqc(ImmutableList.of(Pair.of(new bop(20, 100), 1), Pair.of(bpx.a(0.6F), 2))))
         )
      );
   }

   private static void d(bno<cds> $$0) {
      $$0.a(
         chc.k,
         ImmutableList.of(Pair.of(0, bqu.a()), Pair.of(1, new cdw()), Pair.of(2, new cdv()), Pair.of(3, new cdx()), Pair.of(4, new cdy())),
         ImmutableSet.of(Pair.of(bvq.o, bvr.a), Pair.of(bvq.m, bvr.b))
      );
   }

   static void a(cds $$0) {
      $$0.dN().a(ImmutableList.of(chc.k, chc.b));
   }

   public static class a extends bpp {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(ane $$0, bmq $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(art.cE);
         $$1.b(bna.p);
      }

      @Override
      protected void b(ane $$0, bmq $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bna.a);
         if ($$1.dN().a(bvq.o)) {
            $$1.dN().a(bvq.aV, avt.a, 60L);
         }
      }
   }
}
