import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cgm {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bqb h = bqb.a(5, 16);
   private static final ImmutableList<cdx<? extends cdw<? super cgl>>> i = ImmutableList.of(cdx.c, cdx.f, cdx.u, cdx.o, cdx.k);
   private static final ImmutableList<ccq<?>> j = ImmutableList.of(
      ccq.Z, ccq.x, ccq.y, ccq.m, ccq.n, ccq.E, ccq.t, ccq.h, ccq.O, ccq.P, ccq.Q, ccq.R, new ccq[]{ccq.r, ccq.K, ccq.G}
   );
   private static final bwq<cgl> k = bys.a(
      (Function<bys.b<cgl>, ? extends App<bys.c<cgl>, byv<cgl>>>)($$0 -> $$0.group($$0.c(ccq.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gp();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static buo.b<cgl> a() {
      return buo.a(j, i);
   }

   protected static buo<?> a(buo<cgl> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(buo<cgl> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bxz(0.8F), new cgm.b(2.0F), new bwl(45, 90), new bwp() {
         @Override
         protected boolean a(aqt $$0, btn $$1) {
            if ($$1 instanceof cgl $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bvl(ccq.P), new bvl(ccq.Q), k));
   }

   private static void c(buo<cgl> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxf.a(bsw.by, 6.0F, bqb.a(30, 60))),
            Pair.of(1, new buz(bsw.c, 1.0F, 1)),
            Pair.of(2, new bxc(ImmutableList.of(Pair.of(new bvs($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(bvc.a(h, 1.25F), 1)))),
            Pair.of(3, new bww(bqb.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxc(ImmutableMap.of(ccq.m, ccr.b), ImmutableList.of(Pair.of(bwx.a(1.0F), 1), Pair.of(bxm.a(1.0F, 3), 1), Pair.of(new bvp(30, 60), 1)))
            )
         )
      );
   }

   private static void d(buo<cgl> $$0) {
      $$0.a(cok.g, ImmutableList.of(Pair.of(0, new cgm.a())), Set.of(Pair.of(ccq.G, ccr.a), Pair.of(ccq.Z, ccr.b)));
   }

   public static void a(cgl $$0) {
      $$0.dU().a(ImmutableList.of(cok.g, cok.b));
   }

   public static Predicate<cuo> b() {
      return $$0 -> $$0.a(awm.ai);
   }

   public static class a extends bvf<cgl> {
      static final int c = 5 * azo.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aqt $$0, cgl $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gm()) {
            $$1.a(cgl.a.c);
            if ($$1.aF()) {
               $$1.a(avo.aj);
            }
         } else {
            cgl.a $$3 = $$1.gn();
            long $$4 = $$1.dU().e(ccq.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cgl.a.c) {
               if (this.f == 0 && $$1.aF() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cgl.a.d.b()) {
                  $$1.a(avo.an);
                  $$1.a(cgl.a.d);
               }
            } else if ($$3 == cgl.a.d && $$4 > (long)cgl.a.d.b()) {
               $$1.a(cgl.a.c);
            }
         }
      }

      private int a(cgl $$0) {
         return cgl.a.c.b() + $$0.dT().a(100, 400);
      }

      protected boolean a(aqt $$0, cgl $$1) {
         return $$1.aF();
      }

      protected boolean b(aqt $$0, cgl $$1, long $$2) {
         return $$1.gn().a();
      }

      protected void c(aqt $$0, cgl $$1, long $$2) {
         $$1.go();
      }

      protected void d(aqt $$0, cgl $$1, long $$2) {
         if (!$$1.gw()) {
            $$1.gp();
         }
      }
   }

   public static class b extends bva<cgl> {
      public b(float $$0) {
         super($$0, $$0x -> awf.G);
      }

      protected void a(aqt $$0, cgl $$1, long $$2) {
         $$1.gp();
         super.b($$0, $$1, $$2);
      }
   }
}
