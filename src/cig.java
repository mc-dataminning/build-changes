import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cig {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final brt h = brt.a(5, 16);
   private static final ImmutableList<cfq<? extends cfp<? super cif>>> i = ImmutableList.of(cfq.c, cfq.f, cfq.u, cfq.o, cfq.k);
   private static final ImmutableList<cej<?>> j = ImmutableList.of(
      cej.Z, cej.x, cej.y, cej.m, cej.n, cej.E, cej.t, cej.h, cej.O, cej.P, cej.Q, cej.R, new cej[]{cej.r, cej.K, cej.G}
   );
   private static final byj<cif> k = cal.a(
      (Function<cal.b<cif>, ? extends App<cal.c<cif>, cao<cif>>>)($$0 -> $$0.group($$0.c(cej.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gs();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bwh.b<cif> a() {
      return bwh.a(j, i);
   }

   protected static bwh<?> a(bwh<cif> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwh<cif> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bzs(0.8F), new cig.b(2.0F), new bye(45, 90), new byi() {
         @Override
         protected boolean a(arc $$0, bvh $$1) {
            if ($$1 instanceof cif $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bxe(cej.P), new bxe(cej.Q), k));
   }

   private static void c(bwh<cif> $$0) {
      $$0.a(
         cqm.b,
         ImmutableList.of(
            Pair.of(0, byy.a(buq.bR, 6.0F, brt.a(30, 60))),
            Pair.of(1, new bws(buq.e, 1.0F, 1)),
            Pair.of(2, new byv(ImmutableList.of(Pair.of(new bxl($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bwv.a(h, 1.25F), 1)))),
            Pair.of(3, new byp(brt.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new byv(ImmutableMap.of(cej.m, cek.b), ImmutableList.of(Pair.of(byq.a(1.0F), 1), Pair.of(bzf.a(1.0F, 3), 1), Pair.of(new bxi(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bwh<cif> $$0) {
      $$0.a(cqm.g, ImmutableList.of(Pair.of(0, new cig.a())), Set.of(Pair.of(cej.G, cek.a), Pair.of(cej.Z, cek.b)));
   }

   public static void a(cif $$0) {
      $$0.ec().a(ImmutableList.of(cqm.g, cqm.b));
   }

   public static Predicate<cwn> b() {
      return $$0 -> $$0.a(awx.al);
   }

   public static class a extends bwy<cif> {
      static final int c = 5 * baa.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arc $$0, cif $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gp()) {
            $$1.a(cif.a.c);
            if ($$1.aJ()) {
               $$1.a(avz.aj);
            }
         } else {
            cif.a $$3 = $$1.gq();
            long $$4 = $$1.ec().e(cej.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cif.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cif.a.d.b()) {
                  $$1.a(avz.an);
                  $$1.a(cif.a.d);
               }
            } else if ($$3 == cif.a.d && $$4 > (long)cif.a.d.b()) {
               $$1.a(cif.a.c);
            }
         }
      }

      private int a(cif $$0) {
         return cif.a.c.b() + $$0.dZ().a(100, 400);
      }

      protected boolean a(arc $$0, cif $$1) {
         return $$1.aJ();
      }

      protected boolean b(arc $$0, cif $$1, long $$2) {
         return $$1.gq().a();
      }

      protected void c(arc $$0, cif $$1, long $$2) {
         $$1.gr();
      }

      protected void d(arc $$0, cif $$1, long $$2) {
         if (!$$1.gB()) {
            $$1.gs();
         }
      }
   }

   public static class b extends bwt<cif> {
      public b(float $$0) {
         super($$0, $$0x -> awq.G);
      }

      protected void a(arc $$0, cif $$1, long $$2) {
         $$1.gs();
         super.b($$0, $$1, $$2);
      }
   }
}
