import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class ced {
   public static final cwd a = cwd.a(csg.sm);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.25F;
   private static final float f = 1.0F;
   private static final double g = 2.0;
   private static final double h = 1.0;
   private static final bob i = bob.a(5, 16);
   private static final ImmutableList<cbo<? extends cbn<? super cec>>> j = ImmutableList.of(cbo.c, cbo.f, cbo.u, cbo.o, cbo.k);
   private static final ImmutableList<cah<?>> k = ImmutableList.of(
      cah.Z, cah.x, cah.y, cah.m, cah.n, cah.E, cah.t, cah.h, cah.O, cah.P, cah.Q, cah.R, new cah[]{cah.r, cah.K, cah.G}
   );
   private static final buh<cec> l = bwj.a(
      (Function<bwj.b<cec>, ? extends App<bwj.c<cec>, bwm<cec>>>)($$0 -> $$0.group($$0.c(cah.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gx();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bsf.b<cec> a() {
      return bsf.a(k, j);
   }

   protected static bsf<?> a(bsf<cec> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cma.a));
      $$0.b(cma.b);
      $$0.f();
      return $$0;
   }

   private static void b(bsf<cec> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new bvq(0.8F), new ced.b(2.0F), new buc(45, 90), new bug() {
         @Override
         protected boolean a(aqe $$0, brg $$1) {
            if ($$1 instanceof cec $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new btc(cah.P), new btc(cah.Q), l));
   }

   private static void c(bsf<cec> $$0) {
      $$0.a(
         cma.b,
         ImmutableList.of(
            Pair.of(0, buw.a(bqr.bx, 6.0F, bob.a(30, 60))),
            Pair.of(1, new bsq(bqr.c, 1.0F, 1)),
            Pair.of(2, new but(ImmutableList.of(Pair.of(new btj($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bst.a(i, 1.25F), 1)))),
            Pair.of(3, new bun(bob.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new but(ImmutableMap.of(cah.m, cai.b), ImmutableList.of(Pair.of(buo.a(1.0F), 1), Pair.of(bvd.a(1.0F, 3), 1), Pair.of(new btg(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bsf<cec> $$0) {
      $$0.a(cma.g, ImmutableList.of(Pair.of(0, new ced.a())), Set.of(Pair.of(cah.G, cai.a), Pair.of(cah.Z, cai.b)));
   }

   public static void a(cec $$0) {
      $$0.dQ().a(ImmutableList.of(cma.g, cma.b));
   }

   public static cwd b() {
      return a;
   }

   public static class a extends bsw<cec> {
      static final int c = 5 * ayv.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aqe $$0, cec $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gp()) {
            $$1.a(cec.a.c);
            if ($$1.aC()) {
               $$1.a(auz.aj);
            }
         } else {
            cec.a $$3 = $$1.gv();
            long $$4 = $$1.dQ().e(cah.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cec.a.c) {
               if (this.f == 0 && $$1.aC() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cec.a.d.b()) {
                  $$1.a(auz.an);
                  $$1.a(cec.a.d);
               }
            } else if ($$3 == cec.a.d && $$4 > (long)cec.a.d.b()) {
               $$1.a(cec.a.c);
            }
         }
      }

      private int a(cec $$0) {
         return cec.a.c.b() + $$0.ej().a(100, 400);
      }

      protected boolean a(aqe $$0, cec $$1) {
         return $$1.aC();
      }

      protected boolean b(aqe $$0, cec $$1, long $$2) {
         return $$1.gv().a();
      }

      protected void c(aqe $$0, cec $$1, long $$2) {
         $$1.gw();
      }

      protected void d(aqe $$0, cec $$1, long $$2) {
         if (!$$1.gA()) {
            $$1.gx();
         }
      }
   }

   public static class b extends bsr<cec> {
      public b(float $$0) {
         super($$0, cec::gy);
      }

      protected void a(aqe $$0, cec $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }
}
