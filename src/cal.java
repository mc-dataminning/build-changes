import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cal {
   public static final int a = 8;
   public static final int b = 4;
   public static final cja c = cji.nU;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bgj d = asu.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bgj o = asu.a(10, 40);
   private static final bgj p = asu.a(10, 30);
   private static final bgj q = asu.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bgj A = asu.a(5, 7);
   private static final bgj B = asu.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bkg<?> a(cak $$0, bkg<cak> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cdf.a));
      $$1.b(cdf.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cak $$0, asc $$1) {
      int $$2 = d.a($$1);
      $$0.dN().a(bsh.ag, true, (long)$$2);
   }

   private static void a(bkg<cak> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bmc(45, 90), new bmg(), blv.a(), e(), f(), cau.a(), caq.a(119), bnj.a(300, cal::a), bnm.a()));
   }

   private static void b(bkg<cak> $$0) {
      $$0.a(cdf.b, 10, ImmutableList.of(bmv.a(cal::b, 14.0F), bni.a(caj::ge, cal::i), boj.a(cak::s, car.a()), d(), g(), b(), c(), bmy.a(biu.bt, 4)));
   }

   private static void b(cak $$0, bkg<cak> $$1) {
      $$1.a(
         cdf.k,
         10,
         ImmutableList.of(bnl.a($$1x -> !b($$0, $$1x)), boj.a(cal::c, bkv.a(5, 0.75F)), bnb.a(1.0F), bmd.a(20), new blf(), cap.a(), blj.a(cal::h, bsh.o)),
         bsh.o
      );
   }

   private static void c(bkg<cak> $$0) {
      $$0.a(
         cdf.l,
         10,
         ImmutableList.of(
            d(),
            bmv.a(cal::b, 14.0F),
            bni.a(caj::ge, cal::i),
            boj.a($$0x -> !$$0x.gl(), blq.a(bsh.ah, 2, 1.0F)),
            boj.a(cak::gl, blq.a(bsh.ah, 4, 0.6F)),
            new bmt(ImmutableList.of(Pair.of(bmv.a(biu.aw, 8.0F), 1), Pair.of(bmo.a(0.6F, 2, 1), 1), Pair.of(new blh(10, 20), 1)))
         ),
         bsh.ah
      );
   }

   private static void d(bkg<cak> $$0) {
      $$0.a(cdf.m, 10, ImmutableList.of(blr.a(cal::v, 1.0F, true, 9), cas.a(9), cat.a(200, 200)), bsh.ac);
   }

   private static void e(bkg<cak> $$0) {
      $$0.a(cdf.n, 10, ImmutableList.of(bna.b(bsh.z, 1.0F, 12, true), b(), c(), blj.a(cal::l, bsh.z)), bsh.z);
   }

   private static void f(bkg<cak> $$0) {
      $$0.a(
         cdf.o,
         10,
         ImmutableList.of(
            bme.a(0.8F),
            bmv.a(cal::b, 8.0F),
            boj.a(boj.a(biq::bN), bns.a(ImmutableList.builder().addAll(a()).add(Pair.of(boj.a((Predicate<cak>)($$0x -> true)), 1)).build())),
            blg.a(8, cal::a)
         ),
         bsh.s
      );
   }

   private static ImmutableList<Pair<bmh<bjg>, Integer>> a() {
      return ImmutableList.of(Pair.of(bmv.a(biu.bt, 8.0F), 1), Pair.of(bmv.a(biu.aw, 8.0F), 1), Pair.of(bmv.a(8.0F), 1));
   }

   private static bmt<bjg> b() {
      return new bmt<>(ImmutableList.builder().addAll(a()).add(Pair.of(new blh(30, 60), 1)).build());
   }

   private static bmt<cak> c() {
      return new bmt<>(
         ImmutableList.of(
            Pair.of(bmo.a(0.6F), 2), Pair.of(blu.a(biu.aw, 8, bsh.q, 0.6F, 2), 2), Pair.of(boj.a(cal::f, bnd.a(0.6F, 3)), 2), Pair.of(new blh(30, 60), 1)
         )
      );
   }

   private static bky<bjp> d() {
      return bna.a(bsh.av, 1.0F, 8, false);
   }

   private static bky<cak> e() {
      return blc.a(cak::m_, bsh.L, bsh.z, B);
   }

   private static bky<cak> f() {
      return blc.a(cal::h, bsh.aq, bsh.z, A);
   }

   protected static void a(cak $$0) {
      bkg<cak> $$1 = $$0.dN();
      cdf $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cdf.m, cdf.k, cdf.n, cdf.l, cdf.o, cdf.b));
      cdf $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsh.o));
      if (!$$1.a(bsh.s) && f($$0)) {
         $$0.aa();
      }

      if (!$$1.a(bsh.ah)) {
         $$1.b(bsh.ai);
      }

      $$0.x($$1.a(bsh.ai));
   }

   private static boolean f(cak $$0) {
      if (!$$0.m_()) {
         return false;
      } else {
         biq $$1 = $$0.cY();
         return $$1 instanceof cak && ((cak)$$1).m_() || $$1 instanceof cae && ((cae)$$1).m_();
      }
   }

   protected static void a(cak $$0, byn $$1) {
      k($$0);
      cjf $$2;
      if ($$1.q().a(cji.rt)) {
         $$0.a($$1, $$1.q().L());
         $$2 = $$1.q();
         $$1.ak();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dN().b(bsh.ad);
         c($$0, $$2);
         d((bjg)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cjf.b);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cak $$0, cjf $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bgx.b));
      }

      $$0.o($$1);
   }

   private static cjf a(byn $$0) {
      cjf $$1 = $$0.q();
      cjf $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.ak();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cak $$0, boolean $$1) {
      cjf $$2 = $$0.b(bgx.b);
      $$0.a(bgx.b, cjf.b);
      if ($$0.ge()) {
         boolean $$3 = b($$2);
         if ($$1 && $$3) {
            a($$0, g($$0));
         } else if (!$$3) {
            boolean $$4 = !$$0.i($$2).b();
            if (!$$4) {
               d($$0, $$2);
            }
         }
      } else {
         boolean $$5 = !$$0.i($$2).b();
         if (!$$5) {
            cjf $$6 = $$0.eS();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cak $$0) {
      if (r($$0) && !$$0.eT().b()) {
         $$0.b($$0.eT());
         $$0.a(bgx.b, cjf.b);
      }
   }

   private static void d(cak $$0, cjf $$1) {
      cjf $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cak $$0, List<cjf> $$1) {
      Optional<cbu> $$2 = $$0.dN().c(bsh.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cak $$0, List<cjf> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cak $$0, cbu $$1, List<cjf> $$2) {
      a($$0, $$2, $$1.dj());
   }

   private static void a(cak $$0, List<cjf> $$1, ehn $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bgx.b);

         for (cjf $$3 : $$1) {
            bkz.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cjf> g(cak $$0) {
      ecy $$1 = $$0.dL().n().aH().getLootTable(eco.aB);
      List<cjf> $$2 = $$1.a(new ecw.a((akr)$$0.dL()).a(efb.a, $$0).a(efa.j));
      return $$2;
   }

   private static boolean a(bjg $$0, bjg $$1) {
      return $$1.ag() != biu.W ? false : asc.a($$0.dL().V()).i() < 0.1F;
   }

   protected static boolean a(cak $$0, cjf $$1) {
      if ($$0.m_() && $$1.a(aqb.V)) {
         return false;
      } else if ($$1.a(aqb.T)) {
         return false;
      } else if (t($$0) && $$0.dN().a(bsh.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cji.rt)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cjf $$0) {
      return $$0.a(aqb.U);
   }

   private static boolean a(cak $$0, biq $$1) {
      return !($$1 instanceof bji $$2) ? false : !$$2.m_() || !$$2.bv() || g((bjg)$$0) || g($$2) || $$2 instanceof cak && $$2.cY() == null;
   }

   private static boolean b(cak $$0, bjg $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cak $$0) {
      bkg<cak> $$1 = $$0.dN();
      if ($$1.a(bsh.aq)) {
         bjg $$2 = $$1.c(bsh.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bjg> i(cak $$0) {
      bkg<cak> $$1 = $$0.dN();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bjg> $$2 = bkz.a($$0, bsh.aa);
         if ($$2.isPresent() && btl.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bsh.ab)) {
               Optional<cbu> $$3 = $$1.c(bsh.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bji> $$4 = $$1.c(bsh.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cbu> $$5 = $$1.c(bsh.al);
               return $$5.isPresent() && btl.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cbu $$0, boolean $$1) {
      List<cak> $$2 = $$0.dL().a(cak.class, $$0.cG().g(16.0));
      $$2.stream().filter(cal::d).filter($$2x -> !$$1 || bkz.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dL().X().b(cpr.K)) {
            d((caj)$$1x, $$0);
         } else {
            c((caj)$$1x, $$0);
         }
      });
   }

   public static bgy a(cak $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cjf $$4 = $$3.a(1);
         c($$0, $$4);
         d((bjg)$$0);
         k($$0);
         return bgy.b;
      } else {
         return bgy.d;
      }
   }

   protected static boolean b(cak $$0, cjf $$1) {
      return !t($$0) && !r($$0) && $$0.ge() && b($$1);
   }

   protected static void a(cak $$0, bjg $$1) {
      if (!($$1 instanceof cak)) {
         if (u($$0)) {
            a($$0, false);
         }

         bkg<cak> $$2 = $$0.dN();
         $$2.b(bsh.ah);
         $$2.b(bsh.ai);
         $$2.b(bsh.ac);
         if ($$1 instanceof cbu) {
            $$2.a(bsh.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ag() != $$1.ag()) {
               $$2.b(bsh.z);
            }
         });
         if ($$0.m_()) {
            $$2.a(bsh.z, $$1, 100L);
            if (btl.d($$0, $$1)) {
               b((caj)$$0, $$1);
            }
         } else if ($$1.ag() == biu.W && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((caj)$$0, $$1);
         }
      }
   }

   protected static void a(caj $$0, bjg $$1) {
      if (!$$0.dN().c(cdf.n)) {
         if (btl.d($$0, $$1)) {
            if (!bkz.a($$0, $$1, 4.0)) {
               if ($$1.ag() == biu.bt && $$0.dL().X().b(cpr.K)) {
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

   public static Optional<apd> c(cak $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static apd a(cak $$0, cdf $$1) {
      if ($$1 == cdf.k) {
         return ape.rV;
      } else if ($$0.gd()) {
         return ape.sa;
      } else if ($$1 == cdf.n && j($$0)) {
         return ape.sa;
      } else if ($$1 == cdf.m) {
         return ape.rT;
      } else if ($$1 == cdf.l) {
         return ape.rW;
      } else if (e((bjg)$$0)) {
         return ape.rY;
      } else {
         return s($$0) ? ape.sa : ape.rU;
      }
   }

   private static boolean j(cak $$0) {
      bkg<cak> $$1 = $$0.dN();
      return !$$1.a(bsh.z) ? false : $$1.c(bsh.z).get().a($$0, 12.0);
   }

   protected static List<caj> d(cak $$0) {
      return $$0.dN().c(bsh.an).orElse(ImmutableList.of());
   }

   private static List<caj> e(caj $$0) {
      return $$0.dN().c(bsh.am).orElse(ImmutableList.of());
   }

   public static boolean a(bjg $$0) {
      for (cjf $$2 : $$0.bK()) {
         cja $$3 = $$2.d();
         if ($$3 instanceof cgp && ((cgp)$$3).d() == cgr.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cak $$0) {
      $$0.dN().b(bsh.m);
      $$0.L().n();
   }

   private static bky<bjg> g() {
      bmw.a $$0 = new bmw.a(o);
      return blc.a($$1 -> $$1.m_() && $$0.a($$1.dL().z), bsh.ak, bsh.s, p);
   }

   protected static void b(caj $$0, bjg $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ag() != biu.W || $$1x.s() && ((cae)$$1).gj()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(caj $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(caj $$0, bjg $$1) {
      if (btl.d($$0, $$1)) {
         $$0.dN().b(bsh.E);
         $$0.dN().a(bsh.aa, $$1.cv(), 600L);
         if ($$1.ag() == biu.W && $$0.s()) {
            c($$0);
         }

         if ($$1.ag() == biu.bt && $$0.dL().X().b(cpr.K)) {
            $$0.dN().a(bsh.ab, true, 600L);
         }
      }
   }

   private static void d(caj $$0, bjg $$1) {
      Optional<cbu> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(caj $$0, bjg $$1) {
      Optional<bjg> $$2 = f($$0);
      bjg $$3 = bkz.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bjg> f(caj $$0) {
      return bkz.a($$0, bsh.aa);
   }

   public static Optional<bjg> e(cak $$0) {
      return $$0.dN().a(bsh.z) ? $$0.dN().c(bsh.z) : Optional.empty();
   }

   public static Optional<cbu> b(caj $$0) {
      return $$0.dN().a(bsh.l) ? $$0.dN().c(bsh.l) : Optional.empty();
   }

   private static void c(cak $$0, bjg $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cak).forEach($$1x -> d((cak)$$1x, $$1));
   }

   private static void d(cak $$0, bjg $$1) {
      bkg<cak> $$2 = $$0.dN();
      bjg $$3 = bkz.a($$0, $$2.c(bsh.z), $$1);
      $$3 = bkz.a($$0, $$2.c(bsh.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cak $$0) {
      bkg<cak> $$1 = $$0.dN();
      if (!$$1.a(bsh.z)) {
         return true;
      } else {
         bjg $$2 = $$1.c(bsh.z).get();
         biu<?> $$3 = $$2.ag();
         if ($$3 == biu.W) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bsh.aq, $$2) : false;
         }
      }
   }

   private static boolean m(cak $$0) {
      return !n($$0);
   }

   private static boolean n(cak $$0) {
      int $$1 = $$0.dN().c(bsh.ar).orElse(0) + 1;
      int $$2 = $$0.dN().c(bsh.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cak $$0, bjg $$1) {
      $$0.dN().b(bsh.aa);
      $$0.dN().b(bsh.o);
      $$0.dN().b(bsh.m);
      $$0.dN().a(bsh.z, $$1, (long)q.a($$0.dL().z));
      c((caj)$$0);
   }

   protected static void c(caj $$0) {
      $$0.dN().a(bsh.ag, true, (long)d.a($$0.dL().z));
   }

   private static void o(cak $$0) {
      $$0.dN().a(bsh.au, true, 200L);
   }

   private static ehn p(cak $$0) {
      ehn $$1 = btz.a($$0, 4, 2);
      return $$1 == null ? $$0.dj() : $$1;
   }

   private static boolean q(cak $$0) {
      return $$0.dN().a(bsh.au);
   }

   protected static boolean d(caj $$0) {
      return $$0.dN().c(cdf.b);
   }

   private static boolean c(bjg $$0) {
      return $$0.b(cji.uZ);
   }

   private static void d(bjg $$0) {
      $$0.dN().a(bsh.ac, true, 119L);
   }

   private static boolean r(cak $$0) {
      return $$0.dN().a(bsh.ac);
   }

   private static boolean b(cjf $$0) {
      return $$0.a(c);
   }

   private static boolean c(cjf $$0) {
      return $$0.a(aqb.W);
   }

   private static boolean s(cak $$0) {
      return $$0.dN().a(bsh.av);
   }

   private static boolean e(bjg $$0) {
      return $$0.dN().a(bsh.at);
   }

   private static boolean f(bjg $$0) {
      return !e($$0);
   }

   public static boolean b(bjg $$0) {
      return $$0.ag() == biu.bt && $$0.b(cal::a);
   }

   private static boolean t(cak $$0) {
      return $$0.dN().a(bsh.af);
   }

   private static boolean g(bjg $$0) {
      return $$0.dN().a(bsh.x);
   }

   private static boolean u(cak $$0) {
      return !$$0.eT().b();
   }

   private static boolean v(cak $$0) {
      return $$0.eT().b() || !a($$0.eT());
   }

   public static boolean a(biu<?> $$0) {
      return $$0 == biu.bs || $$0 == biu.bo;
   }
}
