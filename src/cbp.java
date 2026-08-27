import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cbp {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bpf<?> a(bpf<cbo> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cbo> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bpr(2.0F), new brc(45, 90), new brg(), new bqc(bxh.P)));
   }

   private static void c(bpf<cbo> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, brw.a(bnu.bw, 6.0F, blf.a(30, 60))),
            Pair.of(1, new bqj($$0x -> 1.25F)),
            Pair.of(
               2,
               new bqk(
                  ImmutableMap.of(bxh.m, bxi.b),
                  ImmutableSet.of(),
                  bqk.a.a,
                  bqk.b.b,
                  ImmutableList.of(Pair.of(bro.c(0.5F), 2), Pair.of(bsd.a(0.5F, 3), 3), Pair.of(btj.a(bno::bc), 5))
               )
            )
         )
      );
   }

   public static void a(cbo $$0) {
      $$0.dO().a(ImmutableList.of(ciu.b));
   }
}
