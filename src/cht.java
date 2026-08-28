import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cht {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bvg<?> a(bvg<chs> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvg<chs> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new bvs(2.0F), new bxd(45, 90), new bxh(), new bwd(cdi.P)));
   }

   private static void c(bvg<chs> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, bxx.a(btq.by, 6.0F, bqv.a(30, 60))),
            Pair.of(1, new bwk($$0x -> 1.25F)),
            Pair.of(
               2,
               new bwl(
                  ImmutableMap.of(cdi.m, cdj.b),
                  ImmutableSet.of(),
                  bwl.a.a,
                  bwl.b.b,
                  ImmutableList.of(Pair.of(bxp.c(0.5F), 2), Pair.of(bye.a(0.5F, 3), 3), Pair.of(bzk.a(btj::bl), 5))
               )
            )
         )
      );
   }

   public static void a(chs $$0) {
      $$0.dX().a(ImmutableList.of(cpg.b));
   }
}
