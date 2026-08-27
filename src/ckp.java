import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ckp {
   public static final int a = 8;
   public static final int b = 4;
   public static final ctl c = ctt.oI;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bph d = aze.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bph o = aze.a(10, 40);
   private static final bph p = aze.a(10, 30);
   private static final bph q = aze.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bph A = aze.a(5, 7);
   private static final bph B = aze.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bts<?> a(cko $$0, bts<cko> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(cnn.a));
      $$1.b(cnn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cko $$0, aym $$1) {
      int $$2 = d.a($$1);
      $$0.dS().a(cbu.ah, true, (long)$$2);
   }

   private static void a(bts<cko> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bvp(45, 90), new bvt(), bvh.a(), e(), f(), cky.a(), cku.a(119), bww.a(300, ckp::a), bwz.a()));
   }

   private static void b(bts<cko> $$0) {
      $$0.a(cnn.b, 10, ImmutableList.of(bwi.a(ckp::b, 14.0F), bwv.a(ckn::gq, ckp::i), bxw.a(cko::s, ckv.a()), d(), g(), b(), c(), bwl.a(bsc.by, 4)));
   }

   private static void b(cko $$0, bts<cko> $$1) {
      $$1.a(
         cnn.k,
         10,
         ImmutableList.of(bwy.a($$1x -> !b($$0, $$1x)), bxw.a(ckp::c, buh.a(5, 0.75F)), bwo.a(1.0F), bvq.a(20), new bur(), ckt.a(), buv.a(ckp::h, cbu.o)),
         cbu.o
      );
   }

   private static void c(bts<cko> $$0) {
      $$0.a(
         cnn.l,
         10,
         ImmutableList.of(
            d(),
            bwi.a(ckp::b, 14.0F),
            bwv.a(ckn::gq, ckp::i),
            bxw.a($$0x -> !$$0x.gx(), bvc.a(cbu.ai, 2, 1.0F)),
            bxw.a(cko::gx, bvc.a(cbu.ai, 4, 0.6F)),
            new bwg(ImmutableList.of(Pair.of(bwi.a(bsc.aA, 8.0F), 1), Pair.of(bwb.a(0.6F, 2, 1), 1), Pair.of(new but(10, 20), 1)))
         ),
         cbu.ai
      );
   }

   private static void d(bts<cko> $$0) {
      $$0.a(cnn.m, 10, ImmutableList.of(bvd.a(ckp::v, 1.0F, true, 9), ckw.a(9), ckx.a(200, 200)), cbu.ad);
   }

   private static void e(bts<cko> $$0) {
      $$0.a(cnn.n, 10, ImmutableList.of(bwn.b(cbu.z, 1.0F, 12, true), b(), c(), buv.a(ckp::l, cbu.z)), cbu.z);
   }

   private static void f(bts<cko> $$0) {
      $$0.a(
         cnn.o,
         10,
         ImmutableList.of(
            bvr.a(0.8F),
            bwi.a(ckp::b, 8.0F),
            bxw.a(bxw.a(brw::bR), bxf.a(ImmutableList.builder().addAll(a()).add(Pair.of(bxw.a((Predicate<cko>)($$0x -> true)), 1)).build())),
            bus.a(8, ckp::a)
         ),
         cbu.s
      );
   }

   private static ImmutableList<Pair<bvu<bsq>, Integer>> a() {
      return ImmutableList.of(Pair.of(bwi.a(bsc.by, 8.0F), 1), Pair.of(bwi.a(bsc.aA, 8.0F), 1), Pair.of(bwi.a(8.0F), 1));
   }

   private static bwg<bsq> b() {
      return new bwg<>(ImmutableList.builder().addAll(a()).add(Pair.of(new but(30, 60), 1)).build());
   }

   private static bwg<cko> c() {
      return new bwg<>(
         ImmutableList.of(
            Pair.of(bwb.a(0.6F), 2), Pair.of(bvg.a(bsc.aA, 8, cbu.q, 0.6F, 2), 2), Pair.of(bxw.a(ckp::f, bwq.a(0.6F, 3)), 2), Pair.of(new but(30, 60), 1)
         )
      );
   }

   private static buk<bsz> d() {
      return bwn.a(cbu.aw, 1.0F, 8, false);
   }

   private static buk<cko> e() {
      return buo.a(cko::p_, cbu.M, cbu.z, B);
   }

   private static buk<cko> f() {
      return buo.a(ckp::h, cbu.ar, cbu.z, A);
   }

   protected static void a(cko $$0) {
      bts<cko> $$1 = $$0.dS();
      cnn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnn.m, cnn.k, cnn.n, cnn.l, cnn.o, cnn.b));
      cnn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cbu.o));
      if (!$$1.a(cbu.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(cbu.ai)) {
         $$1.b(cbu.aj);
      }

      $$0.x($$1.a(cbu.aj));
   }

   private static boolean f(cko $$0) {
      if (!$$0.p_()) {
         return false;
      } else {
         brw $$1 = $$0.dc();
         return $$1 instanceof cko && ((cko)$$1).p_() || $$1 instanceof cki && ((cki)$$1).p_();
      }
   }

   protected static void a(cko $$0, cii $$1) {
      k($$0);
      ctq $$2;
      if ($$1.p().a(ctt.si)) {
         $$0.a($$1, $$1.p().I());
         $$2 = $$1.p();
         $$1.ao();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dS().b(cbu.ae);
         c($$0, $$2);
         d((bsq)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(ctq.i);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(cko $$0, ctq $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bpv.b));
      }

      $$0.q($$1);
   }

   private static ctq a(cii $$0) {
      ctq $$1 = $$0.p();
      ctq $$2 = $$1.a(1);
      if ($$1.e()) {
         $$0.ao();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(cko $$0, boolean $$1) {
      ctq $$2 = $$0.b(bpv.b);
      $$0.a(bpv.b, ctq.i);
      if ($$0.gq()) {
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
            ctq $$6 = $$0.eX();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(cko $$0) {
      if (r($$0) && !$$0.eY().e()) {
         $$0.b($$0.eY());
         $$0.a(bpv.b, ctq.i);
      }
   }

   private static void d(cko $$0, ctq $$1) {
      ctq $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cko $$0, List<ctq> $$1) {
      Optional<cly> $$2 = $$0.dS().c(cbu.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cko $$0, List<ctq> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(cko $$0, cly $$1, List<ctq> $$2) {
      a($$0, $$2, $$1.dn());
   }

   private static void a(cko $$0, List<ctq> $$1, eum $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bpv.b);

         for (ctq $$3 : $$1) {
            bul.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<ctq> g(cko $$0) {
      epm $$1 = $$0.dP().o().be().b(epf.aU);
      List<ctq> $$2 = $$1.a(new epk.a((aqn)$$0.dP()).a(erz.a, $$0).a(ery.k));
      return $$2;
   }

   private static boolean a(bsq $$0, bsq $$1) {
      return $$1.ak() != bsc.Z ? false : aym.a($$0.dP().Y()).i() < 0.1F;
   }

   protected static boolean a(cko $$0, ctq $$1) {
      if ($$0.p_() && $$1.a(awf.V)) {
         return false;
      } else if ($$1.a(awf.T)) {
         return false;
      } else if (t($$0) && $$0.dS().a(cbu.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(ctt.si)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(ctq $$0) {
      return $$0.a(awf.U);
   }

   private static boolean a(cko $$0, brw $$1) {
      return !($$1 instanceof bss $$2) ? false : !$$2.p_() || !$$2.bD() || g((bsq)$$0) || g($$2) || $$2 instanceof cko && $$2.dc() == null;
   }

   private static boolean b(cko $$0, bsq $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(cko $$0) {
      bts<cko> $$1 = $$0.dS();
      if ($$1.a(cbu.ar)) {
         bsq $$2 = $$1.c(cbu.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bsq> i(cko $$0) {
      bts<cko> $$1 = $$0.dS();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bsq> $$2 = bul.a($$0, cbu.ab);
         if ($$2.isPresent() && cda.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(cbu.ac)) {
               Optional<cly> $$3 = $$1.c(cbu.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bss> $$4 = $$1.c(cbu.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cly> $$5 = $$1.c(cbu.am);
               return $$5.isPresent() && cda.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cly $$0, boolean $$1) {
      List<cko> $$2 = $$0.dP().a(cko.class, $$0.cK().g(16.0));
      $$2.stream().filter(ckp::d).filter($$2x -> !$$1 || bul.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dP().aa().b(dav.O)) {
            d((ckn)$$1x, $$0);
         } else {
            c((ckn)$$1x, $$0);
         }
      });
   }

   public static bpw a(cko $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         ctq $$4 = $$3.a(1);
         c($$0, $$4);
         d((bsq)$$0);
         k($$0);
         return bpw.b;
      } else {
         return bpw.d;
      }
   }

   protected static boolean b(cko $$0, ctq $$1) {
      return !t($$0) && !r($$0) && $$0.gq() && b($$1);
   }

   protected static void a(cko $$0, bsq $$1) {
      if (!($$1 instanceof cko)) {
         if (u($$0)) {
            a($$0, false);
         }

         bts<cko> $$2 = $$0.dS();
         $$2.b(cbu.ai);
         $$2.b(cbu.aj);
         $$2.b(cbu.ad);
         if ($$1 instanceof cly) {
            $$2.a(cbu.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ak() != $$1.ak()) {
               $$2.b(cbu.z);
            }
         });
         if ($$0.p_()) {
            $$2.a(cbu.z, $$1, 100L);
            if (cda.d($$0, $$1)) {
               b((ckn)$$0, $$1);
            }
         } else if ($$1.ak() == bsc.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((ckn)$$0, $$1);
         }
      }
   }

   protected static void a(ckn $$0, bsq $$1) {
      if (!$$0.dS().c(cnn.n)) {
         if (cda.d($$0, $$1)) {
            if (!bul.a($$0, $$1, 4.0)) {
               if ($$1.ak() == bsc.by && $$0.dP().aa().b(dav.O)) {
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

   public static Optional<avh> c(cko $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avh a(cko $$0, cnn $$1) {
      if ($$1 == cnn.k) {
         return avi.tE;
      } else if ($$0.gp()) {
         return avi.tJ;
      } else if ($$1 == cnn.n && j($$0)) {
         return avi.tJ;
      } else if ($$1 == cnn.m) {
         return avi.tC;
      } else if ($$1 == cnn.l) {
         return avi.tF;
      } else if (e((bsq)$$0)) {
         return avi.tH;
      } else {
         return s($$0) ? avi.tJ : avi.tD;
      }
   }

   private static boolean j(cko $$0) {
      bts<cko> $$1 = $$0.dS();
      return !$$1.a(cbu.z) ? false : $$1.c(cbu.z).get().a($$0, 12.0);
   }

   protected static List<ckn> d(cko $$0) {
      return $$0.dS().c(cbu.ao).orElse(ImmutableList.of());
   }

   private static List<ckn> e(ckn $$0) {
      return $$0.dS().c(cbu.an).orElse(ImmutableList.of());
   }

   public static boolean a(bsq $$0) {
      for (ctq $$2 : $$0.fb()) {
         ctl $$3 = $$2.g();
         if ($$3 instanceof crf && ((crf)$$3).h().a(crh.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(cko $$0) {
      $$0.dS().b(cbu.m);
      $$0.K().n();
   }

   private static buk<bsq> g() {
      bwj.a $$0 = new bwj.a(o);
      return buo.a($$1 -> $$1.p_() && $$0.a($$1.dP().z), cbu.al, cbu.s, p);
   }

   protected static void b(ckn $$0, bsq $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ak() != bsc.Z || $$1x.s() && ((cki)$$1).gv()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(ckn $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(ckn $$0, bsq $$1) {
      if (cda.d($$0, $$1)) {
         $$0.dS().b(cbu.E);
         $$0.dS().a(cbu.ab, $$1.cz(), 600L);
         if ($$1.ak() == bsc.Z && $$0.s()) {
            c($$0);
         }

         if ($$1.ak() == bsc.by && $$0.dP().aa().b(dav.O)) {
            $$0.dS().a(cbu.ac, true, 600L);
         }
      }
   }

   private static void d(ckn $$0, bsq $$1) {
      Optional<cly> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(ckn $$0, bsq $$1) {
      Optional<bsq> $$2 = f($$0);
      bsq $$3 = bul.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bsq> f(ckn $$0) {
      return bul.a($$0, cbu.ab);
   }

   public static Optional<bsq> e(cko $$0) {
      return $$0.dS().a(cbu.z) ? $$0.dS().c(cbu.z) : Optional.empty();
   }

   public static Optional<cly> b(ckn $$0) {
      return $$0.dS().a(cbu.l) ? $$0.dS().c(cbu.l) : Optional.empty();
   }

   private static void c(cko $$0, bsq $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof cko).forEach($$1x -> d((cko)$$1x, $$1));
   }

   private static void d(cko $$0, bsq $$1) {
      bts<cko> $$2 = $$0.dS();
      bsq $$3 = bul.a($$0, $$2.c(cbu.z), $$1);
      $$3 = bul.a($$0, $$2.c(cbu.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(cko $$0) {
      bts<cko> $$1 = $$0.dS();
      if (!$$1.a(cbu.z)) {
         return true;
      } else {
         bsq $$2 = $$1.c(cbu.z).get();
         bsc<?> $$3 = $$2.ak();
         if ($$3 == bsc.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(cbu.ar, $$2) : false;
         }
      }
   }

   private static boolean m(cko $$0) {
      return !n($$0);
   }

   private static boolean n(cko $$0) {
      int $$1 = $$0.dS().c(cbu.as).orElse(0) + 1;
      int $$2 = $$0.dS().c(cbu.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(cko $$0, bsq $$1) {
      $$0.dS().b(cbu.ab);
      $$0.dS().b(cbu.o);
      $$0.dS().b(cbu.m);
      $$0.dS().a(cbu.z, $$1, (long)q.a($$0.dP().z));
      c((ckn)$$0);
   }

   protected static void c(ckn $$0) {
      $$0.dS().a(cbu.ah, true, (long)d.a($$0.dP().z));
   }

   private static void o(cko $$0) {
      $$0.dS().a(cbu.av, true, 200L);
   }

   private static eum p(cko $$0) {
      eum $$1 = cdo.a($$0, 4, 2);
      return $$1 == null ? $$0.dn() : $$1;
   }

   private static boolean q(cko $$0) {
      return $$0.dS().a(cbu.av);
   }

   protected static boolean d(ckn $$0) {
      return $$0.dS().c(cnn.b);
   }

   private static boolean c(bsq $$0) {
      return $$0.b(ctt.vT);
   }

   private static void d(bsq $$0) {
      $$0.dS().a(cbu.ad, true, 119L);
   }

   private static boolean r(cko $$0) {
      return $$0.dS().a(cbu.ad);
   }

   private static boolean b(ctq $$0) {
      return $$0.a(c);
   }

   private static boolean c(ctq $$0) {
      return $$0.a(awf.Y);
   }

   private static boolean s(cko $$0) {
      return $$0.dS().a(cbu.aw);
   }

   private static boolean e(bsq $$0) {
      return $$0.dS().a(cbu.au);
   }

   private static boolean f(bsq $$0) {
      return !e($$0);
   }

   public static boolean b(bsq $$0) {
      return $$0.ak() == bsc.by && $$0.b(ckp::a);
   }

   private static boolean t(cko $$0) {
      return $$0.dS().a(cbu.ag);
   }

   private static boolean g(bsq $$0) {
      return $$0.dS().a(cbu.x);
   }

   private static boolean u(cko $$0) {
      return !$$0.eY().e();
   }

   private static boolean v(cko $$0) {
      return $$0.eY().e() || !a($$0.eY());
   }

   public static boolean a(bsc<?> $$0) {
      return $$0 == bsc.bx || $$0 == bsc.bt;
   }
}
