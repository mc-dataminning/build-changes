import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dgs {
   public static final alj<dgn> a = a("protection");
   public static final alj<dgn> b = a("fire_protection");
   public static final alj<dgn> c = a("feather_falling");
   public static final alj<dgn> d = a("blast_protection");
   public static final alj<dgn> e = a("projectile_protection");
   public static final alj<dgn> f = a("respiration");
   public static final alj<dgn> g = a("aqua_affinity");
   public static final alj<dgn> h = a("thorns");
   public static final alj<dgn> i = a("depth_strider");
   public static final alj<dgn> j = a("frost_walker");
   public static final alj<dgn> k = a("binding_curse");
   public static final alj<dgn> l = a("soul_speed");
   public static final alj<dgn> m = a("swift_sneak");
   public static final alj<dgn> n = a("sharpness");
   public static final alj<dgn> o = a("smite");
   public static final alj<dgn> p = a("bane_of_arthropods");
   public static final alj<dgn> q = a("knockback");
   public static final alj<dgn> r = a("fire_aspect");
   public static final alj<dgn> s = a("looting");
   public static final alj<dgn> t = a("sweeping_edge");
   public static final alj<dgn> u = a("efficiency");
   public static final alj<dgn> v = a("silk_touch");
   public static final alj<dgn> w = a("unbreaking");
   public static final alj<dgn> x = a("fortune");
   public static final alj<dgn> y = a("power");
   public static final alj<dgn> z = a("punch");
   public static final alj<dgn> A = a("flame");
   public static final alj<dgn> B = a("infinity");
   public static final alj<dgn> C = a("luck_of_the_sea");
   public static final alj<dgn> D = a("lure");
   public static final alj<dgn> E = a("loyalty");
   public static final alj<dgn> F = a("impaling");
   public static final alj<dgn> G = a("riptide");
   public static final alj<dgn> H = a("channeling");
   public static final alj<dgn> I = a("multishot");
   public static final alj<dgn> J = a("quick_charge");
   public static final alj<dgn> K = a("piercing");
   public static final alj<dgn> L = a("density");
   public static final alj<dgn> M = a("breach");
   public static final alj<dgn> N = a("wind_burst");
   public static final alj<dgn> O = a("mending");
   public static final alj<dgn> P = a("vanishing_curse");

   public static void a(qi<dgn> $$0) {
      jh<bvm> $$1 = $$0.a(mi.aN);
      jh<dgn> $$2 = $$0.a(mi.aR);
      jh<czw> $$3 = $$0.a(mi.K);
      jh<dne> $$4 = $$0.a(mi.i);
      jh<bxe<?>> $$5 = $$0.a(mi.B);
      a(
         $$0,
         a,
         dgn.a(dgn.a($$3.b(axo.cd), 10, 4, dgn.a(1, 11), dgn.a(12, 11), 1, bxg.i))
            .a($$2.b(axi.b))
            .a(dgo.c, new dgx(dgu.b(1.0F)), fdl.a(bn.a.a().a(du.b(axh.d))))
      );
      a(
         $$0,
         b,
         dgn.a(dgn.a($$3.b(axo.cd), 5, 4, dgn.a(10, 8), dgn.a(18, 8), 2, bxg.i))
            .a($$2.b(axi.b))
            .a(dgo.c, new dgx(dgu.b(2.0F)), fdf.a(fdl.a(bn.a.a().a(du.a(axh.i)).a(du.b(axh.d)))))
            .a(dgo.l, new dhd(alk.b("enchantment.fire_protection"), bzc.h, dgu.b(-0.15F), bza.a.b))
      );
      a(
         $$0,
         c,
         dgn.a(dgn.a($$3.b(axo.bZ), 5, 4, dgn.a(5, 6), dgn.a(11, 6), 2, bxg.i)).a(dgo.c, new dgx(dgu.b(3.0F)), fdl.a(bn.a.a().a(du.a(axh.m)).a(du.b(axh.d))))
      );
      a(
         $$0,
         d,
         dgn.a(dgn.a($$3.b(axo.cd), 2, 4, dgn.a(5, 8), dgn.a(13, 8), 4, bxg.i))
            .a($$2.b(axi.b))
            .a(dgo.c, new dgx(dgu.b(2.0F)), fdl.a(bn.a.a().a(du.a(axh.l)).a(du.b(axh.d))))
            .a(dgo.l, new dhd(alk.b("enchantment.blast_protection"), bzc.i, dgu.b(0.15F), bza.a.a))
      );
      a(
         $$0,
         e,
         dgn.a(dgn.a($$3.b(axo.cd), 5, 4, dgn.a(3, 6), dgn.a(9, 6), 2, bxg.i))
            .a($$2.b(axi.b))
            .a(dgo.c, new dgx(dgu.b(2.0F)), fdl.a(bn.a.a().a(du.a(axh.j)).a(du.b(axh.d))))
      );
      a(
         $$0,
         f,
         dgn.a(dgn.a($$3.b(axo.cc), 2, 3, dgn.a(10, 10), dgn.a(40, 10), 4, bxg.h))
            .a(dgo.l, new dhd(alk.b("enchantment.respiration"), bzc.w, dgu.b(1.0F), bza.a.a))
      );
      a(
         $$0,
         g,
         dgn.a(dgn.a($$3.b(axo.cc), 2, 1, dgn.a(1), dgn.a(41), 4, bxg.h)).a(dgo.l, new dhd(alk.b("enchantment.aqua_affinity"), bzc.C, dgu.b(4.0F), bza.a.c))
      );
      a(
         $$0,
         h,
         dgn.a(dgn.a($$3.b(axo.cd), $$3.b(axo.cb), 1, 3, dgn.a(10, 20), dgn.a(60, 20), 8, bxg.a))
            .a(dgo.i, dgr.c, dgr.a, dgy.a(new dhb(dgu.a(1.0F), dgu.a(5.0F), $$1.b(bvn.P)), new dha(dgu.a(2.0F))), fdx.a(fem.a(dgu.b(0.15F))))
      );
      a(
         $$0,
         i,
         dgn.a(dgn.a($$3.b(axo.bZ), 2, 3, dgn.a(10, 10), dgn.a(25, 10), 4, bxg.e))
            .a($$2.b(axi.c))
            .a(dgo.l, new dhd(alk.b("enchantment.depth_strider"), bzc.F, dgu.b(0.33333334F), bza.a.a))
      );
      a(
         $$0,
         j,
         dgn.a(dgn.a($$3.b(axo.bZ), 2, 2, dgn.a(10, 10), dgn.a(25, 10), 4, bxg.e))
            .a($$2.b(axi.c))
            .a(dgo.d, dhc.a, fdl.a(bn.a.a().a(du.a(axh.E)).a(du.b(axh.d))))
            .a(
               dgo.n,
               new dhn(
                  new dgu.a(dgu.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dgu.a(1.0F),
                  new kb(0, -1, 0),
                  Optional.of(eim.a(eim.a(new kb(0, 1, 0), axg.cI), eim.a(dng.J), eim.a(exr.c), eim.f())),
                  eos.a(dng.lo),
                  Optional.of(egg.i)
               ),
               fdf.a(fdv.a(faj.b.a, bz.a.a().a(bx.a.a().a(true))), fdp.a(fdv.a(faj.b.a, bz.a.a().a(bz.a.a()))))
            )
      );
      a($$0, k, dgn.a(dgn.a($$3.b(axo.co), 1, 1, dgn.a(25), dgn.a(50), 8, bxg.i)).a(dgo.E));
      bz.a $$6 = bz.a.a().a(5).a(bx.a.a().f(false).a(true)).a(cz.b(cx.c.b(1.0E-5F))).c(cv.a.a().a(az.a.a().a($$4, axg.aQ)));
      fdf.a $$7 = fdf.a(
         fdp.a(fdv.a(faj.b.a, bz.a.a().a(bz.a.a()))),
         fdg.a(
            fdf.a(
               fdm.c(),
               fdv.a(faj.b.a, bz.a.a().a(bx.a.a().f(false))),
               fdg.a(fdv.a(faj.b.a, bz.a.a().c(cv.a.a().a(az.a.a().a($$4, axg.aQ)))), fdv.a(faj.b.a, bz.a.a().a(bx.a.a().a(false)).b()))
            ),
            fdf.a(fdm.d(), fdv.a(faj.b.a, bz.a.a().c(cv.a.a().a(az.a.a().a($$4, axg.aQ))).a(bx.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dgn.a(dgn.a($$3.b(axo.bZ), 1, 3, dgn.a(10, 10), dgn.a(25, 10), 8, bxg.e))
            .a(
               dgo.n,
               dgy.a(
                  new dhd(alk.b("enchantment.soul_speed"), bzc.v, dgu.a(0.0405F, 0.0105F), bza.a.a),
                  new dhd(alk.b("enchantment.soul_speed"), bzc.u, dgu.a(1.0F), bza.a.a)
               ),
               $$7
            )
            .a(
               dgo.n,
               new dha(dgu.a(1.0F)),
               fdf.a(fdx.a(fem.a(dgu.a(0.04F))), fdv.a(faj.b.a, bz.a.a().a(bx.a.a().a(true)).c(cv.a.a().a(az.a.a().a($$4, axg.aQ)))))
            )
            .a(dgo.o, new dhr(lz.O, dhr.b(), dhr.a(0.1F), dhr.b(-0.2F), dhr.a(btu.a(0.1F)), btu.a(1.0F)), fdv.a(faj.b.a, $$6))
            .a(dgo.o, new dhk(awr.yG, btu.a(0.6F), bud.b(0.6F, 1.0F)), fdf.a(fdx.a(0.35F), fdv.a(faj.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dgn.a(dgn.a($$3.b(axo.ca), 1, 3, dgn.a(25, 25), dgn.a(75, 25), 8, bxg.f))
            .a(dgo.l, new dhd(alk.b("enchantment.swift_sneak"), bzc.z, dgu.b(0.15F), bza.a.a))
      );
      a($$0, n, dgn.a(dgn.a($$3.b(axo.cg), $$3.b(axo.ce), 10, 5, dgn.a(1, 11), dgn.a(21, 11), 1, bxg.b)).a($$2.b(axi.f)).a(dgo.e, new dgx(dgu.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dgn.a(dgn.a($$3.b(axo.ch), $$3.b(axo.ce), 5, 5, dgn.a(5, 8), dgn.a(25, 8), 2, bxg.b))
            .a($$2.b(axi.f))
            .a(dgo.e, new dgx(dgu.b(2.5F)), fdv.a(faj.b.a, bz.a.a().a(cc.a($$5, axj.D))))
      );
      a(
         $$0,
         p,
         dgn.a(dgn.a($$3.b(axo.ch), $$3.b(axo.ce), 5, 5, dgn.a(5, 8), dgn.a(25, 8), 2, bxg.b))
            .a($$2.b(axi.f))
            .a(dgo.e, new dgx(dgu.b(2.5F)), fdv.a(faj.b.a, bz.a.a().a(cc.a($$5, axj.C))))
            .a(
               dgo.i,
               dgr.a,
               dgr.c,
               new dgz(jk.a(bwb.b), dgu.a(1.5F), dgu.a(1.5F, 0.5F), dgu.a(3.0F), dgu.a(3.0F)),
               fdv.a(faj.b.a, bz.a.a().a(cc.a($$5, axj.C))).and(fdl.a(bn.a.a().a(true)))
            )
      );
      a($$0, q, dgn.a(dgn.a($$3.b(axo.ce), 5, 2, dgn.a(5, 20), dgn.a(55, 20), 2, bxg.b)).a(dgo.g, new dgx(dgu.b(1.0F))));
      a(
         $$0,
         r,
         dgn.a(dgn.a($$3.b(axo.cf), $$3.b(axo.ce), 2, 2, dgn.a(10, 20), dgn.a(60, 20), 4, bxg.b))
            .a(dgo.i, dgr.a, dgr.c, new dhi(dgu.b(4.0F)), fdl.a(bn.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dgn.a(dgn.a($$3.b(axo.ce), 2, 3, dgn.a(15, 9), dgn.a(65, 9), 4, bxg.b))
            .a(dgo.m, dgr.a, dgr.c, new dgx(dgu.b(0.01F)), fdv.a(faj.b.b, bz.a.a().a(cc.a($$5, bxe.bT))))
      );
      a(
         $$0,
         t,
         dgn.a(dgn.a($$3.b(axo.ce), 2, 3, dgn.a(5, 9), dgn.a(20, 9), 4, bxg.b))
            .a(dgo.l, new dhd(alk.b("enchantment.sweeping_edge"), bzc.D, new dgu.c(dgu.b(1.0F), dgu.a(2.0F, 1.0F)), bza.a.a))
      );
      a(
         $$0,
         u,
         dgn.a(dgn.a($$3.b(axo.ci), 10, 5, dgn.a(1, 10), dgn.a(51, 10), 1, bxg.b))
            .a(dgo.l, new dhd(alk.b("enchantment.efficiency"), bzc.t, new dgu.d(1.0F), bza.a.a))
      );
      a($$0, v, dgn.a(dgn.a($$3.b(axo.cj), 1, 1, dgn.a(15), dgn.a(65), 8, bxg.b)).a($$2.b(axi.g)).a(dgo.x, new dhq(dgu.a(0.0F))));
      a(
         $$0,
         w,
         dgn.a(dgn.a($$3.b(axo.cm), 5, 3, dgn.a(5, 8), dgn.a(55, 8), 2, bxg.a))
            .a(dgo.k, new dhl(new dgu.c(dgu.b(2.0F), dgu.a(10.0F, 5.0F))), fdz.a(cn.a.a().a($$3, axo.cd)))
            .a(dgo.k, new dhl(new dgu.c(dgu.b(1.0F), dgu.a(2.0F, 1.0F))), fdp.a(fdz.a(cn.a.a().a($$3, axo.cd))))
      );
      a($$0, x, dgn.a(dgn.a($$3.b(axo.cj), 2, 3, dgn.a(15, 9), dgn.a(65, 9), 4, bxg.b)).a($$2.b(axi.g)));
      a(
         $$0,
         y,
         dgn.a(dgn.a($$3.b(axo.cn), 10, 5, dgn.a(1, 10), dgn.a(16, 10), 1, bxg.b))
            .a(dgo.e, new dgx(dgu.a(1.0F, 0.5F)), fdv.a(faj.b.c, bz.a.a().a($$5, axj.f).b()))
      );
      a(
         $$0,
         z,
         dgn.a(dgn.a($$3.b(axo.cn), 2, 2, dgn.a(12, 20), dgn.a(37, 20), 4, bxg.b)).a(dgo.g, new dgx(dgu.b(1.0F)), fdv.a(faj.b.c, bz.a.a().a($$5, axj.f).b()))
      );
      a($$0, A, dgn.a(dgn.a($$3.b(axo.cn), 2, 1, dgn.a(20), dgn.a(50), 4, bxg.b)).a(dgo.r, new dhi(dgu.a(100.0F))));
      a(
         $$0,
         B,
         dgn.a(dgn.a($$3.b(axo.cn), 1, 1, dgn.a(20), dgn.a(50), 8, bxg.b)).a($$2.b(axi.d)).a(dgo.p, new dhq(dgu.a(0.0F)), fdz.a(cn.a.a().a($$3, dae.pk)))
      );
      a($$0, C, dgn.a(dgn.a($$3.b(axo.ck), 2, 3, dgn.a(15, 9), dgn.a(65, 9), 4, bxg.b)).a(dgo.w, new dgx(dgu.b(1.0F))));
      a($$0, D, dgn.a(dgn.a($$3.b(axo.ck), 2, 3, dgn.a(15, 9), dgn.a(65, 9), 4, bxg.b)).a(dgo.v, new dgx(dgu.b(5.0F))));
      a($$0, E, dgn.a(dgn.a($$3.b(axo.cl), 5, 3, dgn.a(12, 7), dgn.a(50), 2, bxg.b)).a(dgo.u, new dgx(dgu.b(1.0F))));
      a(
         $$0,
         F,
         dgn.a(dgn.a($$3.b(axo.cl), 2, 5, dgn.a(1, 8), dgn.a(21, 8), 4, bxg.b))
            .a($$2.b(axi.f))
            .a(dgo.e, new dgx(dgu.b(2.5F)), fdv.a(faj.b.a, bz.a.a().a(cc.a($$5, axj.B)).b()))
      );
      a(
         $$0,
         G,
         dgn.a(dgn.a($$3.b(axo.cl), 2, 3, dgn.a(17, 7), dgn.a(50), 4, bxg.d))
            .a($$2.b(axi.h))
            .b(dgo.F, new dgx(dgu.a(1.5F, 0.75F)))
            .b(dgo.C, List.of(awr.AH, awr.AI, awr.AJ))
      );
      a(
         $$0,
         H,
         dgn.a(dgn.a($$3.b(axo.cl), 1, 1, dgn.a(25), dgn.a(50), 8, bxg.b))
            .a(
               dgo.i,
               dgr.a,
               dgr.c,
               dgy.a(new dhs(jk.a(bxe.ax.r()), false), new dhk(awr.AL, btu.a(5.0F), btu.a(1.0F))),
               fdf.a(fec.c().b(true), fdv.a(faj.b.a, bz.a.a().a(cv.a.a().b(true))), fdv.a(faj.b.c, bz.a.a().a($$5, bxe.bA)))
            )
            .a(
               dgo.j,
               dgy.a(new dhs(jk.a(bxe.ax.r()), false), new dhk(awr.AL, btu.a(5.0F), btu.a(1.0F))),
               fdf.a(fec.c().b(true), fdv.a(faj.b.a, bz.a.a().a($$5, bxe.bA)), fdq.a(cv.a.a().b(true)), fdr.a(dng.ta))
            )
      );
      a(
         $$0,
         I,
         dgn.a(dgn.a($$3.b(axo.cp), 2, 1, dgn.a(20), dgn.a(50), 4, bxg.b)).a($$2.b(axi.e)).a(dgo.t, new dgx(dgu.b(2.0F))).a(dgo.s, new dgx(dgu.b(10.0F)))
      );
      a(
         $$0,
         J,
         dgn.a(dgn.a($$3.b(axo.cp), 5, 3, dgn.a(12, 20), dgn.a(50), 2, bxg.b, bxg.c))
            .b(dgo.A, new dgx(dgu.b(-0.25F)))
            .b(
               dgo.B,
               List.of(
                  new cyt.b(Optional.of(awr.gO), Optional.empty(), Optional.of(awr.gL)),
                  new cyt.b(Optional.of(awr.gP), Optional.empty(), Optional.of(awr.gL)),
                  new cyt.b(Optional.of(awr.gQ), Optional.empty(), Optional.of(awr.gL))
               )
            )
      );
      a($$0, K, dgn.a(dgn.a($$3.b(axo.cp), 10, 4, dgn.a(1, 10), dgn.a(50), 1, bxg.b)).a($$2.b(axi.e)).a(dgo.q, new dgx(dgu.b(1.0F))));
      a($$0, L, dgn.a(dgn.a($$3.b(axo.cr), 5, 5, dgn.a(5, 8), dgn.a(25, 8), 2, bxg.b)).a($$2.b(axi.f)).a(dgo.f, new dgx(dgu.b(0.5F))));
      a($$0, M, dgn.a(dgn.a($$3.b(axo.cr), 2, 4, dgn.a(15, 9), dgn.a(65, 9), 4, bxg.b)).a($$2.b(axi.f)).a(dgo.h, new dgx(dgu.b(-0.15F))));
      a(
         $$0,
         N,
         dgn.a(dgn.a($$3.b(axo.cr), 2, 3, dgn.a(15, 9), dgn.a(65, 9), 4, bxg.b))
            .a(
               dgo.i,
               dgr.a,
               dgr.a,
               new dhh(
                  false,
                  Optional.empty(),
                  Optional.of(dgu.a(List.of(1.2F, 1.75F, 2.2F), dgu.a(1.5F, 0.35F))),
                  $$4.a(axg.cF).map(Function.identity()),
                  ffs.c,
                  dgu.a(3.5F),
                  false,
                  djz.a.e,
                  lz.A,
                  lz.z,
                  awr.Du
               ),
               fdv.a(faj.b.c, bz.a.a().a(bx.a.a().f(false)).a(cz.d(cx.c.b(1.5))))
            )
      );
      a($$0, O, dgn.a(dgn.a($$3.b(axo.cm), 2, 1, dgn.a(25, 25), dgn.a(75, 25), 4, bxg.a)).a(dgo.z, new dhj(dgu.a(2.0F))));
      a($$0, P, dgn.a(dgn.a($$3.b(axo.cq), 1, 1, dgn.a(25), dgn.a(50), 8, bxg.a)).a(dgo.D));
   }

   private static void a(qi<dgn> $$0, alj<dgn> $$1, dgn.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static alj<dgn> a(String $$0) {
      return alj.a(mi.aR, alk.b($$0));
   }
}
