import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cln {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static byu<?> a(byu<clm> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byu<clm> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new bzg(2.0F), new car(45, 90), new cav(), new bzr(cgw.Q)));
   }

   private static void c(byu<clm> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, cbl.a(bxc.bT, 6.0F, buc.a(30, 60))),
            Pair.of(1, new bzy($$0x -> 1.25F)),
            Pair.of(
               2,
               new bzz(
                  ImmutableMap.of(cgw.n, cgx.b),
                  ImmutableSet.of(),
                  bzz.a.a,
                  bzz.b.b,
                  ImmutableList.of(Pair.of(cbd.c(0.5F), 2), Pair.of(cbs.a(0.5F, 3), 3), Pair.of(ccy.a(bwt::bi), 5))
               )
            )
         )
      );
   }

   public static void a(clm $$0) {
      $$0.ec().a(ImmutableList.of(ctr.b));
   }
}
