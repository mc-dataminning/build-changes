import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class cbb {
   public static final cry a = cry.a(cpc.sl);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.25F;
   private static final float f = 1.0F;
   private static final double g = 2.0;
   private static final double h = 1.0;
   private static final blf i = blf.a(5, 16);
   private static final ImmutableList<byo<? extends byn<? super cba>>> j = ImmutableList.of(byo.c, byo.f, byo.u, byo.o, byo.k);
   private static final ImmutableList<bxh<?>> k = ImmutableList.of(
      bxh.Z, bxh.x, bxh.y, bxh.m, bxh.n, bxh.E, bxh.t, bxh.h, bxh.O, bxh.P, bxh.Q, bxh.R, new bxh[]{bxh.r, bxh.K, bxh.G}
   );
   private static final brh<cba> l = btj.a(
      (Function<btj.b<cba>, ? extends App<btj.c<cba>, btm<cba>>>)($$0 -> $$0.group($$0.c(bxh.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.w()) {
                  $$1.gn();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bpf.b<cba> a() {
      return bpf.a(k, j);
   }

   protected static bpf<?> a(bpf<cba> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cba> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bsq(0.8F), new cbb.b(2.0F), new brc(45, 90), new brg() {
         @Override
         protected boolean a(aov $$0, boi $$1) {
            if ($$1 instanceof cba $$2 && $$2.w()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bqc(bxh.P), new bqc(bxh.Q), l));
   }

   private static void c(bpf<cba> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, brw.a(bnu.bw, 6.0F, blf.a(30, 60))),
            Pair.of(1, new bpq(bnu.d, 1.0F, 1)),
            Pair.of(2, new brt(ImmutableList.of(Pair.of(new bqj($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(bpt.a(i, 1.25F), 1)))),
            Pair.of(3, new brn(blf.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new brt(ImmutableMap.of(bxh.m, bxi.b), ImmutableList.of(Pair.of(bro.a(1.0F), 1), Pair.of(bsd.a(1.0F, 3), 1), Pair.of(new bqg(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bpf<cba> $$0) {
      $$0.a(ciu.g, ImmutableList.of(Pair.of(0, new cbb.a())), Set.of(Pair.of(bxh.G, bxi.a)));
   }

   public static void a(cba $$0) {
      $$0.dO().a(ImmutableList.of(ciu.g, ciu.b));
   }

   public static cry b() {
      return a;
   }

   public static class a extends bpw<cba> {
      public a() {
         super(Map.of());
      }

      protected void a(aov $$0, cba $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if ($$1.gg()) {
            $$1.a(cba.a.c);
            if ($$1.aC()) {
               $$1.a(atk.ai);
            }
         }
      }

      protected boolean a(aov $$0, cba $$1) {
         return $$1.aC();
      }

      protected boolean b(aov $$0, cba $$1, long $$2) {
         return true;
      }

      protected void c(aov $$0, cba $$1, long $$2) {
         $$1.gm();
      }

      protected void d(aov $$0, cba $$1, long $$2) {
         if (!$$1.gp()) {
            $$1.gn();
         }
      }
   }

   public static class b extends bpr {
      public b(float $$0) {
         super($$0);
      }

      @Override
      protected void b(aov $$0, boo $$1, long $$2) {
         if ($$1 instanceof cba $$3) {
            $$3.gn();
         }

         super.b($$0, $$1, $$2);
      }
   }
}
