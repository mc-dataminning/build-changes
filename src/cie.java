import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cie {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final brj f = brj.a(5, 16);
   private static final ImmutableList<cfg<? extends cff<? super cid>>> g = ImmutableList.of(cfg.c, cfg.f, cfg.t, cfg.o);
   private static final ImmutableList<cdz<?>> h = ImmutableList.of(
      cdz.Z, cdz.x, cdz.y, cdz.m, cdz.n, cdz.E, cdz.t, cdz.h, cdz.O, cdz.P, cdz.Q, cdz.R, new cdz[]{cdz.r, cdz.K}
   );

   protected static void a(cid $$0, azr $$1) {
   }

   public static bvx.b<cid> a() {
      return bvx.a(h, g);
   }

   protected static bvx<?> a(bvx<cid> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpz.a));
      $$0.b(cpz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvx<cid> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bzi(0.8F), new cie.a(4.0F), new bxu(45, 90), new bxy(), new bwu(cdz.P), new bwu(cdz.Q)));
   }

   private static void c(bvx<cid> $$0) {
      $$0.a(
         cpz.b,
         ImmutableList.of(
            Pair.of(0, byo.a(bug.by, 6.0F, brj.a(30, 60))),
            Pair.of(1, new bwi(bug.o)),
            Pair.of(
               2,
               new byl(
                  ImmutableList.of(Pair.of(new bxb($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(cab.a(Predicate.not(cid::t), bwl.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new byf(brj.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new byl(
                  ImmutableMap.of(cdz.m, cea.b),
                  ImmutableList.of(
                     Pair.of(cab.a(Predicate.not(cid::t), byg.a(2.0F)), 1),
                     Pair.of(cab.a(Predicate.not(cid::t), byv.a(2.0F, 3)), 1),
                     Pair.of(new cie.b(20), 1),
                     Pair.of(new bwy(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cid $$0) {
      $$0.ed().a(ImmutableList.of(cpz.b));
   }

   public static Predicate<cvx> b() {
      return $$0 -> $$0.a(axi.ai);
   }

   public static class a extends bwj<cid> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arm $$0, cid $$1, long $$2) {
         $$1.gK();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bwo<cid> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arm $$0, cid $$1) {
         return !$$1.bk() && $$1.gL() >= (long)this.c && !$$1.M_() && $$1.aJ() && !$$1.cZ() && $$1.gv();
      }

      protected void a(arm $$0, cid $$1, long $$2) {
         if ($$1.gy()) {
            $$1.gJ();
         } else if (!$$1.gs()) {
            $$1.gI();
         }
      }
   }
}
