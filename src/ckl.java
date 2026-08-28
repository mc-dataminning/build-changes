import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class ckl {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bto h = bto.a(5, 16);
   private static final ImmutableList<chn<? extends chm<? super ckk>>> i = ImmutableList.of(chn.c, chn.f, chn.u, chn.o, chn.k);
   private static final ImmutableList<cgg<?>> j = ImmutableList.of(
      cgg.aa, cgg.y, cgg.z, cgg.n, cgg.o, cgg.F, cgg.u, cgg.h, cgg.P, cgg.Q, cgg.R, cgg.S, new cgg[]{cgg.s, cgg.L, cgg.H}
   );
   private static final cag<ckk> k = cci.a(
      (Function<cci.b<ckk>, ? extends App<cci.c<ckk>, ccl<ckk>>>)($$0 -> $$0.group($$0.c(cgg.H)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gu();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bye.b<ckk> a() {
      return bye.a(j, i);
   }

   protected static bye<?> a(bye<ckk> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bye<ckk> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cbp(0.8F), new ckl.b(2.0F), new cab(45, 90), new caf() {
         @Override
         protected boolean a(arq $$0, bxg $$1) {
            if ($$1 instanceof ckk $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bzb(cgg.Q), new bzb(cgg.R), k));
   }

   private static void c(bye<ckk> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, cav.a(bwo.bS, 6.0F, bto.a(30, 60))),
            Pair.of(1, new byp(bwo.e, 1.0F, 1)),
            Pair.of(2, new cas(ImmutableList.of(Pair.of(new bzi($$0x -> 1.25F, $$0x -> $$0x.n_() ? 1.0 : 2.0), 1), Pair.of(bys.a(h, 1.25F), 1)))),
            Pair.of(3, new cam(bto.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new cas(ImmutableMap.of(cgg.n, cgh.b), ImmutableList.of(Pair.of(can.a(1.0F), 1), Pair.of(cbc.a(1.0F, 3), 1), Pair.of(new bzf(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bye<ckk> $$0) {
      $$0.a(csw.g, ImmutableList.of(Pair.of(0, new ckl.a())), Set.of(Pair.of(cgg.H, cgh.a), Pair.of(cgg.aa, cgh.b)));
   }

   public static void a(ckk $$0) {
      $$0.ec().a(ImmutableList.of(csw.g, csw.b));
   }

   public static Predicate<czd> b() {
      return $$0 -> $$0.a(axk.am);
   }

   public static class a extends byv<ckk> {
      static final int c = 5 * baq.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arq $$0, ckk $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gr()) {
            $$1.a(ckk.a.c);
            if ($$1.aJ()) {
               $$1.a(awn.aj);
            }
         } else {
            ckk.a $$3 = $$1.gs();
            long $$4 = $$1.ec().e(cgg.H);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == ckk.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)ckk.a.d.b()) {
                  $$1.a(awn.an);
                  $$1.a(ckk.a.d);
               }
            } else if ($$3 == ckk.a.d && $$4 > (long)ckk.a.d.b()) {
               $$1.a(ckk.a.c);
            }
         }
      }

      private int a(ckk $$0) {
         return ckk.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(arq $$0, ckk $$1) {
         return $$1.aJ();
      }

      protected boolean b(arq $$0, ckk $$1, long $$2) {
         return $$1.gs().a();
      }

      protected void c(arq $$0, ckk $$1, long $$2) {
         $$1.gt();
      }

      protected void d(arq $$0, ckk $$1, long $$2) {
         if (!$$1.gD()) {
            $$1.gu();
         }
      }
   }

   public static class b extends byq<ckk> {
      public b(float $$0) {
         super($$0, $$0x -> axd.G);
      }

      protected void a(arq $$0, ckk $$1, long $$2) {
         $$1.gu();
         super.b($$0, $$1, $$2);
      }
   }
}
