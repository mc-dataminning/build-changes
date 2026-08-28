import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dgf {
   public static final alf<dga> a = a("protection");
   public static final alf<dga> b = a("fire_protection");
   public static final alf<dga> c = a("feather_falling");
   public static final alf<dga> d = a("blast_protection");
   public static final alf<dga> e = a("projectile_protection");
   public static final alf<dga> f = a("respiration");
   public static final alf<dga> g = a("aqua_affinity");
   public static final alf<dga> h = a("thorns");
   public static final alf<dga> i = a("depth_strider");
   public static final alf<dga> j = a("frost_walker");
   public static final alf<dga> k = a("binding_curse");
   public static final alf<dga> l = a("soul_speed");
   public static final alf<dga> m = a("swift_sneak");
   public static final alf<dga> n = a("sharpness");
   public static final alf<dga> o = a("smite");
   public static final alf<dga> p = a("bane_of_arthropods");
   public static final alf<dga> q = a("knockback");
   public static final alf<dga> r = a("fire_aspect");
   public static final alf<dga> s = a("looting");
   public static final alf<dga> t = a("sweeping_edge");
   public static final alf<dga> u = a("efficiency");
   public static final alf<dga> v = a("silk_touch");
   public static final alf<dga> w = a("unbreaking");
   public static final alf<dga> x = a("fortune");
   public static final alf<dga> y = a("power");
   public static final alf<dga> z = a("punch");
   public static final alf<dga> A = a("flame");
   public static final alf<dga> B = a("infinity");
   public static final alf<dga> C = a("luck_of_the_sea");
   public static final alf<dga> D = a("lure");
   public static final alf<dga> E = a("loyalty");
   public static final alf<dga> F = a("impaling");
   public static final alf<dga> G = a("riptide");
   public static final alf<dga> H = a("channeling");
   public static final alf<dga> I = a("multishot");
   public static final alf<dga> J = a("quick_charge");
   public static final alf<dga> K = a("piercing");
   public static final alf<dga> L = a("density");
   public static final alf<dga> M = a("breach");
   public static final alf<dga> N = a("wind_burst");
   public static final alf<dga> O = a("mending");
   public static final alf<dga> P = a("vanishing_curse");

   public static void a(qh<dga> $$0) {
      jg<buz> $$1 = $$0.a(mh.aN);
      jg<dga> $$2 = $$0.a(mh.aR);
      jg<czj> $$3 = $$0.a(mh.K);
      jg<dmr> $$4 = $$0.a(mh.i);
      jg<bwr<?>> $$5 = $$0.a(mh.B);
      a(
         $$0,
         a,
         dga.a(dga.a($$3.b(axk.cc), 10, 4, dga.a(1, 11), dga.a(12, 11), 1, bwt.i))
            .a($$2.b(axe.b))
            .a(dgb.c, new dgk(dgh.b(1.0F)), fcv.a(bn.a.a().a(dt.b(axd.d))))
      );
      a(
         $$0,
         b,
         dga.a(dga.a($$3.b(axk.cc), 5, 4, dga.a(10, 8), dga.a(18, 8), 2, bwt.i))
            .a($$2.b(axe.b))
            .a(dgb.c, new dgk(dgh.b(2.0F)), fcp.a(fcv.a(bn.a.a().a(dt.a(axd.i)).a(dt.b(axd.d)))))
            .a(dgb.l, new dgq(alg.b("enchantment.fire_protection"), byp.h, dgh.b(-0.15F), byn.a.b))
      );
      a(
         $$0,
         c,
         dga.a(dga.a($$3.b(axk.bY), 5, 4, dga.a(5, 6), dga.a(11, 6), 2, bwt.i)).a(dgb.c, new dgk(dgh.b(3.0F)), fcv.a(bn.a.a().a(dt.a(axd.m)).a(dt.b(axd.d))))
      );
      a(
         $$0,
         d,
         dga.a(dga.a($$3.b(axk.cc), 2, 4, dga.a(5, 8), dga.a(13, 8), 4, bwt.i))
            .a($$2.b(axe.b))
            .a(dgb.c, new dgk(dgh.b(2.0F)), fcv.a(bn.a.a().a(dt.a(axd.l)).a(dt.b(axd.d))))
            .a(dgb.l, new dgq(alg.b("enchantment.blast_protection"), byp.i, dgh.b(0.15F), byn.a.a))
      );
      a(
         $$0,
         e,
         dga.a(dga.a($$3.b(axk.cc), 5, 4, dga.a(3, 6), dga.a(9, 6), 2, bwt.i))
            .a($$2.b(axe.b))
            .a(dgb.c, new dgk(dgh.b(2.0F)), fcv.a(bn.a.a().a(dt.a(axd.j)).a(dt.b(axd.d))))
      );
      a(
         $$0,
         f,
         dga.a(dga.a($$3.b(axk.cb), 2, 3, dga.a(10, 10), dga.a(40, 10), 4, bwt.h))
            .a(dgb.l, new dgq(alg.b("enchantment.respiration"), byp.w, dgh.b(1.0F), byn.a.a))
      );
      a(
         $$0,
         g,
         dga.a(dga.a($$3.b(axk.cb), 2, 1, dga.a(1), dga.a(41), 4, bwt.h)).a(dgb.l, new dgq(alg.b("enchantment.aqua_affinity"), byp.C, dgh.b(4.0F), byn.a.c))
      );
      a(
         $$0,
         h,
         dga.a(dga.a($$3.b(axk.cc), $$3.b(axk.ca), 1, 3, dga.a(10, 20), dga.a(60, 20), 8, bwt.a))
            .a(dgb.i, dge.c, dge.a, dgl.a(new dgo(dgh.a(1.0F), dgh.a(5.0F), $$1.b(bva.P)), new dgn(dgh.a(2.0F))), fdh.a(fdw.a(dgh.b(0.15F))))
      );
      a(
         $$0,
         i,
         dga.a(dga.a($$3.b(axk.bY), 2, 3, dga.a(10, 10), dga.a(25, 10), 4, bwt.e))
            .a($$2.b(axe.c))
            .a(dgb.l, new dgq(alg.b("enchantment.depth_strider"), byp.F, dgh.b(0.33333334F), byn.a.a))
      );
      a(
         $$0,
         j,
         dga.a(dga.a($$3.b(axk.bY), 2, 2, dga.a(10, 10), dga.a(25, 10), 4, bwt.e))
            .a($$2.b(axe.c))
            .a(dgb.d, dgp.a, fcv.a(bn.a.a().a(dt.a(axd.E)).a(dt.b(axd.d))))
            .a(
               dgb.n,
               new dha(
                  new dgh.a(dgh.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dgh.a(1.0F),
                  new ka(0, -1, 0),
                  Optional.of(ehz.a(ehz.a(new ka(0, 1, 0), axc.cI), ehz.a(dmt.J), ehz.a(exb.c), ehz.f())),
                  eod.a(dmt.lo),
                  Optional.of(eft.i)
               ),
               fcp.a(fdf.a(ezt.b.a, by.a.a().a(bw.a.a().a(true))), fcz.a(fdf.a(ezt.b.a, by.a.a().a(by.a.a()))))
            )
      );
      a($$0, k, dga.a(dga.a($$3.b(axk.cn), 1, 1, dga.a(25), dga.a(50), 8, bwt.i)).a(dgb.E));
      by.a $$6 = by.a.a().a(5).a(bw.a.a().f(false).a(true)).a(cy.b(cw.c.b(1.0E-5F))).c(cu.a.a().a(az.a.a().a($$4, axc.aQ)));
      fcp.a $$7 = fcp.a(
         fcz.a(fdf.a(ezt.b.a, by.a.a().a(by.a.a()))),
         fcq.a(
            fcp.a(
               fcw.c(),
               fdf.a(ezt.b.a, by.a.a().a(bw.a.a().f(false))),
               fcq.a(fdf.a(ezt.b.a, by.a.a().c(cu.a.a().a(az.a.a().a($$4, axc.aQ)))), fdf.a(ezt.b.a, by.a.a().a(bw.a.a().a(false)).b()))
            ),
            fcp.a(fcw.d(), fdf.a(ezt.b.a, by.a.a().c(cu.a.a().a(az.a.a().a($$4, axc.aQ))).a(bw.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dga.a(dga.a($$3.b(axk.bY), 1, 3, dga.a(10, 10), dga.a(25, 10), 8, bwt.e))
            .a(
               dgb.n,
               dgl.a(
                  new dgq(alg.b("enchantment.soul_speed"), byp.v, dgh.a(0.0405F, 0.0105F), byn.a.a),
                  new dgq(alg.b("enchantment.soul_speed"), byp.u, dgh.a(1.0F), byn.a.a)
               ),
               $$7
            )
            .a(
               dgb.n,
               new dgn(dgh.a(1.0F)),
               fcp.a(fdh.a(fdw.a(dgh.a(0.04F))), fdf.a(ezt.b.a, by.a.a().a(bw.a.a().a(true)).c(cu.a.a().a(az.a.a().a($$4, axc.aQ)))))
            )
            .a(dgb.o, new dhe(ly.O, dhe.b(), dhe.a(0.1F), dhe.b(-0.2F), dhe.a(bth.a(0.1F)), bth.a(1.0F)), fdf.a(ezt.b.a, $$6))
            .a(dgb.o, new dgx(awn.yG, bth.a(0.6F), btq.b(0.6F, 1.0F)), fcp.a(fdh.a(0.35F), fdf.a(ezt.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dga.a(dga.a($$3.b(axk.bZ), 1, 3, dga.a(25, 25), dga.a(75, 25), 8, bwt.f))
            .a(dgb.l, new dgq(alg.b("enchantment.swift_sneak"), byp.z, dgh.b(0.15F), byn.a.a))
      );
      a($$0, n, dga.a(dga.a($$3.b(axk.cf), $$3.b(axk.cd), 10, 5, dga.a(1, 11), dga.a(21, 11), 1, bwt.b)).a($$2.b(axe.f)).a(dgb.e, new dgk(dgh.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dga.a(dga.a($$3.b(axk.cg), $$3.b(axk.cd), 5, 5, dga.a(5, 8), dga.a(25, 8), 2, bwt.b))
            .a($$2.b(axe.f))
            .a(dgb.e, new dgk(dgh.b(2.5F)), fdf.a(ezt.b.a, by.a.a().a(cb.a($$5, axf.D))))
      );
      a(
         $$0,
         p,
         dga.a(dga.a($$3.b(axk.cg), $$3.b(axk.cd), 5, 5, dga.a(5, 8), dga.a(25, 8), 2, bwt.b))
            .a($$2.b(axe.f))
            .a(dgb.e, new dgk(dgh.b(2.5F)), fdf.a(ezt.b.a, by.a.a().a(cb.a($$5, axf.C))))
            .a(
               dgb.i,
               dge.a,
               dge.c,
               new dgm(jj.a(bvo.b), dgh.a(1.5F), dgh.a(1.5F, 0.5F), dgh.a(3.0F), dgh.a(3.0F)),
               fdf.a(ezt.b.a, by.a.a().a(cb.a($$5, axf.C))).and(fcv.a(bn.a.a().a(true)))
            )
      );
      a($$0, q, dga.a(dga.a($$3.b(axk.cd), 5, 2, dga.a(5, 20), dga.a(55, 20), 2, bwt.b)).a(dgb.g, new dgk(dgh.b(1.0F))));
      a(
         $$0,
         r,
         dga.a(dga.a($$3.b(axk.ce), $$3.b(axk.cd), 2, 2, dga.a(10, 20), dga.a(60, 20), 4, bwt.b))
            .a(dgb.i, dge.a, dge.c, new dgv(dgh.b(4.0F)), fcv.a(bn.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dga.a(dga.a($$3.b(axk.cd), 2, 3, dga.a(15, 9), dga.a(65, 9), 4, bwt.b))
            .a(dgb.m, dge.a, dge.c, new dgk(dgh.b(0.01F)), fdf.a(ezt.b.b, by.a.a().a(cb.a($$5, bwr.bS))))
      );
      a(
         $$0,
         t,
         dga.a(dga.a($$3.b(axk.cd), 2, 3, dga.a(5, 9), dga.a(20, 9), 4, bwt.b))
            .a(dgb.l, new dgq(alg.b("enchantment.sweeping_edge"), byp.D, new dgh.c(dgh.b(1.0F), dgh.a(2.0F, 1.0F)), byn.a.a))
      );
      a(
         $$0,
         u,
         dga.a(dga.a($$3.b(axk.ch), 10, 5, dga.a(1, 10), dga.a(51, 10), 1, bwt.b))
            .a(dgb.l, new dgq(alg.b("enchantment.efficiency"), byp.t, new dgh.d(1.0F), byn.a.a))
      );
      a($$0, v, dga.a(dga.a($$3.b(axk.ci), 1, 1, dga.a(15), dga.a(65), 8, bwt.b)).a($$2.b(axe.g)).a(dgb.x, new dhd(dgh.a(0.0F))));
      a(
         $$0,
         w,
         dga.a(dga.a($$3.b(axk.cl), 5, 3, dga.a(5, 8), dga.a(55, 8), 2, bwt.a))
            .a(dgb.k, new dgy(new dgh.c(dgh.b(2.0F), dgh.a(10.0F, 5.0F))), fdj.a(cm.a.a().a($$3, axk.cc)))
            .a(dgb.k, new dgy(new dgh.c(dgh.b(1.0F), dgh.a(2.0F, 1.0F))), fcz.a(fdj.a(cm.a.a().a($$3, axk.cc))))
      );
      a($$0, x, dga.a(dga.a($$3.b(axk.ci), 2, 3, dga.a(15, 9), dga.a(65, 9), 4, bwt.b)).a($$2.b(axe.g)));
      a(
         $$0,
         y,
         dga.a(dga.a($$3.b(axk.cm), 10, 5, dga.a(1, 10), dga.a(16, 10), 1, bwt.b))
            .a(dgb.e, new dgk(dgh.a(1.0F, 0.5F)), fdf.a(ezt.b.c, by.a.a().a($$5, axf.f).b()))
      );
      a(
         $$0,
         z,
         dga.a(dga.a($$3.b(axk.cm), 2, 2, dga.a(12, 20), dga.a(37, 20), 4, bwt.b)).a(dgb.g, new dgk(dgh.b(1.0F)), fdf.a(ezt.b.c, by.a.a().a($$5, axf.f).b()))
      );
      a($$0, A, dga.a(dga.a($$3.b(axk.cm), 2, 1, dga.a(20), dga.a(50), 4, bwt.b)).a(dgb.r, new dgv(dgh.a(100.0F))));
      a(
         $$0,
         B,
         dga.a(dga.a($$3.b(axk.cm), 1, 1, dga.a(20), dga.a(50), 8, bwt.b)).a($$2.b(axe.d)).a(dgb.p, new dhd(dgh.a(0.0F)), fdj.a(cm.a.a().a($$3, czr.pk)))
      );
      a($$0, C, dga.a(dga.a($$3.b(axk.cj), 2, 3, dga.a(15, 9), dga.a(65, 9), 4, bwt.b)).a(dgb.w, new dgk(dgh.b(1.0F))));
      a($$0, D, dga.a(dga.a($$3.b(axk.cj), 2, 3, dga.a(15, 9), dga.a(65, 9), 4, bwt.b)).a(dgb.v, new dgk(dgh.b(5.0F))));
      a($$0, E, dga.a(dga.a($$3.b(axk.ck), 5, 3, dga.a(12, 7), dga.a(50), 2, bwt.b)).a(dgb.u, new dgk(dgh.b(1.0F))));
      a(
         $$0,
         F,
         dga.a(dga.a($$3.b(axk.ck), 2, 5, dga.a(1, 8), dga.a(21, 8), 4, bwt.b))
            .a($$2.b(axe.f))
            .a(dgb.e, new dgk(dgh.b(2.5F)), fdf.a(ezt.b.a, by.a.a().a(cb.a($$5, axf.B)).b()))
      );
      a(
         $$0,
         G,
         dga.a(dga.a($$3.b(axk.ck), 2, 3, dga.a(17, 7), dga.a(50), 4, bwt.d))
            .a($$2.b(axe.h))
            .b(dgb.F, new dgk(dgh.a(1.5F, 0.75F)))
            .b(dgb.C, List.of(awn.AH, awn.AI, awn.AJ))
      );
      a(
         $$0,
         H,
         dga.a(dga.a($$3.b(axk.ck), 1, 1, dga.a(25), dga.a(50), 8, bwt.b))
            .a(
               dgb.i,
               dge.a,
               dge.c,
               dgl.a(new dhf(jj.a(bwr.aw.r()), false), new dgx(awn.AL, bth.a(5.0F), bth.a(1.0F))),
               fcp.a(fdm.c().b(true), fdf.a(ezt.b.a, by.a.a().a(cu.a.a().b(true))), fdf.a(ezt.b.c, by.a.a().a($$5, bwr.bz)))
            )
            .a(
               dgb.j,
               dgl.a(new dhf(jj.a(bwr.aw.r()), false), new dgx(awn.AL, bth.a(5.0F), bth.a(1.0F))),
               fcp.a(fdm.c().b(true), fdf.a(ezt.b.a, by.a.a().a($$5, bwr.bz)), fda.a(cu.a.a().b(true)), fdb.a(dmt.ta))
            )
      );
      a(
         $$0,
         I,
         dga.a(dga.a($$3.b(axk.co), 2, 1, dga.a(20), dga.a(50), 4, bwt.b)).a($$2.b(axe.e)).a(dgb.t, new dgk(dgh.b(2.0F))).a(dgb.s, new dgk(dgh.b(10.0F)))
      );
      a(
         $$0,
         J,
         dga.a(dga.a($$3.b(axk.co), 5, 3, dga.a(12, 20), dga.a(50), 2, bwt.b, bwt.c))
            .b(dgb.A, new dgk(dgh.b(-0.25F)))
            .b(
               dgb.B,
               List.of(
                  new cyg.b(Optional.of(awn.gO), Optional.empty(), Optional.of(awn.gL)),
                  new cyg.b(Optional.of(awn.gP), Optional.empty(), Optional.of(awn.gL)),
                  new cyg.b(Optional.of(awn.gQ), Optional.empty(), Optional.of(awn.gL))
               )
            )
      );
      a($$0, K, dga.a(dga.a($$3.b(axk.co), 10, 4, dga.a(1, 10), dga.a(50), 1, bwt.b)).a($$2.b(axe.e)).a(dgb.q, new dgk(dgh.b(1.0F))));
      a($$0, L, dga.a(dga.a($$3.b(axk.cq), 5, 5, dga.a(5, 8), dga.a(25, 8), 2, bwt.b)).a($$2.b(axe.f)).a(dgb.f, new dgk(dgh.b(0.5F))));
      a($$0, M, dga.a(dga.a($$3.b(axk.cq), 2, 4, dga.a(15, 9), dga.a(65, 9), 4, bwt.b)).a($$2.b(axe.f)).a(dgb.h, new dgk(dgh.b(-0.15F))));
      a(
         $$0,
         N,
         dga.a(dga.a($$3.b(axk.cq), 2, 3, dga.a(15, 9), dga.a(65, 9), 4, bwt.b))
            .a(
               dgb.i,
               dge.a,
               dge.a,
               new dgu(
                  false,
                  Optional.empty(),
                  Optional.of(dgh.a(List.of(1.2F, 1.75F, 2.2F), dgh.a(1.5F, 0.35F))),
                  $$4.a(axc.cF).map(Function.identity()),
                  ffc.c,
                  dgh.a(3.5F),
                  false,
                  djm.a.e,
                  ly.A,
                  ly.z,
                  awn.Du
               ),
               fdf.a(ezt.b.c, by.a.a().a(bw.a.a().f(false)).a(cy.d(cw.c.b(1.5))))
            )
      );
      a($$0, O, dga.a(dga.a($$3.b(axk.cl), 2, 1, dga.a(25, 25), dga.a(75, 25), 4, bwt.a)).a(dgb.z, new dgw(dgh.a(2.0F))));
      a($$0, P, dga.a(dga.a($$3.b(axk.cp), 1, 1, dga.a(25), dga.a(50), 8, bwt.a)).a(dgb.D));
   }

   private static void a(qh<dga> $$0, alf<dga> $$1, dga.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static alf<dga> a(String $$0) {
      return alf.a(mh.aR, alg.b($$0));
   }
}
