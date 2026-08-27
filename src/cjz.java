import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cjz {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<ccz<? extends ccy<? super cjy>>> e = ImmutableList.of(ccz.c, ccz.f, ccz.d, ccz.z);
   static final List<cbs<?>> f = ImmutableList.of(
      cbs.n, cbs.h, cbs.B, cbs.E, cbs.o, cbs.m, cbs.aU, cbs.aZ, cbs.aV, cbs.aW, cbs.aX, cbs.aY, new cbs[]{cbs.ba, cbs.bb, cbs.x, cbs.y, cbs.t}
   );

   protected static btq<?> a(btq<cjy> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnl.a));
      $$0.b(cnl.k);
      $$0.f();
      return $$0;
   }

   private static void b(btq<cjy> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bxb(0.8F), new bvn(45, 90)));
   }

   private static void c(btq<cjy> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, bwt.a($$0x -> $$0x.dS().c(cbs.B))),
            Pair.of(1, bwt.a(cjy::gq)),
            Pair.of(2, new cjz.a(20, 40)),
            Pair.of(3, new bwe(ImmutableList.of(Pair.of(new bur(20, 100), 1), Pair.of(bvz.a(0.6F), 2))))
         )
      );
   }

   private static void d(btq<cjy> $$0) {
      $$0.a(
         cnl.k,
         ImmutableList.of(Pair.of(0, bww.a()), Pair.of(1, new ckc()), Pair.of(2, new ckb()), Pair.of(3, new ckd()), Pair.of(4, new cke())),
         ImmutableSet.of(Pair.of(cbs.o, cbt.a), Pair.of(cbs.m, cbt.b))
      );
   }

   static void a(cjy $$0) {
      $$0.dS().a(ImmutableList.of(cnl.k, cnl.b));
   }

   public static class a extends bvr {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqm $$0, bsq $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avh.cM);
         $$1.b(bta.p);
      }

      @Override
      protected void b(aqm $$0, bsq $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bta.a);
         if ($$1.dS().a(cbs.o)) {
            $$1.dS().a(cbs.aV, azf.a, 60L);
         }
      }
   }
}
