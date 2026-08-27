import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cgc {
   public static final int a = 8;
   public static final int b = 4;
   public static final coy c = cpg.oH;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final blh d = axh.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final blh o = axh.a(10, 40);
   private static final blh p = axh.a(10, 30);
   private static final blh q = axh.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final blh A = axh.a(5, 7);
   private static final blh B = axh.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bpj<?> a(cgb $$0, bpj<cgb> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(ciy.a));
      $$1.b(ciy.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cgb $$0, awp $$1) {
      int $$2 = d.a($$1);
      $$0.dO().a(bxl.ah, true, (long)$$2);
   }

   private static void a(bpj<cgb> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new brg(45, 90), new brk(), bqy.a(), e(), f(), cgl.a(), cgh.a(119), bsn.a(300, cgc::a), bsq.a()));
   }

   private static void b(bpj<cgb> $$0) {
      $$0.a(ciy.b, 10, ImmutableList.of(brz.a(cgc::b, 14.0F), bsm.a(cga::gh, cgc::i), btn.a(cgb::u, cgi.a()), d(), g(), b(), c(), bsc.a(bnw.bw, 4)));
   }

   private static void b(cgb $$0, bpj<cgb> $$1) {
      $$1.a(
         ciy.k,
         10,
         ImmutableList.of(bsp.a($$1x -> !b($$0, $$1x)), btn.a(cgc::c, bpy.a(5, 0.75F)), bsf.a(1.0F), brh.a(20), new bqi(), cgg.a(), bqm.a(cgc::h, bxl.o)),
         bxl.o
      );
   }

   private static void c(bpj<cgb> $$0) {
      $$0.a(
         ciy.l,
         10,
         ImmutableList.of(
            d(),
            brz.a(cgc::b, 14.0F),
            bsm.a(cga::gh, cgc::i),
            btn.a($$0x -> !$$0x.go(), bqt.a(bxl.ai, 2, 1.0F)),
            btn.a(cgb::go, bqt.a(bxl.ai, 4, 0.6F)),
            new brx(ImmutableList.of(Pair.of(brz.a(bnw.ay, 8.0F), 1), Pair.of(brs.a(0.6F, 2, 1), 1), Pair.of(new bqk(10, 20), 1)))
         ),
         bxl.ai
      );
   }

   private static void d(bpj<cgb> $$0) {
      $$0.a(ciy.m, 10, ImmutableList.of(bqu.a(cgc::v, 1.0F, true, 9), cgj.a(9), cgk.a(200, 200)), bxl.ad);
   }

   private static void e(bpj<cgb> $$0) {
      $$0.a(ciy.n, 10, ImmutableList.of(bse.b(bxl.z, 1.0F, 12, true), b(), c(), bqm.a(cgc::l, bxl.z)), bxl.z);
   }

   private static void f(bpj<cgb> $$0) {
      $$0.a(
         ciy.o,
         10,
         ImmutableList.of(
            bri.a(0.8F),
            brz.a(cgc::b, 8.0F),
            btn.a(btn.a(bnq::bO), bsw.a(ImmutableList.builder().addAll(a()).add(Pair.of(btn.a((Predicate<cgb>)($$0x -> true)), 1)).build())),
            bqj.a(8, cgc::a)
         ),
         bxl.s
      );
   }

   private static ImmutableList<Pair<brl<boi>, Integer>> a() {
      return ImmutableList.of(Pair.of(brz.a(bnw.bw, 8.0F), 1), Pair.of(brz.a(bnw.ay, 8.0F), 1), Pair.of(brz.a(8.0F), 1));
   }

   private static brx<boi> b() {
      return new brx<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bqk(30, 60), 1)).build());
   }

   private static brx<cgb> c() {
      return new brx<>(
         ImmutableList.of(
            Pair.of(brs.a(0.6F), 2), Pair.of(bqx.a(bnw.ay, 8, bxl.q, 0.6F, 2), 2), Pair.of(btn.a(cgc::f, bsh.a(0.6F, 3)), 2), Pair.of(new bqk(30, 60), 1)
         )
      );
   }

   private static bqb<boq> d() {
      return bse.a(bxl.aw, 1.0F, 8, false);
   }

   private static bqb<cgb> e() {
      return bqf.a(cgb::o_, bxl.M, bxl.z, B);
   }

   private static bqb<cgb> f() {
      return bqf.a(cgc::h, bxl.ar, bxl.z, A);
   }

   protected static void a(cgb $$0) {
      bpj<cgb> $$1 = $$0.dO();
      ciy $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ciy.m, ciy.k, ciy.n, ciy.l, ciy.o, ciy.b));
      ciy $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bxl.o));
      if (!$$1.a(bxl.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(bxl.ai)) {
         $$1.b(bxl.aj);
      }

      $$0.x($$1.a(bxl.aj));
   }

   private static boolean f(cgb $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         bnq $$1 = $$0.cZ();
         return $$1 instanceof cgb && ((cgb)$$1).o_() || $$1 instanceof cfv && ((cfv)$$1).o_();
      }
   }

   protected static void a(cgb $$0, cdw $$1) {
      k($$0);
      cpd $$2;
      if ($$1.q().a(cpg.sh)) {
         $$0.a($$1, $$1.q().M());
         $$2 = $$1.q();
         $$1.am();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dO().b(bxl.ae);
         c($$0, $$2);
         d((boi)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cpd.h);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cgb $$0, cpd $$1) {
      if (u($$0)) {
         $$0.b($$0.b(blv.b));
      }

      $$0.o($$1);
   }

   private static cpd a(cdw $$0) {
      cpd $$1 = $$0.q();
      cpd $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.am();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cgb $$0, boolean $$1) {
      cpd $$2 = $$0.b(blv.b);
      $$0.a(blv.b, cpd.h);
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
            cpd $$6 = $$0.eT();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cgb $$0) {
      if (r($$0) && !$$0.eU().b()) {
         $$0.b($$0.eU());
         $$0.a(blv.b, cpd.h);
      }
   }

   private static void d(cgb $$0, cpd $$1) {
      cpd $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cgb $$0, List<cpd> $$1) {
      Optional<chl> $$2 = $$0.dO().c(bxl.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cgb $$0, List<cpd> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cgb $$0, chl $$1, List<cpd> $$2) {
      a($$0, $$2, $$1.dk());
   }

   private static void a(cgb $$0, List<cpd> $$1, enz $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(blv.b);

         for (cpd $$3 : $$1) {
            bqc.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cpd> g(cgb $$0) {
      ejk $$1 = $$0.dM().o().aL().getLootTable(eja.aL);
      List<cpd> $$2 = $$1.a(new eji.a((aow)$$0.dM()).a(eln.a, $$0).a(elm.j));
      return $$2;
   }

   private static boolean a(boi $$0, boi $$1) {
      return $$1.ai() != bnw.Y ? false : awp.a($$0.dM().X()).i() < 0.1F;
   }

   protected static boolean a(cgb $$0, cpd $$1) {
      if ($$0.o_() && $$1.a(aui.V)) {
         return false;
      } else if ($$1.a(aui.T)) {
         return false;
      } else if (t($$0) && $$0.dO().a(bxl.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cpg.sh)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cpd $$0) {
      return $$0.a(aui.U);
   }

   private static boolean a(cgb $$0, bnq $$1) {
      return !($$1 instanceof bok $$2) ? false : !$$2.o_() || !$$2.bx() || g((boi)$$0) || g($$2) || $$2 instanceof cgb && $$2.cZ() == null;
   }

   private static boolean b(cgb $$0, boi $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cgb $$0) {
      bpj<cgb> $$1 = $$0.dO();
      if ($$1.a(bxl.ar)) {
         boi $$2 = $$1.c(bxl.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends boi> i(cgb $$0) {
      bpj<cgb> $$1 = $$0.dO();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<boi> $$2 = bqc.a($$0, bxl.ab);
         if ($$2.isPresent() && byr.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bxl.ac)) {
               Optional<chl> $$3 = $$1.c(bxl.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bok> $$4 = $$1.c(bxl.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<chl> $$5 = $$1.c(bxl.am);
               return $$5.isPresent() && byr.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(chl $$0, boolean $$1) {
      List<cgb> $$2 = $$0.dM().a(cgb.class, $$0.cH().g(16.0));
      $$2.stream().filter(cgc::d).filter($$2x -> !$$1 || bqc.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dM().Z().b(cvn.O)) {
            d((cga)$$1x, $$0);
         } else {
            c((cga)$$1x, $$0);
         }
      });
   }

   public static blw a(cgb $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cpd $$4 = $$3.a(1);
         c($$0, $$4);
         d((boi)$$0);
         k($$0);
         return blw.b;
      } else {
         return blw.d;
      }
   }

   protected static boolean b(cgb $$0, cpd $$1) {
      return !t($$0) && !r($$0) && $$0.gh() && b($$1);
   }

   protected static void a(cgb $$0, boi $$1) {
      if (!($$1 instanceof cgb)) {
         if (u($$0)) {
            a($$0, false);
         }

         bpj<cgb> $$2 = $$0.dO();
         $$2.b(bxl.ai);
         $$2.b(bxl.aj);
         $$2.b(bxl.ad);
         if ($$1 instanceof chl) {
            $$2.a(bxl.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ai() != $$1.ai()) {
               $$2.b(bxl.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(bxl.z, $$1, 100L);
            if (byr.d($$0, $$1)) {
               b((cga)$$0, $$1);
            }
         } else if ($$1.ai() == bnw.Y && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cga)$$0, $$1);
         }
      }
   }

   protected static void a(cga $$0, boi $$1) {
      if (!$$0.dO().c(ciy.n)) {
         if (byr.d($$0, $$1)) {
            if (!bqc.a($$0, $$1, 4.0)) {
               if ($$1.ai() == bnw.bw && $$0.dM().Z().b(cvn.O)) {
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

   public static Optional<atk> c(cgb $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static atk a(cgb $$0, ciy $$1) {
      if ($$1 == ciy.k) {
         return atl.ta;
      } else if ($$0.gg()) {
         return atl.tf;
      } else if ($$1 == ciy.n && j($$0)) {
         return atl.tf;
      } else if ($$1 == ciy.m) {
         return atl.sY;
      } else if ($$1 == ciy.l) {
         return atl.tb;
      } else if (e((boi)$$0)) {
         return atl.td;
      } else {
         return s($$0) ? atl.tf : atl.sZ;
      }
   }

   private static boolean j(cgb $$0) {
      bpj<cgb> $$1 = $$0.dO();
      return !$$1.a(bxl.z) ? false : $$1.c(bxl.z).get().a($$0, 12.0);
   }

   protected static List<cga> d(cgb $$0) {
      return $$0.dO().c(bxl.ao).orElse(ImmutableList.of());
   }

   private static List<cga> e(cga $$0) {
      return $$0.dO().c(bxl.an).orElse(ImmutableList.of());
   }

   public static boolean a(boi $$0) {
      for (cpd $$2 : $$0.bL()) {
         coy $$3 = $$2.d();
         if ($$3 instanceof cmn && ((cmn)$$3).d() == cmp.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cgb $$0) {
      $$0.dO().b(bxl.m);
      $$0.N().n();
   }

   private static bqb<boi> g() {
      bsa.a $$0 = new bsa.a(o);
      return bqf.a($$1 -> $$1.o_() && $$0.a($$1.dM().z), bxl.al, bxl.s, p);
   }

   protected static void b(cga $$0, boi $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ai() != bnw.Y || $$1x.u() && ((cfv)$$1).gm()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cga $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cga $$0, boi $$1) {
      if (byr.d($$0, $$1)) {
         $$0.dO().b(bxl.E);
         $$0.dO().a(bxl.ab, $$1.cw(), 600L);
         if ($$1.ai() == bnw.Y && $$0.u()) {
            c($$0);
         }

         if ($$1.ai() == bnw.bw && $$0.dM().Z().b(cvn.O)) {
            $$0.dO().a(bxl.ac, true, 600L);
         }
      }
   }

   private static void d(cga $$0, boi $$1) {
      Optional<chl> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cga $$0, boi $$1) {
      Optional<boi> $$2 = f($$0);
      boi $$3 = bqc.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<boi> f(cga $$0) {
      return bqc.a($$0, bxl.ab);
   }

   public static Optional<boi> e(cgb $$0) {
      return $$0.dO().a(bxl.z) ? $$0.dO().c(bxl.z) : Optional.empty();
   }

   public static Optional<chl> b(cga $$0) {
      return $$0.dO().a(bxl.l) ? $$0.dO().c(bxl.l) : Optional.empty();
   }

   private static void c(cgb $$0, boi $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cgb).forEach($$1x -> d((cgb)$$1x, $$1));
   }

   private static void d(cgb $$0, boi $$1) {
      bpj<cgb> $$2 = $$0.dO();
      boi $$3 = bqc.a($$0, $$2.c(bxl.z), $$1);
      $$3 = bqc.a($$0, $$2.c(bxl.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cgb $$0) {
      bpj<cgb> $$1 = $$0.dO();
      if (!$$1.a(bxl.z)) {
         return true;
      } else {
         boi $$2 = $$1.c(bxl.z).get();
         bnw<?> $$3 = $$2.ai();
         if ($$3 == bnw.Y) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bxl.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cgb $$0) {
      return !n($$0);
   }

   private static boolean n(cgb $$0) {
      int $$1 = $$0.dO().c(bxl.as).orElse(0) + 1;
      int $$2 = $$0.dO().c(bxl.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cgb $$0, boi $$1) {
      $$0.dO().b(bxl.ab);
      $$0.dO().b(bxl.o);
      $$0.dO().b(bxl.m);
      $$0.dO().a(bxl.z, $$1, (long)q.a($$0.dM().z));
      c((cga)$$0);
   }

   protected static void c(cga $$0) {
      $$0.dO().a(bxl.ah, true, (long)d.a($$0.dM().z));
   }

   private static void o(cgb $$0) {
      $$0.dO().a(bxl.av, true, 200L);
   }

   private static enz p(cgb $$0) {
      enz $$1 = bzf.a($$0, 4, 2);
      return $$1 == null ? $$0.dk() : $$1;
   }

   private static boolean q(cgb $$0) {
      return $$0.dO().a(bxl.av);
   }

   protected static boolean d(cga $$0) {
      return $$0.dO().c(ciy.b);
   }

   private static boolean c(boi $$0) {
      return $$0.b(cpg.vP);
   }

   private static void d(boi $$0) {
      $$0.dO().a(bxl.ad, true, 119L);
   }

   private static boolean r(cgb $$0) {
      return $$0.dO().a(bxl.ad);
   }

   private static boolean b(cpd $$0) {
      return $$0.a(c);
   }

   private static boolean c(cpd $$0) {
      return $$0.a(aui.W);
   }

   private static boolean s(cgb $$0) {
      return $$0.dO().a(bxl.aw);
   }

   private static boolean e(boi $$0) {
      return $$0.dO().a(bxl.au);
   }

   private static boolean f(boi $$0) {
      return !e($$0);
   }

   public static boolean b(boi $$0) {
      return $$0.ai() == bnw.bw && $$0.b(cgc::a);
   }

   private static boolean t(cgb $$0) {
      return $$0.dO().a(bxl.ag);
   }

   private static boolean g(boi $$0) {
      return $$0.dO().a(bxl.x);
   }

   private static boolean u(cgb $$0) {
      return !$$0.eU().b();
   }

   private static boolean v(cgb $$0) {
      return $$0.eU().b() || !a($$0.eU());
   }

   public static boolean a(bnw<?> $$0) {
      return $$0 == bnw.bv || $$0 == bnw.br;
   }
}
