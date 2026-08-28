import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ciw {
   public static final int a = 20;
   public static final int b = 7;
   private static final brs i = brs.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final brs o = brs.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final brs p = brs.a(600, 6000);
   private static final brs q = brs.a(100, 300);
   private static final cfv r = cfv.a().a($$0 -> !$$0.ar().equals(bup.X) && ($$0.dY().ac().b(dfb.c) || !$$0.ar().equals(bup.d)) && $$0.dY().C_().a($$0.cT()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(civ $$0, azv $$1) {
      $$0.ee().a(cei.S, o.a($$1));
      $$0.ee().a(cei.V, p.a($$1));
   }

   protected static bwg<?> a(bwg<civ> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqi.a));
      $$0.b(cqi.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwg<civ> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new bzr(0.8F), new bws(2.0F), new byd(45, 90), new byh(), new bxd(cei.P), new bxd(cei.S), new bxd(cei.V)));
   }

   private static void c(bwg<civ> $$0) {
      $$0.a(
         cqi.b,
         ImmutableList.of(
            Pair.of(0, byx.a(bup.by, 6.0F, brs.a(30, 60))),
            Pair.of(0, new bwr(bup.X)),
            Pair.of(1, new bxk($$0x -> 1.25F)),
            Pair.of(2, bwu.a(i, 1.25F)),
            Pair.of(3, new byu(ImmutableList.of(Pair.of(byp.a(1.0F), 2), Pair.of(bze.a(1.0F, 3), 2), Pair.of(new bxh(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cei.W, cej.b), Pair.of(cei.T, cej.b))
      );
   }

   private static void d(bwg<civ> $$0) {
      $$0.a(
         cqi.q,
         ImmutableList.of(Pair.of(0, new bxy(o, awo.lc)), Pair.of(1, new bya<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gH() ? awo.kY : awo.kP))),
         ImmutableSet.of(Pair.of(cei.O, cej.b), Pair.of(cei.r, cej.b), Pair.of(cei.m, cej.b), Pair.of(cei.S, cej.b))
      );
   }

   private static void e(bwg<civ> $$0) {
      $$0.a(
         cqi.r,
         ImmutableList.of(
            Pair.of(0, new byn($$0x -> $$0x.gH() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gH() ? awo.lb : awo.kS, $$0x -> awo.kT)),
            Pair.of(1, new bym<>($$0x -> $$0x.gH() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gH() ? awo.la : awo.kR))
         ),
         ImmutableSet.of(Pair.of(cei.O, cej.b), Pair.of(cei.r, cej.b), Pair.of(cei.V, cej.b))
      );
   }

   public static void a(civ $$0) {
      $$0.ee().a(ImmutableList.of(cqi.r, cqi.q, cqi.b));
   }

   public static Predicate<cwf> a() {
      return $$0 -> $$0.a(axm.af);
   }
}
