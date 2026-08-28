import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cgq {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bqg h = bqg.a(5, 16);
   private static final ImmutableList<ceb<? extends cea<? super cgp>>> i = ImmutableList.of(ceb.c, ceb.f, ceb.u, ceb.o, ceb.k);
   private static final ImmutableList<ccu<?>> j = ImmutableList.of(
      ccu.Z, ccu.x, ccu.y, ccu.m, ccu.n, ccu.E, ccu.t, ccu.h, ccu.O, ccu.P, ccu.Q, ccu.R, new ccu[]{ccu.r, ccu.K, ccu.G}
   );
   private static final bwu<cgp> k = byw.a(
      (Function<byw.b<cgp>, ? extends App<byw.c<cgp>, byz<cgp>>>)($$0 -> $$0.group($$0.c(ccu.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gy();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bus.b<cgp> a() {
      return bus.a(j, i);
   }

   protected static bus<?> a(bus<cgp> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bus<cgp> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new byd(0.8F), new cgq.b(2.0F), new bwp(45, 90), new bwt() {
         @Override
         protected boolean a(arf $$0, bts $$1) {
            if ($$1 instanceof cgp $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bvp(ccu.P), new bvp(ccu.Q), k));
   }

   private static void c(bus<cgp> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, bxj.a(btb.by, 6.0F, bqg.a(30, 60))),
            Pair.of(1, new bvd(btb.c, 1.0F, 1)),
            Pair.of(2, new bxg(ImmutableList.of(Pair.of(new bvw($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bvg.a(h, 1.25F), 1)))),
            Pair.of(3, new bxa(bqg.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxg(ImmutableMap.of(ccu.m, ccv.b), ImmutableList.of(Pair.of(bxb.a(1.0F), 1), Pair.of(bxq.a(1.0F, 3), 1), Pair.of(new bvt(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bus<cgp> $$0) {
      $$0.a(coo.g, ImmutableList.of(Pair.of(0, new cgq.a())), Set.of(Pair.of(ccu.G, ccv.a), Pair.of(ccu.Z, ccv.b)));
   }

   public static void a(cgp $$0) {
      $$0.dS().a(ImmutableList.of(coo.g, coo.b));
   }

   public static Predicate<cuq> b() {
      return $$0 -> $$0.a(awy.ai);
   }

   public static class a extends bvj<cgp> {
      static final int c = 5 * azz.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arf $$0, cgp $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(cgp.a.c);
            if ($$1.aE()) {
               $$1.a(awa.aj);
            }
         } else {
            cgp.a $$3 = $$1.gw();
            long $$4 = $$1.dS().e(ccu.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cgp.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cgp.a.d.b()) {
                  $$1.a(awa.an);
                  $$1.a(cgp.a.d);
               }
            } else if ($$3 == cgp.a.d && $$4 > (long)cgp.a.d.b()) {
               $$1.a(cgp.a.c);
            }
         }
      }

      private int a(cgp $$0) {
         return cgp.a.c.b() + $$0.el().a(100, 400);
      }

      protected boolean a(arf $$0, cgp $$1) {
         return $$1.aE();
      }

      protected boolean b(arf $$0, cgp $$1, long $$2) {
         return $$1.gw().a();
      }

      protected void c(arf $$0, cgp $$1, long $$2) {
         $$1.gx();
      }

      protected void d(arf $$0, cgp $$1, long $$2) {
         if (!$$1.gB()) {
            $$1.gy();
         }
      }
   }

   public static class b extends bve<cgp> {
      public b(float $$0) {
         super($$0, cgp::gz);
      }

      protected void a(arf $$0, cgp $$1, long $$2) {
         $$1.gy();
         super.b($$0, $$1, $$2);
      }
   }
}
