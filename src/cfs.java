import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cfs {
   public static final int a = 8;
   public static final int b = 4;
   private static final blf c = axh.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final blf j = blf.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bpf<?> a(bpf<cfr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cfr> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new brc(45, 90), new brg()));
   }

   private static void c(bpf<cfr> $$0) {
      $$0.a(
         ciu.b,
         10,
         ImmutableList.of(
            bpv.a(bxh.aw, 200),
            new bpq(bnu.Y, 0.6F, 2),
            bsa.a(bxh.aw, 1.0F, 8, true),
            bsi.a(cfs::d),
            btj.a(cfr::w, bsa.b(bxh.aq, 0.4F, 8, false)),
            brw.a(8.0F, blf.a(30, 60)),
            bpt.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bpf<cfr> $$0) {
      $$0.a(
         ciu.k,
         10,
         ImmutableList.of(
            bpv.a(bxh.aw, 200), new bpq(bnu.Y, 0.6F, 2), bsb.a(1.0F), btj.a(cfr::w, brd.a(40)), btj.a(bnj::o_, brd.a(15)), bsl.a(), bqi.a(cfs::i, bxh.o)
         ),
         bxh.o
      );
   }

   private static void e(bpf<cfr> $$0) {
      $$0.a(ciu.n, 10, ImmutableList.of(bsa.b(bxh.z, 1.3F, 15, false), a(), brw.a(8.0F, blf.a(30, 60)), bqi.a(cfs::e, bxh.z)), bxh.z);
   }

   private static brt<cfr> a() {
      return new brt<>(ImmutableList.of(Pair.of(bro.a(0.4F), 2), Pair.of(bsd.a(0.4F, 3), 2), Pair.of(new bqg(30, 60), 1)));
   }

   protected static void a(cfr $$0) {
      bpf<cfr> $$1 = $$0.dO();
      ciu $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ciu.k, ciu.n, ciu.b));
      ciu $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bxh.o));
   }

   protected static void a(cfr $$0, bog $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == bnu.ay && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cfr $$0, bog $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cfr $$0, bog $$1) {
      bpf<cfr> $$3 = $$0.dO();
      bog $$2 = bpy.a($$0, $$3.c(bxh.z), $$1);
      $$2 = bpy.a($$0, $$3.c(bxh.o), $$2);
      e($$0, $$2);
   }

   private static void e(cfr $$0, bog $$1) {
      $$0.dO().b(bxh.o);
      $$0.dO().b(bxh.m);
      $$0.dO().a(bxh.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends bog> d(cfr $$0) {
      return !c($$0) && !i($$0) ? $$0.dO().c(bxh.l) : Optional.empty();
   }

   static boolean a(cfr $$0, hz $$1) {
      Optional<hz> $$2 = $$0.dO().c(bxh.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cfr $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cfr $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dO().c(bxh.as).orElse(0);
         int $$2 = $$0.dO().c(bxh.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cfr $$0, bog $$1) {
      bpf<cfr> $$2 = $$0.dO();
      $$2.b(bxh.ax);
      $$2.b(bxh.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cfr $$0, bog $$1) {
      if (!$$0.dO().c(ciu.n) || $$1.ai() != bnu.ay) {
         if ($$1.ai() != bnu.Y) {
            if (!bpy.a($$0, $$1, 4.0)) {
               if (byn.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cfr $$0, bog $$1) {
      bpf<cfr> $$2 = $$0.dO();
      $$2.b(bxh.E);
      $$2.b(bxh.r);
      $$2.a(bxh.o, $$1, 200L);
   }

   private static void h(cfr $$0, bog $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cfr $$0, bog $$1) {
      if (!c($$0)) {
         Optional<bog> $$2 = $$0.dO().c(bxh.o);
         bog $$3 = bpy.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<atj> b(cfr $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static atj a(cfr $$0, ciu $$1) {
      if ($$1 == ciu.n || $$0.A()) {
         return atk.lV;
      } else if ($$1 == ciu.k) {
         return atk.lQ;
      } else {
         return h($$0) ? atk.lV : atk.lP;
      }
   }

   private static List<cfr> g(cfr $$0) {
      return $$0.dO().c(bxh.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cfr $$0) {
      return $$0.dO().a(bxh.aw);
   }

   private static boolean i(cfr $$0) {
      return $$0.dO().a(bxh.r);
   }

   protected static boolean c(cfr $$0) {
      return $$0.dO().a(bxh.ax);
   }
}
