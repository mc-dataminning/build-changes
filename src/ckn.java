import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class ckn {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cdm<? extends cdl<? super ckm>>> e = ImmutableList.of(cdm.c, cdm.f, cdm.d, cdm.z);
   static final List<ccf<?>> f = ImmutableList.of(
      ccf.n, ccf.h, ccf.B, ccf.E, ccf.o, ccf.m, ccf.aU, ccf.aZ, ccf.aV, ccf.aW, ccf.aX, ccf.aY, new ccf[]{ccf.ba, ccf.bb, ccf.x, ccf.y, ccf.t}
   );

   protected static bud<?> a(bud<ckm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnz.a));
      $$0.b(cnz.k);
      $$0.f();
      return $$0;
   }

   private static void b(bud<ckm> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bxo(0.8F), new bwa(45, 90)));
   }

   private static void c(bud<ckm> $$0) {
      $$0.a(
         cnz.b,
         ImmutableList.of(
            Pair.of(0, bxg.a($$0x -> $$0x.dU().c(ccf.B))),
            Pair.of(1, bxg.a(ckm::gp)),
            Pair.of(2, new ckn.a(20, 40)),
            Pair.of(3, new bwr(ImmutableList.of(Pair.of(new bve(20, 100), 1), Pair.of(bwm.a(0.6F), 2))))
         )
      );
   }

   private static void d(bud<ckm> $$0) {
      $$0.a(
         cnz.k,
         ImmutableList.of(Pair.of(0, bxj.a()), Pair.of(1, new ckq()), Pair.of(2, new ckp()), Pair.of(3, new ckr()), Pair.of(4, new cks())),
         ImmutableSet.of(Pair.of(ccf.o, ccg.a), Pair.of(ccf.m, ccg.b))
      );
   }

   static void a(ckm $$0) {
      $$0.dU().a(ImmutableList.of(cnz.k, cnz.b));
   }

   public static class a extends bwe {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqm $$0, btd $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avh.cM);
         $$1.b(btn.p);
      }

      @Override
      protected void b(aqm $$0, btd $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(btn.a);
         if ($$1.dU().a(ccf.o)) {
            $$1.dU().a(ccf.aV, azk.a, 60L);
         }
      }
   }
}
