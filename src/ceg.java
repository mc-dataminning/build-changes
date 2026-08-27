import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ceg {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bru<?> a(bru<cef> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cef> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bsg(2.0F), new btr(45, 90), new btv(), new bsr(bzw.P)));
   }

   private static void c(bru<cef> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, bul.a(bqg.bx, 6.0F, bnq.a(30, 60))),
            Pair.of(1, new bsy($$0x -> 1.25F)),
            Pair.of(
               2,
               new bsz(
                  ImmutableMap.of(bzw.m, bzx.b),
                  ImmutableSet.of(),
                  bsz.a.a,
                  bsz.b.b,
                  ImmutableList.of(Pair.of(bud.c(0.5F), 2), Pair.of(bus.a(0.5F, 3), 3), Pair.of(bvy.a(bqa::bf), 5))
               )
            )
         )
      );
   }

   public static void a(cef $$0) {
      $$0.dP().a(ImmutableList.of(clp.b));
   }
}
