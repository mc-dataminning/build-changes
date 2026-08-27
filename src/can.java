import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class can {
   public static final int a = 8;
   public static final int b = 4;
   public static final cjc c = cjk.nU;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bgl d = asw.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bgl o = asw.a(10, 40);
   private static final bgl p = asw.a(10, 30);
   private static final bgl q = asw.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bgl A = asw.a(5, 7);
   private static final bgl B = asw.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bki<?> a(cam $$0, bki<cam> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cdh.a));
      $$1.b(cdh.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cam $$0, ase $$1) {
      int $$2 = d.a($$1);
      $$0.dN().a(bsj.ag, true, (long)$$2);
   }

   private static void a(bki<cam> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bme(45, 90), new bmi(), blx.a(), e(), f(), caw.a(), cas.a(119), bnl.a(300, can::a), bno.a()));
   }

   private static void b(bki<cam> $$0) {
      $$0.a(cdh.b, 10, ImmutableList.of(bmx.a(can::b, 14.0F), bnk.a(cal::ge, can::i), bol.a(cam::s, cat.a()), d(), g(), b(), c(), bna.a(biw.bt, 4)));
   }

   private static void b(cam $$0, bki<cam> $$1) {
      $$1.a(
         cdh.k,
         10,
         ImmutableList.of(bnn.a($$1x -> !b($$0, $$1x)), bol.a(can::c, bkx.a(5, 0.75F)), bnd.a(1.0F), bmf.a(20), new blh(), car.a(), bll.a(can::h, bsj.o)),
         bsj.o
      );
   }

   private static void c(bki<cam> $$0) {
      $$0.a(
         cdh.l,
         10,
         ImmutableList.of(
            d(),
            bmx.a(can::b, 14.0F),
            bnk.a(cal::ge, can::i),
            bol.a($$0x -> !$$0x.gl(), bls.a(bsj.ah, 2, 1.0F)),
            bol.a(cam::gl, bls.a(bsj.ah, 4, 0.6F)),
            new bmv(ImmutableList.of(Pair.of(bmx.a(biw.aw, 8.0F), 1), Pair.of(bmq.a(0.6F, 2, 1), 1), Pair.of(new blj(10, 20), 1)))
         ),
         bsj.ah
      );
   }

   private static void d(bki<cam> $$0) {
      $$0.a(cdh.m, 10, ImmutableList.of(blt.a(can::v, 1.0F, true, 9), cau.a(9), cav.a(200, 200)), bsj.ac);
   }

   private static void e(bki<cam> $$0) {
      $$0.a(cdh.n, 10, ImmutableList.of(bnc.b(bsj.z, 1.0F, 12, true), b(), c(), bll.a(can::l, bsj.z)), bsj.z);
   }

   private static void f(bki<cam> $$0) {
      $$0.a(
         cdh.o,
         10,
         ImmutableList.of(
            bmg.a(0.8F),
            bmx.a(can::b, 8.0F),
            bol.a(bol.a(bis::bN), bnu.a(ImmutableList.builder().addAll(a()).add(Pair.of(bol.a((Predicate<cam>)($$0x -> true)), 1)).build())),
            bli.a(8, can::a)
         ),
         bsj.s
      );
   }

   private static ImmutableList<Pair<bmj<bji>, Integer>> a() {
      return ImmutableList.of(Pair.of(bmx.a(biw.bt, 8.0F), 1), Pair.of(bmx.a(biw.aw, 8.0F), 1), Pair.of(bmx.a(8.0F), 1));
   }

   private static bmv<bji> b() {
      return new bmv<>(ImmutableList.builder().addAll(a()).add(Pair.of(new blj(30, 60), 1)).build());
   }

   private static bmv<cam> c() {
      return new bmv<>(
         ImmutableList.of(
            Pair.of(bmq.a(0.6F), 2), Pair.of(blw.a(biw.aw, 8, bsj.q, 0.6F, 2), 2), Pair.of(bol.a(can::f, bnf.a(0.6F, 3)), 2), Pair.of(new blj(30, 60), 1)
         )
      );
   }

   private static bla<bjr> d() {
      return bnc.a(bsj.av, 1.0F, 8, false);
   }

   private static bla<cam> e() {
      return ble.a(cam::m_, bsj.L, bsj.z, B);
   }

   private static bla<cam> f() {
      return ble.a(can::h, bsj.aq, bsj.z, A);
   }

   protected static void a(cam $$0) {
      bki<cam> $$1 = $$0.dN();
      cdh $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cdh.m, cdh.k, cdh.n, cdh.l, cdh.o, cdh.b));
      cdh $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsj.o));
      if (!$$1.a(bsj.s) && f($$0)) {
         $$0.aa();
      }

      if (!$$1.a(bsj.ah)) {
         $$1.b(bsj.ai);
      }

      $$0.x($$1.a(bsj.ai));
   }

   private static boolean f(cam $$0) {
      if (!$$0.m_()) {
         return false;
      } else {
         bis $$1 = $$0.cY();
         return $$1 instanceof cam && ((cam)$$1).m_() || $$1 instanceof cag && ((cag)$$1).m_();
      }
   }

   protected static void a(cam $$0, byp $$1) {
      k($$0);
      cjh $$2;
      if ($$1.q().a(cjk.rt)) {
         $$0.a($$1, $$1.q().L());
         $$2 = $$1.q();
         $$1.ak();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dN().b(bsj.ad);
         c($$0, $$2);
         d((bji)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cjh.b);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cam $$0, cjh $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bgz.b));
      }

      $$0.o($$1);
   }

   private static cjh a(byp $$0) {
      cjh $$1 = $$0.q();
      cjh $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.ak();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cam $$0, boolean $$1) {
      cjh $$2 = $$0.b(bgz.b);
      $$0.a(bgz.b, cjh.b);
      if ($$0.ge()) {
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
            cjh $$6 = $$0.eS();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cam $$0) {
      if (r($$0) && !$$0.eT().b()) {
         $$0.b($$0.eT());
         $$0.a(bgz.b, cjh.b);
      }
   }

   private static void d(cam $$0, cjh $$1) {
      cjh $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cam $$0, List<cjh> $$1) {
      Optional<cbw> $$2 = $$0.dN().c(bsj.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cam $$0, List<cjh> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cam $$0, cbw $$1, List<cjh> $$2) {
      a($$0, $$2, $$1.dj());
   }

   private static void a(cam $$0, List<cjh> $$1, ehp $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bgz.b);

         for (cjh $$3 : $$1) {
            blb.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cjh> g(cam $$0) {
      eda $$1 = $$0.dL().n().aH().getLootTable(ecq.aB);
      List<cjh> $$2 = $$1.a(new ecy.a((aks)$$0.dL()).a(efd.a, $$0).a(efc.j));
      return $$2;
   }

   private static boolean a(bji $$0, bji $$1) {
      return $$1.ag() != biw.W ? false : ase.a($$0.dL().V()).i() < 0.1F;
   }

   protected static boolean a(cam $$0, cjh $$1) {
      if ($$0.m_() && $$1.a(aqc.V)) {
         return false;
      } else if ($$1.a(aqc.T)) {
         return false;
      } else if (t($$0) && $$0.dN().a(bsj.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cjk.rt)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cjh $$0) {
      return $$0.a(aqc.U);
   }

   private static boolean a(cam $$0, bis $$1) {
      return !($$1 instanceof bjk $$2) ? false : !$$2.m_() || !$$2.bv() || g((bji)$$0) || g($$2) || $$2 instanceof cam && $$2.cY() == null;
   }

   private static boolean b(cam $$0, bji $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cam $$0) {
      bki<cam> $$1 = $$0.dN();
      if ($$1.a(bsj.aq)) {
         bji $$2 = $$1.c(bsj.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bji> i(cam $$0) {
      bki<cam> $$1 = $$0.dN();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bji> $$2 = blb.a($$0, bsj.aa);
         if ($$2.isPresent() && btn.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bsj.ab)) {
               Optional<cbw> $$3 = $$1.c(bsj.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bjk> $$4 = $$1.c(bsj.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cbw> $$5 = $$1.c(bsj.al);
               return $$5.isPresent() && btn.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cbw $$0, boolean $$1) {
      List<cam> $$2 = $$0.dL().a(cam.class, $$0.cG().g(16.0));
      $$2.stream().filter(can::d).filter($$2x -> !$$1 || blb.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dL().X().b(cpt.K)) {
            d((cal)$$1x, $$0);
         } else {
            c((cal)$$1x, $$0);
         }
      });
   }

   public static bha a(cam $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cjh $$4 = $$3.a(1);
         c($$0, $$4);
         d((bji)$$0);
         k($$0);
         return bha.b;
      } else {
         return bha.d;
      }
   }

   protected static boolean b(cam $$0, cjh $$1) {
      return !t($$0) && !r($$0) && $$0.ge() && b($$1);
   }

   protected static void a(cam $$0, bji $$1) {
      if (!($$1 instanceof cam)) {
         if (u($$0)) {
            a($$0, false);
         }

         bki<cam> $$2 = $$0.dN();
         $$2.b(bsj.ah);
         $$2.b(bsj.ai);
         $$2.b(bsj.ac);
         if ($$1 instanceof cbw) {
            $$2.a(bsj.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ag() != $$1.ag()) {
               $$2.b(bsj.z);
            }
         });
         if ($$0.m_()) {
            $$2.a(bsj.z, $$1, 100L);
            if (btn.d($$0, $$1)) {
               b((cal)$$0, $$1);
            }
         } else if ($$1.ag() == biw.W && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cal)$$0, $$1);
         }
      }
   }

   protected static void a(cal $$0, bji $$1) {
      if (!$$0.dN().c(cdh.n)) {
         if (btn.d($$0, $$1)) {
            if (!blb.a($$0, $$1, 4.0)) {
               if ($$1.ag() == biw.bt && $$0.dL().X().b(cpt.K)) {
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

   public static Optional<ape> c(cam $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static ape a(cam $$0, cdh $$1) {
      if ($$1 == cdh.k) {
         return apf.rV;
      } else if ($$0.gd()) {
         return apf.sa;
      } else if ($$1 == cdh.n && j($$0)) {
         return apf.sa;
      } else if ($$1 == cdh.m) {
         return apf.rT;
      } else if ($$1 == cdh.l) {
         return apf.rW;
      } else if (e((bji)$$0)) {
         return apf.rY;
      } else {
         return s($$0) ? apf.sa : apf.rU;
      }
   }

   private static boolean j(cam $$0) {
      bki<cam> $$1 = $$0.dN();
      return !$$1.a(bsj.z) ? false : $$1.c(bsj.z).get().a($$0, 12.0);
   }

   protected static List<cal> d(cam $$0) {
      return $$0.dN().c(bsj.an).orElse(ImmutableList.of());
   }

   private static List<cal> e(cal $$0) {
      return $$0.dN().c(bsj.am).orElse(ImmutableList.of());
   }

   public static boolean a(bji $$0) {
      for (cjh $$2 : $$0.bK()) {
         cjc $$3 = $$2.d();
         if ($$3 instanceof cgr && ((cgr)$$3).d() == cgt.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cam $$0) {
      $$0.dN().b(bsj.m);
      $$0.L().n();
   }

   private static bla<bji> g() {
      bmy.a $$0 = new bmy.a(o);
      return ble.a($$1 -> $$1.m_() && $$0.a($$1.dL().z), bsj.ak, bsj.s, p);
   }

   protected static void b(cal $$0, bji $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ag() != biw.W || $$1x.s() && ((cag)$$1).gj()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cal $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cal $$0, bji $$1) {
      if (btn.d($$0, $$1)) {
         $$0.dN().b(bsj.E);
         $$0.dN().a(bsj.aa, $$1.cv(), 600L);
         if ($$1.ag() == biw.W && $$0.s()) {
            c($$0);
         }

         if ($$1.ag() == biw.bt && $$0.dL().X().b(cpt.K)) {
            $$0.dN().a(bsj.ab, true, 600L);
         }
      }
   }

   private static void d(cal $$0, bji $$1) {
      Optional<cbw> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cal $$0, bji $$1) {
      Optional<bji> $$2 = f($$0);
      bji $$3 = blb.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bji> f(cal $$0) {
      return blb.a($$0, bsj.aa);
   }

   public static Optional<bji> e(cam $$0) {
      return $$0.dN().a(bsj.z) ? $$0.dN().c(bsj.z) : Optional.empty();
   }

   public static Optional<cbw> b(cal $$0) {
      return $$0.dN().a(bsj.l) ? $$0.dN().c(bsj.l) : Optional.empty();
   }

   private static void c(cam $$0, bji $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cam).forEach($$1x -> d((cam)$$1x, $$1));
   }

   private static void d(cam $$0, bji $$1) {
      bki<cam> $$2 = $$0.dN();
      bji $$3 = blb.a($$0, $$2.c(bsj.z), $$1);
      $$3 = blb.a($$0, $$2.c(bsj.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cam $$0) {
      bki<cam> $$1 = $$0.dN();
      if (!$$1.a(bsj.z)) {
         return true;
      } else {
         bji $$2 = $$1.c(bsj.z).get();
         biw<?> $$3 = $$2.ag();
         if ($$3 == biw.W) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bsj.aq, $$2) : false;
         }
      }
   }

   private static boolean m(cam $$0) {
      return !n($$0);
   }

   private static boolean n(cam $$0) {
      int $$1 = $$0.dN().c(bsj.ar).orElse(0) + 1;
      int $$2 = $$0.dN().c(bsj.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cam $$0, bji $$1) {
      $$0.dN().b(bsj.aa);
      $$0.dN().b(bsj.o);
      $$0.dN().b(bsj.m);
      $$0.dN().a(bsj.z, $$1, (long)q.a($$0.dL().z));
      c((cal)$$0);
   }

   protected static void c(cal $$0) {
      $$0.dN().a(bsj.ag, true, (long)d.a($$0.dL().z));
   }

   private static void o(cam $$0) {
      $$0.dN().a(bsj.au, true, 200L);
   }

   private static ehp p(cam $$0) {
      ehp $$1 = bub.a($$0, 4, 2);
      return $$1 == null ? $$0.dj() : $$1;
   }

   private static boolean q(cam $$0) {
      return $$0.dN().a(bsj.au);
   }

   protected static boolean d(cal $$0) {
      return $$0.dN().c(cdh.b);
   }

   private static boolean c(bji $$0) {
      return $$0.b(cjk.uZ);
   }

   private static void d(bji $$0) {
      $$0.dN().a(bsj.ac, true, 119L);
   }

   private static boolean r(cam $$0) {
      return $$0.dN().a(bsj.ac);
   }

   private static boolean b(cjh $$0) {
      return $$0.a(c);
   }

   private static boolean c(cjh $$0) {
      return $$0.a(aqc.W);
   }

   private static boolean s(cam $$0) {
      return $$0.dN().a(bsj.av);
   }

   private static boolean e(bji $$0) {
      return $$0.dN().a(bsj.at);
   }

   private static boolean f(bji $$0) {
      return !e($$0);
   }

   public static boolean b(bji $$0) {
      return $$0.ag() == biw.bt && $$0.b(can::a);
   }

   private static boolean t(cam $$0) {
      return $$0.dN().a(bsj.af);
   }

   private static boolean g(bji $$0) {
      return $$0.dN().a(bsj.x);
   }

   private static boolean u(cam $$0) {
      return !$$0.eT().b();
   }

   private static boolean v(cam $$0) {
      return $$0.eT().b() || !a($$0.eT());
   }

   public static boolean a(biw<?> $$0) {
      return $$0 == biw.bs || $$0 == biw.bo;
   }
}
