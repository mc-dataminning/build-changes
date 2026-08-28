import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cjh {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bsu h = bsu.a(5, 16);
   private static final ImmutableList<cgr<? extends cgq<? super cjg>>> i = ImmutableList.of(cgr.c, cgr.f, cgr.u, cgr.o, cgr.k);
   private static final ImmutableList<cfk<?>> j = ImmutableList.of(
      cfk.Z, cfk.x, cfk.y, cfk.m, cfk.n, cfk.E, cfk.t, cfk.h, cfk.O, cfk.P, cfk.Q, cfk.R, new cfk[]{cfk.r, cfk.K, cfk.G}
   );
   private static final bzk<cjg> k = cbm.a(
      (Function<cbm.b<cjg>, ? extends App<cbm.c<cjg>, cbp<cjg>>>)($$0 -> $$0.group($$0.c(cfk.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gr();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bxi.b<cjg> a() {
      return bxi.a(j, i);
   }

   protected static bxi<?> a(bxi<cjg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxi<cjg> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new cat(0.8F), new cjh.b(2.0F), new bzf(45, 90), new bzj() {
         @Override
         protected boolean a(ash $$0, bwi $$1) {
            if ($$1 instanceof cjg $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new byf(cfk.P), new byf(cfk.Q), k));
   }

   private static void c(bxi<cjg> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, bzz.a(bvr.bS, 6.0F, bsu.a(30, 60))),
            Pair.of(1, new bxt(bvr.e, 1.0F, 1)),
            Pair.of(2, new bzw(ImmutableList.of(Pair.of(new bym($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bxw.a(h, 1.25F), 1)))),
            Pair.of(3, new bzq(bsu.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bzw(ImmutableMap.of(cfk.m, cfl.b), ImmutableList.of(Pair.of(bzr.a(1.0F), 1), Pair.of(cag.a(1.0F, 3), 1), Pair.of(new byj(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bxi<cjg> $$0) {
      $$0.a(cro.g, ImmutableList.of(Pair.of(0, new cjh.a())), Set.of(Pair.of(cfk.G, cfl.a), Pair.of(cfk.Z, cfl.b)));
   }

   public static void a(cjg $$0) {
      $$0.ec().a(ImmutableList.of(cro.g, cro.b));
   }

   public static Predicate<cxp> b() {
      return $$0 -> $$0.a(ayd.an);
   }

   public static class a extends bxz<cjg> {
      static final int c = 5 * bbg.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(ash $$0, cjg $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.go()) {
            $$1.a(cjg.a.c);
            if ($$1.aJ()) {
               $$1.a(axf.aj);
            }
         } else {
            cjg.a $$3 = $$1.gp();
            long $$4 = $$1.ec().e(cfk.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cjg.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cjg.a.d.b()) {
                  $$1.a(axf.an);
                  $$1.a(cjg.a.d);
               }
            } else if ($$3 == cjg.a.d && $$4 > (long)cjg.a.d.b()) {
               $$1.a(cjg.a.c);
            }
         }
      }

      private int a(cjg $$0) {
         return cjg.a.c.b() + $$0.dZ().a(100, 400);
      }

      protected boolean a(ash $$0, cjg $$1) {
         return $$1.aJ();
      }

      protected boolean b(ash $$0, cjg $$1, long $$2) {
         return $$1.gp().a();
      }

      protected void c(ash $$0, cjg $$1, long $$2) {
         $$1.gq();
      }

      protected void d(ash $$0, cjg $$1, long $$2) {
         if (!$$1.gA()) {
            $$1.gr();
         }
      }
   }

   public static class b extends bxu<cjg> {
      public b(float $$0) {
         super($$0, $$0x -> axw.G);
      }

      protected void a(ash $$0, cjg $$1, long $$2) {
         $$1.gr();
         super.b($$0, $$1, $$2);
      }
   }
}
