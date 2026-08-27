import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cds {
   public static final int a = 8;
   public static final int b = 4;
   public static final cmm c = cmu.oF;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bjg d = avj.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bjg o = avj.a(10, 40);
   private static final bjg p = avj.a(10, 30);
   private static final bjg q = avj.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bjg A = avj.a(5, 7);
   private static final bjg B = avj.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bnf<?> a(cdr $$0, bnf<cdr> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cgn.a));
      $$1.b(cgn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cdr $$0, aup $$1) {
      int $$2 = d.a($$1);
      $$0.dO().a(bvh.ag, true, (long)$$2);
   }

   private static void a(bnf<cdr> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bpc(45, 90), new bpg(), bou.a(), e(), f(), ceb.a(), cdx.a(119), bqj.a(300, cds::a), bqm.a()));
   }

   private static void b(bnf<cdr> $$0) {
      $$0.a(cgn.b, 10, ImmutableList.of(bpv.a(cds::b, 14.0F), bqi.a(cdq::gf, cds::i), brj.a(cdr::u, cdy.a()), d(), g(), b(), c(), bpy.a(blt.bv, 4)));
   }

   private static void b(cdr $$0, bnf<cdr> $$1) {
      $$1.a(
         cgn.k,
         10,
         ImmutableList.of(bql.a($$1x -> !b($$0, $$1x)), brj.a(cds::c, bnu.a(5, 0.75F)), bqb.a(1.0F), bpd.a(20), new boe(), cdw.a(), boi.a(cds::h, bvh.o)),
         bvh.o
      );
   }

   private static void c(bnf<cdr> $$0) {
      $$0.a(
         cgn.l,
         10,
         ImmutableList.of(
            d(),
            bpv.a(cds::b, 14.0F),
            bqi.a(cdq::gf, cds::i),
            brj.a($$0x -> !$$0x.gm(), bop.a(bvh.ah, 2, 1.0F)),
            brj.a(cdr::gm, bop.a(bvh.ah, 4, 0.6F)),
            new bpt(ImmutableList.of(Pair.of(bpv.a(blt.ax, 8.0F), 1), Pair.of(bpo.a(0.6F, 2, 1), 1), Pair.of(new bog(10, 20), 1)))
         ),
         bvh.ah
      );
   }

   private static void d(bnf<cdr> $$0) {
      $$0.a(cgn.m, 10, ImmutableList.of(boq.a(cds::v, 1.0F, true, 9), cdz.a(9), cea.a(200, 200)), bvh.ac);
   }

   private static void e(bnf<cdr> $$0) {
      $$0.a(cgn.n, 10, ImmutableList.of(bqa.b(bvh.z, 1.0F, 12, true), b(), c(), boi.a(cds::l, bvh.z)), bvh.z);
   }

   private static void f(bnf<cdr> $$0) {
      $$0.a(
         cgn.o,
         10,
         ImmutableList.of(
            bpe.a(0.8F),
            bpv.a(cds::b, 8.0F),
            brj.a(brj.a(blp::bO), bqs.a(ImmutableList.builder().addAll(a()).add(Pair.of(brj.a((Predicate<cdr>)($$0x -> true)), 1)).build())),
            bof.a(8, cds::a)
         ),
         bvh.s
      );
   }

   private static ImmutableList<Pair<bph<bmf>, Integer>> a() {
      return ImmutableList.of(Pair.of(bpv.a(blt.bv, 8.0F), 1), Pair.of(bpv.a(blt.ax, 8.0F), 1), Pair.of(bpv.a(8.0F), 1));
   }

   private static bpt<bmf> b() {
      return new bpt<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bog(30, 60), 1)).build());
   }

   private static bpt<cdr> c() {
      return new bpt<>(
         ImmutableList.of(
            Pair.of(bpo.a(0.6F), 2), Pair.of(bot.a(blt.ax, 8, bvh.q, 0.6F, 2), 2), Pair.of(brj.a(cds::f, bqd.a(0.6F, 3)), 2), Pair.of(new bog(30, 60), 1)
         )
      );
   }

   private static bnx<bmo> d() {
      return bqa.a(bvh.av, 1.0F, 8, false);
   }

   private static bnx<cdr> e() {
      return bob.a(cdr::o_, bvh.L, bvh.z, B);
   }

   private static bnx<cdr> f() {
      return bob.a(cds::h, bvh.aq, bvh.z, A);
   }

   protected static void a(cdr $$0) {
      bnf<cdr> $$1 = $$0.dO();
      cgn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgn.m, cgn.k, cgn.n, cgn.l, cgn.o, cgn.b));
      cgn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bvh.o));
      if (!$$1.a(bvh.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(bvh.ah)) {
         $$1.b(bvh.ai);
      }

      $$0.x($$1.a(bvh.ai));
   }

   private static boolean f(cdr $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         blp $$1 = $$0.cZ();
         return $$1 instanceof cdr && ((cdr)$$1).o_() || $$1 instanceof cdl && ((cdl)$$1).o_();
      }
   }

   protected static void a(cdr $$0, cbo $$1) {
      k($$0);
      cmr $$2;
      if ($$1.q().a(cmu.sf)) {
         $$0.a($$1, $$1.q().L());
         $$2 = $$1.q();
         $$1.am();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dO().b(bvh.ad);
         c($$0, $$2);
         d((bmf)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cmr.f);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cdr $$0, cmr $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bju.b));
      }

      $$0.o($$1);
   }

   private static cmr a(cbo $$0) {
      cmr $$1 = $$0.q();
      cmr $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.am();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cdr $$0, boolean $$1) {
      cmr $$2 = $$0.b(bju.b);
      $$0.a(bju.b, cmr.f);
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
            cmr $$6 = $$0.eT();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(cdr $$0) {
      if (r($$0) && !$$0.eU().b()) {
         $$0.b($$0.eU());
         $$0.a(bju.b, cmr.f);
      }
   }

   private static void d(cdr $$0, cmr $$1) {
      cmr $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cdr $$0, List<cmr> $$1) {
      Optional<cfb> $$2 = $$0.dO().c(bvh.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cdr $$0, List<cmr> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cdr $$0, cfb $$1, List<cmr> $$2) {
      a($$0, $$2, $$1.dk());
   }

   private static void a(cdr $$0, List<cmr> $$1, elm $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bju.b);

         for (cmr $$3 : $$1) {
            bny.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cmr> g(cdr $$0) {
      egx $$1 = $$0.dM().o().aJ().getLootTable(egn.aL);
      List<cmr> $$2 = $$1.a(new egv.a((amz)$$0.dM()).a(eja.a, $$0).a(eiz.j));
      return $$2;
   }

   private static boolean a(bmf $$0, bmf $$1) {
      return $$1.ai() != blt.X ? false : aup.a($$0.dM().X()).i() < 0.1F;
   }

   protected static boolean a(cdr $$0, cmr $$1) {
      if ($$0.o_() && $$1.a(asj.V)) {
         return false;
      } else if ($$1.a(asj.T)) {
         return false;
      } else if (t($$0) && $$0.dO().a(bvh.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cmu.sf)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cmr $$0) {
      return $$0.a(asj.U);
   }

   private static boolean a(cdr $$0, blp $$1) {
      return !($$1 instanceof bmh $$2) ? false : !$$2.o_() || !$$2.bx() || g((bmf)$$0) || g($$2) || $$2 instanceof cdr && $$2.cZ() == null;
   }

   private static boolean b(cdr $$0, bmf $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cdr $$0) {
      bnf<cdr> $$1 = $$0.dO();
      if ($$1.a(bvh.aq)) {
         bmf $$2 = $$1.c(bvh.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bmf> i(cdr $$0) {
      bnf<cdr> $$1 = $$0.dO();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bmf> $$2 = bny.a($$0, bvh.aa);
         if ($$2.isPresent() && bwm.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bvh.ab)) {
               Optional<cfb> $$3 = $$1.c(bvh.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bmh> $$4 = $$1.c(bvh.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cfb> $$5 = $$1.c(bvh.al);
               return $$5.isPresent() && bwm.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cfb $$0, boolean $$1) {
      List<cdr> $$2 = $$0.dM().a(cdr.class, $$0.cH().g(16.0));
      $$2.stream().filter(cds::d).filter($$2x -> !$$1 || bny.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dM().Z().b(cte.O)) {
            d((cdq)$$1x, $$0);
         } else {
            c((cdq)$$1x, $$0);
         }
      });
   }

   public static bjv a(cdr $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cmr $$4 = $$3.a(1);
         c($$0, $$4);
         d((bmf)$$0);
         k($$0);
         return bjv.b;
      } else {
         return bjv.d;
      }
   }

   protected static boolean b(cdr $$0, cmr $$1) {
      return !t($$0) && !r($$0) && $$0.gf() && b($$1);
   }

   protected static void a(cdr $$0, bmf $$1) {
      if (!($$1 instanceof cdr)) {
         if (u($$0)) {
            a($$0, false);
         }

         bnf<cdr> $$2 = $$0.dO();
         $$2.b(bvh.ah);
         $$2.b(bvh.ai);
         $$2.b(bvh.ac);
         if ($$1 instanceof cfb) {
            $$2.a(bvh.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ai() != $$1.ai()) {
               $$2.b(bvh.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(bvh.z, $$1, 100L);
            if (bwm.d($$0, $$1)) {
               b((cdq)$$0, $$1);
            }
         } else if ($$1.ai() == blt.X && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((cdq)$$0, $$1);
         }
      }
   }

   protected static void a(cdq $$0, bmf $$1) {
      if (!$$0.dO().c(cgn.n)) {
         if (bwm.d($$0, $$1)) {
            if (!bny.a($$0, $$1, 4.0)) {
               if ($$1.ai() == blt.bv && $$0.dM().Z().b(cte.O)) {
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

   public static Optional<arl> c(cdr $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static arl a(cdr $$0, cgn $$1) {
      if ($$1 == cgn.k) {
         return arm.sK;
      } else if ($$0.ge()) {
         return arm.sP;
      } else if ($$1 == cgn.n && j($$0)) {
         return arm.sP;
      } else if ($$1 == cgn.m) {
         return arm.sI;
      } else if ($$1 == cgn.l) {
         return arm.sL;
      } else if (e((bmf)$$0)) {
         return arm.sN;
      } else {
         return s($$0) ? arm.sP : arm.sJ;
      }
   }

   private static boolean j(cdr $$0) {
      bnf<cdr> $$1 = $$0.dO();
      return !$$1.a(bvh.z) ? false : $$1.c(bvh.z).get().a($$0, 12.0);
   }

   protected static List<cdq> d(cdr $$0) {
      return $$0.dO().c(bvh.an).orElse(ImmutableList.of());
   }

   private static List<cdq> e(cdq $$0) {
      return $$0.dO().c(bvh.am).orElse(ImmutableList.of());
   }

   public static boolean a(bmf $$0) {
      for (cmr $$2 : $$0.bL()) {
         cmm $$3 = $$2.d();
         if ($$3 instanceof ckb && ((ckb)$$3).d() == ckd.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(cdr $$0) {
      $$0.dO().b(bvh.m);
      $$0.N().n();
   }

   private static bnx<bmf> g() {
      bpw.a $$0 = new bpw.a(o);
      return bob.a($$1 -> $$1.o_() && $$0.a($$1.dM().z), bvh.ak, bvh.s, p);
   }

   protected static void b(cdq $$0, bmf $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ai() != blt.X || $$1x.u() && ((cdl)$$1).gk()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(cdq $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(cdq $$0, bmf $$1) {
      if (bwm.d($$0, $$1)) {
         $$0.dO().b(bvh.E);
         $$0.dO().a(bvh.aa, $$1.cw(), 600L);
         if ($$1.ai() == blt.X && $$0.u()) {
            c($$0);
         }

         if ($$1.ai() == blt.bv && $$0.dM().Z().b(cte.O)) {
            $$0.dO().a(bvh.ab, true, 600L);
         }
      }
   }

   private static void d(cdq $$0, bmf $$1) {
      Optional<cfb> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(cdq $$0, bmf $$1) {
      Optional<bmf> $$2 = f($$0);
      bmf $$3 = bny.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bmf> f(cdq $$0) {
      return bny.a($$0, bvh.aa);
   }

   public static Optional<bmf> e(cdr $$0) {
      return $$0.dO().a(bvh.z) ? $$0.dO().c(bvh.z) : Optional.empty();
   }

   public static Optional<cfb> b(cdq $$0) {
      return $$0.dO().a(bvh.l) ? $$0.dO().c(bvh.l) : Optional.empty();
   }

   private static void c(cdr $$0, bmf $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cdr).forEach($$1x -> d((cdr)$$1x, $$1));
   }

   private static void d(cdr $$0, bmf $$1) {
      bnf<cdr> $$2 = $$0.dO();
      bmf $$3 = bny.a($$0, $$2.c(bvh.z), $$1);
      $$3 = bny.a($$0, $$2.c(bvh.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cdr $$0) {
      bnf<cdr> $$1 = $$0.dO();
      if (!$$1.a(bvh.z)) {
         return true;
      } else {
         bmf $$2 = $$1.c(bvh.z).get();
         blt<?> $$3 = $$2.ai();
         if ($$3 == blt.X) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bvh.aq, $$2) : false;
         }
      }
   }

   private static boolean m(cdr $$0) {
      return !n($$0);
   }

   private static boolean n(cdr $$0) {
      int $$1 = $$0.dO().c(bvh.ar).orElse(0) + 1;
      int $$2 = $$0.dO().c(bvh.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cdr $$0, bmf $$1) {
      $$0.dO().b(bvh.aa);
      $$0.dO().b(bvh.o);
      $$0.dO().b(bvh.m);
      $$0.dO().a(bvh.z, $$1, (long)q.a($$0.dM().z));
      c((cdq)$$0);
   }

   protected static void c(cdq $$0) {
      $$0.dO().a(bvh.ag, true, (long)d.a($$0.dM().z));
   }

   private static void o(cdr $$0) {
      $$0.dO().a(bvh.au, true, 200L);
   }

   private static elm p(cdr $$0) {
      elm $$1 = bxa.a($$0, 4, 2);
      return $$1 == null ? $$0.dk() : $$1;
   }

   private static boolean q(cdr $$0) {
      return $$0.dO().a(bvh.au);
   }

   protected static boolean d(cdq $$0) {
      return $$0.dO().c(cgn.b);
   }

   private static boolean c(bmf $$0) {
      return $$0.b(cmu.vM);
   }

   private static void d(bmf $$0) {
      $$0.dO().a(bvh.ac, true, 119L);
   }

   private static boolean r(cdr $$0) {
      return $$0.dO().a(bvh.ac);
   }

   private static boolean b(cmr $$0) {
      return $$0.a(c);
   }

   private static boolean c(cmr $$0) {
      return $$0.a(asj.W);
   }

   private static boolean s(cdr $$0) {
      return $$0.dO().a(bvh.av);
   }

   private static boolean e(bmf $$0) {
      return $$0.dO().a(bvh.at);
   }

   private static boolean f(bmf $$0) {
      return !e($$0);
   }

   public static boolean b(bmf $$0) {
      return $$0.ai() == blt.bv && $$0.b(cds::a);
   }

   private static boolean t(cdr $$0) {
      return $$0.dO().a(bvh.af);
   }

   private static boolean g(bmf $$0) {
      return $$0.dO().a(bvh.x);
   }

   private static boolean u(cdr $$0) {
      return !$$0.eU().b();
   }

   private static boolean v(cdr $$0) {
      return $$0.eU().b() || !a($$0.eU());
   }

   public static boolean a(blt<?> $$0) {
      return $$0 == blt.bu || $$0 == blt.bq;
   }
}
