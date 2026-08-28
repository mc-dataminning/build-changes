import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cqn {
   public static final int a = 8;
   public static final int b = 4;
   public static final czu c = dac.px;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final buc d = bas.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final buc o = bas.a(10, 40);
   private static final buc p = bas.a(10, 30);
   private static final buc q = bas.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final buc A = bas.a(5, 7);
   private static final buc B = bas.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static byu<?> a(cqm $$0, byu<cqm> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(ctr.a));
      $$1.b(ctr.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cqm $$0, azx $$1) {
      int $$2 = d.a($$1);
      $$0.ec().a(cgw.ai, true, (long)$$2);
   }

   private static void a(byu<cqm> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new car(45, 90), new cav(), caj.a(), e(), f(), cqw.a(), cqs.a(119), cby.a(300, cqn::a), ccb.a()));
   }

   private static void b(byu<cqm> $$0) {
      $$0.a(
         ctr.b, 10, ImmutableList.of(cbk.a(cqn::b, 14.0F), cbx.a(($$0x, $$1) -> $$1.t(), cqn::b), ccy.a(cqm::j, cqt.a()), d(), g(), b(), c(), cbn.a(bxc.bT, 4))
      );
   }

   private static void b(cqm $$0, byu<cqm> $$1) {
      $$1.a(
         ctr.k,
         10,
         ImmutableList.of(
            cca.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), ccy.a(cqn::c, bzj.a(5, 0.75F)), cbq.a(1.0F), cas.a(20), new bzt(), cqr.a(), bzx.a(cqn::g, cgw.p)
         ),
         cgw.p
      );
   }

   private static void c(byu<cqm> $$0) {
      $$0.a(
         ctr.l,
         10,
         ImmutableList.of(
            d(),
            cbk.a(cqn::b, 14.0F),
            cbx.a(($$0x, $$1) -> $$1.t(), cqn::b),
            ccy.a($$0x -> !$$0x.gz(), cae.a(cgw.aj, 2, 1.0F)),
            ccy.a(cqm::gz, cae.a(cgw.aj, 4, 0.6F)),
            new cbi(ImmutableList.of(Pair.of(cbk.a(bxc.aS, 8.0F), 1), Pair.of(cbd.a(0.6F, 2, 1), 1), Pair.of(new bzv(10, 20), 1)))
         ),
         cgw.aj
      );
   }

   private static void d(byu<cqm> $$0) {
      $$0.a(ctr.m, 10, ImmutableList.of(caf.a(cqn::t, 1.0F, true, 9), cqu.a(9), cqv.a(200, 200)), cgw.ae);
   }

   private static void e(byu<cqm> $$0) {
      $$0.a(ctr.n, 10, ImmutableList.of(cbp.b(cgw.A, 1.0F, 12, true), b(), c(), bzx.a(cqn::j, cgw.A)), cgw.A);
   }

   private static void f(byu<cqm> $$0) {
      $$0.a(
         ctr.o,
         10,
         ImmutableList.of(
            cat.a(0.8F),
            cbk.a(cqn::b, 8.0F),
            ccy.a(ccy.a(bwt::bY), cch.a(ImmutableList.builder().addAll(a()).add(Pair.of(ccy.a((Predicate<cqm>)($$0x -> true)), 1)).build())),
            bzu.a(8, cqn::a)
         ),
         cgw.t
      );
   }

   private static ImmutableList<Pair<caw<bxu>, Integer>> a() {
      return ImmutableList.of(Pair.of(cbk.a(bxc.bT, 8.0F), 1), Pair.of(cbk.a(bxc.aS, 8.0F), 1), Pair.of(cbk.a(8.0F), 1));
   }

   private static cbi<bxu> b() {
      return new cbi<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bzv(30, 60), 1)).build());
   }

   private static cbi<cqm> c() {
      return new cbi<>(
         ImmutableList.of(
            Pair.of(cbd.a(0.6F), 2), Pair.of(cai.a(bxc.aS, 8, cgw.r, 0.6F, 2), 2), Pair.of(ccy.a(cqn::f, cbs.a(0.6F, 3)), 2), Pair.of(new bzv(30, 60), 1)
         )
      );
   }

   private static bzm<byc> d() {
      return cbp.a(cgw.ax, 1.0F, 8, false);
   }

   private static bzm<cqm> e() {
      return bzq.a(cqm::n_, cgw.N, cgw.A, B);
   }

   private static bzm<cqm> f() {
      return bzq.a(cqn::g, cgw.as, cgw.A, A);
   }

   protected static void a(cqm $$0) {
      byu<cqm> $$1 = $$0.ec();
      ctr $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctr.m, ctr.k, ctr.n, ctr.l, ctr.o, ctr.b));
      ctr $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgw.p));
      if (!$$1.a(cgw.t) && e($$0)) {
         $$0.bO();
      }

      if (!$$1.a(cgw.aj)) {
         $$1.b(cgw.ak);
      }

      $$0.x($$1.a(cgw.ak));
   }

   private static boolean e(cqm $$0) {
      if (!$$0.n_()) {
         return false;
      } else {
         bwt $$1 = $$0.dk();
         return $$1 instanceof cqm && ((cqm)$$1).n_() || $$1 instanceof cqg && ((cqg)$$1).n_();
      }
   }

   protected static void a(ars $$0, cqm $$1, coc $$2) {
      i($$1);
      czy $$3;
      if ($$2.f().a(dac.tq)) {
         $$1.a($$2, $$2.f().M());
         $$3 = $$2.f();
         $$2.aq();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.ec().b(cgw.af);
         a($$0, $$1, $$3);
         d((bxu)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(czy.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(ars $$0, cqm $$1, czy $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(buq.b));
      }

      $$1.l($$2);
   }

   private static czy a(coc $$0) {
      czy $$1 = $$0.f();
      czy $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.aq();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(ars $$0, cqm $$1, boolean $$2) {
      czy $$3 = $$1.b(buq.b);
      $$1.a(buq.b, czy.k);
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
            czy $$7 = $$1.fb();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(ars $$0, cqm $$1) {
      if (p($$1) && !$$1.fc().f()) {
         $$1.a($$0, $$1.fc());
         $$1.a(buq.b, czy.k);
      }
   }

   private static void c(cqm $$0, czy $$1) {
      czy $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cqm $$0, List<czy> $$1) {
      Optional<crx> $$2 = $$0.ec().c(cgw.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cqm $$0, List<czy> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cqm $$0, crx $$1, List<czy> $$2) {
      a($$0, $$2, $$1.dt());
   }

   private static void a(cqm $$0, List<czy> $$1, ffq $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(buq.b);

         for (czy $$3 : $$1) {
            bzn.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<czy> f(cqm $$0) {
      fam $$1 = $$0.dV().p().bc().b(fad.aK);
      List<czy> $$2 = $$1.a(new fak.a((ars)$$0.dV()).a(fdb.a, $$0).a(fda.k));
      return $$2;
   }

   private static boolean a(bxu $$0, bxu $$1) {
      return $$1.an() != bxc.ak ? false : azx.a($$0.dV().ae()).i() < 0.1F;
   }

   protected static boolean a(cqm $$0, czy $$1) {
      if ($$0.n_() && $$1.a(axm.U)) {
         return false;
      } else if ($$1.a(axm.S)) {
         return false;
      } else if (r($$0) && $$0.ec().a(cgw.p)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(dac.tq)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(czy $$0) {
      return $$0.a(axm.T);
   }

   private static boolean a(cqm $$0, bwt $$1) {
      return !($$1 instanceof bxw $$2) ? false : !$$2.n_() || !$$2.bJ() || g((bxu)$$0) || g($$2) || $$2 instanceof cqm && $$2.dk() == null;
   }

   private static boolean b(ars $$0, cqm $$1, bxu $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cqm $$0) {
      byu<cqm> $$1 = $$0.ec();
      if ($$1.a(cgw.as)) {
         bxu $$2 = $$1.c(cgw.as).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bxu> b(ars $$0, cqm $$1) {
      byu<cqm> $$2 = $$1.ec();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bxu> $$3 = bzn.a($$1, cgw.ac);
         if ($$3.isPresent() && cic.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cgw.ad)) {
               Optional<crx> $$4 = $$2.c(cgw.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bxw> $$5 = $$2.c(cgw.N);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<crx> $$6 = $$2.c(cgw.an);
               return $$6.isPresent() && cic.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(ars $$0, crx $$1, boolean $$2) {
      List<cqm> $$3 = $$1.dV().a(cqm.class, $$1.cR().g(16.0));
      $$3.stream().filter(cqn::c).filter($$2x -> !$$2 || bzn.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().c(djt.Q)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bur a(ars $$0, cqm $$1, crx $$2, buq $$3) {
      czy $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         czy $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bxu)$$1);
         i($$1);
         return bur.a;
      } else {
         return bur.e;
      }
   }

   protected static boolean b(cqm $$0, czy $$1) {
      return !r($$0) && !p($$0) && $$0.t() && b($$1);
   }

   protected static void a(ars $$0, cqm $$1, bxu $$2) {
      if (!($$2 instanceof cqm)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         byu<cqm> $$3 = $$1.ec();
         $$3.b(cgw.aj);
         $$3.b(cgw.ak);
         $$3.b(cgw.ae);
         if ($$2 instanceof crx) {
            $$3.a(cgw.ah, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.an() != $$2.an()) {
               $$3.b(cgw.A);
            }
         });
         if ($$1.n_()) {
            $$3.a(cgw.A, $$2, 100L);
            if (cic.d($$0, $$1, $$2)) {
               b($$0, (cql)$$1, $$2);
            }
         } else if ($$2.an() == bxc.ak && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cql)$$1, $$2);
         }
      }
   }

   protected static void a(ars $$0, cql $$1, bxu $$2) {
      if (!$$1.ec().c(ctr.n)) {
         if (cic.d($$0, $$1, $$2)) {
            if (!bzn.a($$1, $$2, 4.0)) {
               if ($$2.an() == bxc.bT && $$0.O().c(djt.Q)) {
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

   public static Optional<awo> b(cqm $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static awo a(cqm $$0, ctr $$1) {
      if ($$1 == ctr.k) {
         return awp.uv;
      } else if ($$0.q()) {
         return awp.uA;
      } else if ($$1 == ctr.n && h($$0)) {
         return awp.uA;
      } else if ($$1 == ctr.m) {
         return awp.ut;
      } else if ($$1 == ctr.l) {
         return awp.uw;
      } else if (e((bxu)$$0)) {
         return awp.uy;
      } else {
         return q($$0) ? awp.uA : awp.uu;
      }
   }

   private static boolean h(cqm $$0) {
      byu<cqm> $$1 = $$0.ec();
      return !$$1.a(cgw.A) ? false : $$1.c(cgw.A).get().a($$0, 12.0);
   }

   protected static List<cql> c(cqm $$0) {
      return $$0.ec().c(cgw.ap).orElse(ImmutableList.of());
   }

   private static List<cql> d(cql $$0) {
      return $$0.ec().c(cgw.ao).orElse(ImmutableList.of());
   }

   public static boolean a(bxu $$0) {
      for (bxd $$1 : bxe.i) {
         if ($$0.a($$1).a(axm.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cqm $$0) {
      $$0.ec().b(cgw.n);
      $$0.O().m();
   }

   private static bzm<bxu> g() {
      cbl.a $$0 = new cbl.a(o);
      return bzq.a($$1 -> $$1.n_() && $$0.a($$1.dV().A), cgw.am, cgw.t, p);
   }

   protected static void b(ars $$0, cql $$1, bxu $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.an() != bxc.ak || $$2x.j() && ((cqg)$$2).gv()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(ars $$0, cql $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(ars $$0, cql $$1, bxu $$2) {
      if (cic.d($$0, $$1, $$2)) {
         $$1.ec().b(cgw.F);
         $$1.ec().a(cgw.ac, $$2.cG(), 600L);
         if ($$2.an() == bxc.ak && $$1.j()) {
            b($$1);
         }

         if ($$2.an() == bxc.bT && $$0.O().c(djt.Q)) {
            $$1.ec().a(cgw.ad, true, 600L);
         }
      }
   }

   private static void d(ars $$0, cql $$1, bxu $$2) {
      Optional<crx> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(ars $$0, cql $$1, bxu $$2) {
      Optional<bxu> $$3 = e($$1);
      bxu $$4 = bzn.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bxu> e(cql $$0) {
      return bzn.a($$0, cgw.ac);
   }

   public static Optional<bxu> d(cqm $$0) {
      return $$0.ec().a(cgw.A) ? $$0.ec().c(cgw.A) : Optional.empty();
   }

   public static Optional<crx> a(cql $$0) {
      return $$0.ec().a(cgw.l) ? $$0.ec().c(cgw.l) : Optional.empty();
   }

   private static void a(cqm $$0, bxu $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cqm).forEach($$1x -> b((cqm)$$1x, $$1));
   }

   private static void b(cqm $$0, bxu $$1) {
      byu<cqm> $$2 = $$0.ec();
      bxu $$3 = bzn.a($$0, $$2.c(cgw.A), $$1);
      $$3 = bzn.a($$0, $$2.c(cgw.p), $$3);
      c($$0, $$3);
   }

   private static boolean j(cqm $$0) {
      byu<cqm> $$1 = $$0.ec();
      if (!$$1.a(cgw.A)) {
         return true;
      } else {
         bxu $$2 = $$1.c(cgw.A).get();
         bxc<?> $$3 = $$2.an();
         if ($$3 == bxc.ak) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cgw.as, $$2) : false;
         }
      }
   }

   private static boolean k(cqm $$0) {
      return !l($$0);
   }

   private static boolean l(cqm $$0) {
      int $$1 = $$0.ec().c(cgw.at).orElse(0) + 1;
      int $$2 = $$0.ec().c(cgw.au).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cqm $$0, bxu $$1) {
      $$0.ec().b(cgw.ac);
      $$0.ec().b(cgw.p);
      $$0.ec().b(cgw.n);
      $$0.ec().a(cgw.A, $$1, (long)q.a($$0.dV().A));
      b((cql)$$0);
   }

   protected static void b(cql $$0) {
      $$0.ec().a(cgw.ai, true, (long)d.a($$0.dV().A));
   }

   private static void m(cqm $$0) {
      $$0.ec().a(cgw.aw, true, 200L);
   }

   private static ffq n(cqm $$0) {
      ffq $$1 = ciq.a($$0, 4, 2);
      return $$1 == null ? $$0.dt() : $$1;
   }

   private static boolean o(cqm $$0) {
      return $$0.ec().a(cgw.aw);
   }

   protected static boolean c(cql $$0) {
      return $$0.ec().c(ctr.b);
   }

   private static boolean c(bxu $$0) {
      return $$0.b(dac.xg);
   }

   private static void d(bxu $$0) {
      $$0.ec().a(cgw.ae, true, 119L);
   }

   private static boolean p(cqm $$0) {
      return $$0.ec().a(cgw.ae);
   }

   private static boolean b(czy $$0) {
      return $$0.a(c);
   }

   private static boolean c(czy $$0) {
      return $$0.a(axm.ac);
   }

   private static boolean q(cqm $$0) {
      return $$0.ec().a(cgw.ax);
   }

   private static boolean e(bxu $$0) {
      return $$0.ec().a(cgw.av);
   }

   private static boolean f(bxu $$0) {
      return !e($$0);
   }

   public static boolean b(bxu $$0) {
      return $$0.an() == bxc.bT && $$0.b(cqn::a);
   }

   private static boolean r(cqm $$0) {
      return $$0.ec().a(cgw.ah);
   }

   private static boolean g(bxu $$0) {
      return $$0.ec().a(cgw.y);
   }

   private static boolean s(cqm $$0) {
      return !$$0.fc().f();
   }

   private static boolean t(cqm $$0) {
      return $$0.fc().f() || !a($$0.fc());
   }

   public static boolean a(bxc<?> $$0) {
      return $$0 == bxc.bS || $$0 == bxc.bO;
   }
}
