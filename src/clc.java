import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class clc {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cec<? extends ceb<? super clb>>> e = ImmutableList.of(cec.c, cec.f, cec.d, cec.z);
   static final List<ccv<?>> f = ImmutableList.of(
      ccv.n, ccv.h, ccv.B, ccv.E, ccv.o, ccv.m, ccv.aU, ccv.aZ, ccv.aV, ccv.aW, ccv.aX, ccv.aY, new ccv[]{ccv.ba, ccv.bb, ccv.x, ccv.y, ccv.t}
   );

   protected static but<?> a(but<clb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cop.a));
      $$0.b(cop.k);
      $$0.f();
      return $$0;
   }

   private static void b(but<clb> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bye(0.8F), new bwq(45, 90)));
   }

   private static void c(but<clb> $$0) {
      $$0.a(
         cop.b,
         ImmutableList.of(
            Pair.of(0, bxw.a($$0x -> $$0x.dS().c(ccv.B))),
            Pair.of(1, bxw.a(clb::gr)),
            Pair.of(2, new clc.a(20, 40)),
            Pair.of(3, new bxh(ImmutableList.of(Pair.of(new bvu(20, 100), 1), Pair.of(bxc.a(0.6F), 2))))
         )
      );
   }

   private static void d(but<clb> $$0) {
      $$0.a(
         cop.k,
         ImmutableList.of(Pair.of(0, bxz.a()), Pair.of(1, new clf()), Pair.of(2, new cle()), Pair.of(3, new clg()), Pair.of(4, new clh())),
         ImmutableSet.of(Pair.of(ccv.o, ccw.a), Pair.of(ccv.m, ccw.b))
      );
   }

   static void a(clb $$0) {
      $$0.dS().a(ImmutableList.of(cop.k, cop.b));
   }

   public static class a extends bwu {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arf $$0, btt $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awa.cM);
         $$1.b(bud.p);
      }

      @Override
      protected void b(arf $$0, btt $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bud.a);
         if ($$1.dS().a(ccv.o)) {
            $$1.dS().a(ccv.aV, bac.a, 60L);
         }
      }
   }
}
