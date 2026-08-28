import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cnp {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cgm<? extends cgl<? super cno>>> e = ImmutableList.of(cgm.c, cgm.f, cgm.d, cgm.z);
   static final List<cff<?>> f = ImmutableList.of(
      cff.n, cff.h, cff.B, cff.E, cff.o, cff.m, cff.aU, cff.aZ, cff.aV, cff.aW, cff.aX, cff.aY, new cff[]{cff.ba, cff.bb, cff.x, cff.y, cff.t}
   );
   private static final int g = 100;

   protected static bxd<?> a(cno $$0, bxd<cno> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(crj.a));
      $$1.b(crj.k);
      $$1.f();
      return $$1;
   }

   private static void a(bxd<cno> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new cao(0.8F), new bza(45, 90)));
   }

   private static void b(bxd<cno> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, cag.a(($$0x, $$1) -> $$1.eb().c(cff.B))),
            Pair.of(1, cag.a(($$0x, $$1) -> $$1.gm())),
            Pair.of(2, new cnp.a(20, 40)),
            Pair.of(3, new bzr(ImmutableList.of(Pair.of(new bye(20, 100), 1), Pair.of(bzm.a(0.6F), 2))))
         )
      );
   }

   private static void b(cno $$0, bxd<cno> $$1) {
      $$1.a(
         crj.k,
         ImmutableList.of(
            Pair.of(0, caj.a(cgl.a($$0, 100).negate()::test)), Pair.of(1, new cns()), Pair.of(2, new cnr()), Pair.of(3, new cnt()), Pair.of(4, new cnu())
         ),
         ImmutableSet.of(Pair.of(cff.o, cfg.a), Pair.of(cff.m, cfg.b))
      );
   }

   static void a(cno $$0) {
      $$0.eb().a(ImmutableList.of(crj.k, crj.b));
   }

   public static class a extends bze {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(ash $$0, bwd $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(axf.cM);
         $$1.b(bwn.p);
      }

      @Override
      protected void b(ash $$0, bwd $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bwn.a);
         if ($$1.eb().a(cff.o)) {
            $$1.eb().a(cff.aV, bbk.a, 60L);
         }
      }
   }
}
