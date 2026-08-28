import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cih {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bru h = bru.a(5, 16);
   private static final ImmutableList<cfr<? extends cfq<? super cig>>> i = ImmutableList.of(cfr.c, cfr.f, cfr.u, cfr.o, cfr.k);
   private static final ImmutableList<cek<?>> j = ImmutableList.of(
      cek.Z, cek.x, cek.y, cek.m, cek.n, cek.E, cek.t, cek.h, cek.O, cek.P, cek.Q, cek.R, new cek[]{cek.r, cek.K, cek.G}
   );
   private static final byk<cig> k = cam.a(
      (Function<cam.b<cig>, ? extends App<cam.c<cig>, cap<cig>>>)($$0 -> $$0.group($$0.c(cek.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gv();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bwi.b<cig> a() {
      return bwi.a(j, i);
   }

   protected static bwi<?> a(bwi<cig> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwi<cig> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bzt(0.8F), new cih.b(2.0F), new byf(45, 90), new byj() {
         @Override
         protected boolean a(ard $$0, bvi $$1) {
            if ($$1 instanceof cig $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bxf(cek.P), new bxf(cek.Q), k));
   }

   private static void c(bwi<cig> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, byz.a(bur.bR, 6.0F, bru.a(30, 60))),
            Pair.of(1, new bwt(bur.e, 1.0F, 1)),
            Pair.of(2, new byw(ImmutableList.of(Pair.of(new bxm($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bww.a(h, 1.25F), 1)))),
            Pair.of(3, new byq(bru.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new byw(ImmutableMap.of(cek.m, cel.b), ImmutableList.of(Pair.of(byr.a(1.0F), 1), Pair.of(bzg.a(1.0F, 3), 1), Pair.of(new bxj(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bwi<cig> $$0) {
      $$0.a(cqn.g, ImmutableList.of(Pair.of(0, new cih.a())), Set.of(Pair.of(cek.G, cel.a), Pair.of(cek.Z, cel.b)));
   }

   public static void a(cig $$0) {
      $$0.eb().a(ImmutableList.of(cqn.g, cqn.b));
   }

   public static Predicate<cwo> b() {
      return $$0 -> $$0.a(awy.al);
   }

   public static class a extends bwz<cig> {
      static final int c = 5 * bab.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(ard $$0, cig $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gs()) {
            $$1.a(cig.a.c);
            if ($$1.aJ()) {
               $$1.a(awa.aj);
            }
         } else {
            cig.a $$3 = $$1.gt();
            long $$4 = $$1.eb().e(cek.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cig.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cig.a.d.b()) {
                  $$1.a(awa.an);
                  $$1.a(cig.a.d);
               }
            } else if ($$3 == cig.a.d && $$4 > (long)cig.a.d.b()) {
               $$1.a(cig.a.c);
            }
         }
      }

      private int a(cig $$0) {
         return cig.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(ard $$0, cig $$1) {
         return $$1.aJ();
      }

      protected boolean b(ard $$0, cig $$1, long $$2) {
         return $$1.gt().a();
      }

      protected void c(ard $$0, cig $$1, long $$2) {
         $$1.gu();
      }

      protected void d(ard $$0, cig $$1, long $$2) {
         if (!$$1.gE()) {
            $$1.gv();
         }
      }
   }

   public static class b extends bwu<cig> {
      public b(float $$0) {
         super($$0, $$0x -> awr.G);
      }

      protected void a(ard $$0, cig $$1, long $$2) {
         $$1.gv();
         super.b($$0, $$1, $$2);
      }
   }
}
