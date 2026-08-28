import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cmx {
   public static final int a = 8;
   public static final int b = 4;
   public static final cvt c = cwb.oK;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final brj d = bak.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final brj o = bak.a(10, 40);
   private static final brj p = bak.a(10, 30);
   private static final brj q = bak.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final brj A = bak.a(5, 7);
   private static final brj B = bak.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bvx<?> a(cmw $$0, bvx<cmw> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cpz.a));
      $$1.b(cpz.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cmw $$0, azr $$1) {
      int $$2 = d.a($$1);
      $$0.ed().a(cdz.ah, true, (long)$$2);
   }

   private static void a(bvx<cmw> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bxu(45, 90), new bxy(), bxm.a(), e(), f(), cng.a(), cnc.a(119), bzb.a(300, cmx::a), bze.a()));
   }

   private static void b(bvx<cmw> $$0) {
      $$0.a(cpz.b, 10, ImmutableList.of(byn.a(cmx::b, 14.0F), bza.a(cmv::gw, cmx::i), cab.a(cmw::q, cnd.a()), d(), g(), b(), c(), byq.a(bug.by, 4)));
   }

   private static void b(cmw $$0, bvx<cmw> $$1) {
      $$1.a(
         cpz.k,
         10,
         ImmutableList.of(bzd.a($$1x -> !b($$0, $$1x)), cab.a(cmx::c, bwm.a(5, 0.75F)), byt.a(1.0F), bxv.a(20), new bww(), cnb.a(), bxa.a(cmx::h, cdz.o)),
         cdz.o
      );
   }

   private static void c(bvx<cmw> $$0) {
      $$0.a(
         cpz.l,
         10,
         ImmutableList.of(
            d(),
            byn.a(cmx::b, 14.0F),
            bza.a(cmv::gw, cmx::i),
            cab.a($$0x -> !$$0x.gD(), bxh.a(cdz.ai, 2, 1.0F)),
            cab.a(cmw::gD, bxh.a(cdz.ai, 4, 0.6F)),
            new byl(ImmutableList.of(Pair.of(byn.a(bug.aA, 8.0F), 1), Pair.of(byg.a(0.6F, 2, 1), 1), Pair.of(new bwy(10, 20), 1)))
         ),
         cdz.ai
      );
   }

   private static void d(bvx<cmw> $$0) {
      $$0.a(cpz.m, 10, ImmutableList.of(bxi.a(cmx::v, 1.0F, true, 9), cne.a(9), cnf.a(200, 200)), cdz.ad);
   }

   private static void e(bvx<cmw> $$0) {
      $$0.a(cpz.n, 10, ImmutableList.of(bys.b(cdz.z, 1.0F, 12, true), b(), c(), bxa.a(cmx::l, cdz.z)), cdz.z);
   }

   private static void f(bvx<cmw> $$0) {
      $$0.a(
         cpz.o,
         10,
         ImmutableList.of(
            bxw.a(0.8F),
            byn.a(cmx::b, 8.0F),
            cab.a(cab.a(btz::ca), bzk.a(ImmutableList.builder().addAll(a()).add(Pair.of(cab.a((Predicate<cmw>)($$0x -> true)), 1)).build())),
            bwx.a(8, cmx::a)
         ),
         cdz.s
      );
   }

   private static ImmutableList<Pair<bxz<buv>, Integer>> a() {
      return ImmutableList.of(Pair.of(byn.a(bug.by, 8.0F), 1), Pair.of(byn.a(bug.aA, 8.0F), 1), Pair.of(byn.a(8.0F), 1));
   }

   private static byl<buv> b() {
      return new byl<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bwy(30, 60), 1)).build());
   }

   private static byl<cmw> c() {
      return new byl<>(
         ImmutableList.of(
            Pair.of(byg.a(0.6F), 2), Pair.of(bxl.a(bug.aA, 8, cdz.q, 0.6F, 2), 2), Pair.of(cab.a(cmx::f, byv.a(0.6F, 3)), 2), Pair.of(new bwy(30, 60), 1)
         )
      );
   }

   private static bwp<bvd> d() {
      return bys.a(cdz.aw, 1.0F, 8, false);
   }

   private static bwp<cmw> e() {
      return bwt.a(cmw::p_, cdz.M, cdz.z, B);
   }

   private static bwp<cmw> f() {
      return bwt.a(cmx::h, cdz.ar, cdz.z, A);
   }

   protected static void a(cmw $$0) {
      bvx<cmw> $$1 = $$0.ed();
      cpz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpz.m, cpz.k, cpz.n, cpz.l, cpz.o, cpz.b));
      cpz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cdz.o));
      if (!$$1.a(cdz.s) && f($$0)) {
         $$0.af();
      }

      if (!$$1.a(cdz.ai)) {
         $$1.b(cdz.aj);
      }

      $$0.y($$1.a(cdz.aj));
   }

   private static boolean f(cmw $$0) {
      if (!$$0.p_()) {
         return false;
      } else {
         btz $$1 = $$0.dl();
         return $$1 instanceof cmw && ((cmw)$$1).p_() || $$1 instanceof cmq && ((cmq)$$1).p_();
      }
   }

   protected static void a(cmw $$0, ckq $$1) {
      k($$0);
      cvx $$2;
      if ($$1.m().a(cwb.sj)) {
         $$0.a($$1, $$1.m().L());
         $$2 = $$1.m();
         $$1.au();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.ed().b(cdz.ae);
         c($$0, $$2);
         d((buv)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.g($$2).equals(cvx.k);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cmw $$0, cvx $$1) {
      if (u($$0)) {
         $$0.b($$0.b(brx.b));
      }

      $$0.n($$1);
   }

   private static cvx a(ckq $$0) {
      cvx $$1 = $$0.m();
      cvx $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.au();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cmw $$0, boolean $$1) {
      cvx $$2 = $$0.b(brx.b);
      $$0.a(brx.b, cvx.k);
      if ($$0.gw()) {
         boolean $$3 = b($$2);
         if ($$1 && $$3) {
            a($$0, g($$0));
         } else if (!$$3) {
            boolean $$4 = !$$0.g($$2).f();
            if (!$$4) {
               d($$0, $$2);
            }
         }
      } else {
         boolean $$5 = !$$0.g($$2).f();
         if (!$$5) {
            cvx $$6 = $$0.fb();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.m($$2);
         }
      }
   }

   protected static void b(cmw $$0) {
      if (r($$0) && !$$0.fc().f()) {
         $$0.b($$0.fc());
         $$0.a(brx.b, cvx.k);
      }
   }

   private static void d(cmw $$0, cvx $$1) {
      cvx $$2 = $$0.k($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cmw $$0, List<cvx> $$1) {
      Optional<coh> $$2 = $$0.ed().c(cdz.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cmw $$0, List<cvx> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cmw $$0, coh $$1, List<cvx> $$2) {
      a($$0, $$2, $$1.dv());
   }

   private static void a(cmw $$0, List<cvx> $$1, ezh $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(brx.b);

         for (cvx $$3 : $$1) {
            bwq.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cvx> g(cmw $$0) {
      eub $$1 = $$0.dX().o().bd().b(ets.aG);
      List<cvx> $$2 = $$1.a(new etz.a((arm)$$0.dX()).a(ews.a, $$0).a(ewr.k));
      return $$2;
   }

   private static boolean a(buv $$0, buv $$1) {
      return $$1.aq() != bug.Z ? false : azr.a($$0.dX().aa()).i() < 0.1F;
   }

   protected static boolean a(cmw $$0, cvx $$1) {
      if ($$0.p_() && $$1.a(axi.V)) {
         return false;
      } else if ($$1.a(axi.T)) {
         return false;
      } else if (t($$0) && $$0.ed().a(cdz.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.l($$1);
         if ($$1.a(cwb.sj)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.o($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cvx $$0) {
      return $$0.a(axi.U);
   }

   private static boolean a(cmw $$0, btz $$1) {
      return !($$1 instanceof bux $$2) ? false : !$$2.p_() || !$$2.bM() || g((buv)$$0) || g($$2) || $$2 instanceof cmw && $$2.dl() == null;
   }

   private static boolean b(cmw $$0, buv $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cmw $$0) {
      bvx<cmw> $$1 = $$0.ed();
      if ($$1.a(cdz.ar)) {
         buv $$2 = $$1.c(cdz.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends buv> i(cmw $$0) {
      bvx<cmw> $$1 = $$0.ed();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<buv> $$2 = bwq.a($$0, cdz.ab);
         if ($$2.isPresent() && cff.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(cdz.ac)) {
               Optional<coh> $$3 = $$1.c(cdz.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bux> $$4 = $$1.c(cdz.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<coh> $$5 = $$1.c(cdz.am);
               return $$5.isPresent() && cff.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(coh $$0, boolean $$1) {
      List<cmw> $$2 = $$0.dX().a(cmw.class, $$0.cS().g(16.0));
      $$2.stream().filter(cmx::d).filter($$2x -> !$$1 || bwq.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dX().ac().b(der.O)) {
            d((cmv)$$1x, $$0);
         } else {
            c((cmv)$$1x, $$0);
         }
      });
   }

   public static bry a(cmw $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cvx $$4 = $$3.b(1, $$1);
         c($$0, $$4);
         d((buv)$$0);
         k($$0);
         return bry.a;
      } else {
         return bry.e;
      }
   }

   protected static boolean b(cmw $$0, cvx $$1) {
      return !t($$0) && !r($$0) && $$0.gw() && b($$1);
   }

   protected static void a(cmw $$0, buv $$1) {
      if (!($$1 instanceof cmw)) {
         if (u($$0)) {
            a($$0, false);
         }

         bvx<cmw> $$2 = $$0.ed();
         $$2.b(cdz.ai);
         $$2.b(cdz.aj);
         $$2.b(cdz.ad);
         if ($$1 instanceof coh) {
            $$2.a(cdz.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.aq() != $$1.aq()) {
               $$2.b(cdz.z);
            }
         });
         if ($$0.p_()) {
            $$2.a(cdz.z, $$1, 100L);
            if (cff.d($$0, $$1)) {
               b((cmv)$$0, $$1);
            }
         } else if ($$1.aq() == bug.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cmv)$$0, $$1);
         }
      }
   }

   protected static void a(cmv $$0, buv $$1) {
      if (!$$0.ed().c(cpz.n)) {
         if (cff.d($$0, $$1)) {
            if (!bwq.a($$0, $$1, 4.0)) {
               if ($$1.aq() == bug.by && $$0.dX().ac().b(der.O)) {
                  d($$0, $$1);
                  a($$0);
               } else {
                  c($$0, $$1);
                  b($$0, $$1);
               }
            }
         }
      }
   }

   public static Optional<awj> c(cmw $$0) {
      return $$0.ed().g().map($$1 -> a($$0, $$1));
   }

   private static awj a(cmw $$0, cpz $$1) {
      if ($$1 == cpz.k) {
         return awk.tG;
      } else if ($$0.gv()) {
         return awk.tL;
      } else if ($$1 == cpz.n && j($$0)) {
         return awk.tL;
      } else if ($$1 == cpz.m) {
         return awk.tE;
      } else if ($$1 == cpz.l) {
         return awk.tH;
      } else if (e((buv)$$0)) {
         return awk.tJ;
      } else {
         return s($$0) ? awk.tL : awk.tF;
      }
   }

   private static boolean j(cmw $$0) {
      bvx<cmw> $$1 = $$0.ed();
      return !$$1.a(cdz.z) ? false : $$1.c(cdz.z).get().a($$0, 12.0);
   }

   protected static List<cmv> d(cmw $$0) {
      return $$0.ed().c(cdz.ao).orElse(ImmutableList.of());
   }

   private static List<cmv> e(cmv $$0) {
      return $$0.ed().c(cdz.an).orElse(ImmutableList.of());
   }

   public static boolean a(buv $$0) {
      for (cvx $$1 : $$0.ff()) {
         if ($$1.a(axi.W)) {
            return true;
         }
      }

      return false;
   }

   private static void k(cmw $$0) {
      $$0.ed().b(cdz.m);
      $$0.P().o();
   }

   private static bwp<buv> g() {
      byo.a $$0 = new byo.a(o);
      return bwt.a($$1 -> $$1.p_() && $$0.a($$1.dX().A), cdz.al, cdz.s, p);
   }

   protected static void b(cmv $$0, buv $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.aq() != bug.Z || $$1x.q() && ((cmq)$$1).gw()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cmv $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cmv $$0, buv $$1) {
      if (cff.d($$0, $$1)) {
         $$0.ed().b(cdz.E);
         $$0.ed().a(cdz.ab, $$1.cH(), 600L);
         if ($$1.aq() == bug.Z && $$0.q()) {
            c($$0);
         }

         if ($$1.aq() == bug.by && $$0.dX().ac().b(der.O)) {
            $$0.ed().a(cdz.ac, true, 600L);
         }
      }
   }

   private static void d(cmv $$0, buv $$1) {
      Optional<coh> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cmv $$0, buv $$1) {
      Optional<buv> $$2 = f($$0);
      buv $$3 = bwq.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<buv> f(cmv $$0) {
      return bwq.a($$0, cdz.ab);
   }

   public static Optional<buv> e(cmw $$0) {
      return $$0.ed().a(cdz.z) ? $$0.ed().c(cdz.z) : Optional.empty();
   }

   public static Optional<coh> b(cmv $$0) {
      return $$0.ed().a(cdz.l) ? $$0.ed().c(cdz.l) : Optional.empty();
   }

   private static void c(cmw $$0, buv $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cmw).forEach($$1x -> d((cmw)$$1x, $$1));
   }

   private static void d(cmw $$0, buv $$1) {
      bvx<cmw> $$2 = $$0.ed();
      buv $$3 = bwq.a($$0, $$2.c(cdz.z), $$1);
      $$3 = bwq.a($$0, $$2.c(cdz.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cmw $$0) {
      bvx<cmw> $$1 = $$0.ed();
      if (!$$1.a(cdz.z)) {
         return true;
      } else {
         buv $$2 = $$1.c(cdz.z).get();
         bug<?> $$3 = $$2.aq();
         if ($$3 == bug.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(cdz.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cmw $$0) {
      return !n($$0);
   }

   private static boolean n(cmw $$0) {
      int $$1 = $$0.ed().c(cdz.as).orElse(0) + 1;
      int $$2 = $$0.ed().c(cdz.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cmw $$0, buv $$1) {
      $$0.ed().b(cdz.ab);
      $$0.ed().b(cdz.o);
      $$0.ed().b(cdz.m);
      $$0.ed().a(cdz.z, $$1, (long)q.a($$0.dX().A));
      c((cmv)$$0);
   }

   protected static void c(cmv $$0) {
      $$0.ed().a(cdz.ah, true, (long)d.a($$0.dX().A));
   }

   private static void o(cmw $$0) {
      $$0.ed().a(cdz.av, true, 200L);
   }

   private static ezh p(cmw $$0) {
      ezh $$1 = cft.a($$0, 4, 2);
      return $$1 == null ? $$0.dv() : $$1;
   }

   private static boolean q(cmw $$0) {
      return $$0.ed().a(cdz.av);
   }

   protected static boolean d(cmv $$0) {
      return $$0.ed().c(cpz.b);
   }

   private static boolean c(buv $$0) {
      return $$0.b(cwb.vX);
   }

   private static void d(buv $$0) {
      $$0.ed().a(cdz.ad, true, 119L);
   }

   private static boolean r(cmw $$0) {
      return $$0.ed().a(cdz.ad);
   }

   private static boolean b(cvx $$0) {
      return $$0.a(c);
   }

   private static boolean c(cvx $$0) {
      return $$0.a(axi.Z);
   }

   private static boolean s(cmw $$0) {
      return $$0.ed().a(cdz.aw);
   }

   private static boolean e(buv $$0) {
      return $$0.ed().a(cdz.au);
   }

   private static boolean f(buv $$0) {
      return !e($$0);
   }

   public static boolean b(buv $$0) {
      return $$0.aq() == bug.by && $$0.b(cmx::a);
   }

   private static boolean t(cmw $$0) {
      return $$0.ed().a(cdz.ag);
   }

   private static boolean g(buv $$0) {
      return $$0.ed().a(cdz.x);
   }

   private static boolean u(cmw $$0) {
      return !$$0.fc().f();
   }

   private static boolean v(cmw $$0) {
      return $$0.fc().f() || !a($$0.fc());
   }

   public static boolean a(bug<?> $$0) {
      return $$0 == bug.bx || $$0 == bug.bt;
   }
}
