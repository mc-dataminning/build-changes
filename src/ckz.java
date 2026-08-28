import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class ckz {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bue h = bue.a(5, 16);
   private static final ImmutableList<cif<? extends cie<? super cky>>> i = ImmutableList.of(cif.c, cif.f, cif.u, cif.o, cif.k);
   private static final ImmutableList<cgy<?>> j = ImmutableList.of(
      cgy.aa, cgy.y, cgy.z, cgy.n, cgy.o, cgy.F, cgy.u, cgy.h, cgy.P, cgy.Q, cgy.R, cgy.S, new cgy[]{cgy.s, cgy.L, cgy.H}
   );
   private static final cay<cky> k = cda.a(
      (Function<cda.b<cky>, ? extends App<cda.c<cky>, cdd<cky>>>)($$0 -> $$0.group($$0.c(cgy.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gx();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static byw.b<cky> a() {
      return byw.a(j, i);
   }

   protected static byw<?> a(byw<cky> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   private static void b(byw<cky> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cch(0.8F), new ckz.b(2.0F), new cat(45, 90), new cax() {
         @Override
         protected boolean a(aru $$0, bxy $$1) {
            if ($$1 instanceof cky $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bzt(cgy.Q), new bzt(cgy.R), k));
   }

   private static void c(byw<cky> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, cbn.a(bxe.bT, 6.0F, bue.a(30, 60))),
            Pair.of(1, new bzh(bxe.f, 1.0F, 1)),
            Pair.of(2, new cbk(ImmutableList.of(Pair.of(new caa($$0x -> 1.25F, $$0x -> $$0x.n_() ? 1.0 : 2.0), 1), Pair.of(bzk.a(h, 1.25F), 1)))),
            Pair.of(3, new cbe(bue.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new cbk(ImmutableMap.of(cgy.n, cgz.b), ImmutableList.of(Pair.of(cbf.a(1.0F), 1), Pair.of(cbu.a(1.0F, 3), 1), Pair.of(new bzx(30, 60), 1)))
            )
         )
      );
   }

   private static void d(byw<cky> $$0) {
      $$0.a(ctt.g, ImmutableList.of(Pair.of(0, new ckz.a())), Set.of(Pair.of(cgy.H, cgz.a), Pair.of(cgy.aa, cgz.b)));
   }

   public static void a(cky $$0) {
      $$0.ec().a(ImmutableList.of(ctt.g, ctt.b));
   }

   public static Predicate<daa> b() {
      return $$0 -> $$0.a(axo.an);
   }

   public static class a extends bzn<cky> {
      static final int c = 5 * bau.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aru $$0, cky $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gu()) {
            $$1.a(cky.a.c);
            if ($$1.aH()) {
               $$1.a(awr.aj);
            }
         } else {
            cky.a $$3 = $$1.gv();
            long $$4 = $$1.ec().e(cgy.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cky.a.c) {
               if (this.f == 0 && $$1.aH() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cky.a.d.b()) {
                  $$1.a(awr.an);
                  $$1.a(cky.a.d);
               }
            } else if ($$3 == cky.a.d && $$4 > (long)cky.a.d.b()) {
               $$1.a(cky.a.c);
            }
         }
      }

      private int a(cky $$0) {
         return cky.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(aru $$0, cky $$1) {
         return $$1.aH();
      }

      protected boolean b(aru $$0, cky $$1, long $$2) {
         return $$1.gv().a();
      }

      protected void c(aru $$0, cky $$1, long $$2) {
         $$1.gw();
      }

      protected void d(aru $$0, cky $$1, long $$2) {
         if (!$$1.gG()) {
            $$1.gx();
         }
      }
   }

   public static class b extends bzi<cky> {
      public b(float $$0) {
         super($$0, $$0x -> axh.G);
      }

      protected void a(aru $$0, cky $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }
}
