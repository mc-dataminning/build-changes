import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class ckh {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final btm h = btm.a(5, 16);
   private static final ImmutableList<chl<? extends chk<? super ckg>>> i = ImmutableList.of(chl.c, chl.f, chl.u, chl.o, chl.k);
   private static final ImmutableList<cge<?>> j = ImmutableList.of(
      cge.aa, cge.y, cge.z, cge.n, cge.o, cge.F, cge.u, cge.h, cge.P, cge.Q, cge.R, cge.S, new cge[]{cge.s, cge.L, cge.H}
   );
   private static final cae<ckg> k = ccg.a(
      (Function<ccg.b<ckg>, ? extends App<ccg.c<ckg>, ccj<ckg>>>)($$0 -> $$0.group($$0.c(cge.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gt();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static byc.b<ckg> a() {
      return byc.a(j, i);
   }

   protected static byc<?> a(byc<ckg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byc<ckg> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new cbn(0.8F), new ckh.b(2.0F), new bzz(45, 90), new cad() {
         @Override
         protected boolean a(arq $$0, bxe $$1) {
            if ($$1 instanceof ckg $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new byz(cge.Q), new byz(cge.R), k));
   }

   private static void c(byc<ckg> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, cat.a(bwm.bS, 6.0F, btm.a(30, 60))),
            Pair.of(1, new byn(bwm.e, 1.0F, 1)),
            Pair.of(2, new caq(ImmutableList.of(Pair.of(new bzg($$0x -> 1.25F, $$0x -> $$0x.n_() ? 1.0 : 2.0), 1), Pair.of(byq.a(h, 1.25F), 1)))),
            Pair.of(3, new cak(btm.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new caq(ImmutableMap.of(cge.n, cgf.b), ImmutableList.of(Pair.of(cal.a(1.0F), 1), Pair.of(cba.a(1.0F, 3), 1), Pair.of(new bzd(30, 60), 1)))
            )
         )
      );
   }

   private static void d(byc<ckg> $$0) {
      $$0.a(csr.g, ImmutableList.of(Pair.of(0, new ckh.a())), Set.of(Pair.of(cge.H, cgf.a), Pair.of(cge.aa, cgf.b)));
   }

   public static void a(ckg $$0) {
      $$0.eb().a(ImmutableList.of(csr.g, csr.b));
   }

   public static Predicate<cyy> b() {
      return $$0 -> $$0.a(axk.al);
   }

   public static class a extends byt<ckg> {
      static final int c = 5 * baq.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arq $$0, ckg $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gq()) {
            $$1.a(ckg.a.c);
            if ($$1.aJ()) {
               $$1.a(awn.aj);
            }
         } else {
            ckg.a $$3 = $$1.gr();
            long $$4 = $$1.eb().e(cge.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == ckg.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)ckg.a.d.b()) {
                  $$1.a(awn.an);
                  $$1.a(ckg.a.d);
               }
            } else if ($$3 == ckg.a.d && $$4 > (long)ckg.a.d.b()) {
               $$1.a(ckg.a.c);
            }
         }
      }

      private int a(ckg $$0) {
         return ckg.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(arq $$0, ckg $$1) {
         return $$1.aJ();
      }

      protected boolean b(arq $$0, ckg $$1, long $$2) {
         return $$1.gr().a();
      }

      protected void c(arq $$0, ckg $$1, long $$2) {
         $$1.gs();
      }

      protected void d(arq $$0, ckg $$1, long $$2) {
         if (!$$1.gC()) {
            $$1.gt();
         }
      }
   }

   public static class b extends byo<ckg> {
      public b(float $$0) {
         super($$0, $$0x -> axd.G);
      }

      protected void a(arq $$0, ckg $$1, long $$2) {
         $$1.gt();
         super.b($$0, $$1, $$2);
      }
   }
}
