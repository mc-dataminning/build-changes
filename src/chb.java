import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class chb {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bup<?> a(bup<cha> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(bup<cha> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bvb(2.0F), new bwm(45, 90), new bwq(), new bvm(ccr.P)));
   }

   private static void c(bup<cha> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxg.a(bsy.by, 6.0F, bqd.a(30, 60))),
            Pair.of(1, new bvt($$0x -> 1.25F)),
            Pair.of(
               2,
               new bvu(
                  ImmutableMap.of(ccr.m, ccs.b),
                  ImmutableSet.of(),
                  bvu.a.a,
                  bvu.b.b,
                  ImmutableList.of(Pair.of(bwy.c(0.5F), 2), Pair.of(bxn.a(0.5F, 3), 3), Pair.of(byt.a(bss::bh), 5))
               )
            )
         )
      );
   }

   public static void a(cha $$0) {
      $$0.dS().a(ImmutableList.of(cok.b));
   }
}
