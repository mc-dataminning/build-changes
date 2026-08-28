import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class ciy {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bsl h = bsl.a(5, 16);
   private static final ImmutableList<cgi<? extends cgh<? super cix>>> i = ImmutableList.of(cgi.c, cgi.f, cgi.u, cgi.o, cgi.k);
   private static final ImmutableList<cfb<?>> j = ImmutableList.of(
      cfb.Z, cfb.x, cfb.y, cfb.m, cfb.n, cfb.E, cfb.t, cfb.h, cfb.O, cfb.P, cfb.Q, cfb.R, new cfb[]{cfb.r, cfb.K, cfb.G}
   );
   private static final bzb<cix> k = cbd.a(
      (Function<cbd.b<cix>, ? extends App<cbd.c<cix>, cbg<cix>>>)($$0 -> $$0.group($$0.c(cfb.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gr();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bwz.b<cix> a() {
      return bwz.a(j, i);
   }

   protected static bwz<?> a(bwz<cix> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwz<cix> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new cak(0.8F), new ciy.b(2.0F), new byw(45, 90), new bza() {
         @Override
         protected boolean a(arx $$0, bvz $$1) {
            if ($$1 instanceof cix $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bxw(cfb.P), new bxw(cfb.Q), k));
   }

   private static void c(bwz<cix> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, bzq.a(bvi.bS, 6.0F, bsl.a(30, 60))),
            Pair.of(1, new bxk(bvi.e, 1.0F, 1)),
            Pair.of(2, new bzn(ImmutableList.of(Pair.of(new byd($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bxn.a(h, 1.25F), 1)))),
            Pair.of(3, new bzh(bsl.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bzn(ImmutableMap.of(cfb.m, cfc.b), ImmutableList.of(Pair.of(bzi.a(1.0F), 1), Pair.of(bzx.a(1.0F, 3), 1), Pair.of(new bya(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bwz<cix> $$0) {
      $$0.a(crf.g, ImmutableList.of(Pair.of(0, new ciy.a())), Set.of(Pair.of(cfb.G, cfc.a), Pair.of(cfb.Z, cfc.b)));
   }

   public static void a(cix $$0) {
      $$0.ec().a(ImmutableList.of(crf.g, crf.b));
   }

   public static Predicate<cxg> b() {
      return $$0 -> $$0.a(axt.an);
   }

   public static class a extends bxq<cix> {
      static final int c = 5 * baw.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arx $$0, cix $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.go()) {
            $$1.a(cix.a.c);
            if ($$1.aJ()) {
               $$1.a(awv.aj);
            }
         } else {
            cix.a $$3 = $$1.gp();
            long $$4 = $$1.ec().e(cfb.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cix.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cix.a.d.b()) {
                  $$1.a(awv.an);
                  $$1.a(cix.a.d);
               }
            } else if ($$3 == cix.a.d && $$4 > (long)cix.a.d.b()) {
               $$1.a(cix.a.c);
            }
         }
      }

      private int a(cix $$0) {
         return cix.a.c.b() + $$0.dZ().a(100, 400);
      }

      protected boolean a(arx $$0, cix $$1) {
         return $$1.aJ();
      }

      protected boolean b(arx $$0, cix $$1, long $$2) {
         return $$1.gp().a();
      }

      protected void c(arx $$0, cix $$1, long $$2) {
         $$1.gq();
      }

      protected void d(arx $$0, cix $$1, long $$2) {
         if (!$$1.gA()) {
            $$1.gr();
         }
      }
   }

   public static class b extends bxl<cix> {
      public b(float $$0) {
         super($$0, $$0x -> axm.G);
      }

      protected void a(arx $$0, cix $$1, long $$2) {
         $$1.gr();
         super.b($$0, $$1, $$2);
      }
   }
}
