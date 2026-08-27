import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cec {
   public static final int a = 20;
   public static final int b = 7;
   private static final bnl i = bnl.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bnl o = bnl.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bnl p = bnl.a(600, 6000);
   private static final bnl q = bnl.a(100, 300);
   private static final cbe r = cbe.a().a($$0 -> !$$0.ai().equals(bqb.X) && $$0.dM().C_().a($$0.cH()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(ceb $$0, axr $$1) {
      $$0.dP().a(bzr.S, o.a($$1));
      $$0.dP().a(bzr.V, p.a($$1));
   }

   protected static brp<?> a(brp<ceb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   private static void b(brp<ceb> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bva(0.8F), new bsb(2.0F), new btm(45, 90), new btq(), new bsm(bzr.P), new bsm(bzr.S), new bsm(bzr.V)));
   }

   private static void c(brp<ceb> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, bug.a(bqb.bx, 6.0F, bnl.a(30, 60))),
            Pair.of(0, new bsa(bqb.X)),
            Pair.of(1, new bst($$0x -> 1.25F)),
            Pair.of(2, bsd.a(i, 1.25F)),
            Pair.of(3, new bud(ImmutableList.of(Pair.of(bty.a(1.0F), 2), Pair.of(bun.a(1.0F, 3), 2), Pair.of(new bsq(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bzr.W, bzs.b), Pair.of(bzr.T, bzs.b))
      );
   }

   private static void d(brp<ceb> $$0) {
      $$0.a(
         cli.q,
         ImmutableList.of(Pair.of(0, new bth(o, aum.kY)), Pair.of(1, new btj<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gx() ? aum.kT : aum.kJ))),
         ImmutableSet.of(Pair.of(bzr.O, bzs.b), Pair.of(bzr.r, bzs.b), Pair.of(bzr.m, bzs.b), Pair.of(bzr.S, bzs.b))
      );
   }

   private static void e(brp<ceb> $$0) {
      $$0.a(
         cli.r,
         ImmutableList.of(
            Pair.of(
               0,
               new btw(
                  $$0x -> $$0x.gx() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gx() ? aum.kW : aum.kM, $$0x -> $$0x.gx() ? aum.kX : aum.kN
               )
            ),
            Pair.of(1, new btv<>($$0x -> $$0x.gx() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gx() ? aum.kV : aum.kL))
         ),
         ImmutableSet.of(Pair.of(bzr.O, bzs.b), Pair.of(bzr.r, bzs.b), Pair.of(bzr.V, bzs.b))
      );
   }

   public static void a(ceb $$0) {
      $$0.dP().a(ImmutableList.of(cli.r, cli.q, cli.b));
   }

   public static cvg a() {
      return cvg.a(crm.pv);
   }
}
