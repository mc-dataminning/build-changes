import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cgp {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bqf h = bqf.a(5, 16);
   private static final ImmutableList<cea<? extends cdz<? super cgo>>> i = ImmutableList.of(cea.c, cea.f, cea.u, cea.o, cea.k);
   private static final ImmutableList<cct<?>> j = ImmutableList.of(
      cct.Z, cct.x, cct.y, cct.m, cct.n, cct.E, cct.t, cct.h, cct.O, cct.P, cct.Q, cct.R, new cct[]{cct.r, cct.K, cct.G}
   );
   private static final bwt<cgo> k = byv.a(
      (Function<byv.b<cgo>, ? extends App<byv.c<cgo>, byy<cgo>>>)($$0 -> $$0.group($$0.c(cct.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gy();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bur.b<cgo> a() {
      return bur.a(j, i);
   }

   protected static bur<?> a(bur<cgo> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(bur<cgo> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byc(0.8F), new cgp.b(2.0F), new bwo(45, 90), new bws() {
         @Override
         protected boolean a(arf $$0, btr $$1) {
            if ($$1 instanceof cgo $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bvo(cct.P), new bvo(cct.Q), k));
   }

   private static void c(bur<cgo> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxi.a(bta.by, 6.0F, bqf.a(30, 60))),
            Pair.of(1, new bvc(bta.c, 1.0F, 1)),
            Pair.of(2, new bxf(ImmutableList.of(Pair.of(new bvv($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bvf.a(h, 1.25F), 1)))),
            Pair.of(3, new bwz(bqf.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxf(ImmutableMap.of(cct.m, ccu.b), ImmutableList.of(Pair.of(bxa.a(1.0F), 1), Pair.of(bxp.a(1.0F, 3), 1), Pair.of(new bvs(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bur<cgo> $$0) {
      $$0.a(com.g, ImmutableList.of(Pair.of(0, new cgp.a())), Set.of(Pair.of(cct.G, ccu.a), Pair.of(cct.Z, ccu.b)));
   }

   public static void a(cgo $$0) {
      $$0.dS().a(ImmutableList.of(com.g, com.b));
   }

   public static Predicate<cup> b() {
      return $$0 -> $$0.a(awy.ai);
   }

   public static class a extends bvi<cgo> {
      static final int c = 5 * azz.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arf $$0, cgo $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(cgo.a.c);
            if ($$1.aE()) {
               $$1.a(awa.aj);
            }
         } else {
            cgo.a $$3 = $$1.gw();
            long $$4 = $$1.dS().e(cct.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cgo.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cgo.a.d.b()) {
                  $$1.a(awa.an);
                  $$1.a(cgo.a.d);
               }
            } else if ($$3 == cgo.a.d && $$4 > (long)cgo.a.d.b()) {
               $$1.a(cgo.a.c);
            }
         }
      }

      private int a(cgo $$0) {
         return cgo.a.c.b() + $$0.el().a(100, 400);
      }

      protected boolean a(arf $$0, cgo $$1) {
         return $$1.aE();
      }

      protected boolean b(arf $$0, cgo $$1, long $$2) {
         return $$1.gw().a();
      }

      protected void c(arf $$0, cgo $$1, long $$2) {
         $$1.gx();
      }

      protected void d(arf $$0, cgo $$1, long $$2) {
         if (!$$1.gB()) {
            $$1.gy();
         }
      }
   }

   public static class b extends bvd<cgo> {
      public b(float $$0) {
         super($$0, cgo::gz);
      }

      protected void a(arf $$0, cgo $$1, long $$2) {
         $$1.gy();
         super.b($$0, $$1, $$2);
      }
   }
}
