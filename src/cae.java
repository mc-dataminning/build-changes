import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cae {
   public static final int a = 8;
   public static final int b = 4;
   public static final cit c = cjb.nU;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bgb d = asm.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bgb o = asm.a(10, 40);
   private static final bgb p = asm.a(10, 30);
   private static final bgb q = asm.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bgb A = asm.a(5, 7);
   private static final bgb B = asm.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bjz<?> a(cad $$0, bjz<cad> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(ccy.a));
      $$1.b(ccy.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cad $$0, aru $$1) {
      int $$2 = d.a($$1);
      $$0.dM().a(bsa.ag, true, (long)$$2);
   }

   private static void a(bjz<cad> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new blv(45, 90), new blz(), blo.a(), e(), f(), can.a(), caj.a(119), bnc.a(300, cae::a), bnf.a()));
   }

   private static void b(bjz<cad> $$0) {
      $$0.a(ccy.b, 10, ImmutableList.of(bmo.a(cae::b, 14.0F), bnb.a(cac::ga, cae::i), boc.a(cad::p, cak.a()), d(), g(), b(), c(), bmr.a(bim.bt, 4)));
   }

   private static void b(cad $$0, bjz<cad> $$1) {
      $$1.a(
         ccy.k,
         10,
         ImmutableList.of(bne.a($$1x -> !b($$0, $$1x)), boc.a(cae::c, bko.a(5, 0.75F)), bmu.a(1.0F), blw.a(20), new bky(), cai.a(), blc.a(cae::h, bsa.o)),
         bsa.o
      );
   }

   private static void c(bjz<cad> $$0) {
      $$0.a(
         ccy.l,
         10,
         ImmutableList.of(
            d(),
            bmo.a(cae::b, 14.0F),
            bnb.a(cac::ga, cae::i),
            boc.a($$0x -> !$$0x.gh(), blj.a(bsa.ah, 2, 1.0F)),
            boc.a(cad::gh, blj.a(bsa.ah, 4, 0.6F)),
            new bmm(ImmutableList.of(Pair.of(bmo.a(bim.aw, 8.0F), 1), Pair.of(bmh.a(0.6F, 2, 1), 1), Pair.of(new bla(10, 20), 1)))
         ),
         bsa.ah
      );
   }

   private static void d(bjz<cad> $$0) {
      $$0.a(ccy.m, 10, ImmutableList.of(blk.a(cae::v, 1.0F, true, 9), cal.a(9), cam.a(200, 200)), bsa.ac);
   }

   private static void e(bjz<cad> $$0) {
      $$0.a(ccy.n, 10, ImmutableList.of(bmt.b(bsa.z, 1.0F, 12, true), b(), c(), blc.a(cae::l, bsa.z)), bsa.z);
   }

   private static void f(bjz<cad> $$0) {
      $$0.a(
         ccy.o,
         10,
         ImmutableList.of(
            blx.a(0.8F),
            bmo.a(cae::b, 8.0F),
            boc.a(boc.a(bii::bN), bnl.a(ImmutableList.builder().addAll(a()).add(Pair.of(boc.a((Predicate<cad>)($$0x -> true)), 1)).build())),
            bkz.a(8, cae::a)
         ),
         bsa.s
      );
   }

   private static ImmutableList<Pair<bma<biy>, Integer>> a() {
      return ImmutableList.of(Pair.of(bmo.a(bim.bt, 8.0F), 1), Pair.of(bmo.a(bim.aw, 8.0F), 1), Pair.of(bmo.a(8.0F), 1));
   }

   private static bmm<biy> b() {
      return new bmm<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bla(30, 60), 1)).build());
   }

   private static bmm<cad> c() {
      return new bmm<>(
         ImmutableList.of(
            Pair.of(bmh.a(0.6F), 2), Pair.of(bln.a(bim.aw, 8, bsa.q, 0.6F, 2), 2), Pair.of(boc.a(cae::f, bmw.a(0.6F, 3)), 2), Pair.of(new bla(30, 60), 1)
         )
      );
   }

   private static bkr<bjh> d() {
      return bmt.a(bsa.av, 1.0F, 8, false);
   }

   private static bkr<cad> e() {
      return bkv.a(cad::i_, bsa.L, bsa.z, B);
   }

   private static bkr<cad> f() {
      return bkv.a(cae::h, bsa.aq, bsa.z, A);
   }

   protected static void a(cad $$0) {
      bjz<cad> $$1 = $$0.dM();
      ccy $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ccy.m, ccy.k, ccy.n, ccy.l, ccy.o, ccy.b));
      ccy $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsa.o));
      if (!$$1.a(bsa.s) && f($$0)) {
         $$0.aa();
      }

      if (!$$1.a(bsa.ah)) {
         $$1.b(bsa.ai);
      }

      $$0.x($$1.a(bsa.ai));
   }

   private static boolean f(cad $$0) {
      if (!$$0.i_()) {
         return false;
      } else {
         bii $$1 = $$0.cY();
         return $$1 instanceof cad && ((cad)$$1).i_() || $$1 instanceof bzx && ((bzx)$$1).i_();
      }
   }

   protected static void a(cad $$0, byg $$1) {
      k($$0);
      ciy $$2;
      if ($$1.j().a(cjb.rt)) {
         $$0.a($$1, $$1.j().L());
         $$2 = $$1.j();
         $$1.ak();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dM().b(bsa.ad);
         c($$0, $$2);
         d((biy)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(ciy.b);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cad $$0, ciy $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bgp.b));
      }

      $$0.o($$1);
   }

   private static ciy a(byg $$0) {
      ciy $$1 = $$0.j();
      ciy $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.ak();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cad $$0, boolean $$1) {
      ciy $$2 = $$0.b(bgp.b);
      $$0.a(bgp.b, ciy.b);
      if ($$0.ga()) {
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
            ciy $$6 = $$0.eR();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cad $$0) {
      if (r($$0) && !$$0.eS().b()) {
         $$0.b($$0.eS());
         $$0.a(bgp.b, ciy.b);
      }
   }

   private static void d(cad $$0, ciy $$1) {
      ciy $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cad $$0, List<ciy> $$1) {
      Optional<cbn> $$2 = $$0.dM().c(bsa.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cad $$0, List<ciy> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cad $$0, cbn $$1, List<ciy> $$2) {
      a($$0, $$2, $$1.di());
   }

   private static void a(cad $$0, List<ciy> $$1, ehe $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bgp.b);

         for (ciy $$3 : $$1) {
            bks.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<ciy> g(cad $$0) {
      ecp $$1 = $$0.dK().n().aH().getLootTable(ecf.aB);
      List<ciy> $$2 = $$1.a(new ecn.a((akk)$$0.dK()).a(ees.a, $$0).a(eer.j));
      return $$2;
   }

   private static boolean a(biy $$0, biy $$1) {
      return $$1.ag() != bim.W ? false : aru.a($$0.dK().V()).i() < 0.1F;
   }

   protected static boolean a(cad $$0, ciy $$1) {
      if ($$0.i_() && $$1.a(apt.V)) {
         return false;
      } else if ($$1.a(apt.T)) {
         return false;
      } else if (t($$0) && $$0.dM().a(bsa.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cjb.rt)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(ciy $$0) {
      return $$0.a(apt.U);
   }

   private static boolean a(cad $$0, bii $$1) {
      return !($$1 instanceof bja $$2) ? false : !$$2.i_() || !$$2.bv() || g((biy)$$0) || g($$2) || $$2 instanceof cad && $$2.cY() == null;
   }

   private static boolean b(cad $$0, biy $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cad $$0) {
      bjz<cad> $$1 = $$0.dM();
      if ($$1.a(bsa.aq)) {
         biy $$2 = $$1.c(bsa.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends biy> i(cad $$0) {
      bjz<cad> $$1 = $$0.dM();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<biy> $$2 = bks.a($$0, bsa.aa);
         if ($$2.isPresent() && bte.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bsa.ab)) {
               Optional<cbn> $$3 = $$1.c(bsa.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bja> $$4 = $$1.c(bsa.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cbn> $$5 = $$1.c(bsa.al);
               return $$5.isPresent() && bte.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cbn $$0, boolean $$1) {
      List<cad> $$2 = $$0.dK().a(cad.class, $$0.cG().g(16.0));
      $$2.stream().filter(cae::d).filter($$2x -> !$$1 || bks.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dK().X().b(cpi.K)) {
            d((cac)$$1x, $$0);
         } else {
            c((cac)$$1x, $$0);
         }
      });
   }

   public static bgq a(cad $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         ciy $$4 = $$3.a(1);
         c($$0, $$4);
         d((biy)$$0);
         k($$0);
         return bgq.b;
      } else {
         return bgq.d;
      }
   }

   protected static boolean b(cad $$0, ciy $$1) {
      return !t($$0) && !r($$0) && $$0.ga() && b($$1);
   }

   protected static void a(cad $$0, biy $$1) {
      if (!($$1 instanceof cad)) {
         if (u($$0)) {
            a($$0, false);
         }

         bjz<cad> $$2 = $$0.dM();
         $$2.b(bsa.ah);
         $$2.b(bsa.ai);
         $$2.b(bsa.ac);
         if ($$1 instanceof cbn) {
            $$2.a(bsa.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ag() != $$1.ag()) {
               $$2.b(bsa.z);
            }
         });
         if ($$0.i_()) {
            $$2.a(bsa.z, $$1, 100L);
            if (bte.d($$0, $$1)) {
               b((cac)$$0, $$1);
            }
         } else if ($$1.ag() == bim.W && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cac)$$0, $$1);
         }
      }
   }

   protected static void a(cac $$0, biy $$1) {
      if (!$$0.dM().c(ccy.n)) {
         if (bte.d($$0, $$1)) {
            if (!bks.a($$0, $$1, 4.0)) {
               if ($$1.ag() == bim.bt && $$0.dK().X().b(cpi.K)) {
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

   public static Optional<aov> c(cad $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static aov a(cad $$0, ccy $$1) {
      if ($$1 == ccy.k) {
         return aow.rV;
      } else if ($$0.fZ()) {
         return aow.sa;
      } else if ($$1 == ccy.n && j($$0)) {
         return aow.sa;
      } else if ($$1 == ccy.m) {
         return aow.rT;
      } else if ($$1 == ccy.l) {
         return aow.rW;
      } else if (e((biy)$$0)) {
         return aow.rY;
      } else {
         return s($$0) ? aow.sa : aow.rU;
      }
   }

   private static boolean j(cad $$0) {
      bjz<cad> $$1 = $$0.dM();
      return !$$1.a(bsa.z) ? false : $$1.c(bsa.z).get().a($$0, 12.0);
   }

   protected static List<cac> d(cad $$0) {
      return $$0.dM().c(bsa.an).orElse(ImmutableList.of());
   }

   private static List<cac> e(cac $$0) {
      return $$0.dM().c(bsa.am).orElse(ImmutableList.of());
   }

   public static boolean a(biy $$0) {
      for (ciy $$2 : $$0.bK()) {
         cit $$3 = $$2.d();
         if ($$3 instanceof cgi && ((cgi)$$3).d() == cgk.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cad $$0) {
      $$0.dM().b(bsa.m);
      $$0.H().n();
   }

   private static bkr<biy> g() {
      bmp.a $$0 = new bmp.a(o);
      return bkv.a($$1 -> $$1.i_() && $$0.a($$1.dK().z), bsa.ak, bsa.s, p);
   }

   protected static void b(cac $$0, biy $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ag() != bim.W || $$1x.p() && ((bzx)$$1).gf()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cac $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cac $$0, biy $$1) {
      if (bte.d($$0, $$1)) {
         $$0.dM().b(bsa.E);
         $$0.dM().a(bsa.aa, $$1.cv(), 600L);
         if ($$1.ag() == bim.W && $$0.p()) {
            c($$0);
         }

         if ($$1.ag() == bim.bt && $$0.dK().X().b(cpi.K)) {
            $$0.dM().a(bsa.ab, true, 600L);
         }
      }
   }

   private static void d(cac $$0, biy $$1) {
      Optional<cbn> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cac $$0, biy $$1) {
      Optional<biy> $$2 = f($$0);
      biy $$3 = bks.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<biy> f(cac $$0) {
      return bks.a($$0, bsa.aa);
   }

   public static Optional<biy> e(cad $$0) {
      return $$0.dM().a(bsa.z) ? $$0.dM().c(bsa.z) : Optional.empty();
   }

   public static Optional<cbn> b(cac $$0) {
      return $$0.dM().a(bsa.l) ? $$0.dM().c(bsa.l) : Optional.empty();
   }

   private static void c(cad $$0, biy $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cad).forEach($$1x -> d((cad)$$1x, $$1));
   }

   private static void d(cad $$0, biy $$1) {
      bjz<cad> $$2 = $$0.dM();
      biy $$3 = bks.a($$0, $$2.c(bsa.z), $$1);
      $$3 = bks.a($$0, $$2.c(bsa.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cad $$0) {
      bjz<cad> $$1 = $$0.dM();
      if (!$$1.a(bsa.z)) {
         return true;
      } else {
         biy $$2 = $$1.c(bsa.z).get();
         bim<?> $$3 = $$2.ag();
         if ($$3 == bim.W) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bsa.aq, $$2) : false;
         }
      }
   }

   private static boolean m(cad $$0) {
      return !n($$0);
   }

   private static boolean n(cad $$0) {
      int $$1 = $$0.dM().c(bsa.ar).orElse(0) + 1;
      int $$2 = $$0.dM().c(bsa.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cad $$0, biy $$1) {
      $$0.dM().b(bsa.aa);
      $$0.dM().b(bsa.o);
      $$0.dM().b(bsa.m);
      $$0.dM().a(bsa.z, $$1, (long)q.a($$0.dK().z));
      c((cac)$$0);
   }

   protected static void c(cac $$0) {
      $$0.dM().a(bsa.ag, true, (long)d.a($$0.dK().z));
   }

   private static void o(cad $$0) {
      $$0.dM().a(bsa.au, true, 200L);
   }

   private static ehe p(cad $$0) {
      ehe $$1 = bts.a($$0, 4, 2);
      return $$1 == null ? $$0.di() : $$1;
   }

   private static boolean q(cad $$0) {
      return $$0.dM().a(bsa.au);
   }

   protected static boolean d(cac $$0) {
      return $$0.dM().c(ccy.b);
   }

   private static boolean c(biy $$0) {
      return $$0.b(cjb.uZ);
   }

   private static void d(biy $$0) {
      $$0.dM().a(bsa.ac, true, 119L);
   }

   private static boolean r(cad $$0) {
      return $$0.dM().a(bsa.ac);
   }

   private static boolean b(ciy $$0) {
      return $$0.a(c);
   }

   private static boolean c(ciy $$0) {
      return $$0.a(apt.W);
   }

   private static boolean s(cad $$0) {
      return $$0.dM().a(bsa.av);
   }

   private static boolean e(biy $$0) {
      return $$0.dM().a(bsa.at);
   }

   private static boolean f(biy $$0) {
      return !e($$0);
   }

   public static boolean b(biy $$0) {
      return $$0.ag() == bim.bt && $$0.b(cae::a);
   }

   private static boolean t(cad $$0) {
      return $$0.dM().a(bsa.af);
   }

   private static boolean g(biy $$0) {
      return $$0.dM().a(bsa.x);
   }

   private static boolean u(cad $$0) {
      return !$$0.eS().b();
   }

   private static boolean v(cad $$0) {
      return $$0.eS().b() || !a($$0.eS());
   }

   public static boolean a(bim<?> $$0) {
      return $$0 == bim.bs || $$0 == bim.bo;
   }
}
