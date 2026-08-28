import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cjc {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bsp h = bsp.a(5, 16);
   private static final ImmutableList<cgm<? extends cgl<? super cjb>>> i = ImmutableList.of(cgm.c, cgm.f, cgm.u, cgm.o, cgm.k);
   private static final ImmutableList<cff<?>> j = ImmutableList.of(
      cff.Z, cff.x, cff.y, cff.m, cff.n, cff.E, cff.t, cff.h, cff.O, cff.P, cff.Q, cff.R, new cff[]{cff.r, cff.K, cff.G}
   );
   private static final bzf<cjb> k = cbh.a(
      (Function<cbh.b<cjb>, ? extends App<cbh.c<cjb>, cbk<cjb>>>)($$0 -> $$0.group($$0.c(cff.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gp();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bxd.b<cjb> a() {
      return bxd.a(j, i);
   }

   protected static bxd<?> a(bxd<cjb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxd<cjb> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new cao(0.8F), new cjc.b(2.0F), new bza(45, 90), new bze() {
         @Override
         protected boolean a(ash $$0, bwd $$1) {
            if ($$1 instanceof cjb $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bya(cff.P), new bya(cff.Q), k));
   }

   private static void c(bxd<cjb> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, bzu.a(bvm.bS, 6.0F, bsp.a(30, 60))),
            Pair.of(1, new bxo(bvm.e, 1.0F, 1)),
            Pair.of(2, new bzr(ImmutableList.of(Pair.of(new byh($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bxr.a(h, 1.25F), 1)))),
            Pair.of(3, new bzl(bsp.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bzr(ImmutableMap.of(cff.m, cfg.b), ImmutableList.of(Pair.of(bzm.a(1.0F), 1), Pair.of(cab.a(1.0F, 3), 1), Pair.of(new bye(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bxd<cjb> $$0) {
      $$0.a(crj.g, ImmutableList.of(Pair.of(0, new cjc.a())), Set.of(Pair.of(cff.G, cfg.a), Pair.of(cff.Z, cfg.b)));
   }

   public static void a(cjb $$0) {
      $$0.eb().a(ImmutableList.of(crj.g, crj.b));
   }

   public static Predicate<cxk> b() {
      return $$0 -> $$0.a(ayd.an);
   }

   public static class a extends bxu<cjb> {
      static final int c = 5 * bbg.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(ash $$0, cjb $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gm()) {
            $$1.a(cjb.a.c);
            if ($$1.aJ()) {
               $$1.a(axf.aj);
            }
         } else {
            cjb.a $$3 = $$1.gn();
            long $$4 = $$1.eb().e(cff.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cjb.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cjb.a.d.b()) {
                  $$1.a(axf.an);
                  $$1.a(cjb.a.d);
               }
            } else if ($$3 == cjb.a.d && $$4 > (long)cjb.a.d.b()) {
               $$1.a(cjb.a.c);
            }
         }
      }

      private int a(cjb $$0) {
         return cjb.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(ash $$0, cjb $$1) {
         return $$1.aJ();
      }

      protected boolean b(ash $$0, cjb $$1, long $$2) {
         return $$1.gn().a();
      }

      protected void c(ash $$0, cjb $$1, long $$2) {
         $$1.go();
      }

      protected void d(ash $$0, cjb $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.gp();
         }
      }
   }

   public static class b extends bxp<cjb> {
      public b(float $$0) {
         super($$0, $$0x -> axw.G);
      }

      protected void a(ash $$0, cjb $$1, long $$2) {
         $$1.gp();
         super.b($$0, $$1, $$2);
      }
   }
}
