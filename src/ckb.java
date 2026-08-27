import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class ckb {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<ccy<? extends ccx<? super cka>>> e = ImmutableList.of(ccy.c, ccy.f, ccy.d, ccy.z);
   static final List<cbr<?>> f = ImmutableList.of(
      cbr.n, cbr.h, cbr.B, cbr.E, cbr.o, cbr.m, cbr.aU, cbr.aZ, cbr.aV, cbr.aW, cbr.aX, cbr.aY, new cbr[]{cbr.ba, cbr.bb, cbr.x, cbr.y, cbr.t}
   );

   protected static btp<?> a(btp<cka> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnq.a));
      $$0.b(cnq.k);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cka> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bxa(0.8F), new bvm(45, 90)));
   }

   private static void c(btp<cka> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, bws.a($$0x -> $$0x.dZ().c(cbr.B))),
            Pair.of(1, bws.a(cka::gz)),
            Pair.of(2, new ckb.a(20, 40)),
            Pair.of(3, new bwd(ImmutableList.of(Pair.of(new buq(20, 100), 1), Pair.of(bvy.a(0.6F), 2))))
         )
      );
   }

   private static void d(btp<cka> $$0) {
      $$0.a(
         cnq.k,
         ImmutableList.of(Pair.of(0, bwv.a()), Pair.of(1, new cke()), Pair.of(2, new ckd()), Pair.of(3, new ckf()), Pair.of(4, new ckg())),
         ImmutableSet.of(Pair.of(cbr.o, cbs.a), Pair.of(cbr.m, cbs.b))
      );
   }

   static void a(cka $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.k, cnq.b));
   }

   public static class a extends bvq {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqt $$0, bsq $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avo.cR);
         $$1.b(bsz.p);
      }

      @Override
      protected void b(aqt $$0, bsq $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bsz.a);
         if ($$1.dZ().a(cbr.o)) {
            $$1.dZ().a(cbr.aV, azo.a, 60L);
         }
      }
   }
}
