import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwb {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bjx<?> a(bjx<bwa> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ccw.a));
      $$0.b(ccw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjx<bwa> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new bkj(2.0F), new blt(45, 90), new blx(), new bku(bry.O)));
   }

   private static void c(bjx<bwa> $$0) {
      $$0.a(
         ccw.b,
         ImmutableList.of(
            Pair.of(0, bmn.a(bik.bt, 6.0F, bfz.a(30, 60))),
            Pair.of(1, new blb($$0x -> 1.25F)),
            Pair.of(
               2,
               new blc(
                  ImmutableMap.of(bry.m, brz.b),
                  ImmutableSet.of(),
                  blc.a.a,
                  blc.b.b,
                  ImmutableList.of(Pair.of(bmf.c(0.5F), 2), Pair.of(bmu.a(0.5F, 3), 3), Pair.of(boa.a(big::ba), 5))
               )
            )
         )
      );
   }

   public static void a(bwa $$0) {
      $$0.dM().a(ImmutableList.of(ccw.b));
   }
}
