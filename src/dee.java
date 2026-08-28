import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dee {
   public static final aly<ddz> a = a("protection");
   public static final aly<ddz> b = a("fire_protection");
   public static final aly<ddz> c = a("feather_falling");
   public static final aly<ddz> d = a("blast_protection");
   public static final aly<ddz> e = a("projectile_protection");
   public static final aly<ddz> f = a("respiration");
   public static final aly<ddz> g = a("aqua_affinity");
   public static final aly<ddz> h = a("thorns");
   public static final aly<ddz> i = a("depth_strider");
   public static final aly<ddz> j = a("frost_walker");
   public static final aly<ddz> k = a("binding_curse");
   public static final aly<ddz> l = a("soul_speed");
   public static final aly<ddz> m = a("swift_sneak");
   public static final aly<ddz> n = a("sharpness");
   public static final aly<ddz> o = a("smite");
   public static final aly<ddz> p = a("bane_of_arthropods");
   public static final aly<ddz> q = a("knockback");
   public static final aly<ddz> r = a("fire_aspect");
   public static final aly<ddz> s = a("looting");
   public static final aly<ddz> t = a("sweeping_edge");
   public static final aly<ddz> u = a("efficiency");
   public static final aly<ddz> v = a("silk_touch");
   public static final aly<ddz> w = a("unbreaking");
   public static final aly<ddz> x = a("fortune");
   public static final aly<ddz> y = a("power");
   public static final aly<ddz> z = a("punch");
   public static final aly<ddz> A = a("flame");
   public static final aly<ddz> B = a("infinity");
   public static final aly<ddz> C = a("luck_of_the_sea");
   public static final aly<ddz> D = a("lure");
   public static final aly<ddz> E = a("loyalty");
   public static final aly<ddz> F = a("impaling");
   public static final aly<ddz> G = a("riptide");
   public static final aly<ddz> H = a("channeling");
   public static final aly<ddz> I = a("multishot");
   public static final aly<ddz> J = a("quick_charge");
   public static final aly<ddz> K = a("piercing");
   public static final aly<ddz> L = a("density");
   public static final aly<ddz> M = a("breach");
   public static final aly<ddz> N = a("wind_burst");
   public static final aly<ddz> O = a("mending");
   public static final aly<ddz> P = a("vanishing_curse");

   public static void a(rk<ddz> $$0) {
      jr<buc> $$1 = $$0.a(mb.s);
      jr<ddz> $$2 = $$0.a(mb.aO);
      jr<cxl> $$3 = $$0.a(mb.K);
      jr<dkm> $$4 = $$0.a(mb.f);
      jr<bvr<?>> $$5 = $$0.a(mb.z);
      a(
         $$0,
         a,
         ddz.a(ddz.a($$3.b(ayd.bY), 10, 4, ddz.a(1, 11), ddz.a(12, 11), 1, bvt.i))
            .a($$2.b(axx.b))
            .a(dea.c, new dej(deg.b(1.0F)), ezr.a(bl.a.a().a(eg.b(axw.d))))
      );
      a(
         $$0,
         b,
         ddz.a(ddz.a($$3.b(ayd.bY), 5, 4, ddz.a(10, 8), ddz.a(18, 8), 2, bvt.i))
            .a($$2.b(axx.b))
            .a(dea.c, new dej(deg.b(2.0F)), ezl.a(ezr.a(bl.a.a().a(eg.a(axw.i)).a(eg.b(axw.d)))))
            .a(dea.l, new dep(alz.b("enchantment.fire_protection"), bxo.h, deg.b(-0.15F), bxm.a.b))
      );
      a(
         $$0,
         c,
         ddz.a(ddz.a($$3.b(ayd.bU), 5, 4, ddz.a(5, 6), ddz.a(11, 6), 2, bvt.i)).a(dea.c, new dej(deg.b(3.0F)), ezr.a(bl.a.a().a(eg.a(axw.m)).a(eg.b(axw.d))))
      );
      a(
         $$0,
         d,
         ddz.a(ddz.a($$3.b(ayd.bY), 2, 4, ddz.a(5, 8), ddz.a(13, 8), 4, bvt.i))
            .a($$2.b(axx.b))
            .a(dea.c, new dej(deg.b(2.0F)), ezr.a(bl.a.a().a(eg.a(axw.l)).a(eg.b(axw.d))))
            .a(dea.l, new dep(alz.b("enchantment.blast_protection"), bxo.i, deg.b(0.15F), bxm.a.a))
      );
      a(
         $$0,
         e,
         ddz.a(ddz.a($$3.b(ayd.bY), 5, 4, ddz.a(3, 6), ddz.a(9, 6), 2, bvt.i))
            .a($$2.b(axx.b))
            .a(dea.c, new dej(deg.b(2.0F)), ezr.a(bl.a.a().a(eg.a(axw.j)).a(eg.b(axw.d))))
      );
      a(
         $$0,
         f,
         ddz.a(ddz.a($$3.b(ayd.bX), 2, 3, ddz.a(10, 10), ddz.a(40, 10), 4, bvt.h))
            .a(dea.l, new dep(alz.b("enchantment.respiration"), bxo.w, deg.b(1.0F), bxm.a.a))
      );
      a(
         $$0,
         g,
         ddz.a(ddz.a($$3.b(ayd.bX), 2, 1, ddz.a(1), ddz.a(41), 4, bvt.h)).a(dea.l, new dep(alz.b("enchantment.aqua_affinity"), bxo.C, deg.b(4.0F), bxm.a.c))
      );
      a(
         $$0,
         h,
         ddz.a(ddz.a($$3.b(ayd.bY), $$3.b(ayd.bW), 1, 3, ddz.a(10, 20), ddz.a(60, 20), 8, bvt.a))
            .a(dea.i, ded.c, ded.a, dek.a(new den(deg.a(1.0F), deg.a(5.0F), $$1.b(bud.P)), new dem(deg.a(2.0F))), fad.a(fas.a(deg.b(0.15F))))
      );
      a(
         $$0,
         i,
         ddz.a(ddz.a($$3.b(ayd.bU), 2, 3, ddz.a(10, 10), ddz.a(25, 10), 4, bvt.e))
            .a($$2.b(axx.c))
            .a(dea.l, new dep(alz.b("enchantment.depth_strider"), bxo.F, deg.b(0.33333334F), bxm.a.a))
      );
      a(
         $$0,
         j,
         ddz.a(ddz.a($$3.b(ayd.bU), 2, 2, ddz.a(10, 10), ddz.a(25, 10), 4, bvt.e))
            .a($$2.b(axx.c))
            .a(dea.d, deo.a, ezr.a(bl.a.a().a(eg.a(axw.E)).a(eg.b(axw.d))))
            .a(
               dea.n,
               new dez(
                  new deg.a(deg.a(3.0F, 1.0F), 0.0F, 16.0F),
                  deg.a(1.0F),
                  new kl(0, -1, 0),
                  Optional.of(eex.a(eex.a(new kl(0, 1, 0), axu.cD), eex.a(dko.J), eex.a(ety.c), eex.f())),
                  elb.a(dko.ld),
                  Optional.of(ecr.i)
               ),
               fab.a(ewp.b.a, bw.a.a().a(bu.a.a().a(true)))
            )
      );
      a($$0, k, ddz.a(ddz.a($$3.b(ayd.cj), 1, 1, ddz.a(25), ddz.a(50), 8, bvt.i)).a(dea.E));
      bw.a $$6 = bw.a.a().a(5).a(bu.a.a().f(false).a(true)).a(dl.b(dj.c.b(1.0E-5F))).c(dh.a.a().a(ax.a.a().a($$4, axu.aQ)));
      ezl.a $$7 = ezl.a(
         ezv.a(fab.a(ewp.b.a, bw.a.a().a(bw.a.a()))),
         ezm.a(
            ezl.a(
               ezs.c(),
               fab.a(ewp.b.a, bw.a.a().a(bu.a.a().f(false))),
               ezm.a(fab.a(ewp.b.a, bw.a.a().c(dh.a.a().a(ax.a.a().a($$4, axu.aQ)))), fab.a(ewp.b.a, bw.a.a().a(bu.a.a().a(false)).b()))
            ),
            ezl.a(ezs.d(), fab.a(ewp.b.a, bw.a.a().c(dh.a.a().a(ax.a.a().a($$4, axu.aQ))).a(bu.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         ddz.a(ddz.a($$3.b(ayd.bU), 1, 3, ddz.a(10, 10), ddz.a(25, 10), 8, bvt.e))
            .a(
               dea.n,
               dek.a(
                  new dep(alz.b("enchantment.soul_speed"), bxo.v, deg.a(0.0405F, 0.0105F), bxm.a.a),
                  new dep(alz.b("enchantment.soul_speed"), bxo.u, deg.a(1.0F), bxm.a.a)
               ),
               $$7
            )
            .a(
               dea.n,
               new dem(deg.a(1.0F)),
               ezl.a(fad.a(fas.a(deg.a(0.04F))), fab.a(ewp.b.a, bw.a.a().a(bu.a.a().a(true)).c(dh.a.a().a(ax.a.a().a($$4, axu.aQ)))))
            )
            .a(dea.o, new dfd(ls.M, dfd.b(), dfd.a(0.1F), dfd.b(-0.2F), dfd.a(bsk.a(0.1F)), bsk.a(1.0F)), fab.a(ewp.b.a, $$6))
            .a(dea.o, new dew(axf.yk, bsk.a(0.6F), bst.b(0.6F, 1.0F)), ezl.a(fad.a(0.35F), fab.a(ewp.b.a, $$6)))
      );
      a(
         $$0,
         m,
         ddz.a(ddz.a($$3.b(ayd.bV), 1, 3, ddz.a(25, 25), ddz.a(75, 25), 8, bvt.f))
            .a(dea.l, new dep(alz.b("enchantment.swift_sneak"), bxo.z, deg.b(0.15F), bxm.a.a))
      );
      a($$0, n, ddz.a(ddz.a($$3.b(ayd.cb), $$3.b(ayd.bZ), 10, 5, ddz.a(1, 11), ddz.a(21, 11), 1, bvt.b)).a($$2.b(axx.f)).a(dea.e, new dej(deg.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         ddz.a(ddz.a($$3.b(ayd.cc), $$3.b(ayd.bZ), 5, 5, ddz.a(5, 8), ddz.a(25, 8), 2, bvt.b))
            .a($$2.b(axx.f))
            .a(dea.e, new dej(deg.b(2.5F)), fab.a(ewp.b.a, bw.a.a().a(bz.a($$5, axy.D))))
      );
      a(
         $$0,
         p,
         ddz.a(ddz.a($$3.b(ayd.cc), $$3.b(ayd.bZ), 5, 5, ddz.a(5, 8), ddz.a(25, 8), 2, bvt.b))
            .a($$2.b(axx.f))
            .a(dea.e, new dej(deg.b(2.5F)), fab.a(ewp.b.a, bw.a.a().a(bz.a($$5, axy.C))))
            .a(
               dea.i,
               ded.a,
               ded.c,
               new del(ju.a(bur.b), deg.a(1.5F), deg.a(1.5F, 0.5F), deg.a(3.0F), deg.a(3.0F)),
               fab.a(ewp.b.a, bw.a.a().a(bz.a($$5, axy.C))).and(ezr.a(bl.a.a().a(true)))
            )
      );
      a($$0, q, ddz.a(ddz.a($$3.b(ayd.bZ), 5, 2, ddz.a(5, 20), ddz.a(55, 20), 2, bvt.b)).a(dea.g, new dej(deg.b(1.0F))));
      a(
         $$0,
         r,
         ddz.a(ddz.a($$3.b(ayd.ca), $$3.b(ayd.bZ), 2, 2, ddz.a(10, 20), ddz.a(60, 20), 4, bvt.b))
            .a(dea.i, ded.a, ded.c, new deu(deg.b(4.0F)), ezr.a(bl.a.a().a(true)))
      );
      a(
         $$0,
         s,
         ddz.a(ddz.a($$3.b(ayd.bZ), 2, 3, ddz.a(15, 9), ddz.a(65, 9), 4, bvt.b))
            .a(dea.m, ded.a, ded.c, new dej(deg.b(0.01F)), fab.a(ewp.b.b, bw.a.a().a(bz.a($$5, bvr.bS))))
      );
      a(
         $$0,
         t,
         ddz.a(ddz.a($$3.b(ayd.bZ), 2, 3, ddz.a(5, 9), ddz.a(20, 9), 4, bvt.b))
            .a(dea.l, new dep(alz.b("enchantment.sweeping_edge"), bxo.D, new deg.c(deg.b(1.0F), deg.a(2.0F, 1.0F)), bxm.a.a))
      );
      a(
         $$0,
         u,
         ddz.a(ddz.a($$3.b(ayd.cd), 10, 5, ddz.a(1, 10), ddz.a(51, 10), 1, bvt.b))
            .a(dea.l, new dep(alz.b("enchantment.efficiency"), bxo.t, new deg.d(1.0F), bxm.a.a))
      );
      a($$0, v, ddz.a(ddz.a($$3.b(ayd.ce), 1, 1, ddz.a(15), ddz.a(65), 8, bvt.b)).a($$2.b(axx.g)).a(dea.x, new dfc(deg.a(0.0F))));
      a(
         $$0,
         w,
         ddz.a(ddz.a($$3.b(ayd.ch), 5, 3, ddz.a(5, 8), ddz.a(55, 8), 2, bvt.a))
            .a(dea.k, new dex(new deg.c(deg.b(2.0F), deg.a(10.0F, 5.0F))), faf.a(cu.a.a().a($$3, ayd.bY)))
            .a(dea.k, new dex(new deg.c(deg.b(1.0F), deg.a(2.0F, 1.0F))), ezv.a(faf.a(cu.a.a().a($$3, ayd.bY))))
      );
      a($$0, x, ddz.a(ddz.a($$3.b(ayd.ce), 2, 3, ddz.a(15, 9), ddz.a(65, 9), 4, bvt.b)).a($$2.b(axx.g)));
      a(
         $$0,
         y,
         ddz.a(ddz.a($$3.b(ayd.ci), 10, 5, ddz.a(1, 10), ddz.a(16, 10), 1, bvt.b)).a(dea.e, new dej(deg.b(0.5F)), fab.a(ewp.b.c, bw.a.a().a($$5, axy.f).b()))
      );
      a(
         $$0,
         z,
         ddz.a(ddz.a($$3.b(ayd.ci), 2, 2, ddz.a(12, 20), ddz.a(37, 20), 4, bvt.b)).a(dea.g, new dej(deg.b(1.0F)), fab.a(ewp.b.c, bw.a.a().a($$5, axy.f).b()))
      );
      a($$0, A, ddz.a(ddz.a($$3.b(ayd.ci), 2, 1, ddz.a(20), ddz.a(50), 4, bvt.b)).a(dea.r, new deu(deg.a(100.0F))));
      a(
         $$0,
         B,
         ddz.a(ddz.a($$3.b(ayd.ci), 1, 1, ddz.a(20), ddz.a(50), 8, bvt.b)).a($$2.b(axx.d)).a(dea.p, new dfc(deg.a(0.0F)), faf.a(cu.a.a().a($$3, cxt.oS)))
      );
      a($$0, C, ddz.a(ddz.a($$3.b(ayd.cf), 2, 3, ddz.a(15, 9), ddz.a(65, 9), 4, bvt.b)).a(dea.w, new dej(deg.b(1.0F))));
      a($$0, D, ddz.a(ddz.a($$3.b(ayd.cf), 2, 3, ddz.a(15, 9), ddz.a(65, 9), 4, bvt.b)).a(dea.v, new dej(deg.b(5.0F))));
      a($$0, E, ddz.a(ddz.a($$3.b(ayd.cg), 5, 3, ddz.a(12, 7), ddz.a(50), 2, bvt.b)).a(dea.u, new dej(deg.b(1.0F))));
      a(
         $$0,
         F,
         ddz.a(ddz.a($$3.b(ayd.cg), 2, 5, ddz.a(1, 8), ddz.a(21, 8), 4, bvt.b))
            .a($$2.b(axx.f))
            .a(dea.e, new dej(deg.b(2.5F)), fab.a(ewp.b.a, bw.a.a().a(bz.a($$5, axy.B)).b()))
      );
      a(
         $$0,
         G,
         ddz.a(ddz.a($$3.b(ayd.cg), 2, 3, ddz.a(17, 7), ddz.a(50), 4, bvt.d))
            .a($$2.b(axx.h))
            .b(dea.F, new dej(deg.a(1.5F, 0.75F)))
            .b(dea.C, List.of(axf.Ac, axf.Ad, axf.Ae))
      );
      a(
         $$0,
         H,
         ddz.a(ddz.a($$3.b(ayd.cg), 1, 1, ddz.a(25), ddz.a(50), 8, bvt.b))
            .a(
               dea.i,
               ded.a,
               ded.c,
               dek.a(new dfe(ju.a(bvr.ax.r()), false), new dew(axf.Ag, bsk.a(5.0F), bsk.a(1.0F))),
               ezl.a(fai.c().b(true), fab.a(ewp.b.a, bw.a.a().a(dh.a.a().b(true))), fab.a(ewp.b.c, bw.a.a().a($$5, bvr.bz)))
            )
            .a(
               dea.j,
               dek.a(new dfe(ju.a(bvr.ax.r()), false), new dew(axf.Ag, bsk.a(5.0F), bsk.a(1.0F))),
               ezl.a(fai.c().b(true), fab.a(ewp.b.a, bw.a.a().a($$5, bvr.bz)), ezw.a(dh.a.a().b(true)), ezx.a(dko.sN))
            )
      );
      a(
         $$0,
         I,
         ddz.a(ddz.a($$3.b(ayd.ck), 2, 1, ddz.a(20), ddz.a(50), 4, bvt.b)).a($$2.b(axx.e)).a(dea.t, new dej(deg.b(2.0F))).a(dea.s, new dej(deg.b(10.0F)))
      );
      a(
         $$0,
         J,
         ddz.a(ddz.a($$3.b(ayd.ck), 5, 3, ddz.a(12, 20), ddz.a(50), 2, bvt.b, bvt.c))
            .b(dea.A, new dej(deg.b(-0.25F)))
            .b(
               dea.B,
               List.of(
                  new cwg.a(Optional.of(axf.gL), Optional.empty(), Optional.of(axf.gI)),
                  new cwg.a(Optional.of(axf.gM), Optional.empty(), Optional.of(axf.gI)),
                  new cwg.a(Optional.of(axf.gN), Optional.empty(), Optional.of(axf.gI))
               )
            )
      );
      a($$0, K, ddz.a(ddz.a($$3.b(ayd.ck), 10, 4, ddz.a(1, 10), ddz.a(50), 1, bvt.b)).a($$2.b(axx.e)).a(dea.q, new dej(deg.b(1.0F))));
      a($$0, L, ddz.a(ddz.a($$3.b(ayd.cm), 5, 5, ddz.a(5, 8), ddz.a(25, 8), 2, bvt.b)).a($$2.b(axx.f)).a(dea.f, new dej(deg.b(0.5F))));
      a($$0, M, ddz.a(ddz.a($$3.b(ayd.cm), 2, 4, ddz.a(15, 9), ddz.a(65, 9), 4, bvt.b)).a($$2.b(axx.f)).a(dea.h, new dej(deg.b(-0.15F))));
      a(
         $$0,
         N,
         ddz.a(ddz.a($$3.b(ayd.cm), 2, 3, ddz.a(15, 9), ddz.a(65, 9), 4, bvt.b))
            .a(
               dea.i,
               ded.a,
               ded.a,
               new det(
                  false,
                  Optional.empty(),
                  Optional.of(deg.a(List.of(1.2F, 1.75F, 2.2F), deg.a(1.5F, 0.35F))),
                  $$4.a(axu.cB).map(Function.identity()),
                  fby.c,
                  deg.a(3.5F),
                  false,
                  dhi.a.e,
                  ls.A,
                  ls.z,
                  axf.CP
               ),
               fab.a(ewp.b.c, bw.a.a().a(bu.a.a().f(false)).a(dl.d(dj.c.b(1.5))))
            )
      );
      a($$0, O, ddz.a(ddz.a($$3.b(ayd.ch), 2, 1, ddz.a(25, 25), ddz.a(75, 25), 4, bvt.a)).a(dea.z, new dev(deg.a(2.0F))));
      a($$0, P, ddz.a(ddz.a($$3.b(ayd.cl), 1, 1, ddz.a(25), ddz.a(50), 8, bvt.a)).a(dea.D));
   }

   private static void a(rk<ddz> $$0, aly<ddz> $$1, ddz.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static aly<ddz> a(String $$0) {
      return aly.a(mb.aO, alz.b($$0));
   }
}
