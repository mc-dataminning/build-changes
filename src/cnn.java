import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cnn {
   public static final int a = 8;
   public static final int b = 4;
   public static final cwm c = cwu.po;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final brw d = bab.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final brw o = bab.a(10, 40);
   private static final brw p = bab.a(10, 30);
   private static final brw q = bab.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final brw A = bab.a(5, 7);
   private static final brw B = bab.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bwk<?> a(cnm $$0, bwk<cnm> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cqp.a));
      $$1.b(cqp.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnm $$0, azh $$1) {
      int $$2 = d.a($$1);
      $$0.eb().a(cem.ah, true, (long)$$2);
   }

   private static void a(bwk<cnm> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new byh(45, 90), new byl(), bxz.a(), e(), f(), cnw.a(), cns.a(119), bzo.a(300, cnn::a), bzr.a()));
   }

   private static void b(bwk<cnm> $$0) {
      $$0.a(
         cqp.b,
         10,
         ImmutableList.of(bza.a(cnn::b, 14.0F), bzn.a(($$0x, $$1) -> $$1.gs(), cnn::b), cao.a(cnm::m, cnt.a()), d(), g(), b(), c(), bzd.a(but.bR, 4))
      );
   }

   private static void b(cnm $$0, bwk<cnm> $$1) {
      $$1.a(
         cqp.k,
         10,
         ImmutableList.of(
            bzq.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), cao.a(cnn::c, bwz.a(5, 0.75F)), bzg.a(1.0F), byi.a(20), new bxj(), cnr.a(), bxn.a(cnn::g, cem.o)
         ),
         cem.o
      );
   }

   private static void c(bwk<cnm> $$0) {
      $$0.a(
         cqp.l,
         10,
         ImmutableList.of(
            d(),
            bza.a(cnn::b, 14.0F),
            bzn.a(($$0x, $$1) -> $$1.gs(), cnn::b),
            cao.a($$0x -> !$$0x.gz(), bxu.a(cem.ai, 2, 1.0F)),
            cao.a(cnm::gz, bxu.a(cem.ai, 4, 0.6F)),
            new byy(ImmutableList.of(Pair.of(bza.a(but.aR, 8.0F), 1), Pair.of(byt.a(0.6F, 2, 1), 1), Pair.of(new bxl(10, 20), 1)))
         ),
         cem.ai
      );
   }

   private static void d(bwk<cnm> $$0) {
      $$0.a(cqp.m, 10, ImmutableList.of(bxv.a(cnn::t, 1.0F, true, 9), cnu.a(9), cnv.a(200, 200)), cem.ad);
   }

   private static void e(bwk<cnm> $$0) {
      $$0.a(cqp.n, 10, ImmutableList.of(bzf.b(cem.z, 1.0F, 12, true), b(), c(), bxn.a(cnn::j, cem.z)), cem.z);
   }

   private static void f(bwk<cnm> $$0) {
      $$0.a(
         cqp.o,
         10,
         ImmutableList.of(
            byj.a(0.8F),
            bza.a(cnn::b, 8.0F),
            cao.a(cao.a(bum::bZ), bzx.a(ImmutableList.builder().addAll(a()).add(Pair.of(cao.a((Predicate<cnm>)($$0x -> true)), 1)).build())),
            bxk.a(8, cnn::a)
         ),
         cem.s
      );
   }

   private static ImmutableList<Pair<bym<bvi>, Integer>> a() {
      return ImmutableList.of(Pair.of(bza.a(but.bR, 8.0F), 1), Pair.of(bza.a(but.aR, 8.0F), 1), Pair.of(bza.a(8.0F), 1));
   }

   private static byy<bvi> b() {
      return new byy<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bxl(30, 60), 1)).build());
   }

   private static byy<cnm> c() {
      return new byy<>(
         ImmutableList.of(
            Pair.of(byt.a(0.6F), 2), Pair.of(bxy.a(but.aR, 8, cem.q, 0.6F, 2), 2), Pair.of(cao.a(cnn::f, bzi.a(0.6F, 3)), 2), Pair.of(new bxl(30, 60), 1)
         )
      );
   }

   private static bxc<bvq> d() {
      return bzf.a(cem.aw, 1.0F, 8, false);
   }

   private static bxc<cnm> e() {
      return bxg.a(cnm::e_, cem.M, cem.z, B);
   }

   private static bxc<cnm> f() {
      return bxg.a(cnn::g, cem.ar, cem.z, A);
   }

   protected static void a(cnm $$0) {
      bwk<cnm> $$1 = $$0.eb();
      cqp $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqp.m, cqp.k, cqp.n, cqp.l, cqp.o, cqp.b));
      cqp $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cem.o));
      if (!$$1.a(cem.s) && e($$0)) {
         $$0.ae();
      }

      if (!$$1.a(cem.ai)) {
         $$1.b(cem.aj);
      }

      $$0.y($$1.a(cem.aj));
   }

   private static boolean e(cnm $$0) {
      if (!$$0.e_()) {
         return false;
      } else {
         bum $$1 = $$0.dk();
         return $$1 instanceof cnm && ((cnm)$$1).e_() || $$1 instanceof cng && ((cng)$$1).e_();
      }
   }

   protected static void a(ard $$0, cnm $$1, cld $$2) {
      i($$1);
      cwq $$3;
      if ($$2.l().a(cwu.tf)) {
         $$1.a($$2, $$2.l().M());
         $$3 = $$2.l();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.eb().b(cem.ae);
         a($$0, $$1, $$3);
         d((bvi)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cwq.j);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(ard $$0, cnm $$1, cwq $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bsk.b));
      }

      $$1.l($$2);
   }

   private static cwq a(cld $$0) {
      cwq $$1 = $$0.l();
      cwq $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(ard $$0, cnm $$1, boolean $$2) {
      cwq $$3 = $$1.b(bsk.b);
      $$1.a(bsk.b, cwq.j);
      if ($$1.gs()) {
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
            cwq $$7 = $$1.eZ();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(ard $$0, cnm $$1) {
      if (p($$1) && !$$1.fa().f()) {
         $$1.a($$0, $$1.fa());
         $$1.a(bsk.b, cwq.j);
      }
   }

   private static void c(cnm $$0, cwq $$1) {
      cwq $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cnm $$0, List<cwq> $$1) {
      Optional<coy> $$2 = $$0.eb().c(cem.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cnm $$0, List<cwq> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cnm $$0, coy $$1, List<cwq> $$2) {
      a($$0, $$2, $$1.dt());
   }

   private static void a(cnm $$0, List<cwq> $$1, fbb $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bsk.b);

         for (cwq $$3 : $$1) {
            bxd.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cwq> f(cnm $$0) {
      evx $$1 = $$0.dV().p().bc().b(evo.aK);
      List<cwq> $$2 = $$1.a(new evv.a((ard)$$0.dV()).a(eym.a, $$0).a(eyl.k));
      return $$2;
   }

   private static boolean a(bvi $$0, bvi $$1) {
      return $$1.aq() != but.aj ? false : azh.a($$0.dV().ad()).i() < 0.1F;
   }

   protected static boolean a(cnm $$0, cwq $$1) {
      if ($$0.e_() && $$1.a(awy.U)) {
         return false;
      } else if ($$1.a(awy.S)) {
         return false;
      } else if (r($$0) && $$0.eb().a(cem.o)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(cwu.tf)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cwq $$0) {
      return $$0.a(awy.T);
   }

   private static boolean a(cnm $$0, bum $$1) {
      return !($$1 instanceof bvk $$2) ? false : !$$2.e_() || !$$2.bL() || g((bvi)$$0) || g($$2) || $$2 instanceof cnm && $$2.dk() == null;
   }

   private static boolean b(ard $$0, cnm $$1, bvi $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cnm $$0) {
      bwk<cnm> $$1 = $$0.eb();
      if ($$1.a(cem.ar)) {
         bvi $$2 = $$1.c(cem.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bvi> b(ard $$0, cnm $$1) {
      bwk<cnm> $$2 = $$1.eb();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bvi> $$3 = bxd.a($$1, cem.ab);
         if ($$3.isPresent() && cfs.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cem.ac)) {
               Optional<coy> $$4 = $$2.c(cem.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bvk> $$5 = $$2.c(cem.M);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<coy> $$6 = $$2.c(cem.am);
               return $$6.isPresent() && cfs.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(ard $$0, coy $$1, boolean $$2) {
      List<cnm> $$3 = $$1.dV().a(cnm.class, $$1.cR().g(16.0));
      $$3.stream().filter(cnn::c).filter($$2x -> !$$2 || bxd.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().b(dgf.P)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bsl a(ard $$0, cnm $$1, coy $$2, bsk $$3) {
      cwq $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cwq $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bvi)$$1);
         i($$1);
         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   protected static boolean b(cnm $$0, cwq $$1) {
      return !r($$0) && !p($$0) && $$0.gs() && b($$1);
   }

   protected static void a(ard $$0, cnm $$1, bvi $$2) {
      if (!($$2 instanceof cnm)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bwk<cnm> $$3 = $$1.eb();
         $$3.b(cem.ai);
         $$3.b(cem.aj);
         $$3.b(cem.ad);
         if ($$2 instanceof coy) {
            $$3.a(cem.ag, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cem.z);
            }
         });
         if ($$1.e_()) {
            $$3.a(cem.z, $$2, 100L);
            if (cfs.d($$0, $$1, $$2)) {
               b($$0, (cnl)$$1, $$2);
            }
         } else if ($$2.aq() == but.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cnl)$$1, $$2);
         }
      }
   }

   protected static void a(ard $$0, cnl $$1, bvi $$2) {
      if (!$$1.eb().c(cqp.n)) {
         if (cfs.d($$0, $$1, $$2)) {
            if (!bxd.a($$1, $$2, 4.0)) {
               if ($$2.aq() == but.bR && $$0.O().b(dgf.P)) {
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

   public static Optional<avz> b(cnm $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(cnm $$0, cqp $$1) {
      if ($$1 == cqp.k) {
         return awa.uh;
      } else if ($$0.x()) {
         return awa.um;
      } else if ($$1 == cqp.n && h($$0)) {
         return awa.um;
      } else if ($$1 == cqp.m) {
         return awa.uf;
      } else if ($$1 == cqp.l) {
         return awa.ui;
      } else if (e((bvi)$$0)) {
         return awa.uk;
      } else {
         return q($$0) ? awa.um : awa.ug;
      }
   }

   private static boolean h(cnm $$0) {
      bwk<cnm> $$1 = $$0.eb();
      return !$$1.a(cem.z) ? false : $$1.c(cem.z).get().a($$0, 12.0);
   }

   protected static List<cnl> c(cnm $$0) {
      return $$0.eb().c(cem.ao).orElse(ImmutableList.of());
   }

   private static List<cnl> d(cnl $$0) {
      return $$0.eb().c(cem.an).orElse(ImmutableList.of());
   }

   public static boolean a(bvi $$0) {
      for (cwq $$1 : $$0.fd()) {
         if ($$1.a(awy.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cnm $$0) {
      $$0.eb().b(cem.m);
      $$0.P().m();
   }

   private static bxc<bvi> g() {
      bzb.a $$0 = new bzb.a(o);
      return bxg.a($$1 -> $$1.e_() && $$0.a($$1.dV().A), cem.al, cem.s, p);
   }

   protected static void b(ard $$0, cnl $$1, bvi $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != but.aj || $$2x.m() && ((cng)$$2).gt()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(ard $$0, cnl $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(ard $$0, cnl $$1, bvi $$2) {
      if (cfs.d($$0, $$1, $$2)) {
         $$1.eb().b(cem.E);
         $$1.eb().a(cem.ab, $$2.cG(), 600L);
         if ($$2.aq() == but.aj && $$1.m()) {
            b($$1);
         }

         if ($$2.aq() == but.bR && $$0.O().b(dgf.P)) {
            $$1.eb().a(cem.ac, true, 600L);
         }
      }
   }

   private static void d(ard $$0, cnl $$1, bvi $$2) {
      Optional<coy> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(ard $$0, cnl $$1, bvi $$2) {
      Optional<bvi> $$3 = e($$1);
      bvi $$4 = bxd.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bvi> e(cnl $$0) {
      return bxd.a($$0, cem.ab);
   }

   public static Optional<bvi> d(cnm $$0) {
      return $$0.eb().a(cem.z) ? $$0.eb().c(cem.z) : Optional.empty();
   }

   public static Optional<coy> a(cnl $$0) {
      return $$0.eb().a(cem.l) ? $$0.eb().c(cem.l) : Optional.empty();
   }

   private static void a(cnm $$0, bvi $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cnm).forEach($$1x -> b((cnm)$$1x, $$1));
   }

   private static void b(cnm $$0, bvi $$1) {
      bwk<cnm> $$2 = $$0.eb();
      bvi $$3 = bxd.a($$0, $$2.c(cem.z), $$1);
      $$3 = bxd.a($$0, $$2.c(cem.o), $$3);
      c($$0, $$3);
   }

   private static boolean j(cnm $$0) {
      bwk<cnm> $$1 = $$0.eb();
      if (!$$1.a(cem.z)) {
         return true;
      } else {
         bvi $$2 = $$1.c(cem.z).get();
         but<?> $$3 = $$2.aq();
         if ($$3 == but.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cem.ar, $$2) : false;
         }
      }
   }

   private static boolean k(cnm $$0) {
      return !l($$0);
   }

   private static boolean l(cnm $$0) {
      int $$1 = $$0.eb().c(cem.as).orElse(0) + 1;
      int $$2 = $$0.eb().c(cem.at).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cnm $$0, bvi $$1) {
      $$0.eb().b(cem.ab);
      $$0.eb().b(cem.o);
      $$0.eb().b(cem.m);
      $$0.eb().a(cem.z, $$1, (long)q.a($$0.dV().A));
      b((cnl)$$0);
   }

   protected static void b(cnl $$0) {
      $$0.eb().a(cem.ah, true, (long)d.a($$0.dV().A));
   }

   private static void m(cnm $$0) {
      $$0.eb().a(cem.av, true, 200L);
   }

   private static fbb n(cnm $$0) {
      fbb $$1 = cgg.a($$0, 4, 2);
      return $$1 == null ? $$0.dt() : $$1;
   }

   private static boolean o(cnm $$0) {
      return $$0.eb().a(cem.av);
   }

   protected static boolean c(cnl $$0) {
      return $$0.eb().c(cqp.b);
   }

   private static boolean c(bvi $$0) {
      return $$0.b(cwu.wV);
   }

   private static void d(bvi $$0) {
      $$0.eb().a(cem.ad, true, 119L);
   }

   private static boolean p(cnm $$0) {
      return $$0.eb().a(cem.ad);
   }

   private static boolean b(cwq $$0) {
      return $$0.a(c);
   }

   private static boolean c(cwq $$0) {
      return $$0.a(awy.ab);
   }

   private static boolean q(cnm $$0) {
      return $$0.eb().a(cem.aw);
   }

   private static boolean e(bvi $$0) {
      return $$0.eb().a(cem.au);
   }

   private static boolean f(bvi $$0) {
      return !e($$0);
   }

   public static boolean b(bvi $$0) {
      return $$0.aq() == but.bR && $$0.b(cnn::a);
   }

   private static boolean r(cnm $$0) {
      return $$0.eb().a(cem.ag);
   }

   private static boolean g(bvi $$0) {
      return $$0.eb().a(cem.x);
   }

   private static boolean s(cnm $$0) {
      return !$$0.fa().f();
   }

   private static boolean t(cnm $$0) {
      return $$0.fa().f() || !a($$0.fa());
   }

   public static boolean a(but<?> $$0) {
      return $$0 == but.bQ || $$0 == but.bM;
   }
}
