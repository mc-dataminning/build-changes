import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cbj {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final blf f = blf.a(5, 16);
   private static final ImmutableList<byo<? extends byn<? super cbi>>> g = ImmutableList.of(byo.c, byo.f, byo.t, byo.o);
   private static final ImmutableList<bxh<?>> h = ImmutableList.of(
      bxh.Z, bxh.x, bxh.y, bxh.m, bxh.n, bxh.E, bxh.t, bxh.h, bxh.O, bxh.P, bxh.Q, bxh.R, new bxh[]{bxh.r, bxh.K}
   );

   protected static void a(cbi $$0, awo $$1) {
   }

   public static bpf.b<cbi> a() {
      return bpf.a(h, g);
   }

   protected static bpf<?> a(bpf<cbi> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cbi> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bsq(0.8F), new cbj.a(4.0F), new brc(45, 90), new brg(), new bqc(bxh.P), new bqc(bxh.Q)));
   }

   private static void c(bpf<cbi> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, brw.a(bnu.bw, 6.0F, blf.a(30, 60))),
            Pair.of(1, new bpq(bnu.n)),
            Pair.of(
               2,
               new brt(
                  ImmutableList.of(Pair.of(new bqj($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(btj.a(Predicate.not(cbi::w), bpt.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new brn(blf.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new brt(
                  ImmutableMap.of(bxh.m, bxi.b),
                  ImmutableList.of(
                     Pair.of(btj.a(Predicate.not(cbi::w), bro.a(2.0F)), 1),
                     Pair.of(btj.a(Predicate.not(cbi::w), bsd.a(2.0F, 3)), 1),
                     Pair.of(new cbj.b(20), 1),
                     Pair.of(new bqg(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cbi $$0) {
      $$0.dO().a(ImmutableList.of(ciu.b));
   }

   public static cry b() {
      return cbi.bT;
   }

   public static class a extends bpr {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(aov $$0, boo $$1, long $$2) {
         if ($$1 instanceof cbi $$3) {
            $$3.gt();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bpw<cbi> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aov $$0, cbi $$1) {
         return !$$1.aZ() && $$1.gu() >= (long)this.c && !$$1.fU() && $$1.aC() && !$$1.cO() && $$1.gg();
      }

      protected void a(aov $$0, cbi $$1, long $$2) {
         if ($$1.go()) {
            $$1.gs();
         } else if (!$$1.gd()) {
            $$1.gr();
         }
      }
   }
}
