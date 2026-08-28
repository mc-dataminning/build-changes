import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cpo {
   public static final int a = 8;
   public static final int b = 4;
   public static final cyu c = czc.pu;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final btm d = baq.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final btm o = baq.a(10, 40);
   private static final btm p = baq.a(10, 30);
   private static final btm q = baq.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final btm A = baq.a(5, 7);
   private static final btm B = baq.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static byc<?> a(cpn $$0, byc<cpn> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(csr.a));
      $$1.b(csr.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cpn $$0, azv $$1) {
      int $$2 = d.a($$1);
      $$0.eb().a(cge.ai, true, (long)$$2);
   }

   private static void a(byc<cpn> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new bzz(45, 90), new cad(), bzr.a(), e(), f(), cpx.a(), cpt.a(119), cbg.a(300, cpo::a), cbj.a()));
   }

   private static void b(byc<cpn> $$0) {
      $$0.a(
         csr.b, 10, ImmutableList.of(cas.a(cpo::b, 14.0F), cbf.a(($$0x, $$1) -> $$1.t(), cpo::b), ccg.a(cpn::j, cpu.a()), d(), g(), b(), c(), cav.a(bwm.bS, 4))
      );
   }

   private static void b(cpn $$0, byc<cpn> $$1) {
      $$1.a(
         csr.k,
         10,
         ImmutableList.of(
            cbi.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), ccg.a(cpo::c, byr.a(5, 0.75F)), cay.a(1.0F), caa.a(20), new bzb(), cps.a(), bzf.a(cpo::g, cge.p)
         ),
         cge.p
      );
   }

   private static void c(byc<cpn> $$0) {
      $$0.a(
         csr.l,
         10,
         ImmutableList.of(
            d(),
            cas.a(cpo::b, 14.0F),
            cbf.a(($$0x, $$1) -> $$1.t(), cpo::b),
            ccg.a($$0x -> !$$0x.gv(), bzm.a(cge.aj, 2, 1.0F)),
            ccg.a(cpn::gv, bzm.a(cge.aj, 4, 0.6F)),
            new caq(ImmutableList.of(Pair.of(cas.a(bwm.aR, 8.0F), 1), Pair.of(cal.a(0.6F, 2, 1), 1), Pair.of(new bzd(10, 20), 1)))
         ),
         cge.aj
      );
   }

   private static void d(byc<cpn> $$0) {
      $$0.a(csr.m, 10, ImmutableList.of(bzn.a(cpo::t, 1.0F, true, 9), cpv.a(9), cpw.a(200, 200)), cge.ae);
   }

   private static void e(byc<cpn> $$0) {
      $$0.a(csr.n, 10, ImmutableList.of(cax.b(cge.A, 1.0F, 12, true), b(), c(), bzf.a(cpo::j, cge.A)), cge.A);
   }

   private static void f(byc<cpn> $$0) {
      $$0.a(
         csr.o,
         10,
         ImmutableList.of(
            cab.a(0.8F),
            cas.a(cpo::b, 8.0F),
            ccg.a(ccg.a(bwd::bZ), cbp.a(ImmutableList.builder().addAll(a()).add(Pair.of(ccg.a((Predicate<cpn>)($$0x -> true)), 1)).build())),
            bzc.a(8, cpo::a)
         ),
         cge.t
      );
   }

   private static ImmutableList<Pair<cae<bxc>, Integer>> a() {
      return ImmutableList.of(Pair.of(cas.a(bwm.bS, 8.0F), 1), Pair.of(cas.a(bwm.aR, 8.0F), 1), Pair.of(cas.a(8.0F), 1));
   }

   private static caq<bxc> b() {
      return new caq<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bzd(30, 60), 1)).build());
   }

   private static caq<cpn> c() {
      return new caq<>(
         ImmutableList.of(
            Pair.of(cal.a(0.6F), 2), Pair.of(bzq.a(bwm.aR, 8, cge.r, 0.6F, 2), 2), Pair.of(ccg.a(cpo::f, cba.a(0.6F, 3)), 2), Pair.of(new bzd(30, 60), 1)
         )
      );
   }

   private static byu<bxk> d() {
      return cax.a(cge.ax, 1.0F, 8, false);
   }

   private static byu<cpn> e() {
      return byy.a(cpn::n_, cge.N, cge.A, B);
   }

   private static byu<cpn> f() {
      return byy.a(cpo::g, cge.as, cge.A, A);
   }

   protected static void a(cpn $$0) {
      byc<cpn> $$1 = $$0.eb();
      csr $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csr.m, csr.k, csr.n, csr.l, csr.o, csr.b));
      csr $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cge.p));
      if (!$$1.a(cge.t) && e($$0)) {
         $$0.bP();
      }

      if (!$$1.a(cge.aj)) {
         $$1.b(cge.ak);
      }

      $$0.x($$1.a(cge.ak));
   }

   private static boolean e(cpn $$0) {
      if (!$$0.n_()) {
         return false;
      } else {
         bwd $$1 = $$0.dk();
         return $$1 instanceof cpn && ((cpn)$$1).n_() || $$1 instanceof cph && ((cph)$$1).n_();
      }
   }

   protected static void a(arq $$0, cpn $$1, cnd $$2) {
      i($$1);
      cyy $$3;
      if ($$2.f().a(czc.tl)) {
         $$1.a($$2, $$2.f().M());
         $$3 = $$2.f();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.eb().b(cge.af);
         a($$0, $$1, $$3);
         d((bxc)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cyy.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(arq $$0, cpn $$1, cyy $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bua.b));
      }

      $$1.m($$2);
   }

   private static cyy a(cnd $$0) {
      cyy $$1 = $$0.f();
      cyy $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(arq $$0, cpn $$1, boolean $$2) {
      cyy $$3 = $$1.b(bua.b);
      $$1.a(bua.b, cyy.k);
      if ($$1.t()) {
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
            cyy $$7 = $$1.fa();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.l($$3);
         }
      }
   }

   protected static void a(arq $$0, cpn $$1) {
      if (p($$1) && !$$1.fb().f()) {
         $$1.a($$0, $$1.fb());
         $$1.a(bua.b, cyy.k);
      }
   }

   private static void c(cpn $$0, cyy $$1) {
      cyy $$2 = $$0.j($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cpn $$0, List<cyy> $$1) {
      Optional<cqy> $$2 = $$0.eb().c(cge.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cpn $$0, List<cyy> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cpn $$0, cqy $$1, List<cyy> $$2) {
      a($$0, $$2, $$1.dt());
   }

   private static void a(cpn $$0, List<cyy> $$1, fei $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bua.b);

         for (cyy $$3 : $$1) {
            byv.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cyy> f(cpn $$0) {
      eze $$1 = $$0.dV().p().bc().b(eyv.aK);
      List<cyy> $$2 = $$1.a(new ezc.a((arq)$$0.dV()).a(fbt.a, $$0).a(fbs.k));
      return $$2;
   }

   private static boolean a(bxc $$0, bxc $$1) {
      return $$1.aq() != bwm.aj ? false : azv.a($$0.dV().ae()).i() < 0.1F;
   }

   protected static boolean a(cpn $$0, cyy $$1) {
      if ($$0.n_() && $$1.a(axk.U)) {
         return false;
      } else if ($$1.a(axk.S)) {
         return false;
      } else if (r($$0) && $$0.eb().a(cge.p)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.k($$1);
         if ($$1.a(czc.tl)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.n($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cyy $$0) {
      return $$0.a(axk.T);
   }

   private static boolean a(cpn $$0, bwd $$1) {
      return !($$1 instanceof bxe $$2) ? false : !$$2.n_() || !$$2.bK() || g((bxc)$$0) || g($$2) || $$2 instanceof cpn && $$2.dk() == null;
   }

   private static boolean b(arq $$0, cpn $$1, bxc $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cpn $$0) {
      byc<cpn> $$1 = $$0.eb();
      if ($$1.a(cge.as)) {
         bxc $$2 = $$1.c(cge.as).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bxc> b(arq $$0, cpn $$1) {
      byc<cpn> $$2 = $$1.eb();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bxc> $$3 = byv.a($$1, cge.ac);
         if ($$3.isPresent() && chk.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cge.ad)) {
               Optional<cqy> $$4 = $$2.c(cge.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bxe> $$5 = $$2.c(cge.N);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cqy> $$6 = $$2.c(cge.an);
               return $$6.isPresent() && chk.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(arq $$0, cqy $$1, boolean $$2) {
      List<cpn> $$3 = $$1.dV().a(cpn.class, $$1.cR().g(16.0));
      $$3.stream().filter(cpo::c).filter($$2x -> !$$2 || byv.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().c(dir.P)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bub a(arq $$0, cpn $$1, cqy $$2, bua $$3) {
      cyy $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cyy $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bxc)$$1);
         i($$1);
         return bub.a;
      } else {
         return bub.e;
      }
   }

   protected static boolean b(cpn $$0, cyy $$1) {
      return !r($$0) && !p($$0) && $$0.t() && b($$1);
   }

   protected static void a(arq $$0, cpn $$1, bxc $$2) {
      if (!($$2 instanceof cpn)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         byc<cpn> $$3 = $$1.eb();
         $$3.b(cge.aj);
         $$3.b(cge.ak);
         $$3.b(cge.ae);
         if ($$2 instanceof cqy) {
            $$3.a(cge.ah, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cge.A);
            }
         });
         if ($$1.n_()) {
            $$3.a(cge.A, $$2, 100L);
            if (chk.d($$0, $$1, $$2)) {
               b($$0, (cpm)$$1, $$2);
            }
         } else if ($$2.aq() == bwm.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cpm)$$1, $$2);
         }
      }
   }

   protected static void a(arq $$0, cpm $$1, bxc $$2) {
      if (!$$1.eb().c(csr.n)) {
         if (chk.d($$0, $$1, $$2)) {
            if (!byv.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bwm.bS && $$0.O().c(dir.P)) {
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

   public static Optional<awm> b(cpn $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cpn $$0, csr $$1) {
      if ($$1 == csr.k) {
         return awn.us;
      } else if ($$0.q()) {
         return awn.ux;
      } else if ($$1 == csr.n && h($$0)) {
         return awn.ux;
      } else if ($$1 == csr.m) {
         return awn.uq;
      } else if ($$1 == csr.l) {
         return awn.ut;
      } else if (e((bxc)$$0)) {
         return awn.uv;
      } else {
         return q($$0) ? awn.ux : awn.ur;
      }
   }

   private static boolean h(cpn $$0) {
      byc<cpn> $$1 = $$0.eb();
      return !$$1.a(cge.A) ? false : $$1.c(cge.A).get().a($$0, 12.0);
   }

   protected static List<cpm> c(cpn $$0) {
      return $$0.eb().c(cge.ap).orElse(ImmutableList.of());
   }

   private static List<cpm> d(cpm $$0) {
      return $$0.eb().c(cge.ao).orElse(ImmutableList.of());
   }

   public static boolean a(bxc $$0) {
      for (bwn $$1 : bwo.i) {
         if ($$0.a($$1).a(axk.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cpn $$0) {
      $$0.eb().b(cge.n);
      $$0.O().m();
   }

   private static byu<bxc> g() {
      cat.a $$0 = new cat.a(o);
      return byy.a($$1 -> $$1.n_() && $$0.a($$1.dV().A), cge.am, cge.t, p);
   }

   protected static void b(arq $$0, cpm $$1, bxc $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bwm.aj || $$2x.j() && ((cph)$$2).gr()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(arq $$0, cpm $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(arq $$0, cpm $$1, bxc $$2) {
      if (chk.d($$0, $$1, $$2)) {
         $$1.eb().b(cge.F);
         $$1.eb().a(cge.ac, $$2.cG(), 600L);
         if ($$2.aq() == bwm.aj && $$1.j()) {
            b($$1);
         }

         if ($$2.aq() == bwm.bS && $$0.O().c(dir.P)) {
            $$1.eb().a(cge.ad, true, 600L);
         }
      }
   }

   private static void d(arq $$0, cpm $$1, bxc $$2) {
      Optional<cqy> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(arq $$0, cpm $$1, bxc $$2) {
      Optional<bxc> $$3 = e($$1);
      bxc $$4 = byv.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bxc> e(cpm $$0) {
      return byv.a($$0, cge.ac);
   }

   public static Optional<bxc> d(cpn $$0) {
      return $$0.eb().a(cge.A) ? $$0.eb().c(cge.A) : Optional.empty();
   }

   public static Optional<cqy> a(cpm $$0) {
      return $$0.eb().a(cge.l) ? $$0.eb().c(cge.l) : Optional.empty();
   }

   private static void a(cpn $$0, bxc $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cpn).forEach($$1x -> b((cpn)$$1x, $$1));
   }

   private static void b(cpn $$0, bxc $$1) {
      byc<cpn> $$2 = $$0.eb();
      bxc $$3 = byv.a($$0, $$2.c(cge.A), $$1);
      $$3 = byv.a($$0, $$2.c(cge.p), $$3);
      c($$0, $$3);
   }

   private static boolean j(cpn $$0) {
      byc<cpn> $$1 = $$0.eb();
      if (!$$1.a(cge.A)) {
         return true;
      } else {
         bxc $$2 = $$1.c(cge.A).get();
         bwm<?> $$3 = $$2.aq();
         if ($$3 == bwm.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cge.as, $$2) : false;
         }
      }
   }

   private static boolean k(cpn $$0) {
      return !l($$0);
   }

   private static boolean l(cpn $$0) {
      int $$1 = $$0.eb().c(cge.at).orElse(0) + 1;
      int $$2 = $$0.eb().c(cge.au).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cpn $$0, bxc $$1) {
      $$0.eb().b(cge.ac);
      $$0.eb().b(cge.p);
      $$0.eb().b(cge.n);
      $$0.eb().a(cge.A, $$1, (long)q.a($$0.dV().A));
      b((cpm)$$0);
   }

   protected static void b(cpm $$0) {
      $$0.eb().a(cge.ai, true, (long)d.a($$0.dV().A));
   }

   private static void m(cpn $$0) {
      $$0.eb().a(cge.aw, true, 200L);
   }

   private static fei n(cpn $$0) {
      fei $$1 = chy.a($$0, 4, 2);
      return $$1 == null ? $$0.dt() : $$1;
   }

   private static boolean o(cpn $$0) {
      return $$0.eb().a(cge.aw);
   }

   protected static boolean c(cpm $$0) {
      return $$0.eb().c(csr.b);
   }

   private static boolean c(bxc $$0) {
      return $$0.b(czc.xb);
   }

   private static void d(bxc $$0) {
      $$0.eb().a(cge.ae, true, 119L);
   }

   private static boolean p(cpn $$0) {
      return $$0.eb().a(cge.ae);
   }

   private static boolean b(cyy $$0) {
      return $$0.a(c);
   }

   private static boolean c(cyy $$0) {
      return $$0.a(axk.ab);
   }

   private static boolean q(cpn $$0) {
      return $$0.eb().a(cge.ax);
   }

   private static boolean e(bxc $$0) {
      return $$0.eb().a(cge.av);
   }

   private static boolean f(bxc $$0) {
      return !e($$0);
   }

   public static boolean b(bxc $$0) {
      return $$0.aq() == bwm.bS && $$0.b(cpo::a);
   }

   private static boolean r(cpn $$0) {
      return $$0.eb().a(cge.ah);
   }

   private static boolean g(bxc $$0) {
      return $$0.eb().a(cge.y);
   }

   private static boolean s(cpn $$0) {
      return !$$0.fb().f();
   }

   private static boolean t(cpn $$0) {
      return $$0.fb().f() || !a($$0.fb());
   }

   public static boolean a(bwm<?> $$0) {
      return $$0 == bwm.bR || $$0 == bwm.bN;
   }
}
