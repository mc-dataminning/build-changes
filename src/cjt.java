import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cjt {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final btb h = btb.a(5, 16);
   private static final ImmutableList<cha<? extends cgz<? super cjs>>> i = ImmutableList.of(cha.c, cha.f, cha.u, cha.o, cha.k);
   private static final ImmutableList<cft<?>> j = ImmutableList.of(
      cft.aa, cft.y, cft.z, cft.n, cft.o, cft.F, cft.u, cft.h, cft.P, cft.Q, cft.R, cft.S, new cft[]{cft.s, cft.L, cft.H}
   );
   private static final bzt<cjs> k = cbv.a(
      (Function<cbv.b<cjs>, ? extends App<cbv.c<cjs>, cby<cjs>>>)($$0 -> $$0.group($$0.c(cft.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gt();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bxr.b<cjs> a() {
      return bxr.a(j, i);
   }

   protected static bxr<?> a(bxr<cjs> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxr<cjs> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new cbc(0.8F), new cjt.b(2.0F), new bzo(45, 90), new bzs() {
         @Override
         protected boolean a(arn $$0, bwt $$1) {
            if ($$1 instanceof cjs $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new byo(cft.Q), new byo(cft.R), k));
   }

   private static void c(bxr<cjs> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, cai.a(bwb.bR, 6.0F, btb.a(30, 60))),
            Pair.of(1, new byc(bwb.e, 1.0F, 1)),
            Pair.of(2, new caf(ImmutableList.of(Pair.of(new byv($$0x -> 1.25F, $$0x -> $$0x.n_() ? 1.0 : 2.0), 1), Pair.of(byf.a(h, 1.25F), 1)))),
            Pair.of(3, new bzz(btb.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new caf(ImmutableMap.of(cft.n, cfu.b), ImmutableList.of(Pair.of(caa.a(1.0F), 1), Pair.of(cap.a(1.0F, 3), 1), Pair.of(new bys(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bxr<cjs> $$0) {
      $$0.a(crz.g, ImmutableList.of(Pair.of(0, new cjt.a())), Set.of(Pair.of(cft.H, cfu.a), Pair.of(cft.aa, cfu.b)));
   }

   public static void a(cjs $$0) {
      $$0.eb().a(ImmutableList.of(crz.g, crz.b));
   }

   public static Predicate<cxy> b() {
      return $$0 -> $$0.a(axi.al);
   }

   public static class a extends byi<cjs> {
      static final int c = 5 * bam.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arn $$0, cjs $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(cjs.a.c);
            if ($$1.aJ()) {
               $$1.a(awk.aj);
            }
         } else {
            cjs.a $$3 = $$1.gr();
            long $$4 = $$1.eb().e(cft.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cjs.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cjs.a.d.b()) {
                  $$1.a(awk.an);
                  $$1.a(cjs.a.d);
               }
            } else if ($$3 == cjs.a.d && $$4 > (long)cjs.a.d.b()) {
               $$1.a(cjs.a.c);
            }
         }
      }

      private int a(cjs $$0) {
         return cjs.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(arn $$0, cjs $$1) {
         return $$1.aJ();
      }

      protected boolean b(arn $$0, cjs $$1, long $$2) {
         return $$1.gr().a();
      }

      protected void c(arn $$0, cjs $$1, long $$2) {
         $$1.gs();
      }

      protected void d(arn $$0, cjs $$1, long $$2) {
         if (!$$1.gC()) {
            $$1.gt();
         }
      }
   }

   public static class b extends byd<cjs> {
      public b(float $$0) {
         super($$0, $$0x -> axb.G);
      }

      protected void a(arn $$0, cjs $$1, long $$2) {
         $$1.gt();
         super.b($$0, $$1, $$2);
      }
   }
}
