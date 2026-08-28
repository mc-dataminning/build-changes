import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cma {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cex<? extends cew<? super clz>>> e = ImmutableList.of(cex.c, cex.f, cex.d, cex.z);
   static final List<cdq<?>> f = ImmutableList.of(
      cdq.n, cdq.h, cdq.B, cdq.E, cdq.o, cdq.m, cdq.aU, cdq.aZ, cdq.aV, cdq.aW, cdq.aX, cdq.aY, new cdq[]{cdq.ba, cdq.bb, cdq.x, cdq.y, cdq.t}
   );
   private static final int g = 100;

   protected static bvo<?> a(clz $$0, bvo<clz> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cpp.a));
      $$1.b(cpp.k);
      $$1.f();
      return $$1;
   }

   private static void a(bvo<clz> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new byz(0.8F), new bxl(45, 90)));
   }

   private static void b(bvo<clz> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, byr.a($$0x -> $$0x.dY().c(cdq.B))),
            Pair.of(1, byr.a(clz::gp)),
            Pair.of(2, new cma.a(20, 40)),
            Pair.of(3, new byc(ImmutableList.of(Pair.of(new bwp(20, 100), 1), Pair.of(bxx.a(0.6F), 2))))
         )
      );
   }

   private static void b(clz $$0, bvo<clz> $$1) {
      $$1.a(
         cpp.k,
         ImmutableList.of(
            Pair.of(0, byu.a(cew.a($$0, 100).negate())), Pair.of(1, new cmd()), Pair.of(2, new cmc()), Pair.of(3, new cme()), Pair.of(4, new cmf())
         ),
         ImmutableSet.of(Pair.of(cdq.o, cdr.a), Pair.of(cdq.m, cdr.b))
      );
   }

   static void a(clz $$0) {
      $$0.dY().a(ImmutableList.of(cpp.k, cpp.b));
   }

   public static class a extends bxp {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arj $$0, bup $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awg.cM);
         $$1.b(buz.p);
      }

      @Override
      protected void b(arj $$0, bup $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(buz.a);
         if ($$1.dY().a(cdq.o)) {
            $$1.dY().a(cdq.aV, bak.a, 60L);
         }
      }
   }
}
