import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cag {
   public static final int a = 8;
   public static final int b = 4;
   public static final civ c = cjd.nU;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bge d = asp.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bge o = asp.a(10, 40);
   private static final bge p = asp.a(10, 30);
   private static final bge q = asp.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bge A = asp.a(5, 7);
   private static final bge B = asp.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bkb<?> a(caf $$0, bkb<caf> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cda.a));
      $$1.b(cda.b);
      $$1.f();
      return $$1;
   }

   protected static void a(caf $$0, arx $$1) {
      int $$2 = d.a($$1);
      $$0.dM().a(bsc.ag, true, (long)$$2);
   }

   private static void a(bkb<caf> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new blx(45, 90), new bmb(), blq.a(), e(), f(), cap.a(), cal.a(119), bne.a(300, cag::a), bnh.a()));
   }

   private static void b(bkb<caf> $$0) {
      $$0.a(cda.b, 10, ImmutableList.of(bmq.a(cag::b, 14.0F), bnd.a(cae::gb, cag::i), boe.a(caf::p, cam.a()), d(), g(), b(), c(), bmt.a(bip.bt, 4)));
   }

   private static void b(caf $$0, bkb<caf> $$1) {
      $$1.a(
         cda.k,
         10,
         ImmutableList.of(bng.a($$1x -> !b($$0, $$1x)), boe.a(cag::c, bkq.a(5, 0.75F)), bmw.a(1.0F), bly.a(20), new bla(), cak.a(), ble.a(cag::h, bsc.o)),
         bsc.o
      );
   }

   private static void c(bkb<caf> $$0) {
      $$0.a(
         cda.l,
         10,
         ImmutableList.of(
            d(),
            bmq.a(cag::b, 14.0F),
            bnd.a(cae::gb, cag::i),
            boe.a($$0x -> !$$0x.gi(), bll.a(bsc.ah, 2, 1.0F)),
            boe.a(caf::gi, bll.a(bsc.ah, 4, 0.6F)),
            new bmo(ImmutableList.of(Pair.of(bmq.a(bip.aw, 8.0F), 1), Pair.of(bmj.a(0.6F, 2, 1), 1), Pair.of(new blc(10, 20), 1)))
         ),
         bsc.ah
      );
   }

   private static void d(bkb<caf> $$0) {
      $$0.a(cda.m, 10, ImmutableList.of(blm.a(cag::v, 1.0F, true, 9), can.a(9), cao.a(200, 200)), bsc.ac);
   }

   private static void e(bkb<caf> $$0) {
      $$0.a(cda.n, 10, ImmutableList.of(bmv.b(bsc.z, 1.0F, 12, true), b(), c(), ble.a(cag::l, bsc.z)), bsc.z);
   }

   private static void f(bkb<caf> $$0) {
      $$0.a(
         cda.o,
         10,
         ImmutableList.of(
            blz.a(0.8F),
            bmq.a(cag::b, 8.0F),
            boe.a(boe.a(bil::bN), bnn.a(ImmutableList.builder().addAll(a()).add(Pair.of(boe.a((Predicate<caf>)($$0x -> true)), 1)).build())),
            blb.a(8, cag::a)
         ),
         bsc.s
      );
   }

   private static ImmutableList<Pair<bmc<bjb>, Integer>> a() {
      return ImmutableList.of(Pair.of(bmq.a(bip.bt, 8.0F), 1), Pair.of(bmq.a(bip.aw, 8.0F), 1), Pair.of(bmq.a(8.0F), 1));
   }

   private static bmo<bjb> b() {
      return new bmo<>(ImmutableList.builder().addAll(a()).add(Pair.of(new blc(30, 60), 1)).build());
   }

   private static bmo<caf> c() {
      return new bmo<>(
         ImmutableList.of(
            Pair.of(bmj.a(0.6F), 2), Pair.of(blp.a(bip.aw, 8, bsc.q, 0.6F, 2), 2), Pair.of(boe.a(cag::f, bmy.a(0.6F, 3)), 2), Pair.of(new blc(30, 60), 1)
         )
      );
   }

   private static bkt<bjk> d() {
      return bmv.a(bsc.av, 1.0F, 8, false);
   }

   private static bkt<caf> e() {
      return bkx.a(caf::i_, bsc.L, bsc.z, B);
   }

   private static bkt<caf> f() {
      return bkx.a(cag::h, bsc.aq, bsc.z, A);
   }

   protected static void a(caf $$0) {
      bkb<caf> $$1 = $$0.dM();
      cda $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cda.m, cda.k, cda.n, cda.l, cda.o, cda.b));
      cda $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsc.o));
      if (!$$1.a(bsc.s) && f($$0)) {
         $$0.aa();
      }

      if (!$$1.a(bsc.ah)) {
         $$1.b(bsc.ai);
      }

      $$0.x($$1.a(bsc.ai));
   }

   private static boolean f(caf $$0) {
      if (!$$0.i_()) {
         return false;
      } else {
         bil $$1 = $$0.cY();
         return $$1 instanceof caf && ((caf)$$1).i_() || $$1 instanceof bzz && ((bzz)$$1).i_();
      }
   }

   protected static void a(caf $$0, byi $$1) {
      k($$0);
      cja $$2;
      if ($$1.j().a(cjd.rt)) {
         $$0.a($$1, $$1.j().L());
         $$2 = $$1.j();
         $$1.ak();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dM().b(bsc.ad);
         c($$0, $$2);
         d((bjb)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cja.b);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(caf $$0, cja $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bgs.b));
      }

      $$0.o($$1);
   }

   private static cja a(byi $$0) {
      cja $$1 = $$0.j();
      cja $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.ak();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(caf $$0, boolean $$1) {
      cja $$2 = $$0.b(bgs.b);
      $$0.a(bgs.b, cja.b);
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
            cja $$6 = $$0.eR();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(caf $$0) {
      if (r($$0) && !$$0.eS().b()) {
         $$0.b($$0.eS());
         $$0.a(bgs.b, cja.b);
      }
   }

   private static void d(caf $$0, cja $$1) {
      cja $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(caf $$0, List<cja> $$1) {
      Optional<cbp> $$2 = $$0.dM().c(bsc.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(caf $$0, List<cja> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(caf $$0, cbp $$1, List<cja> $$2) {
      a($$0, $$2, $$1.di());
   }

   private static void a(caf $$0, List<cja> $$1, ehi $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bgs.b);

         for (cja $$3 : $$1) {
            bku.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cja> g(caf $$0) {
      ect $$1 = $$0.dK().n().aH().getLootTable(ecj.aB);
      List<cja> $$2 = $$1.a(new ecr.a((akn)$$0.dK()).a(eew.a, $$0).a(eev.j));
      return $$2;
   }

   private static boolean a(bjb $$0, bjb $$1) {
      return $$1.ag() != bip.W ? false : arx.a($$0.dK().V()).i() < 0.1F;
   }

   protected static boolean a(caf $$0, cja $$1) {
      if ($$0.i_() && $$1.a(apw.V)) {
         return false;
      } else if ($$1.a(apw.T)) {
         return false;
      } else if (t($$0) && $$0.dM().a(bsc.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cjd.rt)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cja $$0) {
      return $$0.a(apw.U);
   }

   private static boolean a(caf $$0, bil $$1) {
      return !($$1 instanceof bjd $$2) ? false : !$$2.i_() || !$$2.bv() || g((bjb)$$0) || g($$2) || $$2 instanceof caf && $$2.cY() == null;
   }

   private static boolean b(caf $$0, bjb $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(caf $$0) {
      bkb<caf> $$1 = $$0.dM();
      if ($$1.a(bsc.aq)) {
         bjb $$2 = $$1.c(bsc.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bjb> i(caf $$0) {
      bkb<caf> $$1 = $$0.dM();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bjb> $$2 = bku.a($$0, bsc.aa);
         if ($$2.isPresent() && btg.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bsc.ab)) {
               Optional<cbp> $$3 = $$1.c(bsc.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bjd> $$4 = $$1.c(bsc.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cbp> $$5 = $$1.c(bsc.al);
               return $$5.isPresent() && btg.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cbp $$0, boolean $$1) {
      List<caf> $$2 = $$0.dK().a(caf.class, $$0.cG().g(16.0));
      $$2.stream().filter(cag::d).filter($$2x -> !$$1 || bku.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dK().X().b(cpm.K)) {
            d((cae)$$1x, $$0);
         } else {
            c((cae)$$1x, $$0);
         }
      });
   }

   public static bgt a(caf $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cja $$4 = $$3.a(1);
         c($$0, $$4);
         d((bjb)$$0);
         k($$0);
         return bgt.b;
      } else {
         return bgt.d;
      }
   }

   protected static boolean b(caf $$0, cja $$1) {
      return !t($$0) && !r($$0) && $$0.gb() && b($$1);
   }

   protected static void a(caf $$0, bjb $$1) {
      if (!($$1 instanceof caf)) {
         if (u($$0)) {
            a($$0, false);
         }

         bkb<caf> $$2 = $$0.dM();
         $$2.b(bsc.ah);
         $$2.b(bsc.ai);
         $$2.b(bsc.ac);
         if ($$1 instanceof cbp) {
            $$2.a(bsc.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ag() != $$1.ag()) {
               $$2.b(bsc.z);
            }
         });
         if ($$0.i_()) {
            $$2.a(bsc.z, $$1, 100L);
            if (btg.d($$0, $$1)) {
               b((cae)$$0, $$1);
            }
         } else if ($$1.ag() == bip.W && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cae)$$0, $$1);
         }
      }
   }

   protected static void a(cae $$0, bjb $$1) {
      if (!$$0.dM().c(cda.n)) {
         if (btg.d($$0, $$1)) {
            if (!bku.a($$0, $$1, 4.0)) {
               if ($$1.ag() == bip.bt && $$0.dK().X().b(cpm.K)) {
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

   public static Optional<aoy> c(caf $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static aoy a(caf $$0, cda $$1) {
      if ($$1 == cda.k) {
         return aoz.rV;
      } else if ($$0.ga()) {
         return aoz.sa;
      } else if ($$1 == cda.n && j($$0)) {
         return aoz.sa;
      } else if ($$1 == cda.m) {
         return aoz.rT;
      } else if ($$1 == cda.l) {
         return aoz.rW;
      } else if (e((bjb)$$0)) {
         return aoz.rY;
      } else {
         return s($$0) ? aoz.sa : aoz.rU;
      }
   }

   private static boolean j(caf $$0) {
      bkb<caf> $$1 = $$0.dM();
      return !$$1.a(bsc.z) ? false : $$1.c(bsc.z).get().a($$0, 12.0);
   }

   protected static List<cae> d(caf $$0) {
      return $$0.dM().c(bsc.an).orElse(ImmutableList.of());
   }

   private static List<cae> e(cae $$0) {
      return $$0.dM().c(bsc.am).orElse(ImmutableList.of());
   }

   public static boolean a(bjb $$0) {
      for (cja $$2 : $$0.bK()) {
         civ $$3 = $$2.d();
         if ($$3 instanceof cgk && ((cgk)$$3).d() == cgm.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(caf $$0) {
      $$0.dM().b(bsc.m);
      $$0.H().n();
   }

   private static bkt<bjb> g() {
      bmr.a $$0 = new bmr.a(o);
      return bkx.a($$1 -> $$1.i_() && $$0.a($$1.dK().z), bsc.ak, bsc.s, p);
   }

   protected static void b(cae $$0, bjb $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ag() != bip.W || $$1x.p() && ((bzz)$$1).gg()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cae $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cae $$0, bjb $$1) {
      if (btg.d($$0, $$1)) {
         $$0.dM().b(bsc.E);
         $$0.dM().a(bsc.aa, $$1.cv(), 600L);
         if ($$1.ag() == bip.W && $$0.p()) {
            c($$0);
         }

         if ($$1.ag() == bip.bt && $$0.dK().X().b(cpm.K)) {
            $$0.dM().a(bsc.ab, true, 600L);
         }
      }
   }

   private static void d(cae $$0, bjb $$1) {
      Optional<cbp> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cae $$0, bjb $$1) {
      Optional<bjb> $$2 = f($$0);
      bjb $$3 = bku.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bjb> f(cae $$0) {
      return bku.a($$0, bsc.aa);
   }

   public static Optional<bjb> e(caf $$0) {
      return $$0.dM().a(bsc.z) ? $$0.dM().c(bsc.z) : Optional.empty();
   }

   public static Optional<cbp> b(cae $$0) {
      return $$0.dM().a(bsc.l) ? $$0.dM().c(bsc.l) : Optional.empty();
   }

   private static void c(caf $$0, bjb $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof caf).forEach($$1x -> d((caf)$$1x, $$1));
   }

   private static void d(caf $$0, bjb $$1) {
      bkb<caf> $$2 = $$0.dM();
      bjb $$3 = bku.a($$0, $$2.c(bsc.z), $$1);
      $$3 = bku.a($$0, $$2.c(bsc.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(caf $$0) {
      bkb<caf> $$1 = $$0.dM();
      if (!$$1.a(bsc.z)) {
         return true;
      } else {
         bjb $$2 = $$1.c(bsc.z).get();
         bip<?> $$3 = $$2.ag();
         if ($$3 == bip.W) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bsc.aq, $$2) : false;
         }
      }
   }

   private static boolean m(caf $$0) {
      return !n($$0);
   }

   private static boolean n(caf $$0) {
      int $$1 = $$0.dM().c(bsc.ar).orElse(0) + 1;
      int $$2 = $$0.dM().c(bsc.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(caf $$0, bjb $$1) {
      $$0.dM().b(bsc.aa);
      $$0.dM().b(bsc.o);
      $$0.dM().b(bsc.m);
      $$0.dM().a(bsc.z, $$1, (long)q.a($$0.dK().z));
      c((cae)$$0);
   }

   protected static void c(cae $$0) {
      $$0.dM().a(bsc.ag, true, (long)d.a($$0.dK().z));
   }

   private static void o(caf $$0) {
      $$0.dM().a(bsc.au, true, 200L);
   }

   private static ehi p(caf $$0) {
      ehi $$1 = btu.a($$0, 4, 2);
      return $$1 == null ? $$0.di() : $$1;
   }

   private static boolean q(caf $$0) {
      return $$0.dM().a(bsc.au);
   }

   protected static boolean d(cae $$0) {
      return $$0.dM().c(cda.b);
   }

   private static boolean c(bjb $$0) {
      return $$0.b(cjd.uZ);
   }

   private static void d(bjb $$0) {
      $$0.dM().a(bsc.ac, true, 119L);
   }

   private static boolean r(caf $$0) {
      return $$0.dM().a(bsc.ac);
   }

   private static boolean b(cja $$0) {
      return $$0.a(c);
   }

   private static boolean c(cja $$0) {
      return $$0.a(apw.W);
   }

   private static boolean s(caf $$0) {
      return $$0.dM().a(bsc.av);
   }

   private static boolean e(bjb $$0) {
      return $$0.dM().a(bsc.at);
   }

   private static boolean f(bjb $$0) {
      return !e($$0);
   }

   public static boolean b(bjb $$0) {
      return $$0.ag() == bip.bt && $$0.b(cag::a);
   }

   private static boolean t(caf $$0) {
      return $$0.dM().a(bsc.af);
   }

   private static boolean g(bjb $$0) {
      return $$0.dM().a(bsc.x);
   }

   private static boolean u(caf $$0) {
      return !$$0.eS().b();
   }

   private static boolean v(caf $$0) {
      return $$0.eS().b() || !a($$0.eS());
   }

   public static boolean a(bip<?> $$0) {
      return $$0 == bip.bs || $$0 == bip.bo;
   }
}
