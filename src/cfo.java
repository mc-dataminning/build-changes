import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cfo {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bpl h = bpl.a(5, 16);
   private static final ImmutableList<ccy<? extends ccx<? super cfn>>> i = ImmutableList.of(ccy.c, ccy.f, ccy.u, ccy.o, ccy.k);
   private static final ImmutableList<cbr<?>> j = ImmutableList.of(
      cbr.Z, cbr.x, cbr.y, cbr.m, cbr.n, cbr.E, cbr.t, cbr.h, cbr.O, cbr.P, cbr.Q, cbr.R, new cbr[]{cbr.r, cbr.K, cbr.G}
   );
   private static final bvr<cfn> k = bxt.a(
      (Function<bxt.b<cfn>, ? extends App<bxt.c<cfn>, bxw<cfn>>>)($$0 -> $$0.group($$0.c(cbr.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gG();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static btp.b<cfn> a() {
      return btp.a(j, i);
   }

   protected static btp<?> a(btp<cfn> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cfn> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bxa(0.8F), new cfo.b(2.0F), new bvm(45, 90), new bvq() {
         @Override
         protected boolean a(aqt $$0, bsq $$1) {
            if ($$1 instanceof cfn $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bum(cbr.P), new bum(cbr.Q), k));
   }

   private static void c(btp<cfn> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, bwg.a(bsb.bE, 6.0F, bpl.a(30, 60))),
            Pair.of(1, new bua(bsb.c, 1.0F, 1)),
            Pair.of(2, new bwd(ImmutableList.of(Pair.of(new but($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(bud.a(h, 1.25F), 1)))),
            Pair.of(3, new bvx(bpl.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bwd(ImmutableMap.of(cbr.m, cbs.b), ImmutableList.of(Pair.of(bvy.a(1.0F), 1), Pair.of(bwn.a(1.0F, 3), 1), Pair.of(new buq(30, 60), 1)))
            )
         )
      );
   }

   private static void d(btp<cfn> $$0) {
      $$0.a(cnq.g, ImmutableList.of(Pair.of(0, new cfo.a())), Set.of(Pair.of(cbr.G, cbs.a), Pair.of(cbr.Z, cbs.b)));
   }

   public static void a(cfn $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.g, cnq.b));
   }

   public static Predicate<cuh> b() {
      return $$0 -> $$0.a(awm.ai);
   }

   public static class a extends bug<cfn> {
      static final int c = 5 * azl.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aqt $$0, cfn $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gy()) {
            $$1.a(cfn.a.c);
            if ($$1.aE()) {
               $$1.a(avo.ao);
            }
         } else {
            cfn.a $$3 = $$1.gE();
            long $$4 = $$1.dZ().e(cbr.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cfn.a.c) {
               if (this.f == 0 && $$1.aE() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cfn.a.d.b()) {
                  $$1.a(avo.as);
                  $$1.a(cfn.a.d);
               }
            } else if ($$3 == cfn.a.d && $$4 > (long)cfn.a.d.b()) {
               $$1.a(cfn.a.c);
            }
         }
      }

      private int a(cfn $$0) {
         return cfn.a.c.b() + $$0.et().a(100, 400);
      }

      protected boolean a(aqt $$0, cfn $$1) {
         return $$1.aE();
      }

      protected boolean b(aqt $$0, cfn $$1, long $$2) {
         return $$1.gE().a();
      }

      protected void c(aqt $$0, cfn $$1, long $$2) {
         $$1.gF();
      }

      protected void d(aqt $$0, cfn $$1, long $$2) {
         if (!$$1.gJ()) {
            $$1.gG();
         }
      }
   }

   public static class b extends bub<cfn> {
      public b(float $$0) {
         super($$0, cfn::gH);
      }

      protected void a(aqt $$0, cfn $$1, long $$2) {
         $$1.gG();
         super.b($$0, $$1, $$2);
      }
   }
}
