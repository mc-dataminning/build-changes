import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chw {
   public static final int a = 20;
   public static final int b = 7;
   private static final bqv i = bqv.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bqv o = bqv.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bqv p = bqv.a(600, 6000);
   private static final bqv q = bqv.a(100, 300);
   private static final cev r = cev.a().a($$0 -> !$$0.ao().equals(btq.X) && ($$0.dS().ac().b(ddo.c) || !$$0.ao().equals(btq.d)) && $$0.dS().A_().a($$0.cO()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(chv $$0, azk $$1) {
      $$0.dX().a(cdi.S, o.a($$1));
      $$0.dX().a(cdi.V, p.a($$1));
   }

   protected static bvg<?> a(bvg<chv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvg<chv> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new byr(0.8F), new bvs(2.0F), new bxd(45, 90), new bxh(), new bwd(cdi.P), new bwd(cdi.S), new bwd(cdi.V)));
   }

   private static void c(bvg<chv> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, bxx.a(btq.by, 6.0F, bqv.a(30, 60))),
            Pair.of(0, new bvr(btq.X)),
            Pair.of(1, new bwk($$0x -> 1.25F)),
            Pair.of(2, bvu.a(i, 1.25F)),
            Pair.of(3, new bxu(ImmutableList.of(Pair.of(bxp.a(1.0F), 2), Pair.of(bye.a(1.0F, 3), 2), Pair.of(new bwh(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cdi.W, cdj.b), Pair.of(cdi.T, cdj.b))
      );
   }

   private static void d(bvg<chv> $$0) {
      $$0.a(
         cpg.q,
         ImmutableList.of(Pair.of(0, new bwy(o, awd.le)), Pair.of(1, new bxa<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gA() ? awd.kZ : awd.kP))),
         ImmutableSet.of(Pair.of(cdi.O, cdj.b), Pair.of(cdi.r, cdj.b), Pair.of(cdi.m, cdj.b), Pair.of(cdi.S, cdj.b))
      );
   }

   private static void e(bvg<chv> $$0) {
      $$0.a(
         cpg.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bxn(
                  $$0x -> $$0x.gA() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gA() ? awd.lc : awd.kS, $$0x -> $$0x.gA() ? awd.ld : awd.kT
               )
            ),
            Pair.of(1, new bxm<>($$0x -> $$0x.gA() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gA() ? awd.lb : awd.kR))
         ),
         ImmutableSet.of(Pair.of(cdi.O, cdj.b), Pair.of(cdi.r, cdj.b), Pair.of(cdi.V, cdj.b))
      );
   }

   public static void a(chv $$0) {
      $$0.dX().a(ImmutableList.of(cpg.r, cpg.q, cpg.b));
   }

   public static Predicate<cvl> a() {
      return $$0 -> $$0.a(axb.ab);
   }
}
