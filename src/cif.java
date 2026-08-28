import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cif {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final brs h = brs.a(5, 16);
   private static final ImmutableList<cfp<? extends cfo<? super cie>>> i = ImmutableList.of(cfp.c, cfp.f, cfp.u, cfp.o, cfp.k);
   private static final ImmutableList<cei<?>> j = ImmutableList.of(
      cei.Z, cei.x, cei.y, cei.m, cei.n, cei.E, cei.t, cei.h, cei.O, cei.P, cei.Q, cei.R, new cei[]{cei.r, cei.K, cei.G}
   );
   private static final byi<cie> k = cak.a(
      (Function<cak.b<cie>, ? extends App<cak.c<cie>, can<cie>>>)($$0 -> $$0.group($$0.c(cei.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gy();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bwg.b<cie> a() {
      return bwg.a(j, i);
   }

   protected static bwg<?> a(bwg<cie> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqi.a));
      $$0.b(cqi.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwg<cie> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new bzr(0.8F), new cif.b(2.0F), new byd(45, 90), new byh() {
         @Override
         protected boolean a(arq $$0, bvg $$1) {
            if ($$1 instanceof cie $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bxd(cei.P), new bxd(cei.Q), k));
   }

   private static void c(bwg<cie> $$0) {
      $$0.a(
         cqi.b,
         ImmutableList.of(
            Pair.of(0, byx.a(bup.by, 6.0F, brs.a(30, 60))),
            Pair.of(1, new bwr(bup.c, 1.0F, 1)),
            Pair.of(2, new byu(ImmutableList.of(Pair.of(new bxk($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bwu.a(h, 1.25F), 1)))),
            Pair.of(3, new byo(brs.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new byu(ImmutableMap.of(cei.m, cej.b), ImmutableList.of(Pair.of(byp.a(1.0F), 1), Pair.of(bze.a(1.0F, 3), 1), Pair.of(new bxh(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bwg<cie> $$0) {
      $$0.a(cqi.g, ImmutableList.of(Pair.of(0, new cif.a())), Set.of(Pair.of(cei.G, cej.a), Pair.of(cei.Z, cej.b)));
   }

   public static void a(cie $$0) {
      $$0.ee().a(ImmutableList.of(cqi.g, cqi.b));
   }

   public static Predicate<cwf> b() {
      return $$0 -> $$0.a(axm.am);
   }

   public static class a extends bwx<cie> {
      static final int c = 5 * bap.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arq $$0, cie $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gv()) {
            $$1.a(cie.a.c);
            if ($$1.aL()) {
               $$1.a(awo.aj);
            }
         } else {
            cie.a $$3 = $$1.gw();
            long $$4 = $$1.ee().e(cei.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cie.a.c) {
               if (this.f == 0 && $$1.aL() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cie.a.d.b()) {
                  $$1.a(awo.an);
                  $$1.a(cie.a.d);
               }
            } else if ($$3 == cie.a.d && $$4 > (long)cie.a.d.b()) {
               $$1.a(cie.a.c);
            }
         }
      }

      private int a(cie $$0) {
         return cie.a.c.b() + $$0.eb().a(100, 400);
      }

      protected boolean a(arq $$0, cie $$1) {
         return $$1.aL();
      }

      protected boolean b(arq $$0, cie $$1, long $$2) {
         return $$1.gw().a();
      }

      protected void c(arq $$0, cie $$1, long $$2) {
         $$1.gx();
      }

      protected void d(arq $$0, cie $$1, long $$2) {
         if (!$$1.gH()) {
            $$1.gy();
         }
      }
   }

   public static class b extends bws<cie> {
      public b(float $$0) {
         super($$0, $$0x -> axf.G);
      }

      protected void a(arq $$0, cie $$1, long $$2) {
         $$1.gy();
         super.b($$0, $$1, $$2);
      }
   }
}
