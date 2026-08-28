import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cmj {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cfg<? extends cff<? super cmi>>> e = ImmutableList.of(cfg.c, cfg.f, cfg.d, cfg.z);
   static final List<cdz<?>> f = ImmutableList.of(
      cdz.n, cdz.h, cdz.B, cdz.E, cdz.o, cdz.m, cdz.aU, cdz.aZ, cdz.aV, cdz.aW, cdz.aX, cdz.aY, new cdz[]{cdz.ba, cdz.bb, cdz.x, cdz.y, cdz.t}
   );
   private static final int g = 100;

   protected static bvx<?> a(cmi $$0, bvx<cmi> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cpz.a));
      $$1.b(cpz.k);
      $$1.f();
      return $$1;
   }

   private static void a(bvx<cmi> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bzi(0.8F), new bxu(45, 90)));
   }

   private static void b(bvx<cmi> $$0) {
      $$0.a(
         cpz.b,
         ImmutableList.of(
            Pair.of(0, bza.a($$0x -> $$0x.ed().c(cdz.B))),
            Pair.of(1, bza.a(cmi::gw)),
            Pair.of(2, new cmj.a(20, 40)),
            Pair.of(3, new byl(ImmutableList.of(Pair.of(new bwy(20, 100), 1), Pair.of(byg.a(0.6F), 2))))
         )
      );
   }

   private static void b(cmi $$0, bvx<cmi> $$1) {
      $$1.a(
         cpz.k,
         ImmutableList.of(
            Pair.of(0, bzd.a(cff.a($$0, 100).negate())), Pair.of(1, new cmm()), Pair.of(2, new cml()), Pair.of(3, new cmn()), Pair.of(4, new cmo())
         ),
         ImmutableSet.of(Pair.of(cdz.o, cea.a), Pair.of(cdz.m, cea.b))
      );
   }

   static void a(cmi $$0) {
      $$0.ed().a(ImmutableList.of(cpz.k, cpz.b));
   }

   public static class a extends bxy {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arm $$0, bux $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awk.cM);
         $$1.b(bvh.p);
      }

      @Override
      protected void b(arm $$0, bux $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bvh.a);
         if ($$1.ed().a(cdz.o)) {
            $$1.ed().a(cdz.aV, bao.a, 60L);
         }
      }
   }
}
