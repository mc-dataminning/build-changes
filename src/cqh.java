import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cqh {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cio<? extends cin<? super cqg>>> e = ImmutableList.of(cio.c, cio.f, cio.d, cio.z);
   static final List<chh<?>> f = ImmutableList.of(
      chh.o, chh.h, chh.C, chh.F, chh.p, chh.n, chh.aV, chh.ba, chh.aW, chh.aX, chh.aY, chh.aZ, new chh[]{chh.bb, chh.bc, chh.y, chh.z, chh.u}
   );
   private static final int g = 100;

   protected static bzf<?> a(cqg $$0, bzf<cqg> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cuc.a));
      $$1.b(cuc.k);
      $$1.f();
      return $$1;
   }

   private static void a(bzf<cqg> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new ccq(0.8F), new cbc(45, 90)));
   }

   private static void b(bzf<cqg> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, cci.a(($$0x, $$1) -> $$1.ec().c(chh.C))),
            Pair.of(1, cci.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cqh.a(20, 40)),
            Pair.of(3, new cbt(ImmutableList.of(Pair.of(new cag(20, 100), 1), Pair.of(cbo.a(0.6F), 2))))
         )
      );
   }

   private static void b(cqg $$0, bzf<cqg> $$1) {
      $$1.a(
         cuc.k,
         ImmutableList.of(
            Pair.of(0, ccl.a(cin.a($$0, 100).negate()::test)), Pair.of(1, new cqk()), Pair.of(2, new cqj()), Pair.of(3, new cql()), Pair.of(4, new cqm())
         ),
         ImmutableSet.of(Pair.of(chh.p, chi.a), Pair.of(chh.n, chi.b))
      );
   }

   static void a(cqg $$0) {
      $$0.ec().a(ImmutableList.of(cuc.k, cuc.b));
   }

   public static class a extends cbg {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(asb $$0, byh $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awy.cM);
         $$1.b(byr.p);
      }

      @Override
      protected void b(asb $$0, byh $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(byr.a);
         if ($$1.ec().a(chh.p)) {
            $$1.ec().a(chh.aW, bbh.a, 60L);
         }
      }
   }
}
