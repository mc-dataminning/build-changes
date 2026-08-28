import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cli {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bun h = bun.a(5, 16);
   private static final ImmutableList<cio<? extends cin<? super clh>>> i = ImmutableList.of(cio.c, cio.f, cio.u, cio.o, cio.k);
   private static final ImmutableList<chh<?>> j = ImmutableList.of(
      chh.aa, chh.y, chh.z, chh.n, chh.o, chh.F, chh.u, chh.h, chh.P, chh.Q, chh.R, chh.S, new chh[]{chh.s, chh.L, chh.H}
   );
   private static final cbh<clh> k = cdj.a(
      (Function<cdj.b<clh>, ? extends App<cdj.c<clh>, cdm<clh>>>)($$0 -> $$0.group($$0.c(chh.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.p()) {
                  $$1.gx();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bzf.b<clh> a() {
      return bzf.a(j, i);
   }

   protected static bzf<?> a(bzf<clh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bzf<clh> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new ccq(0.8F), new cli.b(2.0F), new cbc(45, 90), new cbg() {
         @Override
         protected boolean a(asb $$0, byh $$1) {
            if ($$1 instanceof clh $$2 && $$2.p()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new cac(chh.Q), new cac(chh.R), k));
   }

   private static void c(bzf<clh> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, cbw.a(bxn.bT, 6.0F, bun.a(30, 60))),
            Pair.of(1, new bzq(bxn.f, 1.0F, 1)),
            Pair.of(2, new cbt(ImmutableList.of(Pair.of(new caj($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bzt.a(h, 1.25F), 1)))),
            Pair.of(3, new cbn(bun.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new cbt(ImmutableMap.of(chh.n, chi.b), ImmutableList.of(Pair.of(cbo.a(1.0F), 1), Pair.of(ccd.a(1.0F, 3), 1), Pair.of(new cag(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bzf<clh> $$0) {
      $$0.a(cuc.g, ImmutableList.of(Pair.of(0, new cli.a())), Set.of(Pair.of(chh.H, chi.a), Pair.of(chh.aa, chi.b)));
   }

   public static void a(clh $$0) {
      $$0.ec().a(ImmutableList.of(cuc.g, cuc.b));
   }

   public static Predicate<dak> b() {
      return $$0 -> $$0.a(axv.an);
   }

   public static class a extends bzw<clh> {
      static final int c = 5 * bbd.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(asb $$0, clh $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gu()) {
            $$1.a(clh.a.c);
            if ($$1.aH()) {
               $$1.a(awy.aj);
            }
         } else {
            clh.a $$3 = $$1.gv();
            long $$4 = $$1.ec().e(chh.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == clh.a.c) {
               if (this.f == 0 && $$1.aH() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)clh.a.d.b()) {
                  $$1.a(awy.an);
                  $$1.a(clh.a.d);
               }
            } else if ($$3 == clh.a.d && $$4 > (long)clh.a.d.b()) {
               $$1.a(clh.a.c);
            }
         }
      }

      private int a(clh $$0) {
         return clh.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(asb $$0, clh $$1) {
         return $$1.aH();
      }

      protected boolean b(asb $$0, clh $$1, long $$2) {
         return $$1.gv().a();
      }

      protected void c(asb $$0, clh $$1, long $$2) {
         $$1.gw();
      }

      protected void d(asb $$0, clh $$1, long $$2) {
         if (!$$1.gG()) {
            $$1.gx();
         }
      }
   }

   public static class b extends bzr<clh> {
      public b(float $$0) {
         super($$0, $$0x -> axo.G);
      }

      protected void a(asb $$0, clh $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }
}
