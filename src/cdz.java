import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cdz {
   public static final int a = 8;
   public static final int b = 4;
   public static final cmt c = cnb.oF;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bjm d = avp.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bjm o = avp.a(10, 40);
   private static final bjm p = avp.a(10, 30);
   private static final bjm q = avp.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bjm A = avp.a(5, 7);
   private static final bjm B = avp.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bnl<?> a(cdy $$0, bnl<cdy> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cgu.a));
      $$1.b(cgu.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cdy $$0, auv $$1) {
      int $$2 = d.a($$1);
      $$0.dO().a(bvn.ag, true, (long)$$2);
   }

   private static void a(bnl<cdy> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bpi(45, 90), new bpm(), bpa.a(), e(), f(), cei.a(), cee.a(119), bqp.a(300, cdz::a), bqs.a()));
   }

   private static void b(bnl<cdy> $$0) {
      $$0.a(cgu.b, 10, ImmutableList.of(bqb.a(cdz::b, 14.0F), bqo.a(cdx::gf, cdz::i), brp.a(cdy::u, cef.a()), d(), g(), b(), c(), bqe.a(blz.bv, 4)));
   }

   private static void b(cdy $$0, bnl<cdy> $$1) {
      $$1.a(
         cgu.k,
         10,
         ImmutableList.of(bqr.a($$1x -> !b($$0, $$1x)), brp.a(cdz::c, boa.a(5, 0.75F)), bqh.a(1.0F), bpj.a(20), new bok(), ced.a(), boo.a(cdz::h, bvn.o)),
         bvn.o
      );
   }

   private static void c(bnl<cdy> $$0) {
      $$0.a(
         cgu.l,
         10,
         ImmutableList.of(
            d(),
            bqb.a(cdz::b, 14.0F),
            bqo.a(cdx::gf, cdz::i),
            brp.a($$0x -> !$$0x.gm(), bov.a(bvn.ah, 2, 1.0F)),
            brp.a(cdy::gm, bov.a(bvn.ah, 4, 0.6F)),
            new bpz(ImmutableList.of(Pair.of(bqb.a(blz.ax, 8.0F), 1), Pair.of(bpu.a(0.6F, 2, 1), 1), Pair.of(new bom(10, 20), 1)))
         ),
         bvn.ah
      );
   }

   private static void d(bnl<cdy> $$0) {
      $$0.a(cgu.m, 10, ImmutableList.of(bow.a(cdz::v, 1.0F, true, 9), ceg.a(9), ceh.a(200, 200)), bvn.ac);
   }

   private static void e(bnl<cdy> $$0) {
      $$0.a(cgu.n, 10, ImmutableList.of(bqg.b(bvn.z, 1.0F, 12, true), b(), c(), boo.a(cdz::l, bvn.z)), bvn.z);
   }

   private static void f(bnl<cdy> $$0) {
      $$0.a(
         cgu.o,
         10,
         ImmutableList.of(
            bpk.a(0.8F),
            bqb.a(cdz::b, 8.0F),
            brp.a(brp.a(blv::bO), bqy.a(ImmutableList.builder().addAll(a()).add(Pair.of(brp.a((Predicate<cdy>)($$0x -> true)), 1)).build())),
            bol.a(8, cdz::a)
         ),
         bvn.s
      );
   }

   private static ImmutableList<Pair<bpn<bml>, Integer>> a() {
      return ImmutableList.of(Pair.of(bqb.a(blz.bv, 8.0F), 1), Pair.of(bqb.a(blz.ax, 8.0F), 1), Pair.of(bqb.a(8.0F), 1));
   }

   private static bpz<bml> b() {
      return new bpz<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bom(30, 60), 1)).build());
   }

   private static bpz<cdy> c() {
      return new bpz<>(
         ImmutableList.of(
            Pair.of(bpu.a(0.6F), 2), Pair.of(boz.a(blz.ax, 8, bvn.q, 0.6F, 2), 2), Pair.of(brp.a(cdz::f, bqj.a(0.6F, 3)), 2), Pair.of(new bom(30, 60), 1)
         )
      );
   }

   private static bod<bmu> d() {
      return bqg.a(bvn.av, 1.0F, 8, false);
   }

   private static bod<cdy> e() {
      return boh.a(cdy::o_, bvn.L, bvn.z, B);
   }

   private static bod<cdy> f() {
      return boh.a(cdz::h, bvn.aq, bvn.z, A);
   }

   protected static void a(cdy $$0) {
      bnl<cdy> $$1 = $$0.dO();
      cgu $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgu.m, cgu.k, cgu.n, cgu.l, cgu.o, cgu.b));
      cgu $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bvn.o));
      if (!$$1.a(bvn.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(bvn.ah)) {
         $$1.b(bvn.ai);
      }

      $$0.x($$1.a(bvn.ai));
   }

   private static boolean f(cdy $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         blv $$1 = $$0.cZ();
         return $$1 instanceof cdy && ((cdy)$$1).o_() || $$1 instanceof cds && ((cds)$$1).o_();
      }
   }

   protected static void a(cdy $$0, cbu $$1) {
      k($$0);
      cmy $$2;
      if ($$1.q().a(cnb.sf)) {
         $$0.a($$1, $$1.q().L());
         $$2 = $$1.q();
         $$1.am();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dO().b(bvn.ad);
         c($$0, $$2);
         d((bml)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cmy.f);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cdy $$0, cmy $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bka.b));
      }

      $$0.o($$1);
   }

   private static cmy a(cbu $$0) {
      cmy $$1 = $$0.q();
      cmy $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.am();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cdy $$0, boolean $$1) {
      cmy $$2 = $$0.b(bka.b);
      $$0.a(bka.b, cmy.f);
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
            cmy $$6 = $$0.eT();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cdy $$0) {
      if (r($$0) && !$$0.eU().b()) {
         $$0.b($$0.eU());
         $$0.a(bka.b, cmy.f);
      }
   }

   private static void d(cdy $$0, cmy $$1) {
      cmy $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cdy $$0, List<cmy> $$1) {
      Optional<cfi> $$2 = $$0.dO().c(bvn.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cdy $$0, List<cmy> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cdy $$0, cfi $$1, List<cmy> $$2) {
      a($$0, $$2, $$1.dk());
   }

   private static void a(cdy $$0, List<cmy> $$1, elt $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bka.b);

         for (cmy $$3 : $$1) {
            boe.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cmy> g(cdy $$0) {
      ehe $$1 = $$0.dM().o().aJ().getLootTable(egu.aL);
      List<cmy> $$2 = $$1.a(new ehc.a((and)$$0.dM()).a(ejh.a, $$0).a(ejg.j));
      return $$2;
   }

   private static boolean a(bml $$0, bml $$1) {
      return $$1.ai() != blz.X ? false : auv.a($$0.dM().X()).i() < 0.1F;
   }

   protected static boolean a(cdy $$0, cmy $$1) {
      if ($$0.o_() && $$1.a(asp.V)) {
         return false;
      } else if ($$1.a(asp.T)) {
         return false;
      } else if (t($$0) && $$0.dO().a(bvn.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cnb.sf)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cmy $$0) {
      return $$0.a(asp.U);
   }

   private static boolean a(cdy $$0, blv $$1) {
      return !($$1 instanceof bmn $$2) ? false : !$$2.o_() || !$$2.bx() || g((bml)$$0) || g($$2) || $$2 instanceof cdy && $$2.cZ() == null;
   }

   private static boolean b(cdy $$0, bml $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cdy $$0) {
      bnl<cdy> $$1 = $$0.dO();
      if ($$1.a(bvn.aq)) {
         bml $$2 = $$1.c(bvn.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bml> i(cdy $$0) {
      bnl<cdy> $$1 = $$0.dO();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bml> $$2 = boe.a($$0, bvn.aa);
         if ($$2.isPresent() && bws.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bvn.ab)) {
               Optional<cfi> $$3 = $$1.c(bvn.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bmn> $$4 = $$1.c(bvn.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cfi> $$5 = $$1.c(bvn.al);
               return $$5.isPresent() && bws.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cfi $$0, boolean $$1) {
      List<cdy> $$2 = $$0.dM().a(cdy.class, $$0.cH().g(16.0));
      $$2.stream().filter(cdz::d).filter($$2x -> !$$1 || boe.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dM().Z().b(ctl.O)) {
            d((cdx)$$1x, $$0);
         } else {
            c((cdx)$$1x, $$0);
         }
      });
   }

   public static bkb a(cdy $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cmy $$4 = $$3.a(1);
         c($$0, $$4);
         d((bml)$$0);
         k($$0);
         return bkb.b;
      } else {
         return bkb.d;
      }
   }

   protected static boolean b(cdy $$0, cmy $$1) {
      return !t($$0) && !r($$0) && $$0.gf() && b($$1);
   }

   protected static void a(cdy $$0, bml $$1) {
      if (!($$1 instanceof cdy)) {
         if (u($$0)) {
            a($$0, false);
         }

         bnl<cdy> $$2 = $$0.dO();
         $$2.b(bvn.ah);
         $$2.b(bvn.ai);
         $$2.b(bvn.ac);
         if ($$1 instanceof cfi) {
            $$2.a(bvn.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ai() != $$1.ai()) {
               $$2.b(bvn.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(bvn.z, $$1, 100L);
            if (bws.d($$0, $$1)) {
               b((cdx)$$0, $$1);
            }
         } else if ($$1.ai() == blz.X && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cdx)$$0, $$1);
         }
      }
   }

   protected static void a(cdx $$0, bml $$1) {
      if (!$$0.dO().c(cgu.n)) {
         if (bws.d($$0, $$1)) {
            if (!boe.a($$0, $$1, 4.0)) {
               if ($$1.ai() == blz.bv && $$0.dM().Z().b(ctl.O)) {
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

   public static Optional<arr> c(cdy $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static arr a(cdy $$0, cgu $$1) {
      if ($$1 == cgu.k) {
         return ars.sK;
      } else if ($$0.ge()) {
         return ars.sP;
      } else if ($$1 == cgu.n && j($$0)) {
         return ars.sP;
      } else if ($$1 == cgu.m) {
         return ars.sI;
      } else if ($$1 == cgu.l) {
         return ars.sL;
      } else if (e((bml)$$0)) {
         return ars.sN;
      } else {
         return s($$0) ? ars.sP : ars.sJ;
      }
   }

   private static boolean j(cdy $$0) {
      bnl<cdy> $$1 = $$0.dO();
      return !$$1.a(bvn.z) ? false : $$1.c(bvn.z).get().a($$0, 12.0);
   }

   protected static List<cdx> d(cdy $$0) {
      return $$0.dO().c(bvn.an).orElse(ImmutableList.of());
   }

   private static List<cdx> e(cdx $$0) {
      return $$0.dO().c(bvn.am).orElse(ImmutableList.of());
   }

   public static boolean a(bml $$0) {
      for (cmy $$2 : $$0.bL()) {
         cmt $$3 = $$2.d();
         if ($$3 instanceof cki && ((cki)$$3).d() == ckk.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cdy $$0) {
      $$0.dO().b(bvn.m);
      $$0.N().n();
   }

   private static bod<bml> g() {
      bqc.a $$0 = new bqc.a(o);
      return boh.a($$1 -> $$1.o_() && $$0.a($$1.dM().z), bvn.ak, bvn.s, p);
   }

   protected static void b(cdx $$0, bml $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ai() != blz.X || $$1x.u() && ((cds)$$1).gk()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cdx $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cdx $$0, bml $$1) {
      if (bws.d($$0, $$1)) {
         $$0.dO().b(bvn.E);
         $$0.dO().a(bvn.aa, $$1.cw(), 600L);
         if ($$1.ai() == blz.X && $$0.u()) {
            c($$0);
         }

         if ($$1.ai() == blz.bv && $$0.dM().Z().b(ctl.O)) {
            $$0.dO().a(bvn.ab, true, 600L);
         }
      }
   }

   private static void d(cdx $$0, bml $$1) {
      Optional<cfi> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cdx $$0, bml $$1) {
      Optional<bml> $$2 = f($$0);
      bml $$3 = boe.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bml> f(cdx $$0) {
      return boe.a($$0, bvn.aa);
   }

   public static Optional<bml> e(cdy $$0) {
      return $$0.dO().a(bvn.z) ? $$0.dO().c(bvn.z) : Optional.empty();
   }

   public static Optional<cfi> b(cdx $$0) {
      return $$0.dO().a(bvn.l) ? $$0.dO().c(bvn.l) : Optional.empty();
   }

   private static void c(cdy $$0, bml $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cdy).forEach($$1x -> d((cdy)$$1x, $$1));
   }

   private static void d(cdy $$0, bml $$1) {
      bnl<cdy> $$2 = $$0.dO();
      bml $$3 = boe.a($$0, $$2.c(bvn.z), $$1);
      $$3 = boe.a($$0, $$2.c(bvn.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cdy $$0) {
      bnl<cdy> $$1 = $$0.dO();
      if (!$$1.a(bvn.z)) {
         return true;
      } else {
         bml $$2 = $$1.c(bvn.z).get();
         blz<?> $$3 = $$2.ai();
         if ($$3 == blz.X) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bvn.aq, $$2) : false;
         }
      }
   }

   private static boolean m(cdy $$0) {
      return !n($$0);
   }

   private static boolean n(cdy $$0) {
      int $$1 = $$0.dO().c(bvn.ar).orElse(0) + 1;
      int $$2 = $$0.dO().c(bvn.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cdy $$0, bml $$1) {
      $$0.dO().b(bvn.aa);
      $$0.dO().b(bvn.o);
      $$0.dO().b(bvn.m);
      $$0.dO().a(bvn.z, $$1, (long)q.a($$0.dM().z));
      c((cdx)$$0);
   }

   protected static void c(cdx $$0) {
      $$0.dO().a(bvn.ag, true, (long)d.a($$0.dM().z));
   }

   private static void o(cdy $$0) {
      $$0.dO().a(bvn.au, true, 200L);
   }

   private static elt p(cdy $$0) {
      elt $$1 = bxg.a($$0, 4, 2);
      return $$1 == null ? $$0.dk() : $$1;
   }

   private static boolean q(cdy $$0) {
      return $$0.dO().a(bvn.au);
   }

   protected static boolean d(cdx $$0) {
      return $$0.dO().c(cgu.b);
   }

   private static boolean c(bml $$0) {
      return $$0.b(cnb.vM);
   }

   private static void d(bml $$0) {
      $$0.dO().a(bvn.ac, true, 119L);
   }

   private static boolean r(cdy $$0) {
      return $$0.dO().a(bvn.ac);
   }

   private static boolean b(cmy $$0) {
      return $$0.a(c);
   }

   private static boolean c(cmy $$0) {
      return $$0.a(asp.W);
   }

   private static boolean s(cdy $$0) {
      return $$0.dO().a(bvn.av);
   }

   private static boolean e(bml $$0) {
      return $$0.dO().a(bvn.at);
   }

   private static boolean f(bml $$0) {
      return !e($$0);
   }

   public static boolean b(bml $$0) {
      return $$0.ai() == blz.bv && $$0.b(cdz::a);
   }

   private static boolean t(cdy $$0) {
      return $$0.dO().a(bvn.af);
   }

   private static boolean g(bml $$0) {
      return $$0.dO().a(bvn.x);
   }

   private static boolean u(cdy $$0) {
      return !$$0.eU().b();
   }

   private static boolean v(cdy $$0) {
      return $$0.eU().b() || !a($$0.eU());
   }

   public static boolean a(blz<?> $$0) {
      return $$0 == blz.bu || $$0 == blz.bq;
   }
}
