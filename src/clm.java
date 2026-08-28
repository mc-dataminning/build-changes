import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class clm {
   public static final int a = 8;
   public static final int b = 4;
   public static final cui c = cuq.oI;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bqd d = azx.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bqd o = azx.a(10, 40);
   private static final bqd p = azx.a(10, 30);
   private static final bqd q = azx.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bqd A = azx.a(5, 7);
   private static final bqd B = azx.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bup<?> a(cll $$0, bup<cll> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cok.a));
      $$1.b(cok.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cll $$0, azf $$1) {
      int $$2 = d.a($$1);
      $$0.dS().a(ccr.ah, true, (long)$$2);
   }

   private static void a(bup<cll> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bwm(45, 90), new bwq(), bwe.a(), e(), f(), clv.a(), clr.a(119), bxt.a(300, clm::a), bxw.a()));
   }

   private static void b(bup<cll> $$0) {
      $$0.a(cok.b, 10, ImmutableList.of(bxf.a(clm::b, 14.0F), bxs.a(clk::gr, clm::i), byt.a(cll::s, cls.a()), d(), g(), b(), c(), bxi.a(bsy.by, 4)));
   }

   private static void b(cll $$0, bup<cll> $$1) {
      $$1.a(
         cok.k,
         10,
         ImmutableList.of(bxv.a($$1x -> !b($$0, $$1x)), byt.a(clm::c, bve.a(5, 0.75F)), bxl.a(1.0F), bwn.a(20), new bvo(), clq.a(), bvs.a(clm::h, ccr.o)),
         ccr.o
      );
   }

   private static void c(bup<cll> $$0) {
      $$0.a(
         cok.l,
         10,
         ImmutableList.of(
            d(),
            bxf.a(clm::b, 14.0F),
            bxs.a(clk::gr, clm::i),
            byt.a($$0x -> !$$0x.gy(), bvz.a(ccr.ai, 2, 1.0F)),
            byt.a(cll::gy, bvz.a(ccr.ai, 4, 0.6F)),
            new bxd(ImmutableList.of(Pair.of(bxf.a(bsy.aA, 8.0F), 1), Pair.of(bwy.a(0.6F, 2, 1), 1), Pair.of(new bvq(10, 20), 1)))
         ),
         ccr.ai
      );
   }

   private static void d(bup<cll> $$0) {
      $$0.a(cok.m, 10, ImmutableList.of(bwa.a(clm::v, 1.0F, true, 9), clt.a(9), clu.a(200, 200)), ccr.ad);
   }

   private static void e(bup<cll> $$0) {
      $$0.a(cok.n, 10, ImmutableList.of(bxk.b(ccr.z, 1.0F, 12, true), b(), c(), bvs.a(clm::l, ccr.z)), ccr.z);
   }

   private static void f(bup<cll> $$0) {
      $$0.a(
         cok.o,
         10,
         ImmutableList.of(
            bwo.a(0.8F),
            bxf.a(clm::b, 8.0F),
            byt.a(byt.a(bss::bR), byc.a(ImmutableList.builder().addAll(a()).add(Pair.of(byt.a((Predicate<cll>)($$0x -> true)), 1)).build())),
            bvp.a(8, clm::a)
         ),
         ccr.s
      );
   }

   private static ImmutableList<Pair<bwr<btn>, Integer>> a() {
      return ImmutableList.of(Pair.of(bxf.a(bsy.by, 8.0F), 1), Pair.of(bxf.a(bsy.aA, 8.0F), 1), Pair.of(bxf.a(8.0F), 1));
   }

   private static bxd<btn> b() {
      return new bxd<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bvq(30, 60), 1)).build());
   }

   private static bxd<cll> c() {
      return new bxd<>(
         ImmutableList.of(
            Pair.of(bwy.a(0.6F), 2), Pair.of(bwd.a(bsy.aA, 8, ccr.q, 0.6F, 2), 2), Pair.of(byt.a(clm::f, bxn.a(0.6F, 3)), 2), Pair.of(new bvq(30, 60), 1)
         )
      );
   }

   private static bvh<btw> d() {
      return bxk.a(ccr.aw, 1.0F, 8, false);
   }

   private static bvh<cll> e() {
      return bvl.a(cll::p_, ccr.M, ccr.z, B);
   }

   private static bvh<cll> f() {
      return bvl.a(clm::h, ccr.ar, ccr.z, A);
   }

   protected static void a(cll $$0) {
      bup<cll> $$1 = $$0.dS();
      cok $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cok.m, cok.k, cok.n, cok.l, cok.o, cok.b));
      cok $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccr.o));
      if (!$$1.a(ccr.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(ccr.ai)) {
         $$1.b(ccr.aj);
      }

      $$0.x($$1.a(ccr.aj));
   }

   private static boolean f(cll $$0) {
      if (!$$0.p_()) {
         return false;
      } else {
         bss $$1 = $$0.dc();
         return $$1 instanceof cll && ((cll)$$1).p_() || $$1 instanceof clf && ((clf)$$1).p_();
      }
   }

   protected static void a(cll $$0, cjf $$1) {
      k($$0);
      cun $$2;
      if ($$1.p().a(cuq.si)) {
         $$0.a($$1, $$1.p().I());
         $$2 = $$1.p();
         $$1.ao();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dS().b(ccr.ae);
         c($$0, $$2);
         d((btn)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cun.l);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cll $$0, cun $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bqr.b));
      }

      $$0.q($$1);
   }

   private static cun a(cjf $$0) {
      cun $$1 = $$0.p();
      cun $$2 = $$1.a(1);
      if ($$1.e()) {
         $$0.ao();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cll $$0, boolean $$1) {
      cun $$2 = $$0.b(bqr.b);
      $$0.a(bqr.b, cun.l);
      if ($$0.gr()) {
         boolean $$3 = b($$2);
         if ($$1 && $$3) {
            a($$0, g($$0));
         } else if (!$$3) {
            boolean $$4 = !$$0.i($$2).e();
            if (!$$4) {
               d($$0, $$2);
            }
         }
      } else {
         boolean $$5 = !$$0.i($$2).e();
         if (!$$5) {
            cun $$6 = $$0.eX();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(cll $$0) {
      if (r($$0) && !$$0.eY().e()) {
         $$0.b($$0.eY());
         $$0.a(bqr.b, cun.l);
      }
   }

   private static void d(cll $$0, cun $$1) {
      cun $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cll $$0, List<cun> $$1) {
      Optional<cmv> $$2 = $$0.dS().c(ccr.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cll $$0, List<cun> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cll $$0, cmv $$1, List<cun> $$2) {
      a($$0, $$2, $$1.dn());
   }

   private static void a(cll $$0, List<cun> $$1, evp $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bqr.b);

         for (cun $$3 : $$1) {
            bvi.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cun> g(cll $$0) {
      eql $$1 = $$0.dP().o().be().b(eqc.aW);
      List<cun> $$2 = $$1.a(new eqj.a((are)$$0.dP()).a(etc.a, $$0).a(etb.k));
      return $$2;
   }

   private static boolean a(btn $$0, btn $$1) {
      return $$1.ak() != bsy.Z ? false : azf.a($$0.dP().Z()).i() < 0.1F;
   }

   protected static boolean a(cll $$0, cun $$1) {
      if ($$0.p_() && $$1.a(awx.V)) {
         return false;
      } else if ($$1.a(awx.T)) {
         return false;
      } else if (t($$0) && $$0.dS().a(ccr.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(cuq.si)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cun $$0) {
      return $$0.a(awx.U);
   }

   private static boolean a(cll $$0, bss $$1) {
      return !($$1 instanceof btp $$2) ? false : !$$2.p_() || !$$2.bD() || g((btn)$$0) || g($$2) || $$2 instanceof cll && $$2.dc() == null;
   }

   private static boolean b(cll $$0, btn $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cll $$0) {
      bup<cll> $$1 = $$0.dS();
      if ($$1.a(ccr.ar)) {
         btn $$2 = $$1.c(ccr.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends btn> i(cll $$0) {
      bup<cll> $$1 = $$0.dS();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<btn> $$2 = bvi.a($$0, ccr.ab);
         if ($$2.isPresent() && cdx.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(ccr.ac)) {
               Optional<cmv> $$3 = $$1.c(ccr.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<btp> $$4 = $$1.c(ccr.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cmv> $$5 = $$1.c(ccr.am);
               return $$5.isPresent() && cdx.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cmv $$0, boolean $$1) {
      List<cll> $$2 = $$0.dP().a(cll.class, $$0.cK().g(16.0));
      $$2.stream().filter(clm::d).filter($$2x -> !$$1 || bvi.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dP().ab().b(dbs.O)) {
            d((clk)$$1x, $$0);
         } else {
            c((clk)$$1x, $$0);
         }
      });
   }

   public static bqs a(cll $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cun $$4 = $$3.a(1);
         c($$0, $$4);
         d((btn)$$0);
         k($$0);
         return bqs.c;
      } else {
         return bqs.e;
      }
   }

   protected static boolean b(cll $$0, cun $$1) {
      return !t($$0) && !r($$0) && $$0.gr() && b($$1);
   }

   protected static void a(cll $$0, btn $$1) {
      if (!($$1 instanceof cll)) {
         if (u($$0)) {
            a($$0, false);
         }

         bup<cll> $$2 = $$0.dS();
         $$2.b(ccr.ai);
         $$2.b(ccr.aj);
         $$2.b(ccr.ad);
         if ($$1 instanceof cmv) {
            $$2.a(ccr.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ak() != $$1.ak()) {
               $$2.b(ccr.z);
            }
         });
         if ($$0.p_()) {
            $$2.a(ccr.z, $$1, 100L);
            if (cdx.d($$0, $$1)) {
               b((clk)$$0, $$1);
            }
         } else if ($$1.ak() == bsy.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((clk)$$0, $$1);
         }
      }
   }

   protected static void a(clk $$0, btn $$1) {
      if (!$$0.dS().c(cok.n)) {
         if (cdx.d($$0, $$1)) {
            if (!bvi.a($$0, $$1, 4.0)) {
               if ($$1.ak() == bsy.by && $$0.dP().ab().b(dbs.O)) {
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

   public static Optional<avy> c(cll $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avy a(cll $$0, cok $$1) {
      if ($$1 == cok.k) {
         return avz.tE;
      } else if ($$0.gq()) {
         return avz.tJ;
      } else if ($$1 == cok.n && j($$0)) {
         return avz.tJ;
      } else if ($$1 == cok.m) {
         return avz.tC;
      } else if ($$1 == cok.l) {
         return avz.tF;
      } else if (e((btn)$$0)) {
         return avz.tH;
      } else {
         return s($$0) ? avz.tJ : avz.tD;
      }
   }

   private static boolean j(cll $$0) {
      bup<cll> $$1 = $$0.dS();
      return !$$1.a(ccr.z) ? false : $$1.c(ccr.z).get().a($$0, 12.0);
   }

   protected static List<clk> d(cll $$0) {
      return $$0.dS().c(ccr.ao).orElse(ImmutableList.of());
   }

   private static List<clk> e(clk $$0) {
      return $$0.dS().c(ccr.an).orElse(ImmutableList.of());
   }

   public static boolean a(btn $$0) {
      for (cun $$2 : $$0.fb()) {
         cui $$3 = $$2.g();
         if ($$3 instanceof csc && ((csc)$$3).h().a(cse.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(cll $$0) {
      $$0.dS().b(ccr.m);
      $$0.K().n();
   }

   private static bvh<btn> g() {
      bxg.a $$0 = new bxg.a(o);
      return bvl.a($$1 -> $$1.p_() && $$0.a($$1.dP().z), ccr.al, ccr.s, p);
   }

   protected static void b(clk $$0, btn $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ak() != bsy.Z || $$1x.s() && ((clf)$$1).gw()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(clk $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(clk $$0, btn $$1) {
      if (cdx.d($$0, $$1)) {
         $$0.dS().b(ccr.E);
         $$0.dS().a(ccr.ab, $$1.cz(), 600L);
         if ($$1.ak() == bsy.Z && $$0.s()) {
            c($$0);
         }

         if ($$1.ak() == bsy.by && $$0.dP().ab().b(dbs.O)) {
            $$0.dS().a(ccr.ac, true, 600L);
         }
      }
   }

   private static void d(clk $$0, btn $$1) {
      Optional<cmv> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(clk $$0, btn $$1) {
      Optional<btn> $$2 = f($$0);
      btn $$3 = bvi.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<btn> f(clk $$0) {
      return bvi.a($$0, ccr.ab);
   }

   public static Optional<btn> e(cll $$0) {
      return $$0.dS().a(ccr.z) ? $$0.dS().c(ccr.z) : Optional.empty();
   }

   public static Optional<cmv> b(clk $$0) {
      return $$0.dS().a(ccr.l) ? $$0.dS().c(ccr.l) : Optional.empty();
   }

   private static void c(cll $$0, btn $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cll).forEach($$1x -> d((cll)$$1x, $$1));
   }

   private static void d(cll $$0, btn $$1) {
      bup<cll> $$2 = $$0.dS();
      btn $$3 = bvi.a($$0, $$2.c(ccr.z), $$1);
      $$3 = bvi.a($$0, $$2.c(ccr.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cll $$0) {
      bup<cll> $$1 = $$0.dS();
      if (!$$1.a(ccr.z)) {
         return true;
      } else {
         btn $$2 = $$1.c(ccr.z).get();
         bsy<?> $$3 = $$2.ak();
         if ($$3 == bsy.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(ccr.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cll $$0) {
      return !n($$0);
   }

   private static boolean n(cll $$0) {
      int $$1 = $$0.dS().c(ccr.as).orElse(0) + 1;
      int $$2 = $$0.dS().c(ccr.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cll $$0, btn $$1) {
      $$0.dS().b(ccr.ab);
      $$0.dS().b(ccr.o);
      $$0.dS().b(ccr.m);
      $$0.dS().a(ccr.z, $$1, (long)q.a($$0.dP().z));
      c((clk)$$0);
   }

   protected static void c(clk $$0) {
      $$0.dS().a(ccr.ah, true, (long)d.a($$0.dP().z));
   }

   private static void o(cll $$0) {
      $$0.dS().a(ccr.av, true, 200L);
   }

   private static evp p(cll $$0) {
      evp $$1 = cel.a($$0, 4, 2);
      return $$1 == null ? $$0.dn() : $$1;
   }

   private static boolean q(cll $$0) {
      return $$0.dS().a(ccr.av);
   }

   protected static boolean d(clk $$0) {
      return $$0.dS().c(cok.b);
   }

   private static boolean c(btn $$0) {
      return $$0.b(cuq.vT);
   }

   private static void d(btn $$0) {
      $$0.dS().a(ccr.ad, true, 119L);
   }

   private static boolean r(cll $$0) {
      return $$0.dS().a(ccr.ad);
   }

   private static boolean b(cun $$0) {
      return $$0.a(c);
   }

   private static boolean c(cun $$0) {
      return $$0.a(awx.Y);
   }

   private static boolean s(cll $$0) {
      return $$0.dS().a(ccr.aw);
   }

   private static boolean e(btn $$0) {
      return $$0.dS().a(ccr.au);
   }

   private static boolean f(btn $$0) {
      return !e($$0);
   }

   public static boolean b(btn $$0) {
      return $$0.ak() == bsy.by && $$0.b(clm::a);
   }

   private static boolean t(cll $$0) {
      return $$0.dS().a(ccr.ag);
   }

   private static boolean g(btn $$0) {
      return $$0.dS().a(ccr.x);
   }

   private static boolean u(cll $$0) {
      return !$$0.eY().e();
   }

   private static boolean v(cll $$0) {
      return $$0.eY().e() || !a($$0.eY());
   }

   public static boolean a(bsy<?> $$0) {
      return $$0 == bsy.bx || $$0 == bsy.bt;
   }
}
