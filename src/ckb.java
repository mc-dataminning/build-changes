import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class ckb {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final btj h = btj.a(5, 16);
   private static final ImmutableList<chi<? extends chh<? super cka>>> i = ImmutableList.of(chi.c, chi.f, chi.u, chi.o, chi.k);
   private static final ImmutableList<cgb<?>> j = ImmutableList.of(
      cgb.aa, cgb.y, cgb.z, cgb.n, cgb.o, cgb.F, cgb.u, cgb.h, cgb.P, cgb.Q, cgb.R, cgb.S, new cgb[]{cgb.s, cgb.L, cgb.H}
   );
   private static final cab<cka> k = ccd.a(
      (Function<ccd.b<cka>, ? extends App<ccd.c<cka>, ccg<cka>>>)($$0 -> $$0.group($$0.c(cgb.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gt();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bxz.b<cka> a() {
      return bxz.a(j, i);
   }

   protected static bxz<?> a(bxz<cka> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxz<cka> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new cbk(0.8F), new ckb.b(2.0F), new bzw(45, 90), new caa() {
         @Override
         protected boolean a(aro $$0, bxb $$1) {
            if ($$1 instanceof cka $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new byw(cgb.Q), new byw(cgb.R), k));
   }

   private static void c(bxz<cka> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, caq.a(bwj.bS, 6.0F, btj.a(30, 60))),
            Pair.of(1, new byk(bwj.e, 1.0F, 1)),
            Pair.of(2, new can(ImmutableList.of(Pair.of(new bzd($$0x -> 1.25F, $$0x -> $$0x.n_() ? 1.0 : 2.0), 1), Pair.of(byn.a(h, 1.25F), 1)))),
            Pair.of(3, new cah(btj.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new can(ImmutableMap.of(cgb.n, cgc.b), ImmutableList.of(Pair.of(cai.a(1.0F), 1), Pair.of(cax.a(1.0F, 3), 1), Pair.of(new bza(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bxz<cka> $$0) {
      $$0.a(csl.g, ImmutableList.of(Pair.of(0, new ckb.a())), Set.of(Pair.of(cgb.H, cgc.a), Pair.of(cgb.aa, cgc.b)));
   }

   public static void a(cka $$0) {
      $$0.eb().a(ImmutableList.of(csl.g, csl.b));
   }

   public static Predicate<cys> b() {
      return $$0 -> $$0.a(axi.al);
   }

   public static class a extends byq<cka> {
      static final int c = 5 * bao.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aro $$0, cka $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(cka.a.c);
            if ($$1.aJ()) {
               $$1.a(awl.aj);
            }
         } else {
            cka.a $$3 = $$1.gr();
            long $$4 = $$1.eb().e(cgb.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cka.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cka.a.d.b()) {
                  $$1.a(awl.an);
                  $$1.a(cka.a.d);
               }
            } else if ($$3 == cka.a.d && $$4 > (long)cka.a.d.b()) {
               $$1.a(cka.a.c);
            }
         }
      }

      private int a(cka $$0) {
         return cka.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(aro $$0, cka $$1) {
         return $$1.aJ();
      }

      protected boolean b(aro $$0, cka $$1, long $$2) {
         return $$1.gr().a();
      }

      protected void c(aro $$0, cka $$1, long $$2) {
         $$1.gs();
      }

      protected void d(aro $$0, cka $$1, long $$2) {
         if (!$$1.gC()) {
            $$1.gt();
         }
      }
   }

   public static class b extends byl<cka> {
      public b(float $$0) {
         super($$0, $$0x -> axb.G);
      }

      protected void a(aro $$0, cka $$1, long $$2) {
         $$1.gt();
         super.b($$0, $$1, $$2);
      }
   }
}
