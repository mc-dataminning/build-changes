import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cqc {
   public static final int a = 8;
   public static final int b = 4;
   public static final czj c = czr.px;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final btr d = baq.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final btr o = baq.a(10, 40);
   private static final btr p = baq.a(10, 30);
   private static final btr q = baq.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final btr A = baq.a(5, 7);
   private static final btr B = baq.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static byj<?> a(cqb $$0, byj<cqb> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(ctg.a));
      $$1.b(ctg.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cqb $$0, azv $$1) {
      int $$2 = d.a($$1);
      $$0.eb().a(cgl.ai, true, (long)$$2);
   }

   private static void a(byj<cqb> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new cag(45, 90), new cak(), bzy.a(), e(), f(), cql.a(), cqh.a(119), cbn.a(300, cqc::a), cbq.a()));
   }

   private static void b(byj<cqb> $$0) {
      $$0.a(
         ctg.b, 10, ImmutableList.of(caz.a(cqc::b, 14.0F), cbm.a(($$0x, $$1) -> $$1.t(), cqc::b), ccn.a(cqb::j, cqi.a()), d(), g(), b(), c(), cbc.a(bwr.bS, 4))
      );
   }

   private static void b(cqb $$0, byj<cqb> $$1) {
      $$1.a(
         ctg.k,
         10,
         ImmutableList.of(
            cbp.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), ccn.a(cqc::c, byy.a(5, 0.75F)), cbf.a(1.0F), cah.a(20), new bzi(), cqg.a(), bzm.a(cqc::g, cgl.p)
         ),
         cgl.p
      );
   }

   private static void c(byj<cqb> $$0) {
      $$0.a(
         ctg.l,
         10,
         ImmutableList.of(
            d(),
            caz.a(cqc::b, 14.0F),
            cbm.a(($$0x, $$1) -> $$1.t(), cqc::b),
            ccn.a($$0x -> !$$0x.gy(), bzt.a(cgl.aj, 2, 1.0F)),
            ccn.a(cqb::gy, bzt.a(cgl.aj, 4, 0.6F)),
            new cax(ImmutableList.of(Pair.of(caz.a(bwr.aR, 8.0F), 1), Pair.of(cas.a(0.6F, 2, 1), 1), Pair.of(new bzk(10, 20), 1)))
         ),
         cgl.aj
      );
   }

   private static void d(byj<cqb> $$0) {
      $$0.a(ctg.m, 10, ImmutableList.of(bzu.a(cqc::t, 1.0F, true, 9), cqj.a(9), cqk.a(200, 200)), cgl.ae);
   }

   private static void e(byj<cqb> $$0) {
      $$0.a(ctg.n, 10, ImmutableList.of(cbe.b(cgl.A, 1.0F, 12, true), b(), c(), bzm.a(cqc::j, cgl.A)), cgl.A);
   }

   private static void f(byj<cqb> $$0) {
      $$0.a(
         ctg.o,
         10,
         ImmutableList.of(
            cai.a(0.8F),
            caz.a(cqc::b, 8.0F),
            ccn.a(ccn.a(bwi::bX), cbw.a(ImmutableList.builder().addAll(a()).add(Pair.of(ccn.a((Predicate<cqb>)($$0x -> true)), 1)).build())),
            bzj.a(8, cqc::a)
         ),
         cgl.t
      );
   }

   private static ImmutableList<Pair<cal<bxj>, Integer>> a() {
      return ImmutableList.of(Pair.of(caz.a(bwr.bS, 8.0F), 1), Pair.of(caz.a(bwr.aR, 8.0F), 1), Pair.of(caz.a(8.0F), 1));
   }

   private static cax<bxj> b() {
      return new cax<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bzk(30, 60), 1)).build());
   }

   private static cax<cqb> c() {
      return new cax<>(
         ImmutableList.of(
            Pair.of(cas.a(0.6F), 2), Pair.of(bzx.a(bwr.aR, 8, cgl.r, 0.6F, 2), 2), Pair.of(ccn.a(cqc::f, cbh.a(0.6F, 3)), 2), Pair.of(new bzk(30, 60), 1)
         )
      );
   }

   private static bzb<bxr> d() {
      return cbe.a(cgl.ax, 1.0F, 8, false);
   }

   private static bzb<cqb> e() {
      return bzf.a(cqb::n_, cgl.N, cgl.A, B);
   }

   private static bzb<cqb> f() {
      return bzf.a(cqc::g, cgl.as, cgl.A, A);
   }

   protected static void a(cqb $$0) {
      byj<cqb> $$1 = $$0.eb();
      ctg $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctg.m, ctg.k, ctg.n, ctg.l, ctg.o, ctg.b));
      ctg $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgl.p));
      if (!$$1.a(cgl.t) && e($$0)) {
         $$0.bN();
      }

      if (!$$1.a(cgl.aj)) {
         $$1.b(cgl.ak);
      }

      $$0.x($$1.a(cgl.ak));
   }

   private static boolean e(cqb $$0) {
      if (!$$0.n_()) {
         return false;
      } else {
         bwi $$1 = $$0.dj();
         return $$1 instanceof cqb && ((cqb)$$1).n_() || $$1 instanceof cpv && ((cpv)$$1).n_();
      }
   }

   protected static void a(arq $$0, cqb $$1, cnr $$2) {
      i($$1);
      czn $$3;
      if ($$2.f().a(czr.tq)) {
         $$1.a($$2, $$2.f().M());
         $$3 = $$2.f();
         $$2.aq();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.eb().b(cgl.af);
         a($$0, $$1, $$3);
         d((bxj)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(czn.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(arq $$0, cqb $$1, czn $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(buf.b));
      }

      $$1.l($$2);
   }

   private static czn a(cnr $$0) {
      czn $$1 = $$0.f();
      czn $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.aq();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(arq $$0, cqb $$1, boolean $$2) {
      czn $$3 = $$1.b(buf.b);
      $$1.a(buf.b, czn.k);
      if ($$1.t()) {
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
            czn $$7 = $$1.fa();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(arq $$0, cqb $$1) {
      if (p($$1) && !$$1.fb().f()) {
         $$1.a($$0, $$1.fb());
         $$1.a(buf.b, czn.k);
      }
   }

   private static void c(cqb $$0, czn $$1) {
      czn $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cqb $$0, List<czn> $$1) {
      Optional<crm> $$2 = $$0.eb().c(cgl.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cqb $$0, List<czn> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cqb $$0, crm $$1, List<czn> $$2) {
      a($$0, $$2, $$1.ds());
   }

   private static void a(cqb $$0, List<czn> $$1, ffc $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(buf.b);

         for (czn $$3 : $$1) {
            bzc.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<czn> f(cqb $$0) {
      ezy $$1 = $$0.dU().p().bc().b(ezp.aK);
      List<czn> $$2 = $$1.a(new ezw.a((arq)$$0.dU()).a(fcn.a, $$0).a(fcm.k));
      return $$2;
   }

   private static boolean a(bxj $$0, bxj $$1) {
      return $$1.an() != bwr.aj ? false : azv.a($$0.dU().ae()).i() < 0.1F;
   }

   protected static boolean a(cqb $$0, czn $$1) {
      if ($$0.n_() && $$1.a(axk.U)) {
         return false;
      } else if ($$1.a(axk.S)) {
         return false;
      } else if (r($$0) && $$0.eb().a(cgl.p)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(czr.tq)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(czn $$0) {
      return $$0.a(axk.T);
   }

   private static boolean a(cqb $$0, bwi $$1) {
      return !($$1 instanceof bxl $$2) ? false : !$$2.n_() || !$$2.bI() || g((bxj)$$0) || g($$2) || $$2 instanceof cqb && $$2.dj() == null;
   }

   private static boolean b(arq $$0, cqb $$1, bxj $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cqb $$0) {
      byj<cqb> $$1 = $$0.eb();
      if ($$1.a(cgl.as)) {
         bxj $$2 = $$1.c(cgl.as).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bxj> b(arq $$0, cqb $$1) {
      byj<cqb> $$2 = $$1.eb();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bxj> $$3 = bzc.a($$1, cgl.ac);
         if ($$3.isPresent() && chr.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cgl.ad)) {
               Optional<crm> $$4 = $$2.c(cgl.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bxl> $$5 = $$2.c(cgl.N);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<crm> $$6 = $$2.c(cgl.an);
               return $$6.isPresent() && chr.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(arq $$0, crm $$1, boolean $$2) {
      List<cqb> $$3 = $$1.dU().a(cqb.class, $$1.cQ().g(16.0));
      $$3.stream().filter(cqc::c).filter($$2x -> !$$2 || bzc.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.O().c(dji.Q)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bug a(arq $$0, cqb $$1, crm $$2, buf $$3) {
      czn $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         czn $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bxj)$$1);
         i($$1);
         return bug.a;
      } else {
         return bug.e;
      }
   }

   protected static boolean b(cqb $$0, czn $$1) {
      return !r($$0) && !p($$0) && $$0.t() && b($$1);
   }

   protected static void a(arq $$0, cqb $$1, bxj $$2) {
      if (!($$2 instanceof cqb)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         byj<cqb> $$3 = $$1.eb();
         $$3.b(cgl.aj);
         $$3.b(cgl.ak);
         $$3.b(cgl.ae);
         if ($$2 instanceof crm) {
            $$3.a(cgl.ah, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.an() != $$2.an()) {
               $$3.b(cgl.A);
            }
         });
         if ($$1.n_()) {
            $$3.a(cgl.A, $$2, 100L);
            if (chr.d($$0, $$1, $$2)) {
               b($$0, (cqa)$$1, $$2);
            }
         } else if ($$2.an() == bwr.aj && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cqa)$$1, $$2);
         }
      }
   }

   protected static void a(arq $$0, cqa $$1, bxj $$2) {
      if (!$$1.eb().c(ctg.n)) {
         if (chr.d($$0, $$1, $$2)) {
            if (!bzc.a($$1, $$2, 4.0)) {
               if ($$2.an() == bwr.bS && $$0.O().c(dji.Q)) {
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

   public static Optional<awm> b(cqb $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cqb $$0, ctg $$1) {
      if ($$1 == ctg.k) {
         return awn.uv;
      } else if ($$0.q()) {
         return awn.uA;
      } else if ($$1 == ctg.n && h($$0)) {
         return awn.uA;
      } else if ($$1 == ctg.m) {
         return awn.ut;
      } else if ($$1 == ctg.l) {
         return awn.uw;
      } else if (e((bxj)$$0)) {
         return awn.uy;
      } else {
         return q($$0) ? awn.uA : awn.uu;
      }
   }

   private static boolean h(cqb $$0) {
      byj<cqb> $$1 = $$0.eb();
      return !$$1.a(cgl.A) ? false : $$1.c(cgl.A).get().a($$0, 12.0);
   }

   protected static List<cqa> c(cqb $$0) {
      return $$0.eb().c(cgl.ap).orElse(ImmutableList.of());
   }

   private static List<cqa> d(cqa $$0) {
      return $$0.eb().c(cgl.ao).orElse(ImmutableList.of());
   }

   public static boolean a(bxj $$0) {
      for (bws $$1 : bwt.i) {
         if ($$0.a($$1).a(axk.V)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cqb $$0) {
      $$0.eb().b(cgl.n);
      $$0.O().m();
   }

   private static bzb<bxj> g() {
      cba.a $$0 = new cba.a(o);
      return bzf.a($$1 -> $$1.n_() && $$0.a($$1.dU().A), cgl.am, cgl.t, p);
   }

   protected static void b(arq $$0, cqa $$1, bxj $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.an() != bwr.aj || $$2x.j() && ((cpv)$$2).gu()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(arq $$0, cqa $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(arq $$0, cqa $$1, bxj $$2) {
      if (chr.d($$0, $$1, $$2)) {
         $$1.eb().b(cgl.F);
         $$1.eb().a(cgl.ac, $$2.cF(), 600L);
         if ($$2.an() == bwr.aj && $$1.j()) {
            b($$1);
         }

         if ($$2.an() == bwr.bS && $$0.O().c(dji.Q)) {
            $$1.eb().a(cgl.ad, true, 600L);
         }
      }
   }

   private static void d(arq $$0, cqa $$1, bxj $$2) {
      Optional<crm> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(arq $$0, cqa $$1, bxj $$2) {
      Optional<bxj> $$3 = e($$1);
      bxj $$4 = bzc.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bxj> e(cqa $$0) {
      return bzc.a($$0, cgl.ac);
   }

   public static Optional<bxj> d(cqb $$0) {
      return $$0.eb().a(cgl.A) ? $$0.eb().c(cgl.A) : Optional.empty();
   }

   public static Optional<crm> a(cqa $$0) {
      return $$0.eb().a(cgl.l) ? $$0.eb().c(cgl.l) : Optional.empty();
   }

   private static void a(cqb $$0, bxj $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cqb).forEach($$1x -> b((cqb)$$1x, $$1));
   }

   private static void b(cqb $$0, bxj $$1) {
      byj<cqb> $$2 = $$0.eb();
      bxj $$3 = bzc.a($$0, $$2.c(cgl.A), $$1);
      $$3 = bzc.a($$0, $$2.c(cgl.p), $$3);
      c($$0, $$3);
   }

   private static boolean j(cqb $$0) {
      byj<cqb> $$1 = $$0.eb();
      if (!$$1.a(cgl.A)) {
         return true;
      } else {
         bxj $$2 = $$1.c(cgl.A).get();
         bwr<?> $$3 = $$2.an();
         if ($$3 == bwr.aj) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cgl.as, $$2) : false;
         }
      }
   }

   private static boolean k(cqb $$0) {
      return !l($$0);
   }

   private static boolean l(cqb $$0) {
      int $$1 = $$0.eb().c(cgl.at).orElse(0) + 1;
      int $$2 = $$0.eb().c(cgl.au).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cqb $$0, bxj $$1) {
      $$0.eb().b(cgl.ac);
      $$0.eb().b(cgl.p);
      $$0.eb().b(cgl.n);
      $$0.eb().a(cgl.A, $$1, (long)q.a($$0.dU().A));
      b((cqa)$$0);
   }

   protected static void b(cqa $$0) {
      $$0.eb().a(cgl.ai, true, (long)d.a($$0.dU().A));
   }

   private static void m(cqb $$0) {
      $$0.eb().a(cgl.aw, true, 200L);
   }

   private static ffc n(cqb $$0) {
      ffc $$1 = cif.a($$0, 4, 2);
      return $$1 == null ? $$0.ds() : $$1;
   }

   private static boolean o(cqb $$0) {
      return $$0.eb().a(cgl.aw);
   }

   protected static boolean c(cqa $$0) {
      return $$0.eb().c(ctg.b);
   }

   private static boolean c(bxj $$0) {
      return $$0.b(czr.xg);
   }

   private static void d(bxj $$0) {
      $$0.eb().a(cgl.ae, true, 119L);
   }

   private static boolean p(cqb $$0) {
      return $$0.eb().a(cgl.ae);
   }

   private static boolean b(czn $$0) {
      return $$0.a(c);
   }

   private static boolean c(czn $$0) {
      return $$0.a(axk.ac);
   }

   private static boolean q(cqb $$0) {
      return $$0.eb().a(cgl.ax);
   }

   private static boolean e(bxj $$0) {
      return $$0.eb().a(cgl.av);
   }

   private static boolean f(bxj $$0) {
      return !e($$0);
   }

   public static boolean b(bxj $$0) {
      return $$0.an() == bwr.bS && $$0.b(cqc::a);
   }

   private static boolean r(cqb $$0) {
      return $$0.eb().a(cgl.ah);
   }

   private static boolean g(bxj $$0) {
      return $$0.eb().a(cgl.y);
   }

   private static boolean s(cqb $$0) {
      return !$$0.fb().f();
   }

   private static boolean t(cqb $$0) {
      return $$0.fb().f() || !a($$0.fb());
   }

   public static boolean a(bwr<?> $$0) {
      return $$0 == bwr.bR || $$0 == bwr.bN;
   }
}
