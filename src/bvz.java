import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bvz {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bge f = bge.a(5, 16);
   private static final ImmutableList<bth<? extends btg<? super bvy>>> g = ImmutableList.of(bth.c, bth.f, bth.s, bth.n);
   private static final ImmutableList<bsc<?>> h = ImmutableList.of(
      bsc.Y, bsc.x, bsc.y, bsc.m, bsc.n, bsc.E, bsc.t, bsc.h, bsc.N, bsc.O, bsc.P, bsc.Q, new bsc[]{bsc.r, bsc.J}
   );

   protected static void a(bvy $$0, arx $$1) {
   }

   public static bkb.b<bvy> a() {
      return bkb.a(h, g);
   }

   protected static bkb<?> a(bkb<bvy> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cda.a));
      $$0.b(cda.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkb<bvy> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new bnl(0.8F), new bvz.a(4.0F), new blx(45, 90), new bmb(), new bky(bsc.O), new bky(bsc.P)));
   }

   private static void c(bkb<bvy> $$0) {
      $$0.a(
         cda.b,
         ImmutableList.of(
            Pair.of(0, bmr.a(bip.bt, 6.0F, bge.a(30, 60))),
            Pair.of(1, new bkm(bip.l, 1.0F)),
            Pair.of(
               2,
               new bmo(
                  ImmutableList.of(Pair.of(new blf($$0x -> 2.5F, $$0x -> $$0x.i_() ? 2.5 : 3.5), 1), Pair.of(boe.a(Predicate.not(bvy::q), bkp.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bmi(bge.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bmo(
                  ImmutableMap.of(bsc.m, bsd.b),
                  ImmutableList.of(
                     Pair.of(boe.a(Predicate.not(bvy::q), bmj.a(2.0F)), 1),
                     Pair.of(boe.a(Predicate.not(bvy::q), bmy.a(2.0F, 3)), 1),
                     Pair.of(new bvz.b(20), 1),
                     Pair.of(new blc(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bvy $$0) {
      $$0.dM().a(ImmutableList.of(cda.b));
   }

   public static cmb b() {
      return bvy.bT;
   }

   public static class a extends bkn {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(akn $$0, bjk $$1, long $$2) {
         if ($$1 instanceof bvy $$3) {
            $$3.gn();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bks<bvy> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(akn $$0, bvy $$1) {
         return !$$1.aX() && $$1.go() >= (long)this.c && !$$1.fO() && $$1.aA() && !$$1.cO() && $$1.ga();
      }

      protected void a(akn $$0, bvy $$1, long $$2) {
         if ($$1.gi()) {
            $$1.gm();
         } else if (!$$1.fX()) {
            $$1.gl();
         }
      }
   }
}
