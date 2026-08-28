import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cla {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cea<? extends cdz<? super ckz>>> e = ImmutableList.of(cea.c, cea.f, cea.d, cea.z);
   static final List<cct<?>> f = ImmutableList.of(
      cct.n, cct.h, cct.B, cct.E, cct.o, cct.m, cct.aU, cct.aZ, cct.aV, cct.aW, cct.aX, cct.aY, new cct[]{cct.ba, cct.bb, cct.x, cct.y, cct.t}
   );

   protected static bur<?> a(bur<ckz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(com.a));
      $$0.b(com.k);
      $$0.f();
      return $$0;
   }

   private static void b(bur<ckz> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byc(0.8F), new bwo(45, 90)));
   }

   private static void c(bur<ckz> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxu.a($$0x -> $$0x.dS().c(cct.B))),
            Pair.of(1, bxu.a(ckz::gr)),
            Pair.of(2, new cla.a(20, 40)),
            Pair.of(3, new bxf(ImmutableList.of(Pair.of(new bvs(20, 100), 1), Pair.of(bxa.a(0.6F), 2))))
         )
      );
   }

   private static void d(bur<ckz> $$0) {
      $$0.a(
         com.k,
         ImmutableList.of(Pair.of(0, bxx.a()), Pair.of(1, new cld()), Pair.of(2, new clc()), Pair.of(3, new cle()), Pair.of(4, new clf())),
         ImmutableSet.of(Pair.of(cct.o, ccu.a), Pair.of(cct.m, ccu.b))
      );
   }

   static void a(ckz $$0) {
      $$0.dS().a(ImmutableList.of(com.k, com.b));
   }

   public static class a extends bws {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arf $$0, btr $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awa.cM);
         $$1.b(bub.p);
      }

      @Override
      protected void b(arf $$0, btr $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bub.a);
         if ($$1.dS().a(cct.o)) {
            $$1.dS().a(cct.aV, bac.a, 60L);
         }
      }
   }
}
