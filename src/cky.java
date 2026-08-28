import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cky {
   public static final int a = 8;
   public static final int b = 4;
   public static final ctv c = cud.oI;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bpo d = aze.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bpo o = aze.a(10, 40);
   private static final bpo p = aze.a(10, 30);
   private static final bpo q = aze.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bpo A = aze.a(5, 7);
   private static final bpo B = aze.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bua<?> a(ckx $$0, bua<ckx> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cnw.a));
      $$1.b(cnw.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ckx $$0, aym $$1) {
      int $$2 = d.a($$1);
      $$0.dT().a(ccc.ah, true, (long)$$2);
   }

   private static void a(bua<ckx> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bvx(45, 90), new bwb(), bvp.a(), e(), f(), clh.a(), cld.a(119), bxe.a(300, cky::a), bxh.a()));
   }

   private static void b(bua<ckx> $$0) {
      $$0.a(cnw.b, 10, ImmutableList.of(bwq.a(cky::b, 14.0F), bxd.a(ckw::go, cky::i), bye.a(ckx::s, cle.a()), d(), g(), b(), c(), bwt.a(bsj.by, 4)));
   }

   private static void b(ckx $$0, bua<ckx> $$1) {
      $$1.a(
         cnw.k,
         10,
         ImmutableList.of(bxg.a($$1x -> !b($$0, $$1x)), bye.a(cky::c, bup.a(5, 0.75F)), bww.a(1.0F), bvy.a(20), new buz(), clc.a(), bvd.a(cky::h, ccc.o)),
         ccc.o
      );
   }

   private static void c(bua<ckx> $$0) {
      $$0.a(
         cnw.l,
         10,
         ImmutableList.of(
            d(),
            bwq.a(cky::b, 14.0F),
            bxd.a(ckw::go, cky::i),
            bye.a($$0x -> !$$0x.gv(), bvk.a(ccc.ai, 2, 1.0F)),
            bye.a(ckx::gv, bvk.a(ccc.ai, 4, 0.6F)),
            new bwo(ImmutableList.of(Pair.of(bwq.a(bsj.aA, 8.0F), 1), Pair.of(bwj.a(0.6F, 2, 1), 1), Pair.of(new bvb(10, 20), 1)))
         ),
         ccc.ai
      );
   }

   private static void d(bua<ckx> $$0) {
      $$0.a(cnw.m, 10, ImmutableList.of(bvl.a(cky::v, 1.0F, true, 9), clf.a(9), clg.a(200, 200)), ccc.ad);
   }

   private static void e(bua<ckx> $$0) {
      $$0.a(cnw.n, 10, ImmutableList.of(bwv.b(ccc.z, 1.0F, 12, true), b(), c(), bvd.a(cky::l, ccc.z)), ccc.z);
   }

   private static void f(bua<ckx> $$0) {
      $$0.a(
         cnw.o,
         10,
         ImmutableList.of(
            bvz.a(0.8F),
            bwq.a(cky::b, 8.0F),
            bye.a(bye.a(bsd::bR), bxn.a(ImmutableList.builder().addAll(a()).add(Pair.of(bye.a((Predicate<ckx>)($$0x -> true)), 1)).build())),
            bva.a(8, cky::a)
         ),
         ccc.s
      );
   }

   private static ImmutableList<Pair<bwc<bsy>, Integer>> a() {
      return ImmutableList.of(Pair.of(bwq.a(bsj.by, 8.0F), 1), Pair.of(bwq.a(bsj.aA, 8.0F), 1), Pair.of(bwq.a(8.0F), 1));
   }

   private static bwo<bsy> b() {
      return new bwo<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bvb(30, 60), 1)).build());
   }

   private static bwo<ckx> c() {
      return new bwo<>(
         ImmutableList.of(
            Pair.of(bwj.a(0.6F), 2), Pair.of(bvo.a(bsj.aA, 8, ccc.q, 0.6F, 2), 2), Pair.of(bye.a(cky::f, bwy.a(0.6F, 3)), 2), Pair.of(new bvb(30, 60), 1)
         )
      );
   }

   private static bus<bth> d() {
      return bwv.a(ccc.aw, 1.0F, 8, false);
   }

   private static bus<ckx> e() {
      return buw.a(ckx::p_, ccc.M, ccc.z, B);
   }

   private static bus<ckx> f() {
      return buw.a(cky::h, ccc.ar, ccc.z, A);
   }

   protected static void a(ckx $$0) {
      bua<ckx> $$1 = $$0.dT();
      cnw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnw.m, cnw.k, cnw.n, cnw.l, cnw.o, cnw.b));
      cnw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccc.o));
      if (!$$1.a(ccc.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(ccc.ai)) {
         $$1.b(ccc.aj);
      }

      $$0.x($$1.a(ccc.aj));
   }

   private static boolean f(ckx $$0) {
      if (!$$0.p_()) {
         return false;
      } else {
         bsd $$1 = $$0.dc();
         return $$1 instanceof ckx && ((ckx)$$1).p_() || $$1 instanceof ckr && ((ckr)$$1).p_();
      }
   }

   protected static void a(ckx $$0, cir $$1) {
      k($$0);
      cua $$2;
      if ($$1.p().a(cud.si)) {
         $$0.a($$1, $$1.p().H());
         $$2 = $$1.p();
         $$1.ao();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dT().b(ccc.ae);
         c($$0, $$2);
         d((bsy)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cua.l);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(ckx $$0, cua $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bqc.b));
      }

      $$0.q($$1);
   }

   private static cua a(cir $$0) {
      cua $$1 = $$0.p();
      cua $$2 = $$1.a(1);
      if ($$1.e()) {
         $$0.ao();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(ckx $$0, boolean $$1) {
      cua $$2 = $$0.b(bqc.b);
      $$0.a(bqc.b, cua.l);
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
            cua $$6 = $$0.eT();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(ckx $$0) {
      if (r($$0) && !$$0.eU().e()) {
         $$0.b($$0.eU());
         $$0.a(bqc.b, cua.l);
      }
   }

   private static void d(ckx $$0, cua $$1) {
      cua $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(ckx $$0, List<cua> $$1) {
      Optional<cmh> $$2 = $$0.dT().c(ccc.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(ckx $$0, List<cua> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(ckx $$0, cmh $$1, List<cua> $$2) {
      a($$0, $$2, $$1.dn());
   }

   private static void a(ckx $$0, List<cua> $$1, evz $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bqc.b);

         for (cua $$3 : $$1) {
            but.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cua> g(ckx $$0) {
      eqt $$1 = $$0.dP().o().be().b(eqk.aW);
      List<cua> $$2 = $$1.a(new eqr.a((aqk)$$0.dP()).a(etk.a, $$0).a(etj.k));
      return $$2;
   }

   private static boolean a(bsy $$0, bsy $$1) {
      return $$1.ak() != bsj.Z ? false : aym.a($$0.dP().Z()).i() < 0.1F;
   }

   protected static boolean a(ckx $$0, cua $$1) {
      if ($$0.p_() && $$1.a(awd.V)) {
         return false;
      } else if ($$1.a(awd.T)) {
         return false;
      } else if (t($$0) && $$0.dT().a(ccc.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(cud.si)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cua $$0) {
      return $$0.a(awd.U);
   }

   private static boolean a(ckx $$0, bsd $$1) {
      return !($$1 instanceof bta $$2) ? false : !$$2.p_() || !$$2.bD() || g((bsy)$$0) || g($$2) || $$2 instanceof ckx && $$2.dc() == null;
   }

   private static boolean b(ckx $$0, bsy $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(ckx $$0) {
      bua<ckx> $$1 = $$0.dT();
      if ($$1.a(ccc.ar)) {
         bsy $$2 = $$1.c(ccc.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bsy> i(ckx $$0) {
      bua<ckx> $$1 = $$0.dT();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bsy> $$2 = but.a($$0, ccc.ab);
         if ($$2.isPresent() && cdi.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(ccc.ac)) {
               Optional<cmh> $$3 = $$1.c(ccc.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bta> $$4 = $$1.c(ccc.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cmh> $$5 = $$1.c(ccc.am);
               return $$5.isPresent() && cdi.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cmh $$0, boolean $$1) {
      List<ckx> $$2 = $$0.dP().a(ckx.class, $$0.cK().g(16.0));
      $$2.stream().filter(cky::d).filter($$2x -> !$$1 || but.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dP().ab().b(dbz.O)) {
            d((ckw)$$1x, $$0);
         } else {
            c((ckw)$$1x, $$0);
         }
      });
   }

   public static bqd a(ckx $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cua $$4 = $$3.a(1);
         c($$0, $$4);
         d((bsy)$$0);
         k($$0);
         return bqd.c;
      } else {
         return bqd.e;
      }
   }

   protected static boolean b(ckx $$0, cua $$1) {
      return !t($$0) && !r($$0) && $$0.go() && b($$1);
   }

   protected static void a(ckx $$0, bsy $$1) {
      if (!($$1 instanceof ckx)) {
         if (u($$0)) {
            a($$0, false);
         }

         bua<ckx> $$2 = $$0.dT();
         $$2.b(ccc.ai);
         $$2.b(ccc.aj);
         $$2.b(ccc.ad);
         if ($$1 instanceof cmh) {
            $$2.a(ccc.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ak() != $$1.ak()) {
               $$2.b(ccc.z);
            }
         });
         if ($$0.p_()) {
            $$2.a(ccc.z, $$1, 100L);
            if (cdi.d($$0, $$1)) {
               b((ckw)$$0, $$1);
            }
         } else if ($$1.ak() == bsj.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((ckw)$$0, $$1);
         }
      }
   }

   protected static void a(ckw $$0, bsy $$1) {
      if (!$$0.dT().c(cnw.n)) {
         if (cdi.d($$0, $$1)) {
            if (!but.a($$0, $$1, 4.0)) {
               if ($$1.ak() == bsj.by && $$0.dP().ab().b(dbz.O)) {
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

   public static Optional<ave> c(ckx $$0) {
      return $$0.dT().g().map($$1 -> a($$0, $$1));
   }

   private static ave a(ckx $$0, cnw $$1) {
      if ($$1 == cnw.k) {
         return avf.tH;
      } else if ($$0.gn()) {
         return avf.tM;
      } else if ($$1 == cnw.n && j($$0)) {
         return avf.tM;
      } else if ($$1 == cnw.m) {
         return avf.tF;
      } else if ($$1 == cnw.l) {
         return avf.tI;
      } else if (e((bsy)$$0)) {
         return avf.tK;
      } else {
         return s($$0) ? avf.tM : avf.tG;
      }
   }

   private static boolean j(ckx $$0) {
      bua<ckx> $$1 = $$0.dT();
      return !$$1.a(ccc.z) ? false : $$1.c(ccc.z).get().a($$0, 12.0);
   }

   protected static List<ckw> d(ckx $$0) {
      return $$0.dT().c(ccc.ao).orElse(ImmutableList.of());
   }

   private static List<ckw> e(ckw $$0) {
      return $$0.dT().c(ccc.an).orElse(ImmutableList.of());
   }

   public static boolean a(bsy $$0) {
      for (cua $$2 : $$0.eX()) {
         ctv $$3 = $$2.g();
         if ($$3 instanceof crp && ((crp)$$3).h().a(crr.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(ckx $$0) {
      $$0.dT().b(ccc.m);
      $$0.K().n();
   }

   private static bus<bsy> g() {
      bwr.a $$0 = new bwr.a(o);
      return buw.a($$1 -> $$1.p_() && $$0.a($$1.dP().z), ccc.al, ccc.s, p);
   }

   protected static void b(ckw $$0, bsy $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ak() != bsj.Z || $$1x.s() && ((ckr)$$1).gt()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(ckw $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(ckw $$0, bsy $$1) {
      if (cdi.d($$0, $$1)) {
         $$0.dT().b(ccc.E);
         $$0.dT().a(ccc.ab, $$1.cz(), 600L);
         if ($$1.ak() == bsj.Z && $$0.s()) {
            c($$0);
         }

         if ($$1.ak() == bsj.by && $$0.dP().ab().b(dbz.O)) {
            $$0.dT().a(ccc.ac, true, 600L);
         }
      }
   }

   private static void d(ckw $$0, bsy $$1) {
      Optional<cmh> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(ckw $$0, bsy $$1) {
      Optional<bsy> $$2 = f($$0);
      bsy $$3 = but.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bsy> f(ckw $$0) {
      return but.a($$0, ccc.ab);
   }

   public static Optional<bsy> e(ckx $$0) {
      return $$0.dT().a(ccc.z) ? $$0.dT().c(ccc.z) : Optional.empty();
   }

   public static Optional<cmh> b(ckw $$0) {
      return $$0.dT().a(ccc.l) ? $$0.dT().c(ccc.l) : Optional.empty();
   }

   private static void c(ckx $$0, bsy $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof ckx).forEach($$1x -> d((ckx)$$1x, $$1));
   }

   private static void d(ckx $$0, bsy $$1) {
      bua<ckx> $$2 = $$0.dT();
      bsy $$3 = but.a($$0, $$2.c(ccc.z), $$1);
      $$3 = but.a($$0, $$2.c(ccc.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(ckx $$0) {
      bua<ckx> $$1 = $$0.dT();
      if (!$$1.a(ccc.z)) {
         return true;
      } else {
         bsy $$2 = $$1.c(ccc.z).get();
         bsj<?> $$3 = $$2.ak();
         if ($$3 == bsj.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(ccc.ar, $$2) : false;
         }
      }
   }

   private static boolean m(ckx $$0) {
      return !n($$0);
   }

   private static boolean n(ckx $$0) {
      int $$1 = $$0.dT().c(ccc.as).orElse(0) + 1;
      int $$2 = $$0.dT().c(ccc.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(ckx $$0, bsy $$1) {
      $$0.dT().b(ccc.ab);
      $$0.dT().b(ccc.o);
      $$0.dT().b(ccc.m);
      $$0.dT().a(ccc.z, $$1, (long)q.a($$0.dP().z));
      c((ckw)$$0);
   }

   protected static void c(ckw $$0) {
      $$0.dT().a(ccc.ah, true, (long)d.a($$0.dP().z));
   }

   private static void o(ckx $$0) {
      $$0.dT().a(ccc.av, true, 200L);
   }

   private static evz p(ckx $$0) {
      evz $$1 = cdw.a($$0, 4, 2);
      return $$1 == null ? $$0.dn() : $$1;
   }

   private static boolean q(ckx $$0) {
      return $$0.dT().a(ccc.av);
   }

   protected static boolean d(ckw $$0) {
      return $$0.dT().c(cnw.b);
   }

   private static boolean c(bsy $$0) {
      return $$0.b(cud.vW);
   }

   private static void d(bsy $$0) {
      $$0.dT().a(ccc.ad, true, 119L);
   }

   private static boolean r(ckx $$0) {
      return $$0.dT().a(ccc.ad);
   }

   private static boolean b(cua $$0) {
      return $$0.a(c);
   }

   private static boolean c(cua $$0) {
      return $$0.a(awd.Y);
   }

   private static boolean s(ckx $$0) {
      return $$0.dT().a(ccc.aw);
   }

   private static boolean e(bsy $$0) {
      return $$0.dT().a(ccc.au);
   }

   private static boolean f(bsy $$0) {
      return !e($$0);
   }

   public static boolean b(bsy $$0) {
      return $$0.ak() == bsj.by && $$0.b(cky::a);
   }

   private static boolean t(ckx $$0) {
      return $$0.dT().a(ccc.ag);
   }

   private static boolean g(bsy $$0) {
      return $$0.dT().a(ccc.x);
   }

   private static boolean u(ckx $$0) {
      return !$$0.eU().e();
   }

   private static boolean v(ckx $$0) {
      return $$0.eU().e() || !a($$0.eU());
   }

   public static boolean a(bsj<?> $$0) {
      return $$0 == bsj.bx || $$0 == bsj.bt;
   }
}
