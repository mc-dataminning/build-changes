import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cnk {
   public static final int a = 8;
   public static final int b = 4;
   public static final cwj c = cwr.po;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final brt d = baa.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final brt o = baa.a(10, 40);
   private static final brt p = baa.a(10, 30);
   private static final brt q = baa.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final brt A = baa.a(5, 7);
   private static final brt B = baa.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bwh<?> a(cnj $$0, bwh<cnj> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cqm.a));
      $$1.b(cqm.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnj $$0, azg $$1) {
      int $$2 = d.a($$1);
      $$0.ec().a(cej.ah, true, (long)$$2);
   }

   private static void a(bwh<cnj> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bye(45, 90), new byi(), bxw.a(), e(), f(), cnt.a(), cnp.a(119), bzl.a(300, cnk::a), bzo.a()));
   }

   private static void b(bwh<cnj> $$0) {
      $$0.a(
         cqm.b,
         10,
         ImmutableList.of(byx.a(cnk::b, 14.0F), bzk.a(($$0x, $$1) -> $$1.gp(), cnk::b), cal.a(cnj::m, cnq.a()), d(), g(), b(), c(), bza.a(buq.bR, 4))
      );
   }

   private static void b(cnj $$0, bwh<cnj> $$1) {
      $$1.a(
         cqm.k,
         10,
         ImmutableList.of(
            bzn.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), cal.a(cnk::c, bww.a(5, 0.75F)), bzd.a(1.0F), byf.a(20), new bxg(), cno.a(), bxk.a(cnk::g, cej.o)
         ),
         cej.o
      );
   }

   private static void c(bwh<cnj> $$0) {
      $$0.a(
         cqm.l,
         10,
         ImmutableList.of(
            d(),
            byx.a(cnk::b, 14.0F),
            bzk.a(($$0x, $$1) -> $$1.gp(), cnk::b),
            cal.a($$0x -> !$$0x.gw(), bxr.a(cej.ai, 2, 1.0F)),
            cal.a(cnj::gw, bxr.a(cej.ai, 4, 0.6F)),
            new byv(ImmutableList.of(Pair.of(byx.a(buq.aR, 8.0F), 1), Pair.of(byq.a(0.6F, 2, 1), 1), Pair.of(new bxi(10, 20), 1)))
         ),
         cej.ai
      );
   }

   private static void d(bwh<cnj> $$0) {
      $$0.a(cqm.m, 10, ImmutableList.of(bxs.a(cnk::t, 1.0F, true, 9), cnr.a(9), cns.a(200, 200)), cej.ad);
   }

   private static void e(bwh<cnj> $$0) {
      $$0.a(cqm.n, 10, ImmutableList.of(bzc.b(cej.z, 1.0F, 12, true), b(), c(), bxk.a(cnk::j, cej.z)), cej.z);
   }

   private static void f(bwh<cnj> $$0) {
      $$0.a(
         cqm.o,
         10,
         ImmutableList.of(
            byg.a(0.8F),
            byx.a(cnk::b, 8.0F),
            cal.a(cal.a(buj::bZ), bzu.a(ImmutableList.builder().addAll(a()).add(Pair.of(cal.a((Predicate<cnj>)($$0x -> true)), 1)).build())),
            bxh.a(8, cnk::a)
         ),
         cej.s
      );
   }

   private static ImmutableList<Pair<byj<bvf>, Integer>> a() {
      return ImmutableList.of(Pair.of(byx.a(buq.bR, 8.0F), 1), Pair.of(byx.a(buq.aR, 8.0F), 1), Pair.of(byx.a(8.0F), 1));
   }

   private static byv<bvf> b() {
      return new byv<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bxi(30, 60), 1)).build());
   }

   private static byv<cnj> c() {
      return new byv<>(
         ImmutableList.of(
            Pair.of(byq.a(0.6F), 2), Pair.of(bxv.a(buq.aR, 8, cej.q, 0.6F, 2), 2), Pair.of(cal.a(cnk::f, bzf.a(0.6F, 3)), 2), Pair.of(new bxi(30, 60), 1)
         )
      );
   }

   private static bwz<bvn> d() {
      return bzc.a(cej.aw, 1.0F, 8, false);
   }

   private static bwz<cnj> e() {
      return bxd.a(cnj::e_, cej.M, cej.z, B);
   }

   private static bwz<cnj> f() {
      return bxd.a(cnk::g, cej.ar, cej.z, A);
   }

   protected static void a(cnj $$0) {
      bwh<cnj> $$1 = $$0.ec();
      cqm $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqm.m, cqm.k, cqm.n, cqm.l, cqm.o, cqm.b));
      cqm $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cej.o));
      if (!$$1.a(cej.s) && e($$0)) {
         $$0.ae();
      }

      if (!$$1.a(cej.ai)) {
         $$1.b(cej.aj);
      }

      $$0.y($$1.a(cej.aj));
   }

   private static boolean e(cnj $$0) {
      if (!$$0.e_()) {
         return false;
      } else {
         buj $$1 = $$0.dl();
         return $$1 instanceof cnj && ((cnj)$$1).e_() || $$1 instanceof cnd && ((cnd)$$1).e_();
      }
   }

   protected static void a(arc $$0, cnj $$1, cla $$2) {
      i($$1);
      cwn $$3;
      if ($$2.l().a(cwr.tf)) {
         $$1.a($$2, $$2.l().M());
         $$3 = $$2.l();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.ec().b(cej.ae);
         a($$0, $$1, $$3);
         d((bvf)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cwn.j);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(arc $$0, cnj $$1, cwn $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bsh.b));
      }

      $$1.l($$2);
   }

   private static cwn a(cla $$0) {
      cwn $$1 = $$0.l();
      cwn $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(arc $$0, cnj $$1, boolean $$2) {
      cwn $$3 = $$1.b(bsh.b);
      $$1.a(bsh.b, cwn.j);
      if ($$1.gp()) {
         boolean $$4 = b($$3);
         if ($$2 && $$4) {
            a($$1, f($$1));
         } else if (!$$4) {
            boolean $$5 = !$$1.b($$0, $$3).f();
            if (!$$5) {
               c($$1, $$3);
            }
         }
      } else {
         boolean $$6 = !$$1.b($$0, $$3).f();
         if (!$$6) {
            cwn $$7 = $$1.eZ();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(arc $$0, cnj $$1) {
      if (p($$1) && !$$1.fa().f()) {
         $$1.a($$0, $$1.fa());
         $$1.a(bsh.b, cwn.j);
      }
   }

   private static void c(cnj $$0, cwn $$1) {
      cwn $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cnj $$0, List<cwn> $$1) {
      Optional<cov> $$2 = $$0.ec().c(cej.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cnj $$0, List<cwn> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cnj $$0, cov $$1, List<cwn> $$2) {
      a($$0, $$2, $$1.du());
   }

   private static void a(cnj $$0, List<cwn> $$1, fay $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bsh.b);

         for (cwn $$3 : $$1) {
            bxa.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cwn> f(cnj $$0) {
      evu $$1 = $$0.dW().p().bc().b(evl.aK);
      List<cwn> $$2 = $$1.a(new evs.a((arc)$$0.dW()).a(eyj.a, $$0).a(eyi.k));
      return $$2;
   }

   private static boolean a(bvf $$0, bvf $$1) {
      return $$1.aq() != buq.aj ? false : azg.a($$0.dW().ad()).i() < 0.1F;
   }

   protected static boolean a(cnj $$0, cwn $$1) {
      if ($$0.e_() && $$1.a(awx.U)) {
         return false;
      } else if ($$1.a(awx.S)) {
         return false;
      } else if (r($$0) && $$0.ec().a(cej.o)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(cwr.tf)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cwn $$0) {
      return $$0.a(awx.T);
   }

   private static boolean a(cnj $$0, buj $$1) {
      return !($$1 instanceof bvh $$2) ? false : !$$2.e_() || !$$2.bL() || g((bvf)$$0) || g($$2) || $$2 instanceof cnj && $$2.dl() == null;
   }

   private static boolean b(arc $$0, cnj $$1, bvf $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cnj $$0) {
      bwh<cnj> $$1 = $$0.ec();
      if ($$1.a(cej.ar)) {
         bvf $$2 = $$1.c(cej.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bvf> b(arc $$0, cnj $$1) {
      bwh<cnj> $$2 = $$1.ec();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bvf> $$3 = bxa.a($$1, cej.ab);
         if ($$3.isPresent() && cfp.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cej.ac)) {
               Optional<cov> $$4 = $$2.c(cej.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bvh> $$5 = $$2.c(cej.M);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cov> $$6 = $$2.c(cej.am);
               return $$6.isPresent() && cfp.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(arc $$0, cov $$1, boolean $$2) {
      List<cnj> $$3 = $$1.dW().a(cnj.class, $$1.cR().g(16.0));
      $$3.stream().filter(cnk::c).filter($$2x -> !$$2 || bxa.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().b(dgc.P)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bsi a(arc $$0, cnj $$1, cov $$2, bsh $$3) {
      cwn $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cwn $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bvf)$$1);
         i($$1);
         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   protected static boolean b(cnj $$0, cwn $$1) {
      return !r($$0) && !p($$0) && $$0.gp() && b($$1);
   }

   protected static void a(arc $$0, cnj $$1, bvf $$2) {
      if (!($$2 instanceof cnj)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bwh<cnj> $$3 = $$1.ec();
         $$3.b(cej.ai);
         $$3.b(cej.aj);
         $$3.b(cej.ad);
         if ($$2 instanceof cov) {
            $$3.a(cej.ag, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cej.z);
            }
         });
         if ($$1.e_()) {
            $$3.a(cej.z, $$2, 100L);
            if (cfp.d($$0, $$1, $$2)) {
               b($$0, (cni)$$1, $$2);
            }
         } else if ($$2.aq() == buq.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cni)$$1, $$2);
         }
      }
   }

   protected static void a(arc $$0, cni $$1, bvf $$2) {
      if (!$$1.ec().c(cqm.n)) {
         if (cfp.d($$0, $$1, $$2)) {
            if (!bxa.a($$1, $$2, 4.0)) {
               if ($$2.aq() == buq.bR && $$0.O().b(dgc.P)) {
                  d($$0, $$1, $$2);
                  a($$0, $$1);
               } else {
                  c($$0, $$1, $$2);
                  b($$0, $$1, $$2);
               }
            }
         }
      }
   }

   public static Optional<avy> b(cnj $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static avy a(cnj $$0, cqm $$1) {
      if ($$1 == cqm.k) {
         return avz.uh;
      } else if ($$0.x()) {
         return avz.um;
      } else if ($$1 == cqm.n && h($$0)) {
         return avz.um;
      } else if ($$1 == cqm.m) {
         return avz.uf;
      } else if ($$1 == cqm.l) {
         return avz.ui;
      } else if (e((bvf)$$0)) {
         return avz.uk;
      } else {
         return q($$0) ? avz.um : avz.ug;
      }
   }

   private static boolean h(cnj $$0) {
      bwh<cnj> $$1 = $$0.ec();
      return !$$1.a(cej.z) ? false : $$1.c(cej.z).get().a($$0, 12.0);
   }

   protected static List<cni> c(cnj $$0) {
      return $$0.ec().c(cej.ao).orElse(ImmutableList.of());
   }

   private static List<cni> d(cni $$0) {
      return $$0.ec().c(cej.an).orElse(ImmutableList.of());
   }

   public static boolean a(bvf $$0) {
      for (cwn $$1 : $$0.fd()) {
         if ($$1.a(awx.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cnj $$0) {
      $$0.ec().b(cej.m);
      $$0.L().m();
   }

   private static bwz<bvf> g() {
      byy.a $$0 = new byy.a(o);
      return bxd.a($$1 -> $$1.e_() && $$0.a($$1.dW().A), cej.al, cej.s, p);
   }

   protected static void b(arc $$0, cni $$1, bvf $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != buq.aj || $$2x.m() && ((cnd)$$2).gq()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(arc $$0, cni $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(arc $$0, cni $$1, bvf $$2) {
      if (cfp.d($$0, $$1, $$2)) {
         $$1.ec().b(cej.E);
         $$1.ec().a(cej.ab, $$2.cG(), 600L);
         if ($$2.aq() == buq.aj && $$1.m()) {
            b($$1);
         }

         if ($$2.aq() == buq.bR && $$0.O().b(dgc.P)) {
            $$1.ec().a(cej.ac, true, 600L);
         }
      }
   }

   private static void d(arc $$0, cni $$1, bvf $$2) {
      Optional<cov> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(arc $$0, cni $$1, bvf $$2) {
      Optional<bvf> $$3 = e($$1);
      bvf $$4 = bxa.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bvf> e(cni $$0) {
      return bxa.a($$0, cej.ab);
   }

   public static Optional<bvf> d(cnj $$0) {
      return $$0.ec().a(cej.z) ? $$0.ec().c(cej.z) : Optional.empty();
   }

   public static Optional<cov> a(cni $$0) {
      return $$0.ec().a(cej.l) ? $$0.ec().c(cej.l) : Optional.empty();
   }

   private static void a(cnj $$0, bvf $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cnj).forEach($$1x -> b((cnj)$$1x, $$1));
   }

   private static void b(cnj $$0, bvf $$1) {
      bwh<cnj> $$2 = $$0.ec();
      bvf $$3 = bxa.a($$0, $$2.c(cej.z), $$1);
      $$3 = bxa.a($$0, $$2.c(cej.o), $$3);
      c($$0, $$3);
   }

   private static boolean j(cnj $$0) {
      bwh<cnj> $$1 = $$0.ec();
      if (!$$1.a(cej.z)) {
         return true;
      } else {
         bvf $$2 = $$1.c(cej.z).get();
         buq<?> $$3 = $$2.aq();
         if ($$3 == buq.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cej.ar, $$2) : false;
         }
      }
   }

   private static boolean k(cnj $$0) {
      return !l($$0);
   }

   private static boolean l(cnj $$0) {
      int $$1 = $$0.ec().c(cej.as).orElse(0) + 1;
      int $$2 = $$0.ec().c(cej.at).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cnj $$0, bvf $$1) {
      $$0.ec().b(cej.ab);
      $$0.ec().b(cej.o);
      $$0.ec().b(cej.m);
      $$0.ec().a(cej.z, $$1, (long)q.a($$0.dW().A));
      b((cni)$$0);
   }

   protected static void b(cni $$0) {
      $$0.ec().a(cej.ah, true, (long)d.a($$0.dW().A));
   }

   private static void m(cnj $$0) {
      $$0.ec().a(cej.av, true, 200L);
   }

   private static fay n(cnj $$0) {
      fay $$1 = cgd.a($$0, 4, 2);
      return $$1 == null ? $$0.du() : $$1;
   }

   private static boolean o(cnj $$0) {
      return $$0.ec().a(cej.av);
   }

   protected static boolean c(cni $$0) {
      return $$0.ec().c(cqm.b);
   }

   private static boolean c(bvf $$0) {
      return $$0.b(cwr.wV);
   }

   private static void d(bvf $$0) {
      $$0.ec().a(cej.ad, true, 119L);
   }

   private static boolean p(cnj $$0) {
      return $$0.ec().a(cej.ad);
   }

   private static boolean b(cwn $$0) {
      return $$0.a(c);
   }

   private static boolean c(cwn $$0) {
      return $$0.a(awx.ab);
   }

   private static boolean q(cnj $$0) {
      return $$0.ec().a(cej.aw);
   }

   private static boolean e(bvf $$0) {
      return $$0.ec().a(cej.au);
   }

   private static boolean f(bvf $$0) {
      return !e($$0);
   }

   public static boolean b(bvf $$0) {
      return $$0.aq() == buq.bR && $$0.b(cnk::a);
   }

   private static boolean r(cnj $$0) {
      return $$0.ec().a(cej.ag);
   }

   private static boolean g(bvf $$0) {
      return $$0.ec().a(cej.x);
   }

   private static boolean s(cnj $$0) {
      return !$$0.fa().f();
   }

   private static boolean t(cnj $$0) {
      return $$0.fa().f() || !a($$0.fa());
   }

   public static boolean a(buq<?> $$0) {
      return $$0 == buq.bQ || $$0 == buq.bM;
   }
}
