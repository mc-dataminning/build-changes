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
   private static final bsj h = bsj.a(5, 16);
   private static final ImmutableList<cgj<? extends cgi<? super cjb>>> i = ImmutableList.of(cgj.c, cgj.f, cgj.u, cgj.o, cgj.k);
   private static final ImmutableList<cfc<?>> j = ImmutableList.of(
      cfc.Z, cfc.x, cfc.y, cfc.m, cfc.n, cfc.E, cfc.t, cfc.h, cfc.O, cfc.P, cfc.Q, cfc.R, new cfc[]{cfc.r, cfc.K, cfc.G}
   );
   private static final bzc<cjb> k = cbe.a(
      (Function<cbe.b<cjb>, ? extends App<cbe.c<cjb>, cbh<cjb>>>)($$0 -> $$0.group($$0.c(cfc.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gv();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bxa.b<cjb> a() {
      return bxa.a(j, i);
   }

   protected static bxa<?> a(bxa<cjb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxa<cjb> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new cal(0.8F), new cjc.b(2.0F), new byx(45, 90), new bzb() {
         @Override
         protected boolean a(ard $$0, bwa $$1) {
            if ($$1 instanceof cjb $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bxx(cfc.P), new bxx(cfc.Q), k));
   }

   private static void c(bxa<cjb> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, bzr.a(bvi.bR, 6.0F, bsj.a(30, 60))),
            Pair.of(1, new bxl(bvi.e, 1.0F, 1)),
            Pair.of(2, new bzo(ImmutableList.of(Pair.of(new bye($$0x -> 1.25F, $$0x -> $$0x.n_() ? 1.0 : 2.0), 1), Pair.of(bxo.a(h, 1.25F), 1)))),
            Pair.of(3, new bzi(bsj.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bzo(ImmutableMap.of(cfc.m, cfd.b), ImmutableList.of(Pair.of(bzj.a(1.0F), 1), Pair.of(bzy.a(1.0F, 3), 1), Pair.of(new byb(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bxa<cjb> $$0) {
      $$0.a(cri.g, ImmutableList.of(Pair.of(0, new cjc.a())), Set.of(Pair.of(cfc.G, cfd.a), Pair.of(cfc.Z, cfd.b)));
   }

   public static void a(cjb $$0) {
      $$0.ea().a(ImmutableList.of(cri.g, cri.b));
   }

   public static Predicate<cxh> b() {
      return $$0 -> $$0.a(awy.al);
   }

   public static class a extends bxr<cjb> {
      static final int c = 5 * bab.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(ard $$0, cjb $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gs()) {
            $$1.a(cjb.a.c);
            if ($$1.aJ()) {
               $$1.a(awa.aj);
            }
         } else {
            cjb.a $$3 = $$1.gt();
            long $$4 = $$1.ea().e(cfc.G);
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
                  $$1.a(awa.an);
                  $$1.a(cjb.a.d);
               }
            } else if ($$3 == cjb.a.d && $$4 > (long)cjb.a.d.b()) {
               $$1.a(cjb.a.c);
            }
         }
      }

      private int a(cjb $$0) {
         return cjb.a.c.b() + $$0.dX().a(100, 400);
      }

      protected boolean a(ard $$0, cjb $$1) {
         return $$1.aJ();
      }

      protected boolean b(ard $$0, cjb $$1, long $$2) {
         return $$1.gt().a();
      }

      protected void c(ard $$0, cjb $$1, long $$2) {
         $$1.gu();
      }

      protected void d(ard $$0, cjb $$1, long $$2) {
         if (!$$1.gE()) {
            $$1.gv();
         }
      }
   }

   public static class b extends bxm<cjb> {
      public b(float $$0) {
         super($$0, $$0x -> awr.G);
      }

      protected void a(ard $$0, cjb $$1, long $$2) {
         $$1.gv();
         super.b($$0, $$1, $$2);
      }
   }
}
