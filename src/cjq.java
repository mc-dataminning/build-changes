import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cjq {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bxd<?> a(bxd<cjp> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxd<cjp> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new bxp(2.0F), new bza(45, 90), new bze(), new bya(cff.P)));
   }

   private static void c(bxd<cjp> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, bzu.a(bvm.bS, 6.0F, bsp.a(30, 60))),
            Pair.of(1, new byh($$0x -> 1.25F)),
            Pair.of(
               2,
               new byi(
                  ImmutableMap.of(cff.m, cfg.b),
                  ImmutableSet.of(),
                  byi.a.a,
                  byi.b.b,
                  ImmutableList.of(Pair.of(bzm.c(0.5F), 2), Pair.of(cab.a(0.5F, 3), 3), Pair.of(cbh.a(bvf::bm), 5))
               )
            )
         )
      );
   }

   public static void a(cjp $$0) {
      $$0.eb().a(ImmutableList.of(crj.b));
   }
}
