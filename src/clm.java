import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class clm {
   public static final int a = 8;
   public static final int b = 4;
   public static final cuj c = cur.oJ;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bqb d = azo.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bqb o = azo.a(10, 40);
   private static final bqb p = azo.a(10, 30);
   private static final bqb q = azo.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bqb A = azo.a(5, 7);
   private static final bqb B = azo.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static buo<?> a(cll $$0, buo<cll> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cok.a));
      $$1.b(cok.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cll $$0, ayv $$1) {
      int $$2 = d.a($$1);
      $$0.dU().a(ccq.ah, true, (long)$$2);
   }

   private static void a(buo<cll> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bwl(45, 90), new bwp(), bwd.a(), e(), f(), clv.a(), clr.a(119), bxs.a(300, clm::a), bxv.a()));
   }

   private static void b(buo<cll> $$0) {
      $$0.a(cok.b, 10, ImmutableList.of(bxe.a(clm::b, 14.0F), bxr.a(clk::gn, clm::i), bys.a(cll::s, cls.a()), d(), g(), b(), c(), bxh.a(bsw.by, 4)));
   }

   private static void b(cll $$0, buo<cll> $$1) {
      $$1.a(
         cok.k,
         10,
         ImmutableList.of(bxu.a($$1x -> !b($$0, $$1x)), bys.a(clm::c, bvd.a(5, 0.75F)), bxk.a(1.0F), bwm.a(20), new bvn(), clq.a(), bvr.a(clm::h, ccq.o)),
         ccq.o
      );
   }

   private static void c(buo<cll> $$0) {
      $$0.a(
         cok.l,
         10,
         ImmutableList.of(
            d(),
            bxe.a(clm::b, 14.0F),
            bxr.a(clk::gn, clm::i),
            bys.a($$0x -> !$$0x.gu(), bvy.a(ccq.ai, 2, 1.0F)),
            bys.a(cll::gu, bvy.a(ccq.ai, 4, 0.6F)),
            new bxc(ImmutableList.of(Pair.of(bxe.a(bsw.aA, 8.0F), 1), Pair.of(bwx.a(0.6F, 2, 1), 1), Pair.of(new bvp(10, 20), 1)))
         ),
         ccq.ai
      );
   }

   private static void d(buo<cll> $$0) {
      $$0.a(cok.m, 10, ImmutableList.of(bvz.a(clm::v, 1.0F, true, 9), clt.a(9), clu.a(200, 200)), ccq.ad);
   }

   private static void e(buo<cll> $$0) {
      $$0.a(cok.n, 10, ImmutableList.of(bxj.b(ccq.z, 1.0F, 12, true), b(), c(), bvr.a(clm::l, ccq.z)), ccq.z);
   }

   private static void f(buo<cll> $$0) {
      $$0.a(
         cok.o,
         10,
         ImmutableList.of(
            bwn.a(0.8F),
            bxe.a(clm::b, 8.0F),
            bys.a(bys.a(bsq::bS), byb.a(ImmutableList.builder().addAll(a()).add(Pair.of(bys.a((Predicate<cll>)($$0x -> true)), 1)).build())),
            bvo.a(8, clm::a)
         ),
         ccq.s
      );
   }

   private static ImmutableList<Pair<bwq<btl>, Integer>> a() {
      return ImmutableList.of(Pair.of(bxe.a(bsw.by, 8.0F), 1), Pair.of(bxe.a(bsw.aA, 8.0F), 1), Pair.of(bxe.a(8.0F), 1));
   }

   private static bxc<btl> b() {
      return new bxc<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bvp(30, 60), 1)).build());
   }

   private static bxc<cll> c() {
      return new bxc<>(
         ImmutableList.of(
            Pair.of(bwx.a(0.6F), 2), Pair.of(bwc.a(bsw.aA, 8, ccq.q, 0.6F, 2), 2), Pair.of(bys.a(clm::f, bxm.a(0.6F, 3)), 2), Pair.of(new bvp(30, 60), 1)
         )
      );
   }

   private static bvg<btu> d() {
      return bxj.a(ccq.aw, 1.0F, 8, false);
   }

   private static bvg<cll> e() {
      return bvk.a(cll::o_, ccq.M, ccq.z, B);
   }

   private static bvg<cll> f() {
      return bvk.a(clm::h, ccq.ar, ccq.z, A);
   }

   protected static void a(cll $$0) {
      buo<cll> $$1 = $$0.dU();
      cok $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cok.m, cok.k, cok.n, cok.l, cok.o, cok.b));
      cok $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccq.o));
      if (!$$1.a(ccq.s) && f($$0)) {
         $$0.ad();
      }

      if (!$$1.a(ccq.ai)) {
         $$1.b(ccq.aj);
      }

      $$0.x($$1.a(ccq.aj));
   }

   private static boolean f(cll $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         bsq $$1 = $$0.dd();
         return $$1 instanceof cll && ((cll)$$1).o_() || $$1 instanceof clf && ((clf)$$1).o_();
      }
   }

   protected static void a(cll $$0, cjf $$1) {
      k($$0);
      cuo $$2;
      if ($$1.p().a(cur.si)) {
         $$0.a($$1, $$1.p().H());
         $$2 = $$1.p();
         $$1.aq();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dU().b(ccq.ae);
         c($$0, $$2);
         d((btl)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cuo.l);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cll $$0, cuo $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bqp.b));
      }

      $$0.q($$1);
   }

   private static cuo a(cjf $$0) {
      cuo $$1 = $$0.p();
      cuo $$2 = $$1.a(1);
      if ($$1.e()) {
         $$0.aq();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cll $$0, boolean $$1) {
      cuo $$2 = $$0.b(bqp.b);
      $$0.a(bqp.b, cuo.l);
      if ($$0.gn()) {
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
            cuo $$6 = $$0.eU();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(cll $$0) {
      if (r($$0) && !$$0.eV().e()) {
         $$0.b($$0.eV());
         $$0.a(bqp.b, cuo.l);
      }
   }

   private static void d(cll $$0, cuo $$1) {
      cuo $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cll $$0, List<cuo> $$1) {
      Optional<cmv> $$2 = $$0.dU().c(ccq.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cll $$0, List<cuo> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cll $$0, cmv $$1, List<cuo> $$2) {
      a($$0, $$2, $$1.do());
   }

   private static void a(cll $$0, List<cuo> $$1, eww $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bqp.b);

         for (cuo $$3 : $$1) {
            bvh.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cuo> g(cll $$0) {
      erq $$1 = $$0.dQ().o().be().b(erh.aW);
      List<cuo> $$2 = $$1.a(new ero.a((aqt)$$0.dQ()).a(euh.a, $$0).a(eug.k));
      return $$2;
   }

   private static boolean a(btl $$0, btl $$1) {
      return $$1.am() != bsw.Z ? false : ayv.a($$0.dQ().Z()).i() < 0.1F;
   }

   protected static boolean a(cll $$0, cuo $$1) {
      if ($$0.o_() && $$1.a(awm.V)) {
         return false;
      } else if ($$1.a(awm.T)) {
         return false;
      } else if (t($$0) && $$0.dU().a(ccq.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(cur.si)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cuo $$0) {
      return $$0.a(awm.U);
   }

   private static boolean a(cll $$0, bsq $$1) {
      return !($$1 instanceof btn $$2) ? false : !$$2.o_() || !$$2.bE() || g((btl)$$0) || g($$2) || $$2 instanceof cll && $$2.dd() == null;
   }

   private static boolean b(cll $$0, btl $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cll $$0) {
      buo<cll> $$1 = $$0.dU();
      if ($$1.a(ccq.ar)) {
         btl $$2 = $$1.c(ccq.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends btl> i(cll $$0) {
      buo<cll> $$1 = $$0.dU();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<btl> $$2 = bvh.a($$0, ccq.ab);
         if ($$2.isPresent() && cdw.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(ccq.ac)) {
               Optional<cmv> $$3 = $$1.c(ccq.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<btn> $$4 = $$1.c(ccq.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cmv> $$5 = $$1.c(ccq.am);
               return $$5.isPresent() && cdw.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cmv $$0, boolean $$1) {
      List<cll> $$2 = $$0.dQ().a(cll.class, $$0.cL().g(16.0));
      $$2.stream().filter(clm::d).filter($$2x -> !$$1 || bvh.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dQ().ab().b(dcq.O)) {
            d((clk)$$1x, $$0);
         } else {
            c((clk)$$1x, $$0);
         }
      });
   }

   public static bqq a(cll $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cuo $$4 = $$3.b(1, $$1);
         c($$0, $$4);
         d((btl)$$0);
         k($$0);
         return bqq.c;
      } else {
         return bqq.e;
      }
   }

   protected static boolean b(cll $$0, cuo $$1) {
      return !t($$0) && !r($$0) && $$0.gn() && b($$1);
   }

   protected static void a(cll $$0, btl $$1) {
      if (!($$1 instanceof cll)) {
         if (u($$0)) {
            a($$0, false);
         }

         buo<cll> $$2 = $$0.dU();
         $$2.b(ccq.ai);
         $$2.b(ccq.aj);
         $$2.b(ccq.ad);
         if ($$1 instanceof cmv) {
            $$2.a(ccq.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.am() != $$1.am()) {
               $$2.b(ccq.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(ccq.z, $$1, 100L);
            if (cdw.d($$0, $$1)) {
               b((clk)$$0, $$1);
            }
         } else if ($$1.am() == bsw.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((clk)$$0, $$1);
         }
      }
   }

   protected static void a(clk $$0, btl $$1) {
      if (!$$0.dU().c(cok.n)) {
         if (cdw.d($$0, $$1)) {
            if (!bvh.a($$0, $$1, 4.0)) {
               if ($$1.am() == bsw.by && $$0.dQ().ab().b(dcq.O)) {
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

   public static Optional<avn> c(cll $$0) {
      return $$0.dU().g().map($$1 -> a($$0, $$1));
   }

   private static avn a(cll $$0, cok $$1) {
      if ($$1 == cok.k) {
         return avo.tH;
      } else if ($$0.gm()) {
         return avo.tM;
      } else if ($$1 == cok.n && j($$0)) {
         return avo.tM;
      } else if ($$1 == cok.m) {
         return avo.tF;
      } else if ($$1 == cok.l) {
         return avo.tI;
      } else if (e((btl)$$0)) {
         return avo.tK;
      } else {
         return s($$0) ? avo.tM : avo.tG;
      }
   }

   private static boolean j(cll $$0) {
      buo<cll> $$1 = $$0.dU();
      return !$$1.a(ccq.z) ? false : $$1.c(ccq.z).get().a($$0, 12.0);
   }

   protected static List<clk> d(cll $$0) {
      return $$0.dU().c(ccq.ao).orElse(ImmutableList.of());
   }

   private static List<clk> e(clk $$0) {
      return $$0.dU().c(ccq.an).orElse(ImmutableList.of());
   }

   public static boolean a(btl $$0) {
      for (cuo $$2 : $$0.eY()) {
         cuj $$3 = $$2.g();
         if ($$3 instanceof csd && ((csd)$$3).h().a(csf.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(cll $$0) {
      $$0.dU().b(ccq.m);
      $$0.J().n();
   }

   private static bvg<btl> g() {
      bxf.a $$0 = new bxf.a(o);
      return bvk.a($$1 -> $$1.o_() && $$0.a($$1.dQ().z), ccq.al, ccq.s, p);
   }

   protected static void b(clk $$0, btl $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.am() != bsw.Z || $$1x.s() && ((clf)$$1).gn()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(clk $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(clk $$0, btl $$1) {
      if (cdw.d($$0, $$1)) {
         $$0.dU().b(ccq.E);
         $$0.dU().a(ccq.ab, $$1.cA(), 600L);
         if ($$1.am() == bsw.Z && $$0.s()) {
            c($$0);
         }

         if ($$1.am() == bsw.by && $$0.dQ().ab().b(dcq.O)) {
            $$0.dU().a(ccq.ac, true, 600L);
         }
      }
   }

   private static void d(clk $$0, btl $$1) {
      Optional<cmv> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(clk $$0, btl $$1) {
      Optional<btl> $$2 = f($$0);
      btl $$3 = bvh.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<btl> f(clk $$0) {
      return bvh.a($$0, ccq.ab);
   }

   public static Optional<btl> e(cll $$0) {
      return $$0.dU().a(ccq.z) ? $$0.dU().c(ccq.z) : Optional.empty();
   }

   public static Optional<cmv> b(clk $$0) {
      return $$0.dU().a(ccq.l) ? $$0.dU().c(ccq.l) : Optional.empty();
   }

   private static void c(cll $$0, btl $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cll).forEach($$1x -> d((cll)$$1x, $$1));
   }

   private static void d(cll $$0, btl $$1) {
      buo<cll> $$2 = $$0.dU();
      btl $$3 = bvh.a($$0, $$2.c(ccq.z), $$1);
      $$3 = bvh.a($$0, $$2.c(ccq.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cll $$0) {
      buo<cll> $$1 = $$0.dU();
      if (!$$1.a(ccq.z)) {
         return true;
      } else {
         btl $$2 = $$1.c(ccq.z).get();
         bsw<?> $$3 = $$2.am();
         if ($$3 == bsw.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(ccq.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cll $$0) {
      return !n($$0);
   }

   private static boolean n(cll $$0) {
      int $$1 = $$0.dU().c(ccq.as).orElse(0) + 1;
      int $$2 = $$0.dU().c(ccq.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cll $$0, btl $$1) {
      $$0.dU().b(ccq.ab);
      $$0.dU().b(ccq.o);
      $$0.dU().b(ccq.m);
      $$0.dU().a(ccq.z, $$1, (long)q.a($$0.dQ().z));
      c((clk)$$0);
   }

   protected static void c(clk $$0) {
      $$0.dU().a(ccq.ah, true, (long)d.a($$0.dQ().z));
   }

   private static void o(cll $$0) {
      $$0.dU().a(ccq.av, true, 200L);
   }

   private static eww p(cll $$0) {
      eww $$1 = cek.a($$0, 4, 2);
      return $$1 == null ? $$0.do() : $$1;
   }

   private static boolean q(cll $$0) {
      return $$0.dU().a(ccq.av);
   }

   protected static boolean d(clk $$0) {
      return $$0.dU().c(cok.b);
   }

   private static boolean c(btl $$0) {
      return $$0.b(cur.vW);
   }

   private static void d(btl $$0) {
      $$0.dU().a(ccq.ad, true, 119L);
   }

   private static boolean r(cll $$0) {
      return $$0.dU().a(ccq.ad);
   }

   private static boolean b(cuo $$0) {
      return $$0.a(c);
   }

   private static boolean c(cuo $$0) {
      return $$0.a(awm.Y);
   }

   private static boolean s(cll $$0) {
      return $$0.dU().a(ccq.aw);
   }

   private static boolean e(btl $$0) {
      return $$0.dU().a(ccq.au);
   }

   private static boolean f(btl $$0) {
      return !e($$0);
   }

   public static boolean b(btl $$0) {
      return $$0.am() == bsw.by && $$0.b(clm::a);
   }

   private static boolean t(cll $$0) {
      return $$0.dU().a(ccq.ag);
   }

   private static boolean g(btl $$0) {
      return $$0.dU().a(ccq.x);
   }

   private static boolean u(cll $$0) {
      return !$$0.eV().e();
   }

   private static boolean v(cll $$0) {
      return $$0.eV().e() || !a($$0.eV());
   }

   public static boolean a(bsw<?> $$0) {
      return $$0 == bsw.bx || $$0 == bsw.bt;
   }
}
