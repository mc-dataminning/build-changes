import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cng {
   public static final int a = 8;
   public static final int b = 4;
   public static final cwb c = cwj.oK;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final brs d = bap.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final brs o = bap.a(10, 40);
   private static final brs p = bap.a(10, 30);
   private static final brs q = bap.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final brs A = bap.a(5, 7);
   private static final brs B = bap.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bwg<?> a(cnf $$0, bwg<cnf> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cqi.a));
      $$1.b(cqi.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnf $$0, azv $$1) {
      int $$2 = d.a($$1);
      $$0.ee().a(cei.ah, true, (long)$$2);
   }

   private static void a(bwg<cnf> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new byd(45, 90), new byh(), bxv.a(), e(), f(), cnp.a(), cnl.a(119), bzk.a(300, cng::a), bzn.a()));
   }

   private static void b(bwg<cnf> $$0) {
      $$0.a(cqi.b, 10, ImmutableList.of(byw.a(cng::b, 14.0F), bzj.a(cne::gw, cng::i), cak.a(cnf::q, cnm.a()), d(), g(), b(), c(), byz.a(bup.by, 4)));
   }

   private static void b(cnf $$0, bwg<cnf> $$1) {
      $$1.a(
         cqi.k,
         10,
         ImmutableList.of(bzm.a($$1x -> !b($$0, $$1x)), cak.a(cng::c, bwv.a(5, 0.75F)), bzc.a(1.0F), bye.a(20), new bxf(), cnk.a(), bxj.a(cng::h, cei.o)),
         cei.o
      );
   }

   private static void c(bwg<cnf> $$0) {
      $$0.a(
         cqi.l,
         10,
         ImmutableList.of(
            d(),
            byw.a(cng::b, 14.0F),
            bzj.a(cne::gw, cng::i),
            cak.a($$0x -> !$$0x.gD(), bxq.a(cei.ai, 2, 1.0F)),
            cak.a(cnf::gD, bxq.a(cei.ai, 4, 0.6F)),
            new byu(ImmutableList.of(Pair.of(byw.a(bup.aA, 8.0F), 1), Pair.of(byp.a(0.6F, 2, 1), 1), Pair.of(new bxh(10, 20), 1)))
         ),
         cei.ai
      );
   }

   private static void d(bwg<cnf> $$0) {
      $$0.a(cqi.m, 10, ImmutableList.of(bxr.a(cng::v, 1.0F, true, 9), cnn.a(9), cno.a(200, 200)), cei.ad);
   }

   private static void e(bwg<cnf> $$0) {
      $$0.a(cqi.n, 10, ImmutableList.of(bzb.b(cei.z, 1.0F, 12, true), b(), c(), bxj.a(cng::l, cei.z)), cei.z);
   }

   private static void f(bwg<cnf> $$0) {
      $$0.a(
         cqi.o,
         10,
         ImmutableList.of(
            byf.a(0.8F),
            byw.a(cng::b, 8.0F),
            cak.a(cak.a(bui::cb), bzt.a(ImmutableList.builder().addAll(a()).add(Pair.of(cak.a((Predicate<cnf>)($$0x -> true)), 1)).build())),
            bxg.a(8, cng::a)
         ),
         cei.s
      );
   }

   private static ImmutableList<Pair<byi<bve>, Integer>> a() {
      return ImmutableList.of(Pair.of(byw.a(bup.by, 8.0F), 1), Pair.of(byw.a(bup.aA, 8.0F), 1), Pair.of(byw.a(8.0F), 1));
   }

   private static byu<bve> b() {
      return new byu<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bxh(30, 60), 1)).build());
   }

   private static byu<cnf> c() {
      return new byu<>(
         ImmutableList.of(
            Pair.of(byp.a(0.6F), 2), Pair.of(bxu.a(bup.aA, 8, cei.q, 0.6F, 2), 2), Pair.of(cak.a(cng::f, bze.a(0.6F, 3)), 2), Pair.of(new bxh(30, 60), 1)
         )
      );
   }

   private static bwy<bvm> d() {
      return bzb.a(cei.aw, 1.0F, 8, false);
   }

   private static bwy<cnf> e() {
      return bxc.a(cnf::p_, cei.M, cei.z, B);
   }

   private static bwy<cnf> f() {
      return bxc.a(cng::h, cei.ar, cei.z, A);
   }

   protected static void a(cnf $$0) {
      bwg<cnf> $$1 = $$0.ee();
      cqi $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqi.m, cqi.k, cqi.n, cqi.l, cqi.o, cqi.b));
      cqi $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cei.o));
      if (!$$1.a(cei.s) && f($$0)) {
         $$0.af();
      }

      if (!$$1.a(cei.ai)) {
         $$1.b(cei.aj);
      }

      $$0.y($$1.a(cei.aj));
   }

   private static boolean f(cnf $$0) {
      if (!$$0.p_()) {
         return false;
      } else {
         bui $$1 = $$0.dm();
         return $$1 instanceof cnf && ((cnf)$$1).p_() || $$1 instanceof cmz && ((cmz)$$1).p_();
      }
   }

   protected static void a(cnf $$0, ckz $$1) {
      k($$0);
      cwf $$2;
      if ($$1.m().a(cwj.sz)) {
         $$0.a($$1, $$1.m().L());
         $$2 = $$1.m();
         $$1.av();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.ee().b(cei.ae);
         c($$0, $$2);
         d((bve)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.g($$2).equals(cwf.k);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cnf $$0, cwf $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bsg.b));
      }

      $$0.n($$1);
   }

   private static cwf a(ckz $$0) {
      cwf $$1 = $$0.m();
      cwf $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.av();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cnf $$0, boolean $$1) {
      cwf $$2 = $$0.b(bsg.b);
      $$0.a(bsg.b, cwf.k);
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
            cwf $$6 = $$0.fc();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.m($$2);
         }
      }
   }

   protected static void b(cnf $$0) {
      if (r($$0) && !$$0.fd().f()) {
         $$0.b($$0.fd());
         $$0.a(bsg.b, cwf.k);
      }
   }

   private static void d(cnf $$0, cwf $$1) {
      cwf $$2 = $$0.k($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cnf $$0, List<cwf> $$1) {
      Optional<cor> $$2 = $$0.ee().c(cei.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cnf $$0, List<cwf> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cnf $$0, cor $$1, List<cwf> $$2) {
      a($$0, $$2, $$1.dw());
   }

   private static void a(cnf $$0, List<cwf> $$1, ezr $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bsg.b);

         for (cwf $$3 : $$1) {
            bwz.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cwf> g(cnf $$0) {
      eul $$1 = $$0.dY().o().bc().b(euc.aK);
      List<cwf> $$2 = $$1.a(new euj.a((arq)$$0.dY()).a(exc.a, $$0).a(exb.k));
      return $$2;
   }

   private static boolean a(bve $$0, bve $$1) {
      return $$1.ar() != bup.Z ? false : azv.a($$0.dY().aa()).i() < 0.1F;
   }

   protected static boolean a(cnf $$0, cwf $$1) {
      if ($$0.p_() && $$1.a(axm.V)) {
         return false;
      } else if ($$1.a(axm.T)) {
         return false;
      } else if (t($$0) && $$0.ee().a(cei.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.l($$1);
         if ($$1.a(cwj.sz)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.o($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cwf $$0) {
      return $$0.a(axm.U);
   }

   private static boolean a(cnf $$0, bui $$1) {
      return !($$1 instanceof bvg $$2) ? false : !$$2.p_() || !$$2.bN() || g((bve)$$0) || g($$2) || $$2 instanceof cnf && $$2.dm() == null;
   }

   private static boolean b(cnf $$0, bve $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cnf $$0) {
      bwg<cnf> $$1 = $$0.ee();
      if ($$1.a(cei.ar)) {
         bve $$2 = $$1.c(cei.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bve> i(cnf $$0) {
      bwg<cnf> $$1 = $$0.ee();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bve> $$2 = bwz.a($$0, cei.ab);
         if ($$2.isPresent() && cfo.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(cei.ac)) {
               Optional<cor> $$3 = $$1.c(cei.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bvg> $$4 = $$1.c(cei.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cor> $$5 = $$1.c(cei.am);
               return $$5.isPresent() && cfo.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cor $$0, boolean $$1) {
      List<cnf> $$2 = $$0.dY().a(cnf.class, $$0.cT().g(16.0));
      $$2.stream().filter(cng::d).filter($$2x -> !$$1 || bwz.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dY().ac().b(dfb.O)) {
            d((cne)$$1x, $$0);
         } else {
            c((cne)$$1x, $$0);
         }
      });
   }

   public static bsh a(cnf $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cwf $$4 = $$3.b(1, $$1);
         c($$0, $$4);
         d((bve)$$0);
         k($$0);
         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   protected static boolean b(cnf $$0, cwf $$1) {
      return !t($$0) && !r($$0) && $$0.gw() && b($$1);
   }

   protected static void a(cnf $$0, bve $$1) {
      if (!($$1 instanceof cnf)) {
         if (u($$0)) {
            a($$0, false);
         }

         bwg<cnf> $$2 = $$0.ee();
         $$2.b(cei.ai);
         $$2.b(cei.aj);
         $$2.b(cei.ad);
         if ($$1 instanceof cor) {
            $$2.a(cei.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ar() != $$1.ar()) {
               $$2.b(cei.z);
            }
         });
         if ($$0.p_()) {
            $$2.a(cei.z, $$1, 100L);
            if (cfo.d($$0, $$1)) {
               b((cne)$$0, $$1);
            }
         } else if ($$1.ar() == bup.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cne)$$0, $$1);
         }
      }
   }

   protected static void a(cne $$0, bve $$1) {
      if (!$$0.ee().c(cqi.n)) {
         if (cfo.d($$0, $$1)) {
            if (!bwz.a($$0, $$1, 4.0)) {
               if ($$1.ar() == bup.by && $$0.dY().ac().b(dfb.O)) {
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

   public static Optional<awn> c(cnf $$0) {
      return $$0.ee().g().map($$1 -> a($$0, $$1));
   }

   private static awn a(cnf $$0, cqi $$1) {
      if ($$1 == cqi.k) {
         return awo.tG;
      } else if ($$0.gv()) {
         return awo.tL;
      } else if ($$1 == cqi.n && j($$0)) {
         return awo.tL;
      } else if ($$1 == cqi.m) {
         return awo.tE;
      } else if ($$1 == cqi.l) {
         return awo.tH;
      } else if (e((bve)$$0)) {
         return awo.tJ;
      } else {
         return s($$0) ? awo.tL : awo.tF;
      }
   }

   private static boolean j(cnf $$0) {
      bwg<cnf> $$1 = $$0.ee();
      return !$$1.a(cei.z) ? false : $$1.c(cei.z).get().a($$0, 12.0);
   }

   protected static List<cne> d(cnf $$0) {
      return $$0.ee().c(cei.ao).orElse(ImmutableList.of());
   }

   private static List<cne> e(cne $$0) {
      return $$0.ee().c(cei.an).orElse(ImmutableList.of());
   }

   public static boolean a(bve $$0) {
      for (cwf $$1 : $$0.fg()) {
         if ($$1.a(axm.W)) {
            return true;
         }
      }

      return false;
   }

   private static void k(cnf $$0) {
      $$0.ee().b(cei.m);
      $$0.P().o();
   }

   private static bwy<bve> g() {
      byx.a $$0 = new byx.a(o);
      return bxc.a($$1 -> $$1.p_() && $$0.a($$1.dY().A), cei.al, cei.s, p);
   }

   protected static void b(cne $$0, bve $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ar() != bup.Z || $$1x.q() && ((cmz)$$1).gw()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cne $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cne $$0, bve $$1) {
      if (cfo.d($$0, $$1)) {
         $$0.ee().b(cei.E);
         $$0.ee().a(cei.ab, $$1.cI(), 600L);
         if ($$1.ar() == bup.Z && $$0.q()) {
            c($$0);
         }

         if ($$1.ar() == bup.by && $$0.dY().ac().b(dfb.O)) {
            $$0.ee().a(cei.ac, true, 600L);
         }
      }
   }

   private static void d(cne $$0, bve $$1) {
      Optional<cor> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cne $$0, bve $$1) {
      Optional<bve> $$2 = f($$0);
      bve $$3 = bwz.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bve> f(cne $$0) {
      return bwz.a($$0, cei.ab);
   }

   public static Optional<bve> e(cnf $$0) {
      return $$0.ee().a(cei.z) ? $$0.ee().c(cei.z) : Optional.empty();
   }

   public static Optional<cor> b(cne $$0) {
      return $$0.ee().a(cei.l) ? $$0.ee().c(cei.l) : Optional.empty();
   }

   private static void c(cnf $$0, bve $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cnf).forEach($$1x -> d((cnf)$$1x, $$1));
   }

   private static void d(cnf $$0, bve $$1) {
      bwg<cnf> $$2 = $$0.ee();
      bve $$3 = bwz.a($$0, $$2.c(cei.z), $$1);
      $$3 = bwz.a($$0, $$2.c(cei.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cnf $$0) {
      bwg<cnf> $$1 = $$0.ee();
      if (!$$1.a(cei.z)) {
         return true;
      } else {
         bve $$2 = $$1.c(cei.z).get();
         bup<?> $$3 = $$2.ar();
         if ($$3 == bup.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(cei.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cnf $$0) {
      return !n($$0);
   }

   private static boolean n(cnf $$0) {
      int $$1 = $$0.ee().c(cei.as).orElse(0) + 1;
      int $$2 = $$0.ee().c(cei.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cnf $$0, bve $$1) {
      $$0.ee().b(cei.ab);
      $$0.ee().b(cei.o);
      $$0.ee().b(cei.m);
      $$0.ee().a(cei.z, $$1, (long)q.a($$0.dY().A));
      c((cne)$$0);
   }

   protected static void c(cne $$0) {
      $$0.ee().a(cei.ah, true, (long)d.a($$0.dY().A));
   }

   private static void o(cnf $$0) {
      $$0.ee().a(cei.av, true, 200L);
   }

   private static ezr p(cnf $$0) {
      ezr $$1 = cgc.a($$0, 4, 2);
      return $$1 == null ? $$0.dw() : $$1;
   }

   private static boolean q(cnf $$0) {
      return $$0.ee().a(cei.av);
   }

   protected static boolean d(cne $$0) {
      return $$0.ee().c(cqi.b);
   }

   private static boolean c(bve $$0) {
      return $$0.b(cwj.wn);
   }

   private static void d(bve $$0) {
      $$0.ee().a(cei.ad, true, 119L);
   }

   private static boolean r(cnf $$0) {
      return $$0.ee().a(cei.ad);
   }

   private static boolean b(cwf $$0) {
      return $$0.a(c);
   }

   private static boolean c(cwf $$0) {
      return $$0.a(axm.ac);
   }

   private static boolean s(cnf $$0) {
      return $$0.ee().a(cei.aw);
   }

   private static boolean e(bve $$0) {
      return $$0.ee().a(cei.au);
   }

   private static boolean f(bve $$0) {
      return !e($$0);
   }

   public static boolean b(bve $$0) {
      return $$0.ar() == bup.by && $$0.b(cng::a);
   }

   private static boolean t(cnf $$0) {
      return $$0.ee().a(cei.ag);
   }

   private static boolean g(bve $$0) {
      return $$0.ee().a(cei.x);
   }

   private static boolean u(cnf $$0) {
      return !$$0.fd().f();
   }

   private static boolean v(cnf $$0) {
      return $$0.fd().f() || !a($$0.fd());
   }

   public static boolean a(bup<?> $$0) {
      return $$0 == bup.bx || $$0 == bup.bt;
   }
}
