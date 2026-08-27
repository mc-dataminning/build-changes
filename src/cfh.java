import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cfh {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final box f = box.a(5, 16);
   private static final ImmutableList<cck<? extends ccj<? super cfg>>> g = ImmutableList.of(cck.c, cck.f, cck.t, cck.o);
   private static final ImmutableList<cbd<?>> h = ImmutableList.of(
      cbd.Z, cbd.x, cbd.y, cbd.m, cbd.n, cbd.E, cbd.t, cbd.h, cbd.O, cbd.P, cbd.Q, cbd.R, new cbd[]{cbd.r, cbd.K}
   );

   protected static void a(cfg $$0, ayg $$1) {
   }

   public static btb.b<cfg> a() {
      return btb.a(h, g);
   }

   protected static btb<?> a(btb<cfg> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cmw.a));
      $$0.b(cmw.b);
      $$0.f();
      return $$0;
   }

   private static void b(btb<cfg> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new bwm(0.8F), new cfh.a(4.0F), new buy(45, 90), new bvc(), new bty(cbd.P), new bty(cbd.Q)));
   }

   private static void c(btb<cfg> $$0) {
      $$0.a(
         cmw.b,
         ImmutableList.of(
            Pair.of(0, bvs.a(brn.bx, 6.0F, box.a(30, 60))),
            Pair.of(1, new btm(brn.o)),
            Pair.of(
               2,
               new bvp(
                  ImmutableList.of(Pair.of(new buf($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(bxf.a(Predicate.not(cfg::u), btp.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bvj(box.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bvp(
                  ImmutableMap.of(cbd.m, cbe.b),
                  ImmutableList.of(
                     Pair.of(bxf.a(Predicate.not(cfg::u), bvk.a(2.0F)), 1),
                     Pair.of(bxf.a(Predicate.not(cfg::u), bvz.a(2.0F, 3)), 1),
                     Pair.of(new cfh.b(20), 1),
                     Pair.of(new buc(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cfg $$0) {
      $$0.dQ().a(ImmutableList.of(cmw.b));
   }

   public static Predicate<csz> b() {
      return $$0 -> $$0.a(avz.ah);
   }

   public static class a extends btn<cfg> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqh $$0, cfg $$1, long $$2) {
         $$1.gC();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bts<cfg> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqh $$0, cfg $$1) {
         return !$$1.bc() && $$1.gD() >= (long)this.c && !$$1.gc() && $$1.aC() && !$$1.cP() && $$1.gp();
      }

      protected void a(aqh $$0, cfg $$1, long $$2) {
         if ($$1.gx()) {
            $$1.gB();
         } else if (!$$1.gm()) {
            $$1.gA();
         }
      }
   }
}
