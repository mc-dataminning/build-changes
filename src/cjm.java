import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cjm {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bwz<?> a(bwz<cjl> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwz<cjl> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new bxl(2.0F), new byw(45, 90), new bza(), new bxw(cfb.P)));
   }

   private static void c(bwz<cjl> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, bzq.a(bvi.bS, 6.0F, bsl.a(30, 60))),
            Pair.of(1, new byd($$0x -> 1.25F)),
            Pair.of(
               2,
               new bye(
                  ImmutableMap.of(cfb.m, cfc.b),
                  ImmutableSet.of(),
                  bye.a.a,
                  bye.b.b,
                  ImmutableList.of(Pair.of(bzi.c(0.5F), 2), Pair.of(bzx.a(0.5F, 3), 3), Pair.of(cbd.a(bvb::bm), 5))
               )
            )
         )
      );
   }

   public static void a(cjl $$0) {
      $$0.ec().a(ImmutableList.of(crf.b));
   }
}
