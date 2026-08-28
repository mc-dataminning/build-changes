import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cps {
   public static final int a = 8;
   public static final int b = 4;
   public static final cyz c = czh.px;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bto d = baq.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bto o = baq.a(10, 40);
   private static final bto p = baq.a(10, 30);
   private static final bto q = baq.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bto A = baq.a(5, 7);
   private static final bto B = baq.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bye<?> a(cpr $$0, bye<cpr> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(csw.a));
      $$1.b(csw.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cpr $$0, azv $$1) {
      int $$2 = d.a($$1);
      $$0.ec().a(cgg.ai, true, (long)$$2);
   }

   private static void a(bye<cpr> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cab(45, 90), new caf(), bzt.a(), e(), f(), cqb.a(), cpx.a(119), cbi.a(300, cps::a), cbl.a()));
   }

   private static void b(bye<cpr> $$0) {
      $$0.a(
         csw.b, 10, ImmutableList.of(cau.a(cps::b, 14.0F), cbh.a(($$0x, $$1) -> $$1.t(), cps::b), cci.a(cpr::j, cpy.a()), d(), g(), b(), c(), cax.a(bwo.bS, 4))
      );
   }

   private static void b(cpr $$0, bye<cpr> $$1) {
      $$1.a(
         csw.k,
         10,
         ImmutableList.of(
            cbk.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), cci.a(cps::c, byt.a(5, 0.75F)), cba.a(1.0F), cac.a(20), new bzd(), cpw.a(), bzh.a(cps::g, cgg.p)
         ),
         cgg.p
      );
   }

   private static void c(bye<cpr> $$0) {
      $$0.a(
         csw.l,
         10,
         ImmutableList.of(
            d(),
            cau.a(cps::b, 14.0F),
            cbh.a(($$0x, $$1) -> $$1.t(), cps::b),
            cci.a($$0x -> !$$0x.gw(), bzo.a(cgg.aj, 2, 1.0F)),
            cci.a(cpr::gw, bzo.a(cgg.aj, 4, 0.6F)),
            new cas(ImmutableList.of(Pair.of(cau.a(bwo.aR, 8.0F), 1), Pair.of(can.a(0.6F, 2, 1), 1), Pair.of(new bzf(10, 20), 1)))
         ),
         cgg.aj
      );
   }

   private static void d(bye<cpr> $$0) {
      $$0.a(csw.m, 10, ImmutableList.of(bzp.a(cps::t, 1.0F, true, 9), cpz.a(9), cqa.a(200, 200)), cgg.ae);
   }

   private static void e(bye<cpr> $$0) {
      $$0.a(csw.n, 10, ImmutableList.of(caz.b(cgg.A, 1.0F, 12, true), b(), c(), bzh.a(cps::j, cgg.A)), cgg.A);
   }

   private static void f(bye<cpr> $$0) {
      $$0.a(
         csw.o,
         10,
         ImmutableList.of(
            cad.a(0.8F),
            cau.a(cps::b, 8.0F),
            cci.a(cci.a(bwf::bZ), cbr.a(ImmutableList.builder().addAll(a()).add(Pair.of(cci.a((Predicate<cpr>)($$0x -> true)), 1)).build())),
            bze.a(8, cps::a)
         ),
         cgg.t
      );
   }

   private static ImmutableList<Pair<cag<bxe>, Integer>> a() {
      return ImmutableList.of(Pair.of(cau.a(bwo.bS, 8.0F), 1), Pair.of(cau.a(bwo.aR, 8.0F), 1), Pair.of(cau.a(8.0F), 1));
   }

   private static cas<bxe> b() {
      return new cas<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bzf(30, 60), 1)).build());
   }

   private static cas<cpr> c() {
      return new cas<>(
         ImmutableList.of(
            Pair.of(can.a(0.6F), 2), Pair.of(bzs.a(bwo.aR, 8, cgg.r, 0.6F, 2), 2), Pair.of(cci.a(cps::f, cbc.a(0.6F, 3)), 2), Pair.of(new bzf(30, 60), 1)
         )
      );
   }

   private static byw<bxm> d() {
      return caz.a(cgg.ax, 1.0F, 8, false);
   }

   private static byw<cpr> e() {
      return bza.a(cpr::n_, cgg.N, cgg.A, B);
   }

   private static byw<cpr> f() {
      return bza.a(cps::g, cgg.as, cgg.A, A);
   }

   protected static void a(cpr $$0) {
      bye<cpr> $$1 = $$0.ec();
      csw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csw.m, csw.k, csw.n, csw.l, csw.o, csw.b));
      csw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgg.p));
      if (!$$1.a(cgg.t) && e($$0)) {
         $$0.bP();
      }

      if (!$$1.a(cgg.aj)) {
         $$1.b(cgg.ak);
      }

      $$0.x($$1.a(cgg.ak));
   }

   private static boolean e(cpr $$0) {
      if (!$$0.n_()) {
         return false;
      } else {
         bwf $$1 = $$0.dk();
         return $$1 instanceof cpr && ((cpr)$$1).n_() || $$1 instanceof cpl && ((cpl)$$1).n_();
      }
   }

   protected static void a(arq $$0, cpr $$1, cnh $$2) {
      i($$1);
      czd $$3;
      if ($$2.f().a(czh.tq)) {
         $$1.a($$2, $$2.f().M());
         $$3 = $$2.f();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.ec().b(cgg.af);
         a($$0, $$1, $$3);
         d((bxe)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(czd.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(arq $$0, cpr $$1, czd $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(buc.b));
      }

      $$1.l($$2);
   }

   private static czd a(cnh $$0) {
      czd $$1 = $$0.f();
      czd $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(arq $$0, cpr $$1, boolean $$2) {
      czd $$3 = $$1.b(buc.b);
      $$1.a(buc.b, czd.k);
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
            czd $$7 = $$1.fb();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(arq $$0, cpr $$1) {
      if (p($$1) && !$$1.fc().f()) {
         $$1.a($$0, $$1.fc());
         $$1.a(buc.b, czd.k);
      }
   }

   private static void c(cpr $$0, czd $$1) {
      czd $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cpr $$0, List<czd> $$1) {
      Optional<crc> $$2 = $$0.ec().c(cgg.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cpr $$0, List<czd> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cpr $$0, crc $$1, List<czd> $$2) {
      a($$0, $$2, $$1.dt());
   }

   private static void a(cpr $$0, List<czd> $$1, feq $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(buc.b);

         for (czd $$3 : $$1) {
            byx.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<czd> f(cpr $$0) {
      ezm $$1 = $$0.dV().p().bc().b(ezd.aK);
      List<czd> $$2 = $$1.a(new ezk.a((arq)$$0.dV()).a(fcb.a, $$0).a(fca.k));
      return $$2;
   }

   private static boolean a(bxe $$0, bxe $$1) {
      return $$1.aq() != bwo.aj ? false : azv.a($$0.dV().ae()).i() < 0.1F;
   }

   protected static boolean a(cpr $$0, czd $$1) {
      if ($$0.n_() && $$1.a(axk.U)) {
         return false;
      } else if ($$1.a(axk.S)) {
         return false;
      } else if (r($$0) && $$0.ec().a(cgg.p)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(czh.tq)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(czd $$0) {
      return $$0.a(axk.T);
   }

   private static boolean a(cpr $$0, bwf $$1) {
      return !($$1 instanceof bxg $$2) ? false : !$$2.n_() || !$$2.bK() || g((bxe)$$0) || g($$2) || $$2 instanceof cpr && $$2.dk() == null;
   }

   private static boolean b(arq $$0, cpr $$1, bxe $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cpr $$0) {
      bye<cpr> $$1 = $$0.ec();
      if ($$1.a(cgg.as)) {
         bxe $$2 = $$1.c(cgg.as).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bxe> b(arq $$0, cpr $$1) {
      bye<cpr> $$2 = $$1.ec();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bxe> $$3 = byx.a($$1, cgg.ac);
         if ($$3.isPresent() && chm.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cgg.ad)) {
               Optional<crc> $$4 = $$2.c(cgg.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bxg> $$5 = $$2.c(cgg.N);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<crc> $$6 = $$2.c(cgg.an);
               return $$6.isPresent() && chm.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(arq $$0, crc $$1, boolean $$2) {
      List<cpr> $$3 = $$1.dV().a(cpr.class, $$1.cR().g(16.0));
      $$3.stream().filter(cps::c).filter($$2x -> !$$2 || byx.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().c(diw.Q)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bud a(arq $$0, cpr $$1, crc $$2, buc $$3) {
      czd $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         czd $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bxe)$$1);
         i($$1);
         return bud.a;
      } else {
         return bud.e;
      }
   }

   protected static boolean b(cpr $$0, czd $$1) {
      return !r($$0) && !p($$0) && $$0.t() && b($$1);
   }

   protected static void a(arq $$0, cpr $$1, bxe $$2) {
      if (!($$2 instanceof cpr)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bye<cpr> $$3 = $$1.ec();
         $$3.b(cgg.aj);
         $$3.b(cgg.ak);
         $$3.b(cgg.ae);
         if ($$2 instanceof crc) {
            $$3.a(cgg.ah, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cgg.A);
            }
         });
         if ($$1.n_()) {
            $$3.a(cgg.A, $$2, 100L);
            if (chm.d($$0, $$1, $$2)) {
               b($$0, (cpq)$$1, $$2);
            }
         } else if ($$2.aq() == bwo.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cpq)$$1, $$2);
         }
      }
   }

   protected static void a(arq $$0, cpq $$1, bxe $$2) {
      if (!$$1.ec().c(csw.n)) {
         if (chm.d($$0, $$1, $$2)) {
            if (!byx.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bwo.bS && $$0.O().c(diw.Q)) {
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

   public static Optional<awm> b(cpr $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cpr $$0, csw $$1) {
      if ($$1 == csw.k) {
         return awn.uv;
      } else if ($$0.q()) {
         return awn.uA;
      } else if ($$1 == csw.n && h($$0)) {
         return awn.uA;
      } else if ($$1 == csw.m) {
         return awn.ut;
      } else if ($$1 == csw.l) {
         return awn.uw;
      } else if (e((bxe)$$0)) {
         return awn.uy;
      } else {
         return q($$0) ? awn.uA : awn.uu;
      }
   }

   private static boolean h(cpr $$0) {
      bye<cpr> $$1 = $$0.ec();
      return !$$1.a(cgg.A) ? false : $$1.c(cgg.A).get().a($$0, 12.0);
   }

   protected static List<cpq> c(cpr $$0) {
      return $$0.ec().c(cgg.ap).orElse(ImmutableList.of());
   }

   private static List<cpq> d(cpq $$0) {
      return $$0.ec().c(cgg.ao).orElse(ImmutableList.of());
   }

   public static boolean a(bxe $$0) {
      for (bwp $$1 : bwq.i) {
         if ($$0.a($$1).a(axk.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cpr $$0) {
      $$0.ec().b(cgg.n);
      $$0.O().m();
   }

   private static byw<bxe> g() {
      cav.a $$0 = new cav.a(o);
      return bza.a($$1 -> $$1.n_() && $$0.a($$1.dV().A), cgg.am, cgg.t, p);
   }

   protected static void b(arq $$0, cpq $$1, bxe $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bwo.aj || $$2x.j() && ((cpl)$$2).gs()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(arq $$0, cpq $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(arq $$0, cpq $$1, bxe $$2) {
      if (chm.d($$0, $$1, $$2)) {
         $$1.ec().b(cgg.F);
         $$1.ec().a(cgg.ac, $$2.cG(), 600L);
         if ($$2.aq() == bwo.aj && $$1.j()) {
            b($$1);
         }

         if ($$2.aq() == bwo.bS && $$0.O().c(diw.Q)) {
            $$1.ec().a(cgg.ad, true, 600L);
         }
      }
   }

   private static void d(arq $$0, cpq $$1, bxe $$2) {
      Optional<crc> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(arq $$0, cpq $$1, bxe $$2) {
      Optional<bxe> $$3 = e($$1);
      bxe $$4 = byx.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bxe> e(cpq $$0) {
      return byx.a($$0, cgg.ac);
   }

   public static Optional<bxe> d(cpr $$0) {
      return $$0.ec().a(cgg.A) ? $$0.ec().c(cgg.A) : Optional.empty();
   }

   public static Optional<crc> a(cpq $$0) {
      return $$0.ec().a(cgg.l) ? $$0.ec().c(cgg.l) : Optional.empty();
   }

   private static void a(cpr $$0, bxe $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cpr).forEach($$1x -> b((cpr)$$1x, $$1));
   }

   private static void b(cpr $$0, bxe $$1) {
      bye<cpr> $$2 = $$0.ec();
      bxe $$3 = byx.a($$0, $$2.c(cgg.A), $$1);
      $$3 = byx.a($$0, $$2.c(cgg.p), $$3);
      c($$0, $$3);
   }

   private static boolean j(cpr $$0) {
      bye<cpr> $$1 = $$0.ec();
      if (!$$1.a(cgg.A)) {
         return true;
      } else {
         bxe $$2 = $$1.c(cgg.A).get();
         bwo<?> $$3 = $$2.aq();
         if ($$3 == bwo.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cgg.as, $$2) : false;
         }
      }
   }

   private static boolean k(cpr $$0) {
      return !l($$0);
   }

   private static boolean l(cpr $$0) {
      int $$1 = $$0.ec().c(cgg.at).orElse(0) + 1;
      int $$2 = $$0.ec().c(cgg.au).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cpr $$0, bxe $$1) {
      $$0.ec().b(cgg.ac);
      $$0.ec().b(cgg.p);
      $$0.ec().b(cgg.n);
      $$0.ec().a(cgg.A, $$1, (long)q.a($$0.dV().A));
      b((cpq)$$0);
   }

   protected static void b(cpq $$0) {
      $$0.ec().a(cgg.ai, true, (long)d.a($$0.dV().A));
   }

   private static void m(cpr $$0) {
      $$0.ec().a(cgg.aw, true, 200L);
   }

   private static feq n(cpr $$0) {
      feq $$1 = cia.a($$0, 4, 2);
      return $$1 == null ? $$0.dt() : $$1;
   }

   private static boolean o(cpr $$0) {
      return $$0.ec().a(cgg.aw);
   }

   protected static boolean c(cpq $$0) {
      return $$0.ec().c(csw.b);
   }

   private static boolean c(bxe $$0) {
      return $$0.b(czh.xg);
   }

   private static void d(bxe $$0) {
      $$0.ec().a(cgg.ae, true, 119L);
   }

   private static boolean p(cpr $$0) {
      return $$0.ec().a(cgg.ae);
   }

   private static boolean b(czd $$0) {
      return $$0.a(c);
   }

   private static boolean c(czd $$0) {
      return $$0.a(axk.ac);
   }

   private static boolean q(cpr $$0) {
      return $$0.ec().a(cgg.ax);
   }

   private static boolean e(bxe $$0) {
      return $$0.ec().a(cgg.av);
   }

   private static boolean f(bxe $$0) {
      return !e($$0);
   }

   public static boolean b(bxe $$0) {
      return $$0.aq() == bwo.bS && $$0.b(cps::a);
   }

   private static boolean r(cpr $$0) {
      return $$0.ec().a(cgg.ah);
   }

   private static boolean g(bxe $$0) {
      return $$0.ec().a(cgg.y);
   }

   private static boolean s(cpr $$0) {
      return !$$0.fc().f();
   }

   private static boolean t(cpr $$0) {
      return $$0.fc().f() || !a($$0.fc());
   }

   public static boolean a(bwo<?> $$0) {
      return $$0 == bwo.bR || $$0 == bwo.bN;
   }
}
