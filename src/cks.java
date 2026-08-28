import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cks {
   public static final int a = 8;
   public static final int b = 4;
   private static final bpo c = aze.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bpo j = bpo.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bua<?> a(bua<ckr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bua<ckr> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bvx(45, 90), new bwb()));
   }

   private static void c(bua<ckr> $$0) {
      $$0.a(
         cnw.b,
         10,
         ImmutableList.of(
            buq.a(ccc.aw, 200),
            new bul(bsj.Z, 0.6F, 2),
            bwv.a(ccc.aw, 1.0F, 8, true),
            bxd.a(cks::d),
            bye.a(ckr::u, bwv.b(ccc.aq, 0.4F, 8, false)),
            bwr.a(8.0F, bpo.a(30, 60)),
            buo.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bua<ckr> $$0) {
      $$0.a(
         cnw.k,
         10,
         ImmutableList.of(
            buq.a(ccc.aw, 200), new bul(bsj.Z, 0.6F, 2), bww.a(1.0F), bye.a(ckr::u, bvy.a(40)), bye.a(brx::p_, bvy.a(15)), bxg.a(), bvd.a(cks::i, ccc.o)
         ),
         ccc.o
      );
   }

   private static void e(bua<ckr> $$0) {
      $$0.a(cnw.n, 10, ImmutableList.of(bwv.b(ccc.z, 1.3F, 15, false), a(), bwr.a(8.0F, bpo.a(30, 60)), bvd.a(cks::e, ccc.z)), ccc.z);
   }

   private static bwo<ckr> a() {
      return new bwo<>(ImmutableList.of(Pair.of(bwj.a(0.4F), 2), Pair.of(bwy.a(0.4F, 3), 2), Pair.of(new bvb(30, 60), 1)));
   }

   protected static void a(ckr $$0) {
      bua<ckr> $$1 = $$0.dT();
      cnw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnw.k, cnw.n, cnw.b));
      cnw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccc.o));
   }

   protected static void a(ckr $$0, bsy $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == bsj.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(ckr $$0, bsy $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(ckr $$0, bsy $$1) {
      bua<ckr> $$3 = $$0.dT();
      bsy $$2 = but.a($$0, $$3.c(ccc.z), $$1);
      $$2 = but.a($$0, $$3.c(ccc.o), $$2);
      e($$0, $$2);
   }

   private static void e(ckr $$0, bsy $$1) {
      $$0.dT().b(ccc.o);
      $$0.dT().b(ccc.m);
      $$0.dT().a(ccc.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends bsy> d(ckr $$0) {
      return !c($$0) && !i($$0) ? $$0.dT().c(ccc.l) : Optional.empty();
   }

   static boolean a(ckr $$0, ja $$1) {
      Optional<ja> $$2 = $$0.dT().c(ccc.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(ckr $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(ckr $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dT().c(ccc.as).orElse(0);
         int $$2 = $$0.dT().c(ccc.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(ckr $$0, bsy $$1) {
      bua<ckr> $$2 = $$0.dT();
      $$2.b(ccc.ax);
      $$2.b(ccc.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(ckr $$0, bsy $$1) {
      if (!$$0.dT().c(cnw.n) || $$1.ak() != bsj.aA) {
         if ($$1.ak() != bsj.Z) {
            if (!but.a($$0, $$1, 4.0)) {
               if (cdi.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(ckr $$0, bsy $$1) {
      bua<ckr> $$2 = $$0.dT();
      $$2.b(ccc.E);
      $$2.b(ccc.r);
      $$2.a(ccc.o, $$1, 200L);
   }

   private static void h(ckr $$0, bsy $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(ckr $$0, bsy $$1) {
      if (!c($$0)) {
         Optional<bsy> $$2 = $$0.dT().c(ccc.o);
         bsy $$3 = but.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<ave> b(ckr $$0) {
      return $$0.dT().g().map($$1 -> a($$0, $$1));
   }

   private static ave a(ckr $$0, cnw $$1) {
      if ($$1 == cnw.n || $$0.y()) {
         return avf.mu;
      } else if ($$1 == cnw.k) {
         return avf.mp;
      } else {
         return h($$0) ? avf.mu : avf.mo;
      }
   }

   private static List<ckr> g(ckr $$0) {
      return $$0.dT().c(ccc.ap).orElse(ImmutableList.of());
   }

   private static boolean h(ckr $$0) {
      return $$0.dT().a(ccc.aw);
   }

   private static boolean i(ckr $$0) {
      return $$0.dT().a(ccc.r);
   }

   protected static boolean c(ckr $$0) {
      return $$0.dT().a(ccc.ax);
   }
}
