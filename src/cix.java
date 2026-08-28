import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cix {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bwk<?> a(bwk<ciw> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwk<ciw> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bww(2.0F), new byh(45, 90), new byl(), new bxh(cem.P)));
   }

   private static void c(bwk<ciw> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, bzb.a(but.bR, 6.0F, brw.a(30, 60))),
            Pair.of(1, new bxo($$0x -> 1.25F)),
            Pair.of(
               2,
               new bxp(
                  ImmutableMap.of(cem.m, cen.b),
                  ImmutableSet.of(),
                  bxp.a.a,
                  bxp.b.b,
                  ImmutableList.of(Pair.of(byt.c(0.5F), 2), Pair.of(bzi.a(0.5F, 3), 3), Pair.of(cao.a(bum::bm), 5))
               )
            )
         )
      );
   }

   public static void a(ciw $$0) {
      $$0.eb().a(ImmutableList.of(cqp.b));
   }
}
