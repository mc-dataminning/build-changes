import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cio {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cbo<? extends cbn<? super cin>>> e = ImmutableList.of(cbo.c, cbo.f, cbo.d, cbo.z);
   static final List<cah<?>> f = ImmutableList.of(
      cah.n, cah.h, cah.B, cah.E, cah.o, cah.m, cah.aU, cah.aZ, cah.aV, cah.aW, cah.aX, cah.aY, new cah[]{cah.ba, cah.bb, cah.x, cah.y, cah.t}
   );

   protected static bsf<?> a(bsf<cin> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cma.a));
      $$0.b(cma.k);
      $$0.f();
      return $$0;
   }

   private static void b(bsf<cin> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new bvq(0.8F), new buc(45, 90)));
   }

   private static void c(bsf<cin> $$0) {
      $$0.a(
         cma.b,
         ImmutableList.of(
            Pair.of(0, bvi.a($$0x -> $$0x.dQ().c(cah.B))),
            Pair.of(1, bvi.a(cin::gq)),
            Pair.of(2, new cio.a(20, 40)),
            Pair.of(3, new but(ImmutableList.of(Pair.of(new btg(20, 100), 1), Pair.of(buo.a(0.6F), 2))))
         )
      );
   }

   private static void d(bsf<cin> $$0) {
      $$0.a(
         cma.k,
         ImmutableList.of(Pair.of(0, bvl.a()), Pair.of(1, new cir()), Pair.of(2, new ciq()), Pair.of(3, new cis()), Pair.of(4, new cit())),
         ImmutableSet.of(Pair.of(cah.o, cai.a), Pair.of(cah.m, cai.b))
      );
   }

   static void a(cin $$0) {
      $$0.dQ().a(ImmutableList.of(cma.k, cma.b));
   }

   public static class a extends bug {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqe $$0, brg $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(auz.cM);
         $$1.b(brp.p);
      }

      @Override
      protected void b(aqe $$0, brg $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(brp.a);
         if ($$1.dQ().a(cah.o)) {
            $$1.dQ().a(cah.aV, ayy.a, 60L);
         }
      }
   }
}
