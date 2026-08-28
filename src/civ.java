import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class civ {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bwi<?> a(bwi<ciu> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwi<ciu> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bwu(2.0F), new byf(45, 90), new byj(), new bxf(cek.P)));
   }

   private static void c(bwi<ciu> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, byz.a(bur.bR, 6.0F, bru.a(30, 60))),
            Pair.of(1, new bxm($$0x -> 1.25F)),
            Pair.of(
               2,
               new bxn(
                  ImmutableMap.of(cek.m, cel.b),
                  ImmutableSet.of(),
                  bxn.a.a,
                  bxn.b.b,
                  ImmutableList.of(Pair.of(byr.c(0.5F), 2), Pair.of(bzg.a(0.5F, 3), 3), Pair.of(cam.a(buk::bm), 5))
               )
            )
         )
      );
   }

   public static void a(ciu $$0) {
      $$0.eb().a(ImmutableList.of(cqn.b));
   }
}
