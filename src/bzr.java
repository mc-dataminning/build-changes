import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzr {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bnl<?> a(bnl<bzq> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgu.a));
      $$0.b(cgu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnl<bzq> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bnx(2.0F), new bpi(45, 90), new bpm(), new boi(bvn.O)));
   }

   private static void c(bnl<bzq> $$0) {
      $$0.a(
         cgu.b,
         ImmutableList.of(
            Pair.of(0, bqc.a(blz.bv, 6.0F, bjm.a(30, 60))),
            Pair.of(1, new bop($$0x -> 1.25F)),
            Pair.of(
               2,
               new boq(
                  ImmutableMap.of(bvn.m, bvo.b),
                  ImmutableSet.of(),
                  boq.a.a,
                  boq.b.b,
                  ImmutableList.of(Pair.of(bpu.c(0.5F), 2), Pair.of(bqj.a(0.5F, 3), 3), Pair.of(brp.a(blv::bc), 5))
               )
            )
         )
      );
   }

   public static void a(bzq $$0) {
      $$0.dO().a(ImmutableList.of(cgu.b));
   }
}
