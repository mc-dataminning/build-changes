import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bwe {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bgj f = bgj.a(5, 16);
   private static final ImmutableList<btm<? extends btl<? super bwd>>> g = ImmutableList.of(btm.c, btm.f, btm.s, btm.n);
   private static final ImmutableList<bsh<?>> h = ImmutableList.of(
      bsh.Y, bsh.x, bsh.y, bsh.m, bsh.n, bsh.E, bsh.t, bsh.h, bsh.N, bsh.O, bsh.P, bsh.Q, new bsh[]{bsh.r, bsh.J}
   );

   protected static void a(bwd $$0, asc $$1) {
   }

   public static bkg.b<bwd> a() {
      return bkg.a(h, g);
   }

   protected static bkg<?> a(bkg<bwd> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdf.a));
      $$0.b(cdf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkg<bwd> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bnq(0.8F), new bwe.a(4.0F), new bmc(45, 90), new bmg(), new bld(bsh.O), new bld(bsh.P)));
   }

   private static void c(bkg<bwd> $$0) {
      $$0.a(
         cdf.b,
         ImmutableList.of(
            Pair.of(0, bmw.a(biu.bt, 6.0F, bgj.a(30, 60))),
            Pair.of(1, new bkr(biu.l, 1.0F)),
            Pair.of(
               2,
               new bmt(
                  ImmutableList.of(Pair.of(new blk($$0x -> 2.5F, $$0x -> $$0x.m_() ? 2.5 : 3.5), 1), Pair.of(boj.a(Predicate.not(bwd::t), bku.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bmn(bgj.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bmt(
                  ImmutableMap.of(bsh.m, bsi.b),
                  ImmutableList.of(
                     Pair.of(boj.a(Predicate.not(bwd::t), bmo.a(2.0F)), 1),
                     Pair.of(boj.a(Predicate.not(bwd::t), bnd.a(2.0F, 3)), 1),
                     Pair.of(new bwe.b(20), 1),
                     Pair.of(new blh(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bwd $$0) {
      $$0.dN().a(ImmutableList.of(cdf.b));
   }

   public static cmg b() {
      return bwd.bT;
   }

   public static class a extends bks {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(akr $$0, bjp $$1, long $$2) {
         if ($$1 instanceof bwd $$3) {
            $$3.gq();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bkx<bwd> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(akr $$0, bwd $$1) {
         return !$$1.aX() && $$1.gr() >= (long)this.c && !$$1.fR() && $$1.aA() && !$$1.cO() && $$1.gd();
      }

      protected void a(akr $$0, bwd $$1, long $$2) {
         if ($$1.gl()) {
            $$1.gp();
         } else if (!$$1.ga()) {
            $$1.go();
         }
      }
   }
}
