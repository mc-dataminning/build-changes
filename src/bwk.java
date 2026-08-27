import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwk {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bkg<?> a(bkg<bwj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdf.a));
      $$0.b(cdf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkg<bwj> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bks(2.0F), new bmc(45, 90), new bmg(), new bld(bsh.O)));
   }

   private static void c(bkg<bwj> $$0) {
      $$0.a(
         cdf.b,
         ImmutableList.of(
            Pair.of(0, bmw.a(biu.bt, 6.0F, bgj.a(30, 60))),
            Pair.of(1, new blk($$0x -> 1.25F)),
            Pair.of(
               2,
               new bll(
                  ImmutableMap.of(bsh.m, bsi.b),
                  ImmutableSet.of(),
                  bll.a.a,
                  bll.b.b,
                  ImmutableList.of(Pair.of(bmo.c(0.5F), 2), Pair.of(bnd.a(0.5F, 3), 3), Pair.of(boj.a(biq::ba), 5))
               )
            )
         )
      );
   }

   public static void a(bwj $$0) {
      $$0.dN().a(ImmutableList.of(cdf.b));
   }
}
