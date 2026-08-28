import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cgb {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bpr h = bpr.a(5, 16);
   private static final ImmutableList<cdm<? extends cdl<? super cga>>> i = ImmutableList.of(cdm.c, cdm.f, cdm.u, cdm.o, cdm.k);
   private static final ImmutableList<ccf<?>> j = ImmutableList.of(
      ccf.Z, ccf.x, ccf.y, ccf.m, ccf.n, ccf.E, ccf.t, ccf.h, ccf.O, ccf.P, ccf.Q, ccf.R, new ccf[]{ccf.r, ccf.K, ccf.G}
   );
   private static final bwf<cga> k = byh.a(
      (Function<byh.b<cga>, ? extends App<byh.c<cga>, byk<cga>>>)($$0 -> $$0.group($$0.c(ccf.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gw();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bud.b<cga> a() {
      return bud.a(j, i);
   }

   protected static bud<?> a(bud<cga> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnz.a));
      $$0.b(cnz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bud<cga> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bxo(0.8F), new cgb.b(2.0F), new bwa(45, 90), new bwe() {
         @Override
         protected boolean a(aqm $$0, btd $$1) {
            if ($$1 instanceof cga $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bva(ccf.P), new bva(ccf.Q), k));
   }

   private static void c(bud<cga> $$0) {
      $$0.a(
         cnz.b,
         ImmutableList.of(
            Pair.of(0, bwu.a(bsm.by, 6.0F, bpr.a(30, 60))),
            Pair.of(1, new buo(bsm.c, 1.0F, 1)),
            Pair.of(2, new bwr(ImmutableList.of(Pair.of(new bvh($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bur.a(h, 1.25F), 1)))),
            Pair.of(3, new bwl(bpr.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bwr(ImmutableMap.of(ccf.m, ccg.b), ImmutableList.of(Pair.of(bwm.a(1.0F), 1), Pair.of(bxb.a(1.0F, 3), 1), Pair.of(new bve(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bud<cga> $$0) {
      $$0.a(cnz.g, ImmutableList.of(Pair.of(0, new cgb.a())), Set.of(Pair.of(ccf.G, ccg.a), Pair.of(ccf.Z, ccg.b)));
   }

   public static void a(cga $$0) {
      $$0.dU().a(ImmutableList.of(cnz.g, cnz.b));
   }

   public static Predicate<cuc> b() {
      return $$0 -> $$0.a(awf.ai);
   }

   public static class a extends buu<cga> {
      static final int c = 5 * azh.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aqm $$0, cga $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.go()) {
            $$1.a(cga.a.c);
            if ($$1.aF()) {
               $$1.a(avh.aj);
            }
         } else {
            cga.a $$3 = $$1.gu();
            long $$4 = $$1.dU().e(ccf.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cga.a.c) {
               if (this.f == 0 && $$1.aF() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cga.a.d.b()) {
                  $$1.a(avh.an);
                  $$1.a(cga.a.d);
               }
            } else if ($$3 == cga.a.d && $$4 > (long)cga.a.d.b()) {
               $$1.a(cga.a.c);
            }
         }
      }

      private int a(cga $$0) {
         return cga.a.c.b() + $$0.dT().a(100, 400);
      }

      protected boolean a(aqm $$0, cga $$1) {
         return $$1.aF();
      }

      protected boolean b(aqm $$0, cga $$1, long $$2) {
         return $$1.gu().a();
      }

      protected void c(aqm $$0, cga $$1, long $$2) {
         $$1.gv();
      }

      protected void d(aqm $$0, cga $$1, long $$2) {
         if (!$$1.gz()) {
            $$1.gw();
         }
      }
   }

   public static class b extends bup<cga> {
      public b(float $$0) {
         super($$0, cga::gx);
      }

      protected void a(aqm $$0, cga $$1, long $$2) {
         $$1.gw();
         super.b($$0, $$1, $$2);
      }
   }
}
