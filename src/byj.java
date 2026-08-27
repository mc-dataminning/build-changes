import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class byj {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bim f = bim.a(5, 16);
   private static final ImmutableList<bvr<? extends bvq<? super byi>>> g = ImmutableList.of(bvr.c, bvr.f, bvr.s, bvr.n);
   private static final ImmutableList<bum<?>> h = ImmutableList.of(
      bum.Y, bum.x, bum.y, bum.m, bum.n, bum.E, bum.t, bum.h, bum.N, bum.O, bum.P, bum.Q, new bum[]{bum.r, bum.J}
   );

   protected static void a(byi $$0, atw $$1) {
   }

   public static bml.b<byi> a() {
      return bml.a(h, g);
   }

   protected static bml<?> a(bml<byi> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cfk.a));
      $$0.b(cfk.b);
      $$0.f();
      return $$0;
   }

   private static void b(bml<byi> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new bpv(0.8F), new byj.a(4.0F), new boh(45, 90), new bol(), new bni(bum.O), new bni(bum.P)));
   }

   private static void c(bml<byi> $$0) {
      $$0.a(
         cfk.b,
         ImmutableList.of(
            Pair.of(0, bpb.a(bkz.bt, 6.0F, bim.a(30, 60))),
            Pair.of(1, new bmw(bkz.l, 1.0F)),
            Pair.of(
               2,
               new boy(
                  ImmutableList.of(Pair.of(new bnp($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(bqo.a(Predicate.not(byi::w), bmz.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bos(bim.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new boy(
                  ImmutableMap.of(bum.m, bun.b),
                  ImmutableList.of(
                     Pair.of(bqo.a(Predicate.not(byi::w), bot.a(2.0F)), 1),
                     Pair.of(bqo.a(Predicate.not(byi::w), bpi.a(2.0F, 3)), 1),
                     Pair.of(new byj.b(20), 1),
                     Pair.of(new bnm(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(byi $$0) {
      $$0.dP().a(ImmutableList.of(cfk.b));
   }

   public static coq b() {
      return byi.bT;
   }

   public static class a extends bmx {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(ami $$0, blu $$1, long $$2) {
         if ($$1 instanceof byi $$3) {
            $$3.gs();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bnc<byi> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ami $$0, byi $$1) {
         return !$$1.aZ() && $$1.gt() >= (long)this.c && !$$1.fT() && $$1.aC() && !$$1.cP() && $$1.gf();
      }

      protected void a(ami $$0, byi $$1, long $$2) {
         if ($$1.gn()) {
            $$1.gr();
         } else if (!$$1.gc()) {
            $$1.gq();
         }
      }
   }
}
