import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjk {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bsp f = bsp.a(5, 16);
   private static final ImmutableList<cgm<? extends cgl<? super cjj>>> g = ImmutableList.of(cgm.c, cgm.f, cgm.t, cgm.o);
   private static final ImmutableList<cff<?>> h = ImmutableList.of(
      cff.Z, cff.x, cff.y, cff.m, cff.n, cff.E, cff.t, cff.h, cff.O, cff.P, cff.Q, cff.R, new cff[]{cff.r, cff.K}
   );

   protected static void a(cjj $$0, bam $$1) {
   }

   public static bxd.b<cjj> a() {
      return bxd.a(h, g);
   }

   protected static bxd<?> a(bxd<cjj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxd<cjj> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new cao(0.8F), new cjk.a(4.0F), new bza(45, 90), new bze(), new bya(cff.P), new bya(cff.Q)));
   }

   private static void c(bxd<cjj> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, bzu.a(bvm.bS, 6.0F, bsp.a(30, 60))),
            Pair.of(1, new bxo(bvm.t)),
            Pair.of(
               2,
               new bzr(
                  ImmutableList.of(Pair.of(new byh($$0x -> 2.5F, $$0x -> $$0x.e_() ? 2.5 : 3.5), 1), Pair.of(cbh.a(Predicate.not(cjj::t), bxr.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bzl(bsp.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bzr(
                  ImmutableMap.of(cff.m, cfg.b),
                  ImmutableList.of(
                     Pair.of(cbh.a(Predicate.not(cjj::t), bzm.a(2.0F)), 1),
                     Pair.of(cbh.a(Predicate.not(cjj::t), cab.a(2.0F, 3)), 1),
                     Pair.of(new cjk.b(20), 1),
                     Pair.of(new bye(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cjj $$0) {
      $$0.eb().a(ImmutableList.of(crj.b));
   }

   public static Predicate<cxk> b() {
      return $$0 -> $$0.a(ayd.am);
   }

   public static class a extends bxp<cjj> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(ash $$0, cjj $$1, long $$2) {
         $$1.gB();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bxu<cjj> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ash $$0, cjj $$1) {
         return !$$1.bj() && $$1.gC() >= (long)this.c && !$$1.P_() && $$1.aJ() && !$$1.cY() && $$1.gm();
      }

      protected void a(ash $$0, cjj $$1, long $$2) {
         if ($$1.gp()) {
            $$1.gA();
         } else if (!$$1.gj()) {
            $$1.gz();
         }
      }
   }
}
