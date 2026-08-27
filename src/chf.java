import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class chf {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = awm.f(100.0F);
   public static final int a = awm.f(133.59999F);
   public static final int b = awm.f(84.0F);
   private static final int i = awm.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bzh<? extends bzg<? super che>>> k = List.of(bzh.d, bzh.x);
   private static final List<bya<?>> l = List.of(
      bya.g,
      bya.h,
      bya.k,
      bya.l,
      bya.M,
      bya.n,
      bya.m,
      bya.E,
      bya.t,
      bya.o,
      bya.p,
      bya.B,
      bya.ay,
      bya.az,
      bya.aA,
      bya.aB,
      bya.aC,
      bya.aD,
      bya.aE,
      bya.aF,
      bya.aG,
      bya.aH,
      bya.aI,
      bya.aJ,
      bya.aK,
      bya.aL
   );
   private static final bqq<che> m = buc.a(
      (Function<buc.b<che>, ? extends App<buc.c<che>, buf<che>>>)($$0 -> $$0.group($$0.a(bya.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(axo.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(che $$0) {
      $$0.dM().a(ImmutableList.of(cjn.y, cjn.z, cjn.x, cjn.k, cjn.w, cjn.v, cjn.b));
   }

   protected static bpy<?> a(che $$0, Dynamic<?> $$1) {
      bpy.b<che> $$2 = bpy.a(l, k);
      bpy<che> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cjn.a));
      $$3.b(cjn.b);
      $$3.f();
      return $$3;
   }

   private static void a(bpy<che> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new btj(0.8F), bun.a(), new brv(45, 90), new brz()));
   }

   private static void b(bpy<che> $$0) {
      $$0.a(cjn.y, 5, ImmutableList.of(new buj(a)), bya.aC);
   }

   private static void c(bpy<che> $$0) {
      $$0.a(cjn.z, ImmutableList.of(Pair.of(0, new buk()), Pair.of(1, new bui(h))), ImmutableSet.of(Pair.of(bya.ay, byb.b), Pair.of(bya.aE, byb.b)));
   }

   private static void d(bpy<che> $$0) {
      $$0.a(
         cjn.b,
         10,
         ImmutableList.of(
            bum.a(che::gl), buq.a(), new bsm(ImmutableMap.of(bya.aB, byb.b), ImmutableList.of(Pair.of(bsh.a(0.5F), 2), Pair.of(new bqz(30, 60), 1)))
         )
      );
   }

   private static void e(bpy<che> $$0) {
      $$0.a(cjn.w, 5, ImmutableList.of(bum.a(che::gl), bri.a(bya.az, 2, 0.7F)), bya.az);
   }

   private static void f(bpy<che> $$0) {
      $$0.a(cjn.v, 5, ImmutableList.of(bum.a(che::gl), new buo(i)), bya.aB);
   }

   private static void g(bpy<che> $$0) {
      $$0.a(cjn.x, 10, ImmutableList.of(new bul()), bya.ay);
   }

   private static void a(che $$0, bpy<che> $$1) {
      $$1.a(
         cjn.k,
         10,
         ImmutableList.of(
            m, bte.a($$1x -> !$$0.A().d() || !$$0.a($$1x), chf::b, false), bso.a($$1x -> a($$0, $$1x), (float)$$0.g(bqe.i)), bsu.a(1.2F), new bup(), brw.a(18)
         ),
         bya.o
      );
   }

   private static boolean a(che $$0, box $$1) {
      return $$0.dM().c(bya.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(che $$0, box $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((box)$$0);
   }

   public static void a(box $$0) {
      if ($$0.dM().a(bya.aE)) {
         $$0.dM().a(bya.aE, axo.a, 1200L);
      }
   }

   public static void a(che $$0, ib $$1) {
      if ($$0.dJ().D_().a($$1) && !$$0.gl().isPresent() && !$$0.dM().c(bya.o).isPresent()) {
         a((box)$$0);
         $$0.dM().a(bya.aG, axo.a, 100L);
         $$0.dM().a(bya.n, new bqs($$1), 100L);
         $$0.dM().a(bya.az, $$1, 100L);
         $$0.dM().b(bya.m);
      }
   }
}
