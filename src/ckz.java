import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class ckz {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cdz<? extends cdy<? super cky>>> e = ImmutableList.of(cdz.c, cdz.f, cdz.d, cdz.z);
   static final List<ccs<?>> f = ImmutableList.of(
      ccs.n, ccs.h, ccs.B, ccs.E, ccs.o, ccs.m, ccs.aU, ccs.aZ, ccs.aV, ccs.aW, ccs.aX, ccs.aY, new ccs[]{ccs.ba, ccs.bb, ccs.x, ccs.y, ccs.t}
   );

   protected static buq<?> a(buq<cky> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(col.a));
      $$0.b(col.k);
      $$0.f();
      return $$0;
   }

   private static void b(buq<cky> $$0) {
      $$0.a(col.a, 0, ImmutableList.of(new byb(0.8F), new bwn(45, 90)));
   }

   private static void c(buq<cky> $$0) {
      $$0.a(
         col.b,
         ImmutableList.of(
            Pair.of(0, bxt.a($$0x -> $$0x.dS().c(ccs.B))),
            Pair.of(1, bxt.a(cky::gr)),
            Pair.of(2, new ckz.a(20, 40)),
            Pair.of(3, new bxe(ImmutableList.of(Pair.of(new bvr(20, 100), 1), Pair.of(bwz.a(0.6F), 2))))
         )
      );
   }

   private static void d(buq<cky> $$0) {
      $$0.a(
         col.k,
         ImmutableList.of(Pair.of(0, bxw.a()), Pair.of(1, new clc()), Pair.of(2, new clb()), Pair.of(3, new cld()), Pair.of(4, new cle())),
         ImmutableSet.of(Pair.of(ccs.o, cct.a), Pair.of(ccs.m, cct.b))
      );
   }

   static void a(cky $$0) {
      $$0.dS().a(ImmutableList.of(col.k, col.b));
   }

   public static class a extends bwr {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(are $$0, btq $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avz.cM);
         $$1.b(bua.p);
      }

      @Override
      protected void b(are $$0, btq $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bua.a);
         if ($$1.dS().a(ccs.o)) {
            $$1.dS().a(ccs.aV, bab.a, 60L);
         }
      }
   }
}
