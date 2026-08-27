import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cck {
   public static final int a = 8;
   public static final int b = 4;
   private static final bim c = aup.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bim j = bim.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bml<?> a(bml<ccj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cfk.a));
      $$0.b(cfk.b);
      $$0.f();
      return $$0;
   }

   private static void b(bml<ccj> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new boh(45, 90), new bol()));
   }

   private static void c(bml<ccj> $$0) {
      $$0.a(
         cfk.b,
         10,
         ImmutableList.of(
            bnb.a(bum.av, 200),
            new bmw(bkz.W, 0.6F),
            bpf.a(bum.av, 1.0F, 8, true),
            bpn.a(cck::d),
            bqo.a(ccj::w, bpf.b(bum.ap, 0.4F, 8, false)),
            bpb.a(8.0F, bim.a(30, 60)),
            bmz.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bml<ccj> $$0) {
      $$0.a(
         cfk.k,
         10,
         ImmutableList.of(
            bnb.a(bum.av, 200), new bmw(bkz.W, 0.6F), bpg.a(1.0F), bqo.a(ccj::w, boi.a(40)), bqo.a(bkq::o_, boi.a(15)), bpq.a(), bno.a(cck::i, bum.o)
         ),
         bum.o
      );
   }

   private static void e(bml<ccj> $$0) {
      $$0.a(cfk.n, 10, ImmutableList.of(bpf.b(bum.z, 1.3F, 15, false), a(), bpb.a(8.0F, bim.a(30, 60)), bno.a(cck::e, bum.z)), bum.z);
   }

   private static boy<ccj> a() {
      return new boy<>(ImmutableList.of(Pair.of(bot.a(0.4F), 2), Pair.of(bpi.a(0.4F, 3), 2), Pair.of(new bnm(30, 60), 1)));
   }

   protected static void a(ccj $$0) {
      bml<ccj> $$1 = $$0.dP();
      cfk $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cfk.k, cfk.n, cfk.b));
      cfk $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bum.o));
   }

   protected static void a(ccj $$0, bll $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == bkz.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(ccj $$0, bll $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(ccj $$0, bll $$1) {
      bml<ccj> $$3 = $$0.dP();
      bll $$2 = bne.a($$0, $$3.c(bum.z), $$1);
      $$2 = bne.a($$0, $$3.c(bum.o), $$2);
      e($$0, $$2);
   }

   private static void e(ccj $$0, bll $$1) {
      $$0.dP().b(bum.o);
      $$0.dP().b(bum.m);
      $$0.dP().a(bum.z, $$1, (long)c.a($$0.dN().z));
   }

   private static Optional<? extends bll> d(ccj $$0) {
      return !c($$0) && !i($$0) ? $$0.dP().c(bum.l) : Optional.empty();
   }

   static boolean a(ccj $$0, hx $$1) {
      Optional<hx> $$2 = $$0.dP().c(bum.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(ccj $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(ccj $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dP().c(bum.ar).orElse(0);
         int $$2 = $$0.dP().c(bum.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(ccj $$0, bll $$1) {
      bml<ccj> $$2 = $$0.dP();
      $$2.b(bum.aw);
      $$2.b(bum.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(ccj $$0, bll $$1) {
      if (!$$0.dP().c(cfk.n) || $$1.ai() != bkz.aw) {
         if ($$1.ai() != bkz.W) {
            if (!bne.a($$0, $$1, 4.0)) {
               if (bvq.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(ccj $$0, bll $$1) {
      bml<ccj> $$2 = $$0.dP();
      $$2.b(bum.E);
      $$2.b(bum.r);
      $$2.a(bum.o, $$1, 200L);
   }

   private static void h(ccj $$0, bll $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(ccj $$0, bll $$1) {
      if (!c($$0)) {
         Optional<bll> $$2 = $$0.dP().c(bum.o);
         bll $$3 = bne.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aqu> b(ccj $$0) {
      return $$0.dP().g().map($$1 -> a($$0, $$1));
   }

   private static aqu a(ccj $$0, cfk $$1) {
      if ($$1 == cfk.n || $$0.A()) {
         return aqv.lm;
      } else if ($$1 == cfk.k) {
         return aqv.lh;
      } else {
         return h($$0) ? aqv.lm : aqv.lg;
      }
   }

   private static List<ccj> g(ccj $$0) {
      return $$0.dP().c(bum.ao).orElse(ImmutableList.of());
   }

   private static boolean h(ccj $$0) {
      return $$0.dP().a(bum.av);
   }

   private static boolean i(ccj $$0) {
      return $$0.dP().a(bum.r);
   }

   protected static boolean c(ccj $$0) {
      return $$0.dP().a(bum.aw);
   }
}
