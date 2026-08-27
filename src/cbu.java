import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class cbu {
   public static final csp a = csp.a(cpt.sl);
   private static final float b = 2.0F;
   private static final float c = 1.0F;
   private static final float d = 1.25F;
   private static final float e = 1.25F;
   private static final float f = 1.0F;
   private static final double g = 2.0;
   private static final double h = 1.0;
   private static final blw i = blw.a(5, 16);
   private static final ImmutableList<bzh<? extends bzg<? super cbt>>> j = ImmutableList.of(bzh.c, bzh.f, bzh.u, bzh.o, bzh.k);
   private static final ImmutableList<bya<?>> k = ImmutableList.of(
      bya.Z, bya.x, bya.y, bya.m, bya.n, bya.E, bya.t, bya.h, bya.O, bya.P, bya.Q, bya.R, new bya[]{bya.r, bya.K, bya.G}
   );
   private static final bsa<cbt> l = buc.a(
      (Function<buc.b<cbt>, ? extends App<buc.c<cbt>, buf<cbt>>>)($$0 -> $$0.group($$0.c(bya.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.w()) {
                  $$1.gs();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bpy.b<cbt> a() {
      return bpy.a(k, j);
   }

   protected static bpy<?> a(bpy<cbt> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<cbt> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new btj(0.8F), new cbu.b(2.0F), new brv(45, 90), new brz() {
         @Override
         protected boolean a(apa $$0, boz $$1) {
            if ($$1 instanceof cbt $$2 && $$2.w()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bqv(bya.P), new bqv(bya.Q), l));
   }

   private static void c(bpy<cbt> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, bsp.a(bol.bw, 6.0F, blw.a(30, 60))),
            Pair.of(1, new bqj(bol.d, 1.0F, 1)),
            Pair.of(2, new bsm(ImmutableList.of(Pair.of(new brc($$0x -> 1.25F, $$0x -> $$0x.o_() ? 1.0 : 2.0), 1), Pair.of(bqm.a(i, 1.25F), 1)))),
            Pair.of(3, new bsg(blw.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new bsm(ImmutableMap.of(bya.m, byb.b), ImmutableList.of(Pair.of(bsh.a(1.0F), 1), Pair.of(bsw.a(1.0F, 3), 1), Pair.of(new bqz(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bpy<cbt> $$0) {
      $$0.a(cjn.g, ImmutableList.of(Pair.of(0, new cbu.a())), Set.of(Pair.of(bya.G, byb.a)));
   }

   public static void a(cbt $$0) {
      $$0.dM().a(ImmutableList.of(cjn.g, cjn.b));
   }

   public static csp b() {
      return a;
   }

   public static class a extends bqp<cbt> {
      public a() {
         super(Map.of());
      }

      protected void a(apa $$0, cbt $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if ($$1.gl()) {
            $$1.a(cbt.a.c);
            if ($$1.aC()) {
               $$1.a(atp.aj);
            }
         }
      }

      protected boolean a(apa $$0, cbt $$1) {
         return $$1.aC();
      }

      protected boolean b(apa $$0, cbt $$1, long $$2) {
         return true;
      }

      protected void c(apa $$0, cbt $$1, long $$2) {
         $$1.gr();
      }

      protected void d(apa $$0, cbt $$1, long $$2) {
         if (!$$1.gu()) {
            $$1.gs();
         }
      }
   }

   public static class b extends bqk {
      public b(float $$0) {
         super($$0, $$0x -> $$0x.dy() || $$0x.bK());
      }

      @Override
      protected void b(apa $$0, bpf $$1, long $$2) {
         if ($$1 instanceof cbt $$3) {
            $$3.gs();
         }

         super.b($$0, $$1, $$2);
      }
   }
}
