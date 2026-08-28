import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cko {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cdn<? extends cdm<? super ckn>>> e = ImmutableList.of(cdn.c, cdn.f, cdn.d, cdn.z);
   static final List<ccg<?>> f = ImmutableList.of(
      ccg.n, ccg.h, ccg.B, ccg.E, ccg.o, ccg.m, ccg.aU, ccg.aZ, ccg.aV, ccg.aW, ccg.aX, ccg.aY, new ccg[]{ccg.ba, ccg.bb, ccg.x, ccg.y, ccg.t}
   );

   protected static bue<?> a(bue<ckn> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(coa.a));
      $$0.b(coa.k);
      $$0.f();
      return $$0;
   }

   private static void b(bue<ckn> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bxp(0.8F), new bwb(45, 90)));
   }

   private static void c(bue<ckn> $$0) {
      $$0.a(
         coa.b,
         ImmutableList.of(
            Pair.of(0, bxh.a($$0x -> $$0x.dV().c(ccg.B))),
            Pair.of(1, bxh.a(ckn::go)),
            Pair.of(2, new cko.a(20, 40)),
            Pair.of(3, new bws(ImmutableList.of(Pair.of(new bvf(20, 100), 1), Pair.of(bwn.a(0.6F), 2))))
         )
      );
   }

   private static void d(bue<ckn> $$0) {
      $$0.a(
         coa.k,
         ImmutableList.of(Pair.of(0, bxk.a()), Pair.of(1, new ckr()), Pair.of(2, new ckq()), Pair.of(3, new cks()), Pair.of(4, new ckt())),
         ImmutableSet.of(Pair.of(ccg.o, cch.a), Pair.of(ccg.m, cch.b))
      );
   }

   static void a(ckn $$0) {
      $$0.dV().a(ImmutableList.of(coa.k, coa.b));
   }

   public static class a extends bwf {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqm $$0, bte $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avh.cM);
         $$1.b(bto.p);
      }

      @Override
      protected void b(aqm $$0, bte $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bto.a);
         if ($$1.dV().a(ccg.o)) {
            $$1.dV().a(ccg.aV, azk.a, 60L);
         }
      }
   }
}
