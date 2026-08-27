import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cer {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bsf<?> a(bsf<ceq> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cma.a));
      $$0.b(cma.b);
      $$0.f();
      return $$0;
   }

   private static void b(bsf<ceq> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new bsr(2.0F), new buc(45, 90), new bug(), new btc(cah.P)));
   }

   private static void c(bsf<ceq> $$0) {
      $$0.a(
         cma.b,
         ImmutableList.of(
            Pair.of(0, buw.a(bqr.bx, 6.0F, bob.a(30, 60))),
            Pair.of(1, new btj($$0x -> 1.25F)),
            Pair.of(
               2,
               new btk(
                  ImmutableMap.of(cah.m, cai.b),
                  ImmutableSet.of(),
                  btk.a.a,
                  btk.b.b,
                  ImmutableList.of(Pair.of(buo.c(0.5F), 2), Pair.of(bvd.a(0.5F, 3), 3), Pair.of(bwj.a(bql::bf), 5))
               )
            )
         )
      );
   }

   public static void a(ceq $$0) {
      $$0.dQ().a(ImmutableList.of(cma.b));
   }
}
