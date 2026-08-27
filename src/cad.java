import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cad {
   public static final int a = 8;
   public static final int b = 4;
   public static final cis c = cja.nU;
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

   protected static bjy<?> a(cac $$0, bjy<cac> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(ccx.a));
      $$1.b(ccx.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cac $$0, aru $$1) {
      int $$2 = d.a($$1);
      $$0.dM().a(brz.ag, true, (long)$$2);
   }

   private static void a(bjy<cac> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new blu(45, 90), new bly(), bln.a(), e(), f(), cam.a(), cai.a(119), bnb.a(300, cad::a), bne.a()));
   }

   private static void b(bjy<cac> $$0) {
      $$0.a(ccx.b, 10, ImmutableList.of(bmn.a(cad::b, 14.0F), bna.a(cab::gb, cad::i), bob.a(cac::p, caj.a()), d(), g(), b(), c(), bmq.a(bim.bt, 4)));
   }

   private static void b(cac $$0, bjy<cac> $$1) {
      $$1.a(
         ccx.k,
         10,
         ImmutableList.of(bnd.a($$1x -> !b($$0, $$1x)), bob.a(cad::c, bkn.a(5, 0.75F)), bmt.a(1.0F), blv.a(20), new bkx(), cah.a(), blb.a(cad::h, brz.o)),
         brz.o
      );
   }

   private static void c(bjy<cac> $$0) {
      $$0.a(
         ccx.l,
         10,
         ImmutableList.of(
            d(),
            bmn.a(cad::b, 14.0F),
            bna.a(cab::gb, cad::i),
            bob.a($$0x -> !$$0x.gi(), bli.a(brz.ah, 2, 1.0F)),
            bob.a(cac::gi, bli.a(brz.ah, 4, 0.6F)),
            new bml(ImmutableList.of(Pair.of(bmn.a(bim.aw, 8.0F), 1), Pair.of(bmg.a(0.6F, 2, 1), 1), Pair.of(new bkz(10, 20), 1)))
         ),
         brz.ah
      );
   }

   private static void d(bjy<cac> $$0) {
      $$0.a(ccx.m, 10, ImmutableList.of(blj.a(cad::v, 1.0F, true, 9), cak.a(9), cal.a(200, 200)), brz.ac);
   }

   private static void e(bjy<cac> $$0) {
      $$0.a(ccx.n, 10, ImmutableList.of(bms.b(brz.z, 1.0F, 12, true), b(), c(), blb.a(cad::l, brz.z)), brz.z);
   }

   private static void f(bjy<cac> $$0) {
      $$0.a(
         ccx.o,
         10,
         ImmutableList.of(
            blw.a(0.8F),
            bmn.a(cad::b, 8.0F),
            bob.a(bob.a(bii::bN), bnk.a(ImmutableList.builder().addAll(a()).add(Pair.of(bob.a((Predicate<cac>)($$0x -> true)), 1)).build())),
            bky.a(8, cad::a)
         ),
         brz.s
      );
   }

   private static ImmutableList<Pair<blz<biy>, Integer>> a() {
      return ImmutableList.of(Pair.of(bmn.a(bim.bt, 8.0F), 1), Pair.of(bmn.a(bim.aw, 8.0F), 1), Pair.of(bmn.a(8.0F), 1));
   }

   private static bml<biy> b() {
      return new bml<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bkz(30, 60), 1)).build());
   }

   private static bml<cac> c() {
      return new bml<>(
         ImmutableList.of(
            Pair.of(bmg.a(0.6F), 2), Pair.of(blm.a(bim.aw, 8, brz.q, 0.6F, 2), 2), Pair.of(bob.a(cad::f, bmv.a(0.6F, 3)), 2), Pair.of(new bkz(30, 60), 1)
         )
      );
   }

   private static bkq<bjh> d() {
      return bms.a(brz.av, 1.0F, 8, false);
   }

   private static bkq<cac> e() {
      return bku.a(cac::i_, brz.L, brz.z, B);
   }

   private static bkq<cac> f() {
      return bku.a(cad::h, brz.aq, brz.z, A);
   }

   protected static void a(cac $$0) {
      bjy<cac> $$1 = $$0.dM();
      ccx $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ccx.m, ccx.k, ccx.n, ccx.l, ccx.o, ccx.b));
      ccx $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(brz.o));
      if (!$$1.a(brz.s) && f($$0)) {
         $$0.aa();
      }

      if (!$$1.a(brz.ah)) {
         $$1.b(brz.ai);
      }

      $$0.x($$1.a(brz.ai));
   }

   private static boolean f(cac $$0) {
      if (!$$0.i_()) {
         return false;
      } else {
         bii $$1 = $$0.cY();
         return $$1 instanceof cac && ((cac)$$1).i_() || $$1 instanceof bzw && ((bzw)$$1).i_();
      }
   }

   protected static void a(cac $$0, byf $$1) {
      k($$0);
      cix $$2;
      if ($$1.j().a(cja.rt)) {
         $$0.a($$1, $$1.j().L());
         $$2 = $$1.j();
         $$1.ak();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dM().b(brz.ad);
         c($$0, $$2);
         d((biy)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cix.b);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cac $$0, cix $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bgp.b));
      }

      $$0.o($$1);
   }

   private static cix a(byf $$0) {
      cix $$1 = $$0.j();
      cix $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.ak();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cac $$0, boolean $$1) {
      cix $$2 = $$0.b(bgp.b);
      $$0.a(bgp.b, cix.b);
      if ($$0.gb()) {
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
            cix $$6 = $$0.eR();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cac $$0) {
      if (r($$0) && !$$0.eS().b()) {
         $$0.b($$0.eS());
         $$0.a(bgp.b, cix.b);
      }
   }

   private static void d(cac $$0, cix $$1) {
      cix $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cac $$0, List<cix> $$1) {
      Optional<cbm> $$2 = $$0.dM().c(brz.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cac $$0, List<cix> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cac $$0, cbm $$1, List<cix> $$2) {
      a($$0, $$2, $$1.di());
   }

   private static void a(cac $$0, List<cix> $$1, ehd $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bgp.b);

         for (cix $$3 : $$1) {
            bkr.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cix> g(cac $$0) {
      eco $$1 = $$0.dK().n().aH().getLootTable(ece.aB);
      List<cix> $$2 = $$1.a(new ecm.a((akk)$$0.dK()).a(eer.a, $$0).a(eeq.j));
      return $$2;
   }

   private static boolean a(biy $$0, biy $$1) {
      return $$1.ag() != bim.W ? false : aru.a($$0.dK().V()).i() < 0.1F;
   }

   protected static boolean a(cac $$0, cix $$1) {
      if ($$0.i_() && $$1.a(apt.V)) {
         return false;
      } else if ($$1.a(apt.T)) {
         return false;
      } else if (t($$0) && $$0.dM().a(brz.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cja.rt)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cix $$0) {
      return $$0.a(apt.U);
   }

   private static boolean a(cac $$0, bii $$1) {
      return !($$1 instanceof bja $$2) ? false : !$$2.i_() || !$$2.bv() || g((biy)$$0) || g($$2) || $$2 instanceof cac && $$2.cY() == null;
   }

   private static boolean b(cac $$0, biy $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cac $$0) {
      bjy<cac> $$1 = $$0.dM();
      if ($$1.a(brz.aq)) {
         biy $$2 = $$1.c(brz.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends biy> i(cac $$0) {
      bjy<cac> $$1 = $$0.dM();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<biy> $$2 = bkr.a($$0, brz.aa);
         if ($$2.isPresent() && btd.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(brz.ab)) {
               Optional<cbm> $$3 = $$1.c(brz.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bja> $$4 = $$1.c(brz.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cbm> $$5 = $$1.c(brz.al);
               return $$5.isPresent() && btd.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cbm $$0, boolean $$1) {
      List<cac> $$2 = $$0.dK().a(cac.class, $$0.cG().g(16.0));
      $$2.stream().filter(cad::d).filter($$2x -> !$$1 || bkr.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dK().X().b(cph.K)) {
            d((cab)$$1x, $$0);
         } else {
            c((cab)$$1x, $$0);
         }
      });
   }

   public static bgq a(cac $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cix $$4 = $$3.a(1);
         c($$0, $$4);
         d((biy)$$0);
         k($$0);
         return bgq.b;
      } else {
         return bgq.d;
      }
   }

   protected static boolean b(cac $$0, cix $$1) {
      return !t($$0) && !r($$0) && $$0.gb() && b($$1);
   }

   protected static void a(cac $$0, biy $$1) {
      if (!($$1 instanceof cac)) {
         if (u($$0)) {
            a($$0, false);
         }

         bjy<cac> $$2 = $$0.dM();
         $$2.b(brz.ah);
         $$2.b(brz.ai);
         $$2.b(brz.ac);
         if ($$1 instanceof cbm) {
            $$2.a(brz.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ag() != $$1.ag()) {
               $$2.b(brz.z);
            }
         });
         if ($$0.i_()) {
            $$2.a(brz.z, $$1, 100L);
            if (btd.d($$0, $$1)) {
               b((cab)$$0, $$1);
            }
         } else if ($$1.ag() == bim.W && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cab)$$0, $$1);
         }
      }
   }

   protected static void a(cab $$0, biy $$1) {
      if (!$$0.dM().c(ccx.n)) {
         if (btd.d($$0, $$1)) {
            if (!bkr.a($$0, $$1, 4.0)) {
               if ($$1.ag() == bim.bt && $$0.dK().X().b(cph.K)) {
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

   public static Optional<aov> c(cac $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static aov a(cac $$0, ccx $$1) {
      if ($$1 == ccx.k) {
         return aow.rV;
      } else if ($$0.ga()) {
         return aow.sa;
      } else if ($$1 == ccx.n && j($$0)) {
         return aow.sa;
      } else if ($$1 == ccx.m) {
         return aow.rT;
      } else if ($$1 == ccx.l) {
         return aow.rW;
      } else if (e((biy)$$0)) {
         return aow.rY;
      } else {
         return s($$0) ? aow.sa : aow.rU;
      }
   }

   private static boolean j(cac $$0) {
      bjy<cac> $$1 = $$0.dM();
      return !$$1.a(brz.z) ? false : $$1.c(brz.z).get().a($$0, 12.0);
   }

   protected static List<cab> d(cac $$0) {
      return $$0.dM().c(brz.an).orElse(ImmutableList.of());
   }

   private static List<cab> e(cab $$0) {
      return $$0.dM().c(brz.am).orElse(ImmutableList.of());
   }

   public static boolean a(biy $$0) {
      for (cix $$2 : $$0.bK()) {
         cis $$3 = $$2.d();
         if ($$3 instanceof cgh && ((cgh)$$3).d() == cgj.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cac $$0) {
      $$0.dM().b(brz.m);
      $$0.H().n();
   }

   private static bkq<biy> g() {
      bmo.a $$0 = new bmo.a(o);
      return bku.a($$1 -> $$1.i_() && $$0.a($$1.dK().z), brz.ak, brz.s, p);
   }

   protected static void b(cab $$0, biy $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ag() != bim.W || $$1x.p() && ((bzw)$$1).gg()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cab $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cab $$0, biy $$1) {
      if (btd.d($$0, $$1)) {
         $$0.dM().b(brz.E);
         $$0.dM().a(brz.aa, $$1.cv(), 600L);
         if ($$1.ag() == bim.W && $$0.p()) {
            c($$0);
         }

         if ($$1.ag() == bim.bt && $$0.dK().X().b(cph.K)) {
            $$0.dM().a(brz.ab, true, 600L);
         }
      }
   }

   private static void d(cab $$0, biy $$1) {
      Optional<cbm> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cab $$0, biy $$1) {
      Optional<biy> $$2 = f($$0);
      biy $$3 = bkr.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<biy> f(cab $$0) {
      return bkr.a($$0, brz.aa);
   }

   public static Optional<biy> e(cac $$0) {
      return $$0.dM().a(brz.z) ? $$0.dM().c(brz.z) : Optional.empty();
   }

   public static Optional<cbm> b(cab $$0) {
      return $$0.dM().a(brz.l) ? $$0.dM().c(brz.l) : Optional.empty();
   }

   private static void c(cac $$0, biy $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cac).forEach($$1x -> d((cac)$$1x, $$1));
   }

   private static void d(cac $$0, biy $$1) {
      bjy<cac> $$2 = $$0.dM();
      biy $$3 = bkr.a($$0, $$2.c(brz.z), $$1);
      $$3 = bkr.a($$0, $$2.c(brz.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cac $$0) {
      bjy<cac> $$1 = $$0.dM();
      if (!$$1.a(brz.z)) {
         return true;
      } else {
         biy $$2 = $$1.c(brz.z).get();
         bim<?> $$3 = $$2.ag();
         if ($$3 == bim.W) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(brz.aq, $$2) : false;
         }
      }
   }

   private static boolean m(cac $$0) {
      return !n($$0);
   }

   private static boolean n(cac $$0) {
      int $$1 = $$0.dM().c(brz.ar).orElse(0) + 1;
      int $$2 = $$0.dM().c(brz.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cac $$0, biy $$1) {
      $$0.dM().b(brz.aa);
      $$0.dM().b(brz.o);
      $$0.dM().b(brz.m);
      $$0.dM().a(brz.z, $$1, (long)q.a($$0.dK().z));
      c((cab)$$0);
   }

   protected static void c(cab $$0) {
      $$0.dM().a(brz.ag, true, (long)d.a($$0.dK().z));
   }

   private static void o(cac $$0) {
      $$0.dM().a(brz.au, true, 200L);
   }

   private static ehd p(cac $$0) {
      ehd $$1 = btr.a($$0, 4, 2);
      return $$1 == null ? $$0.di() : $$1;
   }

   private static boolean q(cac $$0) {
      return $$0.dM().a(brz.au);
   }

   protected static boolean d(cab $$0) {
      return $$0.dM().c(ccx.b);
   }

   private static boolean c(biy $$0) {
      return $$0.b(cja.uZ);
   }

   private static void d(biy $$0) {
      $$0.dM().a(brz.ac, true, 119L);
   }

   private static boolean r(cac $$0) {
      return $$0.dM().a(brz.ac);
   }

   private static boolean b(cix $$0) {
      return $$0.a(c);
   }

   private static boolean c(cix $$0) {
      return $$0.a(apt.W);
   }

   private static boolean s(cac $$0) {
      return $$0.dM().a(brz.av);
   }

   private static boolean e(biy $$0) {
      return $$0.dM().a(brz.at);
   }

   private static boolean f(biy $$0) {
      return !e($$0);
   }

   public static boolean b(biy $$0) {
      return $$0.ag() == bim.bt && $$0.b(cad::a);
   }

   private static boolean t(cac $$0) {
      return $$0.dM().a(brz.af);
   }

   private static boolean g(biy $$0) {
      return $$0.dM().a(brz.x);
   }

   private static boolean u(cac $$0) {
      return !$$0.eS().b();
   }

   private static boolean v(cac $$0) {
      return $$0.eS().b() || !a($$0.eS());
   }

   public static boolean a(bim<?> $$0) {
      return $$0 == bim.bs || $$0 == bim.bo;
   }
}
