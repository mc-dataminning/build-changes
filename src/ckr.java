import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ckr {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bxz<?> a(bxz<ckq> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxz<ckq> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new byl(2.0F), new bzw(45, 90), new caa(), new byw(cgb.Q)));
   }

   private static void c(bxz<ckq> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, caq.a(bwj.bS, 6.0F, btj.a(30, 60))),
            Pair.of(1, new bzd($$0x -> 1.25F)),
            Pair.of(
               2,
               new bze(
                  ImmutableMap.of(cgb.n, cgc.b),
                  ImmutableSet.of(),
                  bze.a.a,
                  bze.b.b,
                  ImmutableList.of(Pair.of(cai.c(0.5F), 2), Pair.of(cax.a(0.5F, 3), 3), Pair.of(ccd.a(bwa::bj), 5))
               )
            )
         )
      );
   }

   public static void a(ckq $$0) {
      $$0.eb().a(ImmutableList.of(csl.b));
   }
}
