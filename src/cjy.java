import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjy {
   public static final int a = 20;
   public static final int b = 7;
   private static final bsu i = bsu.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bsu o = bsu.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bsu p = bsu.a(600, 6000);
   private static final bsu q = bsu.a(100, 300);
   private static final cgx r = cgx.a().a(($$0, $$1) -> !$$0.aq().equals(bvr.ai) && (!$$1.N().b(dhe.c) || !$$0.aq().equals(bvr.f)) && $$1.F_().a($$0.cR()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cjx $$0, bam $$1) {
      $$0.ec().a(cfk.S, o.a($$1));
      $$0.ec().a(cfk.V, p.a($$1));
   }

   protected static bxi<?> a(bxi<cjx> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxi<cjx> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new cat(0.8F), new bxu(2.0F), new bzf(45, 90), new bzj(), new byf(cfk.P), new byf(cfk.S), new byf(cfk.V)));
   }

   private static void c(bxi<cjx> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, bzz.a(bvr.bS, 6.0F, bsu.a(30, 60))),
            Pair.of(0, new bxt(bvr.ai)),
            Pair.of(1, new bym($$0x -> 1.25F)),
            Pair.of(2, bxw.a(i, 1.25F)),
            Pair.of(3, new bzw(ImmutableList.of(Pair.of(bzr.a(1.0F), 2), Pair.of(cag.a(1.0F, 3), 2), Pair.of(new byj(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cfk.W, cfl.b), Pair.of(cfk.T, cfl.b))
      );
   }

   private static void d(bxi<cjx> $$0) {
      $$0.a(
         cro.q,
         ImmutableList.of(Pair.of(0, new bza(o, axf.lv)), Pair.of(1, new bzc<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? axf.lr : axf.li))),
         ImmutableSet.of(Pair.of(cfk.O, cfl.b), Pair.of(cfk.r, cfl.b), Pair.of(cfk.m, cfl.b), Pair.of(cfk.S, cfl.b))
      );
   }

   private static void e(bxi<cjx> $$0) {
      $$0.a(
         cro.r,
         ImmutableList.of(
            Pair.of(0, new bzp($$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.e_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? axf.lu : axf.ll, $$0x -> axf.lm)),
            Pair.of(1, new bzo<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? axf.lt : axf.lk))
         ),
         ImmutableSet.of(Pair.of(cfk.O, cfl.b), Pair.of(cfk.r, cfl.b), Pair.of(cfk.V, cfl.b))
      );
   }

   public static void a(cjx $$0) {
      $$0.ec().a(ImmutableList.of(cro.r, cro.q, cro.b));
   }

   public static Predicate<cxp> a() {
      return $$0 -> $$0.a(ayd.ag);
   }
}
