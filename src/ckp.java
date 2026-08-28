import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class ckp {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final btr h = btr.a(5, 16);
   private static final ImmutableList<chs<? extends chr<? super cko>>> i = ImmutableList.of(chs.c, chs.f, chs.u, chs.o, chs.k);
   private static final ImmutableList<cgl<?>> j = ImmutableList.of(
      cgl.aa, cgl.y, cgl.z, cgl.n, cgl.o, cgl.F, cgl.u, cgl.h, cgl.P, cgl.Q, cgl.R, cgl.S, new cgl[]{cgl.s, cgl.L, cgl.H}
   );
   private static final cal<cko> k = ccn.a(
      (Function<ccn.b<cko>, ? extends App<ccn.c<cko>, ccq<cko>>>)($$0 -> $$0.group($$0.c(cgl.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gw();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static byj.b<cko> a() {
      return byj.a(j, i);
   }

   protected static byj<?> a(byj<cko> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ctd.a));
      $$0.b(ctd.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<cko> $$0) {
      $$0.a(ctd.a, 0, ImmutableList.of(new cbu(0.8F), new ckp.b(2.0F), new cag(45, 90), new cak() {
         @Override
         protected boolean a(arq $$0, bxl $$1) {
            if ($$1 instanceof cko $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bzg(cgl.Q), new bzg(cgl.R), k));
   }

   private static void c(byj<cko> $$0) {
      $$0.a(
         ctd.b,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(1, new byu(bwr.e, 1.0F, 1)),
            Pair.of(2, new cax(ImmutableList.of(Pair.of(new bzn($$0x -> 1.25F, $$0x -> $$0x.n_() ? 1.0 : 2.0), 1), Pair.of(byx.a(h, 1.25F), 1)))),
            Pair.of(3, new car(btr.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new cax(ImmutableMap.of(cgl.n, cgm.b), ImmutableList.of(Pair.of(cas.a(1.0F), 1), Pair.of(cbh.a(1.0F, 3), 1), Pair.of(new bzk(30, 60), 1)))
            )
         )
      );
   }

   private static void d(byj<cko> $$0) {
      $$0.a(ctd.g, ImmutableList.of(Pair.of(0, new ckp.a())), Set.of(Pair.of(cgl.H, cgm.a), Pair.of(cgl.aa, cgm.b)));
   }

   public static void a(cko $$0) {
      $$0.eb().a(ImmutableList.of(ctd.g, ctd.b));
   }

   public static Predicate<czk> b() {
      return $$0 -> $$0.a(axk.am);
   }

   public static class a extends bza<cko> {
      static final int c = 5 * baq.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arq $$0, cko $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gt()) {
            $$1.a(cko.a.c);
            if ($$1.aH()) {
               $$1.a(awn.aj);
            }
         } else {
            cko.a $$3 = $$1.gu();
            long $$4 = $$1.eb().e(cgl.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cko.a.c) {
               if (this.f == 0 && $$1.aH() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cko.a.d.b()) {
                  $$1.a(awn.an);
                  $$1.a(cko.a.d);
               }
            } else if ($$3 == cko.a.d && $$4 > (long)cko.a.d.b()) {
               $$1.a(cko.a.c);
            }
         }
      }

      private int a(cko $$0) {
         return cko.a.c.b() + $$0.dX().a(100, 400);
      }

      protected boolean a(arq $$0, cko $$1) {
         return $$1.aH();
      }

      protected boolean b(arq $$0, cko $$1, long $$2) {
         return $$1.gu().a();
      }

      protected void c(arq $$0, cko $$1, long $$2) {
         $$1.gv();
      }

      protected void d(arq $$0, cko $$1, long $$2) {
         if (!$$1.gF()) {
            $$1.gw();
         }
      }
   }

   public static class b extends byv<cko> {
      public b(float $$0) {
         super($$0, $$0x -> axd.G);
      }

      protected void a(arq $$0, cko $$1, long $$2) {
         $$1.gw();
         super.b($$0, $$1, $$2);
      }
   }
}
