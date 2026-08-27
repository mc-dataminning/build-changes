import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bvv {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bfz f = bfz.a(5, 16);
   private static final ImmutableList<btd<? extends btc<? super bvu>>> g = ImmutableList.of(btd.c, btd.f, btd.s, btd.n);
   private static final ImmutableList<bry<?>> h = ImmutableList.of(
      bry.Y, bry.x, bry.y, bry.m, bry.n, bry.E, bry.t, bry.h, bry.N, bry.O, bry.P, bry.Q, new bry[]{bry.r, bry.J}
   );

   protected static void a(bvu $$0, art $$1) {
   }

   public static bjx.b<bvu> a() {
      return bjx.a(h, g);
   }

   protected static bjx<?> a(bjx<bvu> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ccw.a));
      $$0.b(ccw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjx<bvu> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new bnh(0.8F), new bvv.a(4.0F), new blt(45, 90), new blx(), new bku(bry.O), new bku(bry.P)));
   }

   private static void c(bjx<bvu> $$0) {
      $$0.a(
         ccw.b,
         ImmutableList.of(
            Pair.of(0, bmn.a(bik.bt, 6.0F, bfz.a(30, 60))),
            Pair.of(1, new bki(bik.l, 1.0F)),
            Pair.of(2, new blb($$0x -> 2.5F, $$0x -> $$0x.i_() ? 2.5 : 3.5)),
            Pair.of(3, boa.a(Predicate.not(bvu::q), bkl.a(f, 2.5F))),
            Pair.of(4, new bme(bfz.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               5,
               new bmk(
                  ImmutableMap.of(bry.m, brz.b),
                  ImmutableList.of(
                     Pair.of(boa.a(Predicate.not(bvu::q), bmf.a(2.0F)), 1),
                     Pair.of(boa.a(Predicate.not(bvu::q), bmu.a(2.0F, 3)), 1),
                     Pair.of(new bvv.b(20), 1),
                     Pair.of(new bky(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bvu $$0) {
      $$0.dM().a(ImmutableList.of(ccw.b));
   }

   public static clw b() {
      return bvu.bT;
   }

   public static class a extends bkj {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(aki $$0, bjf $$1, long $$2) {
         if ($$1 instanceof bvu $$3) {
            $$3.gm();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bko<bvu> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aki $$0, bvu $$1) {
         return !$$1.aX() && $$1.gn() >= (long)this.c && !$$1.fO() && $$1.aA() && !$$1.cO() && $$1.fZ();
      }

      protected void a(aki $$0, bvu $$1, long $$2) {
         if ($$1.gh()) {
            $$1.gl();
         } else if (!$$1.fW()) {
            $$1.gk();
         }
      }
   }
}
