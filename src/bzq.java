import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzq {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bnk<?> a(bnk<bzp> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgt.a));
      $$0.b(cgt.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnk<bzp> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bnw(2.0F), new bph(45, 90), new bpl(), new boh(bvm.O)));
   }

   private static void c(bnk<bzp> $$0) {
      $$0.a(
         cgt.b,
         ImmutableList.of(
            Pair.of(0, bqb.a(bly.bv, 6.0F, bjl.a(30, 60))),
            Pair.of(1, new boo($$0x -> 1.25F)),
            Pair.of(
               2,
               new bop(
                  ImmutableMap.of(bvm.m, bvn.b),
                  ImmutableSet.of(),
                  bop.a.a,
                  bop.b.b,
                  ImmutableList.of(Pair.of(bpt.c(0.5F), 2), Pair.of(bqi.a(0.5F, 3), 3), Pair.of(bro.a(blu::bc), 5))
               )
            )
         )
      );
   }

   public static void a(bzp $$0) {
      $$0.dO().a(ImmutableList.of(cgt.b));
   }
}
