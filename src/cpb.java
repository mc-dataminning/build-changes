import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cpb {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<chn<? extends chm<? super cpa>>> e = ImmutableList.of(chn.c, chn.f, chn.d, chn.z);
   static final List<cgg<?>> f = ImmutableList.of(
      cgg.o, cgg.h, cgg.C, cgg.F, cgg.p, cgg.n, cgg.aV, cgg.ba, cgg.aW, cgg.aX, cgg.aY, cgg.aZ, new cgg[]{cgg.bb, cgg.bc, cgg.y, cgg.z, cgg.u}
   );
   private static final int g = 100;

   protected static bye<?> a(cpa $$0, bye<cpa> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(csw.a));
      $$1.b(csw.k);
      $$1.f();
      return $$1;
   }

   private static void a(bye<cpa> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cbp(0.8F), new cab(45, 90)));
   }

   private static void b(bye<cpa> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, cbh.a(($$0x, $$1) -> $$1.ec().c(cgg.C))),
            Pair.of(1, cbh.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cpb.a(20, 40)),
            Pair.of(3, new cas(ImmutableList.of(Pair.of(new bzf(20, 100), 1), Pair.of(can.a(0.6F), 2))))
         )
      );
   }

   private static void b(cpa $$0, bye<cpa> $$1) {
      $$1.a(
         csw.k,
         ImmutableList.of(
            Pair.of(0, cbk.a(chm.a($$0, 100).negate()::test)), Pair.of(1, new cpe()), Pair.of(2, new cpd()), Pair.of(3, new cpf()), Pair.of(4, new cpg())
         ),
         ImmutableSet.of(Pair.of(cgg.p, cgh.a), Pair.of(cgg.n, cgh.b))
      );
   }

   static void a(cpa $$0) {
      $$0.ec().a(ImmutableList.of(csw.k, csw.b));
   }

   public static class a extends caf {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arq $$0, bxg $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awn.cM);
         $$1.b(bxq.p);
      }

      @Override
      protected void b(arq $$0, bxg $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bxq.a);
         if ($$1.ec().a(cgg.p)) {
            $$1.ec().a(cgg.aW, bau.a, 60L);
         }
      }
   }
}
