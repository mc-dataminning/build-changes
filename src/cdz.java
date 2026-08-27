import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cdz {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static brp<?> a(brp<cdy> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   private static void b(brp<cdy> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bsb(2.0F), new btm(45, 90), new btq(), new bsm(bzr.P)));
   }

   private static void c(brp<cdy> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, bug.a(bqb.bx, 6.0F, bnl.a(30, 60))),
            Pair.of(1, new bst($$0x -> 1.25F)),
            Pair.of(
               2,
               new bsu(
                  ImmutableMap.of(bzr.m, bzs.b),
                  ImmutableSet.of(),
                  bsu.a.a,
                  bsu.b.b,
                  ImmutableList.of(Pair.of(bty.c(0.5F), 2), Pair.of(bun.a(0.5F, 3), 3), Pair.of(bvt.a(bpv::bf), 5))
               )
            )
         )
      );
   }

   public static void a(cdy $$0) {
      $$0.dP().a(ImmutableList.of(cli.b));
   }
}
