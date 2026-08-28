import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class chf {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bqv h = bqv.a(5, 16);
   private static final ImmutableList<cep<? extends ceo<? super che>>> i = ImmutableList.of(cep.c, cep.f, cep.u, cep.o, cep.k);
   private static final ImmutableList<cdi<?>> j = ImmutableList.of(
      cdi.Z, cdi.x, cdi.y, cdi.m, cdi.n, cdi.E, cdi.t, cdi.h, cdi.O, cdi.P, cdi.Q, cdi.R, new cdi[]{cdi.r, cdi.K, cdi.G}
   );
   private static final bxi<che> k = bzk.a(
      (Function<bzk.b<che>, ? extends App<bzk.c<che>, bzn<che>>>)($$0 -> $$0.group($$0.c(cdi.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gr();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bvg.b<che> a() {
      return bvg.a(j, i);
   }

   protected static bvg<?> a(bvg<che> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvg<che> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new byr(0.8F), new chf.b(2.0F), new bxd(45, 90), new bxh() {
         @Override
         protected boolean a(arg $$0, buh $$1) {
            if ($$1 instanceof che $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bwd(cdi.P), new bwd(cdi.Q), k));
   }

   private static void c(bvg<che> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, bxx.a(btq.by, 6.0F, bqv.a(30, 60))),
            Pair.of(1, new bvr(btq.c, 1.0F, 1)),
            Pair.of(2, new bxu(ImmutableList.of(Pair.of(new bwk($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(bvu.a(h, 1.25F), 1)))),
            Pair.of(3, new bxo(bqv.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bxu(ImmutableMap.of(cdi.m, cdj.b), ImmutableList.of(Pair.of(bxp.a(1.0F), 1), Pair.of(bye.a(1.0F, 3), 1), Pair.of(new bwh(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bvg<che> $$0) {
      $$0.a(cpg.g, ImmutableList.of(Pair.of(0, new chf.a())), Set.of(Pair.of(cdi.G, cdj.a), Pair.of(cdi.Z, cdj.b)));
   }

   public static void a(che $$0) {
      $$0.dX().a(ImmutableList.of(cpg.g, cpg.b));
   }

   public static Predicate<cvl> b() {
      return $$0 -> $$0.a(axb.ai);
   }

   public static class a extends bvx<che> {
      static final int c = 5 * bad.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arg $$0, che $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.go()) {
            $$1.a(che.a.c);
            if ($$1.aH()) {
               $$1.a(awd.aj);
            }
         } else {
            che.a $$3 = $$1.gp();
            long $$4 = $$1.dX().e(cdi.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == che.a.c) {
               if (this.f == 0 && $$1.aH() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)che.a.d.b()) {
                  $$1.a(awd.an);
                  $$1.a(che.a.d);
               }
            } else if ($$3 == che.a.d && $$4 > (long)che.a.d.b()) {
               $$1.a(che.a.c);
            }
         }
      }

      private int a(che $$0) {
         return che.a.c.b() + $$0.dV().a(100, 400);
      }

      protected boolean a(arg $$0, che $$1) {
         return $$1.aH();
      }

      protected boolean b(arg $$0, che $$1, long $$2) {
         return $$1.gp().a();
      }

      protected void c(arg $$0, che $$1, long $$2) {
         $$1.gq();
      }

      protected void d(arg $$0, che $$1, long $$2) {
         if (!$$1.gA()) {
            $$1.gr();
         }
      }
   }

   public static class b extends bvs<che> {
      public b(float $$0) {
         super($$0, $$0x -> awu.G);
      }

      protected void a(arg $$0, che $$1, long $$2) {
         $$1.gr();
         super.b($$0, $$1, $$2);
      }
   }
}
