import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class chn {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final brd h = brd.a(5, 16);
   private static final ImmutableList<cex<? extends cew<? super chm>>> i = ImmutableList.of(cex.c, cex.f, cex.u, cex.o, cex.k);
   private static final ImmutableList<cdq<?>> j = ImmutableList.of(
      cdq.Z, cdq.x, cdq.y, cdq.m, cdq.n, cdq.E, cdq.t, cdq.h, cdq.O, cdq.P, cdq.Q, cdq.R, new cdq[]{cdq.r, cdq.K, cdq.G}
   );
   private static final bxq<chm> k = bzs.a(
      (Function<bzs.b<chm>, ? extends App<bzs.c<chm>, bzv<chm>>>)($$0 -> $$0.group($$0.c(cdq.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gr();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bvo.b<chm> a() {
      return bvo.a(j, i);
   }

   protected static bvo<?> a(bvo<chm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvo<chm> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new byz(0.8F), new chn.b(2.0F), new bxl(45, 90), new bxp() {
         @Override
         protected boolean a(arj $$0, bup $$1) {
            if ($$1 instanceof chm $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bwl(cdq.P), new bwl(cdq.Q), k));
   }

   private static void c(bvo<chm> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, byf.a(bty.by, 6.0F, brd.a(30, 60))),
            Pair.of(1, new bvz(bty.c, 1.0F, 1)),
            Pair.of(2, new byc(ImmutableList.of(Pair.of(new bws($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bwc.a(h, 1.25F), 1)))),
            Pair.of(3, new bxw(brd.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new byc(ImmutableMap.of(cdq.m, cdr.b), ImmutableList.of(Pair.of(bxx.a(1.0F), 1), Pair.of(bym.a(1.0F, 3), 1), Pair.of(new bwp(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bvo<chm> $$0) {
      $$0.a(cpp.g, ImmutableList.of(Pair.of(0, new chn.a())), Set.of(Pair.of(cdq.G, cdr.a), Pair.of(cdq.Z, cdr.b)));
   }

   public static void a(chm $$0) {
      $$0.dY().a(ImmutableList.of(cpp.g, cpp.b));
   }

   public static Predicate<cvs> b() {
      return $$0 -> $$0.a(axe.ai);
   }

   public static class a extends bwf<chm> {
      static final int c = 5 * bag.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arj $$0, chm $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.go()) {
            $$1.a(chm.a.c);
            if ($$1.aH()) {
               $$1.a(awg.aj);
            }
         } else {
            chm.a $$3 = $$1.gp();
            long $$4 = $$1.dY().e(cdq.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == chm.a.c) {
               if (this.f == 0 && $$1.aH() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)chm.a.d.b()) {
                  $$1.a(awg.an);
                  $$1.a(chm.a.d);
               }
            } else if ($$3 == chm.a.d && $$4 > (long)chm.a.d.b()) {
               $$1.a(chm.a.c);
            }
         }
      }

      private int a(chm $$0) {
         return chm.a.c.b() + $$0.dV().a(100, 400);
      }

      protected boolean a(arj $$0, chm $$1) {
         return $$1.aH();
      }

      protected boolean b(arj $$0, chm $$1, long $$2) {
         return $$1.gp().a();
      }

      protected void c(arj $$0, chm $$1, long $$2) {
         $$1.gq();
      }

      protected void d(arj $$0, chm $$1, long $$2) {
         if (!$$1.gA()) {
            $$1.gr();
         }
      }
   }

   public static class b extends bwa<chm> {
      public b(float $$0) {
         super($$0, $$0x -> awx.G);
      }

      protected void a(arj $$0, chm $$1, long $$2) {
         $$1.gr();
         super.b($$0, $$1, $$2);
      }
   }
}
