import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzb {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bmv<?> a(bmv<bza> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgd.a));
      $$0.b(cgd.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmv<bza> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bnh(2.0F), new bos(45, 90), new bow(), new bns(bux.O)));
   }

   private static void c(bmv<bza> $$0) {
      $$0.a(
         cgd.b,
         ImmutableList.of(
            Pair.of(0, bpm.a(blj.bv, 6.0F, biw.a(30, 60))),
            Pair.of(1, new bnz($$0x -> 1.25F)),
            Pair.of(
               2,
               new boa(
                  ImmutableMap.of(bux.m, buy.b),
                  ImmutableSet.of(),
                  boa.a.a,
                  boa.b.b,
                  ImmutableList.of(Pair.of(bpe.c(0.5F), 2), Pair.of(bpt.a(0.5F, 3), 3), Pair.of(bqz.a(blf::bc), 5))
               )
            )
         )
      );
   }

   public static void a(bza $$0) {
      $$0.dO().a(ImmutableList.of(cgd.b));
   }
}
