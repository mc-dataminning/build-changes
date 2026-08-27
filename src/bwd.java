import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwd {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bjz<?> a(bjz<bwc> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ccy.a));
      $$0.b(ccy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjz<bwc> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new bkl(2.0F), new blv(45, 90), new blz(), new bkw(bsa.O)));
   }

   private static void c(bjz<bwc> $$0) {
      $$0.a(
         ccy.b,
         ImmutableList.of(
            Pair.of(0, bmp.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, new bld($$0x -> 1.25F)),
            Pair.of(
               2,
               new ble(
                  ImmutableMap.of(bsa.m, bsb.b),
                  ImmutableSet.of(),
                  ble.a.a,
                  ble.b.b,
                  ImmutableList.of(Pair.of(bmh.c(0.5F), 2), Pair.of(bmw.a(0.5F, 3), 3), Pair.of(boc.a(bii::ba), 5))
               )
            )
         )
      );
   }

   public static void a(bwc $$0) {
      $$0.dM().a(ImmutableList.of(ccy.b));
   }
}
