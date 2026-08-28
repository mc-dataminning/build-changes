import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ckx {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static byc<?> a(byc<ckw> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byc<ckw> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new byo(2.0F), new bzz(45, 90), new cad(), new byz(cge.Q)));
   }

   private static void c(byc<ckw> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, cat.a(bwm.bS, 6.0F, btm.a(30, 60))),
            Pair.of(1, new bzg($$0x -> 1.25F)),
            Pair.of(
               2,
               new bzh(
                  ImmutableMap.of(cge.n, cgf.b),
                  ImmutableSet.of(),
                  bzh.a.a,
                  bzh.b.b,
                  ImmutableList.of(Pair.of(cal.c(0.5F), 2), Pair.of(cba.a(0.5F, 3), 3), Pair.of(ccg.a(bwd::bj), 5))
               )
            )
         )
      );
   }

   public static void a(ckw $$0) {
      $$0.eb().a(ImmutableList.of(csr.b));
   }
}
