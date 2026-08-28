import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cnj {
   public static final int a = 8;
   public static final int b = 4;
   public static final cwi c = cwq.oK;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final brv d = bao.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final brv o = bao.a(10, 40);
   private static final brv p = bao.a(10, 30);
   private static final brv q = bao.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final brv A = bao.a(5, 7);
   private static final brv B = bao.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bwj<?> a(cni $$0, bwj<cni> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cql.a));
      $$1.b(cql.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cni $$0, azu $$1) {
      int $$2 = d.a($$1);
      $$0.eb().a(cel.ah, true, (long)$$2);
   }

   private static void a(bwj<cni> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new byg(45, 90), new byk(), bxy.a(), e(), f(), cns.a(), cno.a(119), bzn.a(300, cnj::a), bzq.a()));
   }

   private static void b(bwj<cni> $$0) {
      $$0.a(
         cql.b,
         10,
         ImmutableList.of(byz.a(cnj::b, 14.0F), bzm.a(($$0x, $$1) -> $$1.gn(), cnj::b), can.a(cni::n, cnp.a()), d(), g(), b(), c(), bzc.a(bus.bO, 4))
      );
   }

   private static void b(cni $$0, bwj<cni> $$1) {
      $$1.a(
         cql.k,
         10,
         ImmutableList.of(
            bzp.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), can.a(cnj::c, bwy.a(5, 0.75F)), bzf.a(1.0F), byh.a(20), new bxi(), cnn.a(), bxm.a(cnj::g, cel.o)
         ),
         cel.o
      );
   }

   private static void c(bwj<cni> $$0) {
      $$0.a(
         cql.l,
         10,
         ImmutableList.of(
            d(),
            byz.a(cnj::b, 14.0F),
            bzm.a(($$0x, $$1) -> $$1.gn(), cnj::b),
            can.a($$0x -> !$$0x.gu(), bxt.a(cel.ai, 2, 1.0F)),
            can.a(cni::gu, bxt.a(cel.ai, 4, 0.6F)),
            new byx(ImmutableList.of(Pair.of(byz.a(bus.aO, 8.0F), 1), Pair.of(bys.a(0.6F, 2, 1), 1), Pair.of(new bxk(10, 20), 1)))
         ),
         cel.ai
      );
   }

   private static void d(bwj<cni> $$0) {
      $$0.a(cql.m, 10, ImmutableList.of(bxu.a(cnj::t, 1.0F, true, 9), cnq.a(9), cnr.a(200, 200)), cel.ad);
   }

   private static void e(bwj<cni> $$0) {
      $$0.a(cql.n, 10, ImmutableList.of(bze.b(cel.z, 1.0F, 12, true), b(), c(), bxm.a(cnj::j, cel.z)), cel.z);
   }

   private static void f(bwj<cni> $$0) {
      $$0.a(
         cql.o,
         10,
         ImmutableList.of(
            byi.a(0.8F),
            byz.a(cnj::b, 8.0F),
            can.a(can.a(bul::bZ), bzw.a(ImmutableList.builder().addAll(a()).add(Pair.of(can.a((Predicate<cni>)($$0x -> true)), 1)).build())),
            bxj.a(8, cnj::a)
         ),
         cel.s
      );
   }

   private static ImmutableList<Pair<byl<bvh>, Integer>> a() {
      return ImmutableList.of(Pair.of(byz.a(bus.bO, 8.0F), 1), Pair.of(byz.a(bus.aO, 8.0F), 1), Pair.of(byz.a(8.0F), 1));
   }

   private static byx<bvh> b() {
      return new byx<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bxk(30, 60), 1)).build());
   }

   private static byx<cni> c() {
      return new byx<>(
         ImmutableList.of(
            Pair.of(bys.a(0.6F), 2), Pair.of(bxx.a(bus.aO, 8, cel.q, 0.6F, 2), 2), Pair.of(can.a(cnj::f, bzh.a(0.6F, 3)), 2), Pair.of(new bxk(30, 60), 1)
         )
      );
   }

   private static bxb<bvp> d() {
      return bze.a(cel.aw, 1.0F, 8, false);
   }

   private static bxb<cni> e() {
      return bxf.a(cni::e_, cel.M, cel.z, B);
   }

   private static bxb<cni> f() {
      return bxf.a(cnj::g, cel.ar, cel.z, A);
   }

   protected static void a(cni $$0) {
      bwj<cni> $$1 = $$0.eb();
      cql $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cql.m, cql.k, cql.n, cql.l, cql.o, cql.b));
      cql $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cel.o));
      if (!$$1.a(cel.s) && e($$0)) {
         $$0.ae();
      }

      if (!$$1.a(cel.ai)) {
         $$1.b(cel.aj);
      }

      $$0.y($$1.a(cel.aj));
   }

   private static boolean e(cni $$0) {
      if (!$$0.e_()) {
         return false;
      } else {
         bul $$1 = $$0.dk();
         return $$1 instanceof cni && ((cni)$$1).e_() || $$1 instanceof cnc && ((cnc)$$1).e_();
      }
   }

   protected static void a(arp $$0, cni $$1, clc $$2) {
      i($$1);
      cwm $$3;
      if ($$2.j().a(cwq.sz)) {
         $$1.a($$2, $$2.j().L());
         $$3 = $$2.j();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.eb().b(cel.ae);
         a($$0, $$1, $$3);
         d((bvh)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cwm.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(arp $$0, cni $$1, cwm $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bsj.b));
      }

      $$1.l($$2);
   }

   private static cwm a(clc $$0) {
      cwm $$1 = $$0.j();
      cwm $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(arp $$0, cni $$1, boolean $$2) {
      cwm $$3 = $$1.b(bsj.b);
      $$1.a(bsj.b, cwm.k);
      if ($$1.gn()) {
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
            cwm $$7 = $$1.eX();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(arp $$0, cni $$1) {
      if (p($$1) && !$$1.eY().f()) {
         $$1.a($$0, $$1.eY());
         $$1.a(bsj.b, cwm.k);
      }
   }

   private static void c(cni $$0, cwm $$1) {
      cwm $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cni $$0, List<cwm> $$1) {
      Optional<cou> $$2 = $$0.eb().c(cel.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cni $$0, List<cwm> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cni $$0, cou $$1, List<cwm> $$2) {
      a($$0, $$2, $$1.dt());
   }

   private static void a(cni $$0, List<cwm> $$1, ezy $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bsj.b);

         for (cwm $$3 : $$1) {
            bxc.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cwm> f(cni $$0) {
      eus $$1 = $$0.dV().p().bc().b(euj.aK);
      List<cwm> $$2 = $$1.a(new euq.a((arp)$$0.dV()).a(exj.a, $$0).a(exi.k));
      return $$2;
   }

   private static boolean a(bvh $$0, bvh $$1) {
      return $$1.aq() != bus.ai ? false : azu.a($$0.dV().ab()).i() < 0.1F;
   }

   protected static boolean a(cni $$0, cwm $$1) {
      if ($$0.e_() && $$1.a(axl.V)) {
         return false;
      } else if ($$1.a(axl.T)) {
         return false;
      } else if (r($$0) && $$0.eb().a(cel.o)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(cwq.sz)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cwm $$0) {
      return $$0.a(axl.U);
   }

   private static boolean a(cni $$0, bul $$1) {
      return !($$1 instanceof bvj $$2) ? false : !$$2.e_() || !$$2.bL() || g((bvh)$$0) || g($$2) || $$2 instanceof cni && $$2.dk() == null;
   }

   private static boolean b(arp $$0, cni $$1, bvh $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cni $$0) {
      bwj<cni> $$1 = $$0.eb();
      if ($$1.a(cel.ar)) {
         bvh $$2 = $$1.c(cel.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bvh> b(arp $$0, cni $$1) {
      bwj<cni> $$2 = $$1.eb();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bvh> $$3 = bxc.a($$1, cel.ab);
         if ($$3.isPresent() && cfr.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cel.ac)) {
               Optional<cou> $$4 = $$2.c(cel.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bvj> $$5 = $$2.c(cel.M);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cou> $$6 = $$2.c(cel.am);
               return $$6.isPresent() && cfr.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(arp $$0, cou $$1, boolean $$2) {
      List<cni> $$3 = $$1.dV().a(cni.class, $$1.cR().g(16.0));
      $$3.stream().filter(cnj::c).filter($$2x -> !$$2 || bxc.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.N().b(dfi.O)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bsk a(arp $$0, cni $$1, cou $$2, bsj $$3) {
      cwm $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cwm $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bvh)$$1);
         i($$1);
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   protected static boolean b(cni $$0, cwm $$1) {
      return !r($$0) && !p($$0) && $$0.gn() && b($$1);
   }

   protected static void a(arp $$0, cni $$1, bvh $$2) {
      if (!($$2 instanceof cni)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bwj<cni> $$3 = $$1.eb();
         $$3.b(cel.ai);
         $$3.b(cel.aj);
         $$3.b(cel.ad);
         if ($$2 instanceof cou) {
            $$3.a(cel.ag, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cel.z);
            }
         });
         if ($$1.e_()) {
            $$3.a(cel.z, $$2, 100L);
            if (cfr.d($$0, $$1, $$2)) {
               b($$0, (cnh)$$1, $$2);
            }
         } else if ($$2.aq() == bus.ai && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cnh)$$1, $$2);
         }
      }
   }

   protected static void a(arp $$0, cnh $$1, bvh $$2) {
      if (!$$1.eb().c(cql.n)) {
         if (cfr.d($$0, $$1, $$2)) {
            if (!bxc.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bus.bO && $$0.N().b(dfi.O)) {
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

   public static Optional<awm> b(cni $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cni $$0, cql $$1) {
      if ($$1 == cql.k) {
         return awn.tG;
      } else if ($$0.gm()) {
         return awn.tL;
      } else if ($$1 == cql.n && h($$0)) {
         return awn.tL;
      } else if ($$1 == cql.m) {
         return awn.tE;
      } else if ($$1 == cql.l) {
         return awn.tH;
      } else if (e((bvh)$$0)) {
         return awn.tJ;
      } else {
         return q($$0) ? awn.tL : awn.tF;
      }
   }

   private static boolean h(cni $$0) {
      bwj<cni> $$1 = $$0.eb();
      return !$$1.a(cel.z) ? false : $$1.c(cel.z).get().a($$0, 12.0);
   }

   protected static List<cnh> c(cni $$0) {
      return $$0.eb().c(cel.ao).orElse(ImmutableList.of());
   }

   private static List<cnh> d(cnh $$0) {
      return $$0.eb().c(cel.an).orElse(ImmutableList.of());
   }

   public static boolean a(bvh $$0) {
      for (cwm $$1 : $$0.fb()) {
         if ($$1.a(axl.W)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cni $$0) {
      $$0.eb().b(cel.m);
      $$0.L().o();
   }

   private static bxb<bvh> g() {
      bza.a $$0 = new bza.a(o);
      return bxf.a($$1 -> $$1.e_() && $$0.a($$1.dV().A), cel.al, cel.s, p);
   }

   protected static void b(arp $$0, cnh $$1, bvh $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bus.ai || $$2x.n() && ((cnc)$$2).gn()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(arp $$0, cnh $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(arp $$0, cnh $$1, bvh $$2) {
      if (cfr.d($$0, $$1, $$2)) {
         $$1.eb().b(cel.E);
         $$1.eb().a(cel.ab, $$2.cG(), 600L);
         if ($$2.aq() == bus.ai && $$1.n()) {
            b($$1);
         }

         if ($$2.aq() == bus.bO && $$0.N().b(dfi.O)) {
            $$1.eb().a(cel.ac, true, 600L);
         }
      }
   }

   private static void d(arp $$0, cnh $$1, bvh $$2) {
      Optional<cou> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(arp $$0, cnh $$1, bvh $$2) {
      Optional<bvh> $$3 = e($$1);
      bvh $$4 = bxc.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bvh> e(cnh $$0) {
      return bxc.a($$0, cel.ab);
   }

   public static Optional<bvh> d(cni $$0) {
      return $$0.eb().a(cel.z) ? $$0.eb().c(cel.z) : Optional.empty();
   }

   public static Optional<cou> a(cnh $$0) {
      return $$0.eb().a(cel.l) ? $$0.eb().c(cel.l) : Optional.empty();
   }

   private static void a(cni $$0, bvh $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cni).forEach($$1x -> b((cni)$$1x, $$1));
   }

   private static void b(cni $$0, bvh $$1) {
      bwj<cni> $$2 = $$0.eb();
      bvh $$3 = bxc.a($$0, $$2.c(cel.z), $$1);
      $$3 = bxc.a($$0, $$2.c(cel.o), $$3);
      c($$0, $$3);
   }

   private static boolean j(cni $$0) {
      bwj<cni> $$1 = $$0.eb();
      if (!$$1.a(cel.z)) {
         return true;
      } else {
         bvh $$2 = $$1.c(cel.z).get();
         bus<?> $$3 = $$2.aq();
         if ($$3 == bus.ai) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cel.ar, $$2) : false;
         }
      }
   }

   private static boolean k(cni $$0) {
      return !l($$0);
   }

   private static boolean l(cni $$0) {
      int $$1 = $$0.eb().c(cel.as).orElse(0) + 1;
      int $$2 = $$0.eb().c(cel.at).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cni $$0, bvh $$1) {
      $$0.eb().b(cel.ab);
      $$0.eb().b(cel.o);
      $$0.eb().b(cel.m);
      $$0.eb().a(cel.z, $$1, (long)q.a($$0.dV().A));
      b((cnh)$$0);
   }

   protected static void b(cnh $$0) {
      $$0.eb().a(cel.ah, true, (long)d.a($$0.dV().A));
   }

   private static void m(cni $$0) {
      $$0.eb().a(cel.av, true, 200L);
   }

   private static ezy n(cni $$0) {
      ezy $$1 = cgf.a($$0, 4, 2);
      return $$1 == null ? $$0.dt() : $$1;
   }

   private static boolean o(cni $$0) {
      return $$0.eb().a(cel.av);
   }

   protected static boolean c(cnh $$0) {
      return $$0.eb().c(cql.b);
   }

   private static boolean c(bvh $$0) {
      return $$0.b(cwq.wn);
   }

   private static void d(bvh $$0) {
      $$0.eb().a(cel.ad, true, 119L);
   }

   private static boolean p(cni $$0) {
      return $$0.eb().a(cel.ad);
   }

   private static boolean b(cwm $$0) {
      return $$0.a(c);
   }

   private static boolean c(cwm $$0) {
      return $$0.a(axl.ac);
   }

   private static boolean q(cni $$0) {
      return $$0.eb().a(cel.aw);
   }

   private static boolean e(bvh $$0) {
      return $$0.eb().a(cel.au);
   }

   private static boolean f(bvh $$0) {
      return !e($$0);
   }

   public static boolean b(bvh $$0) {
      return $$0.aq() == bus.bO && $$0.b(cnj::a);
   }

   private static boolean r(cni $$0) {
      return $$0.eb().a(cel.ag);
   }

   private static boolean g(bvh $$0) {
      return $$0.eb().a(cel.x);
   }

   private static boolean s(cni $$0) {
      return !$$0.eY().f();
   }

   private static boolean t(cni $$0) {
      return $$0.eY().f() || !a($$0.eY());
   }

   public static boolean a(bus<?> $$0) {
      return $$0 == bus.bN || $$0 == bus.bJ;
   }
}
