import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cin {
   public static final int a = 20;
   public static final int b = 7;
   private static final brj i = brj.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final brj o = brj.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final brj p = brj.a(600, 6000);
   private static final brj q = brj.a(100, 300);
   private static final cfm r = cfm.a().a($$0 -> !$$0.aq().equals(bug.X) && ($$0.dX().ac().b(der.c) || !$$0.aq().equals(bug.d)) && $$0.dX().C_().a($$0.cS()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cim $$0, azr $$1) {
      $$0.ed().a(cdz.S, o.a($$1));
      $$0.ed().a(cdz.V, p.a($$1));
   }

   protected static bvx<?> a(bvx<cim> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cpz.a));
      $$0.b(cpz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvx<cim> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bzi(0.8F), new bwj(2.0F), new bxu(45, 90), new bxy(), new bwu(cdz.P), new bwu(cdz.S), new bwu(cdz.V)));
   }

   private static void c(bvx<cim> $$0) {
      $$0.a(
         cpz.b,
         ImmutableList.of(
            Pair.of(0, byo.a(bug.by, 6.0F, brj.a(30, 60))),
            Pair.of(0, new bwi(bug.X)),
            Pair.of(1, new bxb($$0x -> 1.25F)),
            Pair.of(2, bwl.a(i, 1.25F)),
            Pair.of(3, new byl(ImmutableList.of(Pair.of(byg.a(1.0F), 2), Pair.of(byv.a(1.0F, 3), 2), Pair.of(new bwy(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cdz.W, cea.b), Pair.of(cdz.T, cea.b))
      );
   }

   private static void d(bvx<cim> $$0) {
      $$0.a(
         cpz.q,
         ImmutableList.of(Pair.of(0, new bxp(o, awk.lc)), Pair.of(1, new bxr<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gH() ? awk.kY : awk.kP))),
         ImmutableSet.of(Pair.of(cdz.O, cea.b), Pair.of(cdz.r, cea.b), Pair.of(cdz.m, cea.b), Pair.of(cdz.S, cea.b))
      );
   }

   private static void e(bvx<cim> $$0) {
      $$0.a(
         cpz.r,
         ImmutableList.of(
            Pair.of(0, new bye($$0x -> $$0x.gH() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gH() ? awk.lb : awk.kS, $$0x -> awk.kT)),
            Pair.of(1, new byd<>($$0x -> $$0x.gH() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gH() ? awk.la : awk.kR))
         ),
         ImmutableSet.of(Pair.of(cdz.O, cea.b), Pair.of(cdz.r, cea.b), Pair.of(cdz.V, cea.b))
      );
   }

   public static void a(cim $$0) {
      $$0.ed().a(ImmutableList.of(cpz.r, cpz.q, cpz.b));
   }

   public static Predicate<cvx> a() {
      return $$0 -> $$0.a(axi.ac);
   }
}
