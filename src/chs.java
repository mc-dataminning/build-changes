import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chs {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bra f = bra.a(5, 16);
   private static final ImmutableList<ceu<? extends cet<? super chr>>> g = ImmutableList.of(ceu.c, ceu.f, ceu.t, ceu.o);
   private static final ImmutableList<cdn<?>> h = ImmutableList.of(
      cdn.Z, cdn.x, cdn.y, cdn.m, cdn.n, cdn.E, cdn.t, cdn.h, cdn.O, cdn.P, cdn.Q, cdn.R, new cdn[]{cdn.r, cdn.K}
   );

   protected static void a(chr $$0, azl $$1) {
   }

   public static bvl.b<chr> a() {
      return bvl.a(h, g);
   }

   protected static bvl<?> a(bvl<chr> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvl<chr> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new byw(0.8F), new chs.a(4.0F), new bxi(45, 90), new bxm(), new bwi(cdn.P), new bwi(cdn.Q)));
   }

   private static void c(bvl<chr> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, byc.a(btv.by, 6.0F, bra.a(30, 60))),
            Pair.of(1, new bvw(btv.o)),
            Pair.of(
               2,
               new bxz(
                  ImmutableList.of(Pair.of(new bwp($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(bzp.a(Predicate.not(chr::t), bvz.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bxt(bra.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxz(
                  ImmutableMap.of(cdn.m, cdo.b),
                  ImmutableList.of(
                     Pair.of(bzp.a(Predicate.not(chr::t), bxu.a(2.0F)), 1),
                     Pair.of(bzp.a(Predicate.not(chr::t), byj.a(2.0F, 3)), 1),
                     Pair.of(new chs.b(20), 1),
                     Pair.of(new bwm(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(chr $$0) {
      $$0.dX().a(ImmutableList.of(cpm.b));
   }

   public static Predicate<cvp> b() {
      return $$0 -> $$0.a(axc.ah);
   }

   public static class a extends bvx<chr> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arh $$0, chr $$1, long $$2) {
         $$1.gE();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bwc<chr> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arh $$0, chr $$1) {
         return !$$1.bi() && $$1.gF() >= (long)this.c && !$$1.K_() && $$1.aH() && !$$1.cV() && $$1.gp();
      }

      protected void a(arh $$0, chr $$1, long $$2) {
         if ($$1.gs()) {
            $$1.gD();
         } else if (!$$1.gm()) {
            $$1.gC();
         }
      }
   }
}
