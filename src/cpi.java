import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cpi {
   public static final int a = 8;
   public static final int b = 4;
   public static final cyo c = cyw.ps;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final btj d = bao.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final btj o = bao.a(10, 40);
   private static final btj p = bao.a(10, 30);
   private static final btj q = bao.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final btj A = bao.a(5, 7);
   private static final btj B = bao.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bxz<?> a(cph $$0, bxz<cph> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(csl.a));
      $$1.b(csl.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cph $$0, azt $$1) {
      int $$2 = d.a($$1);
      $$0.eb().a(cgb.ai, true, (long)$$2);
   }

   private static void a(bxz<cph> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new bzw(45, 90), new caa(), bzo.a(), e(), f(), cpr.a(), cpn.a(119), cbd.a(300, cpi::a), cbg.a()));
   }

   private static void b(bxz<cph> $$0) {
      $$0.a(
         csl.b, 10, ImmutableList.of(cap.a(cpi::b, 14.0F), cbc.a(($$0x, $$1) -> $$1.t(), cpi::b), ccd.a(cph::j, cpo.a()), d(), g(), b(), c(), cas.a(bwj.bS, 4))
      );
   }

   private static void b(cph $$0, bxz<cph> $$1) {
      $$1.a(
         csl.k,
         10,
         ImmutableList.of(
            cbf.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), ccd.a(cpi::c, byo.a(5, 0.75F)), cav.a(1.0F), bzx.a(20), new byy(), cpm.a(), bzc.a(cpi::g, cgb.p)
         ),
         cgb.p
      );
   }

   private static void c(bxz<cph> $$0) {
      $$0.a(
         csl.l,
         10,
         ImmutableList.of(
            d(),
            cap.a(cpi::b, 14.0F),
            cbc.a(($$0x, $$1) -> $$1.t(), cpi::b),
            ccd.a($$0x -> !$$0x.gv(), bzj.a(cgb.aj, 2, 1.0F)),
            ccd.a(cph::gv, bzj.a(cgb.aj, 4, 0.6F)),
            new can(ImmutableList.of(Pair.of(cap.a(bwj.aR, 8.0F), 1), Pair.of(cai.a(0.6F, 2, 1), 1), Pair.of(new bza(10, 20), 1)))
         ),
         cgb.aj
      );
   }

   private static void d(bxz<cph> $$0) {
      $$0.a(csl.m, 10, ImmutableList.of(bzk.a(cpi::t, 1.0F, true, 9), cpp.a(9), cpq.a(200, 200)), cgb.ae);
   }

   private static void e(bxz<cph> $$0) {
      $$0.a(csl.n, 10, ImmutableList.of(cau.b(cgb.A, 1.0F, 12, true), b(), c(), bzc.a(cpi::j, cgb.A)), cgb.A);
   }

   private static void f(bxz<cph> $$0) {
      $$0.a(
         csl.o,
         10,
         ImmutableList.of(
            bzy.a(0.8F),
            cap.a(cpi::b, 8.0F),
            ccd.a(ccd.a(bwa::bZ), cbm.a(ImmutableList.builder().addAll(a()).add(Pair.of(ccd.a((Predicate<cph>)($$0x -> true)), 1)).build())),
            byz.a(8, cpi::a)
         ),
         cgb.t
      );
   }

   private static ImmutableList<Pair<cab<bwz>, Integer>> a() {
      return ImmutableList.of(Pair.of(cap.a(bwj.bS, 8.0F), 1), Pair.of(cap.a(bwj.aR, 8.0F), 1), Pair.of(cap.a(8.0F), 1));
   }

   private static can<bwz> b() {
      return new can<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bza(30, 60), 1)).build());
   }

   private static can<cph> c() {
      return new can<>(
         ImmutableList.of(
            Pair.of(cai.a(0.6F), 2), Pair.of(bzn.a(bwj.aR, 8, cgb.r, 0.6F, 2), 2), Pair.of(ccd.a(cpi::f, cax.a(0.6F, 3)), 2), Pair.of(new bza(30, 60), 1)
         )
      );
   }

   private static byr<bxh> d() {
      return cau.a(cgb.ax, 1.0F, 8, false);
   }

   private static byr<cph> e() {
      return byv.a(cph::n_, cgb.N, cgb.A, B);
   }

   private static byr<cph> f() {
      return byv.a(cpi::g, cgb.as, cgb.A, A);
   }

   protected static void a(cph $$0) {
      bxz<cph> $$1 = $$0.eb();
      csl $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csl.m, csl.k, csl.n, csl.l, csl.o, csl.b));
      csl $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgb.p));
      if (!$$1.a(cgb.t) && e($$0)) {
         $$0.bP();
      }

      if (!$$1.a(cgb.aj)) {
         $$1.b(cgb.ak);
      }

      $$0.x($$1.a(cgb.ak));
   }

   private static boolean e(cph $$0) {
      if (!$$0.n_()) {
         return false;
      } else {
         bwa $$1 = $$0.dk();
         return $$1 instanceof cph && ((cph)$$1).n_() || $$1 instanceof cpb && ((cpb)$$1).n_();
      }
   }

   protected static void a(aro $$0, cph $$1, cmx $$2) {
      i($$1);
      cys $$3;
      if ($$2.f().a(cyw.tj)) {
         $$1.a($$2, $$2.f().M());
         $$3 = $$2.f();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.eb().b(cgb.af);
         a($$0, $$1, $$3);
         d((bwz)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cys.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(aro $$0, cph $$1, cys $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(btx.b));
      }

      $$1.m($$2);
   }

   private static cys a(cmx $$0) {
      cys $$1 = $$0.f();
      cys $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(aro $$0, cph $$1, boolean $$2) {
      cys $$3 = $$1.b(btx.b);
      $$1.a(btx.b, cys.k);
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
            cys $$7 = $$1.fa();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.l($$3);
         }
      }
   }

   protected static void a(aro $$0, cph $$1) {
      if (p($$1) && !$$1.fb().f()) {
         $$1.a($$0, $$1.fb());
         $$1.a(btx.b, cys.k);
      }
   }

   private static void c(cph $$0, cys $$1) {
      cys $$2 = $$0.j($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cph $$0, List<cys> $$1) {
      Optional<cqs> $$2 = $$0.eb().c(cgb.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cph $$0, List<cys> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cph $$0, cqs $$1, List<cys> $$2) {
      a($$0, $$2, $$1.dt());
   }

   private static void a(cph $$0, List<cys> $$1, fdw $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(btx.b);

         for (cys $$3 : $$1) {
            bys.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cys> f(cph $$0) {
      eys $$1 = $$0.dV().p().bc().b(eyj.aK);
      List<cys> $$2 = $$1.a(new eyq.a((aro)$$0.dV()).a(fbh.a, $$0).a(fbg.k));
      return $$2;
   }

   private static boolean a(bwz $$0, bwz $$1) {
      return $$1.aq() != bwj.aj ? false : azt.a($$0.dV().ae()).i() < 0.1F;
   }

   protected static boolean a(cph $$0, cys $$1) {
      if ($$0.n_() && $$1.a(axi.U)) {
         return false;
      } else if ($$1.a(axi.S)) {
         return false;
      } else if (r($$0) && $$0.eb().a(cgb.p)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.k($$1);
         if ($$1.a(cyw.tj)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.n($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cys $$0) {
      return $$0.a(axi.T);
   }

   private static boolean a(cph $$0, bwa $$1) {
      return !($$1 instanceof bxb $$2) ? false : !$$2.n_() || !$$2.bK() || g((bwz)$$0) || g($$2) || $$2 instanceof cph && $$2.dk() == null;
   }

   private static boolean b(aro $$0, cph $$1, bwz $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cph $$0) {
      bxz<cph> $$1 = $$0.eb();
      if ($$1.a(cgb.as)) {
         bwz $$2 = $$1.c(cgb.as).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bwz> b(aro $$0, cph $$1) {
      bxz<cph> $$2 = $$1.eb();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bwz> $$3 = bys.a($$1, cgb.ac);
         if ($$3.isPresent() && chh.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cgb.ad)) {
               Optional<cqs> $$4 = $$2.c(cgb.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bxb> $$5 = $$2.c(cgb.N);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cqs> $$6 = $$2.c(cgb.an);
               return $$6.isPresent() && chh.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(aro $$0, cqs $$1, boolean $$2) {
      List<cph> $$3 = $$1.dV().a(cph.class, $$1.cR().g(16.0));
      $$3.stream().filter(cpi::c).filter($$2x -> !$$2 || bys.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().c(dil.P)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bty a(aro $$0, cph $$1, cqs $$2, btx $$3) {
      cys $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cys $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bwz)$$1);
         i($$1);
         return bty.a;
      } else {
         return bty.e;
      }
   }

   protected static boolean b(cph $$0, cys $$1) {
      return !r($$0) && !p($$0) && $$0.t() && b($$1);
   }

   protected static void a(aro $$0, cph $$1, bwz $$2) {
      if (!($$2 instanceof cph)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bxz<cph> $$3 = $$1.eb();
         $$3.b(cgb.aj);
         $$3.b(cgb.ak);
         $$3.b(cgb.ae);
         if ($$2 instanceof cqs) {
            $$3.a(cgb.ah, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cgb.A);
            }
         });
         if ($$1.n_()) {
            $$3.a(cgb.A, $$2, 100L);
            if (chh.d($$0, $$1, $$2)) {
               b($$0, (cpg)$$1, $$2);
            }
         } else if ($$2.aq() == bwj.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cpg)$$1, $$2);
         }
      }
   }

   protected static void a(aro $$0, cpg $$1, bwz $$2) {
      if (!$$1.eb().c(csl.n)) {
         if (chh.d($$0, $$1, $$2)) {
            if (!bys.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bwj.bS && $$0.O().c(dil.P)) {
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

   public static Optional<awk> b(cph $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awk a(cph $$0, csl $$1) {
      if ($$1 == csl.k) {
         return awl.ur;
      } else if ($$0.q()) {
         return awl.uw;
      } else if ($$1 == csl.n && h($$0)) {
         return awl.uw;
      } else if ($$1 == csl.m) {
         return awl.up;
      } else if ($$1 == csl.l) {
         return awl.us;
      } else if (e((bwz)$$0)) {
         return awl.uu;
      } else {
         return q($$0) ? awl.uw : awl.uq;
      }
   }

   private static boolean h(cph $$0) {
      bxz<cph> $$1 = $$0.eb();
      return !$$1.a(cgb.A) ? false : $$1.c(cgb.A).get().a($$0, 12.0);
   }

   protected static List<cpg> c(cph $$0) {
      return $$0.eb().c(cgb.ap).orElse(ImmutableList.of());
   }

   private static List<cpg> d(cpg $$0) {
      return $$0.eb().c(cgb.ao).orElse(ImmutableList.of());
   }

   public static boolean a(bwz $$0) {
      for (bwk $$1 : bwl.i) {
         if ($$0.a($$1).a(axi.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cph $$0) {
      $$0.eb().b(cgb.n);
      $$0.O().m();
   }

   private static byr<bwz> g() {
      caq.a $$0 = new caq.a(o);
      return byv.a($$1 -> $$1.n_() && $$0.a($$1.dV().A), cgb.am, cgb.t, p);
   }

   protected static void b(aro $$0, cpg $$1, bwz $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bwj.aj || $$2x.j() && ((cpb)$$2).gr()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(aro $$0, cpg $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(aro $$0, cpg $$1, bwz $$2) {
      if (chh.d($$0, $$1, $$2)) {
         $$1.eb().b(cgb.F);
         $$1.eb().a(cgb.ac, $$2.cG(), 600L);
         if ($$2.aq() == bwj.aj && $$1.j()) {
            b($$1);
         }

         if ($$2.aq() == bwj.bS && $$0.O().c(dil.P)) {
            $$1.eb().a(cgb.ad, true, 600L);
         }
      }
   }

   private static void d(aro $$0, cpg $$1, bwz $$2) {
      Optional<cqs> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(aro $$0, cpg $$1, bwz $$2) {
      Optional<bwz> $$3 = e($$1);
      bwz $$4 = bys.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bwz> e(cpg $$0) {
      return bys.a($$0, cgb.ac);
   }

   public static Optional<bwz> d(cph $$0) {
      return $$0.eb().a(cgb.A) ? $$0.eb().c(cgb.A) : Optional.empty();
   }

   public static Optional<cqs> a(cpg $$0) {
      return $$0.eb().a(cgb.l) ? $$0.eb().c(cgb.l) : Optional.empty();
   }

   private static void a(cph $$0, bwz $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cph).forEach($$1x -> b((cph)$$1x, $$1));
   }

   private static void b(cph $$0, bwz $$1) {
      bxz<cph> $$2 = $$0.eb();
      bwz $$3 = bys.a($$0, $$2.c(cgb.A), $$1);
      $$3 = bys.a($$0, $$2.c(cgb.p), $$3);
      c($$0, $$3);
   }

   private static boolean j(cph $$0) {
      bxz<cph> $$1 = $$0.eb();
      if (!$$1.a(cgb.A)) {
         return true;
      } else {
         bwz $$2 = $$1.c(cgb.A).get();
         bwj<?> $$3 = $$2.aq();
         if ($$3 == bwj.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cgb.as, $$2) : false;
         }
      }
   }

   private static boolean k(cph $$0) {
      return !l($$0);
   }

   private static boolean l(cph $$0) {
      int $$1 = $$0.eb().c(cgb.at).orElse(0) + 1;
      int $$2 = $$0.eb().c(cgb.au).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cph $$0, bwz $$1) {
      $$0.eb().b(cgb.ac);
      $$0.eb().b(cgb.p);
      $$0.eb().b(cgb.n);
      $$0.eb().a(cgb.A, $$1, (long)q.a($$0.dV().A));
      b((cpg)$$0);
   }

   protected static void b(cpg $$0) {
      $$0.eb().a(cgb.ai, true, (long)d.a($$0.dV().A));
   }

   private static void m(cph $$0) {
      $$0.eb().a(cgb.aw, true, 200L);
   }

   private static fdw n(cph $$0) {
      fdw $$1 = chv.a($$0, 4, 2);
      return $$1 == null ? $$0.dt() : $$1;
   }

   private static boolean o(cph $$0) {
      return $$0.eb().a(cgb.aw);
   }

   protected static boolean c(cpg $$0) {
      return $$0.eb().c(csl.b);
   }

   private static boolean c(bwz $$0) {
      return $$0.b(cyw.wZ);
   }

   private static void d(bwz $$0) {
      $$0.eb().a(cgb.ae, true, 119L);
   }

   private static boolean p(cph $$0) {
      return $$0.eb().a(cgb.ae);
   }

   private static boolean b(cys $$0) {
      return $$0.a(c);
   }

   private static boolean c(cys $$0) {
      return $$0.a(axi.ab);
   }

   private static boolean q(cph $$0) {
      return $$0.eb().a(cgb.ax);
   }

   private static boolean e(bwz $$0) {
      return $$0.eb().a(cgb.av);
   }

   private static boolean f(bwz $$0) {
      return !e($$0);
   }

   public static boolean b(bwz $$0) {
      return $$0.aq() == bwj.bS && $$0.b(cpi::a);
   }

   private static boolean r(cph $$0) {
      return $$0.eb().a(cgb.ah);
   }

   private static boolean g(bwz $$0) {
      return $$0.eb().a(cgb.y);
   }

   private static boolean s(cph $$0) {
      return !$$0.fb().f();
   }

   private static boolean t(cph $$0) {
      return $$0.fb().f() || !a($$0.fb());
   }

   public static boolean a(bwj<?> $$0) {
      return $$0 == bwj.bR || $$0 == bwj.bN;
   }
}
