import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cfy {
   public static final int a = 8;
   public static final int b = 4;
   public static final cou c = cpc.oH;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final blf d = axh.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final blf o = axh.a(10, 40);
   private static final blf p = axh.a(10, 30);
   private static final blf q = axh.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final blf A = axh.a(5, 7);
   private static final blf B = axh.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bpf<?> a(cfx $$0, bpf<cfx> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(ciu.a));
      $$1.b(ciu.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cfx $$0, awo $$1) {
      int $$2 = d.a($$1);
      $$0.dO().a(bxh.ah, true, (long)$$2);
   }

   private static void a(bpf<cfx> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new brc(45, 90), new brg(), bqu.a(), e(), f(), cgh.a(), cgd.a(119), bsj.a(300, cfy::a), bsm.a()));
   }

   private static void b(bpf<cfx> $$0) {
      $$0.a(ciu.b, 10, ImmutableList.of(brv.a(cfy::b, 14.0F), bsi.a(cfw::gh, cfy::i), btj.a(cfx::u, cge.a()), d(), g(), b(), c(), bry.a(bnu.bw, 4)));
   }

   private static void b(cfx $$0, bpf<cfx> $$1) {
      $$1.a(
         ciu.k,
         10,
         ImmutableList.of(bsl.a($$1x -> !b($$0, $$1x)), btj.a(cfy::c, bpu.a(5, 0.75F)), bsb.a(1.0F), brd.a(20), new bqe(), cgc.a(), bqi.a(cfy::h, bxh.o)),
         bxh.o
      );
   }

   private static void c(bpf<cfx> $$0) {
      $$0.a(
         ciu.l,
         10,
         ImmutableList.of(
            d(),
            brv.a(cfy::b, 14.0F),
            bsi.a(cfw::gh, cfy::i),
            btj.a($$0x -> !$$0x.go(), bqp.a(bxh.ai, 2, 1.0F)),
            btj.a(cfx::go, bqp.a(bxh.ai, 4, 0.6F)),
            new brt(ImmutableList.of(Pair.of(brv.a(bnu.ay, 8.0F), 1), Pair.of(bro.a(0.6F, 2, 1), 1), Pair.of(new bqg(10, 20), 1)))
         ),
         bxh.ai
      );
   }

   private static void d(bpf<cfx> $$0) {
      $$0.a(ciu.m, 10, ImmutableList.of(bqq.a(cfy::v, 1.0F, true, 9), cgf.a(9), cgg.a(200, 200)), bxh.ad);
   }

   private static void e(bpf<cfx> $$0) {
      $$0.a(ciu.n, 10, ImmutableList.of(bsa.b(bxh.z, 1.0F, 12, true), b(), c(), bqi.a(cfy::l, bxh.z)), bxh.z);
   }

   private static void f(bpf<cfx> $$0) {
      $$0.a(
         ciu.o,
         10,
         ImmutableList.of(
            bre.a(0.8F),
            brv.a(cfy::b, 8.0F),
            btj.a(btj.a(bno::bO), bss.a(ImmutableList.builder().addAll(a()).add(Pair.of(btj.a((Predicate<cfx>)($$0x -> true)), 1)).build())),
            bqf.a(8, cfy::a)
         ),
         bxh.s
      );
   }

   private static ImmutableList<Pair<brh<bog>, Integer>> a() {
      return ImmutableList.of(Pair.of(brv.a(bnu.bw, 8.0F), 1), Pair.of(brv.a(bnu.ay, 8.0F), 1), Pair.of(brv.a(8.0F), 1));
   }

   private static brt<bog> b() {
      return new brt<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bqg(30, 60), 1)).build());
   }

   private static brt<cfx> c() {
      return new brt<>(
         ImmutableList.of(
            Pair.of(bro.a(0.6F), 2), Pair.of(bqt.a(bnu.ay, 8, bxh.q, 0.6F, 2), 2), Pair.of(btj.a(cfy::f, bsd.a(0.6F, 3)), 2), Pair.of(new bqg(30, 60), 1)
         )
      );
   }

   private static bpx<boo> d() {
      return bsa.a(bxh.aw, 1.0F, 8, false);
   }

   private static bpx<cfx> e() {
      return bqb.a(cfx::o_, bxh.M, bxh.z, B);
   }

   private static bpx<cfx> f() {
      return bqb.a(cfy::h, bxh.ar, bxh.z, A);
   }

   protected static void a(cfx $$0) {
      bpf<cfx> $$1 = $$0.dO();
      ciu $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ciu.m, ciu.k, ciu.n, ciu.l, ciu.o, ciu.b));
      ciu $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bxh.o));
      if (!$$1.a(bxh.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(bxh.ai)) {
         $$1.b(bxh.aj);
      }

      $$0.x($$1.a(bxh.aj));
   }

   private static boolean f(cfx $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         bno $$1 = $$0.cZ();
         return $$1 instanceof cfx && ((cfx)$$1).o_() || $$1 instanceof cfr && ((cfr)$$1).o_();
      }
   }

   protected static void a(cfx $$0, cds $$1) {
      k($$0);
      coz $$2;
      if ($$1.q().a(cpc.sh)) {
         $$0.a($$1, $$1.q().M());
         $$2 = $$1.q();
         $$1.am();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dO().b(bxh.ae);
         c($$0, $$2);
         d((bog)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(coz.h);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cfx $$0, coz $$1) {
      if (u($$0)) {
         $$0.b($$0.b(blt.b));
      }

      $$0.o($$1);
   }

   private static coz a(cds $$0) {
      coz $$1 = $$0.q();
      coz $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.am();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cfx $$0, boolean $$1) {
      coz $$2 = $$0.b(blt.b);
      $$0.a(blt.b, coz.h);
      if ($$0.gh()) {
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
            coz $$6 = $$0.eT();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cfx $$0) {
      if (r($$0) && !$$0.eU().b()) {
         $$0.b($$0.eU());
         $$0.a(blt.b, coz.h);
      }
   }

   private static void d(cfx $$0, coz $$1) {
      coz $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cfx $$0, List<coz> $$1) {
      Optional<chh> $$2 = $$0.dO().c(bxh.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cfx $$0, List<coz> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cfx $$0, chh $$1, List<coz> $$2) {
      a($$0, $$2, $$1.dk());
   }

   private static void a(cfx $$0, List<coz> $$1, ens $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(blt.b);

         for (coz $$3 : $$1) {
            bpy.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<coz> g(cfx $$0) {
      ejd $$1 = $$0.dM().o().aJ().getLootTable(eit.aL);
      List<coz> $$2 = $$1.a(new ejb.a((aov)$$0.dM()).a(elg.a, $$0).a(elf.j));
      return $$2;
   }

   private static boolean a(bog $$0, bog $$1) {
      return $$1.ai() != bnu.Y ? false : awo.a($$0.dM().X()).i() < 0.1F;
   }

   protected static boolean a(cfx $$0, coz $$1) {
      if ($$0.o_() && $$1.a(auh.V)) {
         return false;
      } else if ($$1.a(auh.T)) {
         return false;
      } else if (t($$0) && $$0.dO().a(bxh.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cpc.sh)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(coz $$0) {
      return $$0.a(auh.U);
   }

   private static boolean a(cfx $$0, bno $$1) {
      return !($$1 instanceof boi $$2) ? false : !$$2.o_() || !$$2.bx() || g((bog)$$0) || g($$2) || $$2 instanceof cfx && $$2.cZ() == null;
   }

   private static boolean b(cfx $$0, bog $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cfx $$0) {
      bpf<cfx> $$1 = $$0.dO();
      if ($$1.a(bxh.ar)) {
         bog $$2 = $$1.c(bxh.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bog> i(cfx $$0) {
      bpf<cfx> $$1 = $$0.dO();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bog> $$2 = bpy.a($$0, bxh.ab);
         if ($$2.isPresent() && byn.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bxh.ac)) {
               Optional<chh> $$3 = $$1.c(bxh.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<boi> $$4 = $$1.c(bxh.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<chh> $$5 = $$1.c(bxh.am);
               return $$5.isPresent() && byn.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(chh $$0, boolean $$1) {
      List<cfx> $$2 = $$0.dM().a(cfx.class, $$0.cH().g(16.0));
      $$2.stream().filter(cfy::d).filter($$2x -> !$$1 || bpy.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dM().Z().b(cvj.O)) {
            d((cfw)$$1x, $$0);
         } else {
            c((cfw)$$1x, $$0);
         }
      });
   }

   public static blu a(cfx $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         coz $$4 = $$3.a(1);
         c($$0, $$4);
         d((bog)$$0);
         k($$0);
         return blu.b;
      } else {
         return blu.d;
      }
   }

   protected static boolean b(cfx $$0, coz $$1) {
      return !t($$0) && !r($$0) && $$0.gh() && b($$1);
   }

   protected static void a(cfx $$0, bog $$1) {
      if (!($$1 instanceof cfx)) {
         if (u($$0)) {
            a($$0, false);
         }

         bpf<cfx> $$2 = $$0.dO();
         $$2.b(bxh.ai);
         $$2.b(bxh.aj);
         $$2.b(bxh.ad);
         if ($$1 instanceof chh) {
            $$2.a(bxh.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ai() != $$1.ai()) {
               $$2.b(bxh.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(bxh.z, $$1, 100L);
            if (byn.d($$0, $$1)) {
               b((cfw)$$0, $$1);
            }
         } else if ($$1.ai() == bnu.Y && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cfw)$$0, $$1);
         }
      }
   }

   protected static void a(cfw $$0, bog $$1) {
      if (!$$0.dO().c(ciu.n)) {
         if (byn.d($$0, $$1)) {
            if (!bpy.a($$0, $$1, 4.0)) {
               if ($$1.ai() == bnu.bw && $$0.dM().Z().b(cvj.O)) {
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

   public static Optional<atj> c(cfx $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static atj a(cfx $$0, ciu $$1) {
      if ($$1 == ciu.k) {
         return atk.sZ;
      } else if ($$0.gg()) {
         return atk.te;
      } else if ($$1 == ciu.n && j($$0)) {
         return atk.te;
      } else if ($$1 == ciu.m) {
         return atk.sX;
      } else if ($$1 == ciu.l) {
         return atk.ta;
      } else if (e((bog)$$0)) {
         return atk.tc;
      } else {
         return s($$0) ? atk.te : atk.sY;
      }
   }

   private static boolean j(cfx $$0) {
      bpf<cfx> $$1 = $$0.dO();
      return !$$1.a(bxh.z) ? false : $$1.c(bxh.z).get().a($$0, 12.0);
   }

   protected static List<cfw> d(cfx $$0) {
      return $$0.dO().c(bxh.ao).orElse(ImmutableList.of());
   }

   private static List<cfw> e(cfw $$0) {
      return $$0.dO().c(bxh.an).orElse(ImmutableList.of());
   }

   public static boolean a(bog $$0) {
      for (coz $$2 : $$0.bL()) {
         cou $$3 = $$2.d();
         if ($$3 instanceof cmj && ((cmj)$$3).d() == cml.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cfx $$0) {
      $$0.dO().b(bxh.m);
      $$0.N().n();
   }

   private static bpx<bog> g() {
      brw.a $$0 = new brw.a(o);
      return bqb.a($$1 -> $$1.o_() && $$0.a($$1.dM().z), bxh.al, bxh.s, p);
   }

   protected static void b(cfw $$0, bog $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ai() != bnu.Y || $$1x.u() && ((cfr)$$1).gm()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cfw $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cfw $$0, bog $$1) {
      if (byn.d($$0, $$1)) {
         $$0.dO().b(bxh.E);
         $$0.dO().a(bxh.ab, $$1.cw(), 600L);
         if ($$1.ai() == bnu.Y && $$0.u()) {
            c($$0);
         }

         if ($$1.ai() == bnu.bw && $$0.dM().Z().b(cvj.O)) {
            $$0.dO().a(bxh.ac, true, 600L);
         }
      }
   }

   private static void d(cfw $$0, bog $$1) {
      Optional<chh> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cfw $$0, bog $$1) {
      Optional<bog> $$2 = f($$0);
      bog $$3 = bpy.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bog> f(cfw $$0) {
      return bpy.a($$0, bxh.ab);
   }

   public static Optional<bog> e(cfx $$0) {
      return $$0.dO().a(bxh.z) ? $$0.dO().c(bxh.z) : Optional.empty();
   }

   public static Optional<chh> b(cfw $$0) {
      return $$0.dO().a(bxh.l) ? $$0.dO().c(bxh.l) : Optional.empty();
   }

   private static void c(cfx $$0, bog $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cfx).forEach($$1x -> d((cfx)$$1x, $$1));
   }

   private static void d(cfx $$0, bog $$1) {
      bpf<cfx> $$2 = $$0.dO();
      bog $$3 = bpy.a($$0, $$2.c(bxh.z), $$1);
      $$3 = bpy.a($$0, $$2.c(bxh.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cfx $$0) {
      bpf<cfx> $$1 = $$0.dO();
      if (!$$1.a(bxh.z)) {
         return true;
      } else {
         bog $$2 = $$1.c(bxh.z).get();
         bnu<?> $$3 = $$2.ai();
         if ($$3 == bnu.Y) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bxh.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cfx $$0) {
      return !n($$0);
   }

   private static boolean n(cfx $$0) {
      int $$1 = $$0.dO().c(bxh.as).orElse(0) + 1;
      int $$2 = $$0.dO().c(bxh.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cfx $$0, bog $$1) {
      $$0.dO().b(bxh.ab);
      $$0.dO().b(bxh.o);
      $$0.dO().b(bxh.m);
      $$0.dO().a(bxh.z, $$1, (long)q.a($$0.dM().z));
      c((cfw)$$0);
   }

   protected static void c(cfw $$0) {
      $$0.dO().a(bxh.ah, true, (long)d.a($$0.dM().z));
   }

   private static void o(cfx $$0) {
      $$0.dO().a(bxh.av, true, 200L);
   }

   private static ens p(cfx $$0) {
      ens $$1 = bzb.a($$0, 4, 2);
      return $$1 == null ? $$0.dk() : $$1;
   }

   private static boolean q(cfx $$0) {
      return $$0.dO().a(bxh.av);
   }

   protected static boolean d(cfw $$0) {
      return $$0.dO().c(ciu.b);
   }

   private static boolean c(bog $$0) {
      return $$0.b(cpc.vP);
   }

   private static void d(bog $$0) {
      $$0.dO().a(bxh.ad, true, 119L);
   }

   private static boolean r(cfx $$0) {
      return $$0.dO().a(bxh.ad);
   }

   private static boolean b(coz $$0) {
      return $$0.a(c);
   }

   private static boolean c(coz $$0) {
      return $$0.a(auh.W);
   }

   private static boolean s(cfx $$0) {
      return $$0.dO().a(bxh.aw);
   }

   private static boolean e(bog $$0) {
      return $$0.dO().a(bxh.au);
   }

   private static boolean f(bog $$0) {
      return !e($$0);
   }

   public static boolean b(bog $$0) {
      return $$0.ai() == bnu.bw && $$0.b(cfy::a);
   }

   private static boolean t(cfx $$0) {
      return $$0.dO().a(bxh.ag);
   }

   private static boolean g(bog $$0) {
      return $$0.dO().a(bxh.x);
   }

   private static boolean u(cfx $$0) {
      return !$$0.eU().b();
   }

   private static boolean v(cfx $$0) {
      return $$0.eU().b() || !a($$0.eU());
   }

   public static boolean a(bnu<?> $$0) {
      return $$0 == bnu.bv || $$0 == bnu.br;
   }
}
