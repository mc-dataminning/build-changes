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
   private static final bpf h = bpf.a(5, 16);
   private static final ImmutableList<ccz<? extends ccy<? super cfn>>> i = ImmutableList.of(ccz.c, ccz.f, ccz.u, ccz.o, ccz.k);
   private static final ImmutableList<cbs<?>> j = ImmutableList.of(
      cbs.Z, cbs.x, cbs.y, cbs.m, cbs.n, cbs.E, cbs.t, cbs.h, cbs.O, cbs.P, cbs.Q, cbs.R, new cbs[]{cbs.r, cbs.K, cbs.G}
   );
   private static final bvs<cfn> k = bxu.a(
      (Function<bxu.b<cfn>, ? extends App<bxu.c<cfn>, bxx<cfn>>>)($$0 -> $$0.group($$0.c(cbs.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gx();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static btq.b<cfn> a() {
      return btq.a(j, i);
   }

   protected static btq<?> a(btq<cfn> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   private static void b(btq<cfn> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bxb(0.8F), new cfo.b(2.0F), new bvn(45, 90), new bvr() {
         @Override
         protected boolean a(aqm $$0, bsq $$1) {
            if ($$1 instanceof cfn $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bun(cbs.P), new bun(cbs.Q), k));
   }

   private static void c(btq<cfn> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, bwh.a(bsa.by, 6.0F, bpf.a(30, 60))),
            Pair.of(1, new bub(bsa.c, 1.0F, 1)),
            Pair.of(2, new bwe(ImmutableList.of(Pair.of(new buu($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bue.a(h, 1.25F), 1)))),
            Pair.of(3, new bvy(bpf.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bwe(ImmutableMap.of(cbs.m, cbt.b), ImmutableList.of(Pair.of(bvz.a(1.0F), 1), Pair.of(bwo.a(1.0F, 3), 1), Pair.of(new bur(30, 60), 1)))
            )
         )
      );
   }

   private static void d(btq<cfn> $$0) {
      $$0.a(cnl.g, ImmutableList.of(Pair.of(0, new cfo.a())), Set.of(Pair.of(cbs.G, cbt.a), Pair.of(cbs.Z, cbt.b)));
   }

   public static void a(cfn $$0) {
      $$0.dS().a(ImmutableList.of(cnl.g, cnl.b));
   }

   public static Predicate<cto> b() {
      return $$0 -> $$0.a(awe.ai);
   }

   public static class a extends buh<cfn> {
      static final int c = 5 * azc.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aqm $$0, cfn $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gp()) {
            $$1.a(cfn.a.c);
            if ($$1.aE()) {
               $$1.a(avh.aj);
            }
         } else {
            cfn.a $$3 = $$1.gv();
            long $$4 = $$1.dS().e(cbs.G);
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
                  $$1.a(avh.an);
                  $$1.a(cfn.a.d);
               }
            } else if ($$3 == cfn.a.d && $$4 > (long)cfn.a.d.b()) {
               $$1.a(cfn.a.c);
            }
         }
      }

      private int a(cfn $$0) {
         return cfn.a.c.b() + $$0.el().a(100, 400);
      }

      protected boolean a(aqm $$0, cfn $$1) {
         return $$1.aE();
      }

      protected boolean b(aqm $$0, cfn $$1, long $$2) {
         return $$1.gv().a();
      }

      protected void c(aqm $$0, cfn $$1, long $$2) {
         $$1.gw();
      }

      protected void d(aqm $$0, cfn $$1, long $$2) {
         if (!$$1.gA()) {
            $$1.gx();
         }
      }
   }

   public static class b extends buc<cfn> {
      public b(float $$0) {
         super($$0, cfn::gy);
      }

      protected void a(aqm $$0, cfn $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }
}
