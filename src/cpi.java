import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cpi {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<chs<? extends chr<? super cph>>> e = ImmutableList.of(chs.c, chs.f, chs.d, chs.z);
   static final List<cgl<?>> f = ImmutableList.of(
      cgl.o, cgl.h, cgl.C, cgl.F, cgl.p, cgl.n, cgl.aV, cgl.ba, cgl.aW, cgl.aX, cgl.aY, cgl.aZ, new cgl[]{cgl.bb, cgl.bc, cgl.y, cgl.z, cgl.u}
   );
   private static final int g = 100;

   protected static byj<?> a(cph $$0, byj<cph> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(ctd.a));
      $$1.b(ctd.k);
      $$1.f();
      return $$1;
   }

   private static void a(byj<cph> $$0) {
      $$0.a(ctd.a, 0, ImmutableList.of(new cbu(0.8F), new cag(45, 90)));
   }

   private static void b(byj<cph> $$0) {
      $$0.a(
         ctd.b,
         ImmutableList.of(
            Pair.of(0, cbm.a(($$0x, $$1) -> $$1.eb().c(cgl.C))),
            Pair.of(1, cbm.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cpi.a(20, 40)),
            Pair.of(3, new cax(ImmutableList.of(Pair.of(new bzk(20, 100), 1), Pair.of(cas.a(0.6F), 2))))
         )
      );
   }

   private static void b(cph $$0, byj<cph> $$1) {
      $$1.a(
         ctd.k,
         ImmutableList.of(
            Pair.of(0, cbp.a(chr.a($$0, 100).negate()::test)), Pair.of(1, new cpl()), Pair.of(2, new cpk()), Pair.of(3, new cpm()), Pair.of(4, new cpn())
         ),
         ImmutableSet.of(Pair.of(cgl.p, cgm.a), Pair.of(cgl.n, cgm.b))
      );
   }

   static void a(cph $$0) {
      $$0.eb().a(ImmutableList.of(ctd.k, ctd.b));
   }

   public static class a extends cak {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arq $$0, bxl $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awn.cM);
         $$1.b(bxv.p);
      }

      @Override
      protected void b(arq $$0, bxl $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bxv.a);
         if ($$1.eb().a(cgl.p)) {
            $$1.eb().a(cgl.aW, bau.a, 60L);
         }
      }
   }
}
