import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ciw {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bwj<?> a(bwj<civ> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cql.a));
      $$0.b(cql.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwj<civ> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new bwv(2.0F), new byg(45, 90), new byk(), new bxg(cel.P)));
   }

   private static void c(bwj<civ> $$0) {
      $$0.a(
         cql.b,
         ImmutableList.of(
            Pair.of(0, bza.a(bus.bO, 6.0F, brv.a(30, 60))),
            Pair.of(1, new bxn($$0x -> 1.25F)),
            Pair.of(
               2,
               new bxo(
                  ImmutableMap.of(cel.m, cem.b),
                  ImmutableSet.of(),
                  bxo.a.a,
                  bxo.b.b,
                  ImmutableList.of(Pair.of(bys.c(0.5F), 2), Pair.of(bzh.a(0.5F, 3), 3), Pair.of(can.a(bul::bm), 5))
               )
            )
         )
      );
   }

   public static void a(civ $$0) {
      $$0.eb().a(ImmutableList.of(cql.b));
   }
}
