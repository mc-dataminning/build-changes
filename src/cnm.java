import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cnm {
   public static final int a = 8;
   public static final int b = 4;
   public static final cwl c = cwt.po;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bru d = bab.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bru o = bab.a(10, 40);
   private static final bru p = bab.a(10, 30);
   private static final bru q = bab.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bru A = bab.a(5, 7);
   private static final bru B = bab.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bwi<?> a(cnl $$0, bwi<cnl> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cqo.a));
      $$1.b(cqo.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnl $$0, azh $$1) {
      int $$2 = d.a($$1);
      $$0.ec().a(cek.ah, true, (long)$$2);
   }

   private static void a(bwi<cnl> $$0) {
      $$0.a(cqo.a, 0, ImmutableList.of(new byf(45, 90), new byj(), bxx.a(), e(), f(), cnv.a(), cnr.a(119), bzm.a(300, cnm::a), bzp.a()));
   }

   private static void b(bwi<cnl> $$0) {
      $$0.a(
         cqo.b,
         10,
         ImmutableList.of(byy.a(cnm::b, 14.0F), bzl.a(($$0x, $$1) -> $$1.gp(), cnm::b), cam.a(cnl::m, cns.a()), d(), g(), b(), c(), bzb.a(bur.bS, 4))
      );
   }

   private static void b(cnl $$0, bwi<cnl> $$1) {
      $$1.a(
         cqo.k,
         10,
         ImmutableList.of(
            bzo.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), cam.a(cnm::c, bwx.a(5, 0.75F)), bze.a(1.0F), byg.a(20), new bxh(), cnq.a(), bxl.a(cnm::g, cek.o)
         ),
         cek.o
      );
   }

   private static void c(bwi<cnl> $$0) {
      $$0.a(
         cqo.l,
         10,
         ImmutableList.of(
            d(),
            byy.a(cnm::b, 14.0F),
            bzl.a(($$0x, $$1) -> $$1.gp(), cnm::b),
            cam.a($$0x -> !$$0x.gw(), bxs.a(cek.ai, 2, 1.0F)),
            cam.a(cnl::gw, bxs.a(cek.ai, 4, 0.6F)),
            new byw(ImmutableList.of(Pair.of(byy.a(bur.aS, 8.0F), 1), Pair.of(byr.a(0.6F, 2, 1), 1), Pair.of(new bxj(10, 20), 1)))
         ),
         cek.ai
      );
   }

   private static void d(bwi<cnl> $$0) {
      $$0.a(cqo.m, 10, ImmutableList.of(bxt.a(cnm::t, 1.0F, true, 9), cnt.a(9), cnu.a(200, 200)), cek.ad);
   }

   private static void e(bwi<cnl> $$0) {
      $$0.a(cqo.n, 10, ImmutableList.of(bzd.b(cek.z, 1.0F, 12, true), b(), c(), bxl.a(cnm::j, cek.z)), cek.z);
   }

   private static void f(bwi<cnl> $$0) {
      $$0.a(
         cqo.o,
         10,
         ImmutableList.of(
            byh.a(0.8F),
            byy.a(cnm::b, 8.0F),
            cam.a(cam.a(buk::bZ), bzv.a(ImmutableList.builder().addAll(a()).add(Pair.of(cam.a((Predicate<cnl>)($$0x -> true)), 1)).build())),
            bxi.a(8, cnm::a)
         ),
         cek.s
      );
   }

   private static ImmutableList<Pair<byk<bvg>, Integer>> a() {
      return ImmutableList.of(Pair.of(byy.a(bur.bS, 8.0F), 1), Pair.of(byy.a(bur.aS, 8.0F), 1), Pair.of(byy.a(8.0F), 1));
   }

   private static byw<bvg> b() {
      return new byw<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bxj(30, 60), 1)).build());
   }

   private static byw<cnl> c() {
      return new byw<>(
         ImmutableList.of(
            Pair.of(byr.a(0.6F), 2), Pair.of(bxw.a(bur.aS, 8, cek.q, 0.6F, 2), 2), Pair.of(cam.a(cnm::f, bzg.a(0.6F, 3)), 2), Pair.of(new bxj(30, 60), 1)
         )
      );
   }

   private static bxa<bvo> d() {
      return bzd.a(cek.aw, 1.0F, 8, false);
   }

   private static bxa<cnl> e() {
      return bxe.a(cnl::e_, cek.M, cek.z, B);
   }

   private static bxa<cnl> f() {
      return bxe.a(cnm::g, cek.ar, cek.z, A);
   }

   protected static void a(cnl $$0) {
      bwi<cnl> $$1 = $$0.ec();
      cqo $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqo.m, cqo.k, cqo.n, cqo.l, cqo.o, cqo.b));
      cqo $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cek.o));
      if (!$$1.a(cek.s) && e($$0)) {
         $$0.ae();
      }

      if (!$$1.a(cek.ai)) {
         $$1.b(cek.aj);
      }

      $$0.y($$1.a(cek.aj));
   }

   private static boolean e(cnl $$0) {
      if (!$$0.e_()) {
         return false;
      } else {
         buk $$1 = $$0.dl();
         return $$1 instanceof cnl && ((cnl)$$1).e_() || $$1 instanceof cnf && ((cnf)$$1).e_();
      }
   }

   protected static void a(arc $$0, cnl $$1, clb $$2) {
      i($$1);
      cwp $$3;
      if ($$2.l().a(cwt.tf)) {
         $$1.a($$2, $$2.l().M());
         $$3 = $$2.l();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.ec().b(cek.ae);
         a($$0, $$1, $$3);
         d((bvg)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cwp.j);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(arc $$0, cnl $$1, cwp $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bsi.b));
      }

      $$1.l($$2);
   }

   private static cwp a(clb $$0) {
      cwp $$1 = $$0.l();
      cwp $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(arc $$0, cnl $$1, boolean $$2) {
      cwp $$3 = $$1.b(bsi.b);
      $$1.a(bsi.b, cwp.j);
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
            cwp $$7 = $$1.eZ();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(arc $$0, cnl $$1) {
      if (p($$1) && !$$1.fa().f()) {
         $$1.a($$0, $$1.fa());
         $$1.a(bsi.b, cwp.j);
      }
   }

   private static void c(cnl $$0, cwp $$1) {
      cwp $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cnl $$0, List<cwp> $$1) {
      Optional<cox> $$2 = $$0.ec().c(cek.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cnl $$0, List<cwp> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cnl $$0, cox $$1, List<cwp> $$2) {
      a($$0, $$2, $$1.du());
   }

   private static void a(cnl $$0, List<cwp> $$1, fba $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bsi.b);

         for (cwp $$3 : $$1) {
            bxb.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cwp> f(cnl $$0) {
      evw $$1 = $$0.dW().p().bc().b(evn.aK);
      List<cwp> $$2 = $$1.a(new evu.a((arc)$$0.dW()).a(eyl.a, $$0).a(eyk.k));
      return $$2;
   }

   private static boolean a(bvg $$0, bvg $$1) {
      return $$1.aq() != bur.ak ? false : azh.a($$0.dW().ad()).i() < 0.1F;
   }

   protected static boolean a(cnl $$0, cwp $$1) {
      if ($$0.e_() && $$1.a(awy.U)) {
         return false;
      } else if ($$1.a(awy.S)) {
         return false;
      } else if (r($$0) && $$0.ec().a(cek.o)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(cwt.tf)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cwp $$0) {
      return $$0.a(awy.T);
   }

   private static boolean a(cnl $$0, buk $$1) {
      return !($$1 instanceof bvi $$2) ? false : !$$2.e_() || !$$2.bL() || g((bvg)$$0) || g($$2) || $$2 instanceof cnl && $$2.dl() == null;
   }

   private static boolean b(arc $$0, cnl $$1, bvg $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cnl $$0) {
      bwi<cnl> $$1 = $$0.ec();
      if ($$1.a(cek.ar)) {
         bvg $$2 = $$1.c(cek.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bvg> b(arc $$0, cnl $$1) {
      bwi<cnl> $$2 = $$1.ec();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bvg> $$3 = bxb.a($$1, cek.ab);
         if ($$3.isPresent() && cfq.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cek.ac)) {
               Optional<cox> $$4 = $$2.c(cek.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bvi> $$5 = $$2.c(cek.M);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cox> $$6 = $$2.c(cek.am);
               return $$6.isPresent() && cfq.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(arc $$0, cox $$1, boolean $$2) {
      List<cnl> $$3 = $$1.dW().a(cnl.class, $$1.cR().g(16.0));
      $$3.stream().filter(cnm::c).filter($$2x -> !$$2 || bxb.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().b(dge.P)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bsj a(arc $$0, cnl $$1, cox $$2, bsi $$3) {
      cwp $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cwp $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bvg)$$1);
         i($$1);
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   protected static boolean b(cnl $$0, cwp $$1) {
      return !r($$0) && !p($$0) && $$0.gp() && b($$1);
   }

   protected static void a(arc $$0, cnl $$1, bvg $$2) {
      if (!($$2 instanceof cnl)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bwi<cnl> $$3 = $$1.ec();
         $$3.b(cek.ai);
         $$3.b(cek.aj);
         $$3.b(cek.ad);
         if ($$2 instanceof cox) {
            $$3.a(cek.ag, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cek.z);
            }
         });
         if ($$1.e_()) {
            $$3.a(cek.z, $$2, 100L);
            if (cfq.d($$0, $$1, $$2)) {
               b($$0, (cnk)$$1, $$2);
            }
         } else if ($$2.aq() == bur.ak && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cnk)$$1, $$2);
         }
      }
   }

   protected static void a(arc $$0, cnk $$1, bvg $$2) {
      if (!$$1.ec().c(cqo.n)) {
         if (cfq.d($$0, $$1, $$2)) {
            if (!bxb.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bur.bS && $$0.O().b(dge.P)) {
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

   public static Optional<avz> b(cnl $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(cnl $$0, cqo $$1) {
      if ($$1 == cqo.k) {
         return awa.uh;
      } else if ($$0.x()) {
         return awa.um;
      } else if ($$1 == cqo.n && h($$0)) {
         return awa.um;
      } else if ($$1 == cqo.m) {
         return awa.uf;
      } else if ($$1 == cqo.l) {
         return awa.ui;
      } else if (e((bvg)$$0)) {
         return awa.uk;
      } else {
         return q($$0) ? awa.um : awa.ug;
      }
   }

   private static boolean h(cnl $$0) {
      bwi<cnl> $$1 = $$0.ec();
      return !$$1.a(cek.z) ? false : $$1.c(cek.z).get().a($$0, 12.0);
   }

   protected static List<cnk> c(cnl $$0) {
      return $$0.ec().c(cek.ao).orElse(ImmutableList.of());
   }

   private static List<cnk> d(cnk $$0) {
      return $$0.ec().c(cek.an).orElse(ImmutableList.of());
   }

   public static boolean a(bvg $$0) {
      for (cwp $$1 : $$0.fd()) {
         if ($$1.a(awy.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cnl $$0) {
      $$0.ec().b(cek.m);
      $$0.L().m();
   }

   private static bxa<bvg> g() {
      byz.a $$0 = new byz.a(o);
      return bxe.a($$1 -> $$1.e_() && $$0.a($$1.dW().A), cek.al, cek.s, p);
   }

   protected static void b(arc $$0, cnk $$1, bvg $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bur.ak || $$2x.m() && ((cnf)$$2).gq()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(arc $$0, cnk $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(arc $$0, cnk $$1, bvg $$2) {
      if (cfq.d($$0, $$1, $$2)) {
         $$1.ec().b(cek.E);
         $$1.ec().a(cek.ab, $$2.cG(), 600L);
         if ($$2.aq() == bur.ak && $$1.m()) {
            b($$1);
         }

         if ($$2.aq() == bur.bS && $$0.O().b(dge.P)) {
            $$1.ec().a(cek.ac, true, 600L);
         }
      }
   }

   private static void d(arc $$0, cnk $$1, bvg $$2) {
      Optional<cox> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(arc $$0, cnk $$1, bvg $$2) {
      Optional<bvg> $$3 = e($$1);
      bvg $$4 = bxb.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bvg> e(cnk $$0) {
      return bxb.a($$0, cek.ab);
   }

   public static Optional<bvg> d(cnl $$0) {
      return $$0.ec().a(cek.z) ? $$0.ec().c(cek.z) : Optional.empty();
   }

   public static Optional<cox> a(cnk $$0) {
      return $$0.ec().a(cek.l) ? $$0.ec().c(cek.l) : Optional.empty();
   }

   private static void a(cnl $$0, bvg $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cnl).forEach($$1x -> b((cnl)$$1x, $$1));
   }

   private static void b(cnl $$0, bvg $$1) {
      bwi<cnl> $$2 = $$0.ec();
      bvg $$3 = bxb.a($$0, $$2.c(cek.z), $$1);
      $$3 = bxb.a($$0, $$2.c(cek.o), $$3);
      c($$0, $$3);
   }

   private static boolean j(cnl $$0) {
      bwi<cnl> $$1 = $$0.ec();
      if (!$$1.a(cek.z)) {
         return true;
      } else {
         bvg $$2 = $$1.c(cek.z).get();
         bur<?> $$3 = $$2.aq();
         if ($$3 == bur.ak) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cek.ar, $$2) : false;
         }
      }
   }

   private static boolean k(cnl $$0) {
      return !l($$0);
   }

   private static boolean l(cnl $$0) {
      int $$1 = $$0.ec().c(cek.as).orElse(0) + 1;
      int $$2 = $$0.ec().c(cek.at).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cnl $$0, bvg $$1) {
      $$0.ec().b(cek.ab);
      $$0.ec().b(cek.o);
      $$0.ec().b(cek.m);
      $$0.ec().a(cek.z, $$1, (long)q.a($$0.dW().A));
      b((cnk)$$0);
   }

   protected static void b(cnk $$0) {
      $$0.ec().a(cek.ah, true, (long)d.a($$0.dW().A));
   }

   private static void m(cnl $$0) {
      $$0.ec().a(cek.av, true, 200L);
   }

   private static fba n(cnl $$0) {
      fba $$1 = cge.a($$0, 4, 2);
      return $$1 == null ? $$0.du() : $$1;
   }

   private static boolean o(cnl $$0) {
      return $$0.ec().a(cek.av);
   }

   protected static boolean c(cnk $$0) {
      return $$0.ec().c(cqo.b);
   }

   private static boolean c(bvg $$0) {
      return $$0.b(cwt.wV);
   }

   private static void d(bvg $$0) {
      $$0.ec().a(cek.ad, true, 119L);
   }

   private static boolean p(cnl $$0) {
      return $$0.ec().a(cek.ad);
   }

   private static boolean b(cwp $$0) {
      return $$0.a(c);
   }

   private static boolean c(cwp $$0) {
      return $$0.a(awy.ab);
   }

   private static boolean q(cnl $$0) {
      return $$0.ec().a(cek.aw);
   }

   private static boolean e(bvg $$0) {
      return $$0.ec().a(cek.au);
   }

   private static boolean f(bvg $$0) {
      return !e($$0);
   }

   public static boolean b(bvg $$0) {
      return $$0.aq() == bur.bS && $$0.b(cnm::a);
   }

   private static boolean r(cnl $$0) {
      return $$0.ec().a(cek.ag);
   }

   private static boolean g(bvg $$0) {
      return $$0.ec().a(cek.x);
   }

   private static boolean s(cnl $$0) {
      return !$$0.fa().f();
   }

   private static boolean t(cnl $$0) {
      return $$0.fa().f() || !a($$0.fa());
   }

   public static boolean a(bur<?> $$0) {
      return $$0 == bur.bR || $$0 == bur.bN;
   }
}
