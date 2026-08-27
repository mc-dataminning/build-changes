import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cgr {
   public static final int a = 8;
   public static final int b = 4;
   public static final cpl c = cpt.oH;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final blw d = axl.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final blw o = axl.a(10, 40);
   private static final blw p = axl.a(10, 30);
   private static final blw q = axl.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final blw A = axl.a(5, 7);
   private static final blw B = axl.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bpy<?> a(cgq $$0, bpy<cgq> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cjn.a));
      $$1.b(cjn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cgq $$0, awt $$1) {
      int $$2 = d.a($$1);
      $$0.dM().a(bya.ah, true, (long)$$2);
   }

   private static void a(bpy<cgq> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new brv(45, 90), new brz(), brn.a(), e(), f(), cha.a(), cgw.a(119), btc.a(300, cgr::a), btf.a()));
   }

   private static void b(bpy<cgq> $$0) {
      $$0.a(cjn.b, 10, ImmutableList.of(bso.a(cgr::b, 14.0F), btb.a(cgp::gm, cgr::i), buc.a(cgq::u, cgx.a()), d(), g(), b(), c(), bsr.a(bol.bw, 4)));
   }

   private static void b(cgq $$0, bpy<cgq> $$1) {
      $$1.a(
         cjn.k,
         10,
         ImmutableList.of(bte.a($$1x -> !b($$0, $$1x)), buc.a(cgr::c, bqn.a(5, 0.75F)), bsu.a(1.0F), brw.a(20), new bqx(), cgv.a(), brb.a(cgr::h, bya.o)),
         bya.o
      );
   }

   private static void c(bpy<cgq> $$0) {
      $$0.a(
         cjn.l,
         10,
         ImmutableList.of(
            d(),
            bso.a(cgr::b, 14.0F),
            btb.a(cgp::gm, cgr::i),
            buc.a($$0x -> !$$0x.gt(), bri.a(bya.ai, 2, 1.0F)),
            buc.a(cgq::gt, bri.a(bya.ai, 4, 0.6F)),
            new bsm(ImmutableList.of(Pair.of(bso.a(bol.ay, 8.0F), 1), Pair.of(bsh.a(0.6F, 2, 1), 1), Pair.of(new bqz(10, 20), 1)))
         ),
         bya.ai
      );
   }

   private static void d(bpy<cgq> $$0) {
      $$0.a(cjn.m, 10, ImmutableList.of(brj.a(cgr::v, 1.0F, true, 9), cgy.a(9), cgz.a(200, 200)), bya.ad);
   }

   private static void e(bpy<cgq> $$0) {
      $$0.a(cjn.n, 10, ImmutableList.of(bst.b(bya.z, 1.0F, 12, true), b(), c(), brb.a(cgr::l, bya.z)), bya.z);
   }

   private static void f(bpy<cgq> $$0) {
      $$0.a(
         cjn.o,
         10,
         ImmutableList.of(
            brx.a(0.8F),
            bso.a(cgr::b, 8.0F),
            buc.a(buc.a(bof::bL), btl.a(ImmutableList.builder().addAll(a()).add(Pair.of(buc.a((Predicate<cgq>)($$0x -> true)), 1)).build())),
            bqy.a(8, cgr::a)
         ),
         bya.s
      );
   }

   private static ImmutableList<Pair<bsa<box>, Integer>> a() {
      return ImmutableList.of(Pair.of(bso.a(bol.bw, 8.0F), 1), Pair.of(bso.a(bol.ay, 8.0F), 1), Pair.of(bso.a(8.0F), 1));
   }

   private static bsm<box> b() {
      return new bsm<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bqz(30, 60), 1)).build());
   }

   private static bsm<cgq> c() {
      return new bsm<>(
         ImmutableList.of(
            Pair.of(bsh.a(0.6F), 2), Pair.of(brm.a(bol.ay, 8, bya.q, 0.6F, 2), 2), Pair.of(buc.a(cgr::f, bsw.a(0.6F, 3)), 2), Pair.of(new bqz(30, 60), 1)
         )
      );
   }

   private static bqq<bpf> d() {
      return bst.a(bya.aw, 1.0F, 8, false);
   }

   private static bqq<cgq> e() {
      return bqu.a(cgq::o_, bya.M, bya.z, B);
   }

   private static bqq<cgq> f() {
      return bqu.a(cgr::h, bya.ar, bya.z, A);
   }

   protected static void a(cgq $$0) {
      bpy<cgq> $$1 = $$0.dM();
      cjn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cjn.m, cjn.k, cjn.n, cjn.l, cjn.o, cjn.b));
      cjn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bya.o));
      if (!$$1.a(bya.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(bya.ai)) {
         $$1.b(bya.aj);
      }

      $$0.x($$1.a(bya.aj));
   }

   private static boolean f(cgq $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         bof $$1 = $$0.cW();
         return $$1 instanceof cgq && ((cgq)$$1).o_() || $$1 instanceof cgk && ((cgk)$$1).o_();
      }
   }

   protected static void a(cgq $$0, cel $$1) {
      k($$0);
      cpq $$2;
      if ($$1.q().a(cpt.sh)) {
         $$0.a($$1, $$1.q().M());
         $$2 = $$1.q();
         $$1.am();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dM().b(bya.ae);
         c($$0, $$2);
         d((box)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cpq.h);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cgq $$0, cpq $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bmk.b));
      }

      $$0.q($$1);
   }

   private static cpq a(cel $$0) {
      cpq $$1 = $$0.q();
      cpq $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.am();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cgq $$0, boolean $$1) {
      cpq $$2 = $$0.b(bmk.b);
      $$0.a(bmk.b, cpq.h);
      if ($$0.gm()) {
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
            cpq $$6 = $$0.eR();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(cgq $$0) {
      if (r($$0) && !$$0.eS().b()) {
         $$0.b($$0.eS());
         $$0.a(bmk.b, cpq.h);
      }
   }

   private static void d(cgq $$0, cpq $$1) {
      cpq $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cgq $$0, List<cpq> $$1) {
      Optional<cia> $$2 = $$0.dM().c(bya.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cgq $$0, List<cpq> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cgq $$0, cia $$1, List<cpq> $$2) {
      a($$0, $$2, $$1.dh());
   }

   private static void a(cgq $$0, List<cpq> $$1, eov $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bmk.b);

         for (cpq $$3 : $$1) {
            bqr.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cpq> g(cgq $$0) {
      ekg $$1 = $$0.dJ().o().aM().getLootTable(ejw.aL);
      List<cpq> $$2 = $$1.a(new eke.a((apa)$$0.dJ()).a(emj.a, $$0).a(emi.j));
      return $$2;
   }

   private static boolean a(box $$0, box $$1) {
      return $$1.ai() != bol.Y ? false : awt.a($$0.dJ().X()).i() < 0.1F;
   }

   protected static boolean a(cgq $$0, cpq $$1) {
      if ($$0.o_() && $$1.a(aum.V)) {
         return false;
      } else if ($$1.a(aum.T)) {
         return false;
      } else if (t($$0) && $$0.dM().a(bya.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(cpt.sh)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cpq $$0) {
      return $$0.a(aum.U);
   }

   private static boolean a(cgq $$0, bof $$1) {
      return !($$1 instanceof boz $$2) ? false : !$$2.o_() || !$$2.bx() || g((box)$$0) || g($$2) || $$2 instanceof cgq && $$2.cW() == null;
   }

   private static boolean b(cgq $$0, box $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cgq $$0) {
      bpy<cgq> $$1 = $$0.dM();
      if ($$1.a(bya.ar)) {
         box $$2 = $$1.c(bya.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends box> i(cgq $$0) {
      bpy<cgq> $$1 = $$0.dM();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<box> $$2 = bqr.a($$0, bya.ab);
         if ($$2.isPresent() && bzg.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bya.ac)) {
               Optional<cia> $$3 = $$1.c(bya.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<boz> $$4 = $$1.c(bya.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cia> $$5 = $$1.c(bya.am);
               return $$5.isPresent() && bzg.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cia $$0, boolean $$1) {
      List<cgq> $$2 = $$0.dJ().a(cgq.class, $$0.cE().g(16.0));
      $$2.stream().filter(cgr::d).filter($$2x -> !$$1 || bqr.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dJ().Z().b(cwa.O)) {
            d((cgp)$$1x, $$0);
         } else {
            c((cgp)$$1x, $$0);
         }
      });
   }

   public static bml a(cgq $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cpq $$4 = $$3.a(1);
         c($$0, $$4);
         d((box)$$0);
         k($$0);
         return bml.b;
      } else {
         return bml.d;
      }
   }

   protected static boolean b(cgq $$0, cpq $$1) {
      return !t($$0) && !r($$0) && $$0.gm() && b($$1);
   }

   protected static void a(cgq $$0, box $$1) {
      if (!($$1 instanceof cgq)) {
         if (u($$0)) {
            a($$0, false);
         }

         bpy<cgq> $$2 = $$0.dM();
         $$2.b(bya.ai);
         $$2.b(bya.aj);
         $$2.b(bya.ad);
         if ($$1 instanceof cia) {
            $$2.a(bya.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ai() != $$1.ai()) {
               $$2.b(bya.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(bya.z, $$1, 100L);
            if (bzg.d($$0, $$1)) {
               b((cgp)$$0, $$1);
            }
         } else if ($$1.ai() == bol.Y && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cgp)$$0, $$1);
         }
      }
   }

   protected static void a(cgp $$0, box $$1) {
      if (!$$0.dM().c(cjn.n)) {
         if (bzg.d($$0, $$1)) {
            if (!bqr.a($$0, $$1, 4.0)) {
               if ($$1.ai() == bol.bw && $$0.dJ().Z().b(cwa.O)) {
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

   public static Optional<ato> c(cgq $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static ato a(cgq $$0, cjn $$1) {
      if ($$1 == cjn.k) {
         return atp.ta;
      } else if ($$0.gl()) {
         return atp.tf;
      } else if ($$1 == cjn.n && j($$0)) {
         return atp.tf;
      } else if ($$1 == cjn.m) {
         return atp.sY;
      } else if ($$1 == cjn.l) {
         return atp.tb;
      } else if (e((box)$$0)) {
         return atp.td;
      } else {
         return s($$0) ? atp.tf : atp.sZ;
      }
   }

   private static boolean j(cgq $$0) {
      bpy<cgq> $$1 = $$0.dM();
      return !$$1.a(bya.z) ? false : $$1.c(bya.z).get().a($$0, 12.0);
   }

   protected static List<cgp> d(cgq $$0) {
      return $$0.dM().c(bya.ao).orElse(ImmutableList.of());
   }

   private static List<cgp> e(cgp $$0) {
      return $$0.dM().c(bya.an).orElse(ImmutableList.of());
   }

   public static boolean a(box $$0) {
      for (cpq $$2 : $$0.eV()) {
         cpl $$3 = $$2.d();
         if ($$3 instanceof cnc && ((cnc)$$3).f().a(cne.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(cgq $$0) {
      $$0.dM().b(bya.m);
      $$0.N().n();
   }

   private static bqq<box> g() {
      bsp.a $$0 = new bsp.a(o);
      return bqu.a($$1 -> $$1.o_() && $$0.a($$1.dJ().z), bya.al, bya.s, p);
   }

   protected static void b(cgp $$0, box $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ai() != bol.Y || $$1x.u() && ((cgk)$$1).gr()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cgp $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cgp $$0, box $$1) {
      if (bzg.d($$0, $$1)) {
         $$0.dM().b(bya.E);
         $$0.dM().a(bya.ab, $$1.ct(), 600L);
         if ($$1.ai() == bol.Y && $$0.u()) {
            c($$0);
         }

         if ($$1.ai() == bol.bw && $$0.dJ().Z().b(cwa.O)) {
            $$0.dM().a(bya.ac, true, 600L);
         }
      }
   }

   private static void d(cgp $$0, box $$1) {
      Optional<cia> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cgp $$0, box $$1) {
      Optional<box> $$2 = f($$0);
      box $$3 = bqr.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<box> f(cgp $$0) {
      return bqr.a($$0, bya.ab);
   }

   public static Optional<box> e(cgq $$0) {
      return $$0.dM().a(bya.z) ? $$0.dM().c(bya.z) : Optional.empty();
   }

   public static Optional<cia> b(cgp $$0) {
      return $$0.dM().a(bya.l) ? $$0.dM().c(bya.l) : Optional.empty();
   }

   private static void c(cgq $$0, box $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cgq).forEach($$1x -> d((cgq)$$1x, $$1));
   }

   private static void d(cgq $$0, box $$1) {
      bpy<cgq> $$2 = $$0.dM();
      box $$3 = bqr.a($$0, $$2.c(bya.z), $$1);
      $$3 = bqr.a($$0, $$2.c(bya.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cgq $$0) {
      bpy<cgq> $$1 = $$0.dM();
      if (!$$1.a(bya.z)) {
         return true;
      } else {
         box $$2 = $$1.c(bya.z).get();
         bol<?> $$3 = $$2.ai();
         if ($$3 == bol.Y) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bya.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cgq $$0) {
      return !n($$0);
   }

   private static boolean n(cgq $$0) {
      int $$1 = $$0.dM().c(bya.as).orElse(0) + 1;
      int $$2 = $$0.dM().c(bya.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cgq $$0, box $$1) {
      $$0.dM().b(bya.ab);
      $$0.dM().b(bya.o);
      $$0.dM().b(bya.m);
      $$0.dM().a(bya.z, $$1, (long)q.a($$0.dJ().z));
      c((cgp)$$0);
   }

   protected static void c(cgp $$0) {
      $$0.dM().a(bya.ah, true, (long)d.a($$0.dJ().z));
   }

   private static void o(cgq $$0) {
      $$0.dM().a(bya.av, true, 200L);
   }

   private static eov p(cgq $$0) {
      eov $$1 = bzu.a($$0, 4, 2);
      return $$1 == null ? $$0.dh() : $$1;
   }

   private static boolean q(cgq $$0) {
      return $$0.dM().a(bya.av);
   }

   protected static boolean d(cgp $$0) {
      return $$0.dM().c(cjn.b);
   }

   private static boolean c(box $$0) {
      return $$0.b(cpt.vP);
   }

   private static void d(box $$0) {
      $$0.dM().a(bya.ad, true, 119L);
   }

   private static boolean r(cgq $$0) {
      return $$0.dM().a(bya.ad);
   }

   private static boolean b(cpq $$0) {
      return $$0.a(c);
   }

   private static boolean c(cpq $$0) {
      return $$0.a(aum.W);
   }

   private static boolean s(cgq $$0) {
      return $$0.dM().a(bya.aw);
   }

   private static boolean e(box $$0) {
      return $$0.dM().a(bya.au);
   }

   private static boolean f(box $$0) {
      return !e($$0);
   }

   public static boolean b(box $$0) {
      return $$0.ai() == bol.bw && $$0.b(cgr::a);
   }

   private static boolean t(cgq $$0) {
      return $$0.dM().a(bya.ag);
   }

   private static boolean g(box $$0) {
      return $$0.dM().a(bya.x);
   }

   private static boolean u(cgq $$0) {
      return !$$0.eS().b();
   }

   private static boolean v(cgq $$0) {
      return $$0.eS().b() || !a($$0.eS());
   }

   public static boolean a(bol<?> $$0) {
      return $$0 == bol.bv || $$0 == bol.br;
   }
}
