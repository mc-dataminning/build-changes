import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class chk {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bra h = bra.a(5, 16);
   private static final ImmutableList<ceu<? extends cet<? super chj>>> i = ImmutableList.of(ceu.c, ceu.f, ceu.u, ceu.o, ceu.k);
   private static final ImmutableList<cdn<?>> j = ImmutableList.of(
      cdn.Z, cdn.x, cdn.y, cdn.m, cdn.n, cdn.E, cdn.t, cdn.h, cdn.O, cdn.P, cdn.Q, cdn.R, new cdn[]{cdn.r, cdn.K, cdn.G}
   );
   private static final bxn<chj> k = bzp.a(
      (Function<bzp.b<chj>, ? extends App<bzp.c<chj>, bzs<chj>>>)($$0 -> $$0.group($$0.c(cdn.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gs();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bvl.b<chj> a() {
      return bvl.a(j, i);
   }

   protected static bvl<?> a(bvl<chj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvl<chj> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new byw(0.8F), new chk.b(2.0F), new bxi(45, 90), new bxm() {
         @Override
         protected boolean a(arh $$0, bum $$1) {
            if ($$1 instanceof chj $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bwi(cdn.P), new bwi(cdn.Q), k));
   }

   private static void c(bvl<chj> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, byc.a(btv.by, 6.0F, bra.a(30, 60))),
            Pair.of(1, new bvw(btv.c, 1.0F, 1)),
            Pair.of(2, new bxz(ImmutableList.of(Pair.of(new bwp($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(bvz.a(h, 1.25F), 1)))),
            Pair.of(3, new bxt(bra.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxz(ImmutableMap.of(cdn.m, cdo.b), ImmutableList.of(Pair.of(bxu.a(1.0F), 1), Pair.of(byj.a(1.0F, 3), 1), Pair.of(new bwm(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bvl<chj> $$0) {
      $$0.a(cpm.g, ImmutableList.of(Pair.of(0, new chk.a())), Set.of(Pair.of(cdn.G, cdo.a), Pair.of(cdn.Z, cdo.b)));
   }

   public static void a(chj $$0) {
      $$0.dX().a(ImmutableList.of(cpm.g, cpm.b));
   }

   public static Predicate<cvp> b() {
      return $$0 -> $$0.a(axc.ai);
   }

   public static class a extends bwc<chj> {
      static final int c = 5 * bae.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arh $$0, chj $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gp()) {
            $$1.a(chj.a.c);
            if ($$1.aH()) {
               $$1.a(awe.aj);
            }
         } else {
            chj.a $$3 = $$1.gq();
            long $$4 = $$1.dX().e(cdn.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == chj.a.c) {
               if (this.f == 0 && $$1.aH() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)chj.a.d.b()) {
                  $$1.a(awe.an);
                  $$1.a(chj.a.d);
               }
            } else if ($$3 == chj.a.d && $$4 > (long)chj.a.d.b()) {
               $$1.a(chj.a.c);
            }
         }
      }

      private int a(chj $$0) {
         return chj.a.c.b() + $$0.dV().a(100, 400);
      }

      protected boolean a(arh $$0, chj $$1) {
         return $$1.aH();
      }

      protected boolean b(arh $$0, chj $$1, long $$2) {
         return $$1.gq().a();
      }

      protected void c(arh $$0, chj $$1, long $$2) {
         $$1.gr();
      }

      protected void d(arh $$0, chj $$1, long $$2) {
         if (!$$1.gB()) {
            $$1.gs();
         }
      }
   }

   public static class b extends bvx<chj> {
      public b(float $$0) {
         super($$0, $$0x -> awv.G);
      }

      protected void a(arh $$0, chj $$1, long $$2) {
         $$1.gs();
         super.b($$0, $$1, $$2);
      }
   }
}
