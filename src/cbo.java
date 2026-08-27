import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cbo {
   public static final int a = 8;
   public static final int b = 4;
   public static final cke c = ckm.nU;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bhm d = atw.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bhm o = atw.a(10, 40);
   private static final bhm p = atw.a(10, 30);
   private static final bhm q = atw.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bhm A = atw.a(5, 7);
   private static final bhm B = atw.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static blj<?> a(cbn $$0, blj<cbn> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cei.a));
      $$1.b(cei.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cbn $$0, ate $$1) {
      int $$2 = d.a($$1);
      $$0.dN().a(btk.ag, true, (long)$$2);
   }

   private static void a(blj<cbn> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bnf(45, 90), new bnj(), bmy.a(), e(), f(), cbx.a(), cbt.a(119), bom.a(300, cbo::a), bop.a()));
   }

   private static void b(blj<cbn> $$0) {
      $$0.a(cei.b, 10, ImmutableList.of(bny.a(cbo::b, 14.0F), bol.a(cbm::gf, cbo::i), bpm.a(cbn::s, cbu.a()), d(), g(), b(), c(), bob.a(bjx.bt, 4)));
   }

   private static void b(cbn $$0, blj<cbn> $$1) {
      $$1.a(
         cei.k,
         10,
         ImmutableList.of(boo.a($$1x -> !b($$0, $$1x)), bpm.a(cbo::c, bly.a(5, 0.75F)), boe.a(1.0F), bng.a(20), new bmi(), cbs.a(), bmm.a(cbo::h, btk.o)),
         btk.o
      );
   }

   private static void c(blj<cbn> $$0) {
      $$0.a(
         cei.l,
         10,
         ImmutableList.of(
            d(),
            bny.a(cbo::b, 14.0F),
            bol.a(cbm::gf, cbo::i),
            bpm.a($$0x -> !$$0x.gm(), bmt.a(btk.ah, 2, 1.0F)),
            bpm.a(cbn::gm, bmt.a(btk.ah, 4, 0.6F)),
            new bnw(ImmutableList.of(Pair.of(bny.a(bjx.aw, 8.0F), 1), Pair.of(bnr.a(0.6F, 2, 1), 1), Pair.of(new bmk(10, 20), 1)))
         ),
         btk.ah
      );
   }

   private static void d(blj<cbn> $$0) {
      $$0.a(cei.m, 10, ImmutableList.of(bmu.a(cbo::v, 1.0F, true, 9), cbv.a(9), cbw.a(200, 200)), btk.ac);
   }

   private static void e(blj<cbn> $$0) {
      $$0.a(cei.n, 10, ImmutableList.of(bod.b(btk.z, 1.0F, 12, true), b(), c(), bmm.a(cbo::l, btk.z)), btk.z);
   }

   private static void f(blj<cbn> $$0) {
      $$0.a(
         cei.o,
         10,
         ImmutableList.of(
            bnh.a(0.8F),
            bny.a(cbo::b, 8.0F),
            bpm.a(bpm.a(bjt::bN), bov.a(ImmutableList.builder().addAll(a()).add(Pair.of(bpm.a((Predicate<cbn>)($$0x -> true)), 1)).build())),
            bmj.a(8, cbo::a)
         ),
         btk.s
      );
   }

   private static ImmutableList<Pair<bnk<bkj>, Integer>> a() {
      return ImmutableList.of(Pair.of(bny.a(bjx.bt, 8.0F), 1), Pair.of(bny.a(bjx.aw, 8.0F), 1), Pair.of(bny.a(8.0F), 1));
   }

   private static bnw<bkj> b() {
      return new bnw<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bmk(30, 60), 1)).build());
   }

   private static bnw<cbn> c() {
      return new bnw<>(
         ImmutableList.of(
            Pair.of(bnr.a(0.6F), 2), Pair.of(bmx.a(bjx.aw, 8, btk.q, 0.6F, 2), 2), Pair.of(bpm.a(cbo::f, bog.a(0.6F, 3)), 2), Pair.of(new bmk(30, 60), 1)
         )
      );
   }

   private static bmb<bks> d() {
      return bod.a(btk.av, 1.0F, 8, false);
   }

   private static bmb<cbn> e() {
      return bmf.a(cbn::n_, btk.L, btk.z, B);
   }

   private static bmb<cbn> f() {
      return bmf.a(cbo::h, btk.aq, btk.z, A);
   }

   protected static void a(cbn $$0) {
      blj<cbn> $$1 = $$0.dN();
      cei $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cei.m, cei.k, cei.n, cei.l, cei.o, cei.b));
      cei $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(btk.o));
      if (!$$1.a(btk.s) && f($$0)) {
         $$0.aa();
      }

      if (!$$1.a(btk.ah)) {
         $$1.b(btk.ai);
      }

      $$0.x($$1.a(btk.ai));
   }

   private static boolean f(cbn $$0) {
      if (!$$0.n_()) {
         return false;
      } else {
         bjt $$1 = $$0.cY();
         return $$1 instanceof cbn && ((cbn)$$1).n_() || $$1 instanceof cbh && ((cbh)$$1).n_();
      }
   }

   protected static void a(cbn $$0, bzq $$1) {
      k($$0);
      ckj $$2;
      if ($$1.q().a(ckm.rt)) {
         $$0.a($$1, $$1.q().L());
         $$2 = $$1.q();
         $$1.ak();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dN().b(btk.ad);
         c($$0, $$2);
         d((bkj)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(ckj.b);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cbn $$0, ckj $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bia.b));
      }

      $$0.o($$1);
   }

   private static ckj a(bzq $$0) {
      ckj $$1 = $$0.q();
      ckj $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.ak();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cbn $$0, boolean $$1) {
      ckj $$2 = $$0.b(bia.b);
      $$0.a(bia.b, ckj.b);
      if ($$0.gf()) {
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
            ckj $$6 = $$0.eS();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cbn $$0) {
      if (r($$0) && !$$0.eT().b()) {
         $$0.b($$0.eT());
         $$0.a(bia.b, ckj.b);
      }
   }

   private static void d(cbn $$0, ckj $$1) {
      ckj $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cbn $$0, List<ckj> $$1) {
      Optional<ccx> $$2 = $$0.dN().c(btk.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cbn $$0, List<ckj> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cbn $$0, ccx $$1, List<ckj> $$2) {
      a($$0, $$2, $$1.dj());
   }

   private static void a(cbn $$0, List<ckj> $$1, eif $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bia.b);

         for (ckj $$3 : $$1) {
            bmc.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<ckj> g(cbn $$0) {
      edq $$1 = $$0.dL().n().aH().getLootTable(edg.aB);
      List<ckj> $$2 = $$1.a(new edo.a((alq)$$0.dL()).a(eft.a, $$0).a(efs.j));
      return $$2;
   }

   private static boolean a(bkj $$0, bkj $$1) {
      return $$1.ag() != bjx.W ? false : ate.a($$0.dL().V()).i() < 0.1F;
   }

   protected static boolean a(cbn $$0, ckj $$1) {
      if ($$0.n_() && $$1.a(ara.V)) {
         return false;
      } else if ($$1.a(ara.T)) {
         return false;
      } else if (t($$0) && $$0.dN().a(btk.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(ckm.rt)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(ckj $$0) {
      return $$0.a(ara.U);
   }

   private static boolean a(cbn $$0, bjt $$1) {
      return !($$1 instanceof bkl $$2) ? false : !$$2.n_() || !$$2.bv() || g((bkj)$$0) || g($$2) || $$2 instanceof cbn && $$2.cY() == null;
   }

   private static boolean b(cbn $$0, bkj $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cbn $$0) {
      blj<cbn> $$1 = $$0.dN();
      if ($$1.a(btk.aq)) {
         bkj $$2 = $$1.c(btk.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bkj> i(cbn $$0) {
      blj<cbn> $$1 = $$0.dN();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bkj> $$2 = bmc.a($$0, btk.aa);
         if ($$2.isPresent() && buo.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(btk.ab)) {
               Optional<ccx> $$3 = $$1.c(btk.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bkl> $$4 = $$1.c(btk.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<ccx> $$5 = $$1.c(btk.al);
               return $$5.isPresent() && buo.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(ccx $$0, boolean $$1) {
      List<cbn> $$2 = $$0.dL().a(cbn.class, $$0.cG().g(16.0));
      $$2.stream().filter(cbo::d).filter($$2x -> !$$1 || bmc.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dL().X().b(cqv.L)) {
            d((cbm)$$1x, $$0);
         } else {
            c((cbm)$$1x, $$0);
         }
      });
   }

   public static bib a(cbn $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         ckj $$4 = $$3.a(1);
         c($$0, $$4);
         d((bkj)$$0);
         k($$0);
         return bib.b;
      } else {
         return bib.d;
      }
   }

   protected static boolean b(cbn $$0, ckj $$1) {
      return !t($$0) && !r($$0) && $$0.gf() && b($$1);
   }

   protected static void a(cbn $$0, bkj $$1) {
      if (!($$1 instanceof cbn)) {
         if (u($$0)) {
            a($$0, false);
         }

         blj<cbn> $$2 = $$0.dN();
         $$2.b(btk.ah);
         $$2.b(btk.ai);
         $$2.b(btk.ac);
         if ($$1 instanceof ccx) {
            $$2.a(btk.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ag() != $$1.ag()) {
               $$2.b(btk.z);
            }
         });
         if ($$0.n_()) {
            $$2.a(btk.z, $$1, 100L);
            if (buo.d($$0, $$1)) {
               b((cbm)$$0, $$1);
            }
         } else if ($$1.ag() == bjx.W && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cbm)$$0, $$1);
         }
      }
   }

   protected static void a(cbm $$0, bkj $$1) {
      if (!$$0.dN().c(cei.n)) {
         if (buo.d($$0, $$1)) {
            if (!bmc.a($$0, $$1, 4.0)) {
               if ($$1.ag() == bjx.bt && $$0.dL().X().b(cqv.L)) {
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

   public static Optional<aqc> c(cbn $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static aqc a(cbn $$0, cei $$1) {
      if ($$1 == cei.k) {
         return aqd.rX;
      } else if ($$0.ge()) {
         return aqd.sc;
      } else if ($$1 == cei.n && j($$0)) {
         return aqd.sc;
      } else if ($$1 == cei.m) {
         return aqd.rV;
      } else if ($$1 == cei.l) {
         return aqd.rY;
      } else if (e((bkj)$$0)) {
         return aqd.sa;
      } else {
         return s($$0) ? aqd.sc : aqd.rW;
      }
   }

   private static boolean j(cbn $$0) {
      blj<cbn> $$1 = $$0.dN();
      return !$$1.a(btk.z) ? false : $$1.c(btk.z).get().a($$0, 12.0);
   }

   protected static List<cbm> d(cbn $$0) {
      return $$0.dN().c(btk.an).orElse(ImmutableList.of());
   }

   private static List<cbm> e(cbm $$0) {
      return $$0.dN().c(btk.am).orElse(ImmutableList.of());
   }

   public static boolean a(bkj $$0) {
      for (ckj $$2 : $$0.bK()) {
         cke $$3 = $$2.d();
         if ($$3 instanceof cht && ((cht)$$3).d() == chv.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cbn $$0) {
      $$0.dN().b(btk.m);
      $$0.L().n();
   }

   private static bmb<bkj> g() {
      bnz.a $$0 = new bnz.a(o);
      return bmf.a($$1 -> $$1.n_() && $$0.a($$1.dL().z), btk.ak, btk.s, p);
   }

   protected static void b(cbm $$0, bkj $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ag() != bjx.W || $$1x.s() && ((cbh)$$1).gk()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cbm $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cbm $$0, bkj $$1) {
      if (buo.d($$0, $$1)) {
         $$0.dN().b(btk.E);
         $$0.dN().a(btk.aa, $$1.cv(), 600L);
         if ($$1.ag() == bjx.W && $$0.s()) {
            c($$0);
         }

         if ($$1.ag() == bjx.bt && $$0.dL().X().b(cqv.L)) {
            $$0.dN().a(btk.ab, true, 600L);
         }
      }
   }

   private static void d(cbm $$0, bkj $$1) {
      Optional<ccx> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cbm $$0, bkj $$1) {
      Optional<bkj> $$2 = f($$0);
      bkj $$3 = bmc.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bkj> f(cbm $$0) {
      return bmc.a($$0, btk.aa);
   }

   public static Optional<bkj> e(cbn $$0) {
      return $$0.dN().a(btk.z) ? $$0.dN().c(btk.z) : Optional.empty();
   }

   public static Optional<ccx> b(cbm $$0) {
      return $$0.dN().a(btk.l) ? $$0.dN().c(btk.l) : Optional.empty();
   }

   private static void c(cbn $$0, bkj $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cbn).forEach($$1x -> d((cbn)$$1x, $$1));
   }

   private static void d(cbn $$0, bkj $$1) {
      blj<cbn> $$2 = $$0.dN();
      bkj $$3 = bmc.a($$0, $$2.c(btk.z), $$1);
      $$3 = bmc.a($$0, $$2.c(btk.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cbn $$0) {
      blj<cbn> $$1 = $$0.dN();
      if (!$$1.a(btk.z)) {
         return true;
      } else {
         bkj $$2 = $$1.c(btk.z).get();
         bjx<?> $$3 = $$2.ag();
         if ($$3 == bjx.W) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(btk.aq, $$2) : false;
         }
      }
   }

   private static boolean m(cbn $$0) {
      return !n($$0);
   }

   private static boolean n(cbn $$0) {
      int $$1 = $$0.dN().c(btk.ar).orElse(0) + 1;
      int $$2 = $$0.dN().c(btk.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cbn $$0, bkj $$1) {
      $$0.dN().b(btk.aa);
      $$0.dN().b(btk.o);
      $$0.dN().b(btk.m);
      $$0.dN().a(btk.z, $$1, (long)q.a($$0.dL().z));
      c((cbm)$$0);
   }

   protected static void c(cbm $$0) {
      $$0.dN().a(btk.ag, true, (long)d.a($$0.dL().z));
   }

   private static void o(cbn $$0) {
      $$0.dN().a(btk.au, true, 200L);
   }

   private static eif p(cbn $$0) {
      eif $$1 = bvc.a($$0, 4, 2);
      return $$1 == null ? $$0.dj() : $$1;
   }

   private static boolean q(cbn $$0) {
      return $$0.dN().a(btk.au);
   }

   protected static boolean d(cbm $$0) {
      return $$0.dN().c(cei.b);
   }

   private static boolean c(bkj $$0) {
      return $$0.b(ckm.uZ);
   }

   private static void d(bkj $$0) {
      $$0.dN().a(btk.ac, true, 119L);
   }

   private static boolean r(cbn $$0) {
      return $$0.dN().a(btk.ac);
   }

   private static boolean b(ckj $$0) {
      return $$0.a(c);
   }

   private static boolean c(ckj $$0) {
      return $$0.a(ara.W);
   }

   private static boolean s(cbn $$0) {
      return $$0.dN().a(btk.av);
   }

   private static boolean e(bkj $$0) {
      return $$0.dN().a(btk.at);
   }

   private static boolean f(bkj $$0) {
      return !e($$0);
   }

   public static boolean b(bkj $$0) {
      return $$0.ag() == bjx.bt && $$0.b(cbo::a);
   }

   private static boolean t(cbn $$0) {
      return $$0.dN().a(btk.af);
   }

   private static boolean g(bkj $$0) {
      return $$0.dN().a(btk.x);
   }

   private static boolean u(cbn $$0) {
      return !$$0.eT().b();
   }

   private static boolean v(cbn $$0) {
      return $$0.eT().b() || !a($$0.eT());
   }

   public static boolean a(bjx<?> $$0) {
      return $$0 == bjx.bs || $$0 == bjx.bo;
   }
}
