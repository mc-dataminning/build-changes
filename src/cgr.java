import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cgr {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bqh h = bqh.a(5, 16);
   private static final ImmutableList<cec<? extends ceb<? super cgq>>> i = ImmutableList.of(cec.c, cec.f, cec.u, cec.o, cec.k);
   private static final ImmutableList<ccv<?>> j = ImmutableList.of(
      ccv.Z, ccv.x, ccv.y, ccv.m, ccv.n, ccv.E, ccv.t, ccv.h, ccv.O, ccv.P, ccv.Q, ccv.R, new ccv[]{ccv.r, ccv.K, ccv.G}
   );
   private static final bwv<cgq> k = byx.a(
      (Function<byx.b<cgq>, ? extends App<byx.c<cgq>, bza<cgq>>>)($$0 -> $$0.group($$0.c(ccv.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gy();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static but.b<cgq> a() {
      return but.a(j, i);
   }

   protected static but<?> a(but<cgq> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cop.a));
      $$0.b(cop.b);
      $$0.f();
      return $$0;
   }

   private static void b(but<cgq> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bye(0.8F), new cgr.b(2.0F), new bwq(45, 90), new bwu() {
         @Override
         protected boolean a(arf $$0, btt $$1) {
            if ($$1 instanceof cgq $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bvq(ccv.P), new bvq(ccv.Q), k));
   }

   private static void c(but<cgq> $$0) {
      $$0.a(
         cop.b,
         ImmutableList.of(
            Pair.of(0, bxk.a(btc.by, 6.0F, bqh.a(30, 60))),
            Pair.of(1, new bve(btc.c, 1.0F, 1)),
            Pair.of(2, new bxh(ImmutableList.of(Pair.of(new bvx($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bvh.a(h, 1.25F), 1)))),
            Pair.of(3, new bxb(bqh.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxh(ImmutableMap.of(ccv.m, ccw.b), ImmutableList.of(Pair.of(bxc.a(1.0F), 1), Pair.of(bxr.a(1.0F, 3), 1), Pair.of(new bvu(30, 60), 1)))
            )
         )
      );
   }

   private static void d(but<cgq> $$0) {
      $$0.a(cop.g, ImmutableList.of(Pair.of(0, new cgr.a())), Set.of(Pair.of(ccv.G, ccw.a), Pair.of(ccv.Z, ccw.b)));
   }

   public static void a(cgq $$0) {
      $$0.dS().a(ImmutableList.of(cop.g, cop.b));
   }

   public static Predicate<cur> b() {
      return $$0 -> $$0.a(awy.ai);
   }

   public static class a extends bvk<cgq> {
      static final int c = 5 * azz.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arf $$0, cgq $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(cgq.a.c);
            if ($$1.aE()) {
               $$1.a(awa.aj);
            }
         } else {
            cgq.a $$3 = $$1.gw();
            long $$4 = $$1.dS().e(ccv.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cgq.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cgq.a.d.b()) {
                  $$1.a(awa.an);
                  $$1.a(cgq.a.d);
               }
            } else if ($$3 == cgq.a.d && $$4 > (long)cgq.a.d.b()) {
               $$1.a(cgq.a.c);
            }
         }
      }

      private int a(cgq $$0) {
         return cgq.a.c.b() + $$0.el().a(100, 400);
      }

      protected boolean a(arf $$0, cgq $$1) {
         return $$1.aE();
      }

      protected boolean b(arf $$0, cgq $$1, long $$2) {
         return $$1.gw().a();
      }

      protected void c(arf $$0, cgq $$1, long $$2) {
         $$1.gx();
      }

      protected void d(arf $$0, cgq $$1, long $$2) {
         if (!$$1.gB()) {
            $$1.gy();
         }
      }
   }

   public static class b extends bvf<cgq> {
      public b(float $$0) {
         super($$0, cgq::gz);
      }

      protected void a(arf $$0, cgq $$1, long $$2) {
         $$1.gy();
         super.b($$0, $$1, $$2);
      }
   }
}
