import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cld {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqa c = azu.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqa j = bqa.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bum<?> a(bum<clc> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(coh.a));
      $$0.b(coh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bum<clc> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bwj(45, 90), new bwn()));
   }

   private static void c(bum<clc> $$0) {
      $$0.a(
         coh.b,
         10,
         ImmutableList.of(
            bvc.a(cco.aw, 200),
            new bux(bsv.Z, 0.6F, 2),
            bxh.a(cco.aw, 1.0F, 8, true),
            bxp.a(cld::d),
            byq.a(clc::u, bxh.b(cco.aq, 0.4F, 8, false)),
            bxd.a(8.0F, bqa.a(30, 60)),
            bva.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bum<clc> $$0) {
      $$0.a(
         coh.k,
         10,
         ImmutableList.of(
            bvc.a(cco.aw, 200), new bux(bsv.Z, 0.6F, 2), bxi.a(1.0F), byq.a(clc::u, bwk.a(40)), byq.a(bsj::p_, bwk.a(15)), bxs.a(), bvp.a(cld::i, cco.o)
         ),
         cco.o
      );
   }

   private static void e(bum<clc> $$0) {
      $$0.a(coh.n, 10, ImmutableList.of(bxh.b(cco.z, 1.3F, 15, false), a(), bxd.a(8.0F, bqa.a(30, 60)), bvp.a(cld::e, cco.z)), cco.z);
   }

   private static bxa<clc> a() {
      return new bxa<>(ImmutableList.of(Pair.of(bwv.a(0.4F), 2), Pair.of(bxk.a(0.4F, 3), 2), Pair.of(new bvn(30, 60), 1)));
   }

   protected static void a(clc $$0) {
      bum<clc> $$1 = $$0.dS();
      coh $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(coh.k, coh.n, coh.b));
      coh $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cco.o));
   }

   protected static void a(clc $$0, btk $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == bsv.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(clc $$0, btk $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(clc $$0, btk $$1) {
      bum<clc> $$3 = $$0.dS();
      btk $$2 = bvf.a($$0, $$3.c(cco.z), $$1);
      $$2 = bvf.a($$0, $$3.c(cco.o), $$2);
      e($$0, $$2);
   }

   private static void e(clc $$0, btk $$1) {
      $$0.dS().b(cco.o);
      $$0.dS().b(cco.m);
      $$0.dS().a(cco.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends btk> d(clc $$0) {
      return !c($$0) && !i($$0) ? $$0.dS().c(cco.l) : Optional.empty();
   }

   static boolean a(clc $$0, iz $$1) {
      Optional<iz> $$2 = $$0.dS().c(cco.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(clc $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(clc $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dS().c(cco.as).orElse(0);
         int $$2 = $$0.dS().c(cco.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(clc $$0, btk $$1) {
      bum<clc> $$2 = $$0.dS();
      $$2.b(cco.ax);
      $$2.b(cco.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(clc $$0, btk $$1) {
      if (!$$0.dS().c(coh.n) || $$1.ak() != bsv.aA) {
         if ($$1.ak() != bsv.Z) {
            if (!bvf.a($$0, $$1, 4.0)) {
               if (cdu.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(clc $$0, btk $$1) {
      bum<clc> $$2 = $$0.dS();
      $$2.b(cco.E);
      $$2.b(cco.r);
      $$2.a(cco.o, $$1, 200L);
   }

   private static void h(clc $$0, btk $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(clc $$0, btk $$1) {
      if (!c($$0)) {
         Optional<btk> $$2 = $$0.dS().c(cco.o);
         btk $$3 = bvf.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avv> b(clc $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avv a(clc $$0, coh $$1) {
      if ($$1 == coh.n || $$0.y()) {
         return avw.mu;
      } else if ($$1 == coh.k) {
         return avw.mp;
      } else {
         return h($$0) ? avw.mu : avw.mo;
      }
   }

   private static List<clc> g(clc $$0) {
      return $$0.dS().c(cco.ap).orElse(ImmutableList.of());
   }

   private static boolean h(clc $$0) {
      return $$0.dS().a(cco.aw);
   }

   private static boolean i(clc $$0) {
      return $$0.dS().a(cco.r);
   }

   protected static boolean c(clc $$0) {
      return $$0.dS().a(cco.ax);
   }
}
