import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cib {
   public static final int a = 20;
   public static final int b = 7;
   private static final bra i = bra.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bra o = bra.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bra p = bra.a(600, 6000);
   private static final bra q = bra.a(100, 300);
   private static final cfa r = cfa.a().a($$0 -> !$$0.ao().equals(btv.X) && ($$0.dS().ac().b(dec.c) || !$$0.ao().equals(btv.d)) && $$0.dS().A_().a($$0.cO()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cia $$0, azl $$1) {
      $$0.dX().a(cdn.S, o.a($$1));
      $$0.dX().a(cdn.V, p.a($$1));
   }

   protected static bvl<?> a(bvl<cia> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvl<cia> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new byw(0.8F), new bvx(2.0F), new bxi(45, 90), new bxm(), new bwi(cdn.P), new bwi(cdn.S), new bwi(cdn.V)));
   }

   private static void c(bvl<cia> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, byc.a(btv.by, 6.0F, bra.a(30, 60))),
            Pair.of(0, new bvw(btv.X)),
            Pair.of(1, new bwp($$0x -> 1.25F)),
            Pair.of(2, bvz.a(i, 1.25F)),
            Pair.of(3, new bxz(ImmutableList.of(Pair.of(bxu.a(1.0F), 2), Pair.of(byj.a(1.0F, 3), 2), Pair.of(new bwm(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cdn.W, cdo.b), Pair.of(cdn.T, cdo.b))
      );
   }

   private static void d(bvl<cia> $$0) {
      $$0.a(
         cpm.q,
         ImmutableList.of(Pair.of(0, new bxd(o, awe.le)), Pair.of(1, new bxf<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gB() ? awe.kZ : awe.kP))),
         ImmutableSet.of(Pair.of(cdn.O, cdo.b), Pair.of(cdn.r, cdo.b), Pair.of(cdn.m, cdo.b), Pair.of(cdn.S, cdo.b))
      );
   }

   private static void e(bvl<cia> $$0) {
      $$0.a(
         cpm.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bxs(
                  $$0x -> $$0x.gB() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gB() ? awe.lc : awe.kS, $$0x -> $$0x.gB() ? awe.ld : awe.kT
               )
            ),
            Pair.of(1, new bxr<>($$0x -> $$0x.gB() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gB() ? awe.lb : awe.kR))
         ),
         ImmutableSet.of(Pair.of(cdn.O, cdo.b), Pair.of(cdn.r, cdo.b), Pair.of(cdn.V, cdo.b))
      );
   }

   public static void a(cia $$0) {
      $$0.dX().a(ImmutableList.of(cpm.r, cpm.q, cpm.b));
   }

   public static Predicate<cvp> a() {
      return $$0 -> $$0.a(axc.ab);
   }
}
