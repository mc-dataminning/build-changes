import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cnc {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azf.f(100.0F);
   public static final int a = azf.f(133.59999F);
   public static final int b = azf.f(84.0F);
   private static final int i = azf.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cex<? extends cew<? super cnb>>> k = List.of(cex.d, cex.x);
   private static final List<cdq<?>> l = List.of(
      cdq.g,
      cdq.h,
      cdq.k,
      cdq.l,
      cdq.M,
      cdq.n,
      cdq.m,
      cdq.E,
      cdq.t,
      cdq.o,
      cdq.p,
      cdq.B,
      cdq.ay,
      cdq.az,
      cdq.aA,
      cdq.aB,
      cdq.aC,
      cdq.aD,
      cdq.aE,
      cdq.aF,
      cdq.aG,
      cdq.aH,
      cdq.aI,
      cdq.aJ,
      cdq.aK,
      cdq.aL
   );
   private static final bwg<cnb> m = bzs.a(
      (Function<bzs.b<cnb>, ? extends App<bzs.c<cnb>, bzv<cnb>>>)($$0 -> $$0.group($$0.a(cdq.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bak.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cnb $$0) {
      $$0.dY().a(ImmutableList.of(cpp.y, cpp.z, cpp.x, cpp.k, cpp.w, cpp.v, cpp.b));
   }

   protected static bvo<?> a(cnb $$0, Dynamic<?> $$1) {
      bvo.b<cnb> $$2 = bvo.a(l, k);
      bvo<cnb> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cpp.a));
      $$3.b(cpp.b);
      $$3.f();
      return $$3;
   }

   private static void a(bvo<cnb> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new byz(0.8F), cad.a(), new bxl(45, 90), new bxp()));
   }

   private static void b(bvo<cnb> $$0) {
      $$0.a(cpp.y, 5, ImmutableList.of(new bzz(a)), cdq.aC);
   }

   private static void c(bvo<cnb> $$0) {
      $$0.a(cpp.z, ImmutableList.of(Pair.of(0, new caa()), Pair.of(1, new bzy(h))), ImmutableSet.of(Pair.of(cdq.ay, cdr.b), Pair.of(cdq.aE, cdr.b)));
   }

   private static void d(bvo<cnb> $$0) {
      $$0.a(
         cpp.b,
         10,
         ImmutableList.of(
            cac.a(cnb::go), cag.a(), new byc(ImmutableMap.of(cdq.aB, cdr.b), ImmutableList.of(Pair.of(bxx.a(0.5F), 2), Pair.of(new bwp(30, 60), 1)))
         )
      );
   }

   private static void e(bvo<cnb> $$0) {
      $$0.a(cpp.w, 5, ImmutableList.of(cac.a(cnb::go), bwy.a(cdq.az, 2, 0.7F)), cdq.az);
   }

   private static void f(bvo<cnb> $$0) {
      $$0.a(cpp.v, 5, ImmutableList.of(cac.a(cnb::go), new cae(i)), cdq.aB);
   }

   private static void g(bvo<cnb> $$0) {
      $$0.a(cpp.x, 10, ImmutableList.of(new cab()), cdq.ay);
   }

   private static void a(cnb $$0, bvo<cnb> $$1) {
      $$1.a(
         cpp.k,
         10,
         ImmutableList.of(
            m, byu.a($$1x -> !$$0.y().d() || !$$0.c($$1x), cnc::b, false), bye.a($$1x -> a($$0, $$1x), (float)$$0.h(bvu.m)), byk.a(1.2F), new caf(), bxm.a(18)
         ),
         cdq.o
      );
   }

   private static boolean a(cnb $$0, bun $$1) {
      return $$0.dY().c(cdq.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cnb $$0, bun $$1) {
      if (!$$0.c($$1)) {
         $$0.d($$1);
      }

      a((bun)$$0);
   }

   public static void a(bun $$0) {
      if ($$0.dY().a(cdq.aE)) {
         $$0.dY().a(cdq.aE, bak.a, 1200L);
      }
   }

   public static void a(cnb $$0, jf $$1) {
      if ($$0.dS().B_().a($$1) && !$$0.go().isPresent() && !$$0.dY().c(cdq.o).isPresent()) {
         a((bun)$$0);
         $$0.dY().a(cdq.aG, bak.a, 100L);
         $$0.dY().a(cdq.n, new bwi($$1), 100L);
         $$0.dY().a(cdq.az, $$1, 100L);
         $$0.dY().b(cdq.m);
      }
   }
}
