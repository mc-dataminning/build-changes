import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cfy {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bpo h = bpo.a(5, 16);
   private static final ImmutableList<cdj<? extends cdi<? super cfx>>> i = ImmutableList.of(cdj.c, cdj.f, cdj.u, cdj.o, cdj.k);
   private static final ImmutableList<ccc<?>> j = ImmutableList.of(
      ccc.Z, ccc.x, ccc.y, ccc.m, ccc.n, ccc.E, ccc.t, ccc.h, ccc.O, ccc.P, ccc.Q, ccc.R, new ccc[]{ccc.r, ccc.K, ccc.G}
   );
   private static final bwc<cfx> k = bye.a(
      (Function<bye.b<cfx>, ? extends App<bye.c<cfx>, byh<cfx>>>)($$0 -> $$0.group($$0.c(ccc.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gv();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bua.b<cfx> a() {
      return bua.a(j, i);
   }

   protected static bua<?> a(bua<cfx> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bua<cfx> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bxl(0.8F), new cfy.b(2.0F), new bvx(45, 90), new bwb() {
         @Override
         protected boolean a(aqk $$0, bta $$1) {
            if ($$1 instanceof cfx $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bux(ccc.P), new bux(ccc.Q), k));
   }

   private static void c(bua<cfx> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, bwr.a(bsj.by, 6.0F, bpo.a(30, 60))),
            Pair.of(1, new bul(bsj.c, 1.0F, 1)),
            Pair.of(2, new bwo(ImmutableList.of(Pair.of(new bve($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(buo.a(h, 1.25F), 1)))),
            Pair.of(3, new bwi(bpo.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bwo(ImmutableMap.of(ccc.m, ccd.b), ImmutableList.of(Pair.of(bwj.a(1.0F), 1), Pair.of(bwy.a(1.0F, 3), 1), Pair.of(new bvb(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bua<cfx> $$0) {
      $$0.a(cnw.g, ImmutableList.of(Pair.of(0, new cfy.a())), Set.of(Pair.of(ccc.G, ccd.a), Pair.of(ccc.Z, ccd.b)));
   }

   public static void a(cfx $$0) {
      $$0.dT().a(ImmutableList.of(cnw.g, cnw.b));
   }

   public static Predicate<cua> b() {
      return $$0 -> $$0.a(awd.ai);
   }

   public static class a extends bur<cfx> {
      static final int c = 5 * aze.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aqk $$0, cfx $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gn()) {
            $$1.a(cfx.a.c);
            if ($$1.aE()) {
               $$1.a(avf.aj);
            }
         } else {
            cfx.a $$3 = $$1.gt();
            long $$4 = $$1.dT().e(ccc.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cfx.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cfx.a.d.b()) {
                  $$1.a(avf.an);
                  $$1.a(cfx.a.d);
               }
            } else if ($$3 == cfx.a.d && $$4 > (long)cfx.a.d.b()) {
               $$1.a(cfx.a.c);
            }
         }
      }

      private int a(cfx $$0) {
         return cfx.a.c.b() + $$0.dS().a(100, 400);
      }

      protected boolean a(aqk $$0, cfx $$1) {
         return $$1.aE();
      }

      protected boolean b(aqk $$0, cfx $$1, long $$2) {
         return $$1.gt().a();
      }

      protected void c(aqk $$0, cfx $$1, long $$2) {
         $$1.gu();
      }

      protected void d(aqk $$0, cfx $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.gv();
         }
      }
   }

   public static class b extends bum<cfx> {
      public b(float $$0) {
         super($$0, cfx::gw);
      }

      protected void a(aqk $$0, cfx $$1, long $$2) {
         $$1.gv();
         super.b($$0, $$1, $$2);
      }
   }
}
