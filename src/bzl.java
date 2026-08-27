import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bzl {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bjm f = bjm.a(5, 16);
   private static final ImmutableList<bwt<? extends bws<? super bzk>>> g = ImmutableList.of(bwt.c, bwt.f, bwt.s, bwt.n);
   private static final ImmutableList<bvn<?>> h = ImmutableList.of(
      bvn.Y, bvn.x, bvn.y, bvn.m, bvn.n, bvn.E, bvn.t, bvn.h, bvn.N, bvn.O, bvn.P, bvn.Q, new bvn[]{bvn.r, bvn.J}
   );

   protected static void a(bzk $$0, auv $$1) {
   }

   public static bnl.b<bzk> a() {
      return bnl.a(h, g);
   }

   protected static bnl<?> a(bnl<bzk> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgu.a));
      $$0.b(cgu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnl<bzk> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bqw(0.8F), new bzl.a(4.0F), new bpi(45, 90), new bpm(), new boi(bvn.O), new boi(bvn.P)));
   }

   private static void c(bnl<bzk> $$0) {
      $$0.a(
         cgu.b,
         ImmutableList.of(
            Pair.of(0, bqc.a(blz.bv, 6.0F, bjm.a(30, 60))),
            Pair.of(1, new bnw(blz.m, 1.0F)),
            Pair.of(
               2,
               new bpz(
                  ImmutableList.of(Pair.of(new bop($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(brp.a(Predicate.not(bzk::w), bnz.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bpt(bjm.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bpz(
                  ImmutableMap.of(bvn.m, bvo.b),
                  ImmutableList.of(
                     Pair.of(brp.a(Predicate.not(bzk::w), bpu.a(2.0F)), 1),
                     Pair.of(brp.a(Predicate.not(bzk::w), bqj.a(2.0F, 3)), 1),
                     Pair.of(new bzl.b(20), 1),
                     Pair.of(new bom(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bzk $$0) {
      $$0.dO().a(ImmutableList.of(cgu.b));
   }

   public static cpz b() {
      return bzk.bT;
   }

   public static class a extends bnx {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(and $$0, bmu $$1, long $$2) {
         if ($$1 instanceof bzk $$3) {
            $$3.gr();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends boc<bzk> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(and $$0, bzk $$1) {
         return !$$1.aZ() && $$1.gs() >= (long)this.c && !$$1.fS() && $$1.aC() && !$$1.cO() && $$1.ge();
      }

      protected void a(and $$0, bzk $$1, long $$2) {
         if ($$1.gm()) {
            $$1.gq();
         } else if (!$$1.gb()) {
            $$1.gp();
         }
      }
   }
}
