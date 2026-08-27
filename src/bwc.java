import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwc {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bjy<?> a(bjy<bwb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ccx.a));
      $$0.b(ccx.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjy<bwb> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new bkk(2.0F), new blu(45, 90), new bly(), new bkv(brz.O)));
   }

   private static void c(bjy<bwb> $$0) {
      $$0.a(
         ccx.b,
         ImmutableList.of(
            Pair.of(0, bmo.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, new blc($$0x -> 1.25F)),
            Pair.of(
               2,
               new bld(
                  ImmutableMap.of(brz.m, bsa.b),
                  ImmutableSet.of(),
                  bld.a.a,
                  bld.b.b,
                  ImmutableList.of(Pair.of(bmg.c(0.5F), 2), Pair.of(bmv.a(0.5F, 3), 3), Pair.of(bob.a(bii::ba), 5))
               )
            )
         )
      );
   }

   public static void a(bwb $$0) {
      $$0.dM().a(ImmutableList.of(ccx.b));
   }
}
