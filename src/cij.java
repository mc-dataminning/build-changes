import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cij {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final brw h = brw.a(5, 16);
   private static final ImmutableList<cft<? extends cfs<? super cii>>> i = ImmutableList.of(cft.c, cft.f, cft.u, cft.o, cft.k);
   private static final ImmutableList<cem<?>> j = ImmutableList.of(
      cem.Z, cem.x, cem.y, cem.m, cem.n, cem.E, cem.t, cem.h, cem.O, cem.P, cem.Q, cem.R, new cem[]{cem.r, cem.K, cem.G}
   );
   private static final bym<cii> k = cao.a(
      (Function<cao.b<cii>, ? extends App<cao.c<cii>, car<cii>>>)($$0 -> $$0.group($$0.c(cem.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gv();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bwk.b<cii> a() {
      return bwk.a(j, i);
   }

   protected static bwk<?> a(bwk<cii> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwk<cii> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bzv(0.8F), new cij.b(2.0F), new byh(45, 90), new byl() {
         @Override
         protected boolean a(ard $$0, bvk $$1) {
            if ($$1 instanceof cii $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bxh(cem.P), new bxh(cem.Q), k));
   }

   private static void c(bwk<cii> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, bzb.a(but.bR, 6.0F, brw.a(30, 60))),
            Pair.of(1, new bwv(but.e, 1.0F, 1)),
            Pair.of(2, new byy(ImmutableList.of(Pair.of(new bxo($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bwy.a(h, 1.25F), 1)))),
            Pair.of(3, new bys(brw.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new byy(ImmutableMap.of(cem.m, cen.b), ImmutableList.of(Pair.of(byt.a(1.0F), 1), Pair.of(bzi.a(1.0F, 3), 1), Pair.of(new bxl(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bwk<cii> $$0) {
      $$0.a(cqp.g, ImmutableList.of(Pair.of(0, new cij.a())), Set.of(Pair.of(cem.G, cen.a), Pair.of(cem.Z, cen.b)));
   }

   public static void a(cii $$0) {
      $$0.eb().a(ImmutableList.of(cqp.g, cqp.b));
   }

   public static Predicate<cwq> b() {
      return $$0 -> $$0.a(awy.al);
   }

   public static class a extends bxb<cii> {
      static final int c = 5 * bab.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(ard $$0, cii $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gs()) {
            $$1.a(cii.a.c);
            if ($$1.aJ()) {
               $$1.a(awa.aj);
            }
         } else {
            cii.a $$3 = $$1.gt();
            long $$4 = $$1.eb().e(cem.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cii.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cii.a.d.b()) {
                  $$1.a(awa.an);
                  $$1.a(cii.a.d);
               }
            } else if ($$3 == cii.a.d && $$4 > (long)cii.a.d.b()) {
               $$1.a(cii.a.c);
            }
         }
      }

      private int a(cii $$0) {
         return cii.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(ard $$0, cii $$1) {
         return $$1.aJ();
      }

      protected boolean b(ard $$0, cii $$1, long $$2) {
         return $$1.gt().a();
      }

      protected void c(ard $$0, cii $$1, long $$2) {
         $$1.gu();
      }

      protected void d(ard $$0, cii $$1, long $$2) {
         if (!$$1.gE()) {
            $$1.gv();
         }
      }
   }

   public static class b extends bww<cii> {
      public b(float $$0) {
         super($$0, $$0x -> awr.G);
      }

      protected void a(ard $$0, cii $$1, long $$2) {
         $$1.gv();
         super.b($$0, $$1, $$2);
      }
   }
}
