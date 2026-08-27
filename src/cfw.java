import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cfw {
   public static final int a = 8;
   public static final int b = 4;
   private static final blh c = axh.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final blh j = blh.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bpj<?> a(bpj<cfv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cfv> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new brg(45, 90), new brk()));
   }

   private static void c(bpj<cfv> $$0) {
      $$0.a(
         ciy.b,
         10,
         ImmutableList.of(
            bpz.a(bxl.aw, 200),
            new bpu(bnw.Y, 0.6F, 2),
            bse.a(bxl.aw, 1.0F, 8, true),
            bsm.a(cfw::d),
            btn.a(cfv::w, bse.b(bxl.aq, 0.4F, 8, false)),
            bsa.a(8.0F, blh.a(30, 60)),
            bpx.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bpj<cfv> $$0) {
      $$0.a(
         ciy.k,
         10,
         ImmutableList.of(
            bpz.a(bxl.aw, 200), new bpu(bnw.Y, 0.6F, 2), bsf.a(1.0F), btn.a(cfv::w, brh.a(40)), btn.a(bnl::o_, brh.a(15)), bsp.a(), bqm.a(cfw::i, bxl.o)
         ),
         bxl.o
      );
   }

   private static void e(bpj<cfv> $$0) {
      $$0.a(ciy.n, 10, ImmutableList.of(bse.b(bxl.z, 1.3F, 15, false), a(), bsa.a(8.0F, blh.a(30, 60)), bqm.a(cfw::e, bxl.z)), bxl.z);
   }

   private static brx<cfv> a() {
      return new brx<>(ImmutableList.of(Pair.of(brs.a(0.4F), 2), Pair.of(bsh.a(0.4F, 3), 2), Pair.of(new bqk(30, 60), 1)));
   }

   protected static void a(cfv $$0) {
      bpj<cfv> $$1 = $$0.dO();
      ciy $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ciy.k, ciy.n, ciy.b));
      ciy $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bxl.o));
   }

   protected static void a(cfv $$0, boi $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == bnw.ay && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cfv $$0, boi $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cfv $$0, boi $$1) {
      bpj<cfv> $$3 = $$0.dO();
      boi $$2 = bqc.a($$0, $$3.c(bxl.z), $$1);
      $$2 = bqc.a($$0, $$3.c(bxl.o), $$2);
      e($$0, $$2);
   }

   private static void e(cfv $$0, boi $$1) {
      $$0.dO().b(bxl.o);
      $$0.dO().b(bxl.m);
      $$0.dO().a(bxl.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends boi> d(cfv $$0) {
      return !c($$0) && !i($$0) ? $$0.dO().c(bxl.l) : Optional.empty();
   }

   static boolean a(cfv $$0, hz $$1) {
      Optional<hz> $$2 = $$0.dO().c(bxl.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cfv $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cfv $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dO().c(bxl.as).orElse(0);
         int $$2 = $$0.dO().c(bxl.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cfv $$0, boi $$1) {
      bpj<cfv> $$2 = $$0.dO();
      $$2.b(bxl.ax);
      $$2.b(bxl.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cfv $$0, boi $$1) {
      if (!$$0.dO().c(ciy.n) || $$1.ai() != bnw.ay) {
         if ($$1.ai() != bnw.Y) {
            if (!bqc.a($$0, $$1, 4.0)) {
               if (byr.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cfv $$0, boi $$1) {
      bpj<cfv> $$2 = $$0.dO();
      $$2.b(bxl.E);
      $$2.b(bxl.r);
      $$2.a(bxl.o, $$1, 200L);
   }

   private static void h(cfv $$0, boi $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cfv $$0, boi $$1) {
      if (!c($$0)) {
         Optional<boi> $$2 = $$0.dO().c(bxl.o);
         boi $$3 = bqc.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<atk> b(cfv $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static atk a(cfv $$0, ciy $$1) {
      if ($$1 == ciy.n || $$0.A()) {
         return atl.lW;
      } else if ($$1 == ciy.k) {
         return atl.lR;
      } else {
         return h($$0) ? atl.lW : atl.lQ;
      }
   }

   private static List<cfv> g(cfv $$0) {
      return $$0.dO().c(bxl.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cfv $$0) {
      return $$0.dO().a(bxl.aw);
   }

   private static boolean i(cfv $$0) {
      return $$0.dO().a(bxl.r);
   }

   protected static boolean c(cfv $$0) {
      return $$0.dO().a(bxl.ax);
   }
}
