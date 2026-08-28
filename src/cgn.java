import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cgn {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bqd h = bqd.a(5, 16);
   private static final ImmutableList<cdy<? extends cdx<? super cgm>>> i = ImmutableList.of(cdy.c, cdy.f, cdy.u, cdy.o, cdy.k);
   private static final ImmutableList<ccr<?>> j = ImmutableList.of(
      ccr.Z, ccr.x, ccr.y, ccr.m, ccr.n, ccr.E, ccr.t, ccr.h, ccr.O, ccr.P, ccr.Q, ccr.R, new ccr[]{ccr.r, ccr.K, ccr.G}
   );
   private static final bwr<cgm> k = byt.a(
      (Function<byt.b<cgm>, ? extends App<byt.c<cgm>, byw<cgm>>>)($$0 -> $$0.group($$0.c(ccr.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gy();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bup.b<cgm> a() {
      return bup.a(j, i);
   }

   protected static bup<?> a(bup<cgm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(bup<cgm> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bya(0.8F), new cgn.b(2.0F), new bwm(45, 90), new bwq() {
         @Override
         protected boolean a(are $$0, btp $$1) {
            if ($$1 instanceof cgm $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bvm(ccr.P), new bvm(ccr.Q), k));
   }

   private static void c(bup<cgm> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxg.a(bsy.by, 6.0F, bqd.a(30, 60))),
            Pair.of(1, new bva(bsy.c, 1.0F, 1)),
            Pair.of(2, new bxd(ImmutableList.of(Pair.of(new bvt($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bvd.a(h, 1.25F), 1)))),
            Pair.of(3, new bwx(bqd.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxd(ImmutableMap.of(ccr.m, ccs.b), ImmutableList.of(Pair.of(bwy.a(1.0F), 1), Pair.of(bxn.a(1.0F, 3), 1), Pair.of(new bvq(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bup<cgm> $$0) {
      $$0.a(cok.g, ImmutableList.of(Pair.of(0, new cgn.a())), Set.of(Pair.of(ccr.G, ccs.a), Pair.of(ccr.Z, ccs.b)));
   }

   public static void a(cgm $$0) {
      $$0.dS().a(ImmutableList.of(cok.g, cok.b));
   }

   public static Predicate<cun> b() {
      return $$0 -> $$0.a(awx.ai);
   }

   public static class a extends bvg<cgm> {
      static final int c = 5 * azx.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(are $$0, cgm $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(cgm.a.c);
            if ($$1.aE()) {
               $$1.a(avz.aj);
            }
         } else {
            cgm.a $$3 = $$1.gw();
            long $$4 = $$1.dS().e(ccr.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cgm.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cgm.a.d.b()) {
                  $$1.a(avz.an);
                  $$1.a(cgm.a.d);
               }
            } else if ($$3 == cgm.a.d && $$4 > (long)cgm.a.d.b()) {
               $$1.a(cgm.a.c);
            }
         }
      }

      private int a(cgm $$0) {
         return cgm.a.c.b() + $$0.el().a(100, 400);
      }

      protected boolean a(are $$0, cgm $$1) {
         return $$1.aE();
      }

      protected boolean b(are $$0, cgm $$1, long $$2) {
         return $$1.gw().a();
      }

      protected void c(are $$0, cgm $$1, long $$2) {
         $$1.gx();
      }

      protected void d(are $$0, cgm $$1, long $$2) {
         if (!$$1.gB()) {
            $$1.gy();
         }
      }
   }

   public static class b extends bvb<cgm> {
      public b(float $$0) {
         super($$0, cgm::gz);
      }

      protected void a(are $$0, cgm $$1, long $$2) {
         $$1.gy();
         super.b($$0, $$1, $$2);
      }
   }
}
