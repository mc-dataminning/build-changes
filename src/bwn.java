import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwn {
   public static final int a = 20;
   public static final int b = 7;
   private static final bgj i = bgj.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bgj p = bgj.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bgj q = bgj.a(600, 6000);
   private static final bgj r = bgj.a(100, 300);
   private static final bts s = bts.a().a($$0 -> !$$0.ah().equals(biu.U) && $$0.dL().B_().a($$0.cH()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bwm $$0, asc $$1) {
      $$0.dN().a(bsh.R, p.a($$1));
      $$0.dN().a(bsh.U, q.a($$1));
   }

   protected static bkg<?> a(bkg<bwm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cdf.a));
      $$0.b(cdf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkg<bwm> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bnq(0.8F), new bks(2.0F), new bmc(45, 90), new bmg(), new bld(bsh.O), new bld(bsh.R), new bld(bsh.U)));
   }

   private static void c(bkg<bwm> $$0) {
      $$0.a(
         cdf.b,
         ImmutableList.of(
            Pair.of(0, bmw.a(biu.bt, 6.0F, bgj.a(30, 60))),
            Pair.of(0, new bkr(biu.U, 1.0F)),
            Pair.of(1, new blk($$0x -> 1.25F)),
            Pair.of(2, bku.a(i, 1.25F)),
            Pair.of(3, new bmt(ImmutableList.of(Pair.of(bmo.a(1.0F), 2), Pair.of(bnd.a(1.0F, 3), 2), Pair.of(new blh(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bsh.V, bsi.b), Pair.of(bsh.S, bsi.b))
      );
   }

   private static void d(bkg<bwm> $$0) {
      $$0.a(
         cdf.q,
         ImmutableList.of(Pair.of(0, new bly(p, ape.jW)), Pair.of(1, new bma<>(p, 5, 5, 1.5F, $$0x -> $$0x.gn() ? ape.jR : ape.jH))),
         ImmutableSet.of(Pair.of(bsh.N, bsi.b), Pair.of(bsh.r, bsi.b), Pair.of(bsh.m, bsi.b), Pair.of(bsh.R, bsi.b))
      );
   }

   private static void e(bkg<bwm> $$0) {
      $$0.a(
         cdf.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bmm(
                  $$0x -> $$0x.gn() ? r : q, s, 3.0F, $$0x -> $$0x.m_() ? 1.0 : 2.5, $$0x -> $$0x.gn() ? ape.jU : ape.jK, $$0x -> $$0x.gn() ? ape.jV : ape.jL
               )
            ),
            Pair.of(1, new bml<>($$0x -> $$0x.gn() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gn() ? ape.jT : ape.jJ))
         ),
         ImmutableSet.of(Pair.of(bsh.N, bsi.b), Pair.of(bsh.r, bsi.b), Pair.of(bsh.U, bsi.b))
      );
   }

   public static void a(bwm $$0) {
      $$0.dN().a(ImmutableList.of(cdf.r, cdf.q, cdf.b));
   }

   public static cmg a() {
      return cmg.a(cji.oI);
   }
}
