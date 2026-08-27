import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class cdl {
   public static final cvg a = cvg.a(crm.sl);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.25F;
   private static final float f = 1.0F;
   private static final double g = 2.0;
   private static final double h = 1.0;
   private static final bnl i = bnl.a(5, 16);
   private static final ImmutableList<cay<? extends cax<? super cdk>>> j = ImmutableList.of(cay.c, cay.f, cay.u, cay.o, cay.k);
   private static final ImmutableList<bzr<?>> k = ImmutableList.of(
      bzr.Z, bzr.x, bzr.y, bzr.m, bzr.n, bzr.E, bzr.t, bzr.h, bzr.O, bzr.P, bzr.Q, bzr.R, new bzr[]{bzr.r, bzr.K, bzr.G}
   );
   private static final btr<cdk> l = bvt.a(
      (Function<bvt.b<cdk>, ? extends App<bvt.c<cdk>, bvw<cdk>>>)($$0 -> $$0.group($$0.c(bzr.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.u()) {
                  $$1.gv();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static brp.b<cdk> a() {
      return brp.a(k, j);
   }

   protected static brp<?> a(brp<cdk> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   private static void b(brp<cdk> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bva(0.8F), new cdl.b(2.0F), new btm(45, 90), new btq() {
         @Override
         protected boolean a(aps $$0, bqq $$1) {
            if ($$1 instanceof cdk $$2 && $$2.u()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bsm(bzr.P), new bsm(bzr.Q), l));
   }

   private static void c(brp<cdk> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, bug.a(bqb.bx, 6.0F, bnl.a(30, 60))),
            Pair.of(1, new bsa(bqb.c, 1.0F, 1)),
            Pair.of(2, new bud(ImmutableList.of(Pair.of(new bst($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bsd.a(i, 1.25F), 1)))),
            Pair.of(3, new btx(bnl.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bud(ImmutableMap.of(bzr.m, bzs.b), ImmutableList.of(Pair.of(bty.a(1.0F), 1), Pair.of(bun.a(1.0F, 3), 1), Pair.of(new bsq(30, 60), 1)))
            )
         )
      );
   }

   private static void d(brp<cdk> $$0) {
      $$0.a(cli.g, ImmutableList.of(Pair.of(0, new cdl.a())), Set.of(Pair.of(bzr.G, bzs.a), Pair.of(bzr.Z, bzs.b)));
   }

   public static void a(cdk $$0) {
      $$0.dP().a(ImmutableList.of(cli.g, cli.b));
   }

   public static cvg b() {
      return a;
   }

   public static class a extends bsg<cdk> {
      static final int c = 5 * ayj.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(aps $$0, cdk $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gn()) {
            $$1.a(cdk.a.c);
            if ($$1.aC()) {
               $$1.a(aum.aj);
            }
         } else {
            cdk.a $$3 = $$1.gt();
            long $$4 = $$1.dP().e(bzr.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cdk.a.c) {
               if (this.f == 0 && $$1.aC() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cdk.a.d.b()) {
                  $$1.a(aum.an);
                  $$1.a(cdk.a.d);
               }
            } else if ($$3 == cdk.a.d && $$4 > (long)cdk.a.d.b()) {
               $$1.a(cdk.a.c);
            }
         }
      }

      private int a(cdk $$0) {
         return cdk.a.c.b() + $$0.ei().a(100, 400);
      }

      protected boolean a(aps $$0, cdk $$1) {
         return $$1.aC();
      }

      protected boolean b(aps $$0, cdk $$1, long $$2) {
         return $$1.gt().a();
      }

      protected void c(aps $$0, cdk $$1, long $$2) {
         $$1.gu();
      }

      protected void d(aps $$0, cdk $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.gv();
         }
      }
   }

   public static class b extends bsb<cdk> {
      public b(float $$0) {
         super($$0, cdk::gw);
      }

      protected void a(aps $$0, cdk $$1, long $$2) {
         $$1.gv();
         super.b($$0, $$1, $$2);
      }
   }
}
