import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cdi {
   public static final int a = 8;
   public static final int b = 4;
   public static final cmc c = cmk.oF;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final biw d = auz.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final biw o = auz.a(10, 40);
   private static final biw p = auz.a(10, 30);
   private static final biw q = auz.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final biw A = auz.a(5, 7);
   private static final biw B = auz.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bmv<?> a(cdh $$0, bmv<cdh> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cgd.a));
      $$1.b(cgd.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cdh $$0, auf $$1) {
      int $$2 = d.a($$1);
      $$0.dO().a(bux.ag, true, (long)$$2);
   }

   private static void a(bmv<cdh> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bos(45, 90), new bow(), bok.a(), e(), f(), cdr.a(), cdn.a(119), bpz.a(300, cdi::a), bqc.a()));
   }

   private static void b(bmv<cdh> $$0) {
      $$0.a(cgd.b, 10, ImmutableList.of(bpl.a(cdi::b, 14.0F), bpy.a(cdg::gf, cdi::i), bqz.a(cdh::u, cdo.a()), d(), g(), b(), c(), bpo.a(blj.bv, 4)));
   }

   private static void b(cdh $$0, bmv<cdh> $$1) {
      $$1.a(
         cgd.k,
         10,
         ImmutableList.of(bqb.a($$1x -> !b($$0, $$1x)), bqz.a(cdi::c, bnk.a(5, 0.75F)), bpr.a(1.0F), bot.a(20), new bnu(), cdm.a(), bny.a(cdi::h, bux.o)),
         bux.o
      );
   }

   private static void c(bmv<cdh> $$0) {
      $$0.a(
         cgd.l,
         10,
         ImmutableList.of(
            d(),
            bpl.a(cdi::b, 14.0F),
            bpy.a(cdg::gf, cdi::i),
            bqz.a($$0x -> !$$0x.gm(), bof.a(bux.ah, 2, 1.0F)),
            bqz.a(cdh::gm, bof.a(bux.ah, 4, 0.6F)),
            new bpj(ImmutableList.of(Pair.of(bpl.a(blj.ax, 8.0F), 1), Pair.of(bpe.a(0.6F, 2, 1), 1), Pair.of(new bnw(10, 20), 1)))
         ),
         bux.ah
      );
   }

   private static void d(bmv<cdh> $$0) {
      $$0.a(cgd.m, 10, ImmutableList.of(bog.a(cdi::v, 1.0F, true, 9), cdp.a(9), cdq.a(200, 200)), bux.ac);
   }

   private static void e(bmv<cdh> $$0) {
      $$0.a(cgd.n, 10, ImmutableList.of(bpq.b(bux.z, 1.0F, 12, true), b(), c(), bny.a(cdi::l, bux.z)), bux.z);
   }

   private static void f(bmv<cdh> $$0) {
      $$0.a(
         cgd.o,
         10,
         ImmutableList.of(
            bou.a(0.8F),
            bpl.a(cdi::b, 8.0F),
            bqz.a(bqz.a(blf::bO), bqi.a(ImmutableList.builder().addAll(a()).add(Pair.of(bqz.a((Predicate<cdh>)($$0x -> true)), 1)).build())),
            bnv.a(8, cdi::a)
         ),
         bux.s
      );
   }

   private static ImmutableList<Pair<box<blv>, Integer>> a() {
      return ImmutableList.of(Pair.of(bpl.a(blj.bv, 8.0F), 1), Pair.of(bpl.a(blj.ax, 8.0F), 1), Pair.of(bpl.a(8.0F), 1));
   }

   private static bpj<blv> b() {
      return new bpj<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bnw(30, 60), 1)).build());
   }

   private static bpj<cdh> c() {
      return new bpj<>(
         ImmutableList.of(
            Pair.of(bpe.a(0.6F), 2), Pair.of(boj.a(blj.ax, 8, bux.q, 0.6F, 2), 2), Pair.of(bqz.a(cdi::f, bpt.a(0.6F, 3)), 2), Pair.of(new bnw(30, 60), 1)
         )
      );
   }

   private static bnn<bme> d() {
      return bpq.a(bux.av, 1.0F, 8, false);
   }

   private static bnn<cdh> e() {
      return bnr.a(cdh::o_, bux.L, bux.z, B);
   }

   private static bnn<cdh> f() {
      return bnr.a(cdi::h, bux.aq, bux.z, A);
   }

   protected static void a(cdh $$0) {
      bmv<cdh> $$1 = $$0.dO();
      cgd $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgd.m, cgd.k, cgd.n, cgd.l, cgd.o, cgd.b));
      cgd $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bux.o));
      if (!$$1.a(bux.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(bux.ah)) {
         $$1.b(bux.ai);
      }

      $$0.x($$1.a(bux.ai));
   }

   private static boolean f(cdh $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         blf $$1 = $$0.cZ();
         return $$1 instanceof cdh && ((cdh)$$1).o_() || $$1 instanceof cdb && ((cdb)$$1).o_();
      }
   }

   protected static void a(cdh $$0, cbe $$1) {
      k($$0);
      cmh $$2;
      if ($$1.q().a(cmk.sf)) {
         $$0.a($$1, $$1.q().L());
         $$2 = $$1.q();
         $$1.am();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dO().b(bux.ad);
         c($$0, $$2);
         d((blv)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cmh.f);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cdh $$0, cmh $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bjk.b));
      }

      $$0.o($$1);
   }

   private static cmh a(cbe $$0) {
      cmh $$1 = $$0.q();
      cmh $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.am();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cdh $$0, boolean $$1) {
      cmh $$2 = $$0.b(bjk.b);
      $$0.a(bjk.b, cmh.f);
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
            cmh $$6 = $$0.eT();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cdh $$0) {
      if (r($$0) && !$$0.eU().b()) {
         $$0.b($$0.eU());
         $$0.a(bjk.b, cmh.f);
      }
   }

   private static void d(cdh $$0, cmh $$1) {
      cmh $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cdh $$0, List<cmh> $$1) {
      Optional<cer> $$2 = $$0.dO().c(bux.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cdh $$0, List<cmh> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cdh $$0, cer $$1, List<cmh> $$2) {
      a($$0, $$2, $$1.dk());
   }

   private static void a(cdh $$0, List<cmh> $$1, elb $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bjk.b);

         for (cmh $$3 : $$1) {
            bno.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cmh> g(cdh $$0) {
      egm $$1 = $$0.dM().n().aJ().getLootTable(egc.aL);
      List<cmh> $$2 = $$1.a(new egk.a((amp)$$0.dM()).a(eip.a, $$0).a(eio.j));
      return $$2;
   }

   private static boolean a(blv $$0, blv $$1) {
      return $$1.ai() != blj.X ? false : auf.a($$0.dM().W()).i() < 0.1F;
   }

   protected static boolean a(cdh $$0, cmh $$1) {
      if ($$0.o_() && $$1.a(arz.V)) {
         return false;
      } else if ($$1.a(arz.T)) {
         return false;
      } else if (t($$0) && $$0.dO().a(bux.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cmk.sf)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cmh $$0) {
      return $$0.a(arz.U);
   }

   private static boolean a(cdh $$0, blf $$1) {
      return !($$1 instanceof blx $$2) ? false : !$$2.o_() || !$$2.bx() || g((blv)$$0) || g($$2) || $$2 instanceof cdh && $$2.cZ() == null;
   }

   private static boolean b(cdh $$0, blv $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cdh $$0) {
      bmv<cdh> $$1 = $$0.dO();
      if ($$1.a(bux.aq)) {
         blv $$2 = $$1.c(bux.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends blv> i(cdh $$0) {
      bmv<cdh> $$1 = $$0.dO();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<blv> $$2 = bno.a($$0, bux.aa);
         if ($$2.isPresent() && bwc.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bux.ab)) {
               Optional<cer> $$3 = $$1.c(bux.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<blx> $$4 = $$1.c(bux.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cer> $$5 = $$1.c(bux.al);
               return $$5.isPresent() && bwc.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cer $$0, boolean $$1) {
      List<cdh> $$2 = $$0.dM().a(cdh.class, $$0.cH().g(16.0));
      $$2.stream().filter(cdi::d).filter($$2x -> !$$1 || bno.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dM().Y().b(csu.O)) {
            d((cdg)$$1x, $$0);
         } else {
            c((cdg)$$1x, $$0);
         }
      });
   }

   public static bjl a(cdh $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cmh $$4 = $$3.a(1);
         c($$0, $$4);
         d((blv)$$0);
         k($$0);
         return bjl.b;
      } else {
         return bjl.d;
      }
   }

   protected static boolean b(cdh $$0, cmh $$1) {
      return !t($$0) && !r($$0) && $$0.gf() && b($$1);
   }

   protected static void a(cdh $$0, blv $$1) {
      if (!($$1 instanceof cdh)) {
         if (u($$0)) {
            a($$0, false);
         }

         bmv<cdh> $$2 = $$0.dO();
         $$2.b(bux.ah);
         $$2.b(bux.ai);
         $$2.b(bux.ac);
         if ($$1 instanceof cer) {
            $$2.a(bux.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ai() != $$1.ai()) {
               $$2.b(bux.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(bux.z, $$1, 100L);
            if (bwc.d($$0, $$1)) {
               b((cdg)$$0, $$1);
            }
         } else if ($$1.ai() == blj.X && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cdg)$$0, $$1);
         }
      }
   }

   protected static void a(cdg $$0, blv $$1) {
      if (!$$0.dO().c(cgd.n)) {
         if (bwc.d($$0, $$1)) {
            if (!bno.a($$0, $$1, 4.0)) {
               if ($$1.ai() == blj.bv && $$0.dM().Y().b(csu.O)) {
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

   public static Optional<arb> c(cdh $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static arb a(cdh $$0, cgd $$1) {
      if ($$1 == cgd.k) {
         return arc.sK;
      } else if ($$0.ge()) {
         return arc.sP;
      } else if ($$1 == cgd.n && j($$0)) {
         return arc.sP;
      } else if ($$1 == cgd.m) {
         return arc.sI;
      } else if ($$1 == cgd.l) {
         return arc.sL;
      } else if (e((blv)$$0)) {
         return arc.sN;
      } else {
         return s($$0) ? arc.sP : arc.sJ;
      }
   }

   private static boolean j(cdh $$0) {
      bmv<cdh> $$1 = $$0.dO();
      return !$$1.a(bux.z) ? false : $$1.c(bux.z).get().a($$0, 12.0);
   }

   protected static List<cdg> d(cdh $$0) {
      return $$0.dO().c(bux.an).orElse(ImmutableList.of());
   }

   private static List<cdg> e(cdg $$0) {
      return $$0.dO().c(bux.am).orElse(ImmutableList.of());
   }

   public static boolean a(blv $$0) {
      for (cmh $$2 : $$0.bL()) {
         cmc $$3 = $$2.d();
         if ($$3 instanceof cjr && ((cjr)$$3).d() == cjt.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cdh $$0) {
      $$0.dO().b(bux.m);
      $$0.N().n();
   }

   private static bnn<blv> g() {
      bpm.a $$0 = new bpm.a(o);
      return bnr.a($$1 -> $$1.o_() && $$0.a($$1.dM().z), bux.ak, bux.s, p);
   }

   protected static void b(cdg $$0, blv $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ai() != blj.X || $$1x.u() && ((cdb)$$1).gk()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cdg $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cdg $$0, blv $$1) {
      if (bwc.d($$0, $$1)) {
         $$0.dO().b(bux.E);
         $$0.dO().a(bux.aa, $$1.cw(), 600L);
         if ($$1.ai() == blj.X && $$0.u()) {
            c($$0);
         }

         if ($$1.ai() == blj.bv && $$0.dM().Y().b(csu.O)) {
            $$0.dO().a(bux.ab, true, 600L);
         }
      }
   }

   private static void d(cdg $$0, blv $$1) {
      Optional<cer> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cdg $$0, blv $$1) {
      Optional<blv> $$2 = f($$0);
      blv $$3 = bno.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<blv> f(cdg $$0) {
      return bno.a($$0, bux.aa);
   }

   public static Optional<blv> e(cdh $$0) {
      return $$0.dO().a(bux.z) ? $$0.dO().c(bux.z) : Optional.empty();
   }

   public static Optional<cer> b(cdg $$0) {
      return $$0.dO().a(bux.l) ? $$0.dO().c(bux.l) : Optional.empty();
   }

   private static void c(cdh $$0, blv $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cdh).forEach($$1x -> d((cdh)$$1x, $$1));
   }

   private static void d(cdh $$0, blv $$1) {
      bmv<cdh> $$2 = $$0.dO();
      blv $$3 = bno.a($$0, $$2.c(bux.z), $$1);
      $$3 = bno.a($$0, $$2.c(bux.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cdh $$0) {
      bmv<cdh> $$1 = $$0.dO();
      if (!$$1.a(bux.z)) {
         return true;
      } else {
         blv $$2 = $$1.c(bux.z).get();
         blj<?> $$3 = $$2.ai();
         if ($$3 == blj.X) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bux.aq, $$2) : false;
         }
      }
   }

   private static boolean m(cdh $$0) {
      return !n($$0);
   }

   private static boolean n(cdh $$0) {
      int $$1 = $$0.dO().c(bux.ar).orElse(0) + 1;
      int $$2 = $$0.dO().c(bux.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cdh $$0, blv $$1) {
      $$0.dO().b(bux.aa);
      $$0.dO().b(bux.o);
      $$0.dO().b(bux.m);
      $$0.dO().a(bux.z, $$1, (long)q.a($$0.dM().z));
      c((cdg)$$0);
   }

   protected static void c(cdg $$0) {
      $$0.dO().a(bux.ag, true, (long)d.a($$0.dM().z));
   }

   private static void o(cdh $$0) {
      $$0.dO().a(bux.au, true, 200L);
   }

   private static elb p(cdh $$0) {
      elb $$1 = bwq.a($$0, 4, 2);
      return $$1 == null ? $$0.dk() : $$1;
   }

   private static boolean q(cdh $$0) {
      return $$0.dO().a(bux.au);
   }

   protected static boolean d(cdg $$0) {
      return $$0.dO().c(cgd.b);
   }

   private static boolean c(blv $$0) {
      return $$0.b(cmk.vM);
   }

   private static void d(blv $$0) {
      $$0.dO().a(bux.ac, true, 119L);
   }

   private static boolean r(cdh $$0) {
      return $$0.dO().a(bux.ac);
   }

   private static boolean b(cmh $$0) {
      return $$0.a(c);
   }

   private static boolean c(cmh $$0) {
      return $$0.a(arz.W);
   }

   private static boolean s(cdh $$0) {
      return $$0.dO().a(bux.av);
   }

   private static boolean e(blv $$0) {
      return $$0.dO().a(bux.at);
   }

   private static boolean f(blv $$0) {
      return !e($$0);
   }

   public static boolean b(blv $$0) {
      return $$0.ai() == blj.bv && $$0.b(cdi::a);
   }

   private static boolean t(cdh $$0) {
      return $$0.dO().a(bux.af);
   }

   private static boolean g(blv $$0) {
      return $$0.dO().a(bux.x);
   }

   private static boolean u(cdh $$0) {
      return !$$0.eU().b();
   }

   private static boolean v(cdh $$0) {
      return $$0.eU().b() || !a($$0.eU());
   }

   public static boolean a(blj<?> $$0) {
      return $$0 == blj.bu || $$0 == blj.bq;
   }
}
