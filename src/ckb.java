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
   static final List<cdb<? extends cda<? super cka>>> e = ImmutableList.of(cdb.c, cdb.f, cdb.d, cdb.z);
   static final List<cbu<?>> f = ImmutableList.of(
      cbu.n, cbu.h, cbu.B, cbu.E, cbu.o, cbu.m, cbu.aU, cbu.aZ, cbu.aV, cbu.aW, cbu.aX, cbu.aY, new cbu[]{cbu.ba, cbu.bb, cbu.x, cbu.y, cbu.t}
   );

   protected static bts<?> a(bts<cka> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnn.a));
      $$0.b(cnn.k);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cka> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bxd(0.8F), new bvp(45, 90)));
   }

   private static void c(bts<cka> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, bwv.a($$0x -> $$0x.dS().c(cbu.B))),
            Pair.of(1, bwv.a(cka::gq)),
            Pair.of(2, new ckb.a(20, 40)),
            Pair.of(3, new bwg(ImmutableList.of(Pair.of(new but(20, 100), 1), Pair.of(bwb.a(0.6F), 2))))
         )
      );
   }

   private static void d(bts<cka> $$0) {
      $$0.a(
         cnn.k,
         ImmutableList.of(Pair.of(0, bwy.a()), Pair.of(1, new cke()), Pair.of(2, new ckd()), Pair.of(3, new ckf()), Pair.of(4, new ckg())),
         ImmutableSet.of(Pair.of(cbu.o, cbv.a), Pair.of(cbu.m, cbv.b))
      );
   }

   static void a(cka $$0) {
      $$0.dS().a(ImmutableList.of(cnn.k, cnn.b));
   }

   public static class a extends bvt {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqn $$0, bss $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avi.cM);
         $$1.b(btc.p);
      }

      @Override
      protected void b(aqn $$0, bss $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(btc.a);
         if ($$1.dS().a(cbu.o)) {
            $$1.dS().a(cbu.aV, azh.a, 60L);
         }
      }
   }
}
