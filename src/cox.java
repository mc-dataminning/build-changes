import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cox {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<chl<? extends chk<? super cow>>> e = ImmutableList.of(chl.c, chl.f, chl.d, chl.z);
   static final List<cge<?>> f = ImmutableList.of(
      cge.o, cge.h, cge.C, cge.F, cge.p, cge.n, cge.aV, cge.ba, cge.aW, cge.aX, cge.aY, cge.aZ, new cge[]{cge.bb, cge.bc, cge.y, cge.z, cge.u}
   );
   private static final int g = 100;

   protected static byc<?> a(cow $$0, byc<cow> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(csr.a));
      $$1.b(csr.k);
      $$1.f();
      return $$1;
   }

   private static void a(byc<cow> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new cbn(0.8F), new bzz(45, 90)));
   }

   private static void b(byc<cow> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, cbf.a(($$0x, $$1) -> $$1.eb().c(cge.C))),
            Pair.of(1, cbf.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cox.a(20, 40)),
            Pair.of(3, new caq(ImmutableList.of(Pair.of(new bzd(20, 100), 1), Pair.of(cal.a(0.6F), 2))))
         )
      );
   }

   private static void b(cow $$0, byc<cow> $$1) {
      $$1.a(
         csr.k,
         ImmutableList.of(
            Pair.of(0, cbi.a(chk.a($$0, 100).negate()::test)), Pair.of(1, new cpa()), Pair.of(2, new coz()), Pair.of(3, new cpb()), Pair.of(4, new cpc())
         ),
         ImmutableSet.of(Pair.of(cge.p, cgf.a), Pair.of(cge.n, cgf.b))
      );
   }

   static void a(cow $$0) {
      $$0.eb().a(ImmutableList.of(csr.k, csr.b));
   }

   public static class a extends cad {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arq $$0, bxe $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awn.cM);
         $$1.b(bxo.p);
      }

      @Override
      protected void b(arq $$0, bxe $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bxo.a);
         if ($$1.eb().a(cge.p)) {
            $$1.eb().a(cge.aW, bau.a, 60L);
         }
      }
   }
}
