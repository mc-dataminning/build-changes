import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class chd {
   public static final int a = 8;
   public static final int b = 4;
   private static final bmn c = axv.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bmn j = bmn.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bqp<?> a(bqp<chc> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<chc> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bsm(45, 90), new bsq()));
   }

   private static void c(bqp<chc> $$0) {
      $$0.a(
         ckh.b,
         10,
         ImmutableList.of(
            brf.a(byr.aw, 200),
            new bra(bpc.Z, 0.6F, 2),
            btk.a(byr.aw, 1.0F, 8, true),
            bts.a(chd::d),
            but.a(chc::s, btk.b(byr.aq, 0.4F, 8, false)),
            btg.a(8.0F, bmn.a(30, 60)),
            brd.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bqp<chc> $$0) {
      $$0.a(
         ckh.k,
         10,
         ImmutableList.of(
            brf.a(byr.aw, 200), new bra(bpc.Z, 0.6F, 2), btl.a(1.0F), but.a(chc::s, bsn.a(40)), but.a(bor::o_, bsn.a(15)), btv.a(), brs.a(chd::i, byr.o)
         ),
         byr.o
      );
   }

   private static void e(bqp<chc> $$0) {
      $$0.a(ckh.n, 10, ImmutableList.of(btk.b(byr.z, 1.3F, 15, false), a(), btg.a(8.0F, bmn.a(30, 60)), brs.a(chd::e, byr.z)), byr.z);
   }

   private static btd<chc> a() {
      return new btd<>(ImmutableList.of(Pair.of(bsy.a(0.4F), 2), Pair.of(btn.a(0.4F, 3), 2), Pair.of(new brq(30, 60), 1)));
   }

   protected static void a(chc $$0) {
      bqp<chc> $$1 = $$0.dP();
      ckh $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ckh.k, ckh.n, ckh.b));
      ckh $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(byr.o));
   }

   protected static void a(chc $$0, bpo $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == bpc.az && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(chc $$0, bpo $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(chc $$0, bpo $$1) {
      bqp<chc> $$3 = $$0.dP();
      bpo $$2 = bri.a($$0, $$3.c(byr.z), $$1);
      $$2 = bri.a($$0, $$3.c(byr.o), $$2);
      e($$0, $$2);
   }

   private static void e(chc $$0, bpo $$1) {
      $$0.dP().b(byr.o);
      $$0.dP().b(byr.m);
      $$0.dP().a(byr.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends bpo> d(chc $$0) {
      return !c($$0) && !i($$0) ? $$0.dP().c(byr.l) : Optional.empty();
   }

   static boolean a(chc $$0, ib $$1) {
      Optional<ib> $$2 = $$0.dP().c(byr.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(chc $$0) {
      return $$0.s() && !f($$0);
   }

   private static boolean f(chc $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dP().c(byr.as).orElse(0);
         int $$2 = $$0.dP().c(byr.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(chc $$0, bpo $$1) {
      bqp<chc> $$2 = $$0.dP();
      $$2.b(byr.ax);
      $$2.b(byr.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(chc $$0, bpo $$1) {
      if (!$$0.dP().c(ckh.n) || $$1.ai() != bpc.az) {
         if ($$1.ai() != bpc.Z) {
            if (!bri.a($$0, $$1, 4.0)) {
               if (bzx.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(chc $$0, bpo $$1) {
      bqp<chc> $$2 = $$0.dP();
      $$2.b(byr.E);
      $$2.b(byr.r);
      $$2.a(byr.o, $$1, 200L);
   }

   private static void h(chc $$0, bpo $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(chc $$0, bpo $$1) {
      if (!c($$0)) {
         Optional<bpo> $$2 = $$0.dP().c(byr.o);
         bpo $$3 = bri.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<atx> b(chc $$0) {
      return $$0.dP().g().map($$1 -> a($$0, $$1));
   }

   private static atx a(chc $$0, ckh $$1) {
      if ($$1 == ckh.n || $$0.y()) {
         return aty.lZ;
      } else if ($$1 == ckh.k) {
         return aty.lU;
      } else {
         return h($$0) ? aty.lZ : aty.lT;
      }
   }

   private static List<chc> g(chc $$0) {
      return $$0.dP().c(byr.ap).orElse(ImmutableList.of());
   }

   private static boolean h(chc $$0) {
      return $$0.dP().a(byr.aw);
   }

   private static boolean i(chc $$0) {
      return $$0.dP().a(byr.r);
   }

   protected static boolean c(chc $$0) {
      return $$0.dP().a(byr.ax);
   }
}
