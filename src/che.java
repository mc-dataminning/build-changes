import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class che {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bus<?> a(bus<chd> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bus<chd> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new bve(2.0F), new bwp(45, 90), new bwt(), new bvp(ccu.P)));
   }

   private static void c(bus<chd> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, bxj.a(btb.by, 6.0F, bqg.a(30, 60))),
            Pair.of(1, new bvw($$0x -> 1.25F)),
            Pair.of(
               2,
               new bvx(
                  ImmutableMap.of(ccu.m, ccv.b),
                  ImmutableSet.of(),
                  bvx.a.a,
                  bvx.b.b,
                  ImmutableList.of(Pair.of(bxb.c(0.5F), 2), Pair.of(bxq.a(0.5F, 3), 3), Pair.of(byw.a(bsv::bh), 5))
               )
            )
         )
      );
   }

   public static void a(chd $$0) {
      $$0.dS().a(ImmutableList.of(coo.b));
   }
}
