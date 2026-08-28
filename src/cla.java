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
   static final List<cdz<? extends cdy<? super ckz>>> e = ImmutableList.of(cdz.c, cdz.f, cdz.d, cdz.z);
   static final List<ccs<?>> f = ImmutableList.of(
      ccs.n, ccs.h, ccs.B, ccs.E, ccs.o, ccs.m, ccs.aU, ccs.aZ, ccs.aV, ccs.aW, ccs.aX, ccs.aY, new ccs[]{ccs.ba, ccs.bb, ccs.x, ccs.y, ccs.t}
   );

   protected static buq<?> a(ckz $$0, buq<ckz> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(com.a));
      $$1.b(com.k);
      $$1.f();
      return $$1;
   }

   private static void a(buq<ckz> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byb(0.8F), new bwn(45, 90)));
   }

   private static void b(buq<ckz> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxt.a($$0x -> $$0x.dT().c(ccs.B))),
            Pair.of(1, bxt.a(ckz::gl)),
            Pair.of(2, new cla.a(20, 40)),
            Pair.of(3, new bxe(ImmutableList.of(Pair.of(new bvr(20, 100), 1), Pair.of(bwz.a(0.6F), 2))))
         )
      );
   }

   private static void b(ckz $$0, buq<ckz> $$1) {
      $$1.a(
         com.k,
         ImmutableList.of(
            Pair.of(0, bxw.a($$1x -> !cdy.c($$0, $$1x))), Pair.of(1, new cld()), Pair.of(2, new clc()), Pair.of(3, new cle()), Pair.of(4, new clf())
         ),
         ImmutableSet.of(Pair.of(ccs.o, cct.a), Pair.of(ccs.m, cct.b))
      );
   }

   static void a(ckz $$0) {
      $$0.dT().a(ImmutableList.of(com.k, com.b));
   }

   public static class a extends bwr {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqu $$0, btp $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avp.cM);
         $$1.b(bua.p);
      }

      @Override
      protected void b(aqu $$0, btp $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bua.a);
         if ($$1.dT().a(ccs.o)) {
            $$1.dT().a(ccs.aV, azs.a, 60L);
         }
      }
   }
}
