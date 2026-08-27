import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ckp {
   public static final int a = 8;
   public static final int b = 4;
   public static final cuc c = cuk.qb;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bpl d = azl.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bpl o = azl.a(10, 40);
   private static final bpl p = azl.a(10, 30);
   private static final bpl q = azl.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bpl A = azl.a(5, 7);
   private static final bpl B = azl.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static btp<?> a(cko $$0, btp<cko> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cnq.a));
      $$1.b(cnq.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cko $$0, ayt $$1) {
      int $$2 = d.a($$1);
      $$0.dZ().a(cbr.ah, true, (long)$$2);
   }

   private static void a(btp<cko> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bvm(45, 90), new bvq(), bve.a(), e(), f(), cky.a(), cku.a(119), bwt.a(300, ckp::a), bww.a()));
   }

   private static void b(btp<cko> $$0) {
      $$0.a(cnq.b, 10, ImmutableList.of(bwf.a(ckp::b, 14.0F), bws.a(ckn::gz, ckp::i), bxt.a(cko::r, ckv.a()), d(), g(), b(), c(), bwi.a(bsb.bE, 4)));
   }

   private static void b(cko $$0, btp<cko> $$1) {
      $$1.a(
         cnq.k,
         10,
         ImmutableList.of(bwv.a($$1x -> !b($$0, $$1x)), bxt.a(ckp::c, bue.a(5, 0.75F)), bwl.a(1.0F), bvn.a(20), new buo(), ckt.a(), bus.a(ckp::h, cbr.o)),
         cbr.o
      );
   }

   private static void c(btp<cko> $$0) {
      $$0.a(
         cnq.l,
         10,
         ImmutableList.of(
            d(),
            bwf.a(ckp::b, 14.0F),
            bws.a(ckn::gz, ckp::i),
            bxt.a($$0x -> !$$0x.gE(), buz.a(cbr.ai, 2, 1.0F)),
            bxt.a(cko::gE, buz.a(cbr.ai, 4, 0.6F)),
            new bwd(ImmutableList.of(Pair.of(bwf.a(bsb.aB, 8.0F), 1), Pair.of(bvy.a(0.6F, 2, 1), 1), Pair.of(new buq(10, 20), 1)))
         ),
         cbr.ai
      );
   }

   private static void d(btp<cko> $$0) {
      $$0.a(cnq.m, 10, ImmutableList.of(bva.a(ckp::v, 1.0F, true, 9), ckw.a(9), ckx.a(200, 200)), cbr.ad);
   }

   private static void e(btp<cko> $$0) {
      $$0.a(cnq.n, 10, ImmutableList.of(bwk.b(cbr.z, 1.0F, 12, true), b(), c(), bus.a(ckp::l, cbr.z)), cbr.z);
   }

   private static void f(btp<cko> $$0) {
      $$0.a(
         cnq.o,
         10,
         ImmutableList.of(
            bvo.a(0.8F),
            bwf.a(ckp::b, 8.0F),
            bxt.a(bxt.a(brv::bW), bxc.a(ImmutableList.builder().addAll(a()).add(Pair.of(bxt.a((Predicate<cko>)($$0x -> true)), 1)).build())),
            bup.a(8, ckp::a)
         ),
         cbr.s
      );
   }

   private static ImmutableList<Pair<bvr<bso>, Integer>> a() {
      return ImmutableList.of(Pair.of(bwf.a(bsb.bE, 8.0F), 1), Pair.of(bwf.a(bsb.aB, 8.0F), 1), Pair.of(bwf.a(8.0F), 1));
   }

   private static bwd<bso> b() {
      return new bwd<>(ImmutableList.builder().addAll(a()).add(Pair.of(new buq(30, 60), 1)).build());
   }

   private static bwd<cko> c() {
      return new bwd<>(
         ImmutableList.of(
            Pair.of(bvy.a(0.6F), 2), Pair.of(bvd.a(bsb.aB, 8, cbr.q, 0.6F, 2), 2), Pair.of(bxt.a(ckp::f, bwn.a(0.6F, 3)), 2), Pair.of(new buq(30, 60), 1)
         )
      );
   }

   private static buh<bsw> d() {
      return bwk.a(cbr.aw, 1.0F, 8, false);
   }

   private static buh<cko> e() {
      return bul.a(cko::o_, cbr.M, cbr.z, B);
   }

   private static buh<cko> f() {
      return bul.a(ckp::h, cbr.ar, cbr.z, A);
   }

   protected static void a(cko $$0) {
      btp<cko> $$1 = $$0.dZ();
      cnq $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnq.m, cnq.k, cnq.n, cnq.l, cnq.o, cnq.b));
      cnq $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cbr.o));
      if (!$$1.a(cbr.s) && f($$0)) {
         $$0.ae();
      }

      if (!$$1.a(cbr.ai)) {
         $$1.b(cbr.aj);
      }

      $$0.x($$1.a(cbr.aj));
   }

   private static boolean f(cko $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         brv $$1 = $$0.dh();
         return $$1 instanceof cko && ((cko)$$1).o_() || $$1 instanceof cki && ((cki)$$1).o_();
      }
   }

   protected static void a(cko $$0, cig $$1) {
      k($$0);
      cuh $$2;
      if ($$1.p().a(cuk.tF)) {
         $$0.a($$1, $$1.p().G());
         $$2 = $$1.p();
         $$1.ao();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dZ().b(cbr.ae);
         c($$0, $$2);
         d((bso)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cuh.i);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cko $$0, cuh $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bpz.b));
      }

      $$0.q($$1);
   }

   private static cuh a(cig $$0) {
      cuh $$1 = $$0.p();
      cuh $$2 = $$1.a(1);
      if ($$1.d()) {
         $$0.ao();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cko $$0, boolean $$1) {
      cuh $$2 = $$0.b(bpz.b);
      $$0.a(bpz.b, cuh.i);
      if ($$0.gz()) {
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
            cuh $$6 = $$0.fg();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(cko $$0) {
      if (r($$0) && !$$0.fh().d()) {
         $$0.b($$0.fh());
         $$0.a(bpz.b, cuh.i);
      }
   }

   private static void d(cko $$0, cuh $$1) {
      cuh $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cko $$0, List<cuh> $$1) {
      Optional<cly> $$2 = $$0.dZ().c(cbr.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cko $$0, List<cuh> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cko $$0, cly $$1, List<cuh> $$2) {
      a($$0, $$2, $$1.ds());
   }

   private static void a(cko $$0, List<cuh> $$1, ewu $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bpz.b);

         for (cuh $$3 : $$1) {
            bui.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cuh> g(cko $$0) {
      eru $$1 = $$0.dU().o().be().b(ern.bi);
      List<cuh> $$2 = $$1.a(new ers.a((aqt)$$0.dU()).a(eug.a, $$0).a(euf.j));
      return $$2;
   }

   private static boolean a(bso $$0, bso $$1) {
      return $$1.ak() != bsb.ab ? false : ayt.a($$0.dU().Z()).i() < 0.1F;
   }

   protected static boolean a(cko $$0, cuh $$1) {
      if ($$0.o_() && $$1.a(awm.V)) {
         return false;
      } else if ($$1.a(awm.T)) {
         return false;
      } else if (t($$0) && $$0.dZ().a(cbr.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(cuk.tF)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cuh $$0) {
      return $$0.a(awm.U);
   }

   private static boolean a(cko $$0, brv $$1) {
      return !($$1 instanceof bsq $$2) ? false : !$$2.o_() || !$$2.bI() || g((bso)$$0) || g($$2) || $$2 instanceof cko && $$2.dh() == null;
   }

   private static boolean b(cko $$0, bso $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cko $$0) {
      btp<cko> $$1 = $$0.dZ();
      if ($$1.a(cbr.ar)) {
         bso $$2 = $$1.c(cbr.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bso> i(cko $$0) {
      btp<cko> $$1 = $$0.dZ();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bso> $$2 = bui.a($$0, cbr.ab);
         if ($$2.isPresent() && ccx.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(cbr.ac)) {
               Optional<cly> $$3 = $$1.c(cbr.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bsq> $$4 = $$1.c(cbr.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cly> $$5 = $$1.c(cbr.am);
               return $$5.isPresent() && ccx.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cly $$0, boolean $$1) {
      List<cko> $$2 = $$0.dU().a(cko.class, $$0.cP().g(16.0));
      $$2.stream().filter(ckp::d).filter($$2x -> !$$1 || bui.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dU().ab().b(dbw.P)) {
            d((ckn)$$1x, $$0);
         } else {
            c((ckn)$$1x, $$0);
         }
      });
   }

   public static bqa a(cko $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cuh $$4 = $$3.a(1);
         c($$0, $$4);
         d((bso)$$0);
         k($$0);
         return bqa.b;
      } else {
         return bqa.d;
      }
   }

   protected static boolean b(cko $$0, cuh $$1) {
      return !t($$0) && !r($$0) && $$0.gz() && b($$1);
   }

   protected static void a(cko $$0, bso $$1) {
      if (!($$1 instanceof cko)) {
         if (u($$0)) {
            a($$0, false);
         }

         btp<cko> $$2 = $$0.dZ();
         $$2.b(cbr.ai);
         $$2.b(cbr.aj);
         $$2.b(cbr.ad);
         if ($$1 instanceof cly) {
            $$2.a(cbr.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ak() != $$1.ak()) {
               $$2.b(cbr.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(cbr.z, $$1, 100L);
            if (ccx.d($$0, $$1)) {
               b((ckn)$$0, $$1);
            }
         } else if ($$1.ak() == bsb.ab && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((ckn)$$0, $$1);
         }
      }
   }

   protected static void a(ckn $$0, bso $$1) {
      if (!$$0.dZ().c(cnq.n)) {
         if (ccx.d($$0, $$1)) {
            if (!bui.a($$0, $$1, 4.0)) {
               if ($$1.ak() == bsb.bE && $$0.dU().ab().b(dbw.P)) {
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

   public static Optional<avn> c(cko $$0) {
      return $$0.dZ().g().map($$1 -> a($$0, $$1));
   }

   private static avn a(cko $$0, cnq $$1) {
      if ($$1 == cnq.k) {
         return avo.uc;
      } else if ($$0.gy()) {
         return avo.uh;
      } else if ($$1 == cnq.n && j($$0)) {
         return avo.uh;
      } else if ($$1 == cnq.m) {
         return avo.ua;
      } else if ($$1 == cnq.l) {
         return avo.ud;
      } else if (e((bso)$$0)) {
         return avo.uf;
      } else {
         return s($$0) ? avo.uh : avo.ub;
      }
   }

   private static boolean j(cko $$0) {
      btp<cko> $$1 = $$0.dZ();
      return !$$1.a(cbr.z) ? false : $$1.c(cbr.z).get().a($$0, 12.0);
   }

   protected static List<ckn> d(cko $$0) {
      return $$0.dZ().c(cbr.ao).orElse(ImmutableList.of());
   }

   private static List<ckn> e(ckn $$0) {
      return $$0.dZ().c(cbr.an).orElse(ImmutableList.of());
   }

   public static boolean a(bso $$0) {
      for (cuh $$2 : $$0.fk()) {
         cuc $$3 = $$2.f();
         if ($$3 instanceof crt && ((crt)$$3).h().a(crv.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(cko $$0) {
      $$0.dZ().b(cbr.m);
      $$0.J().n();
   }

   private static buh<bso> g() {
      bwg.a $$0 = new bwg.a(o);
      return bul.a($$1 -> $$1.o_() && $$0.a($$1.dU().A), cbr.al, cbr.s, p);
   }

   protected static void b(ckn $$0, bso $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ak() != bsb.ab || $$1x.r() && ((cki)$$1).gE()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(ckn $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(ckn $$0, bso $$1) {
      if (ccx.d($$0, $$1)) {
         $$0.dZ().b(cbr.E);
         $$0.dZ().a(cbr.ab, $$1.cE(), 600L);
         if ($$1.ak() == bsb.ab && $$0.r()) {
            c($$0);
         }

         if ($$1.ak() == bsb.bE && $$0.dU().ab().b(dbw.P)) {
            $$0.dZ().a(cbr.ac, true, 600L);
         }
      }
   }

   private static void d(ckn $$0, bso $$1) {
      Optional<cly> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(ckn $$0, bso $$1) {
      Optional<bso> $$2 = f($$0);
      bso $$3 = bui.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bso> f(ckn $$0) {
      return bui.a($$0, cbr.ab);
   }

   public static Optional<bso> e(cko $$0) {
      return $$0.dZ().a(cbr.z) ? $$0.dZ().c(cbr.z) : Optional.empty();
   }

   public static Optional<cly> b(ckn $$0) {
      return $$0.dZ().a(cbr.l) ? $$0.dZ().c(cbr.l) : Optional.empty();
   }

   private static void c(cko $$0, bso $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cko).forEach($$1x -> d((cko)$$1x, $$1));
   }

   private static void d(cko $$0, bso $$1) {
      btp<cko> $$2 = $$0.dZ();
      bso $$3 = bui.a($$0, $$2.c(cbr.z), $$1);
      $$3 = bui.a($$0, $$2.c(cbr.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cko $$0) {
      btp<cko> $$1 = $$0.dZ();
      if (!$$1.a(cbr.z)) {
         return true;
      } else {
         bso $$2 = $$1.c(cbr.z).get();
         bsb<?> $$3 = $$2.ak();
         if ($$3 == bsb.ab) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(cbr.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cko $$0) {
      return !n($$0);
   }

   private static boolean n(cko $$0) {
      int $$1 = $$0.dZ().c(cbr.as).orElse(0) + 1;
      int $$2 = $$0.dZ().c(cbr.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cko $$0, bso $$1) {
      $$0.dZ().b(cbr.ab);
      $$0.dZ().b(cbr.o);
      $$0.dZ().b(cbr.m);
      $$0.dZ().a(cbr.z, $$1, (long)q.a($$0.dU().A));
      c((ckn)$$0);
   }

   protected static void c(ckn $$0) {
      $$0.dZ().a(cbr.ah, true, (long)d.a($$0.dU().A));
   }

   private static void o(cko $$0) {
      $$0.dZ().a(cbr.av, true, 200L);
   }

   private static ewu p(cko $$0) {
      ewu $$1 = cdl.a($$0, 4, 2);
      return $$1 == null ? $$0.ds() : $$1;
   }

   private static boolean q(cko $$0) {
      return $$0.dZ().a(cbr.av);
   }

   protected static boolean d(ckn $$0) {
      return $$0.dZ().c(cnq.b);
   }

   private static boolean c(bso $$0) {
      return $$0.b(cuk.xE);
   }

   private static void d(bso $$0) {
      $$0.dZ().a(cbr.ad, true, 119L);
   }

   private static boolean r(cko $$0) {
      return $$0.dZ().a(cbr.ad);
   }

   private static boolean b(cuh $$0) {
      return $$0.a(c);
   }

   private static boolean c(cuh $$0) {
      return $$0.a(awm.Y);
   }

   private static boolean s(cko $$0) {
      return $$0.dZ().a(cbr.aw);
   }

   private static boolean e(bso $$0) {
      return $$0.dZ().a(cbr.au);
   }

   private static boolean f(bso $$0) {
      return !e($$0);
   }

   public static boolean b(bso $$0) {
      return $$0.ak() == bsb.bE && $$0.b(ckp::a);
   }

   private static boolean t(cko $$0) {
      return $$0.dZ().a(cbr.ag);
   }

   private static boolean g(bso $$0) {
      return $$0.dZ().a(cbr.x);
   }

   private static boolean u(cko $$0) {
      return !$$0.fh().d();
   }

   private static boolean v(cko $$0) {
      return $$0.fh().d() || !a($$0.fh());
   }

   public static boolean a(bsb<?> $$0) {
      return $$0 == bsb.bC || $$0 == bsb.bx;
   }
}
