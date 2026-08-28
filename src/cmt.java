import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cmt {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cfq<? extends cfp<? super cms>>> e = ImmutableList.of(cfq.c, cfq.f, cfq.d, cfq.z);
   static final List<cej<?>> f = ImmutableList.of(
      cej.n, cej.h, cej.B, cej.E, cej.o, cej.m, cej.aU, cej.aZ, cej.aV, cej.aW, cej.aX, cej.aY, new cej[]{cej.ba, cej.bb, cej.x, cej.y, cej.t}
   );
   private static final int g = 100;

   protected static bwh<?> a(cms $$0, bwh<cms> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cqm.a));
      $$1.b(cqm.k);
      $$1.f();
      return $$1;
   }

   private static void a(bwh<cms> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bzs(0.8F), new bye(45, 90)));
   }

   private static void b(bwh<cms> $$0) {
      $$0.a(
         cqm.b,
         ImmutableList.of(
            Pair.of(0, bzk.a(($$0x, $$1) -> $$1.ec().c(cej.B))),
            Pair.of(1, bzk.a(($$0x, $$1) -> $$1.gp())),
            Pair.of(2, new cmt.a(20, 40)),
            Pair.of(3, new byv(ImmutableList.of(Pair.of(new bxi(20, 100), 1), Pair.of(byq.a(0.6F), 2))))
         )
      );
   }

   private static void b(cms $$0, bwh<cms> $$1) {
      $$1.a(
         cqm.k,
         ImmutableList.of(
            Pair.of(0, bzn.a(cfp.a($$0, 100).negate()::test)), Pair.of(1, new cmw()), Pair.of(2, new cmv()), Pair.of(3, new cmx()), Pair.of(4, new cmy())
         ),
         ImmutableSet.of(Pair.of(cej.o, cek.a), Pair.of(cej.m, cek.b))
      );
   }

   static void a(cms $$0) {
      $$0.ec().a(ImmutableList.of(cqm.k, cqm.b));
   }

   public static class a extends byi {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arc $$0, bvh $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avz.cM);
         $$1.b(bvr.p);
      }

      @Override
      protected void b(arc $$0, bvh $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bvr.a);
         if ($$1.ec().a(cej.o)) {
            $$1.ec().a(cej.aV, bae.a, 60L);
         }
      }
   }
}
