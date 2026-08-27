import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cjy {
   public static final int a = 8;
   public static final int b = 4;
   public static final csu c = ctc.oI;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final box d = ayy.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final box o = ayy.a(10, 40);
   private static final box p = ayy.a(10, 30);
   private static final box q = ayy.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final box A = ayy.a(5, 7);
   private static final box B = ayy.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static btb<?> a(cjx $$0, btb<cjx> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cmw.a));
      $$1.b(cmw.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cjx $$0, ayg $$1) {
      int $$2 = d.a($$1);
      $$0.dQ().a(cbd.ah, true, (long)$$2);
   }

   private static void a(btb<cjx> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new buy(45, 90), new bvc(), buq.a(), e(), f(), ckh.a(), ckd.a(119), bwf.a(300, cjy::a), bwi.a()));
   }

   private static void b(btb<cjx> $$0) {
      $$0.a(cmw.b, 10, ImmutableList.of(bvr.a(cjy::b, 14.0F), bwe.a(cjw::gq, cjy::i), bxf.a(cjx::r, cke.a()), d(), g(), b(), c(), bvu.a(brn.bx, 4)));
   }

   private static void b(cjx $$0, btb<cjx> $$1) {
      $$1.a(
         cmw.k,
         10,
         ImmutableList.of(bwh.a($$1x -> !b($$0, $$1x)), bxf.a(cjy::c, btq.a(5, 0.75F)), bvx.a(1.0F), buz.a(20), new bua(), ckc.a(), bue.a(cjy::h, cbd.o)),
         cbd.o
      );
   }

   private static void c(btb<cjx> $$0) {
      $$0.a(
         cmw.l,
         10,
         ImmutableList.of(
            d(),
            bvr.a(cjy::b, 14.0F),
            bwe.a(cjw::gq, cjy::i),
            bxf.a($$0x -> !$$0x.gx(), bul.a(cbd.ai, 2, 1.0F)),
            bxf.a(cjx::gx, bul.a(cbd.ai, 4, 0.6F)),
            new bvp(ImmutableList.of(Pair.of(bvr.a(brn.az, 8.0F), 1), Pair.of(bvk.a(0.6F, 2, 1), 1), Pair.of(new buc(10, 20), 1)))
         ),
         cbd.ai
      );
   }

   private static void d(btb<cjx> $$0) {
      $$0.a(cmw.m, 10, ImmutableList.of(bum.a(cjy::v, 1.0F, true, 9), ckf.a(9), ckg.a(200, 200)), cbd.ad);
   }

   private static void e(btb<cjx> $$0) {
      $$0.a(cmw.n, 10, ImmutableList.of(bvw.b(cbd.z, 1.0F, 12, true), b(), c(), bue.a(cjy::l, cbd.z)), cbd.z);
   }

   private static void f(btb<cjx> $$0) {
      $$0.a(
         cmw.o,
         10,
         ImmutableList.of(
            bva.a(0.8F),
            bvr.a(cjy::b, 8.0F),
            bxf.a(bxf.a(brh::bP), bwo.a(ImmutableList.builder().addAll(a()).add(Pair.of(bxf.a((Predicate<cjx>)($$0x -> true)), 1)).build())),
            bub.a(8, cjy::a)
         ),
         cbd.s
      );
   }

   private static ImmutableList<Pair<bvd<bsa>, Integer>> a() {
      return ImmutableList.of(Pair.of(bvr.a(brn.bx, 8.0F), 1), Pair.of(bvr.a(brn.az, 8.0F), 1), Pair.of(bvr.a(8.0F), 1));
   }

   private static bvp<bsa> b() {
      return new bvp<>(ImmutableList.builder().addAll(a()).add(Pair.of(new buc(30, 60), 1)).build());
   }

   private static bvp<cjx> c() {
      return new bvp<>(
         ImmutableList.of(
            Pair.of(bvk.a(0.6F), 2), Pair.of(bup.a(brn.az, 8, cbd.q, 0.6F, 2), 2), Pair.of(bxf.a(cjy::f, bvz.a(0.6F, 3)), 2), Pair.of(new buc(30, 60), 1)
         )
      );
   }

   private static btt<bsi> d() {
      return bvw.a(cbd.aw, 1.0F, 8, false);
   }

   private static btt<cjx> e() {
      return btx.a(cjx::p_, cbd.M, cbd.z, B);
   }

   private static btt<cjx> f() {
      return btx.a(cjy::h, cbd.ar, cbd.z, A);
   }

   protected static void a(cjx $$0) {
      btb<cjx> $$1 = $$0.dQ();
      cmw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cmw.m, cmw.k, cmw.n, cmw.l, cmw.o, cmw.b));
      cmw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cbd.o));
      if (!$$1.a(cbd.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(cbd.ai)) {
         $$1.b(cbd.aj);
      }

      $$0.x($$1.a(cbd.aj));
   }

   private static boolean f(cjx $$0) {
      if (!$$0.p_()) {
         return false;
      } else {
         brh $$1 = $$0.da();
         return $$1 instanceof cjx && ((cjx)$$1).p_() || $$1 instanceof cjr && ((cjr)$$1).p_();
      }
   }

   protected static void a(cjx $$0, chr $$1) {
      k($$0);
      csz $$2;
      if ($$1.p().a(ctc.si)) {
         $$0.a($$1, $$1.p().G());
         $$2 = $$1.p();
         $$1.am();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dQ().b(cbd.ae);
         c($$0, $$2);
         d((bsa)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(csz.i);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cjx $$0, csz $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bpl.b));
      }

      $$0.q($$1);
   }

   private static csz a(chr $$0) {
      csz $$1 = $$0.p();
      csz $$2 = $$1.a(1);
      if ($$1.d()) {
         $$0.am();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cjx $$0, boolean $$1) {
      csz $$2 = $$0.b(bpl.b);
      $$0.a(bpl.b, csz.i);
      if ($$0.gq()) {
         boolean $$3 = b($$2);
         if ($$1 && $$3) {
            a($$0, g($$0));
         } else if (!$$3) {
            boolean $$4 = !$$0.i($$2).d();
            if (!$$4) {
               d($$0, $$2);
            }
         }
      } else {
         boolean $$5 = !$$0.i($$2).d();
         if (!$$5) {
            csz $$6 = $$0.eV();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(cjx $$0) {
      if (r($$0) && !$$0.eW().d()) {
         $$0.b($$0.eW());
         $$0.a(bpl.b, csz.i);
      }
   }

   private static void d(cjx $$0, csz $$1) {
      csz $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cjx $$0, List<csz> $$1) {
      Optional<clh> $$2 = $$0.dQ().c(cbd.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cjx $$0, List<csz> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cjx $$0, clh $$1, List<csz> $$2) {
      a($$0, $$2, $$1.dl());
   }

   private static void a(cjx $$0, List<csz> $$1, etp $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bpl.b);

         for (csz $$3 : $$1) {
            btu.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<csz> g(cjx $$0) {
      eoq $$1 = $$0.dN().o().be().b(eoj.aP);
      List<csz> $$2 = $$1.a(new eoo.a((aqh)$$0.dN()).a(erc.a, $$0).a(erb.j));
      return $$2;
   }

   private static boolean a(bsa $$0, bsa $$1) {
      return $$1.ai() != brn.Z ? false : ayg.a($$0.dN().Y()).i() < 0.1F;
   }

   protected static boolean a(cjx $$0, csz $$1) {
      if ($$0.p_() && $$1.a(avz.V)) {
         return false;
      } else if ($$1.a(avz.T)) {
         return false;
      } else if (t($$0) && $$0.dQ().a(cbd.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(ctc.si)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(csz $$0) {
      return $$0.a(avz.U);
   }

   private static boolean a(cjx $$0, brh $$1) {
      return !($$1 instanceof bsc $$2) ? false : !$$2.p_() || !$$2.bB() || g((bsa)$$0) || g($$2) || $$2 instanceof cjx && $$2.da() == null;
   }

   private static boolean b(cjx $$0, bsa $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cjx $$0) {
      btb<cjx> $$1 = $$0.dQ();
      if ($$1.a(cbd.ar)) {
         bsa $$2 = $$1.c(cbd.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bsa> i(cjx $$0) {
      btb<cjx> $$1 = $$0.dQ();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bsa> $$2 = btu.a($$0, cbd.ab);
         if ($$2.isPresent() && ccj.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(cbd.ac)) {
               Optional<clh> $$3 = $$1.c(cbd.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bsc> $$4 = $$1.c(cbd.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<clh> $$5 = $$1.c(cbd.am);
               return $$5.isPresent() && ccj.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(clh $$0, boolean $$1) {
      List<cjx> $$2 = $$0.dN().a(cjx.class, $$0.cI().g(16.0));
      $$2.stream().filter(cjy::d).filter($$2x -> !$$1 || btu.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dN().aa().b(czz.O)) {
            d((cjw)$$1x, $$0);
         } else {
            c((cjw)$$1x, $$0);
         }
      });
   }

   public static bpm a(cjx $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         csz $$4 = $$3.a(1);
         c($$0, $$4);
         d((bsa)$$0);
         k($$0);
         return bpm.b;
      } else {
         return bpm.d;
      }
   }

   protected static boolean b(cjx $$0, csz $$1) {
      return !t($$0) && !r($$0) && $$0.gq() && b($$1);
   }

   protected static void a(cjx $$0, bsa $$1) {
      if (!($$1 instanceof cjx)) {
         if (u($$0)) {
            a($$0, false);
         }

         btb<cjx> $$2 = $$0.dQ();
         $$2.b(cbd.ai);
         $$2.b(cbd.aj);
         $$2.b(cbd.ad);
         if ($$1 instanceof clh) {
            $$2.a(cbd.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ai() != $$1.ai()) {
               $$2.b(cbd.z);
            }
         });
         if ($$0.p_()) {
            $$2.a(cbd.z, $$1, 100L);
            if (ccj.d($$0, $$1)) {
               b((cjw)$$0, $$1);
            }
         } else if ($$1.ai() == brn.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cjw)$$0, $$1);
         }
      }
   }

   protected static void a(cjw $$0, bsa $$1) {
      if (!$$0.dQ().c(cmw.n)) {
         if (ccj.d($$0, $$1)) {
            if (!btu.a($$0, $$1, 4.0)) {
               if ($$1.ai() == brn.bx && $$0.dN().aa().b(czz.O)) {
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

   public static Optional<avb> c(cjx $$0) {
      return $$0.dQ().g().map($$1 -> a($$0, $$1));
   }

   private static avb a(cjx $$0, cmw $$1) {
      if ($$1 == cmw.k) {
         return avc.tt;
      } else if ($$0.gp()) {
         return avc.ty;
      } else if ($$1 == cmw.n && j($$0)) {
         return avc.ty;
      } else if ($$1 == cmw.m) {
         return avc.tr;
      } else if ($$1 == cmw.l) {
         return avc.tu;
      } else if (e((bsa)$$0)) {
         return avc.tw;
      } else {
         return s($$0) ? avc.ty : avc.ts;
      }
   }

   private static boolean j(cjx $$0) {
      btb<cjx> $$1 = $$0.dQ();
      return !$$1.a(cbd.z) ? false : $$1.c(cbd.z).get().a($$0, 12.0);
   }

   protected static List<cjw> d(cjx $$0) {
      return $$0.dQ().c(cbd.ao).orElse(ImmutableList.of());
   }

   private static List<cjw> e(cjw $$0) {
      return $$0.dQ().c(cbd.an).orElse(ImmutableList.of());
   }

   public static boolean a(bsa $$0) {
      for (csz $$2 : $$0.eZ()) {
         csu $$3 = $$2.f();
         if ($$3 instanceof cqo && ((cqo)$$3).h().a(cqq.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(cjx $$0) {
      $$0.dQ().b(cbd.m);
      $$0.K().n();
   }

   private static btt<bsa> g() {
      bvs.a $$0 = new bvs.a(o);
      return btx.a($$1 -> $$1.p_() && $$0.a($$1.dN().z), cbd.al, cbd.s, p);
   }

   protected static void b(cjw $$0, bsa $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ai() != brn.Z || $$1x.r() && ((cjr)$$1).gv()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cjw $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cjw $$0, bsa $$1) {
      if (ccj.d($$0, $$1)) {
         $$0.dQ().b(cbd.E);
         $$0.dQ().a(cbd.ab, $$1.cx(), 600L);
         if ($$1.ai() == brn.Z && $$0.r()) {
            c($$0);
         }

         if ($$1.ai() == brn.bx && $$0.dN().aa().b(czz.O)) {
            $$0.dQ().a(cbd.ac, true, 600L);
         }
      }
   }

   private static void d(cjw $$0, bsa $$1) {
      Optional<clh> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cjw $$0, bsa $$1) {
      Optional<bsa> $$2 = f($$0);
      bsa $$3 = btu.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bsa> f(cjw $$0) {
      return btu.a($$0, cbd.ab);
   }

   public static Optional<bsa> e(cjx $$0) {
      return $$0.dQ().a(cbd.z) ? $$0.dQ().c(cbd.z) : Optional.empty();
   }

   public static Optional<clh> b(cjw $$0) {
      return $$0.dQ().a(cbd.l) ? $$0.dQ().c(cbd.l) : Optional.empty();
   }

   private static void c(cjx $$0, bsa $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cjx).forEach($$1x -> d((cjx)$$1x, $$1));
   }

   private static void d(cjx $$0, bsa $$1) {
      btb<cjx> $$2 = $$0.dQ();
      bsa $$3 = btu.a($$0, $$2.c(cbd.z), $$1);
      $$3 = btu.a($$0, $$2.c(cbd.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cjx $$0) {
      btb<cjx> $$1 = $$0.dQ();
      if (!$$1.a(cbd.z)) {
         return true;
      } else {
         bsa $$2 = $$1.c(cbd.z).get();
         brn<?> $$3 = $$2.ai();
         if ($$3 == brn.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(cbd.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cjx $$0) {
      return !n($$0);
   }

   private static boolean n(cjx $$0) {
      int $$1 = $$0.dQ().c(cbd.as).orElse(0) + 1;
      int $$2 = $$0.dQ().c(cbd.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cjx $$0, bsa $$1) {
      $$0.dQ().b(cbd.ab);
      $$0.dQ().b(cbd.o);
      $$0.dQ().b(cbd.m);
      $$0.dQ().a(cbd.z, $$1, (long)q.a($$0.dN().z));
      c((cjw)$$0);
   }

   protected static void c(cjw $$0) {
      $$0.dQ().a(cbd.ah, true, (long)d.a($$0.dN().z));
   }

   private static void o(cjx $$0) {
      $$0.dQ().a(cbd.av, true, 200L);
   }

   private static etp p(cjx $$0) {
      etp $$1 = ccx.a($$0, 4, 2);
      return $$1 == null ? $$0.dl() : $$1;
   }

   private static boolean q(cjx $$0) {
      return $$0.dQ().a(cbd.av);
   }

   protected static boolean d(cjw $$0) {
      return $$0.dQ().c(cmw.b);
   }

   private static boolean c(bsa $$0) {
      return $$0.b(ctc.vT);
   }

   private static void d(bsa $$0) {
      $$0.dQ().a(cbd.ad, true, 119L);
   }

   private static boolean r(cjx $$0) {
      return $$0.dQ().a(cbd.ad);
   }

   private static boolean b(csz $$0) {
      return $$0.a(c);
   }

   private static boolean c(csz $$0) {
      return $$0.a(avz.Y);
   }

   private static boolean s(cjx $$0) {
      return $$0.dQ().a(cbd.aw);
   }

   private static boolean e(bsa $$0) {
      return $$0.dQ().a(cbd.au);
   }

   private static boolean f(bsa $$0) {
      return !e($$0);
   }

   public static boolean b(bsa $$0) {
      return $$0.ai() == brn.bx && $$0.b(cjy::a);
   }

   private static boolean t(cjx $$0) {
      return $$0.dQ().a(cbd.ag);
   }

   private static boolean g(bsa $$0) {
      return $$0.dQ().a(cbd.x);
   }

   private static boolean u(cjx $$0) {
      return !$$0.eW().d();
   }

   private static boolean v(cjx $$0) {
      return $$0.eW().d() || !a($$0.eW());
   }

   public static boolean a(brn<?> $$0) {
      return $$0 == brn.bw || $$0 == brn.bs;
   }
}
