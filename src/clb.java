import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class clb {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<ceb<? extends cea<? super cla>>> e = ImmutableList.of(ceb.c, ceb.f, ceb.d, ceb.z);
   static final List<ccu<?>> f = ImmutableList.of(
      ccu.n, ccu.h, ccu.B, ccu.E, ccu.o, ccu.m, ccu.aU, ccu.aZ, ccu.aV, ccu.aW, ccu.aX, ccu.aY, new ccu[]{ccu.ba, ccu.bb, ccu.x, ccu.y, ccu.t}
   );

   protected static bus<?> a(bus<cla> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(coo.a));
      $$0.b(coo.k);
      $$0.f();
      return $$0;
   }

   private static void b(bus<cla> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new byd(0.8F), new bwp(45, 90)));
   }

   private static void c(bus<cla> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, bxv.a($$0x -> $$0x.dS().c(ccu.B))),
            Pair.of(1, bxv.a(cla::gr)),
            Pair.of(2, new clb.a(20, 40)),
            Pair.of(3, new bxg(ImmutableList.of(Pair.of(new bvt(20, 100), 1), Pair.of(bxb.a(0.6F), 2))))
         )
      );
   }

   private static void d(bus<cla> $$0) {
      $$0.a(
         coo.k,
         ImmutableList.of(Pair.of(0, bxy.a()), Pair.of(1, new cle()), Pair.of(2, new cld()), Pair.of(3, new clf()), Pair.of(4, new clg())),
         ImmutableSet.of(Pair.of(ccu.o, ccv.a), Pair.of(ccu.m, ccv.b))
      );
   }

   static void a(cla $$0) {
      $$0.dS().a(ImmutableList.of(coo.k, coo.b));
   }

   public static class a extends bwt {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arf $$0, bts $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awa.cM);
         $$1.b(buc.p);
      }

      @Override
      protected void b(arf $$0, bts $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(buc.a);
         if ($$1.dS().a(ccu.o)) {
            $$1.dS().a(ccu.aV, bac.a, 60L);
         }
      }
   }
}
