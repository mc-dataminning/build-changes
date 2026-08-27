import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzy {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bno<?> a(bno<bzx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(chc.a));
      $$0.b(chc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bno<bzx> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new boa(2.0F), new bpl(45, 90), new bpp(), new bol(bvq.P)));
   }

   private static void c(bno<bzx> $$0) {
      $$0.a(
         chc.b,
         ImmutableList.of(
            Pair.of(0, bqf.a(bmc.bw, 6.0F, bjn.a(30, 60))),
            Pair.of(1, new bos($$0x -> 1.25F)),
            Pair.of(
               2,
               new bot(
                  ImmutableMap.of(bvq.m, bvr.b),
                  ImmutableSet.of(),
                  bot.a.a,
                  bot.b.b,
                  ImmutableList.of(Pair.of(bpx.c(0.5F), 2), Pair.of(bqm.a(0.5F, 3), 3), Pair.of(brs.a(blw::bc), 5))
               )
            )
         )
      );
   }

   public static void a(bzx $$0) {
      $$0.dN().a(ImmutableList.of(chc.b));
   }
}
