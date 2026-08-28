import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class chd {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bur<?> a(bur<chc> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(bur<chc> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bvd(2.0F), new bwo(45, 90), new bws(), new bvo(cct.P)));
   }

   private static void c(bur<chc> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxi.a(bta.by, 6.0F, bqf.a(30, 60))),
            Pair.of(1, new bvv($$0x -> 1.25F)),
            Pair.of(
               2,
               new bvw(
                  ImmutableMap.of(cct.m, ccu.b),
                  ImmutableSet.of(),
                  bvw.a.a,
                  bvw.b.b,
                  ImmutableList.of(Pair.of(bxa.c(0.5F), 2), Pair.of(bxp.a(0.5F, 3), 3), Pair.of(byv.a(bsu::bh), 5))
               )
            )
         )
      );
   }

   public static void a(chc $$0) {
      $$0.dS().a(ImmutableList.of(com.b));
   }
}
