import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzl {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bnf<?> a(bnf<bzk> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgn.a));
      $$0.b(cgn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnf<bzk> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bnr(2.0F), new bpc(45, 90), new bpg(), new boc(bvh.O)));
   }

   private static void c(bnf<bzk> $$0) {
      $$0.a(
         cgn.b,
         ImmutableList.of(
            Pair.of(0, bpw.a(blt.bv, 6.0F, bjg.a(30, 60))),
            Pair.of(1, new boj($$0x -> 1.25F)),
            Pair.of(
               2,
               new bok(
                  ImmutableMap.of(bvh.m, bvi.b),
                  ImmutableSet.of(),
                  bok.a.a,
                  bok.b.b,
                  ImmutableList.of(Pair.of(bpo.c(0.5F), 2), Pair.of(bqd.a(0.5F, 3), 3), Pair.of(brj.a(blp::bc), 5))
               )
            )
         )
      );
   }

   public static void a(bzk $$0) {
      $$0.dO().a(ImmutableList.of(cgn.b));
   }
}
