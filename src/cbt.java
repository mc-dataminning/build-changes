import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cbt {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bpj<?> a(bpj<cbs> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cbs> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bpv(2.0F), new brg(45, 90), new brk(), new bqg(bxl.P)));
   }

   private static void c(bpj<cbs> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, bsa.a(bnw.bw, 6.0F, blh.a(30, 60))),
            Pair.of(1, new bqn($$0x -> 1.25F)),
            Pair.of(
               2,
               new bqo(
                  ImmutableMap.of(bxl.m, bxm.b),
                  ImmutableSet.of(),
                  bqo.a.a,
                  bqo.b.b,
                  ImmutableList.of(Pair.of(brs.c(0.5F), 2), Pair.of(bsh.a(0.5F, 3), 3), Pair.of(btn.a(bnq::bc), 5))
               )
            )
         )
      );
   }

   public static void a(cbs $$0) {
      $$0.dO().a(ImmutableList.of(ciy.b));
   }
}
