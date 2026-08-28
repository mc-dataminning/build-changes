import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class clc {
   public static final int a = 8;
   public static final int b = 4;
   public static final cty c = cug.oJ;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bps d = azh.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bps o = azh.a(10, 40);
   private static final bps p = azh.a(10, 30);
   private static final bps q = azh.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bps A = azh.a(5, 7);
   private static final bps B = azh.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bue<?> a(clb $$0, bue<clb> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(coa.a));
      $$1.b(coa.b);
      $$1.f();
      return $$1;
   }

   protected static void a(clb $$0, ayo $$1) {
      int $$2 = d.a($$1);
      $$0.dV().a(ccg.ah, true, (long)$$2);
   }

   private static void a(bue<clb> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bwb(45, 90), new bwf(), bvt.a(), e(), f(), cll.a(), clh.a(119), bxi.a(300, clc::a), bxl.a()));
   }

   private static void b(bue<clb> $$0) {
      $$0.a(coa.b, 10, ImmutableList.of(bwu.a(clc::b, 14.0F), bxh.a(cla::go, clc::i), byi.a(clb::s, cli.a()), d(), g(), b(), c(), bwx.a(bsn.by, 4)));
   }

   private static void b(clb $$0, bue<clb> $$1) {
      $$1.a(
         coa.k,
         10,
         ImmutableList.of(bxk.a($$1x -> !b($$0, $$1x)), byi.a(clc::c, but.a(5, 0.75F)), bxa.a(1.0F), bwc.a(20), new bvd(), clg.a(), bvh.a(clc::h, ccg.o)),
         ccg.o
      );
   }

   private static void c(bue<clb> $$0) {
      $$0.a(
         coa.l,
         10,
         ImmutableList.of(
            d(),
            bwu.a(clc::b, 14.0F),
            bxh.a(cla::go, clc::i),
            byi.a($$0x -> !$$0x.gv(), bvo.a(ccg.ai, 2, 1.0F)),
            byi.a(clb::gv, bvo.a(ccg.ai, 4, 0.6F)),
            new bws(ImmutableList.of(Pair.of(bwu.a(bsn.aA, 8.0F), 1), Pair.of(bwn.a(0.6F, 2, 1), 1), Pair.of(new bvf(10, 20), 1)))
         ),
         ccg.ai
      );
   }

   private static void d(bue<clb> $$0) {
      $$0.a(coa.m, 10, ImmutableList.of(bvp.a(clc::v, 1.0F, true, 9), clj.a(9), clk.a(200, 200)), ccg.ad);
   }

   private static void e(bue<clb> $$0) {
      $$0.a(coa.n, 10, ImmutableList.of(bwz.b(ccg.z, 1.0F, 12, true), b(), c(), bvh.a(clc::l, ccg.z)), ccg.z);
   }

   private static void f(bue<clb> $$0) {
      $$0.a(
         coa.o,
         10,
         ImmutableList.of(
            bwd.a(0.8F),
            bwu.a(clc::b, 8.0F),
            byi.a(byi.a(bsh::bT), bxr.a(ImmutableList.builder().addAll(a()).add(Pair.of(byi.a((Predicate<clb>)($$0x -> true)), 1)).build())),
            bve.a(8, clc::a)
         ),
         ccg.s
      );
   }

   private static ImmutableList<Pair<bwg<btc>, Integer>> a() {
      return ImmutableList.of(Pair.of(bwu.a(bsn.by, 8.0F), 1), Pair.of(bwu.a(bsn.aA, 8.0F), 1), Pair.of(bwu.a(8.0F), 1));
   }

   private static bws<btc> b() {
      return new bws<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bvf(30, 60), 1)).build());
   }

   private static bws<clb> c() {
      return new bws<>(
         ImmutableList.of(
            Pair.of(bwn.a(0.6F), 2), Pair.of(bvs.a(bsn.aA, 8, ccg.q, 0.6F, 2), 2), Pair.of(byi.a(clc::f, bxc.a(0.6F, 3)), 2), Pair.of(new bvf(30, 60), 1)
         )
      );
   }

   private static buw<btl> d() {
      return bwz.a(ccg.aw, 1.0F, 8, false);
   }

   private static buw<clb> e() {
      return bva.a(clb::o_, ccg.M, ccg.z, B);
   }

   private static buw<clb> f() {
      return bva.a(clc::h, ccg.ar, ccg.z, A);
   }

   protected static void a(clb $$0) {
      bue<clb> $$1 = $$0.dV();
      coa $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(coa.m, coa.k, coa.n, coa.l, coa.o, coa.b));
      coa $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccg.o));
      if (!$$1.a(ccg.s) && f($$0)) {
         $$0.ad();
      }

      if (!$$1.a(ccg.ai)) {
         $$1.b(ccg.aj);
      }

      $$0.x($$1.a(ccg.aj));
   }

   private static boolean f(clb $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         bsh $$1 = $$0.de();
         return $$1 instanceof clb && ((clb)$$1).o_() || $$1 instanceof ckv && ((ckv)$$1).o_();
      }
   }

   protected static void a(clb $$0, civ $$1) {
      k($$0);
      cud $$2;
      if ($$1.p().a(cug.si)) {
         $$0.a($$1, $$1.p().H());
         $$2 = $$1.p();
         $$1.aq();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dV().b(ccg.ae);
         c($$0, $$2);
         d((btc)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cud.l);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(clb $$0, cud $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bqg.b));
      }

      $$0.q($$1);
   }

   private static cud a(civ $$0) {
      cud $$1 = $$0.p();
      cud $$2 = $$1.a(1);
      if ($$1.e()) {
         $$0.aq();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(clb $$0, boolean $$1) {
      cud $$2 = $$0.b(bqg.b);
      $$0.a(bqg.b, cud.l);
      if ($$0.go()) {
         boolean $$3 = b($$2);
         if ($$1 && $$3) {
            a($$0, g($$0));
         } else if (!$$3) {
            boolean $$4 = !$$0.i($$2).e();
            if (!$$4) {
               d($$0, $$2);
            }
         }
      } else {
         boolean $$5 = !$$0.i($$2).e();
         if (!$$5) {
            cud $$6 = $$0.eV();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(clb $$0) {
      if (r($$0) && !$$0.eW().e()) {
         $$0.b($$0.eW());
         $$0.a(bqg.b, cud.l);
      }
   }

   private static void d(clb $$0, cud $$1) {
      cud $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(clb $$0, List<cud> $$1) {
      Optional<cml> $$2 = $$0.dV().c(ccg.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(clb $$0, List<cud> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(clb $$0, cml $$1, List<cud> $$2) {
      a($$0, $$2, $$1.dp());
   }

   private static void a(clb $$0, List<cud> $$1, ewh $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bqg.b);

         for (cud $$3 : $$1) {
            bux.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cud> g(clb $$0) {
      erb $$1 = $$0.dR().o().bf().b(eqs.aW);
      List<cud> $$2 = $$1.a(new eqz.a((aqm)$$0.dR()).a(ets.a, $$0).a(etr.k));
      return $$2;
   }

   private static boolean a(btc $$0, btc $$1) {
      return $$1.am() != bsn.Z ? false : ayo.a($$0.dR().Z()).i() < 0.1F;
   }

   protected static boolean a(clb $$0, cud $$1) {
      if ($$0.o_() && $$1.a(awf.V)) {
         return false;
      } else if ($$1.a(awf.T)) {
         return false;
      } else if (t($$0) && $$0.dV().a(ccg.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(cug.si)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cud $$0) {
      return $$0.a(awf.U);
   }

   private static boolean a(clb $$0, bsh $$1) {
      return !($$1 instanceof bte $$2) ? false : !$$2.o_() || !$$2.bF() || g((btc)$$0) || g($$2) || $$2 instanceof clb && $$2.de() == null;
   }

   private static boolean b(clb $$0, btc $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(clb $$0) {
      bue<clb> $$1 = $$0.dV();
      if ($$1.a(ccg.ar)) {
         btc $$2 = $$1.c(ccg.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends btc> i(clb $$0) {
      bue<clb> $$1 = $$0.dV();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<btc> $$2 = bux.a($$0, ccg.ab);
         if ($$2.isPresent() && cdm.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(ccg.ac)) {
               Optional<cml> $$3 = $$1.c(ccg.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bte> $$4 = $$1.c(ccg.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cml> $$5 = $$1.c(ccg.am);
               return $$5.isPresent() && cdm.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cml $$0, boolean $$1) {
      List<clb> $$2 = $$0.dR().a(clb.class, $$0.cM().g(16.0));
      $$2.stream().filter(clc::d).filter($$2x -> !$$1 || bux.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dR().ab().b(dcc.O)) {
            d((cla)$$1x, $$0);
         } else {
            c((cla)$$1x, $$0);
         }
      });
   }

   public static bqh a(clb $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cud $$4 = $$3.b(1, $$1);
         c($$0, $$4);
         d((btc)$$0);
         k($$0);
         return bqh.c;
      } else {
         return bqh.e;
      }
   }

   protected static boolean b(clb $$0, cud $$1) {
      return !t($$0) && !r($$0) && $$0.go() && b($$1);
   }

   protected static void a(clb $$0, btc $$1) {
      if (!($$1 instanceof clb)) {
         if (u($$0)) {
            a($$0, false);
         }

         bue<clb> $$2 = $$0.dV();
         $$2.b(ccg.ai);
         $$2.b(ccg.aj);
         $$2.b(ccg.ad);
         if ($$1 instanceof cml) {
            $$2.a(ccg.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.am() != $$1.am()) {
               $$2.b(ccg.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(ccg.z, $$1, 100L);
            if (cdm.d($$0, $$1)) {
               b((cla)$$0, $$1);
            }
         } else if ($$1.am() == bsn.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cla)$$0, $$1);
         }
      }
   }

   protected static void a(cla $$0, btc $$1) {
      if (!$$0.dV().c(coa.n)) {
         if (cdm.d($$0, $$1)) {
            if (!bux.a($$0, $$1, 4.0)) {
               if ($$1.am() == bsn.by && $$0.dR().ab().b(dcc.O)) {
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

   public static Optional<avg> c(clb $$0) {
      return $$0.dV().g().map($$1 -> a($$0, $$1));
   }

   private static avg a(clb $$0, coa $$1) {
      if ($$1 == coa.k) {
         return avh.tH;
      } else if ($$0.gn()) {
         return avh.tM;
      } else if ($$1 == coa.n && j($$0)) {
         return avh.tM;
      } else if ($$1 == coa.m) {
         return avh.tF;
      } else if ($$1 == coa.l) {
         return avh.tI;
      } else if (e((btc)$$0)) {
         return avh.tK;
      } else {
         return s($$0) ? avh.tM : avh.tG;
      }
   }

   private static boolean j(clb $$0) {
      bue<clb> $$1 = $$0.dV();
      return !$$1.a(ccg.z) ? false : $$1.c(ccg.z).get().a($$0, 12.0);
   }

   protected static List<cla> d(clb $$0) {
      return $$0.dV().c(ccg.ao).orElse(ImmutableList.of());
   }

   private static List<cla> e(cla $$0) {
      return $$0.dV().c(ccg.an).orElse(ImmutableList.of());
   }

   public static boolean a(btc $$0) {
      for (cud $$2 : $$0.eZ()) {
         cty $$3 = $$2.g();
         if ($$3 instanceof crt && ((crt)$$3).h().a(crv.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(clb $$0) {
      $$0.dV().b(ccg.m);
      $$0.J().n();
   }

   private static buw<btc> g() {
      bwv.a $$0 = new bwv.a(o);
      return bva.a($$1 -> $$1.o_() && $$0.a($$1.dR().z), ccg.al, ccg.s, p);
   }

   protected static void b(cla $$0, btc $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.am() != bsn.Z || $$1x.s() && ((ckv)$$1).gt()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cla $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cla $$0, btc $$1) {
      if (cdm.d($$0, $$1)) {
         $$0.dV().b(ccg.E);
         $$0.dV().a(ccg.ab, $$1.cB(), 600L);
         if ($$1.am() == bsn.Z && $$0.s()) {
            c($$0);
         }

         if ($$1.am() == bsn.by && $$0.dR().ab().b(dcc.O)) {
            $$0.dV().a(ccg.ac, true, 600L);
         }
      }
   }

   private static void d(cla $$0, btc $$1) {
      Optional<cml> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cla $$0, btc $$1) {
      Optional<btc> $$2 = f($$0);
      btc $$3 = bux.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<btc> f(cla $$0) {
      return bux.a($$0, ccg.ab);
   }

   public static Optional<btc> e(clb $$0) {
      return $$0.dV().a(ccg.z) ? $$0.dV().c(ccg.z) : Optional.empty();
   }

   public static Optional<cml> b(cla $$0) {
      return $$0.dV().a(ccg.l) ? $$0.dV().c(ccg.l) : Optional.empty();
   }

   private static void c(clb $$0, btc $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof clb).forEach($$1x -> d((clb)$$1x, $$1));
   }

   private static void d(clb $$0, btc $$1) {
      bue<clb> $$2 = $$0.dV();
      btc $$3 = bux.a($$0, $$2.c(ccg.z), $$1);
      $$3 = bux.a($$0, $$2.c(ccg.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(clb $$0) {
      bue<clb> $$1 = $$0.dV();
      if (!$$1.a(ccg.z)) {
         return true;
      } else {
         btc $$2 = $$1.c(ccg.z).get();
         bsn<?> $$3 = $$2.am();
         if ($$3 == bsn.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(ccg.ar, $$2) : false;
         }
      }
   }

   private static boolean m(clb $$0) {
      return !n($$0);
   }

   private static boolean n(clb $$0) {
      int $$1 = $$0.dV().c(ccg.as).orElse(0) + 1;
      int $$2 = $$0.dV().c(ccg.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(clb $$0, btc $$1) {
      $$0.dV().b(ccg.ab);
      $$0.dV().b(ccg.o);
      $$0.dV().b(ccg.m);
      $$0.dV().a(ccg.z, $$1, (long)q.a($$0.dR().z));
      c((cla)$$0);
   }

   protected static void c(cla $$0) {
      $$0.dV().a(ccg.ah, true, (long)d.a($$0.dR().z));
   }

   private static void o(clb $$0) {
      $$0.dV().a(ccg.av, true, 200L);
   }

   private static ewh p(clb $$0) {
      ewh $$1 = cea.a($$0, 4, 2);
      return $$1 == null ? $$0.dp() : $$1;
   }

   private static boolean q(clb $$0) {
      return $$0.dV().a(ccg.av);
   }

   protected static boolean d(cla $$0) {
      return $$0.dV().c(coa.b);
   }

   private static boolean c(btc $$0) {
      return $$0.b(cug.vW);
   }

   private static void d(btc $$0) {
      $$0.dV().a(ccg.ad, true, 119L);
   }

   private static boolean r(clb $$0) {
      return $$0.dV().a(ccg.ad);
   }

   private static boolean b(cud $$0) {
      return $$0.a(c);
   }

   private static boolean c(cud $$0) {
      return $$0.a(awf.Y);
   }

   private static boolean s(clb $$0) {
      return $$0.dV().a(ccg.aw);
   }

   private static boolean e(btc $$0) {
      return $$0.dV().a(ccg.au);
   }

   private static boolean f(btc $$0) {
      return !e($$0);
   }

   public static boolean b(btc $$0) {
      return $$0.am() == bsn.by && $$0.b(clc::a);
   }

   private static boolean t(clb $$0) {
      return $$0.dV().a(ccg.ag);
   }

   private static boolean g(btc $$0) {
      return $$0.dV().a(ccg.x);
   }

   private static boolean u(clb $$0) {
      return !$$0.eW().e();
   }

   private static boolean v(clb $$0) {
      return $$0.eW().e() || !a($$0.eW());
   }

   public static boolean a(bsn<?> $$0) {
      return $$0 == bsn.bx || $$0 == bsn.bt;
   }
}
