import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cnm {
   public static final int a = 8;
   public static final int b = 4;
   public static final cwl c = cwt.po;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final brv d = bab.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final brv o = bab.a(10, 40);
   private static final brv p = bab.a(10, 30);
   private static final brv q = bab.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final brv A = bab.a(5, 7);
   private static final brv B = bab.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bwj<?> a(cnl $$0, bwj<cnl> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cqo.a));
      $$1.b(cqo.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnl $$0, azh $$1) {
      int $$2 = d.a($$1);
      $$0.eb().a(cel.ah, true, (long)$$2);
   }

   private static void a(bwj<cnl> $$0) {
      $$0.a(cqo.a, 0, ImmutableList.of(new byg(45, 90), new byk(), bxy.a(), e(), f(), cnv.a(), cnr.a(119), bzn.a(300, cnm::a), bzq.a()));
   }

   private static void b(bwj<cnl> $$0) {
      $$0.a(
         cqo.b,
         10,
         ImmutableList.of(byz.a(cnm::b, 14.0F), bzm.a(($$0x, $$1) -> $$1.gs(), cnm::b), can.a(cnl::m, cns.a()), d(), g(), b(), c(), bzc.a(bus.bR, 4))
      );
   }

   private static void b(cnl $$0, bwj<cnl> $$1) {
      $$1.a(
         cqo.k,
         10,
         ImmutableList.of(
            bzp.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), can.a(cnm::c, bwy.a(5, 0.75F)), bzf.a(1.0F), byh.a(20), new bxi(), cnq.a(), bxm.a(cnm::g, cel.o)
         ),
         cel.o
      );
   }

   private static void c(bwj<cnl> $$0) {
      $$0.a(
         cqo.l,
         10,
         ImmutableList.of(
            d(),
            byz.a(cnm::b, 14.0F),
            bzm.a(($$0x, $$1) -> $$1.gs(), cnm::b),
            can.a($$0x -> !$$0x.gz(), bxt.a(cel.ai, 2, 1.0F)),
            can.a(cnl::gz, bxt.a(cel.ai, 4, 0.6F)),
            new byx(ImmutableList.of(Pair.of(byz.a(bus.aR, 8.0F), 1), Pair.of(bys.a(0.6F, 2, 1), 1), Pair.of(new bxk(10, 20), 1)))
         ),
         cel.ai
      );
   }

   private static void d(bwj<cnl> $$0) {
      $$0.a(cqo.m, 10, ImmutableList.of(bxu.a(cnm::t, 1.0F, true, 9), cnt.a(9), cnu.a(200, 200)), cel.ad);
   }

   private static void e(bwj<cnl> $$0) {
      $$0.a(cqo.n, 10, ImmutableList.of(bze.b(cel.z, 1.0F, 12, true), b(), c(), bxm.a(cnm::j, cel.z)), cel.z);
   }

   private static void f(bwj<cnl> $$0) {
      $$0.a(
         cqo.o,
         10,
         ImmutableList.of(
            byi.a(0.8F),
            byz.a(cnm::b, 8.0F),
            can.a(can.a(bul::bZ), bzw.a(ImmutableList.builder().addAll(a()).add(Pair.of(can.a((Predicate<cnl>)($$0x -> true)), 1)).build())),
            bxj.a(8, cnm::a)
         ),
         cel.s
      );
   }

   private static ImmutableList<Pair<byl<bvh>, Integer>> a() {
      return ImmutableList.of(Pair.of(byz.a(bus.bR, 8.0F), 1), Pair.of(byz.a(bus.aR, 8.0F), 1), Pair.of(byz.a(8.0F), 1));
   }

   private static byx<bvh> b() {
      return new byx<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bxk(30, 60), 1)).build());
   }

   private static byx<cnl> c() {
      return new byx<>(
         ImmutableList.of(
            Pair.of(bys.a(0.6F), 2), Pair.of(bxx.a(bus.aR, 8, cel.q, 0.6F, 2), 2), Pair.of(can.a(cnm::f, bzh.a(0.6F, 3)), 2), Pair.of(new bxk(30, 60), 1)
         )
      );
   }

   private static bxb<bvp> d() {
      return bze.a(cel.aw, 1.0F, 8, false);
   }

   private static bxb<cnl> e() {
      return bxf.a(cnl::e_, cel.M, cel.z, B);
   }

   private static bxb<cnl> f() {
      return bxf.a(cnm::g, cel.ar, cel.z, A);
   }

   protected static void a(cnl $$0) {
      bwj<cnl> $$1 = $$0.eb();
      cqo $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqo.m, cqo.k, cqo.n, cqo.l, cqo.o, cqo.b));
      cqo $$3 = $$1.g().orElse(null);
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

   private static boolean e(cnl $$0) {
      if (!$$0.e_()) {
         return false;
      } else {
         bul $$1 = $$0.dk();
         return $$1 instanceof cnl && ((cnl)$$1).e_() || $$1 instanceof cnf && ((cnf)$$1).e_();
      }
   }

   protected static void a(ard $$0, cnl $$1, clc $$2) {
      i($$1);
      cwp $$3;
      if ($$2.l().a(cwt.tf)) {
         $$1.a($$2, $$2.l().M());
         $$3 = $$2.l();
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
         boolean $$5 = !$$1.b($$0, $$3).equals(cwp.j);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(ard $$0, cnl $$1, cwp $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(bsj.b));
      }

      $$1.l($$2);
   }

   private static cwp a(clc $$0) {
      cwp $$1 = $$0.l();
      cwp $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(ard $$0, cnl $$1, boolean $$2) {
      cwp $$3 = $$1.b(bsj.b);
      $$1.a(bsj.b, cwp.j);
      if ($$1.gs()) {
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
            cwp $$7 = $$1.eZ();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(ard $$0, cnl $$1) {
      if (p($$1) && !$$1.fa().f()) {
         $$1.a($$0, $$1.fa());
         $$1.a(bsj.b, cwp.j);
      }
   }

   private static void c(cnl $$0, cwp $$1) {
      cwp $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cnl $$0, List<cwp> $$1) {
      Optional<cox> $$2 = $$0.eb().c(cel.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cnl $$0, List<cwp> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cnl $$0, cox $$1, List<cwp> $$2) {
      a($$0, $$2, $$1.dt());
   }

   private static void a(cnl $$0, List<cwp> $$1, fba $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bsj.b);

         for (cwp $$3 : $$1) {
            bxc.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cwp> f(cnl $$0) {
      evw $$1 = $$0.dV().p().bc().b(evn.aK);
      List<cwp> $$2 = $$1.a(new evu.a((ard)$$0.dV()).a(eyl.a, $$0).a(eyk.k));
      return $$2;
   }

   private static boolean a(bvh $$0, bvh $$1) {
      return $$1.aq() != bus.aj ? false : azh.a($$0.dV().ad()).i() < 0.1F;
   }

   protected static boolean a(cnl $$0, cwp $$1) {
      if ($$0.e_() && $$1.a(awy.U)) {
         return false;
      } else if ($$1.a(awy.S)) {
         return false;
      } else if (r($$0) && $$0.eb().a(cel.o)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(cwt.tf)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cwp $$0) {
      return $$0.a(awy.T);
   }

   private static boolean a(cnl $$0, bul $$1) {
      return !($$1 instanceof bvj $$2) ? false : !$$2.e_() || !$$2.bL() || g((bvh)$$0) || g($$2) || $$2 instanceof cnl && $$2.dk() == null;
   }

   private static boolean b(ard $$0, cnl $$1, bvh $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cnl $$0) {
      bwj<cnl> $$1 = $$0.eb();
      if ($$1.a(cel.ar)) {
         bvh $$2 = $$1.c(cel.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bvh> b(ard $$0, cnl $$1) {
      bwj<cnl> $$2 = $$1.eb();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bvh> $$3 = bxc.a($$1, cel.ab);
         if ($$3.isPresent() && cfr.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cel.ac)) {
               Optional<cox> $$4 = $$2.c(cel.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bvj> $$5 = $$2.c(cel.M);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cox> $$6 = $$2.c(cel.am);
               return $$6.isPresent() && cfr.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(ard $$0, cox $$1, boolean $$2) {
      List<cnl> $$3 = $$1.dV().a(cnl.class, $$1.cR().g(16.0));
      $$3.stream().filter(cnm::c).filter($$2x -> !$$2 || bxc.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().b(dge.P)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bsk a(ard $$0, cnl $$1, cox $$2, bsj $$3) {
      cwp $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cwp $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bvh)$$1);
         i($$1);
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   protected static boolean b(cnl $$0, cwp $$1) {
      return !r($$0) && !p($$0) && $$0.gs() && b($$1);
   }

   protected static void a(ard $$0, cnl $$1, bvh $$2) {
      if (!($$2 instanceof cnl)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bwj<cnl> $$3 = $$1.eb();
         $$3.b(cel.ai);
         $$3.b(cel.aj);
         $$3.b(cel.ad);
         if ($$2 instanceof cox) {
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
               b($$0, (cnk)$$1, $$2);
            }
         } else if ($$2.aq() == bus.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cnk)$$1, $$2);
         }
      }
   }

   protected static void a(ard $$0, cnk $$1, bvh $$2) {
      if (!$$1.eb().c(cqo.n)) {
         if (cfr.d($$0, $$1, $$2)) {
            if (!bxc.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bus.bR && $$0.O().b(dge.P)) {
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

   public static Optional<avz> b(cnl $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(cnl $$0, cqo $$1) {
      if ($$1 == cqo.k) {
         return awa.uh;
      } else if ($$0.x()) {
         return awa.um;
      } else if ($$1 == cqo.n && h($$0)) {
         return awa.um;
      } else if ($$1 == cqo.m) {
         return awa.uf;
      } else if ($$1 == cqo.l) {
         return awa.ui;
      } else if (e((bvh)$$0)) {
         return awa.uk;
      } else {
         return q($$0) ? awa.um : awa.ug;
      }
   }

   private static boolean h(cnl $$0) {
      bwj<cnl> $$1 = $$0.eb();
      return !$$1.a(cel.z) ? false : $$1.c(cel.z).get().a($$0, 12.0);
   }

   protected static List<cnk> c(cnl $$0) {
      return $$0.eb().c(cel.ao).orElse(ImmutableList.of());
   }

   private static List<cnk> d(cnk $$0) {
      return $$0.eb().c(cel.an).orElse(ImmutableList.of());
   }

   public static boolean a(bvh $$0) {
      for (cwp $$1 : $$0.fd()) {
         if ($$1.a(awy.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cnl $$0) {
      $$0.eb().b(cel.m);
      $$0.P().m();
   }

   private static bxb<bvh> g() {
      bza.a $$0 = new bza.a(o);
      return bxf.a($$1 -> $$1.e_() && $$0.a($$1.dV().A), cel.al, cel.s, p);
   }

   protected static void b(ard $$0, cnk $$1, bvh $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bus.aj || $$2x.m() && ((cnf)$$2).gt()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(ard $$0, cnk $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(ard $$0, cnk $$1, bvh $$2) {
      if (cfr.d($$0, $$1, $$2)) {
         $$1.eb().b(cel.E);
         $$1.eb().a(cel.ab, $$2.cG(), 600L);
         if ($$2.aq() == bus.aj && $$1.m()) {
            b($$1);
         }

         if ($$2.aq() == bus.bR && $$0.O().b(dge.P)) {
            $$1.eb().a(cel.ac, true, 600L);
         }
      }
   }

   private static void d(ard $$0, cnk $$1, bvh $$2) {
      Optional<cox> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(ard $$0, cnk $$1, bvh $$2) {
      Optional<bvh> $$3 = e($$1);
      bvh $$4 = bxc.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bvh> e(cnk $$0) {
      return bxc.a($$0, cel.ab);
   }

   public static Optional<bvh> d(cnl $$0) {
      return $$0.eb().a(cel.z) ? $$0.eb().c(cel.z) : Optional.empty();
   }

   public static Optional<cox> a(cnk $$0) {
      return $$0.eb().a(cel.l) ? $$0.eb().c(cel.l) : Optional.empty();
   }

   private static void a(cnl $$0, bvh $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cnl).forEach($$1x -> b((cnl)$$1x, $$1));
   }

   private static void b(cnl $$0, bvh $$1) {
      bwj<cnl> $$2 = $$0.eb();
      bvh $$3 = bxc.a($$0, $$2.c(cel.z), $$1);
      $$3 = bxc.a($$0, $$2.c(cel.o), $$3);
      c($$0, $$3);
   }

   private static boolean j(cnl $$0) {
      bwj<cnl> $$1 = $$0.eb();
      if (!$$1.a(cel.z)) {
         return true;
      } else {
         bvh $$2 = $$1.c(cel.z).get();
         bus<?> $$3 = $$2.aq();
         if ($$3 == bus.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cel.ar, $$2) : false;
         }
      }
   }

   private static boolean k(cnl $$0) {
      return !l($$0);
   }

   private static boolean l(cnl $$0) {
      int $$1 = $$0.eb().c(cel.as).orElse(0) + 1;
      int $$2 = $$0.eb().c(cel.at).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cnl $$0, bvh $$1) {
      $$0.eb().b(cel.ab);
      $$0.eb().b(cel.o);
      $$0.eb().b(cel.m);
      $$0.eb().a(cel.z, $$1, (long)q.a($$0.dV().A));
      b((cnk)$$0);
   }

   protected static void b(cnk $$0) {
      $$0.eb().a(cel.ah, true, (long)d.a($$0.dV().A));
   }

   private static void m(cnl $$0) {
      $$0.eb().a(cel.av, true, 200L);
   }

   private static fba n(cnl $$0) {
      fba $$1 = cgf.a($$0, 4, 2);
      return $$1 == null ? $$0.dt() : $$1;
   }

   private static boolean o(cnl $$0) {
      return $$0.eb().a(cel.av);
   }

   protected static boolean c(cnk $$0) {
      return $$0.eb().c(cqo.b);
   }

   private static boolean c(bvh $$0) {
      return $$0.b(cwt.wV);
   }

   private static void d(bvh $$0) {
      $$0.eb().a(cel.ad, true, 119L);
   }

   private static boolean p(cnl $$0) {
      return $$0.eb().a(cel.ad);
   }

   private static boolean b(cwp $$0) {
      return $$0.a(c);
   }

   private static boolean c(cwp $$0) {
      return $$0.a(awy.ab);
   }

   private static boolean q(cnl $$0) {
      return $$0.eb().a(cel.aw);
   }

   private static boolean e(bvh $$0) {
      return $$0.eb().a(cel.au);
   }

   private static boolean f(bvh $$0) {
      return !e($$0);
   }

   public static boolean b(bvh $$0) {
      return $$0.aq() == bus.bR && $$0.b(cnm::a);
   }

   private static boolean r(cnl $$0) {
      return $$0.eb().a(cel.ag);
   }

   private static boolean g(bvh $$0) {
      return $$0.eb().a(cel.x);
   }

   private static boolean s(cnl $$0) {
      return !$$0.fa().f();
   }

   private static boolean t(cnl $$0) {
      return $$0.fa().f() || !a($$0.fa());
   }

   public static boolean a(bus<?> $$0) {
      return $$0 == bus.bQ || $$0 == bus.bM;
   }
}
