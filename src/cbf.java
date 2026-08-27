import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class cbf {
   public static final csc a = csc.a(cpg.sl);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.25F;
   private static final float f = 1.0F;
   private static final double g = 2.0;
   private static final double h = 1.0;
   private static final blh i = blh.a(5, 16);
   private static final ImmutableList<bys<? extends byr<? super cbe>>> j = ImmutableList.of(bys.c, bys.f, bys.u, bys.o, bys.k);
   private static final ImmutableList<bxl<?>> k = ImmutableList.of(
      bxl.Z, bxl.x, bxl.y, bxl.m, bxl.n, bxl.E, bxl.t, bxl.h, bxl.O, bxl.P, bxl.Q, bxl.R, new bxl[]{bxl.r, bxl.K, bxl.G}
   );
   private static final brl<cbe> l = btn.a(
      (Function<btn.b<cbe>, ? extends App<btn.c<cbe>, btq<cbe>>>)($$0 -> $$0.group($$0.c(bxl.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.w()) {
                  $$1.gn();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bpj.b<cbe> a() {
      return bpj.a(k, j);
   }

   protected static bpj<?> a(bpj<cbe> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cbe> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bsu(0.8F), new cbf.b(2.0F), new brg(45, 90), new brk() {
         @Override
         protected boolean a(aow $$0, bok $$1) {
            if ($$1 instanceof cbe $$2 && $$2.w()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bqg(bxl.P), new bqg(bxl.Q), l));
   }

   private static void c(bpj<cbe> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, bsa.a(bnw.bw, 6.0F, blh.a(30, 60))),
            Pair.of(1, new bpu(bnw.d, 1.0F, 1)),
            Pair.of(2, new brx(ImmutableList.of(Pair.of(new bqn($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(bpx.a(i, 1.25F), 1)))),
            Pair.of(3, new brr(blh.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new brx(ImmutableMap.of(bxl.m, bxm.b), ImmutableList.of(Pair.of(brs.a(1.0F), 1), Pair.of(bsh.a(1.0F, 3), 1), Pair.of(new bqk(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bpj<cbe> $$0) {
      $$0.a(ciy.g, ImmutableList.of(Pair.of(0, new cbf.a())), Set.of(Pair.of(bxl.G, bxm.a)));
   }

   public static void a(cbe $$0) {
      $$0.dO().a(ImmutableList.of(ciy.g, ciy.b));
   }

   public static csc b() {
      return a;
   }

   public static class a extends bqa<cbe> {
      public a() {
         super(Map.of());
      }

      protected void a(aow $$0, cbe $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if ($$1.gg()) {
            $$1.a(cbe.a.c);
            if ($$1.aC()) {
               $$1.a(atl.aj);
            }
         }
      }

      protected boolean a(aow $$0, cbe $$1) {
         return $$1.aC();
      }

      protected boolean b(aow $$0, cbe $$1, long $$2) {
         return true;
      }

      protected void c(aow $$0, cbe $$1, long $$2) {
         $$1.gm();
      }

      protected void d(aow $$0, cbe $$1, long $$2) {
         if (!$$1.gp()) {
            $$1.gn();
         }
      }
   }

   public static class b extends bpv {
      public b(float $$0) {
         super($$0, $$0x -> $$0x.dB() || $$0x.bN());
      }

      @Override
      protected void b(aow $$0, boq $$1, long $$2) {
         if ($$1 instanceof cbe $$3) {
            $$3.gn();
         }

         super.b($$0, $$1, $$2);
      }
   }
}
