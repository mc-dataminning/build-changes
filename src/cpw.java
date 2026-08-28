import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cpw {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cid<? extends cic<? super cpv>>> e = ImmutableList.of(cid.c, cid.f, cid.d, cid.z);
   static final List<cgw<?>> f = ImmutableList.of(
      cgw.o, cgw.h, cgw.C, cgw.F, cgw.p, cgw.n, cgw.aV, cgw.ba, cgw.aW, cgw.aX, cgw.aY, cgw.aZ, new cgw[]{cgw.bb, cgw.bc, cgw.y, cgw.z, cgw.u}
   );
   private static final int g = 100;

   protected static byu<?> a(cpv $$0, byu<cpv> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(ctr.a));
      $$1.b(ctr.k);
      $$1.f();
      return $$1;
   }

   private static void a(byu<cpv> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new ccf(0.8F), new car(45, 90)));
   }

   private static void b(byu<cpv> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, cbx.a(($$0x, $$1) -> $$1.ec().c(cgw.C))),
            Pair.of(1, cbx.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cpw.a(20, 40)),
            Pair.of(3, new cbi(ImmutableList.of(Pair.of(new bzv(20, 100), 1), Pair.of(cbd.a(0.6F), 2))))
         )
      );
   }

   private static void b(cpv $$0, byu<cpv> $$1) {
      $$1.a(
         ctr.k,
         ImmutableList.of(
            Pair.of(0, cca.a(cic.a($$0, 100).negate()::test)), Pair.of(1, new cpz()), Pair.of(2, new cpy()), Pair.of(3, new cqa()), Pair.of(4, new cqb())
         ),
         ImmutableSet.of(Pair.of(cgw.p, cgx.a), Pair.of(cgw.n, cgx.b))
      );
   }

   static void a(cpv $$0) {
      $$0.ec().a(ImmutableList.of(ctr.k, ctr.b));
   }

   public static class a extends cav {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(ars $$0, bxw $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awp.cM);
         $$1.b(byg.p);
      }

      @Override
      protected void b(ars $$0, bxw $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(byg.a);
         if ($$1.ec().a(cgw.p)) {
            $$1.ec().a(cgw.aW, baw.a, 60L);
         }
      }
   }
}
