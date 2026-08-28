import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class coh {
   public static final int a = 8;
   public static final int b = 4;
   public static final cxg c = cxo.pf;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bsp d = bbg.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bsp o = bbg.a(10, 40);
   private static final bsp p = bbg.a(10, 30);
   private static final bsp q = bbg.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bsp A = bbg.a(5, 7);
   private static final bsp B = bbg.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bxd<?> a(cog $$0, bxd<cog> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(crj.a));
      $$1.b(crj.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cog $$0, bam $$1) {
      int $$2 = d.a($$1);
      $$0.eb().a(cff.ah, true, (long)$$2);
   }

   private static void a(bxd<cog> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new bza(45, 90), new bze(), bys.a(), e(), f(), cor.a(), com.a(119), cah.a(300, coh::a), cak.a()));
   }

   private static void b(bxd<cog> $$0) {
      $$0.a(
         crj.b,
         10,
         ImmutableList.of(bzt.a(coh::b, 14.0F), cag.a(($$0x, $$1) -> $$1.gm(), coh::b), cbh.a(cog::m, coo.a()), d(), g(), b(), c(), bzw.a(bvm.bS, 4))
      );
   }

   private static void b(cog $$0, bxd<cog> $$1) {
      $$1.a(
         crj.k,
         10,
         ImmutableList.of(
            caj.a(($$1x, $$2) -> !b($$1x, $$0, $$2)), cbh.a(coh::c, bxs.a(5, 0.75F)), bzz.a(1.0F), bzb.a(20), new byc(), col.a(), byg.a(coh::g, cff.o)
         ),
         cff.o
      );
   }

   private static void c(bxd<cog> $$0) {
      $$0.a(
         crj.l,
         10,
         ImmutableList.of(
            d(),
            bzt.a(coh::b, 14.0F),
            cag.a(($$0x, $$1) -> $$1.gm(), coh::b),
            cbh.a($$0x -> !$$0x.gt(), byn.a(cff.ai, 2, 1.0F)),
            cbh.a(cog::gt, byn.a(cff.ai, 4, 0.6F)),
            new bzr(ImmutableList.of(Pair.of(bzt.a(bvm.aS, 8.0F), 1), Pair.of(bzm.a(0.6F, 2, 1), 1), Pair.of(new bye(10, 20), 1)))
         ),
         cff.ai
      );
   }

   private static void d(bxd<cog> $$0) {
      $$0.a(crj.m, 10, ImmutableList.of(byo.a(coh::t, 1.0F, true, 9), cop.a(9), coq.a(200, 200)), cff.ad);
   }

   private static void e(bxd<cog> $$0) {
      $$0.a(crj.n, 10, ImmutableList.of(bzy.b(cff.z, 1.0F, 12, true), b(), c(), byg.a(coh::j, cff.z)), cff.z);
   }

   private static void f(bxd<cog> $$0) {
      $$0.a(
         crj.o,
         10,
         ImmutableList.of(
            bzc.a(0.8F),
            bzt.a(coh::b, 8.0F),
            cbh.a(cbh.a(bvf::bZ), caq.a(ImmutableList.builder().addAll(a()).add(Pair.of(cbh.a((Predicate<cog>)($$0x -> true)), 1)).build())),
            byd.a(8, coh::a)
         ),
         cff.s
      );
   }

   private static ImmutableList<Pair<bzf<bwb>, Integer>> a() {
      return ImmutableList.of(Pair.of(bzt.a(bvm.bS, 8.0F), 1), Pair.of(bzt.a(bvm.aS, 8.0F), 1), Pair.of(bzt.a(8.0F), 1));
   }

   private static bzr<bwb> b() {
      return new bzr<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bye(30, 60), 1)).build());
   }

   private static bzr<cog> c() {
      return new bzr<>(
         ImmutableList.of(
            Pair.of(bzm.a(0.6F), 2), Pair.of(byr.a(bvm.aS, 8, cff.q, 0.6F, 2), 2), Pair.of(cbh.a(coh::f, cab.a(0.6F, 3)), 2), Pair.of(new bye(30, 60), 1)
         )
      );
   }

   private static bxv<bwj> d() {
      return bzy.a(cff.aw, 1.0F, 8, false);
   }

   private static bxv<cog> e() {
      return bxz.a(cog::e_, cff.M, cff.z, B);
   }

   private static bxv<cog> f() {
      return bxz.a(coh::g, cff.ar, cff.z, A);
   }

   protected static void a(cog $$0) {
      bxd<cog> $$1 = $$0.eb();
      crj $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crj.m, crj.k, crj.n, crj.l, crj.o, crj.b));
      crj $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cff.o));
      if (!$$1.a(cff.s) && e($$0)) {
         $$0.ae();
      }

      if (!$$1.a(cff.ai)) {
         $$1.b(cff.aj);
      }

      $$0.y($$1.a(cff.aj));
   }

   private static boolean e(cog $$0) {
      if (!$$0.e_()) {
         return false;
      } else {
         bvf $$1 = $$0.dk();
         return $$1 instanceof cog && ((cog)$$1).e_() || $$1 instanceof coa && ((coa)$$1).e_();
      }
   }

   protected static void a(ash $$0, cog $$1, clw $$2) {
      i($$1);
      cxk $$3;
      if ($$2.l().a(cxo.sW)) {
         $$1.a($$2, $$2.l().L());
         $$3 = $$2.l();
         $$2.at();
      } else {
         $$1.a($$2, 1);
         $$3 = a($$2);
      }

      if (a($$3)) {
         $$1.eb().b(cff.ae);
         a($$0, $$1, $$3);
         d((bwb)$$1);
      } else if (c($$3) && !o($$1)) {
         m($$1);
      } else {
         boolean $$5 = !$$1.b($$0, $$3).equals(cxk.k);
         if (!$$5) {
            c($$1, $$3);
         }
      }
   }

   private static void a(ash $$0, cog $$1, cxk $$2) {
      if (s($$1)) {
         $$1.a($$0, $$1.b(btd.b));
      }

      $$1.l($$2);
   }

   private static cxk a(clw $$0) {
      cxk $$1 = $$0.l();
      cxk $$2 = $$1.a(1);
      if ($$1.f()) {
         $$0.at();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(ash $$0, cog $$1, boolean $$2) {
      cxk $$3 = $$1.b(btd.b);
      $$1.a(btd.b, cxk.k);
      if ($$1.gm()) {
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
            cxk $$7 = $$1.eX();
            if (a($$7)) {
               c($$1, $$7);
            } else {
               a($$1, Collections.singletonList($$7));
            }

            $$1.k($$3);
         }
      }
   }

   protected static void a(ash $$0, cog $$1) {
      if (p($$1) && !$$1.eY().f()) {
         $$1.a($$0, $$1.eY());
         $$1.a(btd.b, cxk.k);
      }
   }

   private static void c(cog $$0, cxk $$1) {
      cxk $$2 = $$0.i($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(cog $$0, List<cxk> $$1) {
      Optional<cps> $$2 = $$0.eb().c(cff.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(cog $$0, List<cxk> $$1) {
      a($$0, $$1, n($$0));
   }

   private static void a(cog $$0, cps $$1, List<cxk> $$2) {
      a($$0, $$2, $$1.dt());
   }

   private static void a(cog $$0, List<cxk> $$1, fbs $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(btd.b);

         for (cxk $$3 : $$1) {
            bxw.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cxk> f(cog $$0) {
      ewm $$1 = $$0.dV().p().bc().b(ewd.aK);
      List<cxk> $$2 = $$1.a(new ewk.a((ash)$$0.dV()).a(ezd.a, $$0).a(ezc.k));
      return $$2;
   }

   private static boolean a(bwb $$0, bwb $$1) {
      return $$1.aq() != bvm.ak ? false : bam.a($$0.dV().ac()).i() < 0.1F;
   }

   protected static boolean a(cog $$0, cxk $$1) {
      if ($$0.e_() && $$1.a(ayd.W)) {
         return false;
      } else if ($$1.a(ayd.U)) {
         return false;
      } else if (r($$0) && $$0.eb().a(cff.o)) {
         return false;
      } else if (b($$1)) {
         return t($$0);
      } else {
         boolean $$2 = $$0.j($$1);
         if ($$1.a(cxo.sW)) {
            return $$2;
         } else if (c($$1)) {
            return !o($$0) && $$2;
         } else {
            return !a($$1) ? $$0.m($$1) : t($$0) && $$2;
         }
      }
   }

   protected static boolean a(cxk $$0) {
      return $$0.a(ayd.V);
   }

   private static boolean a(cog $$0, bvf $$1) {
      return !($$1 instanceof bwd $$2) ? false : !$$2.e_() || !$$2.bL() || g((bwb)$$0) || g($$2) || $$2 instanceof cog && $$2.dk() == null;
   }

   private static boolean b(ash $$0, cog $$1, bwb $$2) {
      return b($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static boolean g(cog $$0) {
      bxd<cog> $$1 = $$0.eb();
      if ($$1.a(cff.ar)) {
         bwb $$2 = $$1.c(cff.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bwb> b(ash $$0, cog $$1) {
      bxd<cog> $$2 = $$1.eb();
      if (g($$1)) {
         return Optional.empty();
      } else {
         Optional<bwb> $$3 = bxw.a($$1, cff.ab);
         if ($$3.isPresent() && cgl.d($$0, $$1, $$3.get())) {
            return $$3;
         } else {
            if ($$2.a(cff.ac)) {
               Optional<cps> $$4 = $$2.c(cff.l);
               if ($$4.isPresent()) {
                  return $$4;
               }
            }

            Optional<bwd> $$5 = $$2.c(cff.M);
            if ($$5.isPresent()) {
               return $$5;
            } else {
               Optional<cps> $$6 = $$2.c(cff.am);
               return $$6.isPresent() && cgl.c($$0, $$1, $$6.get()) ? $$6 : Optional.empty();
            }
         }
      }
   }

   public static void a(ash $$0, cps $$1, boolean $$2) {
      List<cog> $$3 = $$1.dV().a(cog.class, $$1.cR().g(16.0));
      $$3.stream().filter(coh::c).filter($$2x -> !$$2 || bxw.b($$2x, $$1)).forEach($$2x -> {
         if ($$0.N().b(dgw.O)) {
            d($$0, $$2x, $$1);
         } else {
            c($$0, $$2x, $$1);
         }
      });
   }

   public static bte a(ash $$0, cog $$1, cps $$2, btd $$3) {
      cxk $$4 = $$2.b($$3);
      if (b($$1, $$4)) {
         cxk $$5 = $$4.b(1, $$2);
         a($$0, $$1, $$5);
         d((bwb)$$1);
         i($$1);
         return bte.a;
      } else {
         return bte.e;
      }
   }

   protected static boolean b(cog $$0, cxk $$1) {
      return !r($$0) && !p($$0) && $$0.gm() && b($$1);
   }

   protected static void a(ash $$0, cog $$1, bwb $$2) {
      if (!($$2 instanceof cog)) {
         if (s($$1)) {
            a($$0, $$1, false);
         }

         bxd<cog> $$3 = $$1.eb();
         $$3.b(cff.ai);
         $$3.b(cff.aj);
         $$3.b(cff.ad);
         if ($$2 instanceof cps) {
            $$3.a(cff.ag, true, 400L);
         }

         d($$1).ifPresent($$2x -> {
            if ($$2x.aq() != $$2.aq()) {
               $$3.b(cff.z);
            }
         });
         if ($$1.e_()) {
            $$3.a(cff.z, $$2, 100L);
            if (cgl.d($$0, $$1, $$2)) {
               b($$0, (cof)$$1, $$2);
            }
         } else if ($$2.aq() == bvm.ak && l($$1)) {
            c($$1, $$2);
            a($$1, $$2);
         } else {
            a($$0, (cof)$$1, $$2);
         }
      }
   }

   protected static void a(ash $$0, cof $$1, bwb $$2) {
      if (!$$1.eb().c(crj.n)) {
         if (cgl.d($$0, $$1, $$2)) {
            if (!bxw.a($$1, $$2, 4.0)) {
               if ($$2.aq() == bvm.bS && $$0.N().b(dgw.O)) {
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

   public static Optional<axe> b(cog $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static axe a(cog $$0, crj $$1) {
      if ($$1 == crj.k) {
         return axf.ua;
      } else if ($$0.x()) {
         return axf.uf;
      } else if ($$1 == crj.n && h($$0)) {
         return axf.uf;
      } else if ($$1 == crj.m) {
         return axf.tY;
      } else if ($$1 == crj.l) {
         return axf.ub;
      } else if (e((bwb)$$0)) {
         return axf.ud;
      } else {
         return q($$0) ? axf.uf : axf.tZ;
      }
   }

   private static boolean h(cog $$0) {
      bxd<cog> $$1 = $$0.eb();
      return !$$1.a(cff.z) ? false : $$1.c(cff.z).get().a($$0, 12.0);
   }

   protected static List<cof> c(cog $$0) {
      return $$0.eb().c(cff.ao).orElse(ImmutableList.of());
   }

   private static List<cof> d(cof $$0) {
      return $$0.eb().c(cff.an).orElse(ImmutableList.of());
   }

   public static boolean a(bwb $$0) {
      for (cxk $$1 : $$0.fb()) {
         if ($$1.a(ayd.X)) {
            return true;
         }
      }

      return false;
   }

   private static void i(cog $$0) {
      $$0.eb().b(cff.m);
      $$0.L().o();
   }

   private static bxv<bwb> g() {
      bzu.a $$0 = new bzu.a(o);
      return bxz.a($$1 -> $$1.e_() && $$0.a($$1.dV().A), cff.al, cff.s, p);
   }

   protected static void b(ash $$0, cof $$1, bwb $$2) {
      d($$1).forEach($$2x -> {
         if ($$2.aq() != bvm.ak || $$2x.m() && ((coa)$$2).gn()) {
            e($$0, $$2x, $$2);
         }
      });
   }

   protected static void a(ash $$0, cof $$1) {
      d($$1).forEach($$1x -> a($$1x).ifPresent($$2 -> c($$0, $$1x, $$2)));
   }

   protected static void c(ash $$0, cof $$1, bwb $$2) {
      if (cgl.d($$0, $$1, $$2)) {
         $$1.eb().b(cff.E);
         $$1.eb().a(cff.ab, $$2.cG(), 600L);
         if ($$2.aq() == bvm.ak && $$1.m()) {
            b($$1);
         }

         if ($$2.aq() == bvm.bS && $$0.N().b(dgw.O)) {
            $$1.eb().a(cff.ac, true, 600L);
         }
      }
   }

   private static void d(ash $$0, cof $$1, bwb $$2) {
      Optional<cps> $$3 = a($$1);
      if ($$3.isPresent()) {
         c($$0, $$1, $$3.get());
      } else {
         c($$0, $$1, $$2);
      }
   }

   private static void e(ash $$0, cof $$1, bwb $$2) {
      Optional<bwb> $$3 = e($$1);
      bwb $$4 = bxw.a($$1, $$3, $$2);
      if (!$$3.isPresent() || $$3.get() != $$4) {
         c($$0, $$1, $$4);
      }
   }

   private static Optional<bwb> e(cof $$0) {
      return bxw.a($$0, cff.ab);
   }

   public static Optional<bwb> d(cog $$0) {
      return $$0.eb().a(cff.z) ? $$0.eb().c(cff.z) : Optional.empty();
   }

   public static Optional<cps> a(cof $$0) {
      return $$0.eb().a(cff.l) ? $$0.eb().c(cff.l) : Optional.empty();
   }

   private static void a(cog $$0, bwb $$1) {
      c($$0).stream().filter($$0x -> $$0x instanceof cog).forEach($$1x -> b((cog)$$1x, $$1));
   }

   private static void b(cog $$0, bwb $$1) {
      bxd<cog> $$2 = $$0.eb();
      bwb $$3 = bxw.a($$0, $$2.c(cff.z), $$1);
      $$3 = bxw.a($$0, $$2.c(cff.o), $$3);
      c($$0, $$3);
   }

   private static boolean j(cog $$0) {
      bxd<cog> $$1 = $$0.eb();
      if (!$$1.a(cff.z)) {
         return true;
      } else {
         bwb $$2 = $$1.c(cff.z).get();
         bvm<?> $$3 = $$2.aq();
         if ($$3 == bvm.ak) {
            return k($$0);
         } else {
            return a($$3) ? !$$1.b(cff.ar, $$2) : false;
         }
      }
   }

   private static boolean k(cog $$0) {
      return !l($$0);
   }

   private static boolean l(cog $$0) {
      int $$1 = $$0.eb().c(cff.as).orElse(0) + 1;
      int $$2 = $$0.eb().c(cff.at).orElse(0);
      return $$2 > $$1;
   }

   private static void c(cog $$0, bwb $$1) {
      $$0.eb().b(cff.ab);
      $$0.eb().b(cff.o);
      $$0.eb().b(cff.m);
      $$0.eb().a(cff.z, $$1, (long)q.a($$0.dV().A));
      b((cof)$$0);
   }

   protected static void b(cof $$0) {
      $$0.eb().a(cff.ah, true, (long)d.a($$0.dV().A));
   }

   private static void m(cog $$0) {
      $$0.eb().a(cff.av, true, 200L);
   }

   private static fbs n(cog $$0) {
      fbs $$1 = cgz.a($$0, 4, 2);
      return $$1 == null ? $$0.dt() : $$1;
   }

   private static boolean o(cog $$0) {
      return $$0.eb().a(cff.av);
   }

   protected static boolean c(cof $$0) {
      return $$0.eb().c(crj.b);
   }

   private static boolean c(bwb $$0) {
      return $$0.b(cxo.wL);
   }

   private static void d(bwb $$0) {
      $$0.eb().a(cff.ad, true, 119L);
   }

   private static boolean p(cog $$0) {
      return $$0.eb().a(cff.ad);
   }

   private static boolean b(cxk $$0) {
      return $$0.a(c);
   }

   private static boolean c(cxk $$0) {
      return $$0.a(ayd.ad);
   }

   private static boolean q(cog $$0) {
      return $$0.eb().a(cff.aw);
   }

   private static boolean e(bwb $$0) {
      return $$0.eb().a(cff.au);
   }

   private static boolean f(bwb $$0) {
      return !e($$0);
   }

   public static boolean b(bwb $$0) {
      return $$0.aq() == bvm.bS && $$0.b(coh::a);
   }

   private static boolean r(cog $$0) {
      return $$0.eb().a(cff.ag);
   }

   private static boolean g(bwb $$0) {
      return $$0.eb().a(cff.x);
   }

   private static boolean s(cog $$0) {
      return !$$0.eY().f();
   }

   private static boolean t(cog $$0) {
      return $$0.eY().f() || !a($$0.eY());
   }

   public static boolean a(bvm<?> $$0) {
      return $$0 == bvm.bR || $$0 == bvm.bN;
   }
}
