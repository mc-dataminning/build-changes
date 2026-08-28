import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cpz {
   public static final int a = 8;
   public static final int b = 4;
   public static final czg c = czo.px;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final btr d = baq.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final btr o = baq.a(10, 40);
   private static final btr p = baq.a(10, 30);
   private static final btr q = baq.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final btr A = baq.a(5, 7);
   private static final btr B = baq.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static byj<?> a(cpy $$0, byj<cpy> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(ctd.a));
      $$1.b(ctd.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cpy $$0, azv $$1) {
      int $$2 = d.a($$1);
      $$0.eb().a(cgl.ai, true, (long)$$2);
   }

   private static void a(byj<cpy> $$0) {
      $$0.a(ctd.a, 0, ImmutableList.of(new cag(45, 90), new cak(), bzy.a(), e(), f(), cqi.a(), cqe.a(119), cbn.a(300, cpz::a), cbq.a()));
   }

   private static void b(byj<cpy> $$0) {
      $$0.a(
         ctd.b, 10, ImmutableList.of(caz.a(cpz::b, 14.0F), cbm.a(($$0x, $$1) -> $$1.t(), cpz::b), ccn.a(cpy::j, cqf.a()), d(), g(), b(), c(), cbc.a(bwr.bS, 4))
      );
   }

   private static void b(cpy $$0, byj<cpy> $$1) {
      $$1.a(
         ctd.k,
         10,
         ImmutableList.of(
            cbp.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), ccn.a(cpz::c, byy.a(5, 0.75F)), cbf.a(1.0F), cah.a(20), new bzi(), cqd.a(), bzm.a(cpz::g, cgl.p)
         ),
         cgl.p
      );
   }

   private static void c(byj<cpy> $$0) {
      $$0.a(
         ctd.l,
         10,
         ImmutableList.of(
            d(),
            caz.a(cpz::b, 14.0F),
            cbm.a(($$0x, $$1) -> $$1.t(), cpz::b),
            ccn.a($$0x -> !$$0x.gy(), bzt.a(cgl.aj, 2, 1.0F)),
            ccn.a(cpy::gy, bzt.a(cgl.aj, 4, 0.6F)),
            new cax(ImmutableList.of(Pair.of(caz.a(bwr.aR, 8.0F), 1), Pair.of(cas.a(0.6F, 2, 1), 1), Pair.of(new bzk(10, 20), 1)))
         ),
         cgl.aj
      );
   }

   private static void d(byj<cpy> $$0) {
      $$0.a(ctd.m, 10, ImmutableList.of(bzu.a(cpz::t, 1.0F, true, 9), cqg.a(9), cqh.a(200, 200)), cgl.ae);
   }

   private static void e(byj<cpy> $$0) {
      $$0.a(ctd.n, 10, ImmutableList.of(cbe.b(cgl.A, 1.0F, 12, true), b(), c(), bzm.a(cpz::j, cgl.A)), cgl.A);
   }

   private static void f(byj<cpy> $$0) {
      $$0.a(
         ctd.o,
         10,
         ImmutableList.of(
            cai.a(0.8F),
            caz.a(cpz::b, 8.0F),
            ccn.a(ccn.a(bwi::bX), cbw.a(ImmutableList.builder().addAll(a()).add(Pair.of(ccn.a((Predicate<cpy>)($$0x -> true)), 1)).build())),
            bzj.a(8, cpz::a)
         ),
         cgl.t
      );
   }

   private static ImmutableList<Pair<cal<bxj>, Integer>> a() {
      return ImmutableList.of(Pair.of(caz.a(bwr.bS, 8.0F), 1), Pair.of(caz.a(bwr.aR, 8.0F), 1), Pair.of(caz.a(8.0F), 1));
   }

   private static cax<bxj> b() {
      return new cax<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bzk(30, 60), 1)).build());
   }

   private static cax<cpy> c() {
      return new cax<>(
         ImmutableList.of(
            Pair.of(cas.a(0.6F), 2), Pair.of(bzx.a(bwr.aR, 8, cgl.r, 0.6F, 2), 2), Pair.of(ccn.a(cpz::f, cbh.a(0.6F, 3)), 2), Pair.of(new bzk(30, 60), 1)
         )
      );
   }

   private static bzb<bxr> d() {
      return cbe.a(cgl.ax, 1.0F, 8, false);
   }

   private static bzb<cpy> e() {
      return bzf.a(cpy::n_, cgl.N, cgl.A, B);
   }

   private static bzb<cpy> f() {
      return bzf.a(cpz::g, cgl.as, cgl.A, A);
   }

   protected static void a(cpy $$0) {
      byj<cpy> $$1 = $$0.eb();
      ctd $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctd.m, ctd.k, ctd.n, ctd.l, ctd.o, ctd.b));
      ctd $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgl.p));
      if (!$$1.a(cgl.t) && e($$0)) {
         $$0.bN();
      }

      if (!$$1.a(cgl.aj)) {
         $$1.b(cgl.ak);
      }

      $$0.x($$1.a(cgl.ak));
   }

   private static boolean e(cpy $$0) {
      if (!$$0.n_()) {
         return false;
      } else {
         bwi $$1 = $$0.dj();
         return $$1 instanceof cpy && ((cpy)$$1).n_() || $$1 instanceof cps && ((cps)$$1).n_();
      }
   }

   protected static void a(arq $$0, cpy $$1, cno $$2) {
      i($$1);
      czk $$3;
      if ($$2.f().a(czo.tq)) {
         $$1.a($$2, $$2.f().M());
         $$3 = $$2.f();
         $$2.aq();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.eb().b(cgl.af);
         a($$0, $$1, $$3);
         d((bxj)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(czk.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(arq $$0, cpy $$1, czk $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(buf.b));
      }

      $$1.l($$2);
   }

   private static czk a(cno $$0) {
      czk $$1 = $$0.f();
      czk $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.aq();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(arq $$0, cpy $$1, boolean $$2) {
      czk $$3 = $$1.b(buf.b);
      $$1.a(buf.b, czk.k);
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
            czk $$7 = $$1.fa();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(arq $$0, cpy $$1) {
      if (p($$1) && !$$1.fb().f()) {
         $$1.a($$0, $$1.fb());
         $$1.a(buf.b, czk.k);
      }
   }

   private static void c(cpy $$0, czk $$1) {
      czk $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cpy $$0, List<czk> $$1) {
      Optional<crj> $$2 = $$0.eb().c(cgl.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cpy $$0, List<czk> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cpy $$0, crj $$1, List<czk> $$2) {
      a($$0, $$2, $$1.ds());
   }

   private static void a(cpy $$0, List<czk> $$1, fex $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(buf.b);

         for (czk $$3 : $$1) {
            bzc.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<czk> f(cpy $$0) {
      ezt $$1 = $$0.dU().p().bc().b(ezk.aK);
      List<czk> $$2 = $$1.a(new ezr.a((arq)$$0.dU()).a(fci.a, $$0).a(fch.k));
      return $$2;
   }

   private static boolean a(bxj $$0, bxj $$1) {
      return $$1.an() != bwr.aj ? false : azv.a($$0.dU().ae()).i() < 0.1F;
   }

   protected static boolean a(cpy $$0, czk $$1) {
      if ($$0.n_() && $$1.a(axk.U)) {
         return false;
      } else if ($$1.a(axk.S)) {
         return false;
      } else if (r($$0) && $$0.eb().a(cgl.p)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(czo.tq)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(czk $$0) {
      return $$0.a(axk.T);
   }

   private static boolean a(cpy $$0, bwi $$1) {
      return !($$1 instanceof bxl $$2) ? false : !$$2.n_() || !$$2.bI() || g((bxj)$$0) || g($$2) || $$2 instanceof cpy && $$2.dj() == null;
   }

   private static boolean b(arq $$0, cpy $$1, bxj $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cpy $$0) {
      byj<cpy> $$1 = $$0.eb();
      if ($$1.a(cgl.as)) {
         bxj $$2 = $$1.c(cgl.as).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bxj> b(arq $$0, cpy $$1) {
      byj<cpy> $$2 = $$1.eb();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bxj> $$3 = bzc.a($$1, cgl.ac);
         if ($$3.isPresent() && chr.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cgl.ad)) {
               Optional<crj> $$4 = $$2.c(cgl.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bxl> $$5 = $$2.c(cgl.N);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<crj> $$6 = $$2.c(cgl.an);
               return $$6.isPresent() && chr.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(arq $$0, crj $$1, boolean $$2) {
      List<cpy> $$3 = $$1.dU().a(cpy.class, $$1.cQ().g(16.0));
      $$3.stream().filter(cpz::c).filter($$2x -> !$$2 || bzc.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().c(djd.Q)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bug a(arq $$0, cpy $$1, crj $$2, buf $$3) {
      czk $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         czk $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bxj)$$1);
         i($$1);
         return bug.a;
      } else {
         return bug.e;
      }
   }

   protected static boolean b(cpy $$0, czk $$1) {
      return !r($$0) && !p($$0) && $$0.t() && b($$1);
   }

   protected static void a(arq $$0, cpy $$1, bxj $$2) {
      if (!($$2 instanceof cpy)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         byj<cpy> $$3 = $$1.eb();
         $$3.b(cgl.aj);
         $$3.b(cgl.ak);
         $$3.b(cgl.ae);
         if ($$2 instanceof crj) {
            $$3.a(cgl.ah, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.an() != $$2.an()) {
               $$3.b(cgl.A);
            }
         });
         if ($$1.n_()) {
            $$3.a(cgl.A, $$2, 100L);
            if (chr.d($$0, $$1, $$2)) {
               b($$0, (cpx)$$1, $$2);
            }
         } else if ($$2.an() == bwr.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cpx)$$1, $$2);
         }
      }
   }

   protected static void a(arq $$0, cpx $$1, bxj $$2) {
      if (!$$1.eb().c(ctd.n)) {
         if (chr.d($$0, $$1, $$2)) {
            if (!bzc.a($$1, $$2, 4.0)) {
               if ($$2.an() == bwr.bS && $$0.O().c(djd.Q)) {
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

   public static Optional<awm> b(cpy $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cpy $$0, ctd $$1) {
      if ($$1 == ctd.k) {
         return awn.uv;
      } else if ($$0.q()) {
         return awn.uA;
      } else if ($$1 == ctd.n && h($$0)) {
         return awn.uA;
      } else if ($$1 == ctd.m) {
         return awn.ut;
      } else if ($$1 == ctd.l) {
         return awn.uw;
      } else if (e((bxj)$$0)) {
         return awn.uy;
      } else {
         return q($$0) ? awn.uA : awn.uu;
      }
   }

   private static boolean h(cpy $$0) {
      byj<cpy> $$1 = $$0.eb();
      return !$$1.a(cgl.A) ? false : $$1.c(cgl.A).get().a($$0, 12.0);
   }

   protected static List<cpx> c(cpy $$0) {
      return $$0.eb().c(cgl.ap).orElse(ImmutableList.of());
   }

   private static List<cpx> d(cpx $$0) {
      return $$0.eb().c(cgl.ao).orElse(ImmutableList.of());
   }

   public static boolean a(bxj $$0) {
      for (bws $$1 : bwt.i) {
         if ($$0.a($$1).a(axk.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cpy $$0) {
      $$0.eb().b(cgl.n);
      $$0.O().m();
   }

   private static bzb<bxj> g() {
      cba.a $$0 = new cba.a(o);
      return bzf.a($$1 -> $$1.n_() && $$0.a($$1.dU().A), cgl.am, cgl.t, p);
   }

   protected static void b(arq $$0, cpx $$1, bxj $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.an() != bwr.aj || $$2x.j() && ((cps)$$2).gu()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(arq $$0, cpx $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(arq $$0, cpx $$1, bxj $$2) {
      if (chr.d($$0, $$1, $$2)) {
         $$1.eb().b(cgl.F);
         $$1.eb().a(cgl.ac, $$2.cF(), 600L);
         if ($$2.an() == bwr.aj && $$1.j()) {
            b($$1);
         }

         if ($$2.an() == bwr.bS && $$0.O().c(djd.Q)) {
            $$1.eb().a(cgl.ad, true, 600L);
         }
      }
   }

   private static void d(arq $$0, cpx $$1, bxj $$2) {
      Optional<crj> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(arq $$0, cpx $$1, bxj $$2) {
      Optional<bxj> $$3 = e($$1);
      bxj $$4 = bzc.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bxj> e(cpx $$0) {
      return bzc.a($$0, cgl.ac);
   }

   public static Optional<bxj> d(cpy $$0) {
      return $$0.eb().a(cgl.A) ? $$0.eb().c(cgl.A) : Optional.empty();
   }

   public static Optional<crj> a(cpx $$0) {
      return $$0.eb().a(cgl.l) ? $$0.eb().c(cgl.l) : Optional.empty();
   }

   private static void a(cpy $$0, bxj $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cpy).forEach($$1x -> b((cpy)$$1x, $$1));
   }

   private static void b(cpy $$0, bxj $$1) {
      byj<cpy> $$2 = $$0.eb();
      bxj $$3 = bzc.a($$0, $$2.c(cgl.A), $$1);
      $$3 = bzc.a($$0, $$2.c(cgl.p), $$3);
      c($$0, $$3);
   }

   private static boolean j(cpy $$0) {
      byj<cpy> $$1 = $$0.eb();
      if (!$$1.a(cgl.A)) {
         return true;
      } else {
         bxj $$2 = $$1.c(cgl.A).get();
         bwr<?> $$3 = $$2.an();
         if ($$3 == bwr.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cgl.as, $$2) : false;
         }
      }
   }

   private static boolean k(cpy $$0) {
      return !l($$0);
   }

   private static boolean l(cpy $$0) {
      int $$1 = $$0.eb().c(cgl.at).orElse(0) + 1;
      int $$2 = $$0.eb().c(cgl.au).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cpy $$0, bxj $$1) {
      $$0.eb().b(cgl.ac);
      $$0.eb().b(cgl.p);
      $$0.eb().b(cgl.n);
      $$0.eb().a(cgl.A, $$1, (long)q.a($$0.dU().A));
      b((cpx)$$0);
   }

   protected static void b(cpx $$0) {
      $$0.eb().a(cgl.ai, true, (long)d.a($$0.dU().A));
   }

   private static void m(cpy $$0) {
      $$0.eb().a(cgl.aw, true, 200L);
   }

   private static fex n(cpy $$0) {
      fex $$1 = cif.a($$0, 4, 2);
      return $$1 == null ? $$0.ds() : $$1;
   }

   private static boolean o(cpy $$0) {
      return $$0.eb().a(cgl.aw);
   }

   protected static boolean c(cpx $$0) {
      return $$0.eb().c(ctd.b);
   }

   private static boolean c(bxj $$0) {
      return $$0.b(czo.xg);
   }

   private static void d(bxj $$0) {
      $$0.eb().a(cgl.ae, true, 119L);
   }

   private static boolean p(cpy $$0) {
      return $$0.eb().a(cgl.ae);
   }

   private static boolean b(czk $$0) {
      return $$0.a(c);
   }

   private static boolean c(czk $$0) {
      return $$0.a(axk.ac);
   }

   private static boolean q(cpy $$0) {
      return $$0.eb().a(cgl.ax);
   }

   private static boolean e(bxj $$0) {
      return $$0.eb().a(cgl.av);
   }

   private static boolean f(bxj $$0) {
      return !e($$0);
   }

   public static boolean b(bxj $$0) {
      return $$0.an() == bwr.bS && $$0.b(cpz::a);
   }

   private static boolean r(cpy $$0) {
      return $$0.eb().a(cgl.ah);
   }

   private static boolean g(bxj $$0) {
      return $$0.eb().a(cgl.y);
   }

   private static boolean s(cpy $$0) {
      return !$$0.fb().f();
   }

   private static boolean t(cpy $$0) {
      return $$0.fb().f() || !a($$0.fb());
   }

   public static boolean a(bwr<?> $$0) {
      return $$0 == bwr.bR || $$0 == bwr.bN;
   }
}
