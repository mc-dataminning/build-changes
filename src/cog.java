import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cog {
   public static final int a = 8;
   public static final int b = 4;
   public static final cxd c = cxl.pq;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bsj d = bab.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bsj o = bab.a(10, 40);
   private static final bsj p = bab.a(10, 30);
   private static final bsj q = bab.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bsj A = bab.a(5, 7);
   private static final bsj B = bab.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bxa<?> a(cof $$0, bxa<cof> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cri.a));
      $$1.b(cri.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cof $$0, azh $$1) {
      int $$2 = d.a($$1);
      $$0.ea().a(cfc.ah, true, (long)$$2);
   }

   private static void a(bxa<cof> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new byx(45, 90), new bzb(), byp.a(), e(), f(), coq.a(), col.a(119), cae.a(300, cog::a), cah.a()));
   }

   private static void b(bxa<cof> $$0) {
      $$0.a(
         cri.b, 10, ImmutableList.of(bzq.a(cog::b, 14.0F), cad.a(($$0x, $$1) -> $$1.t(), cog::b), cbe.a(cof::j, com.a()), d(), g(), b(), c(), bzt.a(bvi.bR, 4))
      );
   }

   private static void b(cof $$0, bxa<cof> $$1) {
      $$1.a(
         cri.k,
         10,
         ImmutableList.of(
            cag.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), cbe.a(cog::c, bxp.a(5, 0.75F)), bzw.a(1.0F), byy.a(20), new bxz(), cok.a(), byd.a(cog::g, cfc.o)
         ),
         cfc.o
      );
   }

   private static void c(bxa<cof> $$0) {
      $$0.a(
         cri.l,
         10,
         ImmutableList.of(
            d(),
            bzq.a(cog::b, 14.0F),
            cad.a(($$0x, $$1) -> $$1.t(), cog::b),
            cbe.a($$0x -> !$$0x.gx(), byk.a(cfc.ai, 2, 1.0F)),
            cbe.a(cof::gx, byk.a(cfc.ai, 4, 0.6F)),
            new bzo(ImmutableList.of(Pair.of(bzq.a(bvi.aR, 8.0F), 1), Pair.of(bzj.a(0.6F, 2, 1), 1), Pair.of(new byb(10, 20), 1)))
         ),
         cfc.ai
      );
   }

   private static void d(bxa<cof> $$0) {
      $$0.a(cri.m, 10, ImmutableList.of(byl.a(cog::t, 1.0F, true, 9), coo.a(9), cop.a(200, 200)), cfc.ad);
   }

   private static void e(bxa<cof> $$0) {
      $$0.a(cri.n, 10, ImmutableList.of(bzv.b(cfc.z, 1.0F, 12, true), b(), c(), byd.a(cog::j, cfc.z)), cfc.z);
   }

   private static void f(bxa<cof> $$0) {
      $$0.a(
         cri.o,
         10,
         ImmutableList.of(
            byz.a(0.8F),
            bzq.a(cog::b, 8.0F),
            cbe.a(cbe.a(bva::bY), can.a(ImmutableList.builder().addAll(a()).add(Pair.of(cbe.a((Predicate<cof>)($$0x -> true)), 1)).build())),
            bya.a(8, cog::a)
         ),
         cfc.s
      );
   }

   private static ImmutableList<Pair<bzc<bvy>, Integer>> a() {
      return ImmutableList.of(Pair.of(bzq.a(bvi.bR, 8.0F), 1), Pair.of(bzq.a(bvi.aR, 8.0F), 1), Pair.of(bzq.a(8.0F), 1));
   }

   private static bzo<bvy> b() {
      return new bzo<>(ImmutableList.builder().addAll(a()).add(Pair.of(new byb(30, 60), 1)).build());
   }

   private static bzo<cof> c() {
      return new bzo<>(
         ImmutableList.of(
            Pair.of(bzj.a(0.6F), 2), Pair.of(byo.a(bvi.aR, 8, cfc.q, 0.6F, 2), 2), Pair.of(cbe.a(cog::f, bzy.a(0.6F, 3)), 2), Pair.of(new byb(30, 60), 1)
         )
      );
   }

   private static bxs<bwg> d() {
      return bzv.a(cfc.aw, 1.0F, 8, false);
   }

   private static bxs<cof> e() {
      return bxw.a(cof::n_, cfc.M, cfc.z, B);
   }

   private static bxs<cof> f() {
      return bxw.a(cog::g, cfc.ar, cfc.z, A);
   }

   protected static void a(cof $$0) {
      bxa<cof> $$1 = $$0.ea();
      cri $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cri.m, cri.k, cri.n, cri.l, cri.o, cri.b));
      cri $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cfc.o));
      if (!$$1.a(cfc.s) && e($$0)) {
         $$0.bO();
      }

      if (!$$1.a(cfc.ai)) {
         $$1.b(cfc.aj);
      }

      $$0.x($$1.a(cfc.aj));
   }

   private static boolean e(cof $$0) {
      if (!$$0.n_()) {
         return false;
      } else {
         bva $$1 = $$0.dj();
         return $$1 instanceof cof && ((cof)$$1).n_() || $$1 instanceof cnz && ((cnz)$$1).n_();
      }
   }

   protected static void a(ard $$0, cof $$1, clw $$2) {
      i($$1);
      cxh $$3;
      if ($$2.f().a(cxl.th)) {
         $$1.a($$2, $$2.f().M());
         $$3 = $$2.f();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.ea().b(cfc.ae);
         a($$0, $$1, $$3);
         d((bvy)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cxh.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(ard $$0, cof $$1, cxh $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bsx.b));
      }

      $$1.l($$2);
   }

   private static cxh a(clw $$0) {
      cxh $$1 = $$0.f();
      cxh $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(ard $$0, cof $$1, boolean $$2) {
      cxh $$3 = $$1.b(bsx.b);
      $$1.a(bsx.b, cxh.k);
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
            cxh $$7 = $$1.eZ();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(ard $$0, cof $$1) {
      if (p($$1) && !$$1.fa().f()) {
         $$1.a($$0, $$1.fa());
         $$1.a(bsx.b, cxh.k);
      }
   }

   private static void c(cof $$0, cxh $$1) {
      cxh $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cof $$0, List<cxh> $$1) {
      Optional<cpr> $$2 = $$0.ea().c(cfc.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cof $$0, List<cxh> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cof $$0, cpr $$1, List<cxh> $$2) {
      a($$0, $$2, $$1.ds());
   }

   private static void a(cof $$0, List<cxh> $$1, fbx $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bsx.b);

         for (cxh $$3 : $$1) {
            bxt.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cxh> f(cof $$0) {
      ewt $$1 = $$0.dU().p().bc().b(ewk.aK);
      List<cxh> $$2 = $$1.a(new ewr.a((ard)$$0.dU()).a(ezi.a, $$0).a(ezh.k));
      return $$2;
   }

   private static boolean a(bvy $$0, bvy $$1) {
      return $$1.aq() != bvi.aj ? false : azh.a($$0.dU().ae()).i() < 0.1F;
   }

   protected static boolean a(cof $$0, cxh $$1) {
      if ($$0.n_() && $$1.a(awy.U)) {
         return false;
      } else if ($$1.a(awy.S)) {
         return false;
      } else if (r($$0) && $$0.ea().a(cfc.o)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(cxl.th)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cxh $$0) {
      return $$0.a(awy.T);
   }

   private static boolean a(cof $$0, bva $$1) {
      return !($$1 instanceof bwa $$2) ? false : !$$2.n_() || !$$2.bJ() || g((bvy)$$0) || g($$2) || $$2 instanceof cof && $$2.dj() == null;
   }

   private static boolean b(ard $$0, cof $$1, bvy $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cof $$0) {
      bxa<cof> $$1 = $$0.ea();
      if ($$1.a(cfc.ar)) {
         bvy $$2 = $$1.c(cfc.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bvy> b(ard $$0, cof $$1) {
      bxa<cof> $$2 = $$1.ea();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bvy> $$3 = bxt.a($$1, cfc.ab);
         if ($$3.isPresent() && cgi.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cfc.ac)) {
               Optional<cpr> $$4 = $$2.c(cfc.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bwa> $$5 = $$2.c(cfc.M);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cpr> $$6 = $$2.c(cfc.am);
               return $$6.isPresent() && cgi.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(ard $$0, cpr $$1, boolean $$2) {
      List<cof> $$3 = $$1.dU().a(cof.class, $$1.cQ().g(16.0));
      $$3.stream().filter(cog::c).filter($$2x -> !$$2 || bxt.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().b(dgv.P)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bsy a(ard $$0, cof $$1, cpr $$2, bsx $$3) {
      cxh $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cxh $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bvy)$$1);
         i($$1);
         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   protected static boolean b(cof $$0, cxh $$1) {
      return !r($$0) && !p($$0) && $$0.t() && b($$1);
   }

   protected static void a(ard $$0, cof $$1, bvy $$2) {
      if (!($$2 instanceof cof)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bxa<cof> $$3 = $$1.ea();
         $$3.b(cfc.ai);
         $$3.b(cfc.aj);
         $$3.b(cfc.ad);
         if ($$2 instanceof cpr) {
            $$3.a(cfc.ag, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cfc.z);
            }
         });
         if ($$1.n_()) {
            $$3.a(cfc.z, $$2, 100L);
            if (cgi.d($$0, $$1, $$2)) {
               b($$0, (coe)$$1, $$2);
            }
         } else if ($$2.aq() == bvi.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (coe)$$1, $$2);
         }
      }
   }

   protected static void a(ard $$0, coe $$1, bvy $$2) {
      if (!$$1.ea().c(cri.n)) {
         if (cgi.d($$0, $$1, $$2)) {
            if (!bxt.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bvi.bR && $$0.O().b(dgv.P)) {
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

   public static Optional<avz> b(cof $$0) {
      return $$0.ea().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(cof $$0, cri $$1) {
      if ($$1 == cri.k) {
         return awa.ur;
      } else if ($$0.q()) {
         return awa.uw;
      } else if ($$1 == cri.n && h($$0)) {
         return awa.uw;
      } else if ($$1 == cri.m) {
         return awa.up;
      } else if ($$1 == cri.l) {
         return awa.us;
      } else if (e((bvy)$$0)) {
         return awa.uu;
      } else {
         return q($$0) ? awa.uw : awa.uq;
      }
   }

   private static boolean h(cof $$0) {
      bxa<cof> $$1 = $$0.ea();
      return !$$1.a(cfc.z) ? false : $$1.c(cfc.z).get().a($$0, 12.0);
   }

   protected static List<coe> c(cof $$0) {
      return $$0.ea().c(cfc.ao).orElse(ImmutableList.of());
   }

   private static List<coe> d(coe $$0) {
      return $$0.ea().c(cfc.an).orElse(ImmutableList.of());
   }

   public static boolean a(bvy $$0) {
      for (cxh $$1 : $$0.fd()) {
         if ($$1.a(awy.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cof $$0) {
      $$0.ea().b(cfc.m);
      $$0.O().m();
   }

   private static bxs<bvy> g() {
      bzr.a $$0 = new bzr.a(o);
      return bxw.a($$1 -> $$1.n_() && $$0.a($$1.dU().A), cfc.al, cfc.s, p);
   }

   protected static void b(ard $$0, coe $$1, bvy $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bvi.aj || $$2x.j() && ((cnz)$$2).gt()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(ard $$0, coe $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(ard $$0, coe $$1, bvy $$2) {
      if (cgi.d($$0, $$1, $$2)) {
         $$1.ea().b(cfc.E);
         $$1.ea().a(cfc.ab, $$2.cF(), 600L);
         if ($$2.aq() == bvi.aj && $$1.j()) {
            b($$1);
         }

         if ($$2.aq() == bvi.bR && $$0.O().b(dgv.P)) {
            $$1.ea().a(cfc.ac, true, 600L);
         }
      }
   }

   private static void d(ard $$0, coe $$1, bvy $$2) {
      Optional<cpr> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(ard $$0, coe $$1, bvy $$2) {
      Optional<bvy> $$3 = e($$1);
      bvy $$4 = bxt.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bvy> e(coe $$0) {
      return bxt.a($$0, cfc.ab);
   }

   public static Optional<bvy> d(cof $$0) {
      return $$0.ea().a(cfc.z) ? $$0.ea().c(cfc.z) : Optional.empty();
   }

   public static Optional<cpr> a(coe $$0) {
      return $$0.ea().a(cfc.l) ? $$0.ea().c(cfc.l) : Optional.empty();
   }

   private static void a(cof $$0, bvy $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cof).forEach($$1x -> b((cof)$$1x, $$1));
   }

   private static void b(cof $$0, bvy $$1) {
      bxa<cof> $$2 = $$0.ea();
      bvy $$3 = bxt.a($$0, $$2.c(cfc.z), $$1);
      $$3 = bxt.a($$0, $$2.c(cfc.o), $$3);
      c($$0, $$3);
   }

   private static boolean j(cof $$0) {
      bxa<cof> $$1 = $$0.ea();
      if (!$$1.a(cfc.z)) {
         return true;
      } else {
         bvy $$2 = $$1.c(cfc.z).get();
         bvi<?> $$3 = $$2.aq();
         if ($$3 == bvi.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cfc.ar, $$2) : false;
         }
      }
   }

   private static boolean k(cof $$0) {
      return !l($$0);
   }

   private static boolean l(cof $$0) {
      int $$1 = $$0.ea().c(cfc.as).orElse(0) + 1;
      int $$2 = $$0.ea().c(cfc.at).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cof $$0, bvy $$1) {
      $$0.ea().b(cfc.ab);
      $$0.ea().b(cfc.o);
      $$0.ea().b(cfc.m);
      $$0.ea().a(cfc.z, $$1, (long)q.a($$0.dU().A));
      b((coe)$$0);
   }

   protected static void b(coe $$0) {
      $$0.ea().a(cfc.ah, true, (long)d.a($$0.dU().A));
   }

   private static void m(cof $$0) {
      $$0.ea().a(cfc.av, true, 200L);
   }

   private static fbx n(cof $$0) {
      fbx $$1 = cgw.a($$0, 4, 2);
      return $$1 == null ? $$0.ds() : $$1;
   }

   private static boolean o(cof $$0) {
      return $$0.ea().a(cfc.av);
   }

   protected static boolean c(coe $$0) {
      return $$0.ea().c(cri.b);
   }

   private static boolean c(bvy $$0) {
      return $$0.b(cxl.wX);
   }

   private static void d(bvy $$0) {
      $$0.ea().a(cfc.ad, true, 119L);
   }

   private static boolean p(cof $$0) {
      return $$0.ea().a(cfc.ad);
   }

   private static boolean b(cxh $$0) {
      return $$0.a(c);
   }

   private static boolean c(cxh $$0) {
      return $$0.a(awy.ab);
   }

   private static boolean q(cof $$0) {
      return $$0.ea().a(cfc.aw);
   }

   private static boolean e(bvy $$0) {
      return $$0.ea().a(cfc.au);
   }

   private static boolean f(bvy $$0) {
      return !e($$0);
   }

   public static boolean b(bvy $$0) {
      return $$0.aq() == bvi.bR && $$0.b(cog::a);
   }

   private static boolean r(cof $$0) {
      return $$0.ea().a(cfc.ag);
   }

   private static boolean g(bvy $$0) {
      return $$0.ea().a(cfc.x);
   }

   private static boolean s(cof $$0) {
      return !$$0.fa().f();
   }

   private static boolean t(cof $$0) {
      return $$0.fa().f() || !a($$0.fa());
   }

   public static boolean a(bvi<?> $$0) {
      return $$0 == bvi.bQ || $$0 == bvi.bM;
   }
}
