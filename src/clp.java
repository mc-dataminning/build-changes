import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class clp {
   public static final int a = 8;
   public static final int b = 4;
   public static final cul c = cut.oI;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bqg d = azz.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bqg o = azz.a(10, 40);
   private static final bqg p = azz.a(10, 30);
   private static final bqg q = azz.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bqg A = azz.a(5, 7);
   private static final bqg B = azz.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bus<?> a(clo $$0, bus<clo> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(coo.a));
      $$1.b(coo.b);
      $$1.f();
      return $$1;
   }

   protected static void a(clo $$0, azh $$1) {
      int $$2 = d.a($$1);
      $$0.dS().a(ccu.ah, true, (long)$$2);
   }

   private static void a(bus<clo> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new bwp(45, 90), new bwt(), bwh.a(), e(), f(), cly.a(), clu.a(119), bxw.a(300, clp::a), bxz.a()));
   }

   private static void b(bus<clo> $$0) {
      $$0.a(coo.b, 10, ImmutableList.of(bxi.a(clp::b, 14.0F), bxv.a(cln::gr, clp::i), byw.a(clo::s, clv.a()), d(), g(), b(), c(), bxl.a(btb.by, 4)));
   }

   private static void b(clo $$0, bus<clo> $$1) {
      $$1.a(
         coo.k,
         10,
         ImmutableList.of(bxy.a($$1x -> !b($$0, $$1x)), byw.a(clp::c, bvh.a(5, 0.75F)), bxo.a(1.0F), bwq.a(20), new bvr(), clt.a(), bvv.a(clp::h, ccu.o)),
         ccu.o
      );
   }

   private static void c(bus<clo> $$0) {
      $$0.a(
         coo.l,
         10,
         ImmutableList.of(
            d(),
            bxi.a(clp::b, 14.0F),
            bxv.a(cln::gr, clp::i),
            byw.a($$0x -> !$$0x.gy(), bwc.a(ccu.ai, 2, 1.0F)),
            byw.a(clo::gy, bwc.a(ccu.ai, 4, 0.6F)),
            new bxg(ImmutableList.of(Pair.of(bxi.a(btb.aA, 8.0F), 1), Pair.of(bxb.a(0.6F, 2, 1), 1), Pair.of(new bvt(10, 20), 1)))
         ),
         ccu.ai
      );
   }

   private static void d(bus<clo> $$0) {
      $$0.a(coo.m, 10, ImmutableList.of(bwd.a(clp::v, 1.0F, true, 9), clw.a(9), clx.a(200, 200)), ccu.ad);
   }

   private static void e(bus<clo> $$0) {
      $$0.a(coo.n, 10, ImmutableList.of(bxn.b(ccu.z, 1.0F, 12, true), b(), c(), bvv.a(clp::l, ccu.z)), ccu.z);
   }

   private static void f(bus<clo> $$0) {
      $$0.a(
         coo.o,
         10,
         ImmutableList.of(
            bwr.a(0.8F),
            bxi.a(clp::b, 8.0F),
            byw.a(byw.a(bsv::bR), byf.a(ImmutableList.builder().addAll(a()).add(Pair.of(byw.a((Predicate<clo>)($$0x -> true)), 1)).build())),
            bvs.a(8, clp::a)
         ),
         ccu.s
      );
   }

   private static ImmutableList<Pair<bwu<btq>, Integer>> a() {
      return ImmutableList.of(Pair.of(bxi.a(btb.by, 8.0F), 1), Pair.of(bxi.a(btb.aA, 8.0F), 1), Pair.of(bxi.a(8.0F), 1));
   }

   private static bxg<btq> b() {
      return new bxg<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bvt(30, 60), 1)).build());
   }

   private static bxg<clo> c() {
      return new bxg<>(
         ImmutableList.of(
            Pair.of(bxb.a(0.6F), 2), Pair.of(bwg.a(btb.aA, 8, ccu.q, 0.6F, 2), 2), Pair.of(byw.a(clp::f, bxq.a(0.6F, 3)), 2), Pair.of(new bvt(30, 60), 1)
         )
      );
   }

   private static bvk<btz> d() {
      return bxn.a(ccu.aw, 1.0F, 8, false);
   }

   private static bvk<clo> e() {
      return bvo.a(clo::p_, ccu.M, ccu.z, B);
   }

   private static bvk<clo> f() {
      return bvo.a(clp::h, ccu.ar, ccu.z, A);
   }

   protected static void a(clo $$0) {
      bus<clo> $$1 = $$0.dS();
      coo $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(coo.m, coo.k, coo.n, coo.l, coo.o, coo.b));
      coo $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccu.o));
      if (!$$1.a(ccu.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(ccu.ai)) {
         $$1.b(ccu.aj);
      }

      $$0.x($$1.a(ccu.aj));
   }

   private static boolean f(clo $$0) {
      if (!$$0.p_()) {
         return false;
      } else {
         bsv $$1 = $$0.dc();
         return $$1 instanceof clo && ((clo)$$1).p_() || $$1 instanceof cli && ((cli)$$1).p_();
      }
   }

   protected static void a(clo $$0, cji $$1) {
      k($$0);
      cuq $$2;
      if ($$1.p().a(cut.si)) {
         $$0.a($$1, $$1.p().I());
         $$2 = $$1.p();
         $$1.ao();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dS().b(ccu.ae);
         c($$0, $$2);
         d((btq)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cuq.l);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(clo $$0, cuq $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bqu.b));
      }

      $$0.q($$1);
   }

   private static cuq a(cji $$0) {
      cuq $$1 = $$0.p();
      cuq $$2 = $$1.a(1);
      if ($$1.e()) {
         $$0.ao();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(clo $$0, boolean $$1) {
      cuq $$2 = $$0.b(bqu.b);
      $$0.a(bqu.b, cuq.l);
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
            cuq $$6 = $$0.eX();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(clo $$0) {
      if (r($$0) && !$$0.eY().e()) {
         $$0.b($$0.eY());
         $$0.a(bqu.b, cuq.l);
      }
   }

   private static void d(clo $$0, cuq $$1) {
      cuq $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(clo $$0, List<cuq> $$1) {
      Optional<cmy> $$2 = $$0.dS().c(ccu.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(clo $$0, List<cuq> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(clo $$0, cmy $$1, List<cuq> $$2) {
      a($$0, $$2, $$1.dn());
   }

   private static void a(clo $$0, List<cuq> $$1, evs $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bqu.b);

         for (cuq $$3 : $$1) {
            bvl.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cuq> g(clo $$0) {
      eqo $$1 = $$0.dP().o().be().b(eqf.aW);
      List<cuq> $$2 = $$1.a(new eqm.a((arf)$$0.dP()).a(etf.a, $$0).a(ete.k));
      return $$2;
   }

   private static boolean a(btq $$0, btq $$1) {
      return $$1.ak() != btb.Z ? false : azh.a($$0.dP().Z()).i() < 0.1F;
   }

   protected static boolean a(clo $$0, cuq $$1) {
      if ($$0.p_() && $$1.a(awy.V)) {
         return false;
      } else if ($$1.a(awy.T)) {
         return false;
      } else if (t($$0) && $$0.dS().a(ccu.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(cut.si)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cuq $$0) {
      return $$0.a(awy.U);
   }

   private static boolean a(clo $$0, bsv $$1) {
      return !($$1 instanceof bts $$2) ? false : !$$2.p_() || !$$2.bD() || g((btq)$$0) || g($$2) || $$2 instanceof clo && $$2.dc() == null;
   }

   private static boolean b(clo $$0, btq $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(clo $$0) {
      bus<clo> $$1 = $$0.dS();
      if ($$1.a(ccu.ar)) {
         btq $$2 = $$1.c(ccu.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends btq> i(clo $$0) {
      bus<clo> $$1 = $$0.dS();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<btq> $$2 = bvl.a($$0, ccu.ab);
         if ($$2.isPresent() && cea.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(ccu.ac)) {
               Optional<cmy> $$3 = $$1.c(ccu.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bts> $$4 = $$1.c(ccu.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cmy> $$5 = $$1.c(ccu.am);
               return $$5.isPresent() && cea.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cmy $$0, boolean $$1) {
      List<clo> $$2 = $$0.dP().a(clo.class, $$0.cK().g(16.0));
      $$2.stream().filter(clp::d).filter($$2x -> !$$1 || bvl.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dP().ab().b(dbv.O)) {
            d((cln)$$1x, $$0);
         } else {
            c((cln)$$1x, $$0);
         }
      });
   }

   public static bqv a(clo $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cuq $$4 = $$3.a(1);
         c($$0, $$4);
         d((btq)$$0);
         k($$0);
         return bqv.c;
      } else {
         return bqv.e;
      }
   }

   protected static boolean b(clo $$0, cuq $$1) {
      return !t($$0) && !r($$0) && $$0.gr() && b($$1);
   }

   protected static void a(clo $$0, btq $$1) {
      if (!($$1 instanceof clo)) {
         if (u($$0)) {
            a($$0, false);
         }

         bus<clo> $$2 = $$0.dS();
         $$2.b(ccu.ai);
         $$2.b(ccu.aj);
         $$2.b(ccu.ad);
         if ($$1 instanceof cmy) {
            $$2.a(ccu.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ak() != $$1.ak()) {
               $$2.b(ccu.z);
            }
         });
         if ($$0.p_()) {
            $$2.a(ccu.z, $$1, 100L);
            if (cea.d($$0, $$1)) {
               b((cln)$$0, $$1);
            }
         } else if ($$1.ak() == btb.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cln)$$0, $$1);
         }
      }
   }

   protected static void a(cln $$0, btq $$1) {
      if (!$$0.dS().c(coo.n)) {
         if (cea.d($$0, $$1)) {
            if (!bvl.a($$0, $$1, 4.0)) {
               if ($$1.ak() == btb.by && $$0.dP().ab().b(dbv.O)) {
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

   public static Optional<avz> c(clo $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(clo $$0, coo $$1) {
      if ($$1 == coo.k) {
         return awa.tE;
      } else if ($$0.gq()) {
         return awa.tJ;
      } else if ($$1 == coo.n && j($$0)) {
         return awa.tJ;
      } else if ($$1 == coo.m) {
         return awa.tC;
      } else if ($$1 == coo.l) {
         return awa.tF;
      } else if (e((btq)$$0)) {
         return awa.tH;
      } else {
         return s($$0) ? awa.tJ : awa.tD;
      }
   }

   private static boolean j(clo $$0) {
      bus<clo> $$1 = $$0.dS();
      return !$$1.a(ccu.z) ? false : $$1.c(ccu.z).get().a($$0, 12.0);
   }

   protected static List<cln> d(clo $$0) {
      return $$0.dS().c(ccu.ao).orElse(ImmutableList.of());
   }

   private static List<cln> e(cln $$0) {
      return $$0.dS().c(ccu.an).orElse(ImmutableList.of());
   }

   public static boolean a(btq $$0) {
      for (cuq $$2 : $$0.fb()) {
         cul $$3 = $$2.g();
         if ($$3 instanceof csf && ((csf)$$3).h().a(csh.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(clo $$0) {
      $$0.dS().b(ccu.m);
      $$0.K().n();
   }

   private static bvk<btq> g() {
      bxj.a $$0 = new bxj.a(o);
      return bvo.a($$1 -> $$1.p_() && $$0.a($$1.dP().z), ccu.al, ccu.s, p);
   }

   protected static void b(cln $$0, btq $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ak() != btb.Z || $$1x.s() && ((cli)$$1).gw()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cln $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cln $$0, btq $$1) {
      if (cea.d($$0, $$1)) {
         $$0.dS().b(ccu.E);
         $$0.dS().a(ccu.ab, $$1.cz(), 600L);
         if ($$1.ak() == btb.Z && $$0.s()) {
            c($$0);
         }

         if ($$1.ak() == btb.by && $$0.dP().ab().b(dbv.O)) {
            $$0.dS().a(ccu.ac, true, 600L);
         }
      }
   }

   private static void d(cln $$0, btq $$1) {
      Optional<cmy> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cln $$0, btq $$1) {
      Optional<btq> $$2 = f($$0);
      btq $$3 = bvl.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<btq> f(cln $$0) {
      return bvl.a($$0, ccu.ab);
   }

   public static Optional<btq> e(clo $$0) {
      return $$0.dS().a(ccu.z) ? $$0.dS().c(ccu.z) : Optional.empty();
   }

   public static Optional<cmy> b(cln $$0) {
      return $$0.dS().a(ccu.l) ? $$0.dS().c(ccu.l) : Optional.empty();
   }

   private static void c(clo $$0, btq $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof clo).forEach($$1x -> d((clo)$$1x, $$1));
   }

   private static void d(clo $$0, btq $$1) {
      bus<clo> $$2 = $$0.dS();
      btq $$3 = bvl.a($$0, $$2.c(ccu.z), $$1);
      $$3 = bvl.a($$0, $$2.c(ccu.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(clo $$0) {
      bus<clo> $$1 = $$0.dS();
      if (!$$1.a(ccu.z)) {
         return true;
      } else {
         btq $$2 = $$1.c(ccu.z).get();
         btb<?> $$3 = $$2.ak();
         if ($$3 == btb.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(ccu.ar, $$2) : false;
         }
      }
   }

   private static boolean m(clo $$0) {
      return !n($$0);
   }

   private static boolean n(clo $$0) {
      int $$1 = $$0.dS().c(ccu.as).orElse(0) + 1;
      int $$2 = $$0.dS().c(ccu.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(clo $$0, btq $$1) {
      $$0.dS().b(ccu.ab);
      $$0.dS().b(ccu.o);
      $$0.dS().b(ccu.m);
      $$0.dS().a(ccu.z, $$1, (long)q.a($$0.dP().z));
      c((cln)$$0);
   }

   protected static void c(cln $$0) {
      $$0.dS().a(ccu.ah, true, (long)d.a($$0.dP().z));
   }

   private static void o(clo $$0) {
      $$0.dS().a(ccu.av, true, 200L);
   }

   private static evs p(clo $$0) {
      evs $$1 = ceo.a($$0, 4, 2);
      return $$1 == null ? $$0.dn() : $$1;
   }

   private static boolean q(clo $$0) {
      return $$0.dS().a(ccu.av);
   }

   protected static boolean d(cln $$0) {
      return $$0.dS().c(coo.b);
   }

   private static boolean c(btq $$0) {
      return $$0.b(cut.vT);
   }

   private static void d(btq $$0) {
      $$0.dS().a(ccu.ad, true, 119L);
   }

   private static boolean r(clo $$0) {
      return $$0.dS().a(ccu.ad);
   }

   private static boolean b(cuq $$0) {
      return $$0.a(c);
   }

   private static boolean c(cuq $$0) {
      return $$0.a(awy.Y);
   }

   private static boolean s(clo $$0) {
      return $$0.dS().a(ccu.aw);
   }

   private static boolean e(btq $$0) {
      return $$0.dS().a(ccu.au);
   }

   private static boolean f(btq $$0) {
      return !e($$0);
   }

   public static boolean b(btq $$0) {
      return $$0.ak() == btb.by && $$0.b(clp::a);
   }

   private static boolean t(clo $$0) {
      return $$0.dS().a(ccu.ag);
   }

   private static boolean g(btq $$0) {
      return $$0.dS().a(ccu.x);
   }

   private static boolean u(clo $$0) {
      return !$$0.eY().e();
   }

   private static boolean v(clo $$0) {
      return $$0.eY().e() || !a($$0.eY());
   }

   public static boolean a(btb<?> $$0) {
      return $$0 == btb.bx || $$0 == btb.bt;
   }
}
