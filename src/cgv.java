import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgv {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bqd f = bqd.a(5, 16);
   private static final ImmutableList<cdy<? extends cdx<? super cgu>>> g = ImmutableList.of(cdy.c, cdy.f, cdy.t, cdy.o);
   private static final ImmutableList<ccr<?>> h = ImmutableList.of(
      ccr.Z, ccr.x, ccr.y, ccr.m, ccr.n, ccr.E, ccr.t, ccr.h, ccr.O, ccr.P, ccr.Q, ccr.R, new ccr[]{ccr.r, ccr.K}
   );

   protected static void a(cgu $$0, azf $$1) {
   }

   public static bup.b<cgu> a() {
      return bup.a(h, g);
   }

   protected static bup<?> a(bup<cgu> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(bup<cgu> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bya(0.8F), new cgv.a(4.0F), new bwm(45, 90), new bwq(), new bvm(ccr.P), new bvm(ccr.Q)));
   }

   private static void c(bup<cgu> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxg.a(bsy.by, 6.0F, bqd.a(30, 60))),
            Pair.of(1, new bva(bsy.o)),
            Pair.of(
               2,
               new bxd(
                  ImmutableList.of(Pair.of(new bvt($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(byt.a(Predicate.not(cgu::u), bvd.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwx(bqd.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxd(
                  ImmutableMap.of(ccr.m, ccs.b),
                  ImmutableList.of(
                     Pair.of(byt.a(Predicate.not(cgu::u), bwy.a(2.0F)), 1),
                     Pair.of(byt.a(Predicate.not(cgu::u), bxn.a(2.0F, 3)), 1),
                     Pair.of(new cgv.b(20), 1),
                     Pair.of(new bvq(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgu $$0) {
      $$0.dS().a(ImmutableList.of(cok.b));
   }

   public static Predicate<cun> b() {
      return $$0 -> $$0.a(awx.ah);
   }

   public static class a extends bvb<cgu> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(are $$0, cgu $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvg<cgu> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(are $$0, cgu $$1) {
         return !$$1.be() && $$1.gE() >= (long)this.c && !$$1.gd() && $$1.aE() && !$$1.cR() && $$1.gq();
      }

      protected void a(are $$0, cgu $$1, long $$2) {
         if ($$1.gy()) {
            $$1.gC();
         } else if (!$$1.gn()) {
            $$1.gB();
         }
      }
   }
}
