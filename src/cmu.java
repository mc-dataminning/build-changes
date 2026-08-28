import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cmu {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cfr<? extends cfq<? super cmt>>> e = ImmutableList.of(cfr.c, cfr.f, cfr.d, cfr.z);
   static final List<cek<?>> f = ImmutableList.of(
      cek.n, cek.h, cek.B, cek.E, cek.o, cek.m, cek.aU, cek.aZ, cek.aV, cek.aW, cek.aX, cek.aY, new cek[]{cek.ba, cek.bb, cek.x, cek.y, cek.t}
   );
   private static final int g = 100;

   protected static bwi<?> a(cmt $$0, bwi<cmt> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cqn.a));
      $$1.b(cqn.k);
      $$1.f();
      return $$1;
   }

   private static void a(bwi<cmt> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bzt(0.8F), new byf(45, 90)));
   }

   private static void b(bwi<cmt> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, bzl.a(($$0x, $$1) -> $$1.eb().c(cek.B))),
            Pair.of(1, bzl.a(($$0x, $$1) -> $$1.gs())),
            Pair.of(2, new cmu.a(20, 40)),
            Pair.of(3, new byw(ImmutableList.of(Pair.of(new bxj(20, 100), 1), Pair.of(byr.a(0.6F), 2))))
         )
      );
   }

   private static void b(cmt $$0, bwi<cmt> $$1) {
      $$1.a(
         cqn.k,
         ImmutableList.of(
            Pair.of(0, bzo.a(cfq.a($$0, 100).negate()::test)), Pair.of(1, new cmx()), Pair.of(2, new cmw()), Pair.of(3, new cmy()), Pair.of(4, new cmz())
         ),
         ImmutableSet.of(Pair.of(cek.o, cel.a), Pair.of(cek.m, cel.b))
      );
   }

   static void a(cmt $$0) {
      $$0.eb().a(ImmutableList.of(cqn.k, cqn.b));
   }

   public static class a extends byj {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(ard $$0, bvi $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awa.cM);
         $$1.b(bvs.p);
      }

      @Override
      protected void b(ard $$0, bvi $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bvs.a);
         if ($$1.eb().a(cek.o)) {
            $$1.eb().a(cek.aV, baf.a, 60L);
         }
      }
   }
}
