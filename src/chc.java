import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class chc {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static buq<?> a(buq<chb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<chb> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bvc(2.0F), new bwn(45, 90), new bwr(), new bvn(ccs.P)));
   }

   private static void c(buq<chb> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsx.by, 6.0F, bqc.a(30, 60))),
            Pair.of(1, new bvu($$0x -> 1.25F)),
            Pair.of(
               2,
               new bvv(
                  ImmutableMap.of(ccs.m, cct.b),
                  ImmutableSet.of(),
                  bvv.a.a,
                  bvv.b.b,
                  ImmutableList.of(Pair.of(bwz.c(0.5F), 2), Pair.of(bxo.a(0.5F, 3), 3), Pair.of(byu.a(bsr::bi), 5))
               )
            )
         )
      );
   }

   public static void a(chb $$0) {
      $$0.dU().a(ImmutableList.of(com.b));
   }
}
