import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cas {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = arp.f(100.0F);
   public static final int a = arp.f(133.59999F);
   public static final int b = arp.f(84.0F);
   private static final int i = arp.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<btf<? extends bte<? super car>>> k = List.of(btf.d, btf.v);
   private static final List<bsa<?>> l = List.of(
      bsa.g,
      bsa.h,
      bsa.k,
      bsa.l,
      bsa.L,
      bsa.n,
      bsa.m,
      bsa.E,
      bsa.t,
      bsa.o,
      bsa.p,
      bsa.B,
      bsa.ax,
      bsa.ay,
      bsa.az,
      bsa.aA,
      bsa.aB,
      bsa.aC,
      bsa.aD,
      bsa.aE,
      bsa.aF,
      bsa.aG,
      bsa.aH,
      bsa.aI,
      bsa.aJ,
      bsa.aK
   );
   private static final bkr<car> m = boc.a(
      (Function<boc.b<car>, ? extends App<boc.c<car>, bof<car>>>)($$0 -> $$0.group($$0.a(bsa.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(asp.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(car $$0) {
      $$0.dM().a(ImmutableList.of(ccy.y, ccy.z, ccy.x, ccy.k, ccy.w, ccy.v, ccy.b));
   }

   protected static bjz<?> a(car $$0, Dynamic<?> $$1) {
      bjz.b<car> $$2 = bjz.a(l, k);
      bjz<car> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ccy.a));
      $$3.b(ccy.b);
      $$3.f();
      return $$3;
   }

   private static void a(bjz<car> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new bnj(0.8F), bon.a(), new blv(45, 90), new blz()));
   }

   private static void b(bjz<car> $$0) {
      $$0.a(ccy.y, 5, ImmutableList.of(new boj(a)), bsa.aB);
   }

   private static void c(bjz<car> $$0) {
      $$0.a(ccy.z, ImmutableList.of(Pair.of(0, new bok()), Pair.of(1, new boi(h))), ImmutableSet.of(Pair.of(bsa.ax, bsb.b), Pair.of(bsa.aD, bsb.b)));
   }

   private static void d(bjz<car> $$0) {
      $$0.a(
         ccy.b,
         10,
         ImmutableList.of(
            bom.a(car::fZ), boq.a(), new bmm(ImmutableMap.of(bsa.aA, bsb.b), ImmutableList.of(Pair.of(bmh.a(0.5F), 2), Pair.of(new bla(30, 60), 1)))
         )
      );
   }

   private static void e(bjz<car> $$0) {
      $$0.a(ccy.w, 5, ImmutableList.of(bom.a(car::fZ), blj.a(bsa.ay, 2, 0.7F)), bsa.ay);
   }

   private static void f(bjz<car> $$0) {
      $$0.a(ccy.v, 5, ImmutableList.of(bom.a(car::fZ), new boo(i)), bsa.aA);
   }

   private static void g(bjz<car> $$0) {
      $$0.a(ccy.x, 10, ImmutableList.of(new bol()), bsa.ax);
   }

   private static void a(car $$0, bjz<car> $$1) {
      $$1.a(
         ccy.k,
         10,
         ImmutableList.of(
            m, bne.a($$1x -> !$$0.t().d() || !$$0.a($$1x), cas::b, false), bmo.a($$1x -> a($$0, $$1x), (float)$$0.b(bkf.b)), bmu.a(1.2F), new bop(), blw.a(18)
         ),
         bsa.o
      );
   }

   private static boolean a(car $$0, biy $$1) {
      return $$0.dM().c(bsa.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(car $$0, biy $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((biy)$$0);
   }

   public static void a(biy $$0) {
      if ($$0.dM().a(bsa.aD)) {
         $$0.dM().a(bsa.aD, asp.a, 1200L);
      }
   }

   public static void a(car $$0, gu $$1) {
      if ($$0.dK().w_().a($$1) && !$$0.fZ().isPresent() && !$$0.dM().c(bsa.o).isPresent()) {
         a((biy)$$0);
         $$0.dM().a(bsa.aF, asp.a, 100L);
         $$0.dM().a(bsa.n, new bkt($$1), 100L);
         $$0.dM().a(bsa.ay, $$1, 100L);
         $$0.dM().b(bsa.m);
      }
   }
}
