import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cod {
   public static final int a = 8;
   public static final int b = 4;
   public static final cxc c = cxk.po;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bsl d = baw.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bsl o = baw.a(10, 40);
   private static final bsl p = baw.a(10, 30);
   private static final bsl q = baw.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bsl A = baw.a(5, 7);
   private static final bsl B = baw.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bwz<?> a(coc $$0, bwz<coc> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(crf.a));
      $$1.b(crf.b);
      $$1.f();
      return $$1;
   }

   protected static void a(coc $$0, bac $$1) {
      int $$2 = d.a($$1);
      $$0.ec().a(cfb.ah, true, (long)$$2);
   }

   private static void a(bwz<coc> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new byw(45, 90), new bza(), byo.a(), e(), f(), com.a(), coi.a(119), cad.a(300, cod::a), cag.a()));
   }

   private static void b(bwz<coc> $$0) {
      $$0.a(
         crf.b,
         10,
         ImmutableList.of(bzp.a(cod::b, 14.0F), cac.a(($$0x, $$1) -> $$1.go(), cod::b), cbd.a(coc::m, coj.a()), d(), g(), b(), c(), bzs.a(bvi.bS, 4))
      );
   }

   private static void b(coc $$0, bwz<coc> $$1) {
      $$1.a(
         crf.k,
         10,
         ImmutableList.of(
            caf.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), cbd.a(cod::c, bxo.a(5, 0.75F)), bzv.a(1.0F), byx.a(20), new bxy(), coh.a(), byc.a(cod::g, cfb.o)
         ),
         cfb.o
      );
   }

   private static void c(bwz<coc> $$0) {
      $$0.a(
         crf.l,
         10,
         ImmutableList.of(
            d(),
            bzp.a(cod::b, 14.0F),
            cac.a(($$0x, $$1) -> $$1.go(), cod::b),
            cbd.a($$0x -> !$$0x.gv(), byj.a(cfb.ai, 2, 1.0F)),
            cbd.a(coc::gv, byj.a(cfb.ai, 4, 0.6F)),
            new bzn(ImmutableList.of(Pair.of(bzp.a(bvi.aS, 8.0F), 1), Pair.of(bzi.a(0.6F, 2, 1), 1), Pair.of(new bya(10, 20), 1)))
         ),
         cfb.ai
      );
   }

   private static void d(bwz<coc> $$0) {
      $$0.a(crf.m, 10, ImmutableList.of(byk.a(cod::t, 1.0F, true, 9), cok.a(9), col.a(200, 200)), cfb.ad);
   }

   private static void e(bwz<coc> $$0) {
      $$0.a(crf.n, 10, ImmutableList.of(bzu.b(cfb.z, 1.0F, 12, true), b(), c(), byc.a(cod::j, cfb.z)), cfb.z);
   }

   private static void f(bwz<coc> $$0) {
      $$0.a(
         crf.o,
         10,
         ImmutableList.of(
            byy.a(0.8F),
            bzp.a(cod::b, 8.0F),
            cbd.a(cbd.a(bvb::bZ), cam.a(ImmutableList.builder().addAll(a()).add(Pair.of(cbd.a((Predicate<coc>)($$0x -> true)), 1)).build())),
            bxz.a(8, cod::a)
         ),
         cfb.s
      );
   }

   private static ImmutableList<Pair<bzb<bvx>, Integer>> a() {
      return ImmutableList.of(Pair.of(bzp.a(bvi.bS, 8.0F), 1), Pair.of(bzp.a(bvi.aS, 8.0F), 1), Pair.of(bzp.a(8.0F), 1));
   }

   private static bzn<bvx> b() {
      return new bzn<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bya(30, 60), 1)).build());
   }

   private static bzn<coc> c() {
      return new bzn<>(
         ImmutableList.of(
            Pair.of(bzi.a(0.6F), 2), Pair.of(byn.a(bvi.aS, 8, cfb.q, 0.6F, 2), 2), Pair.of(cbd.a(cod::f, bzx.a(0.6F, 3)), 2), Pair.of(new bya(30, 60), 1)
         )
      );
   }

   private static bxr<bwf> d() {
      return bzu.a(cfb.aw, 1.0F, 8, false);
   }

   private static bxr<coc> e() {
      return bxv.a(coc::e_, cfb.M, cfb.z, B);
   }

   private static bxr<coc> f() {
      return bxv.a(cod::g, cfb.ar, cfb.z, A);
   }

   protected static void a(coc $$0) {
      bwz<coc> $$1 = $$0.ec();
      crf $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crf.m, crf.k, crf.n, crf.l, crf.o, crf.b));
      crf $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cfb.o));
      if (!$$1.a(cfb.s) && e($$0)) {
         $$0.ae();
      }

      if (!$$1.a(cfb.ai)) {
         $$1.b(cfb.aj);
      }

      $$0.y($$1.a(cfb.aj));
   }

   private static boolean e(coc $$0) {
      if (!$$0.e_()) {
         return false;
      } else {
         bvb $$1 = $$0.dl();
         return $$1 instanceof coc && ((coc)$$1).e_() || $$1 instanceof cnw && ((cnw)$$1).e_();
      }
   }

   protected static void a(arx $$0, coc $$1, cls $$2) {
      i($$1);
      cxg $$3;
      if ($$2.l().a(cxk.tf)) {
         $$1.a($$2, $$2.l().M());
         $$3 = $$2.l();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.ec().b(cfb.ae);
         a($$0, $$1, $$3);
         d((bvx)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cxg.j);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(arx $$0, coc $$1, cxg $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bsz.b));
      }

      $$1.l($$2);
   }

   private static cxg a(cls $$0) {
      cxg $$1 = $$0.l();
      cxg $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(arx $$0, coc $$1, boolean $$2) {
      cxg $$3 = $$1.b(bsz.b);
      $$1.a(bsz.b, cxg.j);
      if ($$1.go()) {
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
            cxg $$7 = $$1.eZ();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(arx $$0, coc $$1) {
      if (p($$1) && !$$1.fa().f()) {
         $$1.a($$0, $$1.fa());
         $$1.a(bsz.b, cxg.j);
      }
   }

   private static void c(coc $$0, cxg $$1) {
      cxg $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(coc $$0, List<cxg> $$1) {
      Optional<cpo> $$2 = $$0.ec().c(cfb.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(coc $$0, List<cxg> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(coc $$0, cpo $$1, List<cxg> $$2) {
      a($$0, $$2, $$1.du());
   }

   private static void a(coc $$0, List<cxg> $$1, fbr $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bsz.b);

         for (cxg $$3 : $$1) {
            bxs.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cxg> f(coc $$0) {
      ewn $$1 = $$0.dW().p().bc().b(ewe.aK);
      List<cxg> $$2 = $$1.a(new ewl.a((arx)$$0.dW()).a(ezc.a, $$0).a(ezb.k));
      return $$2;
   }

   private static boolean a(bvx $$0, bvx $$1) {
      return $$1.aq() != bvi.ak ? false : bac.a($$0.dW().ad()).i() < 0.1F;
   }

   protected static boolean a(coc $$0, cxg $$1) {
      if ($$0.e_() && $$1.a(axt.W)) {
         return false;
      } else if ($$1.a(axt.U)) {
         return false;
      } else if (r($$0) && $$0.ec().a(cfb.o)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(cxk.tf)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cxg $$0) {
      return $$0.a(axt.V);
   }

   private static boolean a(coc $$0, bvb $$1) {
      return !($$1 instanceof bvz $$2) ? false : !$$2.e_() || !$$2.bL() || g((bvx)$$0) || g($$2) || $$2 instanceof coc && $$2.dl() == null;
   }

   private static boolean b(arx $$0, coc $$1, bvx $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(coc $$0) {
      bwz<coc> $$1 = $$0.ec();
      if ($$1.a(cfb.ar)) {
         bvx $$2 = $$1.c(cfb.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bvx> b(arx $$0, coc $$1) {
      bwz<coc> $$2 = $$1.ec();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bvx> $$3 = bxs.a($$1, cfb.ab);
         if ($$3.isPresent() && cgh.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cfb.ac)) {
               Optional<cpo> $$4 = $$2.c(cfb.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bvz> $$5 = $$2.c(cfb.M);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cpo> $$6 = $$2.c(cfb.am);
               return $$6.isPresent() && cgh.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(arx $$0, cpo $$1, boolean $$2) {
      List<coc> $$3 = $$1.dW().a(coc.class, $$1.cR().g(16.0));
      $$3.stream().filter(cod::c).filter($$2x -> !$$2 || bxs.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().b(dgv.P)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bta a(arx $$0, coc $$1, cpo $$2, bsz $$3) {
      cxg $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cxg $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bvx)$$1);
         i($$1);
         return bta.a;
      } else {
         return bta.e;
      }
   }

   protected static boolean b(coc $$0, cxg $$1) {
      return !r($$0) && !p($$0) && $$0.go() && b($$1);
   }

   protected static void a(arx $$0, coc $$1, bvx $$2) {
      if (!($$2 instanceof coc)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bwz<coc> $$3 = $$1.ec();
         $$3.b(cfb.ai);
         $$3.b(cfb.aj);
         $$3.b(cfb.ad);
         if ($$2 instanceof cpo) {
            $$3.a(cfb.ag, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cfb.z);
            }
         });
         if ($$1.e_()) {
            $$3.a(cfb.z, $$2, 100L);
            if (cgh.d($$0, $$1, $$2)) {
               b($$0, (cob)$$1, $$2);
            }
         } else if ($$2.aq() == bvi.ak && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cob)$$1, $$2);
         }
      }
   }

   protected static void a(arx $$0, cob $$1, bvx $$2) {
      if (!$$1.ec().c(crf.n)) {
         if (cgh.d($$0, $$1, $$2)) {
            if (!bxs.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bvi.bS && $$0.O().b(dgv.P)) {
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

   public static Optional<awu> b(coc $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static awu a(coc $$0, crf $$1) {
      if ($$1 == crf.k) {
         return awv.uh;
      } else if ($$0.x()) {
         return awv.um;
      } else if ($$1 == crf.n && h($$0)) {
         return awv.um;
      } else if ($$1 == crf.m) {
         return awv.uf;
      } else if ($$1 == crf.l) {
         return awv.ui;
      } else if (e((bvx)$$0)) {
         return awv.uk;
      } else {
         return q($$0) ? awv.um : awv.ug;
      }
   }

   private static boolean h(coc $$0) {
      bwz<coc> $$1 = $$0.ec();
      return !$$1.a(cfb.z) ? false : $$1.c(cfb.z).get().a($$0, 12.0);
   }

   protected static List<cob> c(coc $$0) {
      return $$0.ec().c(cfb.ao).orElse(ImmutableList.of());
   }

   private static List<cob> d(cob $$0) {
      return $$0.ec().c(cfb.an).orElse(ImmutableList.of());
   }

   public static boolean a(bvx $$0) {
      for (cxg $$1 : $$0.fd()) {
         if ($$1.a(axt.X)) {
            return true;
         }
      }

      return false;
   }

   private static void i(coc $$0) {
      $$0.ec().b(cfb.m);
      $$0.L().o();
   }

   private static bxr<bvx> g() {
      bzq.a $$0 = new bzq.a(o);
      return bxv.a($$1 -> $$1.e_() && $$0.a($$1.dW().A), cfb.al, cfb.s, p);
   }

   protected static void b(arx $$0, cob $$1, bvx $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bvi.ak || $$2x.m() && ((cnw)$$2).gp()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(arx $$0, cob $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(arx $$0, cob $$1, bvx $$2) {
      if (cgh.d($$0, $$1, $$2)) {
         $$1.ec().b(cfb.E);
         $$1.ec().a(cfb.ab, $$2.cG(), 600L);
         if ($$2.aq() == bvi.ak && $$1.m()) {
            b($$1);
         }

         if ($$2.aq() == bvi.bS && $$0.O().b(dgv.P)) {
            $$1.ec().a(cfb.ac, true, 600L);
         }
      }
   }

   private static void d(arx $$0, cob $$1, bvx $$2) {
      Optional<cpo> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(arx $$0, cob $$1, bvx $$2) {
      Optional<bvx> $$3 = e($$1);
      bvx $$4 = bxs.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bvx> e(cob $$0) {
      return bxs.a($$0, cfb.ab);
   }

   public static Optional<bvx> d(coc $$0) {
      return $$0.ec().a(cfb.z) ? $$0.ec().c(cfb.z) : Optional.empty();
   }

   public static Optional<cpo> a(cob $$0) {
      return $$0.ec().a(cfb.l) ? $$0.ec().c(cfb.l) : Optional.empty();
   }

   private static void a(coc $$0, bvx $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof coc).forEach($$1x -> b((coc)$$1x, $$1));
   }

   private static void b(coc $$0, bvx $$1) {
      bwz<coc> $$2 = $$0.ec();
      bvx $$3 = bxs.a($$0, $$2.c(cfb.z), $$1);
      $$3 = bxs.a($$0, $$2.c(cfb.o), $$3);
      c($$0, $$3);
   }

   private static boolean j(coc $$0) {
      bwz<coc> $$1 = $$0.ec();
      if (!$$1.a(cfb.z)) {
         return true;
      } else {
         bvx $$2 = $$1.c(cfb.z).get();
         bvi<?> $$3 = $$2.aq();
         if ($$3 == bvi.ak) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cfb.ar, $$2) : false;
         }
      }
   }

   private static boolean k(coc $$0) {
      return !l($$0);
   }

   private static boolean l(coc $$0) {
      int $$1 = $$0.ec().c(cfb.as).orElse(0) + 1;
      int $$2 = $$0.ec().c(cfb.at).orElse(0);
      return $$2 > $$1;
   }

   private static void c(coc $$0, bvx $$1) {
      $$0.ec().b(cfb.ab);
      $$0.ec().b(cfb.o);
      $$0.ec().b(cfb.m);
      $$0.ec().a(cfb.z, $$1, (long)q.a($$0.dW().A));
      b((cob)$$0);
   }

   protected static void b(cob $$0) {
      $$0.ec().a(cfb.ah, true, (long)d.a($$0.dW().A));
   }

   private static void m(coc $$0) {
      $$0.ec().a(cfb.av, true, 200L);
   }

   private static fbr n(coc $$0) {
      fbr $$1 = cgv.a($$0, 4, 2);
      return $$1 == null ? $$0.du() : $$1;
   }

   private static boolean o(coc $$0) {
      return $$0.ec().a(cfb.av);
   }

   protected static boolean c(cob $$0) {
      return $$0.ec().c(crf.b);
   }

   private static boolean c(bvx $$0) {
      return $$0.b(cxk.wV);
   }

   private static void d(bvx $$0) {
      $$0.ec().a(cfb.ad, true, 119L);
   }

   private static boolean p(coc $$0) {
      return $$0.ec().a(cfb.ad);
   }

   private static boolean b(cxg $$0) {
      return $$0.a(c);
   }

   private static boolean c(cxg $$0) {
      return $$0.a(axt.ad);
   }

   private static boolean q(coc $$0) {
      return $$0.ec().a(cfb.aw);
   }

   private static boolean e(bvx $$0) {
      return $$0.ec().a(cfb.au);
   }

   private static boolean f(bvx $$0) {
      return !e($$0);
   }

   public static boolean b(bvx $$0) {
      return $$0.aq() == bvi.bS && $$0.b(cod::a);
   }

   private static boolean r(coc $$0) {
      return $$0.ec().a(cfb.ag);
   }

   private static boolean g(bvx $$0) {
      return $$0.ec().a(cfb.x);
   }

   private static boolean s(coc $$0) {
      return !$$0.fa().f();
   }

   private static boolean t(coc $$0) {
      return $$0.fa().f() || !a($$0.fa());
   }

   public static boolean a(bvi<?> $$0) {
      return $$0 == bvi.bR || $$0 == bvi.bN;
   }
}
