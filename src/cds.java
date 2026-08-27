import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class cds {
   public static final cvp a = cvp.a(crv.sl);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.25F;
   private static final float f = 1.0F;
   private static final double g = 2.0;
   private static final double h = 1.0;
   private static final bnq i = bnq.a(5, 16);
   private static final ImmutableList<cbd<? extends cbc<? super cdr>>> j = ImmutableList.of(cbd.c, cbd.f, cbd.u, cbd.o, cbd.k);
   private static final ImmutableList<bzw<?>> k = ImmutableList.of(
      bzw.Z, bzw.x, bzw.y, bzw.m, bzw.n, bzw.E, bzw.t, bzw.h, bzw.O, bzw.P, bzw.Q, bzw.R, new bzw[]{bzw.r, bzw.K, bzw.G}
   );
   private static final btw<cdr> l = bvy.a(
      (Function<bvy.b<cdr>, ? extends App<bvy.c<cdr>, bwb<cdr>>>)($$0 -> $$0.group($$0.c(bzw.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gv();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bru.b<cdr> a() {
      return bru.a(k, j);
   }

   protected static bru<?> a(bru<cdr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cdr> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bvf(0.8F), new cds.b(2.0F), new btr(45, 90), new btv() {
         @Override
         protected boolean a(apu $$0, bqv $$1) {
            if ($$1 instanceof cdr $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bsr(bzw.P), new bsr(bzw.Q), l));
   }

   private static void c(bru<cdr> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, bul.a(bqg.bx, 6.0F, bnq.a(30, 60))),
            Pair.of(1, new bsf(bqg.c, 1.0F, 1)),
            Pair.of(2, new bui(ImmutableList.of(Pair.of(new bsy($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bsi.a(i, 1.25F), 1)))),
            Pair.of(3, new buc(bnq.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bui(ImmutableMap.of(bzw.m, bzx.b), ImmutableList.of(Pair.of(bud.a(1.0F), 1), Pair.of(bus.a(1.0F, 3), 1), Pair.of(new bsv(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bru<cdr> $$0) {
      $$0.a(clp.g, ImmutableList.of(Pair.of(0, new cds.a())), Set.of(Pair.of(bzw.G, bzx.a), Pair.of(bzw.Z, bzx.b)));
   }

   public static void a(cdr $$0) {
      $$0.dP().a(ImmutableList.of(clp.g, clp.b));
   }

   public static cvp b() {
      return a;
   }

   public static class a extends bsl<cdr> {
      static final int c = 5 * ayl.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(apu $$0, cdr $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gn()) {
            $$1.a(cdr.a.c);
            if ($$1.aC()) {
               $$1.a(auo.aj);
            }
         } else {
            cdr.a $$3 = $$1.gt();
            long $$4 = $$1.dP().e(bzw.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cdr.a.c) {
               if (this.f == 0 && $$1.aC() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cdr.a.d.b()) {
                  $$1.a(auo.an);
                  $$1.a(cdr.a.d);
               }
            } else if ($$3 == cdr.a.d && $$4 > (long)cdr.a.d.b()) {
               $$1.a(cdr.a.c);
            }
         }
      }

      private int a(cdr $$0) {
         return cdr.a.c.b() + $$0.ei().a(100, 400);
      }

      protected boolean a(apu $$0, cdr $$1) {
         return $$1.aC();
      }

      protected boolean b(apu $$0, cdr $$1, long $$2) {
         return $$1.gt().a();
      }

      protected void c(apu $$0, cdr $$1, long $$2) {
         $$1.gu();
      }

      protected void d(apu $$0, cdr $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.gv();
         }
      }
   }

   public static class b extends bsg<cdr> {
      public b(float $$0) {
         super($$0, cdr::gw);
      }

      protected void a(apu $$0, cdr $$1, long $$2) {
         $$1.gv();
         super.b($$0, $$1, $$2);
      }
   }
}
