import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dgc {
   public static final alf<dfx> a = a("protection");
   public static final alf<dfx> b = a("fire_protection");
   public static final alf<dfx> c = a("feather_falling");
   public static final alf<dfx> d = a("blast_protection");
   public static final alf<dfx> e = a("projectile_protection");
   public static final alf<dfx> f = a("respiration");
   public static final alf<dfx> g = a("aqua_affinity");
   public static final alf<dfx> h = a("thorns");
   public static final alf<dfx> i = a("depth_strider");
   public static final alf<dfx> j = a("frost_walker");
   public static final alf<dfx> k = a("binding_curse");
   public static final alf<dfx> l = a("soul_speed");
   public static final alf<dfx> m = a("swift_sneak");
   public static final alf<dfx> n = a("sharpness");
   public static final alf<dfx> o = a("smite");
   public static final alf<dfx> p = a("bane_of_arthropods");
   public static final alf<dfx> q = a("knockback");
   public static final alf<dfx> r = a("fire_aspect");
   public static final alf<dfx> s = a("looting");
   public static final alf<dfx> t = a("sweeping_edge");
   public static final alf<dfx> u = a("efficiency");
   public static final alf<dfx> v = a("silk_touch");
   public static final alf<dfx> w = a("unbreaking");
   public static final alf<dfx> x = a("fortune");
   public static final alf<dfx> y = a("power");
   public static final alf<dfx> z = a("punch");
   public static final alf<dfx> A = a("flame");
   public static final alf<dfx> B = a("infinity");
   public static final alf<dfx> C = a("luck_of_the_sea");
   public static final alf<dfx> D = a("lure");
   public static final alf<dfx> E = a("loyalty");
   public static final alf<dfx> F = a("impaling");
   public static final alf<dfx> G = a("riptide");
   public static final alf<dfx> H = a("channeling");
   public static final alf<dfx> I = a("multishot");
   public static final alf<dfx> J = a("quick_charge");
   public static final alf<dfx> K = a("piercing");
   public static final alf<dfx> L = a("density");
   public static final alf<dfx> M = a("breach");
   public static final alf<dfx> N = a("wind_burst");
   public static final alf<dfx> O = a("mending");
   public static final alf<dfx> P = a("vanishing_curse");

   public static void a(qh<dfx> $$0) {
      jg<buz> $$1 = $$0.a(mh.aN);
      jg<dfx> $$2 = $$0.a(mh.aR);
      jg<czg> $$3 = $$0.a(mh.K);
      jg<dmm> $$4 = $$0.a(mh.i);
      jg<bwr<?>> $$5 = $$0.a(mh.B);
      a(
         $$0,
         a,
         dfx.a(dfx.a($$3.b(axk.cc), 10, 4, dfx.a(1, 11), dfx.a(12, 11), 1, bwt.i))
            .a($$2.b(axe.b))
            .a(dfy.c, new dgh(dge.b(1.0F)), fcq.a(bn.a.a().a(dt.b(axd.d))))
      );
      a(
         $$0,
         b,
         dfx.a(dfx.a($$3.b(axk.cc), 5, 4, dfx.a(10, 8), dfx.a(18, 8), 2, bwt.i))
            .a($$2.b(axe.b))
            .a(dfy.c, new dgh(dge.b(2.0F)), fck.a(fcq.a(bn.a.a().a(dt.a(axd.i)).a(dt.b(axd.d)))))
            .a(dfy.l, new dgn(alg.b("enchantment.fire_protection"), byp.h, dge.b(-0.15F), byn.a.b))
      );
      a(
         $$0,
         c,
         dfx.a(dfx.a($$3.b(axk.bY), 5, 4, dfx.a(5, 6), dfx.a(11, 6), 2, bwt.i)).a(dfy.c, new dgh(dge.b(3.0F)), fcq.a(bn.a.a().a(dt.a(axd.m)).a(dt.b(axd.d))))
      );
      a(
         $$0,
         d,
         dfx.a(dfx.a($$3.b(axk.cc), 2, 4, dfx.a(5, 8), dfx.a(13, 8), 4, bwt.i))
            .a($$2.b(axe.b))
            .a(dfy.c, new dgh(dge.b(2.0F)), fcq.a(bn.a.a().a(dt.a(axd.l)).a(dt.b(axd.d))))
            .a(dfy.l, new dgn(alg.b("enchantment.blast_protection"), byp.i, dge.b(0.15F), byn.a.a))
      );
      a(
         $$0,
         e,
         dfx.a(dfx.a($$3.b(axk.cc), 5, 4, dfx.a(3, 6), dfx.a(9, 6), 2, bwt.i))
            .a($$2.b(axe.b))
            .a(dfy.c, new dgh(dge.b(2.0F)), fcq.a(bn.a.a().a(dt.a(axd.j)).a(dt.b(axd.d))))
      );
      a(
         $$0,
         f,
         dfx.a(dfx.a($$3.b(axk.cb), 2, 3, dfx.a(10, 10), dfx.a(40, 10), 4, bwt.h))
            .a(dfy.l, new dgn(alg.b("enchantment.respiration"), byp.w, dge.b(1.0F), byn.a.a))
      );
      a(
         $$0,
         g,
         dfx.a(dfx.a($$3.b(axk.cb), 2, 1, dfx.a(1), dfx.a(41), 4, bwt.h)).a(dfy.l, new dgn(alg.b("enchantment.aqua_affinity"), byp.C, dge.b(4.0F), byn.a.c))
      );
      a(
         $$0,
         h,
         dfx.a(dfx.a($$3.b(axk.cc), $$3.b(axk.ca), 1, 3, dfx.a(10, 20), dfx.a(60, 20), 8, bwt.a))
            .a(dfy.i, dgb.c, dgb.a, dgi.a(new dgl(dge.a(1.0F), dge.a(5.0F), $$1.b(bva.P)), new dgk(dge.a(2.0F))), fdc.a(fdr.a(dge.b(0.15F))))
      );
      a(
         $$0,
         i,
         dfx.a(dfx.a($$3.b(axk.bY), 2, 3, dfx.a(10, 10), dfx.a(25, 10), 4, bwt.e))
            .a($$2.b(axe.c))
            .a(dfy.l, new dgn(alg.b("enchantment.depth_strider"), byp.F, dge.b(0.33333334F), byn.a.a))
      );
      a(
         $$0,
         j,
         dfx.a(dfx.a($$3.b(axk.bY), 2, 2, dfx.a(10, 10), dfx.a(25, 10), 4, bwt.e))
            .a($$2.b(axe.c))
            .a(dfy.d, dgm.a, fcq.a(bn.a.a().a(dt.a(axd.E)).a(dt.b(axd.d))))
            .a(
               dfy.n,
               new dgx(
                  new dge.a(dge.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dge.a(1.0F),
                  new ka(0, -1, 0),
                  Optional.of(ehu.a(ehu.a(new ka(0, 1, 0), axc.cI), ehu.a(dmo.J), ehu.a(eww.c), ehu.f())),
                  eny.a(dmo.lo),
                  Optional.of(efo.i)
               ),
               fck.a(fda.a(ezo.b.a, by.a.a().a(bw.a.a().a(true))), fcu.a(fda.a(ezo.b.a, by.a.a().a(by.a.a()))))
            )
      );
      a($$0, k, dfx.a(dfx.a($$3.b(axk.cn), 1, 1, dfx.a(25), dfx.a(50), 8, bwt.i)).a(dfy.E));
      by.a $$6 = by.a.a().a(5).a(bw.a.a().f(false).a(true)).a(cy.b(cw.c.b(1.0E-5F))).c(cu.a.a().a(az.a.a().a($$4, axc.aQ)));
      fck.a $$7 = fck.a(
         fcu.a(fda.a(ezo.b.a, by.a.a().a(by.a.a()))),
         fcl.a(
            fck.a(
               fcr.c(),
               fda.a(ezo.b.a, by.a.a().a(bw.a.a().f(false))),
               fcl.a(fda.a(ezo.b.a, by.a.a().c(cu.a.a().a(az.a.a().a($$4, axc.aQ)))), fda.a(ezo.b.a, by.a.a().a(bw.a.a().a(false)).b()))
            ),
            fck.a(fcr.d(), fda.a(ezo.b.a, by.a.a().c(cu.a.a().a(az.a.a().a($$4, axc.aQ))).a(bw.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dfx.a(dfx.a($$3.b(axk.bY), 1, 3, dfx.a(10, 10), dfx.a(25, 10), 8, bwt.e))
            .a(
               dfy.n,
               dgi.a(
                  new dgn(alg.b("enchantment.soul_speed"), byp.v, dge.a(0.0405F, 0.0105F), byn.a.a),
                  new dgn(alg.b("enchantment.soul_speed"), byp.u, dge.a(1.0F), byn.a.a)
               ),
               $$7
            )
            .a(
               dfy.n,
               new dgk(dge.a(1.0F)),
               fck.a(fdc.a(fdr.a(dge.a(0.04F))), fda.a(ezo.b.a, by.a.a().a(bw.a.a().a(true)).c(cu.a.a().a(az.a.a().a($$4, axc.aQ)))))
            )
            .a(dfy.o, new dhb(ly.O, dhb.b(), dhb.a(0.1F), dhb.b(-0.2F), dhb.a(bth.a(0.1F)), bth.a(1.0F)), fda.a(ezo.b.a, $$6))
            .a(dfy.o, new dgu(awn.yG, bth.a(0.6F), btq.b(0.6F, 1.0F)), fck.a(fdc.a(0.35F), fda.a(ezo.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dfx.a(dfx.a($$3.b(axk.bZ), 1, 3, dfx.a(25, 25), dfx.a(75, 25), 8, bwt.f))
            .a(dfy.l, new dgn(alg.b("enchantment.swift_sneak"), byp.z, dge.b(0.15F), byn.a.a))
      );
      a($$0, n, dfx.a(dfx.a($$3.b(axk.cf), $$3.b(axk.cd), 10, 5, dfx.a(1, 11), dfx.a(21, 11), 1, bwt.b)).a($$2.b(axe.f)).a(dfy.e, new dgh(dge.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dfx.a(dfx.a($$3.b(axk.cg), $$3.b(axk.cd), 5, 5, dfx.a(5, 8), dfx.a(25, 8), 2, bwt.b))
            .a($$2.b(axe.f))
            .a(dfy.e, new dgh(dge.b(2.5F)), fda.a(ezo.b.a, by.a.a().a(cb.a($$5, axf.D))))
      );
      a(
         $$0,
         p,
         dfx.a(dfx.a($$3.b(axk.cg), $$3.b(axk.cd), 5, 5, dfx.a(5, 8), dfx.a(25, 8), 2, bwt.b))
            .a($$2.b(axe.f))
            .a(dfy.e, new dgh(dge.b(2.5F)), fda.a(ezo.b.a, by.a.a().a(cb.a($$5, axf.C))))
            .a(
               dfy.i,
               dgb.a,
               dgb.c,
               new dgj(jj.a(bvo.b), dge.a(1.5F), dge.a(1.5F, 0.5F), dge.a(3.0F), dge.a(3.0F)),
               fda.a(ezo.b.a, by.a.a().a(cb.a($$5, axf.C))).and(fcq.a(bn.a.a().a(true)))
            )
      );
      a($$0, q, dfx.a(dfx.a($$3.b(axk.cd), 5, 2, dfx.a(5, 20), dfx.a(55, 20), 2, bwt.b)).a(dfy.g, new dgh(dge.b(1.0F))));
      a(
         $$0,
         r,
         dfx.a(dfx.a($$3.b(axk.ce), $$3.b(axk.cd), 2, 2, dfx.a(10, 20), dfx.a(60, 20), 4, bwt.b))
            .a(dfy.i, dgb.a, dgb.c, new dgs(dge.b(4.0F)), fcq.a(bn.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dfx.a(dfx.a($$3.b(axk.cd), 2, 3, dfx.a(15, 9), dfx.a(65, 9), 4, bwt.b))
            .a(dfy.m, dgb.a, dgb.c, new dgh(dge.b(0.01F)), fda.a(ezo.b.b, by.a.a().a(cb.a($$5, bwr.bS))))
      );
      a(
         $$0,
         t,
         dfx.a(dfx.a($$3.b(axk.cd), 2, 3, dfx.a(5, 9), dfx.a(20, 9), 4, bwt.b))
            .a(dfy.l, new dgn(alg.b("enchantment.sweeping_edge"), byp.D, new dge.c(dge.b(1.0F), dge.a(2.0F, 1.0F)), byn.a.a))
      );
      a(
         $$0,
         u,
         dfx.a(dfx.a($$3.b(axk.ch), 10, 5, dfx.a(1, 10), dfx.a(51, 10), 1, bwt.b))
            .a(dfy.l, new dgn(alg.b("enchantment.efficiency"), byp.t, new dge.d(1.0F), byn.a.a))
      );
      a($$0, v, dfx.a(dfx.a($$3.b(axk.ci), 1, 1, dfx.a(15), dfx.a(65), 8, bwt.b)).a($$2.b(axe.g)).a(dfy.x, new dha(dge.a(0.0F))));
      a(
         $$0,
         w,
         dfx.a(dfx.a($$3.b(axk.cl), 5, 3, dfx.a(5, 8), dfx.a(55, 8), 2, bwt.a))
            .a(dfy.k, new dgv(new dge.c(dge.b(2.0F), dge.a(10.0F, 5.0F))), fde.a(cm.a.a().a($$3, axk.cc)))
            .a(dfy.k, new dgv(new dge.c(dge.b(1.0F), dge.a(2.0F, 1.0F))), fcu.a(fde.a(cm.a.a().a($$3, axk.cc))))
      );
      a($$0, x, dfx.a(dfx.a($$3.b(axk.ci), 2, 3, dfx.a(15, 9), dfx.a(65, 9), 4, bwt.b)).a($$2.b(axe.g)));
      a(
         $$0,
         y,
         dfx.a(dfx.a($$3.b(axk.cm), 10, 5, dfx.a(1, 10), dfx.a(16, 10), 1, bwt.b))
            .a(dfy.e, new dgh(dge.a(1.0F, 0.5F)), fda.a(ezo.b.c, by.a.a().a($$5, axf.f).b()))
      );
      a(
         $$0,
         z,
         dfx.a(dfx.a($$3.b(axk.cm), 2, 2, dfx.a(12, 20), dfx.a(37, 20), 4, bwt.b)).a(dfy.g, new dgh(dge.b(1.0F)), fda.a(ezo.b.c, by.a.a().a($$5, axf.f).b()))
      );
      a($$0, A, dfx.a(dfx.a($$3.b(axk.cm), 2, 1, dfx.a(20), dfx.a(50), 4, bwt.b)).a(dfy.r, new dgs(dge.a(100.0F))));
      a(
         $$0,
         B,
         dfx.a(dfx.a($$3.b(axk.cm), 1, 1, dfx.a(20), dfx.a(50), 8, bwt.b)).a($$2.b(axe.d)).a(dfy.p, new dha(dge.a(0.0F)), fde.a(cm.a.a().a($$3, czo.pk)))
      );
      a($$0, C, dfx.a(dfx.a($$3.b(axk.cj), 2, 3, dfx.a(15, 9), dfx.a(65, 9), 4, bwt.b)).a(dfy.w, new dgh(dge.b(1.0F))));
      a($$0, D, dfx.a(dfx.a($$3.b(axk.cj), 2, 3, dfx.a(15, 9), dfx.a(65, 9), 4, bwt.b)).a(dfy.v, new dgh(dge.b(5.0F))));
      a($$0, E, dfx.a(dfx.a($$3.b(axk.ck), 5, 3, dfx.a(12, 7), dfx.a(50), 2, bwt.b)).a(dfy.u, new dgh(dge.b(1.0F))));
      a(
         $$0,
         F,
         dfx.a(dfx.a($$3.b(axk.ck), 2, 5, dfx.a(1, 8), dfx.a(21, 8), 4, bwt.b))
            .a($$2.b(axe.f))
            .a(dfy.e, new dgh(dge.b(2.5F)), fda.a(ezo.b.a, by.a.a().a(cb.a($$5, axf.B)).b()))
      );
      a(
         $$0,
         G,
         dfx.a(dfx.a($$3.b(axk.ck), 2, 3, dfx.a(17, 7), dfx.a(50), 4, bwt.d))
            .a($$2.b(axe.h))
            .b(dfy.F, new dgh(dge.a(1.5F, 0.75F)))
            .b(dfy.C, List.of(awn.AH, awn.AI, awn.AJ))
      );
      a(
         $$0,
         H,
         dfx.a(dfx.a($$3.b(axk.ck), 1, 1, dfx.a(25), dfx.a(50), 8, bwt.b))
            .a(
               dfy.i,
               dgb.a,
               dgb.c,
               dgi.a(new dhc(jj.a(bwr.aw.r()), false), new dgu(awn.AL, bth.a(5.0F), bth.a(1.0F))),
               fck.a(fdh.c().b(true), fda.a(ezo.b.a, by.a.a().a(cu.a.a().b(true))), fda.a(ezo.b.c, by.a.a().a($$5, bwr.bz)))
            )
            .a(
               dfy.j,
               dgi.a(new dhc(jj.a(bwr.aw.r()), false), new dgu(awn.AL, bth.a(5.0F), bth.a(1.0F))),
               fck.a(fdh.c().b(true), fda.a(ezo.b.a, by.a.a().a($$5, bwr.bz)), fcv.a(cu.a.a().b(true)), fcw.a(dmo.ta))
            )
      );
      a(
         $$0,
         I,
         dfx.a(dfx.a($$3.b(axk.co), 2, 1, dfx.a(20), dfx.a(50), 4, bwt.b)).a($$2.b(axe.e)).a(dfy.t, new dgh(dge.b(2.0F))).a(dfy.s, new dgh(dge.b(10.0F)))
      );
      a(
         $$0,
         J,
         dfx.a(dfx.a($$3.b(axk.co), 5, 3, dfx.a(12, 20), dfx.a(50), 2, bwt.b, bwt.c))
            .b(dfy.A, new dgh(dge.b(-0.25F)))
            .b(
               dfy.B,
               List.of(
                  new cyd.b(Optional.of(awn.gO), Optional.empty(), Optional.of(awn.gL)),
                  new cyd.b(Optional.of(awn.gP), Optional.empty(), Optional.of(awn.gL)),
                  new cyd.b(Optional.of(awn.gQ), Optional.empty(), Optional.of(awn.gL))
               )
            )
      );
      a($$0, K, dfx.a(dfx.a($$3.b(axk.co), 10, 4, dfx.a(1, 10), dfx.a(50), 1, bwt.b)).a($$2.b(axe.e)).a(dfy.q, new dgh(dge.b(1.0F))));
      a($$0, L, dfx.a(dfx.a($$3.b(axk.cq), 5, 5, dfx.a(5, 8), dfx.a(25, 8), 2, bwt.b)).a($$2.b(axe.f)).a(dfy.f, new dgh(dge.b(0.5F))));
      a($$0, M, dfx.a(dfx.a($$3.b(axk.cq), 2, 4, dfx.a(15, 9), dfx.a(65, 9), 4, bwt.b)).a($$2.b(axe.f)).a(dfy.h, new dgh(dge.b(-0.15F))));
      a(
         $$0,
         N,
         dfx.a(dfx.a($$3.b(axk.cq), 2, 3, dfx.a(15, 9), dfx.a(65, 9), 4, bwt.b))
            .a(
               dfy.i,
               dgb.a,
               dgb.a,
               new dgr(
                  false,
                  Optional.empty(),
                  Optional.of(dge.a(List.of(1.2F, 1.75F, 2.2F), dge.a(1.5F, 0.35F))),
                  $$4.a(axc.cF).map(Function.identity()),
                  fex.c,
                  dge.a(3.5F),
                  false,
                  djh.a.e,
                  ly.A,
                  ly.z,
                  awn.Du
               ),
               fda.a(ezo.b.c, by.a.a().a(bw.a.a().f(false)).a(cy.d(cw.c.b(1.5))))
            )
      );
      a($$0, O, dfx.a(dfx.a($$3.b(axk.cl), 2, 1, dfx.a(25, 25), dfx.a(75, 25), 4, bwt.a)).a(dfy.z, new dgt(dge.a(2.0F))));
      a($$0, P, dfx.a(dfx.a($$3.b(axk.cp), 1, 1, dfx.a(25), dfx.a(50), 8, bwt.a)).a(dfy.D));
   }

   private static void a(qh<dfx> $$0, alf<dfx> $$1, dfx.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static alf<dfx> a(String $$0) {
      return alf.a(mh.aR, alg.b($$0));
   }
}
