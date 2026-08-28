import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cir {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final brw f = brw.a(5, 16);
   private static final ImmutableList<cft<? extends cfs<? super ciq>>> g = ImmutableList.of(cft.c, cft.f, cft.t, cft.o);
   private static final ImmutableList<cem<?>> h = ImmutableList.of(
      cem.Z, cem.x, cem.y, cem.m, cem.n, cem.E, cem.t, cem.h, cem.O, cem.P, cem.Q, cem.R, new cem[]{cem.r, cem.K}
   );

   protected static void a(ciq $$0, azh $$1) {
   }

   public static bwk.b<ciq> a() {
      return bwk.a(h, g);
   }

   protected static bwk<?> a(bwk<ciq> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwk<ciq> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bzv(0.8F), new cir.a(4.0F), new byh(45, 90), new byl(), new bxh(cem.P), new bxh(cem.Q)));
   }

   private static void c(bwk<ciq> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, bzb.a(but.bR, 6.0F, brw.a(30, 60))),
            Pair.of(1, new bwv(but.t)),
            Pair.of(
               2,
               new byy(
                  ImmutableList.of(Pair.of(new bxo($$0x -> 2.5F, $$0x -> $$0x.e_() ? 2.5 : 3.5), 1), Pair.of(cao.a(Predicate.not(ciq::t), bwy.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bys(brw.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new byy(
                  ImmutableMap.of(cem.m, cen.b),
                  ImmutableList.of(
                     Pair.of(cao.a(Predicate.not(ciq::t), byt.a(2.0F)), 1),
                     Pair.of(cao.a(Predicate.not(ciq::t), bzi.a(2.0F, 3)), 1),
                     Pair.of(new cir.b(20), 1),
                     Pair.of(new bxl(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(ciq $$0) {
      $$0.eb().a(ImmutableList.of(cqp.b));
   }

   public static Predicate<cwq> b() {
      return $$0 -> $$0.a(awy.ak);
   }

   public static class a extends bww<ciq> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(ard $$0, ciq $$1, long $$2) {
         $$1.gH();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bxb<ciq> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ard $$0, ciq $$1) {
         return !$$1.bj() && $$1.gI() >= (long)this.c && !$$1.P_() && $$1.aJ() && !$$1.cX() && $$1.gs();
      }

      protected void a(ard $$0, ciq $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gG();
         } else if (!$$1.gp()) {
            $$1.gF();
         }
      }
   }
}
