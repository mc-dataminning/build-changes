import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cez {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final box h = box.a(5, 16);
   private static final ImmutableList<cck<? extends ccj<? super cey>>> i = ImmutableList.of(cck.c, cck.f, cck.u, cck.o, cck.k);
   private static final ImmutableList<cbd<?>> j = ImmutableList.of(
      cbd.Z, cbd.x, cbd.y, cbd.m, cbd.n, cbd.E, cbd.t, cbd.h, cbd.O, cbd.P, cbd.Q, cbd.R, new cbd[]{cbd.r, cbd.K, cbd.G}
   );
   private static final bvd<cey> k = bxf.a(
      (Function<bxf.b<cey>, ? extends App<bxf.c<cey>, bxi<cey>>>)($$0 -> $$0.group($$0.c(cbd.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gx();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static btb.b<cey> a() {
      return btb.a(j, i);
   }

   protected static btb<?> a(btb<cey> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cmw.a));
      $$0.b(cmw.b);
      $$0.f();
      return $$0;
   }

   private static void b(btb<cey> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new bwm(0.8F), new cez.b(2.0F), new buy(45, 90), new bvc() {
         @Override
         protected boolean a(aqh $$0, bsc $$1) {
            if ($$1 instanceof cey $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bty(cbd.P), new bty(cbd.Q), k));
   }

   private static void c(btb<cey> $$0) {
      $$0.a(
         cmw.b,
         ImmutableList.of(
            Pair.of(0, bvs.a(brn.bx, 6.0F, box.a(30, 60))),
            Pair.of(1, new btm(brn.c, 1.0F, 1)),
            Pair.of(2, new bvp(ImmutableList.of(Pair.of(new buf($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(btp.a(h, 1.25F), 1)))),
            Pair.of(3, new bvj(box.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bvp(ImmutableMap.of(cbd.m, cbe.b), ImmutableList.of(Pair.of(bvk.a(1.0F), 1), Pair.of(bvz.a(1.0F, 3), 1), Pair.of(new buc(30, 60), 1)))
            )
         )
      );
   }

   private static void d(btb<cey> $$0) {
      $$0.a(cmw.g, ImmutableList.of(Pair.of(0, new cez.a())), Set.of(Pair.of(cbd.G, cbe.a), Pair.of(cbd.Z, cbe.b)));
   }

   public static void a(cey $$0) {
      $$0.dQ().a(ImmutableList.of(cmw.g, cmw.b));
   }

   public static Predicate<csz> b() {
      return $$0 -> $$0.a(avz.ai);
   }

   public static class a extends bts<cey> {
      static final int c = 5 * ayy.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aqh $$0, cey $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gp()) {
            $$1.a(cey.a.c);
            if ($$1.aC()) {
               $$1.a(avc.aj);
            }
         } else {
            cey.a $$3 = $$1.gv();
            long $$4 = $$1.dQ().e(cbd.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cey.a.c) {
               if (this.f == 0 && $$1.aC() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cey.a.d.b()) {
                  $$1.a(avc.an);
                  $$1.a(cey.a.d);
               }
            } else if ($$3 == cey.a.d && $$4 > (long)cey.a.d.b()) {
               $$1.a(cey.a.c);
            }
         }
      }

      private int a(cey $$0) {
         return cey.a.c.b() + $$0.ej().a(100, 400);
      }

      protected boolean a(aqh $$0, cey $$1) {
         return $$1.aC();
      }

      protected boolean b(aqh $$0, cey $$1, long $$2) {
         return $$1.gv().a();
      }

      protected void c(aqh $$0, cey $$1, long $$2) {
         $$1.gw();
      }

      protected void d(aqh $$0, cey $$1, long $$2) {
         if (!$$1.gA()) {
            $$1.gx();
         }
      }
   }

   public static class b extends btn<cey> {
      public b(float $$0) {
         super($$0, cey::gy);
      }

      protected void a(aqh $$0, cey $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }
}
