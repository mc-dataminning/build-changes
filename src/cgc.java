import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cgc {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static btq<?> a(btq<cgb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   private static void b(btq<cgb> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new buc(2.0F), new bvn(45, 90), new bvr(), new bun(cbs.P)));
   }

   private static void c(btq<cgb> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, bwh.a(bsa.by, 6.0F, bpf.a(30, 60))),
            Pair.of(1, new buu($$0x -> 1.25F)),
            Pair.of(
               2,
               new buv(
                  ImmutableMap.of(cbs.m, cbt.b),
                  ImmutableSet.of(),
                  buv.a.a,
                  buv.b.b,
                  ImmutableList.of(Pair.of(bvz.c(0.5F), 2), Pair.of(bwo.a(0.5F, 3), 3), Pair.of(bxu.a(bru::bh), 5))
               )
            )
         )
      );
   }

   public static void a(cgb $$0) {
      $$0.dS().a(ImmutableList.of(cnl.b));
   }
}
