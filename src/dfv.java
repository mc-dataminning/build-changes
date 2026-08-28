import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dfv {
   public static final alf<dfq> a = a("protection");
   public static final alf<dfq> b = a("fire_protection");
   public static final alf<dfq> c = a("feather_falling");
   public static final alf<dfq> d = a("blast_protection");
   public static final alf<dfq> e = a("projectile_protection");
   public static final alf<dfq> f = a("respiration");
   public static final alf<dfq> g = a("aqua_affinity");
   public static final alf<dfq> h = a("thorns");
   public static final alf<dfq> i = a("depth_strider");
   public static final alf<dfq> j = a("frost_walker");
   public static final alf<dfq> k = a("binding_curse");
   public static final alf<dfq> l = a("soul_speed");
   public static final alf<dfq> m = a("swift_sneak");
   public static final alf<dfq> n = a("sharpness");
   public static final alf<dfq> o = a("smite");
   public static final alf<dfq> p = a("bane_of_arthropods");
   public static final alf<dfq> q = a("knockback");
   public static final alf<dfq> r = a("fire_aspect");
   public static final alf<dfq> s = a("looting");
   public static final alf<dfq> t = a("sweeping_edge");
   public static final alf<dfq> u = a("efficiency");
   public static final alf<dfq> v = a("silk_touch");
   public static final alf<dfq> w = a("unbreaking");
   public static final alf<dfq> x = a("fortune");
   public static final alf<dfq> y = a("power");
   public static final alf<dfq> z = a("punch");
   public static final alf<dfq> A = a("flame");
   public static final alf<dfq> B = a("infinity");
   public static final alf<dfq> C = a("luck_of_the_sea");
   public static final alf<dfq> D = a("lure");
   public static final alf<dfq> E = a("loyalty");
   public static final alf<dfq> F = a("impaling");
   public static final alf<dfq> G = a("riptide");
   public static final alf<dfq> H = a("channeling");
   public static final alf<dfq> I = a("multishot");
   public static final alf<dfq> J = a("quick_charge");
   public static final alf<dfq> K = a("piercing");
   public static final alf<dfq> L = a("density");
   public static final alf<dfq> M = a("breach");
   public static final alf<dfq> N = a("wind_burst");
   public static final alf<dfq> O = a("mending");
   public static final alf<dfq> P = a("vanishing_curse");

   public static void a(qh<dfq> $$0) {
      jf<buw> $$1 = $$0.a(mg.aN);
      jf<dfq> $$2 = $$0.a(mg.aR);
      jf<cyz> $$3 = $$0.a(mg.K);
      jf<dmf> $$4 = $$0.a(mg.i);
      jf<bwo<?>> $$5 = $$0.a(mg.B);
      a(
         $$0,
         a,
         dfq.a(dfq.a($$3.b(axk.cc), 10, 4, dfq.a(1, 11), dfq.a(12, 11), 1, bwq.i))
            .a($$2.b(axe.b))
            .a(dfr.c, new dga(dfx.b(1.0F)), fcj.a(bm.a.a().a(ds.b(axd.d))))
      );
      a(
         $$0,
         b,
         dfq.a(dfq.a($$3.b(axk.cc), 5, 4, dfq.a(10, 8), dfq.a(18, 8), 2, bwq.i))
            .a($$2.b(axe.b))
            .a(dfr.c, new dga(dfx.b(2.0F)), fcd.a(fcj.a(bm.a.a().a(ds.a(axd.i)).a(ds.b(axd.d)))))
            .a(dfr.l, new dgg(alg.b("enchantment.fire_protection"), byk.h, dfx.b(-0.15F), byi.a.b))
      );
      a(
         $$0,
         c,
         dfq.a(dfq.a($$3.b(axk.bY), 5, 4, dfq.a(5, 6), dfq.a(11, 6), 2, bwq.i)).a(dfr.c, new dga(dfx.b(3.0F)), fcj.a(bm.a.a().a(ds.a(axd.m)).a(ds.b(axd.d))))
      );
      a(
         $$0,
         d,
         dfq.a(dfq.a($$3.b(axk.cc), 2, 4, dfq.a(5, 8), dfq.a(13, 8), 4, bwq.i))
            .a($$2.b(axe.b))
            .a(dfr.c, new dga(dfx.b(2.0F)), fcj.a(bm.a.a().a(ds.a(axd.l)).a(ds.b(axd.d))))
            .a(dfr.l, new dgg(alg.b("enchantment.blast_protection"), byk.i, dfx.b(0.15F), byi.a.a))
      );
      a(
         $$0,
         e,
         dfq.a(dfq.a($$3.b(axk.cc), 5, 4, dfq.a(3, 6), dfq.a(9, 6), 2, bwq.i))
            .a($$2.b(axe.b))
            .a(dfr.c, new dga(dfx.b(2.0F)), fcj.a(bm.a.a().a(ds.a(axd.j)).a(ds.b(axd.d))))
      );
      a(
         $$0,
         f,
         dfq.a(dfq.a($$3.b(axk.cb), 2, 3, dfq.a(10, 10), dfq.a(40, 10), 4, bwq.h))
            .a(dfr.l, new dgg(alg.b("enchantment.respiration"), byk.w, dfx.b(1.0F), byi.a.a))
      );
      a(
         $$0,
         g,
         dfq.a(dfq.a($$3.b(axk.cb), 2, 1, dfq.a(1), dfq.a(41), 4, bwq.h)).a(dfr.l, new dgg(alg.b("enchantment.aqua_affinity"), byk.C, dfx.b(4.0F), byi.a.c))
      );
      a(
         $$0,
         h,
         dfq.a(dfq.a($$3.b(axk.cc), $$3.b(axk.ca), 1, 3, dfq.a(10, 20), dfq.a(60, 20), 8, bwq.a))
            .a(dfr.i, dfu.c, dfu.a, dgb.a(new dge(dfx.a(1.0F), dfx.a(5.0F), $$1.b(bux.P)), new dgd(dfx.a(2.0F))), fcv.a(fdk.a(dfx.b(0.15F))))
      );
      a(
         $$0,
         i,
         dfq.a(dfq.a($$3.b(axk.bY), 2, 3, dfq.a(10, 10), dfq.a(25, 10), 4, bwq.e))
            .a($$2.b(axe.c))
            .a(dfr.l, new dgg(alg.b("enchantment.depth_strider"), byk.F, dfx.b(0.33333334F), byi.a.a))
      );
      a(
         $$0,
         j,
         dfq.a(dfq.a($$3.b(axk.bY), 2, 2, dfq.a(10, 10), dfq.a(25, 10), 4, bwq.e))
            .a($$2.b(axe.c))
            .a(dfr.d, dgf.a, fcj.a(bm.a.a().a(ds.a(axd.E)).a(ds.b(axd.d))))
            .a(
               dfr.n,
               new dgq(
                  new dfx.a(dfx.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dfx.a(1.0F),
                  new jz(0, -1, 0),
                  Optional.of(ehn.a(ehn.a(new jz(0, 1, 0), axc.cH), ehn.a(dmh.J), ehn.a(ewp.c), ehn.f())),
                  enr.a(dmh.lo),
                  Optional.of(efh.i)
               ),
               fcd.a(fct.a(ezh.b.a, bx.a.a().a(bv.a.a().a(true))), fcn.a(fct.a(ezh.b.a, bx.a.a().a(bx.a.a()))))
            )
      );
      a($$0, k, dfq.a(dfq.a($$3.b(axk.cn), 1, 1, dfq.a(25), dfq.a(50), 8, bwq.i)).a(dfr.E));
      bx.a $$6 = bx.a.a().a(5).a(bv.a.a().f(false).a(true)).a(cx.b(cv.c.b(1.0E-5F))).c(ct.a.a().a(ay.a.a().a($$4, axc.aQ)));
      fcd.a $$7 = fcd.a(
         fcn.a(fct.a(ezh.b.a, bx.a.a().a(bx.a.a()))),
         fce.a(
            fcd.a(
               fck.c(),
               fct.a(ezh.b.a, bx.a.a().a(bv.a.a().f(false))),
               fce.a(fct.a(ezh.b.a, bx.a.a().c(ct.a.a().a(ay.a.a().a($$4, axc.aQ)))), fct.a(ezh.b.a, bx.a.a().a(bv.a.a().a(false)).b()))
            ),
            fcd.a(fck.d(), fct.a(ezh.b.a, bx.a.a().c(ct.a.a().a(ay.a.a().a($$4, axc.aQ))).a(bv.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dfq.a(dfq.a($$3.b(axk.bY), 1, 3, dfq.a(10, 10), dfq.a(25, 10), 8, bwq.e))
            .a(
               dfr.n,
               dgb.a(
                  new dgg(alg.b("enchantment.soul_speed"), byk.v, dfx.a(0.0405F, 0.0105F), byi.a.a),
                  new dgg(alg.b("enchantment.soul_speed"), byk.u, dfx.a(1.0F), byi.a.a)
               ),
               $$7
            )
            .a(
               dfr.n,
               new dgd(dfx.a(1.0F)),
               fcd.a(fcv.a(fdk.a(dfx.a(0.04F))), fct.a(ezh.b.a, bx.a.a().a(bv.a.a().a(true)).c(ct.a.a().a(ay.a.a().a($$4, axc.aQ)))))
            )
            .a(dfr.o, new dgu(lx.O, dgu.b(), dgu.a(0.1F), dgu.b(-0.2F), dgu.a(bte.a(0.1F)), bte.a(1.0F)), fct.a(ezh.b.a, $$6))
            .a(dfr.o, new dgn(awn.yG, bte.a(0.6F), btn.b(0.6F, 1.0F)), fcd.a(fcv.a(0.35F), fct.a(ezh.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dfq.a(dfq.a($$3.b(axk.bZ), 1, 3, dfq.a(25, 25), dfq.a(75, 25), 8, bwq.f))
            .a(dfr.l, new dgg(alg.b("enchantment.swift_sneak"), byk.z, dfx.b(0.15F), byi.a.a))
      );
      a($$0, n, dfq.a(dfq.a($$3.b(axk.cf), $$3.b(axk.cd), 10, 5, dfq.a(1, 11), dfq.a(21, 11), 1, bwq.b)).a($$2.b(axe.f)).a(dfr.e, new dga(dfx.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dfq.a(dfq.a($$3.b(axk.cg), $$3.b(axk.cd), 5, 5, dfq.a(5, 8), dfq.a(25, 8), 2, bwq.b))
            .a($$2.b(axe.f))
            .a(dfr.e, new dga(dfx.b(2.5F)), fct.a(ezh.b.a, bx.a.a().a(ca.a($$5, axf.D))))
      );
      a(
         $$0,
         p,
         dfq.a(dfq.a($$3.b(axk.cg), $$3.b(axk.cd), 5, 5, dfq.a(5, 8), dfq.a(25, 8), 2, bwq.b))
            .a($$2.b(axe.f))
            .a(dfr.e, new dga(dfx.b(2.5F)), fct.a(ezh.b.a, bx.a.a().a(ca.a($$5, axf.C))))
            .a(
               dfr.i,
               dfu.a,
               dfu.c,
               new dgc(ji.a(bvl.b), dfx.a(1.5F), dfx.a(1.5F, 0.5F), dfx.a(3.0F), dfx.a(3.0F)),
               fct.a(ezh.b.a, bx.a.a().a(ca.a($$5, axf.C))).and(fcj.a(bm.a.a().a(true)))
            )
      );
      a($$0, q, dfq.a(dfq.a($$3.b(axk.cd), 5, 2, dfq.a(5, 20), dfq.a(55, 20), 2, bwq.b)).a(dfr.g, new dga(dfx.b(1.0F))));
      a(
         $$0,
         r,
         dfq.a(dfq.a($$3.b(axk.ce), $$3.b(axk.cd), 2, 2, dfq.a(10, 20), dfq.a(60, 20), 4, bwq.b))
            .a(dfr.i, dfu.a, dfu.c, new dgl(dfx.b(4.0F)), fcj.a(bm.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dfq.a(dfq.a($$3.b(axk.cd), 2, 3, dfq.a(15, 9), dfq.a(65, 9), 4, bwq.b))
            .a(dfr.m, dfu.a, dfu.c, new dga(dfx.b(0.01F)), fct.a(ezh.b.b, bx.a.a().a(ca.a($$5, bwo.bS))))
      );
      a(
         $$0,
         t,
         dfq.a(dfq.a($$3.b(axk.cd), 2, 3, dfq.a(5, 9), dfq.a(20, 9), 4, bwq.b))
            .a(dfr.l, new dgg(alg.b("enchantment.sweeping_edge"), byk.D, new dfx.c(dfx.b(1.0F), dfx.a(2.0F, 1.0F)), byi.a.a))
      );
      a(
         $$0,
         u,
         dfq.a(dfq.a($$3.b(axk.ch), 10, 5, dfq.a(1, 10), dfq.a(51, 10), 1, bwq.b))
            .a(dfr.l, new dgg(alg.b("enchantment.efficiency"), byk.t, new dfx.d(1.0F), byi.a.a))
      );
      a($$0, v, dfq.a(dfq.a($$3.b(axk.ci), 1, 1, dfq.a(15), dfq.a(65), 8, bwq.b)).a($$2.b(axe.g)).a(dfr.x, new dgt(dfx.a(0.0F))));
      a(
         $$0,
         w,
         dfq.a(dfq.a($$3.b(axk.cl), 5, 3, dfq.a(5, 8), dfq.a(55, 8), 2, bwq.a))
            .a(dfr.k, new dgo(new dfx.c(dfx.b(2.0F), dfx.a(10.0F, 5.0F))), fcx.a(cl.a.a().a($$3, axk.cc)))
            .a(dfr.k, new dgo(new dfx.c(dfx.b(1.0F), dfx.a(2.0F, 1.0F))), fcn.a(fcx.a(cl.a.a().a($$3, axk.cc))))
      );
      a($$0, x, dfq.a(dfq.a($$3.b(axk.ci), 2, 3, dfq.a(15, 9), dfq.a(65, 9), 4, bwq.b)).a($$2.b(axe.g)));
      a(
         $$0,
         y,
         dfq.a(dfq.a($$3.b(axk.cm), 10, 5, dfq.a(1, 10), dfq.a(16, 10), 1, bwq.b))
            .a(dfr.e, new dga(dfx.a(1.0F, 0.5F)), fct.a(ezh.b.c, bx.a.a().a($$5, axf.f).b()))
      );
      a(
         $$0,
         z,
         dfq.a(dfq.a($$3.b(axk.cm), 2, 2, dfq.a(12, 20), dfq.a(37, 20), 4, bwq.b)).a(dfr.g, new dga(dfx.b(1.0F)), fct.a(ezh.b.c, bx.a.a().a($$5, axf.f).b()))
      );
      a($$0, A, dfq.a(dfq.a($$3.b(axk.cm), 2, 1, dfq.a(20), dfq.a(50), 4, bwq.b)).a(dfr.r, new dgl(dfx.a(100.0F))));
      a(
         $$0,
         B,
         dfq.a(dfq.a($$3.b(axk.cm), 1, 1, dfq.a(20), dfq.a(50), 8, bwq.b)).a($$2.b(axe.d)).a(dfr.p, new dgt(dfx.a(0.0F)), fcx.a(cl.a.a().a($$3, czh.pk)))
      );
      a($$0, C, dfq.a(dfq.a($$3.b(axk.cj), 2, 3, dfq.a(15, 9), dfq.a(65, 9), 4, bwq.b)).a(dfr.w, new dga(dfx.b(1.0F))));
      a($$0, D, dfq.a(dfq.a($$3.b(axk.cj), 2, 3, dfq.a(15, 9), dfq.a(65, 9), 4, bwq.b)).a(dfr.v, new dga(dfx.b(5.0F))));
      a($$0, E, dfq.a(dfq.a($$3.b(axk.ck), 5, 3, dfq.a(12, 7), dfq.a(50), 2, bwq.b)).a(dfr.u, new dga(dfx.b(1.0F))));
      a(
         $$0,
         F,
         dfq.a(dfq.a($$3.b(axk.ck), 2, 5, dfq.a(1, 8), dfq.a(21, 8), 4, bwq.b))
            .a($$2.b(axe.f))
            .a(dfr.e, new dga(dfx.b(2.5F)), fct.a(ezh.b.a, bx.a.a().a(ca.a($$5, axf.B)).b()))
      );
      a(
         $$0,
         G,
         dfq.a(dfq.a($$3.b(axk.ck), 2, 3, dfq.a(17, 7), dfq.a(50), 4, bwq.d))
            .a($$2.b(axe.h))
            .b(dfr.F, new dga(dfx.a(1.5F, 0.75F)))
            .b(dfr.C, List.of(awn.AH, awn.AI, awn.AJ))
      );
      a(
         $$0,
         H,
         dfq.a(dfq.a($$3.b(axk.ck), 1, 1, dfq.a(25), dfq.a(50), 8, bwq.b))
            .a(
               dfr.i,
               dfu.a,
               dfu.c,
               dgb.a(new dgv(ji.a(bwo.aw.r()), false), new dgn(awn.AL, bte.a(5.0F), bte.a(1.0F))),
               fcd.a(fda.c().b(true), fct.a(ezh.b.a, bx.a.a().a(ct.a.a().b(true))), fct.a(ezh.b.c, bx.a.a().a($$5, bwo.bz)))
            )
            .a(
               dfr.j,
               dgb.a(new dgv(ji.a(bwo.aw.r()), false), new dgn(awn.AL, bte.a(5.0F), bte.a(1.0F))),
               fcd.a(fda.c().b(true), fct.a(ezh.b.a, bx.a.a().a($$5, bwo.bz)), fco.a(ct.a.a().b(true)), fcp.a(dmh.ta))
            )
      );
      a(
         $$0,
         I,
         dfq.a(dfq.a($$3.b(axk.co), 2, 1, dfq.a(20), dfq.a(50), 4, bwq.b)).a($$2.b(axe.e)).a(dfr.t, new dga(dfx.b(2.0F))).a(dfr.s, new dga(dfx.b(10.0F)))
      );
      a(
         $$0,
         J,
         dfq.a(dfq.a($$3.b(axk.co), 5, 3, dfq.a(12, 20), dfq.a(50), 2, bwq.b, bwq.c))
            .b(dfr.A, new dga(dfx.b(-0.25F)))
            .b(
               dfr.B,
               List.of(
                  new cxw.b(Optional.of(awn.gO), Optional.empty(), Optional.of(awn.gL)),
                  new cxw.b(Optional.of(awn.gP), Optional.empty(), Optional.of(awn.gL)),
                  new cxw.b(Optional.of(awn.gQ), Optional.empty(), Optional.of(awn.gL))
               )
            )
      );
      a($$0, K, dfq.a(dfq.a($$3.b(axk.co), 10, 4, dfq.a(1, 10), dfq.a(50), 1, bwq.b)).a($$2.b(axe.e)).a(dfr.q, new dga(dfx.b(1.0F))));
      a($$0, L, dfq.a(dfq.a($$3.b(axk.cq), 5, 5, dfq.a(5, 8), dfq.a(25, 8), 2, bwq.b)).a($$2.b(axe.f)).a(dfr.f, new dga(dfx.b(0.5F))));
      a($$0, M, dfq.a(dfq.a($$3.b(axk.cq), 2, 4, dfq.a(15, 9), dfq.a(65, 9), 4, bwq.b)).a($$2.b(axe.f)).a(dfr.h, new dga(dfx.b(-0.15F))));
      a(
         $$0,
         N,
         dfq.a(dfq.a($$3.b(axk.cq), 2, 3, dfq.a(15, 9), dfq.a(65, 9), 4, bwq.b))
            .a(
               dfr.i,
               dfu.a,
               dfu.a,
               new dgk(
                  false,
                  Optional.empty(),
                  Optional.of(dfx.a(List.of(1.2F, 1.75F, 2.2F), dfx.a(1.5F, 0.35F))),
                  $$4.a(axc.cE).map(Function.identity()),
                  feq.c,
                  dfx.a(3.5F),
                  false,
                  dja.a.e,
                  lx.A,
                  lx.z,
                  awn.Du
               ),
               fct.a(ezh.b.c, bx.a.a().a(bv.a.a().f(false)).a(cx.d(cv.c.b(1.5))))
            )
      );
      a($$0, O, dfq.a(dfq.a($$3.b(axk.cl), 2, 1, dfq.a(25, 25), dfq.a(75, 25), 4, bwq.a)).a(dfr.z, new dgm(dfx.a(2.0F))));
      a($$0, P, dfq.a(dfq.a($$3.b(axk.cp), 1, 1, dfq.a(25), dfq.a(50), 8, bwq.a)).a(dfr.D));
   }

   private static void a(qh<dfq> $$0, alf<dfq> $$1, dfq.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static alf<dfq> a(String $$0) {
      return alf.a(mg.aR, alg.b($$0));
   }
}
