import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bxn {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static blj<?> a(blj<bxm> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cei.a));
      $$0.b(cei.b);
      $$0.f();
      return $$0;
   }

   private static void b(blj<bxm> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new blv(2.0F), new bnf(45, 90), new bnj(), new bmg(btk.O)));
   }

   private static void c(blj<bxm> $$0) {
      $$0.a(
         cei.b,
         ImmutableList.of(
            Pair.of(0, bnz.a(bjx.bt, 6.0F, bhm.a(30, 60))),
            Pair.of(1, new bmn($$0x -> 1.25F)),
            Pair.of(
               2,
               new bmo(
                  ImmutableMap.of(btk.m, btl.b),
                  ImmutableSet.of(),
                  bmo.a.a,
                  bmo.b.b,
                  ImmutableList.of(Pair.of(bnr.c(0.5F), 2), Pair.of(bog.a(0.5F, 3), 3), Pair.of(bpm.a(bjt::ba), 5))
               )
            )
         )
      );
   }

   public static void a(bxm $$0) {
      $$0.dN().a(ImmutableList.of(cei.b));
   }
}
