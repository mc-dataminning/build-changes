import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class ccc {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = asy.f(100.0F);
   public static final int a = asy.f(133.59999F);
   public static final int b = asy.f(84.0F);
   private static final int i = asy.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bup<? extends buo<? super ccb>>> k = List.of(bup.d, bup.v);
   private static final List<btk<?>> l = List.of(
      btk.g,
      btk.h,
      btk.k,
      btk.l,
      btk.L,
      btk.n,
      btk.m,
      btk.E,
      btk.t,
      btk.o,
      btk.p,
      btk.B,
      btk.ax,
      btk.ay,
      btk.az,
      btk.aA,
      btk.aB,
      btk.aC,
      btk.aD,
      btk.aE,
      btk.aF,
      btk.aG,
      btk.aH,
      btk.aI,
      btk.aJ,
      btk.aK
   );
   private static final bmb<ccb> m = bpm.a(
      (Function<bpm.b<ccb>, ? extends App<bpm.c<ccb>, bpp<ccb>>>)($$0 -> $$0.group($$0.a(btk.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(atz.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(ccb $$0) {
      $$0.dN().a(ImmutableList.of(cei.y, cei.z, cei.x, cei.k, cei.w, cei.v, cei.b));
   }

   protected static blj<?> a(ccb $$0, Dynamic<?> $$1) {
      blj.b<ccb> $$2 = blj.a(l, k);
      blj<ccb> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cei.a));
      $$3.b(cei.b);
      $$3.f();
      return $$3;
   }

   private static void a(blj<ccb> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bot(0.8F), bpx.a(), new bnf(45, 90), new bnj()));
   }

   private static void b(blj<ccb> $$0) {
      $$0.a(cei.y, 5, ImmutableList.of(new bpt(a)), btk.aB);
   }

   private static void c(blj<ccb> $$0) {
      $$0.a(cei.z, ImmutableList.of(Pair.of(0, new bpu()), Pair.of(1, new bps(h))), ImmutableSet.of(Pair.of(btk.ax, btl.b), Pair.of(btk.aD, btl.b)));
   }

   private static void d(blj<ccb> $$0) {
      $$0.a(
         cei.b,
         10,
         ImmutableList.of(
            bpw.a(ccb::ge), bqa.a(), new bnw(ImmutableMap.of(btk.aA, btl.b), ImmutableList.of(Pair.of(bnr.a(0.5F), 2), Pair.of(new bmk(30, 60), 1)))
         )
      );
   }

   private static void e(blj<ccb> $$0) {
      $$0.a(cei.w, 5, ImmutableList.of(bpw.a(ccb::ge), bmt.a(btk.ay, 2, 0.7F)), btk.ay);
   }

   private static void f(blj<ccb> $$0) {
      $$0.a(cei.v, 5, ImmutableList.of(bpw.a(ccb::ge), new bpy(i)), btk.aA);
   }

   private static void g(blj<ccb> $$0) {
      $$0.a(cei.x, 10, ImmutableList.of(new bpv()), btk.ax);
   }

   private static void a(ccb $$0, blj<ccb> $$1) {
      $$1.a(
         cei.k,
         10,
         ImmutableList.of(
            m, boo.a($$1x -> !$$0.y().d() || !$$0.a($$1x), ccc::b, false), bny.a($$1x -> a($$0, $$1x), (float)$$0.b(blp.g)), boe.a(1.2F), new bpz(), bng.a(18)
         ),
         btk.o
      );
   }

   private static boolean a(ccb $$0, bkj $$1) {
      return $$0.dN().c(btk.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(ccb $$0, bkj $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bkj)$$0);
   }

   public static void a(bkj $$0) {
      if ($$0.dN().a(btk.aD)) {
         $$0.dN().a(btk.aD, atz.a, 1200L);
      }
   }

   public static void a(ccb $$0, ht $$1) {
      if ($$0.dL().C_().a($$1) && !$$0.ge().isPresent() && !$$0.dN().c(btk.o).isPresent()) {
         a((bkj)$$0);
         $$0.dN().a(btk.aF, atz.a, 100L);
         $$0.dN().a(btk.n, new bmd($$1), 100L);
         $$0.dN().a(btk.ay, $$1, 100L);
         $$0.dN().b(btk.m);
      }
   }
}
