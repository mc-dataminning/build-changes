import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cog {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cha<? extends cgz<? super cof>>> e = ImmutableList.of(cha.c, cha.f, cha.d, cha.z);
   static final List<cft<?>> f = ImmutableList.of(
      cft.o, cft.h, cft.C, cft.F, cft.p, cft.n, cft.aV, cft.ba, cft.aW, cft.aX, cft.aY, cft.aZ, new cft[]{cft.bb, cft.bc, cft.y, cft.z, cft.u}
   );
   private static final int g = 100;

   protected static bxr<?> a(cof $$0, bxr<cof> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(crz.a));
      $$1.b(crz.k);
      $$1.f();
      return $$1;
   }

   private static void a(bxr<cof> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new cbc(0.8F), new bzo(45, 90)));
   }

   private static void b(bxr<cof> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, cau.a(($$0x, $$1) -> $$1.eb().c(cft.C))),
            Pair.of(1, cau.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cog.a(20, 40)),
            Pair.of(3, new caf(ImmutableList.of(Pair.of(new bys(20, 100), 1), Pair.of(caa.a(0.6F), 2))))
         )
      );
   }

   private static void b(cof $$0, bxr<cof> $$1) {
      $$1.a(
         crz.k,
         ImmutableList.of(
            Pair.of(0, cax.a(cgz.a($$0, 100).negate()::test)), Pair.of(1, new coj()), Pair.of(2, new coi()), Pair.of(3, new cok()), Pair.of(4, new col())
         ),
         ImmutableSet.of(Pair.of(cft.p, cfu.a), Pair.of(cft.n, cfu.b))
      );
   }

   static void a(cof $$0) {
      $$0.eb().a(ImmutableList.of(crz.k, crz.b));
   }

   public static class a extends bzs {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arn $$0, bwt $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awk.cM);
         $$1.b(bxd.p);
      }

      @Override
      protected void b(arn $$0, bwt $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bxd.a);
         if ($$1.eb().a(cft.p)) {
            $$1.eb().a(cft.aW, baq.a, 60L);
         }
      }
   }
}
