import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class chy {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bvl<?> a(bvl<chx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvl<chx> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new bvx(2.0F), new bxi(45, 90), new bxm(), new bwi(cdn.P)));
   }

   private static void c(bvl<chx> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, byc.a(btv.by, 6.0F, bra.a(30, 60))),
            Pair.of(1, new bwp($$0x -> 1.25F)),
            Pair.of(
               2,
               new bwq(
                  ImmutableMap.of(cdn.m, cdo.b),
                  ImmutableSet.of(),
                  bwq.a.a,
                  bwq.b.b,
                  ImmutableList.of(Pair.of(bxu.c(0.5F), 2), Pair.of(byj.a(0.5F, 3), 3), Pair.of(bzp.a(bto::bl), 5))
               )
            )
         )
      );
   }

   public static void a(chx $$0) {
      $$0.dX().a(ImmutableList.of(cpm.b));
   }
}
