import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cgk {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bqa h = bqa.a(5, 16);
   private static final ImmutableList<cdv<? extends cdu<? super cgj>>> i = ImmutableList.of(cdv.c, cdv.f, cdv.u, cdv.o, cdv.k);
   private static final ImmutableList<cco<?>> j = ImmutableList.of(
      cco.Z, cco.x, cco.y, cco.m, cco.n, cco.E, cco.t, cco.h, cco.O, cco.P, cco.Q, cco.R, new cco[]{cco.r, cco.K, cco.G}
   );
   private static final bwo<cgj> k = byq.a(
      (Function<byq.b<cgj>, ? extends App<byq.c<cgj>, byt<cgj>>>)($$0 -> $$0.group($$0.c(cco.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gy();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bum.b<cgj> a() {
      return bum.a(j, i);
   }

   protected static bum<?> a(bum<cgj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(coh.a));
      $$0.b(coh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bum<cgj> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bxx(0.8F), new cgk.b(2.0F), new bwj(45, 90), new bwn() {
         @Override
         protected boolean a(arb $$0, btm $$1) {
            if ($$1 instanceof cgj $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bvj(cco.P), new bvj(cco.Q), k));
   }

   private static void c(bum<cgj> $$0) {
      $$0.a(
         coh.b,
         ImmutableList.of(
            Pair.of(0, bxd.a(bsv.by, 6.0F, bqa.a(30, 60))),
            Pair.of(1, new bux(bsv.c, 1.0F, 1)),
            Pair.of(2, new bxa(ImmutableList.of(Pair.of(new bvq($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bva.a(h, 1.25F), 1)))),
            Pair.of(3, new bwu(bqa.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxa(ImmutableMap.of(cco.m, ccp.b), ImmutableList.of(Pair.of(bwv.a(1.0F), 1), Pair.of(bxk.a(1.0F, 3), 1), Pair.of(new bvn(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bum<cgj> $$0) {
      $$0.a(coh.g, ImmutableList.of(Pair.of(0, new cgk.a())), Set.of(Pair.of(cco.G, ccp.a), Pair.of(cco.Z, ccp.b)));
   }

   public static void a(cgj $$0) {
      $$0.dS().a(ImmutableList.of(coh.g, coh.b));
   }

   public static Predicate<cuk> b() {
      return $$0 -> $$0.a(awu.ai);
   }

   public static class a extends bvd<cgj> {
      static final int c = 5 * azu.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arb $$0, cgj $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(cgj.a.c);
            if ($$1.aE()) {
               $$1.a(avw.aj);
            }
         } else {
            cgj.a $$3 = $$1.gw();
            long $$4 = $$1.dS().e(cco.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cgj.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cgj.a.d.b()) {
                  $$1.a(avw.an);
                  $$1.a(cgj.a.d);
               }
            } else if ($$3 == cgj.a.d && $$4 > (long)cgj.a.d.b()) {
               $$1.a(cgj.a.c);
            }
         }
      }

      private int a(cgj $$0) {
         return cgj.a.c.b() + $$0.el().a(100, 400);
      }

      protected boolean a(arb $$0, cgj $$1) {
         return $$1.aE();
      }

      protected boolean b(arb $$0, cgj $$1, long $$2) {
         return $$1.gw().a();
      }

      protected void c(arb $$0, cgj $$1, long $$2) {
         $$1.gx();
      }

      protected void d(arb $$0, cgj $$1, long $$2) {
         if (!$$1.gB()) {
            $$1.gy();
         }
      }
   }

   public static class b extends buy<cgj> {
      public b(float $$0) {
         super($$0, cgj::gz);
      }

      protected void a(arb $$0, cgj $$1, long $$2) {
         $$1.gy();
         super.b($$0, $$1, $$2);
      }
   }
}
