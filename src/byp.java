import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class byp {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bml<?> a(bml<byo> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cfk.a));
      $$0.b(cfk.b);
      $$0.f();
      return $$0;
   }

   private static void b(bml<byo> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new bmx(2.0F), new boh(45, 90), new bol(), new bni(bum.O)));
   }

   private static void c(bml<byo> $$0) {
      $$0.a(
         cfk.b,
         ImmutableList.of(
            Pair.of(0, bpb.a(bkz.bt, 6.0F, bim.a(30, 60))),
            Pair.of(1, new bnp($$0x -> 1.25F)),
            Pair.of(
               2,
               new bnq(
                  ImmutableMap.of(bum.m, bun.b),
                  ImmutableSet.of(),
                  bnq.a.a,
                  bnq.b.b,
                  ImmutableList.of(Pair.of(bot.c(0.5F), 2), Pair.of(bpi.a(0.5F, 3), 3), Pair.of(bqo.a(bkv::bc), 5))
               )
            )
         )
      );
   }

   public static void a(byo $$0) {
      $$0.dP().a(ImmutableList.of(cfk.b));
   }
}
