import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjt {
   public static final int a = 20;
   public static final int b = 7;
   private static final bsp i = bsp.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bsp o = bsp.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bsp p = bsp.a(600, 6000);
   private static final bsp q = bsp.a(100, 300);
   private static final cgs r = cgs.a().a(($$0, $$1) -> !$$0.aq().equals(bvm.ai) && (!$$1.N().b(dgw.c) || !$$0.aq().equals(bvm.f)) && $$1.F_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cjs $$0, bam $$1) {
      $$0.eb().a(cff.S, o.a($$1));
      $$0.eb().a(cff.V, p.a($$1));
   }

   protected static bxd<?> a(bxd<cjs> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxd<cjs> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new cao(0.8F), new bxp(2.0F), new bza(45, 90), new bze(), new bya(cff.P), new bya(cff.S), new bya(cff.V)));
   }

   private static void c(bxd<cjs> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, bzu.a(bvm.bS, 6.0F, bsp.a(30, 60))),
            Pair.of(0, new bxo(bvm.ai)),
            Pair.of(1, new byh($$0x -> 1.25F)),
            Pair.of(2, bxr.a(i, 1.25F)),
            Pair.of(3, new bzr(ImmutableList.of(Pair.of(bzm.a(1.0F), 2), Pair.of(cab.a(1.0F, 3), 2), Pair.of(new bye(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cff.W, cfg.b), Pair.of(cff.T, cfg.b))
      );
   }

   private static void d(bxd<cjs> $$0) {
      $$0.a(
         crj.q,
         ImmutableList.of(Pair.of(0, new byv(o, axf.lu)), Pair.of(1, new byx<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gy() ? axf.lq : axf.lh))),
         ImmutableSet.of(Pair.of(cff.O, cfg.b), Pair.of(cff.r, cfg.b), Pair.of(cff.m, cfg.b), Pair.of(cff.S, cfg.b))
      );
   }

   private static void e(bxd<cjs> $$0) {
      $$0.a(
         crj.r,
         ImmutableList.of(
            Pair.of(0, new bzk($$0x -> $$0x.gy() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gy() ? axf.lt : axf.lk, $$0x -> axf.ll)),
            Pair.of(1, new bzj<>($$0x -> $$0x.gy() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gy() ? axf.ls : axf.lj))
         ),
         ImmutableSet.of(Pair.of(cff.O, cfg.b), Pair.of(cff.r, cfg.b), Pair.of(cff.V, cfg.b))
      );
   }

   public static void a(cjs $$0) {
      $$0.eb().a(ImmutableList.of(crj.r, crj.q, crj.b));
   }

   public static Predicate<cxk> a() {
      return $$0 -> $$0.a(ayd.ag);
   }
}
